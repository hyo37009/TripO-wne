package com.Tripowne.Tripowne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


// DB 연결 없이 사용하기 위해 (exclude={DataSourceAutoConfiguration.class}) 추가
@SpringBootApplication()
public class TripowneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripowneApplication.class, args);
	}

}
