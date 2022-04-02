package br.com.bbnsdevelop.sb.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {

	private Integer id;

	private String name;

	private List<ProductDto> products;

}
