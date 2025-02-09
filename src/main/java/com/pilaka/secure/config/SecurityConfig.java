package com.pilaka.secure.config;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
@Configuration
//@EnableWebSecurity
public class SecurityConfig  {

//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(
//        		(requests) -> requests
//        		.requestMatchers("/welcome").permitAll()
//        		.requestMatchers("/api/v01/createNote").permitAll()
//        		.requestMatchers("/api/v01/listNotes").permitAll()
//        		.requestMatchers("/api/v01/welcome").permitAll()
//        		
//        		.anyRequest().permitAll()
//        
//        		);
//        http.formLogin(withDefaults());
//        //http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//       // http.httpBasic(withDefaults());
//        return http.build();
//    }
//    
//    public void addCorsMappings(CorsRegistry registry) {
//        // Apply CORS settings to all endpoints (/**)
//        registry.addMapping("/**")
//                .allowedOrigins("*") // or specify origins, e.g., "http://example.com"
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                .allowedHeaders("*")
//                .allowCredentials(false);
//    }
//    
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//                        .allowedOrigins("http://192.168.12.111:8091")
//                        .allowedMethods("GET", "POST", "PUT", "DELETE");
//            }
//        };
//    }
//
//    
}
//
//
///**
//  1. Security Context Persistence Filter
//     Manages the security context for each filter
//  2. WebAsyncManagerrIntegrationFilter
//     Integrates the  Security Context with the asynchronous requests
//  3. HeaderWriterrFilter content/options/
//  4. CorsFilter
//  5. CsrfFilter: Enforces Cross-Site REqueest Forgery(CSRF) protection by generating and validating CSRF tokens
//  6. DefaultLogoutPageGeneratingFilter: Invalidates the sessions and redirects the user to logout page, default if not custom logout page is provided.
//  7. Login Page: is default login page if no default login page is provided.
//  8. Basic Authentication Filter
//  9. Request cache aware filter.
//  10. SecurityContextHolderAwareFilter
//  11. AnonymousAuthenticationFilter
//  12. ExceptionTranslationFilter: error.
//  13. FilterSecurityInerceptor
//
//    
//*/


