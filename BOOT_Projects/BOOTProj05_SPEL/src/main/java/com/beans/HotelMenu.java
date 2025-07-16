package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component("menu")
@Getter
public class HotelMenu {
	@Value("${menu.dosa}")
	private Float dosaPrice;
	@Value("${menu.idly}")
	private Float idlyPrice;
	@Value("${menu.poha}")
	private Float  pohaPrice;
	@Value("${menu.vadapav}")
	private  Float  vadapavPrice;

}
