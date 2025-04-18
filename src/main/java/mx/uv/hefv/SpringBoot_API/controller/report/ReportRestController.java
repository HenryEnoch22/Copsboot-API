package mx.uv.hefv.SpringBoot_API.controller.report;

import java.util.UUID;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import jakarta.validation.Valid;
import mx.uv.hefv.SpringBoot_API.dto.ReportDto;
import mx.uv.hefv.SpringBoot_API.model.report.CreateReportParameters;
import mx.uv.hefv.SpringBoot_API.model.report.Report;
import mx.uv.hefv.SpringBoot_API.model.user.AuthServerId;
import mx.uv.hefv.SpringBoot_API.model.user.User;
import mx.uv.hefv.SpringBoot_API.service.report.ReportService;
import mx.uv.hefv.SpringBoot_API.service.user.UserService;
import mx.uv.hefv.SpringBoot_API.model.user.UserNotFoundException;


@RestController
@RequestMapping("/api/reports")
public class ReportRestController {
    private final ReportService service;
    private final UserService userService;

    public ReportRestController(ReportService service, UserService userService) {
        this.service = service;
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ReportDto createReport(@AuthenticationPrincipal Jwt jwt,
                                  @Valid CreateReportRequest request) {
        AuthServerId authServerId = new AuthServerId(UUID.fromString(jwt.getSubject()));
        User user = userService.findUserByAuthServerId(authServerId)
                .orElseThrow(() -> new UserNotFoundException(authServerId));
        CreateReportParameters parameters = request.toParameters(user.getId());
        Report report = service.createReport(parameters);
        return ReportDto.fromReport(report, userService);
    }
}