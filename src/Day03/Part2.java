package Day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Day03.CommonFunctions.*;

public class Part2 {
    public static void main(String[] args) {
//        List<String> input = List.of("467..114..", "...*......", "..35..633.", "......#...", "617*......", ".....+.58.", "..592.....", "......755.", "...$.*....", ".664.598..");
// sum = 467835
        List<String> input = List.of(".....664...998........343...............851............................2............414.....................3....................948.164....", "......*..................*617....885...*....................-......250.........536..........470...#..................../4......=.....*......", "...407...570..218................-.....654........776.....920.........*753...........566......*..347.....61.-979..786........935...42.......", ".......%....*...$..311.102..........................*.907.....723...............622-....*..354..............................................", ".....266..............*....987.554...........&....288...#......#.......................69......41..........486..-...........................", ".849................................&........781...........978......724*..196..../767................725..../...892.....*355.....815.390....", "....*......@.....*988......%........704...............*......&...........*...................826.....................243.......#....*.......", "...796......729.9.........490..721....................438.=....272..54&...926..481..............*..523......&.785...........766.......*493..", "........281.........706...........=.666.......505.........579.*................./...669.........73...*...639...*.......479.........514......", "...........*...386.......375..................................525.926..$120............&.580.........457........325.......*829..............", ".....758..662.......937....%...661.24......749*323...444.............*.............583....*.........................................223.....", ".......*........665....*...........*................@.................154......965..*....119.......620*............347.................*470.", "........391.........183.........75..783../....................209.312............*...362........./.....667..........*....77.................", "...379=..........................$......261..228........907......*.......+591...178.........227.704........@771..667..........268......543..", ".......................#.....................*..........*....................................-........*581...........101........*.....*.....", "................471...545..135........432..178....$225..143...973#..322............2.................................*...........239...985..", "......728*612...*.........*.....65....................................*...........*................&..............527....255+../............", "..255.........435.304....854...................-............=........261......&...749....+......196....694......................779..271.374", "......604.........*.....................708.....922.......76..82*554......991..19........456............*..582.........597@.................", ".................374..*........*707........................................*....................609...52....%.................483...........", "..../..................739......................$..........649...973.*511.861..20%.................=.....................148....*......343..", "...978.................................282&...401......961....-.*.........................................499%.........../.....347..........", ".................+..174..315.-819.................841.....*66......820.836......8....60....456........*........434..........................", "....62%.......908......./.................770....../..................*.....852......&.....*........317...%......@.......+.......691........", "........793......../......411......963.......*594..................@........@......*.......45.............729...........306.148....*..@.....", "626.......$......35..........*........*...........................77.134........584.....23....35................589........./...482..853....", ".......................366..668.........................238...........*..265.........*..........*...........&......*...471..................", "..741.............679.................@.807...76....185*...........211..%.........507....178..583....*.561...521..620...*....865.$247.494...", ".....*.....383.....%..183..876......179..$..................254.........................$..........697.*..............935...*...............", "...50..390..*.........*.........917.........904/..50+.........................96...............960......701...............464....*.......947", ".........*..53........270..........*647.342......................778............$..$684..+279...*....#.........................393..........", "......151.......490...........352*.........*........................#............................594.732.........11....#....................", "........................$.........306....805..................832...................859..../.#53.........953*228...*....217.................", "......37....349....391.739.......................................*286..........558......516.......647........................%........847...", "..346.../....*......&.......855.........732....586...353.................43....*..............598.&...798.719.........671.....881...........", "..........561................=..........................*..........52....*.....727............./.....$....*..........*......................", "999*..........746...158........534............927.....587.....521......511...........448%...89...........52..557......211..356.344...116....", "........*.....................%........732....*..............*...............................*..................*806.......$.....*..*.......", ".....575.515.......922..........410.......*................564...............+503...........297................................132.667......", ".../.............-..#.....69*82....*.......842......248..&.......630.@........................................500...........................", "..916.........944...................586.................647.......*...21....&419..........=....699.......766...%.......152.......315*101....", "......*436...........987#.....*....................188.............81.............87..-..109......*.........-..........*....349.............", "...553..........570-.......442.197.......115...590....*.......284.......478...459..#.6.........946...............945-..192............292...", "22.......+..............................%......../...865........*......*........*..........900......950.......................*449...$......", ".......780..........435...*................................371...588...727.....213.....496.............-.845*..../173......688..............", "713........923..../.*......289....38.....408.552.141*476..*..................................619....6........238...................633......", "...*821.......*..57.8............../..46*......*..........38.........%..................$...*.......*....201......=.............61...-..%86.", "...........361......../12..39.51............903..................380..659........905+.28....256.............*......215.....=.../............", "...-..577.......553...............749.246.........34....................................................311..282........894.................", ".960.....@...........661.....558...&......239*..........482......574=..269..........289..../...............*.................323............", "...........292................%.................#........../............*......452/.-......132.....=..342.721..335.....426....*.....516.....", "................967.......=.......900...........925..........476.252/...861.....................891.....*.........*315.&.....130...=........", "..955..........=........584.......*...-................600............$..........940.=348...............733...754...........................", ".....*..123.....................76...36...430-......&...............524.........*............706..............#.....*.....849*......162*129.", "..543.....*........903..290.........................42.......................649...$............+...78.*648......180.979......353...........", "...........91.642.../....*........443/.........206...........#.......219............134............*..............................798..344..", "......759................144..............................455........*...906...............195......924....502.405....802.400.......*.......", ".812..............-..........394.............$771.245..............116........................*.+.........#....../...*.....*...448...883....", "..................784................................*.....&.................809.......616..109.496.................89.....592...*..........", "...596........671......527..483.197......-965.231.918.......921.452-.538.......*..763.........................162............../..479../685.", "......*....46...#......*......*.@.............................................839.*......172.....................*374........927............", ".....383............649.....783..........=981.........44..159.....94...............769......*..............#..........*.............748*993.", "..................................................607.+...*......*.......................755..810........539.......728.98.....425...........", "......32......35....99...233..............275.337.&......437..630...........423.84...........-............................163........578....", "................+.....*.....+.....334.......*.-................................*..................110.....358....115..566....*648.......*...", "....................471............*......384....81...190.606..=714....673.198.......57..#761........=..........*.....*..................618", "..........847.755..................963..........*........*................*......251*....................#592.222....107...991..557.........", "....236-.....*.................569.....311....584.............*958..........923%........................................./.......*....=.....", "................../.835...................*........157*324.840......../415...................408...........212......-..573.549.770.995......", "............312.34..............&.377...287.461..................+.................33*555...*................@.315.720......%...............", ".......614.*.................309.....*........*..758............811..........................259.................+..................-627....", ".........*.....*.....757.................684.527..*.......408.........999...............524..............570...............995..............", "...835..415.345.822...............495.....*.......138...........966....*..................#...............*....560.........*................", "...#.................806..954......*.......51...........+.......*.....910..436.477..............*150.....510...*.....#....537...........434.", "......................*...-........871.743.........643...234...844............*....705..959..360................454..402..........984.......", "....................491.................+..675...........................$........*........-................................487...*...876...", "....191........%559.......................*........250..................965......556..&...........521.......365.......994%.%....923.....$...", ".....*........................238..257...631..........*....*.....&...........346......366...150....*........*...............................", ".....532....584....800.......*.................603.452..155.42..272..267.295*.....52...........*....672..743...830.....395.......862........", "...............#....*.....347...................*......................@.......................487...................................671*973", "......=340.......&..667...................*......413.........................576*888......706.......487..502..........22....................", "................649..........&./426....286.............149........690..............................&..........765.....*..............321....", "389........304/............200...................660...*.............*253...........129..#30.........................710.../................", "...@..............408.............258*246....136.....614..531..-.....................*.........253&..........421...........939.....+.357....", ".....%..............*...........................*............*..313..+418.47...931...329............974.........=...847..........166.*......", "834..6.............346....505....164............833........66.....................*.......367..95......*211..............-............888...", ".........535....=......+.....$.......770......+....................................5.......*.....*36..................547...+...............", ".....115.*...471......863.............#.....75..364...........=842..974......722........581............$..........588.......557....760......", "987..=...780...............$...................*......................................+......869.......591.......&................-.........", "........................15.484..........640...768.@710.353.......=.585......&91....996..712..=...............548...680........661...939.....", "...630...........186=...*......575.....*................#.....662..$.................................+......*.........+........../.....*....", ".........116*235........138...*....................644....................*853...............210...719......503.....................453.....", ".....................=.........480..%................=...........429...478.....695.....789..$..........19&............216...................", "......506.........101...189.........232....951.........706....43...*.......943.........%...........935.......160..........+20..152.16.......", "..............789...........654...............*648.............*...........*....=.............398...*........*................*.............", "..............*.........509...@.....$...............746.....645...........607..336.................488....285....$..944......298.$..........", "..........23...642.374.............913................*.327....................................................263.....*182......822........", "......94....*......*.......942*.............596....285.....*..............177...........86...................................477......702...", "..243..+.....220.838.637.......481....301..+...............717...................394......................782/.......*..........%.872.*.....", ".........../.........%...../...........$...........239...........209......*........-...............153............100.700...........*..708..", "............499.........235..........................*....939*......*..227.293.-.....805.785.........#..250.................423....954......", ".......570........................................837..@......748..56..........782.....*....*..........*......552...........................", "872%..*......%.......88*484....805....178...704........282............387...........562....614..559...750..*...........@.....417......762...", "......745.....3...98....................*..*...............................@....329........................130.......134....$...........*...", ".814.............%......829.268........220...441.316.............*740......607........*831..............*......................529.......410", "......=...687...........*.....*................*...*..........369.....332..........798...............956.932......................=.........", ".....856.*............858....283.........43.594...292................*....*.604*.........217....................44*.....676*.........752.571", "..........489....................951...................83...........262.243........681....*.................373....493...........-...@......", "349................................*..................@.....................444.......*......../951..810.......#.......184....227...........", ".................958..574....313...312...909....204/....................674*...........146...........=...=..................................", ".....*.438...512*.....*.....*...........*.............484&.25..........................................851...........534@.$720.719..........", "...254.*...........167..@...7............22....681...........*684........7.696.135.207.......177............749*670............*.....681....", "..........733...........659.........527............645*215.........850.....*..........*.........*....822........................787.........", "..37*58.....*.................562....*........232..........610.321*.....148.......416............514.....703......54...................310..", "..........638....223.........*........296............452....................152....#...678..........................*...+...692.........*...", "..911...........*.........594.......*......589........*..........186........................219...........344.927.324.525..*............753.", ".....*..144.247.493...............351.........*....994...........*......738..107.......235...*....937.......-.*...........171....634........", "....756..*..../.....626..131+.@..............770..........70...11........*...............*..533...*...181......861..................*.......", ".........755...................637./15.....................=.........217..407......146...........402.#..................11...436..535.......", "..........................&592.............367.636...........830........*..........*..........................................+.........%...", "..........420*.27....954..........314.............=...........*......791...$.......718........828.....9@..449...................868...110...", "..................*..........835...&...417*...........895......747..........785.........128....*..80........*.....................*.........", "........475@...285...700.............*.....846....561...*.723.............................&.436...*......728................&....389........", "....................*.............610.266...........@.351.*..........308...931...490...............50........*487.....958.500...............", "..................335...736.....................285.......294..510*....*........*.....103.....139.........920...........=...................", ".............*...........*..........343............*..692..........57.741.....@..314...*.....*......*835......738.=............582.....295..", "...437....215..........185...............58.......654...&.....603..........505.......97...224..@..........766.....508.....+317....#.........", "...............................52.............1...........777........704........372.............23....652...=...........@...............620.", "............83..481..917......*........36$...../......=...=.............*...471*.....171.680.............*.......635...28...127.....272.....", "...262.183..*......*..=..56*.72...................812.317.......454.....1.............*.............................*.........*.......*.....", "....*........299..246...........190#...........%...+..............*.224..............664......897....407.155*....407...........406..581.....", "......691.................869..........439.....385....@.........26.....*........863.......402*.........-.............*28...332..............", "........*.......159*638......*....38....*..209......578.963........592..875......*...................*.....$......596........-..............", "......90................424.640.....*.272.................$..........*.........134...........624..158.907..964.................291..........", "................410....&..........972.......................$..305..683..743........551.338.&..................................*............", "...........................%..........213.................164.....*.......+..........*........751..............................10....710.387", "......%................&....314........-..376.......833*.......494..821...........829......%.....#........582..............&............*...", "......87...318......472...........%449.....=............720.........%.................257...29...........*.........-.....656................", "..666........*....*.....920.....................................................&......*........................759..........875$...........", "......138....366..797...........584.......247.........................427..206..843...618.....530......................................172..");

        var numbersAndIndexes = extractNumbersAndIndexes(input);
        var symbolsAndIndexes = extractSymbolsAndIndexes(input);
        int sum = 0;
        for (SpecialAndCoordinates symbolAndIndexes : symbolsAndIndexes) {
            System.out.println("Checking gear " + symbolAndIndexes.symbol);
            var gearNumbers = isGear(symbolAndIndexes, numbersAndIndexes);
            if (gearNumbers.size() == 2) {
                sum += gearNumbers.get(0).number * gearNumbers.get(1).number;
                System.out.println("New sum = " + sum);
            }
        }
        System.out.println("Sum: " + sum);
    }

    private static List<NumberAndCoordinates> isGear(SpecialAndCoordinates symbolAndIndexes, List<NumberAndCoordinates> numbersAndIndexes) {
        List<NumberAndCoordinates> result = new ArrayList<>();
        for (NumberAndCoordinates nac : numbersAndIndexes) {
            if (isAdjacent(nac, Collections.singletonList(symbolAndIndexes))) {
                result.add(nac);
            }
        }
        return result;
    }

}
