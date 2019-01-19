package com.example.demo2.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.example.demo2.repository")
@EnableTransactionManagement
public class DatabaseConfig {
}
