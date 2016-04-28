package com.tcruz.viernes.alegres.java8.date;

import java.time.*;

public class DateExample {

    public static void main(String[] args) {

        ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");

        ZonedDateTime agoraEmSaoPaulo = ZonedDateTime.now(fusoHorarioDeSaoPaulo);
        System.out.println(agoraEmSaoPaulo); //2014-04-08T10:02:57.838-03:00[America/Sao_Paulo]

        ZoneId fusoHorarioDeNovaYork = ZoneId.of("America/New_York");
        LocalDateTime saidaDeSaoPauloSemFusoHorario = LocalDateTime.of(2014, Month.APRIL.APRIL, 4, 22, 30);
        LocalDateTime chegadaEmNovaYorkSemFusoHorario = LocalDateTime.of(2014, Month.APRIL, 5, 7, 10);

        ZonedDateTime saidaDeSaoPauloComFusoHorario = ZonedDateTime.of(saidaDeSaoPauloSemFusoHorario, fusoHorarioDeSaoPaulo);
        System.out.println(saidaDeSaoPauloComFusoHorario); //2014-04-04T22:30-03:00[America/Sao_Paulo]

        ZonedDateTime chegadaEmNovaYorkComFusoHorario =
                ZonedDateTime.of(chegadaEmNovaYorkSemFusoHorario, fusoHorarioDeNovaYork);
        System.out.println(chegadaEmNovaYorkComFusoHorario); //2014-04-05T07:10-04:00[America/New_York]

        Duration duracaoDoVoo = Duration.between(saidaDeSaoPauloComFusoHorario, chegadaEmNovaYorkComFusoHorario);
        System.out.println(duracaoDoVoo);

        /**
         * Se calcularmos de maneira ingênua a duração do voo, teríamos 8:40. Porém, como há uma diferença entre os fusos
         * horários de São Paulo e Nova York,a duração correta é 9:40. Repare que a API já faz o tratamento de fusos horários distintos.
         */

    }
}
