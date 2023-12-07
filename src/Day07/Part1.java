package Day07;

import java.util.*;

public class Part1 {

    public static void main(String[] args) {
        // List<String> input = List.of("32T3K 765", "T55J5 684", "KK677 28", "KTJJT 220", "QQQJA 483"); // hand - bid per line
        // result = 6440
    List<String> input = List.of("6A868 562", "KAKKA 232", "39399 272", "2J722 48", "5AQ36 444", "33633 619", "92QAJ 960", "TQ67J 879", "KT252 69", "AA9TA 702", "7Q3J3 421", "348T4 628", "533J5 264", "J88JT 636", "2T823 282", "37736 695", "JJQQQ 853", "4KA37 89", "4422J 152", "Q4646 149", "T2AQ7 819", "K3J39 730", "J88A4 329", "J647K 867", "J8Q47 584", "7J778 158", "99995 778", "624K7 113", "2KQ22 616", "73T3T 474", "44A3K 507", "4K649 206", "33683 565", "6T9T9 955", "6Q6K6 850", "TK5AA 157", "88228 868", "88222 787", "A778A 574", "T55AA 646", "393J3 246", "799K4 690", "63283 685", "86666 878", "TTT6T 948", "A8746 127", "QQ9QQ 428", "9J4AJ 248", "TA9TT 1000", "AQ853 546", "2A856 875", "K6666 683", "K3KK5 996", "T28J3 477", "5928T 74", "Q3467 491", "2J56J 177", "KKA6K 936", "9K239 626", "22A22 293", "A74Q5 688", "7J737 752", "JK73K 214", "AJJ97 986", "88585 260", "3Q4A7 107", "3T333 25", "777TJ 727", "8K6Q6 310", "J93QA 961", "AAK59 617", "48T65 886", "49268 621", "99969 473", "AJA8A 826", "79974 566", "K358J 610", "2222Q 456", "8J488 534", "K7J4A 488", "K636K 416", "43QT6 660", "28KTQ 907", "49699 989", "27469 858", "873JT 601", "6374J 98", "JTJTT 200", "2J978 2", "474J5 353", "A557K 515", "QT3TQ 632", "7A2A2 241", "97QAQ 484", "AK4AK 825", "4A884 905", "2558K 573", "AT322 227", "48AQ7 977", "QJJTJ 630", "955J9 651", "KK55J 409", "66392 927", "4AAAQ 234", "96QA3 51", "AQTAA 964", "K34J3 605", "Q9Q9Q 284", "93999 239", "65K7T 208", "JT9A6 377", "87QJ9 245", "J269K 207", "T2JTT 269", "47274 746", "5A96A 164", "QJJ5T 716", "AAT5A 199", "694K7 710", "T8TT6 569", "J6346 181", "4Q3JA 627", "8J7J8 974", "7T25K 753", "4A26J 288", "47TT4 830", "9J99J 758", "K3K3K 195", "TT9TK 715", "QJ22T 780", "A9944 742", "22229 600", "A996A 908", "22244 818", "Q878Q 620", "QQKJQ 334", "37JJ9 490", "625Q8 356", "J6666 958", "KJ8A8 341", "363A3 333", "6A2QK 398", "44J43 215", "QKKKK 86", "K8K8J 240", "44474 109", "8AAA6 328", "AQ2Q9 641", "JJJJJ 431", "8JJ86 829", "TTT9T 161", "TT779 470", "KA748 791", "3448K 440", "44424 427", "8T57J 803", "KQK4K 418", "T738A 599", "9K5AJ 354", "38353 700", "7K77K 541", "5A248 223", "2228J 973", "222J2 244", "73J85 391", "3Q3QT 67", "JJ666 890", "9Q797 180", "2J727 734", "QKKKQ 747", "3A333 658", "J5QAT 861", "45JAT 381", "66265 224", "QQQ4Q 582", "55766 615", "A7777 866", "JQ3AQ 718", "25225 921", "A666A 115", "933KK 174", "TTTT8 609", "886J8 509", "662AJ 366", "99TT5 990", "9462A 194", "45A5A 629", "46242 583", "TQTTT 433", "23888 24", "JQ94T 100", "56693 876", "T5835 295", "2K222 933", "43Q3Q 882", "33A93 607", "8A888 650", "KKK44 26", "2AAA2 139", "328K2 499", "TKTKK 671", "JJ64J 114", "22722 612", "75T8A 160", "T44TT 448", "47434 228", "39333 225", "44QKT 47", "Q863A 581", "A9A44 345", "TJ99T 795", "822Q2 12", "4649T 967", "T4J84 938", "63636 519", "Q8K44 190", "T928T 953", "698TA 50", "TJT53 311", "KQ99J 770", "37532 797", "KAQ85 13", "K8K3J 579", "Q86JT 842", "88J78 943", "22332 774", "25Q4T 998", "999TT 44", "595J8 514", "53335 31", "927K4 423", "29J27 252", "AT33A 209", "47887 874", "466A6 243", "J4873 359", "255J2 261", "TTT5T 129", "TQTTQ 896", "Q3222 401", "434K4 126", "555A5 550", "43T79 709", "KK944 679", "42T22 430", "Q9A75 673", "Q564J 984", "Q6QQ6 552", "A777K 185", "64564 589", "T53JK 736", "7383T 27", "JA299 652", "48469 369", "42Q8Q 978", "992KK 468", "AA6A2 233", "757TJ 363", "6Q75Q 347", "25552 308", "A88JT 136", "42TJ8 21", "T472K 806", "2228T 553", "6A739 388", "QTQTJ 386", "92J99 317", "J93J9 382", "5JAJ2 707", "382A7 73", "757A7 466", "4KAT3 191", "T7J45 118", "89Q2J 869", "A23KQ 942", "2T226 480", "JJJ42 420", "J8692 481", "57555 380", "3A233 840", "TTTJ4 699", "2K666 532", "A8QT3 38", "3QJ68 216", "J8Q2K 711", "37J6K 816", "5A8T8 684", "5K5QQ 287", "43TJ4 441", "T5T5J 378", "9K9K9 33", "A3939 838", "5J5J6 538", "7KKAK 982", "86822 371", "3333Q 854", "3AAA3 489", "666T7 903", "8Q898 365", "8T789 750", "877AK 32", "4JJ44 512", "Q2JKK 280", "4484A 913", "2772Q 434", "2J543 865", "72242 125", "A2852 296", "747KJ 315", "74449 242", "J4KA2 451", "9K9J2 560", "JKKJJ 703", "KK9K9 205", "39839 968", "KQ47J 664", "66J6Q 403", "A3TTJ 533", "TQ9A5 544", "J22AA 154", "48368 789", "KA462 500", "Q66Q6 485", "J22J6 751", "677JJ 995", "2AJ2Q 459", "2K7T6 940", "A9Q48 586", "AQAAQ 542", "J333J 253", "66259 338", "8TTT8 163", "J7586 213", "JA63Q 146", "QQQ8Q 61", "52J3Q 292", "QJJQT 807", "2KJKT 374", "577J5 320", "QQQ69 704", "448K6 689", "37A3A 884", "AAJ3A 462", "23339 969", "A3A2Q 384", "5K55J 783", "8AJ5K 549", "KQQ89 408", "4444A 809", "57535 355", "46566 314", "3Q399 567", "2QQ22 934", "QT6J3 801", "QTQAA 748", "K2K7K 97", "5J665 415", "4Q55T 140", "99A29 278", "7A523 701", "7J476 714", "6824A 464", "6JT42 681", "A9746 548", "56QAT 99", "222TT 463", "K4KKK 41", "88999 899", "AA556 606", "3Q533 283", "2T233 759", "32832 344", "6KKK6 71", "AA6Q6 476", "335K3 66", "3JT66 400", "935AK 676", "7TKAQ 332", "3J34A 712", "JK757 309", "9445J 331", "8KKK8 486", "Q6J98 720", "33898 623", "668Q6 776", "J8866 536", "888K8 824", "T3TJ6 883", "2AK24 613", "QAQJ9 424", "9666J 64", "A89K5 555", "3T9T5 672", "JQQQ6 657", "9J949 851", "KKJKK 144", "2J223 321", "544QT 162", "274J9 954", "6K4K3 648", "2QQ44 889", "92J29 92", "KKK8K 945", "T4TAA 176", "67AA4 135", "69666 698", "22333 147", "85855 419", "3A783 339", "J5KK4 763", "7877A 85", "44494 737", "A646J 820", "23JK3 259", "79777 799", "J999T 442", "5T65T 235", "K99K7 111", "9K47T 405", "5Q544 647", "534J4 786", "9T7K5 594", "97AT6 432", "39J22 455", "AT4AA 396", "KAKAJ 817", "T7T7T 492", "TTQK3 644", "QKQ33 102", "AAJ9A 504", "442JK 633", "245Q6 928", "TT755 963", "JQ334 326", "4KK44 495", "AKKAA 166", "54444 524", "J9QA9 932", "5T96A 70", "5QQJQ 323", "4KK33 18", "77J7J 435", "K2K62 992", "A594J 812", "TK6TQ 563", "Q4994 880", "37737 324", "A73A7 662", "4KK4J 350", "24Q8T 722", "77877 656", "TJTKQ 461", "2J224 383", "K9K89 123", "3A254 425", "335A5 981", "A3334 625", "A46Q3 169", "JJJJ8 618", "AJTQ6 771", "742J7 238", "TTT7T 935", "J9999 116", "567Q9 307", "6992J 274", "AT285 952", "6J83J 170", "5559T 302", "K9A43 81", "9TTT9 35", "7JQJ4 598", "AQAAA 285", "AKQ7Q 802", "AA266 141", "73537 717", "75Q77 479", "8J3Q3 745", "TT7T8 68", "77JK7 148", "J2Q22 187", "A7TQJ 247", "55QJJ 155", "K7275 145", "99977 342", "JQQQQ 595", "96KTQ 501", "88J44 902", "2442Q 540", "62262 556", "A333A 171", "9T6J4 941", "7J677 860", "AAAKA 693", "47337 42", "TJT7J 217", "TK964 52", "J43T6 75", "32666 449", "973QQ 757", "AQJK7 429", "KQ4T5 634", "9J899 559", "Q6Q97 268", "5QJT5 447", "A5A22 917", "224A2 294", "65555 522", "Q3439 539", "4KKK3 394", "867A9 389", "2TQ64 572", "88J88 920", "9JKK6 458", "T2ATT 437", "66QQ7 901", "6KK3K 53", "AT3K7 10", "37T95 178", "KA978 915", "77J72 604", "Q6378 210", "5QQ7A 494", "36KAQ 592", "64774 767", "36AT5 863", "T55QT 465", "35TK3 226", "AA975 835", "TA3JJ 202", "KQQKQ 63", "K9999 808", "K2645 395", "KK977 367", "K4TKK 622", "7J39T 951", "85528 279", "TKK5K 275", "72787 761", "62662 104", "55553 665", "3J3A7 843", "TTTTA 78", "TK3JT 521", "95984 713", "33433 508", "T44T4 897", "4J7Q9 172", "96732 756", "6AKJ8 849", "24888 686", "JTA2Q 694", "32QA3 654", "5JA6J 46", "QA2AA 121", "7777J 336", "A7A7A 402", "5555T 959", "62625 40", "2Q7QQ 937", "Q3547 805", "43T73 798", "AAAA4 754", "K3598 467", "TTAAK 677", "KQ4QJ 796", "3TA2A 132", "A6A9J 919", "62644 692", "QQJAA 453", "KKK93 153", "9999Q 471", "8848Q 189", "8A9K4 790", "62A5Q 862", "75QQJ 815", "AJAAA 1", "92929 276", "TTTJT 962", "KQKJ9 417", "J2K2J 837", "6A777 571", "8A82A 668", "543T2 361", "QQ774 505", "52468 138", "AA555 286", "77699 669", "A934Q 772", "9655T 728", "2K6T5 766", "JT4J5 4", "Q97J9 743", "99559 966", "A9A9A 37", "66J73 128", "AJQAA 375", "2T222 255", "K39A6 45", "8AKQ7 564", "TK777 706", "22942 975", "22JJ2 832", "9486T 733", "5T55Q 352", "K9874 94", "2TQ2T 16", "5K588 836", "6943T 666", "936TJ 385", "22A25 9", "A5A5Q 28", "4Q4J4 859", "444K4 281", "44KQ4 316", "KJ79Q 57", "A72T4 142", "A8544 643", "844K4 179", "T9TT5 839", "44545 110", "K67A7 83", "54434 79", "97977 922", "4222K 17", "55757 137", "5AJA2 87", "2JKK2 749", "65AAJ 88", "54555 270", "79786 103", "JAA33 794", "5AK73 744", "454K8 777", "55JJ5 184", "A9884 438", "777K7 482", "488J6 91", "68965 847", "K4KK6 124", "J9QA5 322", "KA5KK 498", "8J957 872", "88899 516", "ATA88 49", "2JKKK 848", "85553 529", "332Q3 300", "3QK33 483", "23253 93", "8K333 439", "3K9AT 775", "35KJK 422", "7J77A 445", "Q6J97 841", "Q9979 251", "38849 510", "TKKKK 130", "66T96 105", "7QQQ7 376", "32AAA 318", "2867Q 54", "97QK3 11", "KK77K 916", "7358A 898", "A7A47 768", "7Q57J 346", "KJ7TA 696", "J3637 904", "K8QJ3 192", "72994 358", "QQ74Q 387", "TK6TT 493", "9932T 373", "QQ4Q4 640", "J4258 729", "AQ444 289", "899JJ 697", "AAJ37 831", "38QT9 924", "9666A 513", "59Q2A 856", "Q7QTJ 393", "Q2Q9Q 721", "88383 193", "88882 256", "36T35 222", "AQ8Q9 3", "J999K 229", "JQT3A 29", "TT888 642", "78694 236", "939QA 675", "88A6K 290", "56J55 122", "33Q36 82", "27275 769", "62Q66 537", "KKKJ4 723", "99JJA 965", "62J42 478", "897KJ 645", "ATTT6 554", "2Q458 597", "99968 460", "44Q8Q 502", "8KKK5 43", "9K5K9 254", "45A44 496", "A4744 19", "5QQ3Q 900", "K3QKQ 793", "55665 305", "JQKTJ 475", "22K82 390", "A2299 804", "JTQKK 188", "J9494 80", "2JJTT 167", "2J229 410", "9966A 106", "4J88T 814", "5K8T6 813", "TAA6T 782", "TJ854 956", "66662 784", "TT889 577", "A3A24 443", "K27K2 55", "6Q368 397", "K5563 732", "8AAAA 870", "22226 892", "J333T 881", "44AJ4 372", "67K35 578", "843K2 319", "47K24 755", "9T76K 895", "AA993 873", "85888 72", "JKKQ3 670", "66667 90", "J59AJ 988", "TKJ62 738", "4446Q 95", "JT6KQ 864", "73254 764", "QAQAQ 949", "Q62JQ 779", "43K33 687", "8939Q 557", "8A784 34", "27727 528", "32TK3 637", "J3332 196", "Q5J2A 918", "JT6T7 411", "98888 511", "AAA2A 299", "4444J 112", "222KK 972", "93K48 173", "99499 277", "4K8QA 947", "J6TK3 518", "3KJA9 212", "JT5K6 291", "92KTQ 593", "84727 370", "66KKJ 231", "6J6A9 877", "475JA 739", "JK9KK 39", "2TQ3J 912", "TQ946 204", "2T9Q4 785", "333A8 8", "J7347 999", "4K28A 360", "85668 994", "ATAAA 211", "7JK99 250", "6A74K 788", "8A7QA 7", "4464T 392", "Q84T3 760", "39JQ3 413", "5776T 939", "77A7A 117", "25Q55 576", "6T372 450", "57595 925", "3333J 575", "48282 979", "JQ9J3 506", "62T66 312", "A888J 639", "45J36 263", "J8KKQ 525", "QQ42T 719", "64944 930", "Q54AJ 120", "A94QA 957", "QQ777 894", "2TT6K 348", "KJ264 379", "4666J 655", "64464 987", "447Q3 653", "A37K7 810", "J32AA 614", "ATTJT 399", "26263 62", "JQ423 765", "T8T8J 800", "T6AKA 15", "4QQQ3 596", "KQ7T6 724", "TT55T 708", "94Q72 183", "78TJJ 526", "T8KKK 970", "K888K 303", "6J5J8 201", "55255 156", "QQJ96 821", "3886J 891", "72722 56", "7KKKK 220", "6T6AQ 77", "52655 638", "68832 368", "86356 271", "K2879 976", "3859T 608", "QQ3Q3 108", "424A7 5", "A7TA5 631", "T535T 680", "53333 551", "5TT29 14", "J5274 580", "K7A9A 659", "T6T46 725", "7J87K 871", "45QAT 997", "67677 910", "47549 649", "TQKJ2 926", "99259 76", "J43J3 337", "KT3KK 219", "Q6K22 705", "6246A 426", "3J77Q 588", "59KK6 740", "T77JT 568", "33QQ3 667", "5J4JQ 931", "8T3TQ 946", "K4KA4 741", "KT4A6 143", "3TTQ3 887", "3KQ85 58", "QQKQ7 950", "KJ77K 351", "QQKQQ 457", "JKTTK 134", "66664 407", "28462 327", "K6774 258", "KKK9K 661", "T66T3 823", "44QQ4 330", "66AAJ 313", "QQTQT 175", "7774J 414", "K8858 527", "QA2T4 65", "35735 298", "Q928K 545", "3J662 570", "37438 349", "T64AJ 406", "8A2AQ 678", "8AKKJ 885", "TQ4A6 412", "5KQ5K 452", "AA3AT 36", "TT5TJ 131", "Q47K3 301", "99992 561", "6KQT8 249", "77557 198", "4TTAT 101", "43J47 257", "J6844 30", "4K454 531", "TTA5T 674", "Q9Q99 602", "QA694 267", "J6QT6 273", "65588 469", "4TTTT 84", "J35J7 603", "622J2 230", "34542 520", "TT2T2 168", "7K798 517", "63863 792", "TJ8TT 472", "38393 133", "JJQKK 691", "AAAJJ 852", "J655K 735", "KQ6JJ 182", "6QQQQ 929", "47T53 297", "JK665 911", "44433 454", "A6364 726", "J4K93 446", "548J8 60", "T52J8 611", "59885 340", "A8K8A 991", "A88A8 845", "66K56 218", "86626 834", "AAA59 624", "52422 325", "J3363 906", "JJKKK 262", "5JJ69 357", "879A4 543", "66T66 343", "9K574 96", "9AAAA 731", "77477 893", "AAA56 6", "555J5 306", "4K882 503", "TAK97 828", "22246 590", "A8AA9 497", "76779 888", "2AAJ4 150", "88848 151", "K73J8 436", "9393J 547", "6Q666 221", "55K7K 364", "KK2TT 335", "A222A 855", "93QQ9 265", "94443 833", "3AJ26 523", "2J233 663", "2347T 22", "49J6K 165", "33J98 762", "3Q594 304", "A2T3K 530", "2K53T 535", "8JK78 923", "2658J 846", "6766J 159", "J9988 635", "J8J88 20", "JA476 985", "J5355 781", "33365 404", "KKAKJ 773", "935TJ 980", "TJ522 186", "Q8QTQ 591", "3J238 587", "354QT 983", "67JQ8 993", "K6KK8 914", "3TTT3 362", "J8KAT 585", "QQQ9T 59", "A8JA8 23", "38742 237", "QQQ3Q 558", "6J68A 811", "5433A 119", "8T8KJ 971", "94AJA 944", "783T7 844", "22JK2 857", "8KA5A 197", "J4JJ4 203", "77773 682", "5J455 909", "K4Q4Q 266", "99787 827", "5727J 487", "T92Q6 822");
        // result = 245794640
        var parsedInput = parseInput(input);
        System.out.println(parsedInput);
        List<CardInfo> ordered = sortCardsByStrength(parsedInput); // order by strength
        int result = 0;
        for (int i = 0; i < ordered.size(); i++) {
            final int bid = ordered.get(i).bid;
            final int rank = ordered.size() - i;
            System.out.println(ordered.get(i) + " has bid " + bid + " and rank " + rank);
            result += bid * rank;
        }
        System.out.println("Result = " + result);
    }

    private static List<CardInfo> sortCardsByStrength(List<CardInfo> cardAndStrength) {
        cardAndStrength.sort((c1, c2) -> -c1.compare(c2));
        return cardAndStrength;
    }

    private static List<CardInfo> parseInput(List<String> input) {
        // String hand, Integer bid
        List<CardInfo> result = new ArrayList<>();
        for (String line : input) {
            String[] split = line.split("\\s");
            if (split[0].length() != 5) {
                System.err.println("Error parsing input");
            }
            result.add(new CardInfo(split[0], Integer.parseInt(split[1]), handStringToNumbers(split[0])));
        }
        return result;
    }

    private static List<Integer> handStringToNumbers(String s) {
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> cardValue = Map.ofEntries(
                new AbstractMap.SimpleEntry<>('A', 13),
                new AbstractMap.SimpleEntry<>('K', 12),
                new AbstractMap.SimpleEntry<>('Q', 11),
                new AbstractMap.SimpleEntry<>('J', 10),
                new AbstractMap.SimpleEntry<>('T', 9),
                new AbstractMap.SimpleEntry<>('9', 8),
                new AbstractMap.SimpleEntry<>('8', 7),
                new AbstractMap.SimpleEntry<>('7', 6),
                new AbstractMap.SimpleEntry<>('6', 5),
                new AbstractMap.SimpleEntry<>('5', 4),
                new AbstractMap.SimpleEntry<>('4', 3),
                new AbstractMap.SimpleEntry<>('3', 2),
                new AbstractMap.SimpleEntry<>('2', 1)
        );
        for (int i = 0; i < s.length(); i++) {
            res.add(i, cardValue.get(s.charAt(i)));
        }
        return res;
    }

    private static class CardInfo {
        String hand;
        List<Integer> handAsNumbers;
        int bid;

        int strength;

        public CardInfo(String hand, int bid, List<Integer> handAsNumbers) {
            this.hand = hand;
            this.bid = bid;
            this.handAsNumbers = handAsNumbers;
            this.strength = getHandTypeStrength();
        }

        private int getHandTypeStrength() {
      /*
      Type            Example   Value
      five of a kind  AAAAA     7
      four of a kind  AA6AA     6
      full house      23332     5
      three of a kind TTT98     4
      two pair        23432     3
      one pair        A23A4     2
      high card       23456     1
      * */
            var numsSorted = new ArrayList<>(this.handAsNumbers);
            Collections.sort(numsSorted);
            if (isConsecutive(numsSorted)) {
                return 5;
            }
            Map<Integer, Integer> howManyPerChar = new HashMap<>();
            this.handAsNumbers.forEach(c -> howManyPerChar.put(c, howManyPerChar.get(c) == null ? 1 : howManyPerChar.get(c) + 1));
            var numOfPairs = howManyPerChar.values().stream().filter(i -> i.equals(2)).toList();
            var numOfTriplets = howManyPerChar.values().stream().filter(i -> i.equals(3)).toList();
            var numOfQuartets = howManyPerChar.values().stream().filter(i -> i.equals(4)).toList();
            var numOfQuintets = howManyPerChar.values().stream().filter(i -> i.equals(5)).toList();
            if (numOfQuintets.size() == 1) {
                return 7;
            }
            if (numOfQuartets.size() == 1) {
                return 6;
            }
            if (numOfTriplets.size() == 1) {
                return 4;
            }
            if (numOfPairs.size() == 2) {
                return 3;
            }
            if (numOfPairs.size() == 1) {
                return 2;
            }
            return 1;
        }

        private boolean isConsecutive(List<Integer> input) {
            //cardValue
            boolean is = false;
            for (int i = 0; i < input.size() - 1; i++) {
                is = input.get(i) == input.get(i + 1) + 1;
            }
            return is;
        }

        public int compare(CardInfo cardInfo) {
            if (this.strength > cardInfo.strength) {
                return 1; // 1 : cardInfo < this
            } else if (this.strength < cardInfo.strength) {
                return -1; // -1 : cardInfo > this
            } else {
                for (int i = 0; i < this.handAsNumbers.size(); i++) {
                    if (cardInfo.handAsNumbers.get(i) < this.handAsNumbers.get(i)) {
                        return 1; // 1 : cardInfo < this
                    } else if (cardInfo.handAsNumbers.get(i) > this.handAsNumbers.get(i)) {
                        return -1; // -1 : cardInfo > this
                    }
                }
            }
            return 0; // 0: same hand
        }

        @Override
        public String toString() {
            return "CardInfo{" +
                    "hand='" + hand + '\'' +
                    ", handAsNumbers=" + handAsNumbers +
                    '}';
        }
    }
}
