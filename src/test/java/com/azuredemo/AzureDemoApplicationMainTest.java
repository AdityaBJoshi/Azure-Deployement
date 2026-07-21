package com.azuredemo;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mockStatic;

class AzureDemoApplicationMainTest {

    @Test
    void main_invokesSpringApplicationRun() {
        String[] args = new String[]{};

        try (MockedStatic<SpringApplication> springApplication = mockStatic(SpringApplication.class)) {
            springApplication
                    .when(() -> SpringApplication.run(eq(AzureDemoApplication.class), any(String[].class)))
                    .thenReturn(null);

            AzureDemoApplication.main(args);

            springApplication.verify(
                    () -> SpringApplication.run(AzureDemoApplication.class, args));
        }
    }

    @Test
    void applicationClass_canBeInstantiated() {
        AzureDemoApplication application = new AzureDemoApplication();
        org.junit.jupiter.api.Assertions.assertNotNull(application);
    }
}
