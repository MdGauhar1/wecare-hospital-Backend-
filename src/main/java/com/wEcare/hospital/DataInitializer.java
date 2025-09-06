package com.wEcare.hospital;

import com.wEcare.hospital.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(HospitalOverviewRepository overviewRepo, HospitalLocationRepository locationRepo) {
        return args -> {
            if (overviewRepo.count() == 0) { // only insert if no hospital exists
                HospitalOverview hospital = new HospitalOverview();
                hospital.setName("wEcare Hospital");
                hospital.setRating(4.6);
                hospital.setPhotoUrl("https://example.com/hospital.jpg");
                overviewRepo.save(hospital);

                locationRepo.saveAll(Arrays.asList(
                        new HospitalLocation("Delhi", "123 Connaught Place, Delhi", hospital),
                        new HospitalLocation("Mumbai", "55 Marine Drive, Mumbai", hospital),
                        new HospitalLocation("Bangalore", "MG Road, Bangalore", hospital),
                        new HospitalLocation("Patna", "Bailey Road, Patna", hospital)
                ));
            }
        };
    }
}
