package practise.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class ʱ�������ܽ� {
    public static void main(String[] args) throws ParseException {
        ////////////
        ////////////
        ////JDK 7///
        ////////////
        ////////////


        //һ��Dateʱ��
        //
        //
        //1.ֱ�Ӵ�ӡDate�Ķ��� -- ��ǰʱ��
        Date date1 = new Date();
        System.out.println(date1);  //Tue Apr 09 08:04:46 CST 2024
        //
        //2.��ӡ���췽�� -- ��ʱ��ԭ���Ƴ�0���벢����Date���� -- ʱ��ԭ��
        Date date2 = new Date(0L);
        System.out.println(date2);  //Thu Jan 01 08:00:00 CST 1970
        //
        //3.��̬����getTime() -- ��ӡ����ֵ
        Date date3 = new Date();
        long time1 = date3.getTime();
        System.out.println(time1);  //1712621239742
        //
        //4.��̬����getTime() -- ��ʱ��ԭ���Ƴ�1000���벢����Date�����޸�Date���� -- ʱ��ԭ����һ��
        Date date4 = new Date(0L);
        date4.setTime(1000L);
        System.out.println(date4);  //Thu Jan 01 08:00:01 CST 1970
        //
        //5.��̬����after()��before() -- �Ƿ����ڻ�����
        Date date5 = new Date(0L);
        Date date6 = new Date();
        boolean after1 = date5.after(date6);
        boolean before1 = date5.before(date6);
        System.out.println(after1); //false
        System.out.println(before1); //true


        //����SimpleDateFormat��ʽ��ʱ��
        //
        //
        //1.ֱ�Ӵ�ӡ������
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        System.out.println(simpleDateFormat1);  //java.text.SimpleDateFormat@ca92313f
        //
        //2.����(1)������
        String string1 = "2005-03-11";
        //���췽�� �޲�   //err ����������ݴ��������ַ�����д
        //���췽�� ����
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date7 = simpleDateFormat2.parse(string1);
        System.out.println(date7);  //Fri Mar 11 00:00:00 CST 2005
        //2.����(2)����ʽ��
        //
        //3.���췽�� �޲� -- ʹ��Ĭ�ϸ�ʽ���и�ʽ��
        Date date8 = new Date();    //��ȡ��ǰʱ��
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat();
        String string2 = simpleDateFormat3.format(date8);
        System.out.println(string2);    //2024/4/9 ����8:31
        //3.���췽�� ���� -- ʹ��ָ����ʽ���и�ʽ��
        Date date9 = new Date();    //��ȡ��ǰʱ��
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy.MM.dd EE");
        String string3 = simpleDateFormat4.format(date9);
        System.out.println(string3);    //2024.04.09 �ܶ�


        //����Calendar����
        //
        //
        //1.ֱ��new -- err
        //Calendar calendar1 = new Calendar();  //err
        //
        //2.ʹ�þ�̬����getInstance()��ȡ����Ĭ��Ϊ��ǰʱ��
        Calendar CalendarInstance1 = Calendar.getInstance();
        //
        //3.ֱ�Ӵ�ӡ -- ����������ʾ�����е�����
        Calendar CalendarInstance2 = Calendar.getInstance();
        System.out.println(CalendarInstance2);  //java.util.GregorianCalendar[time=1712623188660,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=100,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=8,HOUR_OF_DAY=8,MINUTE=39,SECOND=48,MILLISECOND=660,ZONE_OFFSET=28800000,DST_OFFSET=0]
        //
        //4.ʹ�÷���get()��ȡָ�����ڣ���ָ��ö��Calendar.YEAR
        Calendar CalendarInstance3 = Calendar.getInstance();
        int calendarYEAR = CalendarInstance3.get(Calendar.YEAR);
        System.out.println(calendarYEAR);   //2024
        //
        //5.ָ���·�Ϊ22
        Calendar CalendarInstance4 = Calendar.getInstance();
        CalendarInstance4.set(Calendar.DAY_OF_MONTH,22);
        System.out.println(CalendarInstance4.get(Calendar.DAY_OF_MONTH));   //22
        //
        //6.ʹ��add()�����ڵ�ǰ��ݵĻ�����+2005
        Calendar CalendarInstance5 = Calendar.getInstance();
        CalendarInstance5.add(Calendar.YEAR,2005);
        System.out.println(CalendarInstance5.get(Calendar.YEAR));   //4029
        //
        //7��ʹ�÷���getTimeInMillis()��ȡʱ�����ֵ
        Calendar CalendarInstance6 = Calendar.getInstance();//��������Ĭ�ϵ�ǰʱ��
        long timeInMillis1 = CalendarInstance6.getTimeInMillis();
        System.out.println(timeInMillis1);  //1712623923517
        //
        //8.ʹ�÷���setTimeInMillis()ָ��ʱ��ͺ���ֵ
        Calendar CalendarInstance7 = Calendar.getInstance();//��������Ĭ�ϵ�ǰʱ��
        CalendarInstance7.clear();  //��գ����ص�ʱ��ԭ��
        CalendarInstance7.setTimeInMillis(1000L);
        System.out.println(CalendarInstance7.getTimeInMillis());    //1000
        //
        //9.ʹ��getTime()��ȡ���ڶ���
        Calendar CalendarInstance8 = Calendar.getInstance();//��������Ĭ�ϵ�ǰʱ��
        Date time2 = CalendarInstance8.getTime();
        System.out.println(time2);  //Tue Apr 09 08:58:26 CST 2024
        //10.ʹ��setTime()���������ڶ���
        Date date10 = new Date(1000L*60*60*24*365);
        Calendar CalendarInstance9 = Calendar.getInstance();//��������Ĭ�ϵ�ǰʱ��
        CalendarInstance9.setTime(date10);
        System.out.println(CalendarInstance9.get(Calendar.YEAR));   //1971



        ////////////
        ////////////
        ////JDK 8///
        ////////////
        ////////////


        //һ��ZoneId
        //
        //
        //1.ֱ��new -- ������
        //ZoneId zoneId1 = new ZoneId();
        //
        //2.ʹ��getAvailableZoneIds()��ȡjava����֧�ֵ�ʱ��
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);    //[Asia/Aden, America/Cuiaba, Etc/GMT+9, Etc/GMT+8, Africa/Nairobi, America/Marigot, Asia/Aqtau, Pacific/Kwajalein, America/El_Salvador, Asia/Pontianak, Africa/Cairo, Pacific/Pago_Pago, Africa/Mbabane, Asia/Kuching, Pacific/Honolulu, Pacific/Rarotonga, America/Guatemala, Australia/Hobart, Europe/London, America/Belize, America/Panama, Asia/Chungking, America/Managua, America/Indiana/Petersburg, Asia/Yerevan, Europe/Brussels, GMT, Europe/Warsaw, America/Chicago, Asia/Kashgar, Chile/Continental, Pacific/Yap, CET, Etc/GMT-1, Etc/GMT-0, Europe/Jersey, America/Tegucigalpa, Etc/GMT-5, Europe/Istanbul, America/Eirunepe, Etc/GMT-4, America/Miquelon, Etc/GMT-3, Europe/Luxembourg, Etc/GMT-2, Etc/GMT-9, America/Argentina/Catamarca, Etc/GMT-8, Etc/GMT-7, Etc/GMT-6, Europe/Zaporozhye, Canada/Yukon, Canada/Atlantic, Atlantic/St_Helena, Australia/Tasmania, Libya, Europe/Guernsey, America/Grand_Turk, Asia/Samarkand, America/Argentina/Cordoba, Asia/Phnom_Penh, Africa/Kigali, Asia/Almaty, US/Alaska, Asia/Dubai, Europe/Isle_of_Man, America/Araguaina, Cuba, Asia/Novosibirsk, America/Argentina/Salta, Etc/GMT+3, Africa/Tunis, Etc/GMT+2, Etc/GMT+1, Pacific/Fakaofo, Africa/Tripoli, Etc/GMT+0, Israel, Africa/Banjul, Etc/GMT+7, Indian/Comoro, Etc/GMT+6, Etc/GMT+5, Etc/GMT+4, Pacific/Port_Moresby, US/Arizona, Antarctica/Syowa, Indian/Reunion, Pacific/Palau, Europe/Kaliningrad, America/Montevideo, Africa/Windhoek, Asia/Karachi, Africa/Mogadishu, Australia/Perth, Brazil/East, Etc/GMT, Asia/Chita, Pacific/Easter, Antarctica/Davis, Antarctica/McMurdo, Asia/Macao, America/Manaus, Africa/Freetown, Europe/Bucharest, Asia/Tomsk, America/Argentina/Mendoza, Asia/Macau, Europe/Malta, Mexico/BajaSur, Pacific/Tahiti, Africa/Asmera, Europe/Busingen, America/Argentina/Rio_Gallegos, Africa/Malabo, Europe/Skopje, America/Catamarca, America/Godthab, Europe/Sarajevo, Australia/ACT, GB-Eire, Africa/Lagos, America/Cordoba, Europe/Rome, Asia/Dacca, Indian/Mauritius, Pacific/Samoa, America/Regina, America/Fort_Wayne, America/Dawson_Creek, Africa/Algiers, Europe/Mariehamn, America/St_Johns, America/St_Thomas, Europe/Zurich, America/Anguilla, Asia/Dili, America/Denver, Africa/Bamako, Europe/Saratov, GB, Mexico/General, Pacific/Wallis, Europe/Gibraltar, Africa/Conakry, Africa/Lubumbashi, Asia/Istanbul, America/Havana, NZ-CHAT, Asia/Choibalsan, America/Porto_Acre, Asia/Omsk, Europe/Vaduz, US/Michigan, Asia/Dhaka, America/Barbados, Europe/Tiraspol, Atlantic/Cape_Verde, Asia/Yekaterinburg, America/Louisville, Pacific/Johnston, Pacific/Chatham, Europe/Ljubljana, America/Sao_Paulo, Asia/Jayapura, America/Curacao, Asia/Dushanbe, America/Guyana, America/Guayaquil, America/Martinique, Portugal, Europe/Berlin, Europe/Moscow, Europe/Chisinau, America/Puerto_Rico, America/Rankin_Inlet, Pacific/Ponape, Europe/Stockholm, Europe/Budapest, America/Argentina/Jujuy, Australia/Eucla, Asia/Shanghai, Universal, Europe/Zagreb, America/Port_of_Spain, Europe/Helsinki, Asia/Beirut, Asia/Tel_Aviv, Pacific/Bougainville, US/Central, Africa/Sao_Tome, Indian/Chagos, America/Cayenne, Asia/Yakutsk, Pacific/Galapagos, Australia/North, Europe/Paris, Africa/Ndjamena, Pacific/Fiji, America/Rainy_River, Indian/Maldives, Australia/Yancowinna, SystemV/AST4, Asia/Oral, America/Yellowknife, Pacific/Enderbury, America/Juneau, Australia/Victoria, America/Indiana/Vevay, Asia/Tashkent, Asia/Jakarta, Africa/Ceuta, Asia/Barnaul, America/Recife, America/Buenos_Aires, America/Noronha, America/Swift_Current, Australia/Adelaide, America/Metlakatla, Africa/Djibouti, America/Paramaribo, Asia/Qostanay, Europe/Simferopol, Europe/Sofia, Africa/Nouakchott, Europe/Prague, America/Indiana/Vincennes, Antarctica/Mawson, America/Kralendijk, Antarctica/Troll, Europe/Samara, Indian/Christmas, America/Antigua, Pacific/Gambier, America/Indianapolis, America/Inuvik, America/Iqaluit, Pacific/Funafuti, UTC, Antarctica/Macquarie, Canada/Pacific, America/Moncton, Africa/Gaborone, Pacific/Chuuk, Asia/Pyongyang, America/St_Vincent, Asia/Gaza, Etc/Universal, PST8PDT, Atlantic/Faeroe, Asia/Qyzylorda, Canada/Newfoundland, America/Kentucky/Louisville, America/Yakutat, America/Ciudad_Juarez, Asia/Ho_Chi_Minh, Antarctica/Casey, Europe/Copenhagen, Africa/Asmara, Atlantic/Azores, Europe/Vienna, ROK, Pacific/Pitcairn, America/Mazatlan, Australia/Queensland, Pacific/Nauru, Europe/Tirane, Asia/Kolkata, SystemV/MST7, Australia/Canberra, MET, Australia/Broken_Hill, Europe/Riga, America/Dominica, Africa/Abidjan, America/Mendoza, America/Santarem, Kwajalein, America/Asuncion, Asia/Ulan_Bator, NZ, America/Boise, Australia/Currie, EST5EDT, Pacific/Guam, Pacific/Wake, Atlantic/Bermuda, America/Costa_Rica, America/Dawson, Asia/Chongqing, Eire, Europe/Amsterdam, America/Indiana/Knox, America/North_Dakota/Beulah, Africa/Accra, Atlantic/Faroe, Mexico/BajaNorte, America/Maceio, Etc/UCT, Pacific/Apia, GMT0, America/Atka, Pacific/Niue, Australia/Lord_Howe, Europe/Dublin, Pacific/Truk, MST7MDT, America/Monterrey, America/Nassau, America/Jamaica, Asia/Bishkek, America/Atikokan, Atlantic/Stanley, Australia/NSW, US/Hawaii, SystemV/CST6, Indian/Mahe, Asia/Aqtobe, America/Sitka, Asia/Vladivostok, Africa/Libreville, Africa/Maputo, Zulu, America/Kentucky/Monticello, Africa/El_Aaiun, Africa/Ouagadougou, America/Coral_Harbour, Pacific/Marquesas, Brazil/West, America/Aruba, America/North_Dakota/Center, America/Cayman, Asia/Ulaanbaatar, Asia/Baghdad, Europe/San_Marino, America/Indiana/Tell_City, America/Tijuana, Pacific/Saipan, SystemV/YST9, Africa/Douala, America/Chihuahua, America/Ojinaga, Asia/Hovd, America/Anchorage, Chile/EasterIsland, America/Halifax, Antarctica/Rothera, America/Indiana/Indianapolis, US/Mountain, Asia/Damascus, America/Argentina/San_Luis, America/Santiago, Asia/Baku, America/Argentina/Ushuaia, Atlantic/Reykjavik, Africa/Brazzaville, Africa/Porto-Novo, America/La_Paz, Antarctica/DumontDUrville, Asia/Taipei, Antarctica/South_Pole, Asia/Manila, Asia/Bangkok, Africa/Dar_es_Salaam, Poland, Atlantic/Madeira, Antarctica/Palmer, America/Thunder_Bay, Africa/Addis_Ababa, Asia/Yangon, Europe/Uzhgorod, Brazil/DeNoronha, Asia/Ashkhabad, Etc/Zulu, America/Indiana/Marengo, America/Creston, America/Punta_Arenas, America/Mexico_City, Antarctica/Vostok, Asia/Jerusalem, Europe/Andorra, US/Samoa, PRC, Asia/Vientiane, Pacific/Kiritimati, America/Matamoros, America/Blanc-Sablon, Asia/Riyadh, Iceland, Pacific/Pohnpei, Asia/Ujung_Pandang, Atlantic/South_Georgia, Europe/Lisbon, Asia/Harbin, Europe/Oslo, Asia/Novokuznetsk, CST6CDT, Atlantic/Canary, America/Knox_IN, Asia/Kuwait, SystemV/HST10, Pacific/Efate, Africa/Lome, America/Bogota, America/Menominee, America/Adak, Pacific/Norfolk, Europe/Kirov, America/Resolute, Pacific/Kanton, Pacific/Tarawa, Africa/Kampala, Asia/Krasnoyarsk, Greenwich, SystemV/EST5, America/Edmonton, Europe/Podgorica, Australia/South, Canada/Central, Africa/Bujumbura, America/Santo_Domingo, US/Eastern, Europe/Minsk, Pacific/Auckland, Africa/Casablanca, America/Glace_Bay, Canada/Eastern, Asia/Qatar, Europe/Kiev, Singapore, Asia/Magadan, SystemV/PST8, America/Port-au-Prince, Europe/Belfast, America/St_Barthelemy, Asia/Ashgabat, Africa/Luanda, America/Nipigon, Atlantic/Jan_Mayen, Brazil/Acre, Asia/Muscat, Asia/Bahrain, Europe/Vilnius, America/Fortaleza, Etc/GMT0, US/East-Indiana, America/Hermosillo, America/Cancun, Africa/Maseru, Pacific/Kosrae, Africa/Kinshasa, Asia/Kathmandu, Asia/Seoul, Australia/Sydney, America/Lima, Australia/LHI, America/St_Lucia, Europe/Madrid, America/Bahia_Banderas, America/Montserrat, Asia/Brunei, America/Santa_Isabel, Canada/Mountain, America/Cambridge_Bay, Asia/Colombo, Australia/West, Indian/Antananarivo, Australia/Brisbane, Indian/Mayotte, US/Indiana-Starke, Asia/Urumqi, US/Aleutian, Europe/Volgograd, America/Lower_Princes, America/Vancouver, Africa/Blantyre, America/Rio_Branco, America/Danmarkshavn, America/Detroit, America/Thule, Africa/Lusaka, Asia/Hong_Kong, Iran, America/Argentina/La_Rioja, Africa/Dakar, SystemV/CST6CDT, America/Tortola, America/Porto_Velho, Asia/Sakhalin, Etc/GMT+10, America/Scoresbysund, Asia/Kamchatka, Asia/Thimbu, Africa/Harare, Etc/GMT+12, Etc/GMT+11, Navajo, America/Nome, Europe/Tallinn, Turkey, Africa/Khartoum, Africa/Johannesburg, Africa/Bangui, Europe/Belgrade, Jamaica, Africa/Bissau, Asia/Tehran, WET, Europe/Astrakhan, Africa/Juba, America/Campo_Grande, America/Belem, Etc/Greenwich, Asia/Saigon, America/Ensenada, Pacific/Midway, America/Jujuy, Africa/Timbuktu, America/Bahia, America/Goose_Bay, America/Virgin, America/Pangnirtung, Asia/Katmandu, America/Phoenix, Africa/Niamey, America/Whitehorse, Pacific/Noumea, Asia/Tbilisi, Europe/Kyiv, America/Montreal, Asia/Makassar, America/Argentina/San_Juan, Hongkong, UCT, Asia/Nicosia, America/Indiana/Winamac, SystemV/MST7MDT, America/Argentina/ComodRivadavia, America/Boa_Vista, America/Grenada, Asia/Atyrau, Australia/Darwin, Asia/Khandyga, Asia/Kuala_Lumpur, Asia/Famagusta, Asia/Thimphu, Asia/Rangoon, Europe/Bratislava, Asia/Calcutta, America/Argentina/Tucuman, Asia/Kabul, Indian/Cocos, Japan, Pacific/Tongatapu, America/New_York, Etc/GMT-12, Etc/GMT-11, America/Nuuk, Etc/GMT-10, SystemV/YST9YDT, Europe/Ulyanovsk, Etc/GMT-14, Etc/GMT-13, W-SU, America/Merida, EET, America/Rosario, Canada/Saskatchewan, America/St_Kitts, Arctic/Longyearbyen, America/Fort_Nelson, America/Caracas, America/Guadeloupe, Asia/Hebron, Indian/Kerguelen, SystemV/PST8PDT, Africa/Monrovia, Asia/Ust-Nera, Egypt, Asia/Srednekolymsk, America/North_Dakota/New_Salem, Asia/Anadyr, Australia/Melbourne, Asia/Irkutsk, America/Shiprock, America/Winnipeg, Europe/Vatican, Asia/Amman, Etc/UTC, SystemV/AST4ADT, Asia/Tokyo, America/Toronto, Asia/Singapore, Australia/Lindeman, America/Los_Angeles, SystemV/EST5EDT, Pacific/Majuro, America/Argentina/Buenos_Aires, Europe/Nicosia, Pacific/Guadalcanal, Europe/Athens, US/Pacific, Europe/Monaco]
        //
        //3.��ȡϵͳĬ��ʱ��systemDefault()
        ZoneId zoneId1 = ZoneId.systemDefault();
        System.out.println(zoneId1);    //Asia/Shanghai
        //
        //4.��ȡָ��ʱ��of()
        ZoneId zoneId2 = ZoneId.of("Asia/Aden");
        System.out.println(zoneId2); //Asia/Aden


        //����instant ʱ���
        //
        //
        //1.��ȡ��ǰʱ���now()
        Instant now = Instant.now();
        System.out.println(now);    //2024-04-09T01:10:29.683845800Z
        //
        //2.�����롢���롢�����ȡʱ���ofXxxx
        Instant instant1 = Instant.ofEpochSecond(1);
        System.out.println(instant1);   //1970-01-01T00:00:01Z
        //
        //3.����ֱ��new
//        Instant instant = new Instant();
        //
        //4.isXxx() �ж�����
        Instant instant2 = Instant.ofEpochSecond(0L);
        Instant instant3 = Instant.ofEpochSecond(0L);
        boolean before = instant2.isBefore(instant3);
        System.out.println(before); //false
        boolean after = instant2.isAfter(instant3);
        System.out.println(after);  //false
        //
        //4.����ʱ��minusXxx()
        Instant instant4 = Instant.ofEpochSecond(0L);
        Instant instant5 = instant4.minusSeconds(1L);
        System.out.println(instant5);   //1969-12-31T23:59:59Z
        //
        //5.����ʱ��plusXxx()
        Instant instant6 = Instant.ofEpochSecond(0L);
        Instant instant7 = instant6.plusSeconds(1L);
        System.out.println(instant7);   ///1970-01-01T00:00:01Z


        //������ʱ����ʱ��ZoneDateTime
        //
        //
        //1.ֱ��new -- err
//        ZonedDateTime zonedDateTime = new ZonedDateTime();
        //
        //2.��ȡ��ǰʱ��now()
        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1);   //2024-04-09T09:21:25.799531700+08:00[Asia/Shanghai]
        //
        //3.��ȡָ���Ĵ�ʱ����ʱ��
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2005, 3, 11, 1, 1, 1, 1, ZoneId.of("Asia/Aden"));
        System.out.println(zonedDateTime);  //2005-03-11T01:01:01.000000001+03:00[Asia/Aden]
        //
        //4.ͨ������ʱ���Instant�Ķ����ʱ��ZoneId�Ķ�����ָ��ZonedDateTime�Ķ���
        Instant instant = Instant.ofEpochSecond(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(zonedDateTime1); //1970-01-01T08:00+08:00[Asia/Shanghai]
        //
        //5.�޸�ʱ�� withXxx()
        ZonedDateTime now2 = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = now2.withDayOfMonth(19);
        System.out.println(zonedDateTime2); //2024-04-19T09:31:41.983879400+08:00[Asia/Shanghai]
        //
        //6.����minusXxx()
        //7.����plusXxx()


        //�ġ�DateTimeFormat���ڸ�ʽ��
        //
        //
        //1.����ֱ��new
//        DateTimeFormatter dateTimeFormatter = new DateTimeFormatter();
        //
        //2.����
        String birth = "2005-03-11";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //��һ
        TemporalAccessor parse1 = dateTimeFormatter.parse(birth);
        System.out.println(parse1); //{},ISO resolved to 2005-03-11
        //ת��
        LocalDate from = LocalDate.from(parse1);
        System.out.println(from);   //2005-03-11
        //����
        LocalDate parse = LocalDate.parse(birth);
        System.out.println(parse);  //2005-03-11
        //
        //3.��ʽ��Instant -- err
        /*
        Instant now3 = Instant.now();
        System.out.println(now3);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String string = dateTimeFormatter1.format(now3);
        System.out.println(string);*/
        /*
        ���⣺
        ��ͼʹ�� DateTimeFormatter ��ʽ�� Instant ���͵�ʱ�����Ȼ����Instant ���ͱ�ʾ
        ���Ǿ�ȷ��ʱ��㣬�����Ǵ�������ʱ����Ϣ�Ķ������ֱ��ʹ�� DateTimeFormatter ��
        ʽ�� Instant �ǲ����ʵġ�
         */
        /*
        �޸ģ�
        �Ȼ�ȡ��ǰ��ʱ��� Instant now = Instant.now()��Ȼ����ת��Ϊ����ϵͳĬ��ʱ����Ϣ
        �� ZonedDateTime ���� zonedDateTime�����ţ�����ʹ�� DateTimeFormatter ��ʽ��
        ZonedDateTime �������մ�ӡ����ʽ����������ַ�����
         */
        //
        //4.��ʹ��DateTimeFormatter��ʽ���ģ�
        /*
        DateTimeFormatter ��������ڸ�ʽ���ͽ�������ʱ����󣬰����������ͣ�
        LocalDate��������������Ϣ��û��ʱ���ʱ����Ϣ��
        LocalTime��������ʱ����Ϣ��û�����ں�ʱ����Ϣ��
        LocalDateTime���������ں�ʱ����Ϣ����û��ʱ����Ϣ��
        ZonedDateTime���������ڡ�ʱ���ʱ����Ϣ��
        */
        //
        //5.
        //6.
        //7.


        //�塢LocalDate
        //
        //
        //1.ֱ��new -- err
//        LocalDate localDate = new LocalDate();//err
        //
        //2.now()��ȡ��ǰʱ��
        LocalDate now3 = LocalDate.now();
        System.out.println("now3:"+now3);   //2024-04-09
        //
        //3.getXxx()������ȡ������
        LocalDate now4 = LocalDate.now();
        System.out.println(now4.getYear()); //2024
        System.out.println(now4.getMonth());    //APRIL
        System.out.println(now4.getMonthValue());    //4
        System.out.println(now4.getDayOfMonth());   //9
        //
        //4.of()��ȡLocalDate����
        LocalDate localDate = LocalDate.of(2005, 3, 11);
        System.out.println(localDate);  //2005-03-11
        //5.minus()����
        //6.plus()����
        //7.from()


        //����ChronoUtil
        //
        //
        //1.ö��.between()��ȡʱ����
        LocalDateTime birth2 = LocalDateTime.of(2005, 3, 11, 0, 0, 0, 0);
        LocalDateTime now5 = LocalDateTime.now();
        System.out.println(ChronoUnit.YEARS.between(birth2, now5));//19
        System.out.println(ChronoUnit.MONTHS.between(birth2, now5));//228
        System.out.println(ChronoUnit.DAYS.between(birth2, now5));//6969


    }
}
