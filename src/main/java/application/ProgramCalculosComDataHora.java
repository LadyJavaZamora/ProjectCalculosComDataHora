package application;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProgramCalculosComDataHora {

	public static void main(String[] args) {
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate     d04 = LocalDate.parse("2022-07-20");             //Convertendo data ISO 8601 em data local
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//Convertendo data ISO 8601 em data local com timestamp 
		Instant       d06 = Instant.parse("2022-07-20T01:30:26Z");		
				
		LocalDate PastWeekLocalDate = d04.minusDays(7);
		LocalDate NextWeekLocalDate = d04.plusDays(7);
		LocalDate NextNineYearsLocalDate = d04.plusYears(9);
		
		LocalDateTime PastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime NextWeekLocalDateTime = d05.plusDays(7);
		LocalDateTime NextNineYearsLocalDateTime = d05.plusYears(9);
		
		Instant PastWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant NextWeekLocalInstant = d06.plus(7, ChronoUnit.DAYS);
		
		//Duration      t01 = Duration.between(PastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));Força conversão de LocalDate para LocalDateTime
		Duration      t01 = Duration.between(PastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());//Força conversão de LocalDate para LocalDateTime
		Duration      t02 = Duration.between(PastWeekLocalDateTime, d05);
		Duration      t03 = Duration.between(PastWeekLocalInstant, d06);
		Duration      t04 = Duration.between(d06,PastWeekLocalInstant);
		
		System.out.println("Localdate.parse d04 = "+ d04);
		System.out.println("Localdate d04 menos uma semana = "+ PastWeekLocalDate);
		System.out.println("Localdate d04 mais uma semana = "+ NextWeekLocalDate);
		System.out.println("Localdate d04 mais nove anos = "+ NextNineYearsLocalDate);
		System.out.println();
		System.out.println("LocaldateTime.parse com time stamp d05 = "+ d05);
		System.out.println("LocaldateTime d05 menos uma semana = "+ PastWeekLocalDateTime);
		System.out.println("LocaldateTime d05 mais uma semana = "+ NextWeekLocalDateTime);
		System.out.println("LocaldateTime d05 mais nove anos = "+ NextNineYearsLocalDateTime);
		System.out.println();
		System.out.println("Instant d06 com time stamp horario Londres d06 = "+ d06);
		System.out.println("Instant d06 menos uma semana = "+ PastWeekLocalInstant);
		System.out.println("Instant d06 mais uma semana = "+ NextWeekLocalInstant);
		System.out.println();
		System.out.println("Instant d06 menos uma semana = "+ PastWeekLocalInstant);
		System.out.println("LocaldateTime.parse com time stamp d05 = "+ d05);
		System.out.println("T01 convertendo LocalDate para LocaldateTime teremos dias = "+ t01.toDays());
		System.out.println("T02 dias = "+ t02.toDays());
		System.out.println("T03 dias = "+ t03.toDays());
		System.out.println("T04 dias = "+ t04.toDays());
		
	}

}
