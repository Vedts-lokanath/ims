package com.vts.ims.audit.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
//@Builder
public class AuditorDto {

	private Long auditorId;
	private Long empId;
	private String empName;
	private String designation;
	private String divisionName;
	private String createdBy;
	private LocalDateTime createdDate;
	private String modifiedBy;
	private LocalDateTime modifiedDate;
	private int isActive;
	private String[] empIds;
	
}
