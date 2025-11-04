package com.veron.spoclo_back.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({
    "com.veron.spoclo_back.usercontext.repository",
    "com.veron.spoclo_back.catalogcontext.repository"
})
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
    
}
