package com.amy.project.collage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amy.project.collage.entity.Collage;
import com.amy.project.collage.service.CollageService;

@RestController
public class CollageController {

	@Autowired
	private CollageService cs;

	@GetMapping("/getallstaffinfo")
	public List<Collage> getAllStaffInfo() {
		return cs.getAllStaffInfo();
	}

	@PostMapping("insertstaffinfo")
	public String insertStaffInfo(@RequestBody Collage clg) {
		return cs.insertStaffInfo(clg);
	}

	@PutMapping("updatestaffinfo")
	public String updateStaffInfo(@RequestBody Collage clg) {
		return cs.updateStaffInfo(clg);
	}

	@DeleteMapping("deletestaffinfo")
	public String deleteStaffInfo(@RequestBody int clg) {
		return cs.deleteStaffInfo(clg);
	}

	@GetMapping("staffNameStartWithS")
	public List<Collage> staffNameStartWithS() {
		return cs.staffNameStartWithS();
	}

	@GetMapping("staffNameStartWith_V_AndAgeAbove20")
	public List<Collage> staffNameStartWith_V_AndAgeAbove20() {
		return cs.staffNameStartWith_V_AndAgeAbove20();
	}

	@GetMapping("staffNameStartWith_S_AndSalaryAbove30000")
	public List<Collage> staffNameStartWith_S_AndSalaryAbove30000() {
		return cs.staffNameStartWith_S_AndSalaryAbove30000();
	}

	@GetMapping("staffNameWith_A_InScienceDepartment")
	public List<Collage> staffNameWith_A_InScienceDepartment() {
		return cs.staffNameWith_A_InScienceDepartment();
	}

	@GetMapping("staffSalaryGreaterThan25kAndDesignationIsProfessor")
	public List<Collage> staffSalaryGreaterThan25kAndDesignationIsProfessor() {
		return cs.staffSalaryGreaterThan25kAndDesignationIsProfessor();
	}

	@GetMapping("getAllLibrarianAndClerkStaff")
	public List<Collage> getAllLibrarianAndClerkStaff() {
		return cs.getAllLibrarianAndClerkStaff();
	}

	@GetMapping("/staffNameStartWith/{prefix}")
	public List<Collage> staffNameStartWith(@PathVariable String prefix) {
		return cs.staffNameStartWith(prefix);
	}

	@GetMapping("/staffSalaryAbove/{salary}")
	public List<Collage> staffSalaryAbove(@PathVariable String salary) {
		return cs.staffSalaryAbove(salary);
	}

	@GetMapping("/staffInDepartment/{department}")
	public List<Collage> staffInDepartment(@PathVariable String department) {
		return cs.staffInDepartment(department);
	}

	@GetMapping("/staffWithDesignation/{designation}")
	public List<Collage> staffWithDesignation(@PathVariable String designation) {
		return cs.staffWithDesignation(designation);
	}

	@GetMapping("/staffWithAgeAbove/{age}")
	public List<Collage> staffWithAgeAbove(@PathVariable String age) {
		return cs.staffWithAgeAbove(age);
	}

	@GetMapping("/professorStaff")
	public List<Collage> professorStaff() {
		return cs.professorStaff();
	}

	@GetMapping("/nonTeachingStaff")
	public List<Collage> nonTeachingStaff() {
		return cs.nonTeachingStaff();
	}

	@GetMapping("/teachingStaff")
	public List<Collage> teachingStaffInDepartment() {
		return cs.teachingStaff();
	}

	@GetMapping("/staffInScienceDepartment")
	public List<Collage> staffInScienceDepartment() {
		return cs.staffInScienceDepartment();
	}

	@GetMapping("/staffInArtsDepartment")
	public List<Collage> staffInArtsDepartment() {
		return cs.staffInArtsDepartment();
	}

	@GetMapping("/staffInCommerceDepartment")
	public List<Collage> staffInCommerceDepartment() {
		return cs.staffInCommerceDepartment();
	}

}
