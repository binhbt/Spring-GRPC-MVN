package com.techgeeknext.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.techgeeknext.constants.Role;
import com.techgeeknext.employee.EmployeeRequest;
import com.techgeeknext.employee.EmployeeResponse;
import com.techgeeknext.employee.EmployeeServiceGrpc;

@SpringBootApplication
public class SpringBootGrpcExampleApplication {

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
				.usePlaintext()
				.build();

				EmployeeServiceGrpc.EmployeeServiceBlockingStub stub
				= EmployeeServiceGrpc.newBlockingStub(channel);

				EmployeeResponse helloResponse = stub.getEmployee(EmployeeRequest.newBuilder()
				.setEmpId("1")
				.build());

		System.out.println(helloResponse);

		channel.shutdown();
	}

}
