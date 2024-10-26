package com.springcore.spel;

import org.springframework.stereotype.Component;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

@Component
public class Demo {
		@Value("#{1+2}")
		private int x;
		

		private int y;
		
		@Value("#{ T(java.lang.Math).sqrt(25)}")
		private double z;
		
		@Value("#{ T(java.lang.Math).E}")
		private double e;
      
		@Value("#{new java.util.Date(T(java.lang.System).currentTimeMillis())}")
		private Date name;
		
		public double getE() {
			return e;
		}

		public void setE(double e) {
			this.e = e;
		}

		

		public Date getName() {
			return name;
		}

		public void setName(Date name) {
			this.name = name;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public double getZ() {
			return z;
		}

		public void setZ(double z) {
			this.z = z;
		}

		@Override
		public String toString() {
			return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + "]";
		}
		
	
		
}
