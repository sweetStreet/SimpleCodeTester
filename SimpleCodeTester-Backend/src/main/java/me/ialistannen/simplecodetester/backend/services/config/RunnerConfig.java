package me.ialistannen.simplecodetester.backend.services.config;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "runner")
@Getter
@Setter
@Valid
public class RunnerConfig {

  @NotEmpty
  @NotNull
  private String password;
}
