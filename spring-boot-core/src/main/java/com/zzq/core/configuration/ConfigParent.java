package com.zzq.core.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ConfigA.class, ConfigB.class})
public class ConfigParent {

}
