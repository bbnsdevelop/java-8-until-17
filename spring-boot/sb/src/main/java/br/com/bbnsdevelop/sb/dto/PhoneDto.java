package br.com.bbnsdevelop.sb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDto {

	private Integer idPhone;

	private String ddd;

	private String number;

	private String contact;

	private Integer idCompany;

	private Integer idProduct;

}
