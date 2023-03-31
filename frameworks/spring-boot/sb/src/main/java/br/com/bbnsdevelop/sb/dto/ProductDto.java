package br.com.bbnsdevelop.sb.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

	private Integer idProduto;

	private String description;

	private List<PhoneDto> phones;

}
