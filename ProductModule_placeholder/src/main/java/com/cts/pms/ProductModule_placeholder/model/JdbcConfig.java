package com.cts.pms.ProductModule_placeholder.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcConfig {
		@Value("${db.url}")
		private String dbUrl;
		@Value("${db.un}")
		private String un;
		@Value("${db.pwd}")
		private String pwd;
		public String getDbUrl() {
			return dbUrl;
		}
		public String getPwd() {
			return pwd;
		}
		public String getUn() {
			return un;
		}
		
		@Value("${db.url1}")
		private String dbUrl1;
		@Value("${db.un1}")
		private String un1;
		@Value("${db.pwd1}")
		private String pwd1;
		public String getDbUrl1() {
			return dbUrl1;
		}
		public String getPwd1() {
			return pwd1;
		}
		public String getUn1() {
			return un1;
		}
		@Value("${db.url2}")
		private String dbUrl2;
		@Value("${db.un2}")
		private String un2;
		@Value("${db.pwd2}")
		private String pwd2;
		public String getDbUrl2() {
			return dbUrl2;
		}
		public String getPwd2() {
			return pwd2;
		}
		public String getUn2() {
			return un2;
		}
}
