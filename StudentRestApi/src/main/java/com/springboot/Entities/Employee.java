package com.springboot.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	 @Id
	  //@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
	 @Column
		private String name;
	 @Column
	    private String pdfPath;
	 @Column
	    private String pdfName;
		
		public String getPdfPath() {
			return pdfPath;
		}
		public void setPdfPath(String pdfPath) {
			this.pdfPath = pdfPath;
		}
		public String getPdfName() {
			return pdfName;
		}
		public void setPdfName(String pdfName) {
			this.pdfName = pdfName;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		
}
