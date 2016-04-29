package com.tcruz.viernes.alegres.java8.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateExample {

    public static void main(String[] args) {

        ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");

        ZonedDateTime agoraEmSaoPaulo = ZonedDateTime.now(fusoHorarioDeSaoPaulo);
        System.out.println(agoraEmSaoPaulo);

        ZoneId fusoHorarioDeNovaYork = ZoneId.of("America/New_York");
        LocalDateTime saidaDeSaoPauloSemFusoHorario = LocalDateTime.of(2014, Month.APRIL.APRIL, 4, 22, 30);
        LocalDateTime chegadaEmNovaYorkSemFusoHorario = LocalDateTime.of(2014, Month.APRIL, 5, 7, 10);

        ZonedDateTime saidaDeSaoPauloComFusoHorario = ZonedDateTime.of(saidaDeSaoPauloSemFusoHorario, fusoHorarioDeSaoPaulo);
        System.out.println(saidaDeSaoPauloComFusoHorario);

        ZonedDateTime chegadaEmNovaYorkComFusoHorario =
                ZonedDateTime.of(chegadaEmNovaYorkSemFusoHorario, fusoHorarioDeNovaYork);
        System.out.println(chegadaEmNovaYorkComFusoHorario);

        /**
         * Se calcularmos de maneira ingênua a duração do voo, teríamos 8:40. Porém, como há uma diferença entre os fusos
         * horários de São Paulo e Nova York,a duração correta é 9:40. Repare que a API já faz o tratamento de fusos horários distintos.
        **/
        Duration duracaoDoVoo = Duration.between(saidaDeSaoPauloComFusoHorario, chegadaEmNovaYorkComFusoHorario);
        System.out.println(duracaoDoVoo.toMinutes());

        //Formato de datas
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        hoje.format(formatador);
        System.out.println(hoje);

        //Manipulando datas
        LocalDate amanha = hoje.plusDays(1);

        MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
        LocalDate natalDesseAno = natal.atYear(Year.now().getValue());
        long diasAteONatal = LocalDate.now().until(natalDesseAno, ChronoUnit.DAYS);
    }
}
