package fr.afpa.orm.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * TODO : implémenter un DTO (uniquement à partir de l'implémentation de la relation "OneToMany")
 * 
 * Attention : il faudra peut être 1 DTO par classe métier ?
 * 
 * Plus d'informations sur la pattern DTO : https://medium.com/@zubeyrdamar/java-spring-boot-handling-infinite-recursion-a95fe5a53c92
 */
public record AccountDto(Long id,LocalDateTime creationTime, BigDecimal balance, String clientName) {
}
