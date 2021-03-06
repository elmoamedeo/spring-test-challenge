package br.com.spring.springtestchallenge.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@AllArgsConstructor
@Getter
@Setter
public class RoomRequestDTO {

    @NotBlank(message = "O nome do cômodo não pode estar vazio.")
    @Pattern(regexp = "[A-Z][a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ\\s]*",message = "O nome do cômodo deve começar com uma letra maiúscula.")
    @Size(max = 30, message = "O comprimento do cômodo não pode exceder 30 caracteres.")
    private String roomName;

    @NotNull(message = "A largura do cômodo não pode estar vazia.")
    @Max(value = 25, message = "A largura máxima permitida por cômodo é de 25 metros.")
    private Double roomWidth;

    @NotNull(message = "O comprimento do cômodo não pode estar vazio.")
    @Max(value = 33, message = "O comprimento máximo permitido por cômodo é de 33 metros.")
    private Double roomLength;
}
