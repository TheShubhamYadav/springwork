package com.nbf.config;

import com.nbf.beans.Processor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessorConfig {

    @Bean
    public Processor processor(@Value("${processorName}") String processorName, @Value("${core}") int core){
        Processor processor = new Processor();
        processor.setProcessorName(processorName);
        processor.setCore(core);
        return processor;
    }
}
