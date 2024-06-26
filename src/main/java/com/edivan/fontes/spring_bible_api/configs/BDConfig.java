package com.edivan.fontes.spring_bible_api.configs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.edivan.fontes.spring_bible_api.entities.Book;
import com.edivan.fontes.spring_bible_api.entities.Testament;
import com.edivan.fontes.spring_bible_api.entities.Verse;
import com.edivan.fontes.spring_bible_api.entities.Version;
import com.edivan.fontes.spring_bible_api.repositories.BookRepository;
import com.edivan.fontes.spring_bible_api.repositories.TestamentRepository;
import com.edivan.fontes.spring_bible_api.repositories.VerseRepository;
import com.edivan.fontes.spring_bible_api.repositories.VersionRepository;

@Configuration
public class BDConfig implements CommandLineRunner {

	@Autowired
	private VersionRepository version;

	@Autowired
	private TestamentRepository testament;

	@Autowired
	private BookRepository book;

	@Autowired
	private VerseRepository verse;

	
	@Override
	public void run(String... args) throws Exception {
		/* POVOANDO TABELA DAS BÍBLIAS (version) */
		Version acf = new Version(null, "Almeida Corrigida e Fiel", "acf", 1994, "SBTB", 31102);
		Version ara = new Version(null, "Almeida Revista e Atualizada", "ara", 1993, "SBB", 31104);
		Version arc = new Version(null, "Almeida Revista e Corrigida", "arc", 1995, "SBB", 31105);
		Version as21 = new Version(null, "Almeida Século XXI", "as21", 2009, "Vida Nova", 31104);
		Version jfaa = new Version(null, "Almeida Atualizada", "jfaa", null, null, 31104);
		Version kja = new Version(null, "King James Atualizada", "kja", 1999, "Abba Press", 31102);
		Version kjf = new Version(null, "King James Fiel", "kjf", 1611, "BVBooks", 31102);
		Version naa = new Version(null, "Nova Almeida Atualizada", "naa", 2017, "SBB", 31105);
		Version nbv = new Version(null, "Nova Bíblia Viva", "nbv", 2007, "Mundo Cristão", 31105);
		Version ntlh = new Version(null, "Nova Tradução na Linguagem de Hoje", "ntlh", 1988, "SBB", 31103);
		Version nvi = new Version(null, "Nova Versão Internacional", "nvi", 1993, "Biblica", 31105);
		Version nvt = new Version(null, "Nova Versão Transformadora", "nvt", 2016, "Mundo Cristão", 31102);
		Version tb = new Version(null, "Tradução Brasileira", "tb", 2010, "SBB", 31100);
		version.saveAll(Arrays.asList(acf, ara, arc, as21, jfaa, kja, kjf, naa, nbv, ntlh, nvi, nvt, tb));

		/* POVOANDO TABELA DOS TESTAMENTOS (testaments) */
		Testament oldTestament = new Testament(null, "Antigo Testamento", "at");
		Testament newTestament = new Testament(null, "Novo Testamento", "nt");
		testament.saveAll(Arrays.asList(oldTestament, newTestament));

		/* POVOANDO TABELA DOS LIVROS (books) */
		Book gn = new Book(null, 1l, "Gênesis", "gn", 50);
		Book ex = new Book(null, 1l, "Êxodo", "ex", 40);
		Book lv = new Book(null, 1l, "Levítico", "lv", 27);
		Book nm = new Book(null, 1l, "Números", "nm", 36);
		Book dt = new Book(null, 1l, "Deuteronômio", "dt", 34);
		Book js = new Book(null, 1l, "Josué", "js", 24);
		Book jz = new Book(null, 1l, "Juízes", "jz", 21);
		Book rt = new Book(null, 1l, "Rute", "rt", 4);
		Book fsm = new Book(null, 1l, "1 Samuel", "1sm", 31);
		Book ssm = new Book(null, 1l, "2 Samuel", "2sm", 24);
		Book frs = new Book(null, 1l, "1 Reis", "1rs", 22);
		Book srs = new Book(null, 1l, "2 Reis", "2rs", 25);
		Book fcr = new Book(null, 1l, "1 Crônicas", "1cr", 29);
		Book scr = new Book(null, 1l, "2 Crônicas", "2cr", 36);
		Book ed = new Book(null, 1l, "Esdras", "ed", 10);
		Book ne = new Book(null, 1l, "Neemias", "ne", 13);
		Book et = new Book(null, 1l, "Ester", "et", 10);
		Book jó = new Book(null, 1l, "Jó", "jó", 42);
		Book sl = new Book(null, 1l, "Salmos", "sl", 150);
		Book pv = new Book(null, 1l, "Provérbios", "pv", 31);
		Book ec = new Book(null, 1l, "Eclesiastes", "ec", 12);
		Book ct = new Book(null, 1l, "Cânticos", "ct", 8);
		Book is = new Book(null, 1l, "Isaías", "is", 66);
		Book jr = new Book(null, 1l, "Jeremias", "jr", 52);
		Book lm = new Book(null, 1l, "Lamentações", "lm", 5);
		Book ez = new Book(null, 1l, "Ezequiel", "ez", 48);
		Book dn = new Book(null, 1l, "Daniel", "dn", 12);
		Book os = new Book(null, 1l, "Oseias", "os", 14);
		Book jl = new Book(null, 1l, "Joel", "jl", 3);
		Book am = new Book(null, 1l, "Amós", "am", 9);
		Book ob = new Book(null, 1l, "Obadias", "ob", 1);
		Book jn = new Book(null, 1l, "Jonas", "jn", 4);
		Book mq = new Book(null, 1l, "Miquéias", "mq", 7);
		Book na = new Book(null, 1l, "Naum", "na", 3);
		Book hc = new Book(null, 1l, "Habacuque", "hc", 3);
		Book sf = new Book(null, 1l, "Sofonias", "sf", 3);
		Book ag = new Book(null, 1l, "Ageu", "ag", 2);
		Book zc = new Book(null, 1l, "Zacarias", "zc", 14);
		Book ml = new Book(null, 1l, "Malaquias", "ml", 4);
		Book mt = new Book(null, 2l, "Mateus", "mt", 28);
		Book mc = new Book(null, 2l, "Marcos", "mc", 16);
		Book lc = new Book(null, 2l, "Lucas", "lc", 24);
		Book jo = new Book(null, 2l, "João", "jo", 21);
		Book at = new Book(null, 2l, "Atos", "at", 28);
		Book rm = new Book(null, 2l, "Romanos", "rm", 16);
		Book fco = new Book(null, 2l, "1 Coríntios", "1co", 16);
		Book sco = new Book(null, 2l, "2 Coríntios", "2co", 13);
		Book gl = new Book(null, 2l, "Gálatas", "gl", 6);
		Book ef = new Book(null, 2l, "Efésios", "ef", 6);
		Book fp = new Book(null, 2l, "Filipenses", "fp", 4);
		Book cl = new Book(null, 2l, "Colossenses", "cl", 4);
		Book fts = new Book(null, 2l, "1 Tessalonicenses", "1ts", 5);
		Book sts = new Book(null, 2l, "2 Tessalonicenses", "2ts", 3);
		Book ftm = new Book(null, 2l, "1 Timóteo", "1tm", 6);
		Book stm = new Book(null, 2l, "2 Timóteo", "2tm", 4);
		Book tt = new Book(null, 2l, "Tito", "tt", 3);
		Book fm = new Book(null, 2l, "Filemom", "fm", 1);
		Book hb = new Book(null, 2l, "Hebreus", "hb", 13);
		Book tg = new Book(null, 2l, "Tiago", "tg", 5);
		Book fpe = new Book(null, 2l, "1 Pedro", "1pe", 5);
		Book spe = new Book(null, 2l, "2 Pedro", "2pe", 3);
		Book fjo = new Book(null, 2l, "1 João", "1jo", 5);
		Book sjo = new Book(null, 2l, "2 João", "2jo", 1);
		Book tjo = new Book(null, 2l, "3 João", "3jo", 1);
		Book jd = new Book(null, 2l, "Judas", "jd", 1);
		Book ap = new Book(null, 2l, "Apocalipse", "ap", 22);

		book.saveAll(Arrays.asList(gn, ex, lv, nm, dt, js, jz, rt, fsm, ssm, frs, srs, fcr, scr, ed, ne, et, jó, sl, pv,
				ec, ct, is, jr, lm, ez, dn, os, jl, am, ob, jn, mq, na, hc, sf, ag, zc, ml, mt, mc, lc, jo, at, rm, fco,
				sco, gl, ef, fp, cl, fts, sts, ftm, stm, tt, fm, hb, tg, fpe, spe, fjo, sjo, tjo, jd, ap));

		List<Verse> verses = new ArrayList<>();

		verses.add(new Verse(null, 1l, 1l, 1l, 1, 1, "NO princípio criou Deus os céus e a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 2,
				"E a terra era sem forma e vazia; e havia trevas sobre a face do abismo; e o Espírito de Deus se movia sobre a face das águas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 3, "E disse Deus: Haja luz; e houve luz."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 4,
				"E viu Deus que era boa a luz; e fez Deus separação entre a luz e as trevas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 5,
				"E Deus chamou à luz Dia; e às trevas chamou Noite. E foi a tarde e a manhã, o dia primeiro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 6,
				"E disse Deus: Haja uma expansão no meio das águas, e haja separação entre águas e águas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 7,
				"E fez Deus a expansão, e fez separação entre as águas que estavam debaixo da expansão e as águas que estavam sobre a expansão; e assim foi."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 8,
				"E chamou Deus à expansão Céus, e foi a tarde e a manhã, o dia segundo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 9,
				"E disse Deus: Ajuntem-se as águas debaixo dos céus num lugar; e apareça a porção seca; e assim foi."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 10,
				"E chamou Deus à porção seca Terra; e ao ajuntamento das águas chamou Mares; e viu Deus que era bom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 11,
				"E disse Deus: Produza a terra erva verde, erva que dê semente, árvore frutífera que dê fruto segundo a sua espécie, cuja semente está nela sobre a terra; e assim foi."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 12,
				"E a terra produziu erva, erva dando semente conforme a sua espécie, e a árvore frutífera, cuja semente está nela conforme a sua espécie; e viu Deus que era bom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 13, "E foi a tarde e a manhã, o dia terceiro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 14,
				"E disse Deus: Haja luminares na expansão dos céus, para haver separação entre o dia e a noite; e sejam eles para sinais e para tempos determinados e para dias e anos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 15,
				"E sejam para luminares na expansão dos céus, para iluminar a terra; e assim foi."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 16,
				"E fez Deus os dois grandes luminares: o luminar maior para governar o dia, e o luminar menor para governar a noite; e fez as estrelas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 17, "E Deus os pôs na expansão dos céus para iluminar a terra,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 18,
				"E para governar o dia e a noite, e para fazer separação entre a luz e as trevas; e viu Deus que era bom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 19, "E foi a tarde e a manhã, o dia quarto."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 20,
				"E disse Deus: Produzam as águas abundantemente répteis de alma vivente; e voem as aves sobre a face da expansão dos céus."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 21,
				"E Deus criou as grandes baleias, e todo o réptil de alma vivente que as águas abundantemente produziram conforme as suas espécies; e toda a ave de asas conforme a sua espécie; e viu Deus que era bom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 22,
				"E Deus os abençoou, dizendo: Frutificai e multiplicai-vos, e enchei as águas nos mares; e as aves se multipliquem na terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 23, "E foi a tarde e a manhã, o dia quinto."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 24,
				"E disse Deus: Produza a terra alma vivente conforme a sua espécie; gado, e répteis e feras da terra conforme a sua espécie; e assim foi."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 25,
				"E fez Deus as feras da terra conforme a sua espécie, e o gado conforme a sua espécie, e todo o réptil da terra conforme a sua espécie; e viu Deus que era bom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 26,
				"E disse Deus: Façamos o homem à nossa imagem, conforme a nossa semelhança; e domine sobre os peixes do mar, e sobre as aves dos céus, e sobre o gado, e sobre toda a terra, e sobre todo o réptil que se move sobre a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 27,
				"E criou Deus o homem à sua imagem; à imagem de Deus o criou; homem e mulher os criou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 28,
				"E Deus os abençoou, e Deus lhes disse: Frutificai e multiplicai-vos, e enchei a terra, e sujeitai-a; e dominai sobre os peixes do mar e sobre as aves dos céus, e sobre todo o animal que se move sobre a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 29,
				"E disse Deus: Eis que vos tenho dado toda a erva que dê semente, que está sobre a face de toda a terra; e toda a árvore, em que há fruto que dê semente, ser-vos-á para mantimento."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 30,
				"E a todo o animal da terra, e a toda a ave dos céus, e a todo o réptil da terra, em que há alma vivente, toda a erva verde será para mantimento; e assim foi."));
		verses.add(new Verse(null, 1l, 1l, 1l, 1, 31,
				"E viu Deus tudo quanto tinha feito, e eis que era muito bom; e foi a tarde e a manhã, o dia sexto."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 1, "ASSIM os céus, a terra e todo o seu exército foram acabados."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 2,
				"E havendo Deus acabado no dia sétimo a obra que fizera, descansou no sétimo dia de toda a sua obra, que tinha feito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 3,
				"E abençoou Deus o dia sétimo, e o santificou; porque nele descansou de toda a sua obra que Deus criara e fizera."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 4,
				"Estas são as origens dos céus e da terra, quando foram criados; no dia em que o SENHOR Deus fez a terra e os céus,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 5,
				"E toda a planta do campo que ainda não estava na terra, e toda a erva do campo que ainda não brotava; porque ainda o SENHOR Deus não tinha feito chover sobre a terra, e não havia homem para lavrar a terra."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 2, 6, "Um vapor, porém, subia da terra, e regava toda a face da terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 7,
				"E formou o SENHOR Deus o homem do pó da terra, e soprou em suas narinas o fôlego da vida; e o homem foi feito alma vivente."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 8,
				"E plantou o SENHOR Deus um jardim no Éden, do lado oriental; e pôs ali o homem que tinha formado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 9,
				"E o SENHOR Deus fez brotar da terra toda a árvore agradável à vista, e boa para comida; e a árvore da vida no meio do jardim, e a árvore do conhecimento do bem e do mal."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 10,
				"E saía um rio do Éden para regar o jardim; e dali se dividia e se tornava em quatro braços."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 11,
				"O nome do primeiro é Pisom; este é o que rodeia toda a terra de Havilá, onde há ouro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 12,
				"E o ouro dessa terra é bom; ali há o bdélio, e a pedra sardônica."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 13,
				"E o nome do segundo rio é Giom; este é o que rodeia toda a terra de Cuxe."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 14,
				"E o nome do terceiro rio é Tigre; este é o que vai para o lado oriental da Assíria; e o quarto rio é o Eufrates."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 15,
				"E tomou o SENHOR Deus o homem, e o pôs no jardim do Éden para o lavrar e o guardar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 16,
				"E ordenou o SENHOR Deus ao homem, dizendo: De toda a árvore do jardim comerás livremente,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 17,
				"Mas da árvore do conhecimento do bem e do mal, dela não comerás; porque no dia em que dela comeres, certamente morrerás."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 18,
				"E disse o SENHOR Deus: Não é bom que o homem esteja só; far-lhe-ei uma ajudadora idônea para ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 19,
				"Havendo, pois, o SENHOR Deus formado da terra todo o animal do campo, e toda a ave dos céus, os trouxe a Adão, para este ver como lhes chamaria; e tudo o que Adão chamou a toda a alma vivente, isso foi o seu nome."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 20,
				"E Adão pôs os nomes a todo o gado, e às aves dos céus, e a todo o animal do campo; mas para o homem não se achava ajudadora idônea."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 21,
				"Então o SENHOR Deus fez cair um sono pesado sobre Adão, e este adormeceu; e tomou uma das suas costelas, e cerrou a carne em seu lugar;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 22,
				"E da costela que o SENHOR Deus tomou do homem, formou uma mulher, e trouxe-a a Adão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 23,
				"E disse Adão: Esta é agora osso dos meus ossos, e carne da minha carne; esta será chamada mulher, porquanto do homem foi tomada."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 24,
				"Portanto deixará o homem o seu pai e a sua mãe, e apegar-se-á à sua mulher, e serão ambos uma carne."));
		verses.add(new Verse(null, 1l, 1l, 1l, 2, 25,
				"E ambos estavam nus, o homem e a sua mulher; e não se envergonhavam."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 1,
				"ORA, a serpente era mais astuta que todas as alimárias do campo que o SENHOR Deus tinha feito. E esta disse à mulher: É assim que Deus disse: Não comereis de toda a árvore do jardim?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 2,
				"E disse a mulher à serpente: Do fruto das árvores do jardim comeremos,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 3,
				"Mas do fruto da árvore que está no meio do jardim, disse Deus: Não comereis dele, nem nele tocareis para que não morrais."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 4, "Então a serpente disse à mulher: Certamente não morrereis."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 5,
				"Porque Deus sabe que no dia em que dele comerdes se abrirão os vossos olhos, e sereis como Deus, sabendo o bem e o mal."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 6,
				"E viu a mulher que aquela árvore era boa para se comer, e agradável aos olhos, e árvore desejável para dar entendimento; tomou do seu fruto, e comeu, e deu também a seu marido, e ele comeu com ela."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 7,
				"Então foram abertos os olhos de ambos, e conheceram que estavam nus; e coseram folhas de figueira, e fizeram para si aventais."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 8,
				"E ouviram a voz do SENHOR Deus, que passeava no jardim pela viração do dia; e esconderam-se Adão e sua mulher da presença do SENHOR Deus, entre as árvores do jardim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 9, "E chamou o SENHOR Deus a Adão, e disse-lhe: Onde estás?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 10,
				"E ele disse: Ouvi a tua voz soar no jardim, e temi, porque estava nu, e escondi-me."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 11,
				"E Deus disse: Quem te mostrou que estavas nu? Comeste tu da árvore de que te ordenei que não comesses?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 12,
				"Então disse Adão: A mulher que me deste por companheira, ela me deu da árvore, e comi."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 13,
				"E disse o SENHOR Deus à mulher: Por que fizeste isto? E disse a mulher: A serpente me enganou, e eu comi."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 14,
				"Então o SENHOR Deus disse à serpente: Porquanto fizeste isto, maldita serás mais que toda a fera, e mais que todos os animais do campo; sobre o teu ventre andarás, e pó comerás todos os dias da tua vida."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 15,
				"E porei inimizade entre ti e a mulher, e entre a tua semente e a sua semente; esta te ferirá a cabeça, e tu lhe ferirás o calcanhar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 16,
				"E à mulher disse: Multiplicarei grandemente a tua dor, e a tua conceição; com dor darás à luz filhos; e o teu desejo será para o teu marido, e ele te dominará."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 17,
				"E a Adão disse: Porquanto deste ouvidos à voz de tua mulher, e comeste da árvore de que te ordenei, dizendo: Não comerás dela, maldita é a terra por causa de ti; com dor comerás dela todos os dias da tua vida."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 18,
				"Espinhos, e cardos também, te produzirá; e comerás a erva do campo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 19,
				"No suor do teu rosto comerás o teu pão, até que te tornes à terra; porque dela foste tomado; porquanto és pó e em pó te tornarás."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 20,
				"E chamou Adão o nome de sua mulher Eva; porquanto era a mãe de todos os viventes."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 21,
				"E fez o SENHOR Deus a Adão e à sua mulher túnicas de peles, e os vestiu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 22,
				"Então disse o SENHOR Deus: Eis que o homem é como um de nós, sabendo o bem e o mal; ora, para que não estenda a sua mão, e tome também da árvore da vida, e coma e viva eternamente,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 23,
				"O SENHOR Deus, pois, o lançou fora do jardim do Éden, para lavrar a terra de que fora tomado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 3, 24,
				"E havendo lançado fora o homem, pôs querubins ao oriente do jardim do Éden, e uma espada inflamada que andava ao redor, para guardar o caminho da árvore da vida."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 1,
				"E CONHECEU Adão a Eva, sua mulher, e ela concebeu e deu à luz a Caim, e disse: Alcancei do SENHOR um homem."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 2,
				"E deu à luz mais a seu irmão Abel; e Abel foi pastor de ovelhas, e Caim foi lavrador da terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 3,
				"E aconteceu ao cabo de dias que Caim trouxe do fruto da terra uma oferta ao SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 4,
				"E Abel também trouxe dos primogênitos das suas ovelhas, e da sua gordura; e atentou o SENHOR para Abel e para a sua oferta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 5,
				"Mas para Caim e para a sua oferta não atentou. E irou-se Caim fortemente, e descaiu-lhe o semblante."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 6,
				"E o SENHOR disse a Caim: Por que te iraste? E por que descaiu o teu semblante?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 7,
				"Se bem fizeres, não é certo que serás aceito? E se não fizeres bem, o pecado jaz à porta, e sobre ti será o seu desejo, mas sobre ele deves dominar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 8,
				"E falou Caim com o seu irmão Abel; e sucedeu que, estando eles no campo, se levantou Caim contra o seu irmão Abel, e o matou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 9,
				"E disse o SENHOR a Caim: Onde está Abel, teu irmão? E ele disse: Não sei; sou eu guardador do meu irmão?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 10,
				"E disse Deus: Que fizeste? A voz do sangue do teu irmão clama a mim desde a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 11,
				"E agora maldito és tu desde a terra, que abriu a sua boca para receber da tua mão o sangue do teu irmão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 12,
				"Quando lavrares a terra, não te dará mais a sua força; fugitivo e vagabundo serás na terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 13,
				"Então disse Caim ao SENHOR: É maior a minha maldade que a que possa ser perdoada."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 14,
				"Eis que hoje me lanças da face da terra, e da tua face me esconderei; e serei fugitivo e vagabundo na terra, e será que todo aquele que me achar, me matará."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 15,
				"O SENHOR, porém, disse-lhe: Portanto qualquer que matar a Caim, sete vezes será castigado. E pôs o SENHOR um sinal em Caim, para que o não ferisse qualquer que o achasse."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 16,
				"E saiu Caim de diante da face do SENHOR, e habitou na terra de Node, do lado oriental do Éden."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 17,
				"E conheceu Caim a sua mulher, e ela concebeu, e deu à luz a Enoque; e ele edificou uma cidade, e chamou o nome da cidade conforme o nome de seu filho Enoque;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 18,
				"E a Enoque nasceu Irade, e Irade gerou a Meujael, e Meujael gerou a Metusael e Metusael gerou a Lameque."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 19,
				"E tomou Lameque para si duas mulheres; o nome de uma era Ada, e o nome da outra, Zilá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 20,
				"E Ada deu à luz a Jabal; este foi o pai dos que habitam em tendas e têm gado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 21,
				"E o nome do seu irmão era Jubal; este foi o pai de todos os que tocam harpa e órgão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 22,
				"E Zilá também deu à luz a Tubalcaim, mestre de toda a obra de cobre e ferro; e a irmã de Tubalcaim foi Noema."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 23,
				"E disse Lameque a suas mulheres Ada e Zilá: Ouvi a minha voz; vós, mulheres de Lameque, escutai as minhas palavras; porque eu matei um homem por me ferir, e um jovem por me pisar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 24,
				"Porque sete vezes Caim será castigado; mas Lameque setenta vezes sete."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 25,
				"E tornou Adão a conhecer a sua mulher; e ela deu à luz um filho, e chamou o seu nome Sete; porque, disse ela, Deus me deu outro filho em lugar de Abel; porquanto Caim o matou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 4, 26,
				"E a Sete também nasceu um filho; e chamou o seu nome Enos; então se começou a invocar o nome do SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 1,
				"ESTE é o livro das gerações de Adão. No dia em que Deus criou o homem, à semelhança de Deus o fez."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 2,
				"Homem e mulher os criou; e os abençoou e chamou o seu nome Adão, no dia em que foram criados."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 3,
				"E Adão viveu cento e trinta anos, e gerou um filho à sua semelhança, conforme a sua imagem, e pôs-lhe o nome de Sete."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 4,
				"E foram os dias de Adão, depois que gerou a Sete, oitocentos anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 5,
				"E foram todos os dias que Adão viveu, novecentos e trinta anos, e morreu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 6, "E viveu Sete cento e cinco anos, e gerou a Enos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 7,
				"E viveu Sete, depois que gerou a Enos, oitocentos e sete anos, e gerou filhos e filhas."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 5, 8, "E foram todos os dias de Sete novecentos e doze anos, e morreu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 9, "E viveu Enos noventa anos, e gerou a Cainã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 10,
				"E viveu Enos, depois que gerou a Cainã, oitocentos e quinze anos, e gerou filhos e filhas."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 5, 11, "E foram todos os dias de Enos novecentos e cinco anos, e morreu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 12, "E viveu Cainã setenta anos, e gerou a Maalaleel."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 13,
				"E viveu Cainã, depois que gerou a Maalaleel, oitocentos e quarenta anos, e gerou filhos e filhas."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 5, 14, "E foram todos os dias de Cainã novecentos e dez anos, e morreu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 15, "E viveu Maalaleel sessenta e cinco anos, e gerou a Jerede."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 16,
				"E viveu Maalaleel, depois que gerou a Jerede, oitocentos e trinta anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 17,
				"E foram todos os dias de Maalaleel oitocentos e noventa e cinco anos, e morreu."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 5, 18, "E viveu Jerede cento e sessenta e dois anos, e gerou a Enoque."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 19,
				"E viveu Jerede, depois que gerou a Enoque, oitocentos anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 20,
				"E foram todos os dias de Jerede novecentos e sessenta e dois anos, e morreu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 21, "E viveu Enoque sessenta e cinco anos, e gerou a Matusalém."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 22,
				"E andou Enoque com Deus, depois que gerou a Matusalém, trezentos anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 23,
				"E foram todos os dias de Enoque trezentos e sessenta e cinco anos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 24,
				"E andou Enoque com Deus; e não apareceu mais, porquanto Deus para si o tomou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 25,
				"E viveu Matusalém cento e oitenta e sete anos, e gerou a Lameque."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 26,
				"E viveu Matusalém, depois que gerou a Lameque, setecentos e oitenta e dois anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 27,
				"E foram todos os dias de Matusalém novecentos e sessenta e nove anos, e morreu."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 5, 28, "E viveu Lameque cento e oitenta e dois anos, e gerou um filho,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 29,
				"A quem chamou Noé, dizendo: Este nos consolará acerca de nossas obras e do trabalho de nossas mãos, por causa da terra que o SENHOR amaldiçoou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 30,
				"E viveu Lameque, depois que gerou a Noé, quinhentos e noventa e cinco anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 31,
				"E foram todos os dias de Lameque setecentos e setenta e sete anos, e morreu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 5, 32,
				"E era Noé da idade de quinhentos anos, e gerou Noé a Sem, Cão e Jafé."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 1,
				"E ACONTECEU que, como os homens começaram a multiplicar-se sobre a face da terra, e lhes nasceram filhas,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 2,
				"Viram os filhos de Deus que as filhas dos homens eram formosas; e tomaram para si mulheres de todas as que escolheram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 3,
				"Então disse o SENHOR: Não contenderá o meu Espírito para sempre com o homem; porque ele também é carne; porém os seus dias serão cento e vinte anos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 4,
				"Havia naqueles dias gigantes na terra; e também depois, quando os filhos de Deus entraram às filhas dos homens e delas geraram filhos; estes eram os valentes que houve na antiguidade, os homens de fama."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 5,
				"E viu o SENHOR que a maldade do homem se multiplicara sobre a terra e que toda a imaginação dos pensamentos de seu coração era só má continuamente."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 6,
				"Então arrependeu-se o SENHOR de haver feito o homem sobre a terra e pesou-lhe em seu coração."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 7,
				"E disse o SENHOR: Destruirei o homem que criei de sobre a face da terra, desde o homem até ao animal, até ao réptil, e até à ave dos céus; porque me arrependo de os haver feito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 8, "Noé, porém, achou graça aos olhos do SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 9,
				"Estas são as gerações de Noé. Noé era homem justo e perfeito em suas gerações; Noé andava com Deus."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 10, "E gerou Noé três filhos: Sem, Cão e Jafé."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 11,
				"A terra, porém, estava corrompida diante da face de Deus; e encheu-se a terra de violência."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 12,
				"E viu Deus a terra, e eis que estava corrompida; porque toda a carne havia corrompido o seu caminho sobre a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 13,
				"Então disse Deus a Noé: O fim de toda a carne é vindo perante a minha face; porque a terra está cheia de violência; e eis que os desfarei com a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 14,
				"Faze para ti uma arca da madeira de gofer; farás compartimentos na arca e a betumarás por dentro e por fora com betume."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 15,
				"E desta maneira a farás: De trezentos côvados o comprimento da arca, e de cinqüenta côvados a sua largura, e de trinta côvados a sua altura."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 16,
				"Farás na arca uma janela, e de um côvado a acabarás em cima; e a porta da arca porás ao seu lado; far-lhe-ás andares, baixo, segundo e terceiro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 17,
				"Porque eis que eu trago um dilúvio de águas sobre a terra, para desfazer toda a carne em que há espírito de vida debaixo dos céus; tudo o que há na terra expirará."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 18,
				"Mas contigo estabelecerei a minha aliança; e entrarás na arca, tu e os teus filhos, tua mulher e as mulheres de teus filhos contigo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 19,
				"E de tudo o que vive, de toda a carne, dois de cada espécie, farás entrar na arca, para os conservar vivos contigo; macho e fêmea serão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 20,
				"Das aves conforme a sua espécie, e dos animais conforme a sua espécie, de todo o réptil da terra conforme a sua espécie, dois de cada espécie virão a ti, para os conservar em vida."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 21,
				"E leva contigo de toda a comida que se come e ajunta-a para ti; e te será para mantimento, a ti e a eles."));
		verses.add(new Verse(null, 1l, 1l, 1l, 6, 22,
				"Assim fez Noé; conforme a tudo o que Deus lhe mandou, assim o fez."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 1,
				"DEPOIS disse o SENHOR a Noé: Entra tu e toda a tua casa na arca, porque tenho visto que és justo diante de mim nesta geração."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 2,
				"De todos os animais limpos tomarás para ti sete e sete, o macho e sua fêmea; mas dos animais que não são limpos, dois, o macho e sua fêmea."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 3,
				"Também das aves dos céus sete e sete, macho e fêmea, para conservar em vida sua espécie sobre a face de toda a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 4,
				"Porque, passados ainda sete dias, farei chover sobre a terra quarenta dias e quarenta noites; e desfarei de sobre a face da terra toda a substância que fiz."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 5, "E fez Noé conforme a tudo o que o SENHOR lhe ordenara."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 6,
				"E era Noé da idade de seiscentos anos, quando o dilúvio das águas veio sobre a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 7,
				"Noé entrou na arca, e com ele seus filhos, sua mulher e as mulheres de seus filhos, por causa das águas do dilúvio."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 8,
				"Dos animais limpos e dos animais que não são limpos, e das aves, e de todo o réptil sobre a terra,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 9,
				"Entraram de dois em dois para junto de Noé na arca, macho e fêmea, como Deus ordenara a Noé."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 10,
				"E aconteceu que passados sete dias, vieram sobre a terra as águas do dilúvio."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 11,
				"No ano seiscentos da vida de Noé, no mês segundo, aos dezessete dias do mês, naquele mesmo dia se romperam todas as fontes do grande abismo, e as janelas dos céus se abriram,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 12, "E houve chuva sobre a terra quarenta dias e quarenta noites."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 13,
				"E no mesmo dia entraram na arca Noé, seus filhos Sem, Cão e Jafé, sua mulher e as mulheres de seus filhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 14,
				"Eles, e todo o animal conforme a sua espécie, e todo o gado conforme a sua espécie, e todo o réptil que se arrasta sobre a terra conforme a sua espécie, e toda a ave conforme a sua espécie, pássaros de toda qualidade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 15,
				"E de toda a carne, em que havia espírito de vida, entraram de dois em dois para junto de Noé na arca."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 16,
				"E os que entraram eram macho e fêmea de toda a carne, como Deus lhe tinha ordenado; e o SENHOR o fechou dentro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 17,
				"E durou o dilúvio quarenta dias sobre a terra, e cresceram as águas e levantaram a arca, e ela se elevou sobre a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 18,
				"E prevaleceram as águas e cresceram grandemente sobre a terra; e a arca andava sobre as águas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 19,
				"E as águas prevaleceram excessivamente sobre a terra; e todos os altos montes que havia debaixo de todo o céu, foram cobertos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 20,
				"Quinze côvados acima prevaleceram as águas; e os montes foram cobertos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 21,
				"E expirou toda a carne que se movia sobre a terra, tanto de ave como de gado e de feras, e de todo o réptil que se arrasta sobre a terra, e todo o homem."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 22,
				"Tudo o que tinha fôlego de espírito de vida em suas narinas, tudo o que havia em terra seca, morreu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 23,
				"Assim foi destruído todo o ser vivente que havia sobre a face da terra, desde o homem até ao animal, até ao réptil, e até à ave dos céus; e foram extintos da terra; e ficou somente Noé, e os que com ele estavam na arca."));
		verses.add(new Verse(null, 1l, 1l, 1l, 7, 24, "E prevaleceram as águas sobre a terra cento e cinqüenta dias."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 1,
				"E LEMBROU-SE Deus de Noé, e de todos os seres viventes, e de todo o gado que estavam com ele na arca; e Deus fez passar um vento sobre a terra, e aquietaram-se as águas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 2,
				"Cerraram-se também as fontes do abismo e as janelas dos céus, e a chuva dos céus deteve-se."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 3,
				"E as águas iam-se escoando continuamente de sobre a terra, e ao fim de cento e cinqüenta dias minguaram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 4,
				"E a arca repousou no sétimo mês, no dia dezessete do mês, sobre os montes de Ararate."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 5,
				"E foram as águas indo e minguando até ao décimo mês; no décimo mês, no primeiro dia do mês, apareceram os cumes dos montes."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 6,
				"E aconteceu que ao cabo de quarenta dias, abriu Noé a janela da arca que tinha feito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 7,
				"E soltou um corvo, que saiu, indo e voltando, até que as águas se secaram de sobre a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 8,
				"Depois soltou uma pomba, para ver se as águas tinham minguado de sobre a face da terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 9,
				"A pomba, porém, não achou repouso para a planta do seu pé, e voltou a ele para a arca; porque as águas estavam sobre a face de toda a terra; e ele estendeu a sua mão, e tomou-a, e recolheu-a consigo na arca."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 10,
				"E esperou ainda outros sete dias, e tornou a enviar a pomba fora da arca."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 11,
				"E a pomba voltou a ele à tarde; e eis, arrancada, uma folha de oliveira no seu bico; e conheceu Noé que as águas tinham minguado de sobre a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 12,
				"Então esperou ainda outros sete dias, e enviou fora a pomba; mas não tornou mais a ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 13,
				"E aconteceu que no ano seiscentos e um, no mês primeiro, no primeiro dia do mês, as águas se secaram de sobre a terra. Então Noé tirou a cobertura da arca, e olhou, e eis que a face da terra estava enxuta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 14,
				"E no segundo mês, aos vinte e sete dias do mês, a terra estava seca."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 15, "Então falou Deus a Noé dizendo:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 16,
				"Sai da arca, tu com tua mulher, e teus filhos e as mulheres de teus filhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 17,
				"Todo o animal que está contigo, de toda a carne, de ave, e de gado, e de todo o réptil que se arrasta sobre a terra, traze fora contigo; e povoem abundantemente a terra e frutifiquem, e se multipliquem sobre a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 18,
				"Então saiu Noé, e seus filhos, e sua mulher, e as mulheres de seus filhos com ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 19,
				"Todo o animal, todo o réptil, e toda a ave, e tudo o que se move sobre a terra, conforme as suas famílias, saiu para fora da arca."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 20,
				"E edificou Noé um altar ao SENHOR; e tomou de todo o animal limpo e de toda a ave limpa, e ofereceu holocausto sobre o altar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 21,
				"E o SENHOR sentiu o suave cheiro, e o SENHOR disse em seu coração: Não tornarei mais a amaldiçoar a terra por causa do homem; porque a imaginação do coração do homem é má desde a sua meninice, nem tornarei mais a ferir todo o vivente, como fiz."));
		verses.add(new Verse(null, 1l, 1l, 1l, 8, 22,
				"Enquanto a terra durar, sementeira e sega, e frio e calor, e verão e inverno, e dia e noite, não cessarão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 1,
				"E ABENÇOOU Deus a Noé e a seus filhos, e disse-lhes: Frutificai e multiplicai-vos e enchei a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 2,
				"E o temor de vós e o pavor de vós virão sobre todo o animal da terra, e sobre toda a ave dos céus; tudo o que se move sobre a terra, e todos os peixes do mar, nas vossas mãos são entregues."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 3,
				"Tudo quanto se move, que é vivente, será para vosso mantimento; tudo vos tenho dado como a erva verde."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 4,
				"A carne, porém, com sua vida, isto é, com seu sangue, não comereis."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 5,
				"Certamente requererei o vosso sangue, o sangue das vossas vidas; da mão de todo o animal o requererei; como também da mão do homem, e da mão do irmão de cada um requererei a vida do homem."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 6,
				"Quem derramar o sangue do homem, pelo homem o seu sangue será derramado; porque Deus fez o homem conforme a sua imagem."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 7,
				"Mas vós frutificai e multiplicai-vos; povoai abundantemente a terra, e multiplicai-vos nela."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 8, "E falou Deus a Noé e a seus filhos com ele, dizendo:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 9,
				"E eu, eis que estabeleço a minha aliança convosco e com a vossa descendência depois de vós."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 10,
				"E com toda a alma vivente, que convosco está, de aves, de gado, e de todo o animal da terra convosco; com todos que saíram da arca, até todo o animal da terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 11,
				"E eu convosco estabeleço a minha aliança, que não será mais destruída toda a carne pelas águas do dilúvio, e que não haverá mais dilúvio, para destruir a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 12,
				"E disse Deus: Este é o sinal da aliança que ponho entre mim e vós, e entre toda a alma vivente, que está convosco, por gerações eternas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 13,
				"O meu arco tenho posto nas nuvens; este será por sinal da aliança entre mim e a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 14,
				"E acontecerá que, quando eu trouxer nuvens sobre a terra, aparecerá o arco nas nuvens."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 15,
				"Então me lembrarei da minha aliança, que está entre mim e vós, e entre toda a alma vivente de toda a carne; e as águas não se tornarão mais em dilúvio para destruir toda a carne."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 16,
				"E estará o arco nas nuvens, e eu o verei, para me lembrar da aliança eterna entre Deus e toda a alma vivente de toda a carne, que está sobre a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 17,
				"E disse Deus a Noé: Este é o sinal da aliança que tenho estabelecido entre mim e entre toda a carne, que está sobre a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 18,
				"E os filhos de Noé, que da arca saíram, foram Sem, Cão e Jafé; e Cão é o pai de Canaã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 19,
				"Estes três foram os filhos de Noé; e destes se povoou toda a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 20, "E começou Noé a ser lavrador da terra, e plantou uma vinha."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 21,
				"E bebeu do vinho, e embebedou-se; e descobriu-se no meio de sua tenda."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 22,
				"E viu Cão, o pai de Canaã, a nudez do seu pai, e fê-lo saber a ambos seus irmãos no lado de fora."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 23,
				"Então tomaram Sem e Jafé uma capa, e puseram-na sobre ambos os seus ombros, e indo virados para trás, cobriram a nudez do seu pai, e os seus rostos estavam virados, de maneira que não viram a nudez do seu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 24,
				"E despertou Noé do seu vinho, e soube o que seu filho menor lhe fizera."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 25,
				"E disse: Maldito seja Canaã; servo dos servos seja aos seus irmãos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 26,
				"E disse: Bendito seja o SENHOR Deus de Sem; e seja-lhe Canaã por servo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 27,
				"Alargue Deus a Jafé, e habite nas tendas de Sem; e seja-lhe Canaã por servo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 28, "E viveu Noé, depois do dilúvio, trezentos e cinqüenta anos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 9, 29,
				"E foram todos os dias de Noé novecentos e cinqüenta anos, e morreu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 1,
				"ESTAS, pois, são as gerações dos filhos de Noé: Sem, Cão e Jafé; e nasceram-lhes filhos depois do dilúvio."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 2,
				"Os filhos de Jafé são: Gomer, Magogue, Madai, Javã, Tubal, Meseque e Tiras."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 3, "E os filhos de Gomer são: Asquenaz, Rifate e Togarma."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 4, "E os filhos de Javã são: Elisá, Társis, Quitim e Dodanim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 5,
				"Por estes foram repartidas as ilhas dos gentios nas suas terras, cada qual segundo a sua língua, segundo as suas famílias, entre as suas nações."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 6, "E os filhos de Cão são: Cuxe, Mizraim, Pute e Canaã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 7,
				"E os filhos de Cuxe são: Sebá, Havilá, Sabtá, Raamá e Sabtecá; e os filhos de Raamá: Sebá e Dedã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 8,
				"E Cuxe gerou a Ninrode; este começou a ser poderoso na terra. 9 E este foi poderoso caçador diante da face do SENHOR; por isso se diz: Como Ninrode, poderoso caçador diante do SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 9, "Verszeile ohne Text"));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 10,
				"E o princípio do seu reino foi Babel, Ereque, Acade e Calné, na terra de Sinar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 11,
				"Desta mesma terra saiu à Assíria e edificou a Nínive, Reobote-Ir, Calá,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 12, "E Resen, entre Nínive e Calá (esta é a grande cidade)."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 13, "E Mizraim gerou a Ludim, a Anamim, a Leabim, a Naftuim,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 14,
				"A Patrusim e a Casluim (donde saíram os filisteus) e a Caftorim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 15, "E Canaã gerou a Sidom, seu primogênito, e a Hete;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 16, "E ao jebuseu, ao amorreu, ao girgaseu,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 17, "E ao heveu, ao arqueu, ao sineu,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 18,
				"E ao arvadeu, ao zemareu, e ao hamateu, e depois se espalharam as famílias dos cananeus."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 19,
				"E foi o termo dos cananeus desde Sidom, indo para Gerar, até Gaza; indo para Sodoma e Gomorra, Admá e Zeboim, até Lasa."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 20,
				"Estes são os filhos de Cão segundo as suas famílias, segundo as suas línguas, em suas terras, em suas nações."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 21,
				"E a Sem nasceram filhos, e ele é o pai de todos os filhos de Éber, o irmão mais velho de Jafé."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 22, "Os filhos de Sem são: Elão, Assur, Arfaxade, Lude e Arã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 23, "E os filhos de Arã são: Uz, Hul, Geter e Más."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 24, "E Arfaxade gerou a Selá; e Selá gerou a Éber."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 25,
				"E a Éber nasceram dois filhos: o nome de um foi Pelegue, porquanto em seus dias se repartiu a terra, e o nome do seu irmão foi Joctã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 26, "E Joctã gerou a Almodá, a Selefe, a Hazarmavé, a Jerá,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 27, "A Hadorão, a Usal, a Dicla,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 28, "A Obal, a Abimael, a Sebá,"));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 10, 29, "A Ofir, a Havilá e a Jobabe; todos estes foram filhos de Joctã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 30,
				"E foi a sua habitação desde Messa, indo para Sefar, montanha do oriente."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 31,
				"Estes são os filhos de Sem segundo as suas famílias, segundo as suas línguas, nas suas terras, segundo as suas nações."));
		verses.add(new Verse(null, 1l, 1l, 1l, 10, 32,
				"Estas são as famílias dos filhos de Noé segundo as suas gerações, nas suas nações; e destes foram divididas as nações na terra depois do dilúvio."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 1, "E ERA toda a terra de uma mesma língua e de uma mesma fala."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 2,
				"E aconteceu que, partindo eles do oriente, acharam um vale na terra de Sinar; e habitaram ali."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 3,
				"E disseram uns aos outros: Eia, façamos tijolos e queimemo-los bem. E foi-lhes o tijolo por pedra, e o betume por cal."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 4,
				"E disseram: Eia, edifiquemos nós uma cidade e uma torre cujo cume toque nos céus, e façamo-nos um nome, para que não sejamos espalhados sobre a face de toda a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 5,
				"Então desceu o SENHOR para ver a cidade e a torre que os filhos dos homens edificavam;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 6,
				"E o SENHOR disse: Eis que o povo é um, e todos têm uma mesma língua; e isto é o que começam a fazer; e agora, não haverá restrição para tudo o que eles intentarem fazer."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 7,
				"Eia, desçamos e confundamos ali a sua língua, para que não entenda um a língua do outro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 8,
				"Assim o SENHOR os espalhou dali sobre a face de toda a terra; e cessaram de edificar a cidade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 9,
				"Por isso se chamou o seu nome Babel, porquanto ali confundiu o SENHOR a língua de toda a terra, e dali os espalhou o SENHOR sobre a face de toda a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 10,
				"Estas são as gerações de Sem: Sem era da idade de cem anos e gerou a Arfaxade, dois anos depois do dilúvio."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 11,
				"E viveu Sem, depois que gerou a Arfaxade, quinhentos anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 12, "E viveu Arfaxade trinta e cinco anos, e gerou a Selá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 13,
				"E viveu Arfaxade depois que gerou a Selá, quatrocentos e três anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 14, "E viveu Selá trinta anos, e gerou a Éber;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 15,
				"E viveu Selá, depois que gerou a Éber, quatrocentos e três anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 16, "E viveu Éber trinta e quatro anos, e gerou a Pelegue."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 17,
				"E viveu Éber, depois que gerou a Pelegue, quatrocentos e trinta anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 18, "E viveu Pelegue trinta anos, e gerou a Reú."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 19,
				"E viveu Pelegue, depois que gerou a Reú, duzentos e nove anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 20, "E viveu Reú trinta e dois anos, e gerou a Serugue."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 21,
				"E viveu Reú, depois que gerou a Serugue, duzentos e sete anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 22, "E viveu Serugue trinta anos, e gerou a Naor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 23,
				"E viveu Serugue, depois que gerou a Naor, duzentos anos, e gerou filhos e filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 24, "E viveu Naor vinte e nove anos, e gerou a Terá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 25,
				"E viveu Naor, depois que gerou a Terá, cento e dezenove anos, e gerou filhos e filhas."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 11, 26, "E viveu Terá setenta anos, e gerou a Abrão, a Naor, e a Harã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 27,
				"E estas são as gerações de Terá: Terá gerou a Abrão, a Naor, e a Harã; e Harã gerou a Ló."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 28,
				"E morreu Harã estando seu pai Terá ainda vivo, na terra do seu nascimento, em Ur dos caldeus."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 29,
				"E tomaram Abrão e Naor mulheres para si: o nome da mulher de Abrão era Sarai, e o nome da mulher de Naor era Milca, filha de Harã, pai de Milca e pai de Iscá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 30, "E Sarai foi estéril, não tinha filhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 31,
				"E tomou Terá a Abrão seu filho, e a Ló, filho de Harã, filho de seu filho, e a Sarai sua nora, mulher de seu filho Abrão, e saiu com eles de Ur dos caldeus, para ir à terra de Canaã; e vieram até Harã, e habitaram ali."));
		verses.add(new Verse(null, 1l, 1l, 1l, 11, 32,
				"E foram os dias de Terá duzentos e cinco anos, e morreu Terá em Harã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 1,
				"ORA, o SENHOR disse a Abrão: Sai-te da tua terra, da tua parentela e da casa de teu pai, para a terra que eu te mostrarei."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 2,
				"E far-te-ei uma grande nação, e abençoar-te-ei e engrandecerei o teu nome; e tu serás uma bênção."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 3,
				"E abençoarei os que te abençoarem, e amaldiçoarei os que te amaldiçoarem; e em ti serão benditas todas as famílias da terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 4,
				"Assim partiu Abrão como o SENHOR lhe tinha dito, e foi Ló com ele; e era Abrão da idade de setenta e cinco anos quando saiu de Harã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 5,
				"E tomou Abrão a Sarai, sua mulher, e a Ló, filho de seu irmão, e todos os bens que haviam adquirido, e as almas que lhe acresceram em Harã; e saíram para irem à terra de Canaã; e chegaram à terra de Canaã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 6,
				"E passou Abrão por aquela terra até ao lugar de Siquém, até ao carvalho de Moré; e estavam então os cananeus na terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 7,
				"E apareceu o SENHOR a Abrão, e disse: À tua descendência darei esta terra. E edificou ali um altar ao SENHOR, que lhe aparecera."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 8,
				"E moveu-se dali para a montanha do lado oriental de Betel, e armou a sua tenda, tendo Betel ao ocidente, e Ai ao oriente; e edificou ali um altar ao SENHOR, e invocou o nome do SENHOR."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 12, 9, "Depois caminhou Abrão dali, seguindo ainda para o lado do sul."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 10,
				"E havia fome naquela terra; e desceu Abrão ao Egito, para peregrinar ali, porquanto a fome era grande na terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 11,
				"E aconteceu que, chegando ele para entrar no Egito, disse a Sarai, sua mulher: Ora, bem sei que és mulher formosa à vista;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 12,
				"E será que, quando os egípcios te virem, dirão: Esta é sua mulher. E matar-me-ão a mim, e a ti te guardarão em vida."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 13,
				"Dize, peço-te, que és minha irmã, para que me vá bem por tua causa, e que viva a minha alma por amor de ti."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 14,
				"E aconteceu que, entrando Abrão no Egito, viram os egípcios a mulher, que era mui formosa."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 15,
				"E viram-na os príncipes de Faraó, e gabaram-na diante de Faraó; e foi a mulher tomada para a casa de Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 16,
				"E fez bem a Abrão por amor dela; e ele teve ovelhas, vacas, jumentos, servos e servas, jumentas e camelos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 17,
				"Feriu, porém, o SENHOR a Faraó e a sua casa, com grandes pragas, por causa de Sarai, mulher de Abrão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 18,
				"Então chamou Faraó a Abrão, e disse: Que é isto que me fizeste? Por que não me disseste que ela era tua mulher?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 19,
				"Por que disseste: É minha irmã? Por isso a tomei por minha mulher; agora, pois, eis aqui tua mulher; toma-a e vai-te."));
		verses.add(new Verse(null, 1l, 1l, 1l, 12, 20,
				"E Faraó deu ordens aos seus homens a respeito dele; e acompanharam-no, a ele, e a sua mulher, e a tudo o que tinha."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 1,
				"SUBIU, pois, Abrão do Egito para o lado do sul, ele e sua mulher, e tudo o que tinha, e com ele Ló."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 2, "E era Abrão muito rico em gado, em prata e em ouro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 3,
				"E fez as suas jornadas do sul até Betel, até ao lugar onde a princípio estivera a sua tenda, entre Betel e Ai;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 4,
				"Até ao lugar do altar que outrora ali tinha feito; e Abrão invocou ali o nome do SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 5, "E também Ló, que ia com Abrão, tinha rebanhos, gado e tendas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 6,
				"E não tinha capacidade a terra para poderem habitar juntos; porque os seus bens eram muitos; de maneira que não podiam habitar juntos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 7,
				"E houve contenda entre os pastores do gado de Abrão e os pastores do gado de Ló; e os cananeus e os perizeus habitavam então na terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 8,
				"E disse Abrão a Ló: Ora, não haja contenda entre mim e ti, e entre os meus pastores e os teus pastores, porque somos irmãos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 9,
				"Não está toda a terra diante de ti? Eia, pois, aparta-te de mim; e se escolheres a esquerda, irei para a direita; e se a direita escolheres, eu irei para a esquerda."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 10,
				"E levantou Ló os seus olhos, e viu toda a campina do Jordão, que era toda bem regada, antes do SENHOR ter destruído Sodoma e Gomorra, e era como o jardim do SENHOR, como a terra do Egito, quando se entra em Zoar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 11,
				"Então Ló escolheu para si toda a campina do Jordão, e partiu Ló para o oriente, e apartaram-se um do outro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 12,
				"Habitou Abrão na terra de Canaã e Ló habitou nas cidades da campina, e armou as suas tendas até Sodoma."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 13,
				"Ora, eram maus os homens de Sodoma, e grandes pecadores contra o SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 14,
				"E disse o SENHOR a Abrão, depois que Ló se apartou dele: Levanta agora os teus olhos, e olha desde o lugar onde estás, para o lado do norte, e do sul, e do oriente, e do ocidente;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 15,
				"Porque toda esta terra que vês, te hei de dar a ti, e à tua descendência, para sempre."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 16,
				"E farei a tua descendência como o pó da terra; de maneira que se alguém puder contar o pó da terra, também a tua descendência será contada."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 17,
				"Levanta-te, percorre essa terra, no seu comprimento e na sua largura; porque a ti a darei."));
		verses.add(new Verse(null, 1l, 1l, 1l, 13, 18,
				"E Abrão mudou as suas tendas, e foi, e habitou nos carvalhais de Manre, que estão junto a Hebrom; e edificou ali um altar ao SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 1,
				"E ACONTECEU nos dias de Anrafel, rei de Sinar, Arioque, rei de Elasar, Quedorlaomer, rei de Elão, e Tidal, rei de Goim,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 2,
				"Que estes fizeram guerra a Bera, rei de Sodoma, a Birsa, rei de Gomorra, a Sinabe, rei de Admá, e a Semeber, rei de Zeboim, e ao rei de Belá (esta é Zoar)."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 14, 3, "Todos estes se ajuntaram no vale de Sidim (que é o Mar Salgado)."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 4,
				"Doze anos haviam servido a Quedorlaomer, mas ao décimo terceiro ano rebelaram-se."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 5,
				"E ao décimo quarto ano veio Quedorlaomer, e os reis que estavam com ele, e feriram aos refains em Asterote-Carnaim, e aos zuzins em Hã, e aos emins em Savé-Quiriataim,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 6,
				"E aos horeus no seu monte Seir, até El-Parã que está junto ao deserto."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 7,
				"Depois tornaram e vieram a En-Mispate (que é Cades), e feriram toda a terra dos amalequitas, e também aos amorreus, que habitavam em Hazazom-Tamar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 8,
				"Então saiu o rei de Sodoma, e o rei de Gomorra, e o rei de Admá, e o rei de Zeboim, e o rei de Belá (esta é Zoar), e ordenaram batalha contra eles no vale de Sidim,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 9,
				"Contra Quedorlaomer, rei de Elão, e Tidal, rei de Goim, e Anrafel, rei de Sinar, e Arioque, rei de Elasar; quatro reis contra cinco."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 10,
				"E o vale de Sidim estava cheio de poços de betume; e fugiram os reis de Sodoma e de Gomorra, e caíram ali; e os restantes fugiram para um monte."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 11,
				"E tomaram todos os bens de Sodoma, e de Gomorra, e todo o seu mantimento e foram-se."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 12,
				"Também tomaram a Ló, que habitava em Sodoma, filho do irmão de Abrão, e os seus bens, e foram-se."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 13,
				"Então veio um, que escapara, e o contou a Abrão, o hebreu; ele habitava junto dos carvalhais de Manre, o amorreu, irmão de Escol, e irmão de Aner; eles eram confederados de Abrão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 14,
				"Ouvindo, pois, Abrão que o seu irmão estava preso, armou os seus criados, nascidos em sua casa, trezentos e dezoito, e os perseguiu até Dã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 15,
				"E dividiu-se contra eles de noite, ele e os seus criados, e os feriu, e os perseguiu até Hobá, que fica à esquerda de Damasco."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 16,
				"E tornou a trazer todos os seus bens, e tornou a trazer também a Ló, seu irmão, e os seus bens, e também as mulheres, e o povo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 17,
				"E o rei de Sodoma saiu-lhe ao encontro (depois que voltou de ferir a Quedorlaomer e aos reis que estavam com ele) até ao Vale de Savé, que é o vale do rei."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 18,
				"E Melquisedeque, rei de Salém, trouxe pão e vinho; e era este sacerdote do Deus Altíssimo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 19,
				"E abençoou-o, e disse: Bendito seja Abrão pelo Deus Altíssimo, o Possuidor dos céus e da terra;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 20,
				"E bendito seja o Deus Altíssimo, que entregou os teus inimigos nas tuas mãos. E Abrão deu-lhe o dízimo de tudo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 21,
				"E o rei de Sodoma disse a Abrão: Dá-me a mim as pessoas, e os bens toma para ti."));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 22,
				"Abrão, porém, disse ao rei de Sodoma: Levantei minha mão ao SENHOR, o Deus Altíssimo, o Possuidor dos céus e da terra,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 23,
				"Jurando que desde um fio até à correia de um sapato, não tomarei coisa alguma de tudo o que é teu; para que não digas: Eu enriqueci a Abrão;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 14, 24,
				"Salvo tão-somente o que os jovens comeram, e a parte que toca aos homens que comigo foram, Aner, Escol e Manre; estes que tomem a sua parte."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 1,
				"DEPOIS destas coisas veio a palavra do SENHOR a Abrão em visão, dizendo: Não temas, Abrão, eu sou o teu escudo, o teu grandíssimo galardão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 2,
				"Então disse Abrão: Senhor DEUS, que me hás de dar, pois ando sem filhos, e o mordomo da minha casa é o damasceno Eliézer?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 3,
				"Disse mais Abrão: Eis que não me tens dado filhos, e eis que um nascido na minha casa será o meu herdeiro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 4,
				"E eis que veio a palavra do SENHOR a ele dizendo: Este não será o teu herdeiro; mas aquele que de tuas entranhas sair, este será o teu herdeiro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 5,
				"Então o levou fora, e disse: Olha agora para os céus, e conta as estrelas, se as podes contar. E disse-lhe: Assim será a tua descendência."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 6, "E creu ele no SENHOR, e imputou-lhe isto por justiça."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 7,
				"Disse-lhe mais: Eu sou o SENHOR, que te tirei de Ur dos caldeus, para dar-te a ti esta terra, para herdá-la."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 8, "E disse ele: Senhor DEUS, como saberei que hei de herdá-la?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 9,
				"E disse-lhe: Toma-me uma bezerra de três anos, e uma cabra de três anos, e um carneiro de três anos, uma rola e um pombinho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 10,
				"E trouxe-lhe todos estes, e partiu-os pelo meio, e pôs cada parte deles em frente da outra; mas as aves não partiu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 11,
				"E as aves desciam sobre os cadáveres; Abrão, porém, as enxotava."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 12,
				"E pondo-se o sol, um profundo sono caiu sobre Abrão; e eis que grande espanto e grande escuridão caiu sobre ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 13,
				"Então disse a Abrão: Sabes, de certo, que peregrina será a tua descendência em terra alheia, e será reduzida à escravidão, e será afligida por quatrocentos anos,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 14,
				"Mas também eu julgarei a nação, à qual ela tem de servir, e depois sairá com grande riqueza."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 15, 15, "E tu irás a teus pais em paz; em boa velhice serás sepultado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 16,
				"E a quarta geração tornará para cá; porque a medida da injustiça dos amorreus não está ainda cheia."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 17,
				"E sucedeu que, posto o sol, houve escuridão, e eis um forno de fumaça, e uma tocha de fogo, que passou por aquelas metades."));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 18,
				"Naquele mesmo dia fez o SENHOR uma aliança com Abrão, dizendo: À tua descendência tenho dado esta terra, desde o rio do Egito até ao grande rio Eufrates;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 19, "E o queneu, e o quenezeu, e o cadmoneu,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 20, "E o heteu, e o perizeu, e os refains,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 15, 21, "E o amorreu, e o cananeu, e o girgaseu, e o jebuseu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 1,
				"ORA Sarai, mulher de Abrão, não lhe dava filhos, e ele tinha uma serva egípcia, cujo nome era Agar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 2,
				"E disse Sarai a Abrão: Eis que o SENHOR me tem impedido de dar à luz; toma, pois, a minha serva; porventura terei filhos dela. E ouviu Abrão a voz de Sarai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 3,
				"Assim tomou Sarai, mulher de Abrão, a Agar egípcia, sua serva, e deu-a por mulher a Abrão seu marido, ao fim de dez anos que Abrão habitara na terra de Canaã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 4,
				"E ele possuiu a Agar, e ela concebeu; e vendo ela que concebera, foi sua senhora desprezada aos seus olhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 5,
				"Então disse Sarai a Abrão: Meu agravo seja sobre ti; minha serva pus eu em teu regaço; vendo ela agora que concebeu, sou menosprezada aos seus olhos; o SENHOR julgue entre mim e ti."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 6,
				"E disse Abrão a Sarai: Eis que tua serva está na tua mão; faze-lhe o que bom é aos teus olhos. E afligiu-a Sarai, e ela fugiu de sua face."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 7,
				"E o anjo do SENHOR a achou junto a uma fonte de água no deserto, junto à fonte no caminho de Sur."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 8,
				"E disse: Agar, serva de Sarai, donde vens, e para onde vais? E ela disse: Venho fugida da face de Sarai minha senhora."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 9,
				"Então lhe disse o anjo do SENHOR: Torna-te para tua senhora, e humilha-te debaixo de suas mãos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 10,
				"Disse-lhe mais o anjo do SENHOR: Multiplicarei sobremaneira a tua descendência, que não será contada, por numerosa que será."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 11,
				"Disse-lhe também o anjo do SENHOR: Eis que concebeste, e darás à luz um filho, e chamarás o seu nome Ismael; porquanto o SENHOR ouviu a tua aflição."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 12,
				"E ele será homem feroz, e a sua mão será contra todos, e a mão de todos contra ele; e habitará diante da face de todos os seus irmãos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 13,
				"E ela chamou o nome do SENHOR, que com ela falava: Tu és Deus que me vê; porque disse: Não olhei eu também para aquele que me vê?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 14,
				"Por isso se chama aquele poço de Beer-Laai-Rói; eis que está entre Cades e Berede."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 15,
				"E Agar deu à luz um filho a Abrão; e Abrão chamou o nome do seu filho que Agar tivera, Ismael."));
		verses.add(new Verse(null, 1l, 1l, 1l, 16, 16,
				"E era Abrão da idade de oitenta e seis anos, quando Agar deu à luz Ismael."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 1,
				"SENDO, pois, Abrão da idade de noventa e nove anos, apareceu o SENHOR a Abrão, e disse-lhe: Eu sou o Deus Todo-Poderoso, anda em minha presença e sê perfeito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 2,
				"E porei a minha aliança entre mim e ti, e te multiplicarei grandissimamente."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 3,
				"Então caiu Abrão sobre o seu rosto, e falou Deus com ele, dizendo:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 4,
				"Quanto a mim, eis a minha aliança contigo: serás o pai de muitas nações;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 5,
				"E não se chamará mais o teu nome Abrão, mas Abraão será o teu nome; porque por pai de muitas nações te tenho posto;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 6,
				"E te farei frutificar grandissimamente, e de ti farei nações, e reis sairão de ti;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 7,
				"E estabelecerei a minha aliança entre mim e ti e a tua descendência depois de ti em suas gerações, por aliança perpétua, para te ser a ti por Deus, e à tua descendência depois de ti."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 8,
				"E te darei a ti e à tua descendência depois de ti, a terra de tuas peregrinações, toda a terra de Canaã em perpétua possessão e ser-lhes-ei o seu Deus."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 9,
				"Disse mais Deus a Abraão: Tu, porém, guardarás a minha aliança, tu, e a tua descendência depois de ti, nas suas gerações."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 10,
				"Esta é a minha aliança, que guardareis entre mim e vós, e a tua descendência depois de ti: Que todo o homem entre vós será circuncidado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 11,
				"E circuncidareis a carne do vosso prepúcio; e isto será por sinal da aliança entre mim e vós."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 12,
				"O filho de oito dias, pois, será circuncidado, todo o homem nas vossas gerações; o nascido na casa, e o comprado por dinheiro a qualquer estrangeiro, que não for da tua descendência."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 13,
				"Com efeito será circuncidado o nascido em tua casa, e o comprado por teu dinheiro; e estará a minha aliança na vossa carne por aliança perpétua."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 14,
				"E o homem incircunciso, cuja carne do prepúcio não estiver circuncidada, aquela alma será extirpada do seu povo; quebrou a minha aliança."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 15,
				"Disse Deus mais a Abraão: A Sarai tua mulher não chamarás mais pelo nome de Sarai, mas Sara será o seu nome."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 16,
				"Porque eu a hei de abençoar, e te darei dela um filho; e a abençoarei, e será mãe das nações; reis de povos sairão dela."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 17,
				"Então caiu Abraão sobre o seu rosto, e riu-se, e disse no seu coração: A um homem de cem anos há de nascer um filho? E dará à luz Sara da idade de noventa anos?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 18,
				"E disse Abraão a Deus: Quem dera que viva Ismael diante de teu rosto!"));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 19,
				"E disse Deus: Na verdade, Sara, tua mulher, te dará um filho, e chamarás o seu nome Isaque, e com ele estabelecerei a minha aliança, por aliança perpétua para a sua descendência depois dele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 20,
				"E quanto a Ismael, também te tenho ouvido; eis aqui o tenho abençoado, e fá-lo-ei frutificar, e fá-lo-ei multiplicar grandissimamente; doze príncipes gerará, e dele farei uma grande nação."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 21,
				"A minha aliança, porém, estabelecerei com Isaque, o qual Sara dará à luz neste tempo determinado, no ano seguinte."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 22, "Ao acabar de falar com Abraão, subiu Deus de diante dele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 23,
				"Então tomou Abraão a seu filho Ismael, e a todos os nascidos na sua casa, e a todos os comprados por seu dinheiro, todo o homem entre os da casa de Abraão; e circuncidou a carne do seu prepúcio, naquele mesmo dia, como Deus falara com ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 24,
				"E era Abraão da idade de noventa e nove anos, quando lhe foi circuncidada a carne do seu prepúcio."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 25,
				"E Ismael, seu filho, era da idade de treze anos, quando lhe foi circuncidada a carne do seu prepúcio."));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 26,
				"Naquele mesmo dia foram circuncidados Abraão e Ismael seu filho,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 17, 27,
				"E todos os homens da sua casa, os nascidos em casa, e os comprados por dinheiro ao estrangeiro, foram circuncidados com ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 1,
				"DEPOIS apareceu-lhe o SENHOR nos carvalhais de Manre, estando ele assentado à porta da tenda, no calor do dia."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 2,
				"E levantou os seus olhos, e olhou, e eis três homens em pé junto a ele. E vendo-os, correu da porta da tenda ao seu encontro e inclinou-se à terra,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 3,
				"E disse: Meu Senhor, se agora tenho achado graça aos teus olhos, rogo-te que não passes de teu servo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 4,
				"Que se traga já um pouco de água, e lavai os vossos pés, e recostai-vos debaixo desta árvore;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 5,
				"E trarei um bocado de pão, para que esforceis o vosso coração; depois passareis adiante, porquanto por isso chegastes até vosso servo. E disseram: Assim faze como disseste."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 6,
				"E Abraão apressou-se em ir ter com Sara à tenda, e disse-lhe: Amassa depressa três medidas de flor de farinha, e faze bolos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 7,
				"E correu Abraão às vacas, e tomou uma vitela tenra e boa, e deu-a ao moço, que se apressou em prepará-la."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 8,
				"E tomou manteiga e leite, e a vitela que tinha preparado, e pôs tudo diante deles, e ele estava em pé junto a eles debaixo da árvore; e comeram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 9,
				"E disseram-lhe: Onde está Sara, tua mulher? E ele disse: Ei-la aí na tenda."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 10,
				"E disse: Certamente tornarei a ti por este tempo da vida; e eis que Sara tua mulher terá um filho. E Sara escutava à porta da tenda, que estava atrás dele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 11,
				"E eram Abraão e Sara já velhos, e adiantados em idade; já a Sara havia cessado o costume das mulheres."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 12,
				"Assim, pois, riu-se Sara consigo, dizendo: Terei ainda deleite depois de haver envelhecido, sendo também o meu senhor já velho?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 13,
				"E disse o SENHOR a Abraão: Por que se riu Sara, dizendo: Na verdade darei eu à luz ainda, havendo já envelhecido?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 14,
				"Haveria coisa alguma difícil ao SENHOR? Ao tempo determinado tornarei a ti por este tempo da vida, e Sara terá um filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 15,
				"E Sara negou, dizendo: Não me ri; porquanto temeu. E ele disse: Não digas isso, porque te riste."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 16,
				"E levantaram-se aqueles homens dali, e olharam para o lado de Sodoma; e Abraão ia com eles, acompanhando-os."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 17, "E disse o SENHOR: Ocultarei eu a Abraão o que faço,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 18,
				"Visto que Abraão certamente virá a ser uma grande e poderosa nação, e nele serão benditas todas as nações da terra?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 19,
				"Porque eu o tenho conhecido, e sei que ele há de ordenar a seus filhos e à sua casa depois dele, para que guardem o caminho do SENHOR, para agir com justiça e juízo; para que o SENHOR faça vir sobre Abraão o que acerca dele tem falado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 20,
				"Disse mais o SENHOR: Porquanto o clamor de Sodoma e Gomorra se tem multiplicado, e porquanto o seu pecado se tem agravado muito,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 21,
				"Descerei agora, e verei se com efeito têm praticado segundo o seu clamor, que é vindo até mim; e se não, sabê-lo-ei."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 22,
				"Então viraram aqueles homens os rostos dali, e foram-se para Sodoma; mas Abraão ficou ainda em pé diante da face do SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 23,
				"E chegou-se Abraão, dizendo: Destruirás também o justo com o ímpio?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 24,
				"Se porventura houver cinqüenta justos na cidade, destruirás também, e não pouparás o lugar por causa dos cinqüenta justos que estão dentro dela?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 25,
				"Longe de ti que faças tal coisa, que mates o justo com o ímpio; que o justo seja como o ímpio, longe de ti. Não faria justiça o Juiz de toda a terra?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 26,
				"Então disse o SENHOR: Se eu em Sodoma achar cinqüenta justos dentro da cidade, pouparei a todo o lugar por amor deles."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 27,
				"E respondeu Abraão dizendo: Eis que agora me atrevi a falar ao Senhor, ainda que sou pó e cinza."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 28,
				"Se porventura de cinqüenta justos faltarem cinco, destruirás por aqueles cinco toda a cidade? E disse: Não a destruirei, se eu achar ali quarenta e cinco."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 29,
				"E continuou ainda a falar-lhe, e disse: Se porventura se acharem ali quarenta? E disse: Não o farei por amor dos quarenta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 30,
				"Disse mais: Ora, não se ire o Senhor, se eu ainda falar: Se porventura se acharem ali trinta? E disse: Não o farei se achar ali trinta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 31,
				"E disse: Eis que agora me atrevi a falar ao Senhor: Se porventura se acharem ali vinte? E disse: Não a destruirei por amor dos vinte."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 32,
				"Disse mais: Ora, não se ire o Senhor, que ainda só mais esta vez falo: Se porventura se acharem ali dez? E disse: Não a destruirei por amor dos dez."));
		verses.add(new Verse(null, 1l, 1l, 1l, 18, 33,
				"E retirou-se o SENHOR, quando acabou de falar a Abraão; e Abraão tornou-se ao seu lugar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 1,
				"E VIERAM os dois anjos a Sodoma à tarde, e estava Ló assentado à porta de Sodoma; e vendo-os Ló, levantou-se ao seu encontro e inclinou-se com o rosto à terra;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 2,
				"E disse: Eis agora, meus senhores, entrai, peço-vos, em casa de vosso servo, e passai nela a noite, e lavai os vossos pés; e de madrugada vos levantareis e ireis vosso caminho. E eles disseram: Não, antes na rua passaremos a noite."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 3,
				"E porfiou com eles muito, e vieram com ele, e entraram em sua casa; e fez-lhes banquete, e cozeu bolos sem levedura, e comeram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 4,
				"E antes que se deitassem, cercaram a casa, os homens daquela cidade, os homens de Sodoma, desde o moço até ao velho; todo o povo de todos os bairros."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 5,
				"E chamaram a Ló, e disseram-lhe: Onde estão os homens que a ti vieram nesta noite? Traze-os fora a nós, para que os conheçamos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 6, "Então saiu Ló a eles à porta, e fechou a porta atrás de si,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 7, "E disse: Meus irmãos, rogo-vos que não façais mal;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 8,
				"Eis aqui, duas filhas tenho, que ainda não conheceram homens; fora vo-las trarei, e fareis delas como bom for aos vossos olhos; somente nada façais a estes homens, porque por isso vieram à sombra do meu telhado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 9,
				"Eles, porém, disseram: Sai daí. Disseram mais: Como estrangeiro este indivíduo veio aqui habitar, e quereria ser juiz em tudo? Agora te faremos mais mal a ti do que a eles. E arremessaram-se sobre o homem, sobre Ló, e aproximaram-se para arrombar a porta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 10,
				"Aqueles homens porém estenderam as suas mãos e fizeram entrar a Ló consigo na casa, e fecharam a porta;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 11,
				"E feriram de cegueira os homens que estavam à porta da casa, desde o menor até ao maior, de maneira que se cansaram para achar a porta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 12,
				"Então disseram aqueles homens a Ló: Tens alguém mais aqui? Teu genro, e teus filhos, e tuas filhas, e todos quantos tens nesta cidade, tira-os fora deste lugar;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 13,
				"Porque nós vamos destruir este lugar, porque o seu clamor tem aumentado diante da face do SENHOR, e o SENHOR nos enviou a destruí-lo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 14,
				"Então saiu Ló, e falou a seus genros, aos que haviam de tomar as suas filhas, e disse: Levantai-vos, saí deste lugar, porque o SENHOR há de destruir a cidade. Foi tido porém por zombador aos olhos de seus genros."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 15,
				"E ao amanhecer os anjos apertaram com Ló, dizendo: Levanta-te, toma tua mulher e tuas duas filhas que aqui estão, para que não pereças na injustiça desta cidade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 16,
				"Ele, porém, demorava-se, e aqueles homens lhe pegaram pela mão, e pela mão de sua mulher e de suas duas filhas, sendo-lhe o SENHOR misericordioso, e tiraram-no, e puseram-no fora da cidade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 17,
				"E aconteceu que, tirando-os fora, disse: Escapa-te por tua vida; não olhes para trás de ti, e não pares em toda esta campina; escapa lá para o monte, para que não pereças."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 18, "E Ló disse-lhe: Ora, não, meu Senhor!"));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 19,
				"Eis que agora o teu servo tem achado graça aos teus olhos, e engrandeceste a tua misericórdia que a mim me fizeste, para guardar a minha alma em vida; mas eu não posso escapar no monte, para que porventura não me apanhe este mal, e eu morra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 20,
				"Eis que agora aquela cidade está perto, para fugir para lá, e é pequena; ora, deixe-me escapar para lá (não é pequena?), para que minha alma viva."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 21,
				"E disse-lhe: Eis aqui, tenho-te aceitado também neste negócio, para não destruir aquela cidade, de que falaste;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 22,
				"Apressa-te, escapa-te para ali; porque nada poderei fazer, enquanto não tiveres ali chegado. Por isso se chamou o nome da cidade Zoar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 23, "Saiu o sol sobre a terra, quando Ló entrou em Zoar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 24,
				"Então o SENHOR fez chover enxofre e fogo, do SENHOR desde os céus, sobre Sodoma e Gomorra;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 25,
				"E destruiu aquelas cidades e toda aquela campina, e todos os moradores daquelas cidades, e o que nascia da terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 26,
				"E a mulher de Ló olhou para trás e ficou convertida numa estátua de sal."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 27,
				"E Abraão levantou-se aquela mesma manhã, de madrugada, e foi para aquele lugar onde estivera diante da face do SENHOR;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 28,
				"E olhou para Sodoma e Gomorra e para toda a terra da campina; e viu, que a fumaça da terra subia, como a de uma fornalha."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 29,
				"E aconteceu que, destruindo Deus as cidades da campina, lembrou-se Deus de Abraão, e tirou a Ló do meio da destruição, derrubando aquelas cidades em que Ló habitara."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 30,
				"E subiu Ló de Zoar, e habitou no monte, e as suas duas filhas com ele; porque temia habitar em Zoar; e habitou numa caverna, ele e as suas duas filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 31,
				"Então a primogênita disse à menor: Nosso pai já é velho, e não há homem na terra que entre a nós, segundo o costume de toda a terra;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 32,
				"Vem, demos de beber vinho a nosso pai, e deitemo-nos com ele, para que em vida conservemos a descendência de nosso pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 33,
				"E deram de beber vinho a seu pai naquela noite; e veio a primogênita e deitou-se com seu pai, e não sentiu ele quando ela se deitou, nem quando se levantou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 34,
				"E sucedeu, no outro dia, que a primogênita disse à menor: Vês aqui, eu já ontem à noite me deitei com meu pai; demos-lhe de beber vinho também esta noite, e então entra tu, deita-te com ele, para que em vida conservemos a descendência de nosso pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 35,
				"E deram de beber vinho a seu pai também naquela noite; e levantou-se a menor, e deitou-se com ele; e não sentiu ele quando ela se deitou, nem quando se levantou. 36 E conceberam as duas filhas de Ló de seu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 36, "Verszeile ohne Text"));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 37,
				"E a primogênita deu à luz um filho, e chamou-lhe Moabe; este é o pai dos moabitas até ao dia de hoje."));
		verses.add(new Verse(null, 1l, 1l, 1l, 19, 38,
				"E a menor também deu à luz um filho, e chamou-lhe Ben-Ami; este é o pai dos filhos de Amom até o dia de hoje."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 1,
				"E PARTIU Abraão dali para a terra do sul, e habitou entre Cades e Sur; e peregrinou em Gerar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 2,
				"E havendo Abraão dito de Sara, sua mulher: É minha irmã; enviou Abimeleque, rei de Gerar, e tomou a Sara."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 3,
				"Deus, porém, veio a Abimeleque em sonhos de noite, e disse-lhe: Eis que morto serás por causa da mulher que tomaste; porque ela tem marido."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 4,
				"Mas Abimeleque ainda não se tinha chegado a ela; por isso disse: Senhor, matarás também uma nação justa?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 5,
				"Não me disse ele mesmo: É minha irmã? E ela também disse: É meu irmão. Em sinceridade do coração e em pureza das minhas mãos tenho feito isto."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 6,
				"E disse-lhe Deus em sonhos: Bem sei eu que na sinceridade do teu coração fizeste isto; e também eu te tenho impedido de pecar contra mim; por isso não te permiti tocá-la."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 7,
				"Agora, pois, restitui a mulher ao seu marido, porque profeta é, e rogará por ti, para que vivas; porém se não lha restituíres, sabe que certamente morrerás, tu e tudo o que é teu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 8,
				"E levantou-se Abimeleque pela manhã de madrugada, chamou a todos os seus servos, e falou todas estas palavras em seus ouvidos; e temeram muito aqueles homens."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 9,
				"Então chamou Abimeleque a Abraão e disse-lhe: Que nos fizeste? E em que pequei contra ti, para trazeres sobre o meu reino tamanho pecado? Tu me fizeste aquilo que não deverias ter feito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 10,
				"Disse mais Abimeleque a Abraão: Que tens visto, para fazer tal coisa?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 11,
				"E disse Abraão: Porque eu dizia comigo: Certamente não há temor de Deus neste lugar, e eles me matarão por causa da minha mulher."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 12,
				"E, na verdade, é ela também minha irmã, filha de meu pai, mas não filha da minha mãe; e veio a ser minha mulher;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 13,
				"E aconteceu que, fazendo-me Deus sair errante da casa de meu pai, eu lhe disse: Seja esta a graça que me farás em todo o lugar aonde chegarmos, dize de mim: É meu irmão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 14,
				"Então tomou Abimeleque ovelhas e vacas, e servos e servas, e os deu a Abraão; e restituiu-lhe Sara, sua mulher."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 15,
				"E disse Abimeleque: Eis que a minha terra está diante da tua face; habita onde for bom aos teus olhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 16,
				"E a Sara disse: Vês que tenho dado ao teu irmão mil moedas de prata; eis que ele te seja por véu dos olhos para com todos os que contigo estão, e até para com todos os outros; e estás advertida."));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 17,
				"E orou Abraão a Deus, e sarou Deus a Abimeleque, e à sua mulher, e às suas servas, de maneira que tiveram filhos;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 20, 18,
				"Porque o SENHOR havia fechado totalmente todas as madres da casa de Abimeleque, por causa de Sara, mulher de Abraão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 1,
				"E O SENHOR visitou a Sara, como tinha dito; e fez o SENHOR a Sara como tinha prometido."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 2,
				"E concebeu Sara, e deu a Abraão um filho na sua velhice, ao tempo determinado, que Deus lhe tinha falado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 3,
				"E Abraão pôs no filho que lhe nascera, que Sara lhe dera, o nome de Isaque."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 4,
				"E Abraão circuncidou o seu filho Isaque, quando era da idade de oito dias, como Deus lhe tinha ordenado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 5,
				"E era Abraão da idade de cem anos, quando lhe nasceu Isaque seu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 6,
				"E disse Sara: Deus me tem feito riso; todo aquele que o ouvir se rirá comigo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 7,
				"Disse mais: Quem diria a Abraão que Sara daria de mamar a filhos? Pois lhe dei um filho na sua velhice."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 8,
				"E cresceu o menino, e foi desmamado; então Abraão fez um grande banquete no dia em que Isaque foi desmamado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 9,
				"E viu Sara que o filho de Agar, a egípcia, o qual tinha dado a Abraão, zombava."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 10,
				"E disse a Abraão: Ponha fora esta serva e o seu filho; porque o filho desta serva não herdará com Isaque, meu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 11,
				"E pareceu esta palavra muito má aos olhos de Abraão, por causa de seu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 12,
				"Porém Deus disse a Abraão: Não te pareça mal aos teus olhos acerca do moço e acerca da tua serva; em tudo o que Sara te diz, ouve a sua voz; porque em Isaque será chamada a tua descendência."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 13,
				"Mas também do filho desta serva farei uma nação, porquanto é tua descendência."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 14,
				"Então se levantou Abraão pela manhã de madrugada, e tomou pão e um odre de água e os deu a Agar, pondo-os sobre o seu ombro; também lhe deu o menino e despediu-a; e ela partiu, andando errante no deserto de Berseba."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 15,
				"E consumida a água do odre, lançou o menino debaixo de uma das árvores."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 16,
				"E foi assentar-se em frente, afastando-se à distância de um tiro de arco; porque dizia: Que eu não veja morrer o menino. E assentou-se em frente, e levantou a sua voz, e chorou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 17,
				"E ouviu Deus a voz do menino, e bradou o anjo de Deus a Agar desde os céus, e disse-lhe: Que tens, Agar? Não temas, porque Deus ouviu a voz do menino desde o lugar onde está."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 18,
				"Ergue-te, levanta o menino e pega-lhe pela mão, porque dele farei uma grande nação."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 19,
				"E abriu-lhe Deus os olhos, e viu um poço de água; e foi encher o odre de água, e deu de beber ao menino."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 20,
				"E era Deus com o menino, que cresceu; e habitou no deserto, e foi flecheiro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 21,
				"E habitou no deserto de Parã; e sua mãe tomou-lhe mulher da terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 22,
				"E aconteceu naquele mesmo tempo que Abimeleque, com Ficol, príncipe do seu exército, falou com Abraão, dizendo: Deus é contigo em tudo o que fazes;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 23,
				"Agora, pois, jura-me aqui por Deus, que não mentirás a mim, nem a meu filho, nem a meu neto; segundo a beneficência que te fiz, me farás a mim, e à terra onde peregrinaste."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 24, "E disse Abraão: Eu jurarei."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 25,
				"Abraão, porém, repreendeu a Abimeleque por causa de um poço de água, que os servos de Abimeleque haviam tomado à força."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 26,
				"Então disse Abimeleque: Eu não sei quem fez isto; e também tu não mo fizeste saber, nem eu o ouvi senão hoje."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 27,
				"E tomou Abraão ovelhas e vacas, e deu-as a Abimeleque; e fizeram ambos uma aliança."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 28, "Pôs Abraão, porém, à parte sete cordeiras do rebanho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 29,
				"E Abimeleque disse a Abraão: Para que estão aqui estas sete cordeiras, que puseste à parte?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 30,
				"E disse: Tomarás estas sete cordeiras de minha mão, para que sejam em testemunho que eu cavei este poço."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 31,
				"Por isso se chamou aquele lugar Berseba, porquanto ambos juraram ali."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 32,
				"Assim fizeram aliança em Berseba. Depois se levantou Abimeleque e Ficol, príncipe do seu exército, e tornaram-se para a terra dos filisteus."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 33,
				"E plantou um bosque em Berseba, e invocou lá o nome do SENHOR, Deus eterno."));
		verses.add(new Verse(null, 1l, 1l, 1l, 21, 34, "E peregrinou Abraão na terra dos filisteus muitos dias."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 1,
				"E ACONTECEU depois destas coisas, que provou Deus a Abraão, e disse-lhe: Abraão! E ele disse: Eis-me aqui."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 2,
				"E disse: Toma agora o teu filho, o teu único filho, Isaque, a quem amas, e vai-te à terra de Moriá, e oferece-o ali em holocausto sobre uma das montanhas, que eu te direi."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 3,
				"Então se levantou Abraão pela manhã de madrugada, e albardou o seu jumento, e tomou consigo dois de seus moços e Isaque seu filho; e cortou lenha para o holocausto, e levantou-se, e foi ao lugar que Deus lhe dissera."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 4,
				"Ao terceiro dia levantou Abraão os seus olhos, e viu o lugar de longe."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 5,
				"E disse Abraão a seus moços: Ficai-vos aqui com o jumento, e eu e o moço iremos até ali; e havendo adorado, tornaremos a vós."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 6,
				"E tomou Abraão a lenha do holocausto, e pô-la sobre Isaque seu filho; e ele tomou o fogo e o cutelo na sua mão, e foram ambos juntos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 7,
				"Então falou Isaque a Abraão seu pai, e disse: Meu pai! E ele disse: Eis-me aqui, meu filho! E ele disse: Eis aqui o fogo e a lenha, mas onde está o cordeiro para o holocausto?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 8,
				"E disse Abraão: Deus proverá para si o cordeiro para o holocausto, meu filho. Assim caminharam ambos juntos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 9,
				"E chegaram ao lugar que Deus lhe dissera, e edificou Abraão ali um altar e pôs em ordem a lenha, e amarrou a Isaque seu filho, e deitou-o sobre o altar em cima da lenha."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 10,
				"E estendeu Abraão a sua mão, e tomou o cutelo para imolar o seu filho;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 11,
				"Mas o anjo do SENHOR lhe bradou desde os céus, e disse: Abraão, Abraão! E ele disse: Eis-me aqui."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 12,
				"Então disse: Não estendas a tua mão sobre o moço, e não lhe faças nada; porquanto agora sei que temes a Deus, e não me negaste o teu filho, o teu único filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 13,
				"Então levantou Abraão os seus olhos e olhou; e eis um carneiro detrás dele, travado pelos seus chifres, num mato; e foi Abraão, e tomou o carneiro, e ofereceu-o em holocausto, em lugar de seu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 14,
				"E chamou Abraão o nome daquele lugar: O SENHOR PROVERÁ; donde se diz até ao dia de hoje: No monte do SENHOR se proverá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 15,
				"Então o anjo do SENHOR bradou a Abraão pela segunda vez desde os céus,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 16,
				"E disse: Por mim mesmo jurei, diz o SENHOR: Porquanto fizeste esta ação, e não me negaste o teu filho, o teu único filho,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 17,
				"Que deveras te abençoarei, e grandissimamente multiplicarei a tua descendência como as estrelas dos céus, e como a areia que está na praia do mar; e a tua descendência possuirá a porta dos seus inimigos;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 18,
				"E em tua descendência serão benditas todas as nações da terra; porquanto obedeceste à minha voz."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 19,
				"Então Abraão tornou aos seus moços, e levantaram-se, e foram juntos para Berseba; e Abraão habitou em Berseba."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 20,
				"E sucedeu depois destas coisas, que anunciaram a Abraão, dizendo: Eis que também Milca deu filhos a Naor teu irmão."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 22, 21, "Uz o seu primogênito, e Buz seu irmão, e Quemuel, pai de Arã,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 22, "E Quésede, e Hazo, e Pildas, e Jidlafe, e Betuel."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 23,
				"E Betuel gerou Rebeca. Estes oito deu à luz Milca a Naor, irmão de Abraão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 22, 24,
				"E a sua concubina, cujo nome era Reumá, ela lhe deu também a Tebá, Gaã, Taás e Maaca."));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 1,
				"E FOI a vida de Sara cento e vinte e sete anos; estes foram os anos da vida de Sara."));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 2,
				"E morreu Sara em Quiriate-Arba, que é Hebrom, na terra de Canaã; e veio Abraão lamentar Sara e chorar por ela."));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 3,
				"Depois se levantou Abraão de diante de sua morta, e falou aos filhos de Hete, dizendo:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 4,
				"Estrangeiro e peregrino sou entre vós; dai-me possessão de sepultura convosco, para que eu sepulte a minha morta de diante da minha face."));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 5, "E responderam os filhos de Hete a Abraão, dizendo-lhe:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 6,
				"Ouve-nos, meu senhor; príncipe poderoso és no meio de nós; enterra a tua morta na mais escolhida de nossas sepulturas; nenhum de nós te vedará a sua sepultura, para enterrar a tua morta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 7,
				"Então se levantou Abraão, inclinou-se diante do povo da terra, diante dos filhos de Hete,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 8,
				"E falou com eles, dizendo: Se é de vossa vontade que eu sepulte a minha morta de diante de minha face, ouvi-me e falai por mim a Efrom, filho de Zoar,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 9,
				"Que ele me dê a cova de Macpela, que ele tem no fim do seu campo; que ma dê pelo devido preço em herança de sepulcro no meio de vós."));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 10,
				"Ora Efrom habitava no meio dos filhos de Hete; e respondeu Efrom, heteu, a Abraão, aos ouvidos dos filhos de Hete, de todos os que entravam pela porta da sua cidade, dizendo:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 11,
				"Não, meu senhor, ouve-me: O campo te dou, também te dou a cova que nele está, diante dos olhos dos filhos do meu povo ta dou; sepulta a tua morta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 12, "Então Abraão se inclinou diante da face do povo da terra,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 13,
				"E falou a Efrom, aos ouvidos do povo da terra, dizendo: Mas se tu estás por isto, ouve-me, peço-te. O preço do campo o darei; toma-o de mim e sepultarei ali a minha morta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 14, "E respondeu Efrom a Abraão, dizendo-lhe:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 15,
				"Meu senhor, ouve-me, a terra é de quatrocentos siclos de prata; que é isto entre mim e ti? Sepulta a tua morta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 16,
				"E Abraão deu ouvidos a Efrom, e Abraão pesou a Efrom a prata de que tinha falado aos ouvidos dos filhos de Hete, quatrocentos siclos de prata, corrente entre mercadores."));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 17,
				"Assim o campo de Efrom, que estava em Macpela, em frente de Manre, o campo e a cova que nele estava, e todo o arvoredo que no campo havia, que estava em todo o seu contorno ao redor,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 18,
				"Se confirmou a Abraão em possessão diante dos olhos dos filhos de Hete, de todos os que entravam pela porta da cidade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 19,
				"E depois sepultou Abraão a Sara sua mulher na cova do campo de Macpela, em frente de Manre, que é Hebrom, na terra de Canaã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 23, 20,
				"Assim o campo e a cova que nele estava foram confirmados a Abraão, pelos filhos de Hete, em possessão de sepultura."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 1,
				"E ERA Abraão já velho e adiantado em idade, e o SENHOR havia abençoado a Abraão em tudo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 2,
				"E disse Abraão ao seu servo, o mais velho da casa, que tinha o governo sobre tudo o que possuía: Põe agora a tua mão debaixo da minha coxa,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 3,
				"Para que eu te faça jurar pelo SENHOR Deus dos céus e Deus da terra, que não tomarás para meu filho mulher das filhas dos cananeus, no meio dos quais eu habito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 4,
				"Mas que irás à minha terra e à minha parentela, e dali tomarás mulher para meu filho Isaque."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 5,
				"E disse-lhe o servo: Se porventura não quiser seguir-me a mulher a esta terra, farei, pois, tornar o teu filho à terra donde saíste?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 6,
				"E Abraão lhe disse: Guarda-te, que não faças lá tornar o meu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 7,
				"O SENHOR Deus dos céus, que me tomou da casa de meu pai e da terra da minha parentela, e que me falou, e que me jurou, dizendo: À tua descendência darei esta terra; ele enviará o seu anjo adiante da tua face, para que tomes mulher de lá para meu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 8,
				"Se a mulher, porém, não quiser seguir-te, serás livre deste meu juramento; somente não faças lá tornar a meu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 9,
				"Então pôs o servo a sua mão debaixo da coxa de Abraão seu senhor, e jurou-lhe sobre este negócio."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 10,
				"E o servo tomou dez camelos, dos camelos do seu senhor, e partiu, pois que todos os bens de seu senhor estavam em sua mão, e levantou-se e partiu para Mesopotâmia, para a cidade de Naor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 11,
				"E fez ajoelhar os camelos fora da cidade, junto a um poço de água, pela tarde, ao tempo que as moças saíam a tirar água."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 12,
				"E disse: Ó SENHOR, Deus de meu senhor Abraão, dá-me hoje bom encontro, e faze beneficência ao meu senhor Abraão!"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 13,
				"Eis que eu estou em pé junto à fonte de água e as filhas dos homens desta cidade saem para tirar água;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 14,
				"Seja, pois, que a donzela, a quem eu disser: Abaixa agora o teu cântaro para que eu beba; e ela disser: Bebe, e também darei de beber aos teus camelos; esta seja a quem designaste ao teu servo Isaque, e que eu conheça nisso que usaste de benevolência com meu senhor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 15,
				"E sucedeu que, antes que ele acabasse de falar, eis que Rebeca, que havia nascido a Betuel, filho de Milca, mulher de Naor, irmão de Abraão, saía com o seu cântaro sobre o seu ombro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 16,
				"E a donzela era mui formosa à vista, virgem, a quem homem não havia conhecido; e desceu à fonte, e encheu o seu cântaro e subiu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 17,
				"Então o servo correu-lhe ao encontro, e disse: Peço-te, deixa-me beber um pouco de água do teu cântaro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 18,
				"E ela disse: Bebe, meu SENHOR. E apressou-se e abaixou o seu cântaro sobre a sua mão e deu-lhe de beber."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 19,
				"E, acabando ela de lhe dar de beber, disse: Tirarei também água para os teus camelos, até que acabem de beber."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 20,
				"E apressou-se, e despejou o seu cântaro no bebedouro, e correu outra vez ao poço para tirar água, e tirou para todos os seus camelos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 21,
				"E o homem estava admirado de vê-la, calando-se, para saber se o SENHOR havia prosperado a sua jornada ou não."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 22,
				"E aconteceu que, acabando os camelos de beber, tomou o homem um pendente de ouro de meio siclo de peso, e duas pulseiras para as suas mãos, do peso de dez siclos de ouro;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 23,
				"E disse: De quem és filha? Faze-mo saber, peço-te. Há também em casa de teu pai lugar para nós pousarmos?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 24,
				"E ela lhe disse: Eu sou a filha de Betuel, filho de Milca, o qual ela deu a Naor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 25,
				"Disse-lhe mais: Também temos palha e muito pasto, e lugar para passar a noite."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 26, "Então inclinou-se aquele homem e adorou ao SENHOR,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 27,
				"E disse: Bendito seja o SENHOR Deus de meu senhor Abraão, que não retirou a sua benevolência e a sua verdade de meu senhor; quanto a mim, o SENHOR me guiou no caminho à casa dos irmãos de meu senhor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 28,
				"E a donzela correu, e fez saber estas coisas na casa de sua mãe."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 29,
				"E Rebeca tinha um irmão cujo nome era Labão, o qual correu ao encontro daquele homem até a fonte."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 30,
				"E aconteceu que, quando ele viu o pendente, e as pulseiras sobre as mãos de sua irmã, e quando ouviu as palavras de sua irmã Rebeca, que dizia: Assim me falou aquele homem; foi ter com o homem, que estava em pé junto aos camelos, à fonte,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 31,
				"E disse: Entra, bendito do SENHOR; por que estás fora? pois eu já preparei a casa, e o lugar para os camelos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 32,
				"Então veio aquele homem à casa, e desataram os camelos, e deram palha e pasto aos camelos, e água para lavar os pés dele, e os pés dos homens que estavam com ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 33,
				"Depois puseram comida diante dele. Ele, porém, disse: Não comerei, até que tenha dito as minhas palavras. E ele disse: Fala."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 34, "Então disse: Eu sou o servo de Abraão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 35,
				"E o SENHOR abençoou muito o meu senhor, de maneira que foi engrandecido, e deu-lhe ovelhas e vacas, e prata e ouro, e servos e servas, e camelos e jumentos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 36,
				"E Sara, a mulher do meu senhor, deu à luz um filho a meu senhor depois da sua velhice, e ele deu-lhe tudo quanto tem."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 37,
				"E meu senhor me fez jurar, dizendo: Não tomarás mulher para meu filho das filhas dos cananeus, em cuja terra habito;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 38,
				"Irás, porém, à casa de meu pai, e à minha família, e tomarás mulher para meu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 39,
				"Então disse eu ao meu senhor: Porventura não me seguirá a mulher."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 40,
				"E ele me disse: O SENHOR, em cuja presença tenho andado, enviará o seu anjo contigo, e prosperará o teu caminho, para que tomes mulher para meu filho da minha família e da casa de meu pai;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 41,
				"Então serás livre do meu juramento, quando fores à minha família; e se não te derem, livre serás do meu juramento."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 42,
				"E hoje cheguei à fonte, e disse: Ó SENHOR, Deus de meu senhor Abraão, se tu agora prosperas o meu caminho, no qual eu ando,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 43,
				"Eis que estou junto à fonte de água; seja, pois, que a donzela que sair para tirar água e à qual eu disser: Peço-te, dá-me um pouco de água do teu cântaro;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 44,
				"E ela me disser: Bebe tu e também tirarei água para os teus camelos; esta seja a mulher que o SENHOR designou ao filho de meu senhor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 45,
				"E antes que eu acabasse de falar no meu coração, eis que Rebeca saía com o seu cântaro sobre o seu ombro, desceu à fonte e tirou água; e eu lhe disse: Peço-te, dá-me de beber."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 46,
				"E ela se apressou, e abaixou o seu cântaro de sobre si, e disse: Bebe, e também darei de beber aos teus camelos; e bebi, e ela deu também de beber aos camelos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 47,
				"Então lhe perguntei, e disse: De quem és filha? E ela disse: Filha de Betuel, filho de Naor, que lhe deu Milca. Então eu pus o pendente no seu rosto, e as pulseiras sobre as suas mãos;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 48,
				"E inclinando-me adorei ao SENHOR, e bendisse ao SENHOR, Deus do meu senhor Abraão, que me havia encaminhado pelo caminho da verdade, para tomar a filha do irmão de meu senhor para seu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 49,
				"Agora, pois, se vós haveis de fazer benevolência e verdade a meu senhor, fazei-mo saber; e se não, também mo fazei saber, para que eu vá à direita, ou à esquerda."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 50,
				"Então responderam Labão e Betuel, e disseram: Do SENHOR procedeu este negócio; não podemos falar-te mal ou bem."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 51,
				"Eis que Rebeca está diante da tua face; toma-a, e vai-te; seja a mulher do filho de teu senhor, como tem dito o SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 52,
				"E aconteceu que, o servo de Abraão, ouvindo as suas palavras, inclinou-se à terra diante do SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 53,
				"E tirou o servo jóias de prata e jóias de ouro, e vestidos, e deu-os a Rebeca; também deu coisas preciosas a seu irmão e à sua mãe."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 54,
				"Então comeram e beberam, ele e os homens que com ele estavam, e passaram a noite. E levantaram-se pela manhã, e disse: Deixai-me ir a meu senhor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 55,
				"Então disseram seu irmão e sua mãe: Fique a donzela conosco alguns dias, ou pelo menos dez dias, depois irá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 56,
				"Ele, porém, lhes disse: Não me detenhais, pois o SENHOR tem prosperado o meu caminho; deixai-me partir, para que eu volte a meu SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 57, "E disseram: Chamemos a donzela, e perguntemos-lho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 58,
				"E chamaram a Rebeca, e disseram-lhe: Irás tu com este homem? Ela respondeu: Irei."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 59,
				"Então despediram a Rebeca, sua irmã, e sua ama, e o servo de Abraão, e seus homens."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 60,
				"E abençoaram a Rebeca, e disseram-lhe: Ó nossa irmã, sê tu a mãe de milhares de milhares, e que a tua descendência possua a porta de seus aborrecedores!"));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 61,
				"E Rebeca se levantou com as suas moças, e subiram sobre os camelos, e seguiram o homem; e tomou aquele servo a Rebeca, e partiu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 62,
				"Ora, Isaque vinha de onde se vem do poço de Beer-Laai-Rói; porque habitava na terra do sul."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 63,
				"E Isaque saíra a orar no campo, à tarde; e levantou os seus olhos, e olhou, e eis que os camelos vinham."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 64,
				"Rebeca também levantou seus olhos, e viu a Isaque, e desceu do camelo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 65,
				"E disse ao servo: Quem é aquele homem que vem pelo campo ao nosso encontro? E o servo disse: Este é meu SENHOR. Então tomou ela o véu e cobriu-se."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 66, "E o servo contou a Isaque todas as coisas que fizera."));
		verses.add(new Verse(null, 1l, 1l, 1l, 24, 67,
				"E Isaque trouxe-a para a tenda de sua mãe Sara, e tomou a Rebeca, e foi-lhe por mulher, e amou-a. Assim Isaque foi consolado depois da morte de sua mãe."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 1, "E ABRAÃO tomou outra mulher; e o seu nome era Quetura;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 2, "E deu-lhe à luz Zinrã, Jocsã, Medã, Midiã, Jisbaque e Suá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 3,
				"E Jocsã gerou Seba e Dedã; e os filhos de Dedã foram Assurim, Letusim e Leumim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 4,
				"E os filhos de Midiã foram Efá, Efer, Enoque, Abida e Elda. Estes todos foram filhos de Quetura."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 5, "Porém Abraão deu tudo o que tinha a Isaque;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 6,
				"Mas aos filhos das concubinas que Abraão tinha, deu Abraão presentes e, vivendo ele ainda, despediu-os do seu filho Isaque, enviando-os ao oriente, para a terra oriental."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 7,
				"Estes, pois, são os dias dos anos da vida de Abraão, que viveu cento e setenta e cinco anos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 8,
				"E Abraão expirou, morrendo em boa velhice, velho e farto de dias; e foi congregado ao seu povo;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 9,
				"E Isaque e Ismael, seus filhos, sepultaram-no na cova de Macpela, no campo de Efrom, filho de Zoar, heteu, que estava em frente de Manre,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 10,
				"O campo que Abraão comprara aos filhos de Hete. Ali está sepultado Abraão e Sara, sua mulher."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 11,
				"E aconteceu depois da morte de Abraão, que Deus abençoou a Isaque seu filho; e habitava Isaque junto ao poço Beer-Laai-Rói."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 12,
				"Estas, porém, são as gerações de Ismael filho de Abraão, que a serva de Sara, Agar, egípcia, deu a Abraão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 13,
				"E estes são os nomes dos filhos de Ismael, pelos seus nomes, segundo as suas gerações: O primogênito de Ismael era Nebaiote, depois Quedar, Adbeel e Mibsão,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 14, "Misma, Dumá, Massá,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 15, "Hadade, Tema, Jetur, Nafis e Quedemá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 16,
				"Estes são os filhos de Ismael, e estes são os seus nomes pelas suas vilas e pelos seus castelos; doze príncipes segundo as suas famílias."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 17,
				"E estes são os anos da vida de Ismael, cento e trinta e sete anos, e ele expirou e, morrendo, foi congregado ao seu povo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 18,
				"E habitaram desde Havilá até Sur, que está em frente do Egito, como quem vai para a Assíria; e fez o seu assento diante da face de todos os seus irmãos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 19,
				"E estas são as gerações de Isaque, filho de Abraão: Abraão gerou a Isaque;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 20,
				"E era Isaque da idade de quarenta anos, quando tomou por mulher a Rebeca, filha de Betuel, arameu de Padã-Arã, irmã de Labão, arameu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 21,
				"E Isaque orou insistentemente ao SENHOR por sua mulher, porquanto era estéril; e o SENHOR ouviu as suas orações, e Rebeca sua mulher concebeu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 22,
				"E os filhos lutavam dentro dela; então disse: Se assim é, por que sou eu assim? E foi perguntar ao SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 23,
				"E o SENHOR lhe disse: Duas nações há no teu ventre, e dois povos se dividirão das tuas entranhas, e um povo será mais forte do que o outro povo, e o maior servirá ao menor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 24,
				"E cumprindo-se os seus dias para dar à luz, eis gêmeos no seu ventre."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 25,
				"E saiu o primeiro ruivo e todo como um vestido de pêlo; por isso chamaram o seu nome Esaú."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 26,
				"E depois saiu o seu irmão, agarrada sua mão ao calcanhar de Esaú; por isso se chamou o seu nome Jacó. E era Isaque da idade de sessenta anos quando os gerou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 27,
				"E cresceram os meninos, e Esaú foi homem perito na caça, homem do campo; mas Jacó era homem simples, habitando em tendas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 28,
				"E amava Isaque a Esaú, porque a caça era de seu gosto, mas Rebeca amava a Jacó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 29,
				"E Jacó cozera um guisado; e veio Esaú do campo, e estava ele cansado;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 30,
				"E disse Esaú a Jacó: Deixa-me, peço-te, comer desse guisado vermelho, porque estou cansado. Por isso se chamou Edom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 31, "Então disse Jacó: Vende-me hoje a tua primogenitura."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 32,
				"E disse Esaú: Eis que estou a ponto de morrer; para que me servirá a primogenitura?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 33,
				"Então disse Jacó: Jura-me hoje. E jurou-lhe e vendeu a sua primogenitura a Jacó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 25, 34,
				"E Jacó deu pão a Esaú e o guisado de lentilhas; e ele comeu, e bebeu, e levantou-se, e saiu. Assim desprezou Esaú a sua primogenitura."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 1,
				"E HAVIA fome na terra, além da primeira fome, que foi nos dias de Abraão; por isso foi Isaque a Abimeleque, rei dos filisteus, em Gerar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 2,
				"E apareceu-lhe o SENHOR, e disse: Não desças ao Egito; habita na terra que eu te disser;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 3,
				"Peregrina nesta terra, e serei contigo, e te abençoarei; porque a ti e à tua descendência darei todas estas terras, e confirmarei o juramento que tenho jurado a Abraão teu pai;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 4,
				"E multiplicarei a tua descendência como as estrelas dos céus, e darei à tua descendência todas estas terras; e por meio dela serão benditas todas as nações da terra;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 5,
				"Porquanto Abraão obedeceu à minha voz, e guardou o meu mandado, os meus preceitos, os meus estatutos, e as minhas leis."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 6, "Assim habitou Isaque em Gerar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 7,
				"E perguntando-lhe os homens daquele lugar acerca de sua mulher, disse: É minha irmã; porque temia dizer: É minha mulher; para que porventura (dizia ele) não me matem os homens daquele lugar por amor de Rebeca; porque era formosa à vista."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 8,
				"E aconteceu que, como ele esteve ali muito tempo, Abimeleque, rei dos filisteus, olhou por uma janela, e viu, e eis que Isaque estava brincando com Rebeca sua mulher."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 9,
				"Então chamou Abimeleque a Isaque, e disse: Eis que na verdade é tua mulher; como pois disseste: É minha irmã? E disse-lhe Isaque: Porque eu dizia: Para que eu porventura não morra por causa dela."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 10,
				"E disse Abimeleque: Que é isto que nos fizeste? Facilmente se teria deitado alguém deste povo com a tua mulher, e tu terias trazido sobre nós um delito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 11,
				"E mandou Abimeleque a todo o povo, dizendo: Qualquer que tocar neste homem ou em sua mulher, certamente morrerá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 12,
				"E semeou Isaque naquela mesma terra, e colheu naquele mesmo ano cem medidas, porque o SENHOR o abençoava."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 13,
				"E engrandeceu-se o homem, e ia enriquecendo-se, até que se tornou mui poderoso."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 14,
				"E tinha possessão de ovelhas, e possessão de vacas, e muita gente de serviço, de maneira que os filisteus o invejavam."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 15,
				"E todos os poços, que os servos de seu pai tinham cavado nos dias de seu pai Abraão, os filisteus entulharam e encheram de terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 16,
				"Disse também Abimeleque a Isaque: Aparta-te de nós; porque muito mais poderoso te tens feito do que nós."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 17,
				"Então Isaque partiu dali e fez o seu acampamento no vale de Gerar, e habitou lá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 18,
				"E tornou Isaque e cavou os poços de água que cavaram nos dias de Abraão seu pai, e que os filisteus entulharam depois da morte de Abraão, e chamou-os pelos nomes que os chamara seu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 19,
				"Cavaram, pois, os servos de Isaque naquele vale, e acharam ali um poço de águas vivas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 20,
				"E os pastores de Gerar porfiaram com os pastores de Isaque, dizendo: Esta água é nossa. Por isso chamou aquele poço Eseque, porque contenderam com ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 21,
				"Então cavaram outro poço, e também porfiaram sobre ele; por isso chamou-o Sitna."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 22,
				"E partiu dali, e cavou outro poço, e não porfiaram sobre ele; por isso chamou-o Reobote, e disse: Porque agora nos alargou o SENHOR, e crescemos nesta terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 23, "Depois subiu dali a Berseba."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 24,
				"E apareceu-lhe o SENHOR naquela mesma noite, e disse: Eu sou o Deus de Abraão teu pai; não temas, porque eu sou contigo, e abençoar-te-ei, e multiplicarei a tua descendência por amor de Abraão meu servo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 25,
				"Então edificou ali um altar, e invocou o nome do SENHOR, e armou ali a sua tenda; e os servos de Isaque cavaram ali um poço."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 26,
				"E Abimeleque veio a ele de Gerar, com Auzate seu amigo, e Ficol, príncipe do seu exército."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 27,
				"E disse-lhes Isaque: Por que viestes a mim, pois que vós me odiais e me repelistes de vós?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 28,
				"E eles disseram: Havemos visto, na verdade, que o SENHOR é contigo, por isso dissemos: Haja agora juramento entre nós, entre nós e ti; e façamos aliança contigo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 29,
				"Que não nos faças mal, como nós te não temos tocado, e como te fizemos somente bem, e te deixamos ir em paz. Agora tu és o bendito do SENHOR."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 30, "Então lhes fez um banquete, e comeram e beberam;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 31,
				"E levantaram-se de madrugada e juraram um ao outro; depois os despediu Isaque, e despediram-se dele em paz."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 32,
				"E aconteceu, naquele mesmo dia, que vieram os servos de Isaque, e anunciaram-lhe acerca do negócio do poço, que tinham cavado; e disseram-lhe: Temos achado água."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 33,
				"E chamou-o Seba; por isso é o nome daquela cidade Berseba até o dia de hoje."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 34,
				"Ora, sendo Esaú da idade de quarenta anos, tomou por mulher a Judite, filha de Beeri, heteu, e a Basemate, filha de Elom, heteu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 26, 35, "E estas foram para Isaque e Rebeca uma amargura de espírito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 1,
				"E ACONTECEU que, como Isaque envelheceu, e os seus olhos se escureceram, de maneira que não podia ver, chamou a Esaú, seu filho mais velho, e disse-lhe: Meu filho. E ele lhe disse: Eis-me aqui."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 2,
				"E ele disse: Eis que já agora estou velho, e não sei o dia da minha morte;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 3,
				"Agora, pois, toma as tuas armas, a tua aljava e o teu arco, e sai ao campo, e apanha para mim alguma caça."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 4,
				"E faze-me um guisado saboroso, como eu gosto, e traze-mo, para que eu coma; para que minha alma te abençoe, antes que morra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 5,
				"E Rebeca escutou quando Isaque falava ao seu filho Esaú. E foi Esaú ao campo para apanhar a caça que havia de trazer."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 6,
				"Então falou Rebeca a Jacó seu filho, dizendo: Eis que tenho ouvido o teu pai que falava com Esaú teu irmão, dizendo:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 7,
				"Traze-me caça, e faze-me um guisado saboroso, para que eu coma, e te abençoe diante da face do SENHOR, antes da minha morte."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 8,
				"Agora, pois, filho meu, ouve a minha voz naquilo que eu te mando:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 9,
				"Vai agora ao rebanho, e traze-me de lá dois bons cabritos, e eu farei deles um guisado saboroso para teu pai, como ele gosta;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 10,
				"E levá-lo-ás a teu pai, para que o coma; para que te abençoe antes da sua morte."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 11,
				"Então disse Jacó a Rebeca, sua mãe: Eis que Esaú meu irmão é homem cabeludo, e eu homem liso;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 12,
				"Porventura me apalpará o meu pai, e serei aos seus olhos como enganador; assim trarei eu sobre mim maldição, e não bênção."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 13,
				"E disse-lhe sua mãe: Meu filho, sobre mim seja a tua maldição; somente obedece à minha voz, e vai, traze-mos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 14,
				"E foi, e tomou-os, e trouxe-os a sua mãe; e sua mãe fez um guisado saboroso, como seu pai gostava."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 15,
				"Depois tomou Rebeca os vestidos de gala de Esaú, seu filho mais velho, que tinha consigo em casa, e vestiu a Jacó, seu filho menor;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 16,
				"E com as peles dos cabritos cobriu as suas mãos e a lisura do seu pescoço;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 17,
				"E deu o guisado saboroso e o pão que tinha preparado, na mão de Jacó seu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 18,
				"E foi ele a seu pai, e disse: Meu pai! E ele disse: Eis-me aqui; quem és tu, meu filho?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 19,
				"E Jacó disse a seu pai: Eu sou Esaú, teu primogênito; tenho feito como me disseste; levanta-te agora, assenta-te e come da minha caça, para que a tua alma me abençoe."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 20,
				"Então disse Isaque a seu filho: Como é isto, que tão cedo a achaste, filho meu? E ele disse: Porque o SENHOR teu Deus a mandou ao meu encontro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 21,
				"E disse Isaque a Jacó: Chega-te agora, para que te apalpe, meu filho, se és meu filho Esaú mesmo, ou não."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 22,
				"Então se chegou Jacó a Isaque seu pai, que o apalpou, e disse: A voz é a voz de Jacó, porém as mãos são as mãos de Esaú."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 23,
				"E não o conheceu, porquanto as suas mãos estavam cabeludas, como as mãos de Esaú seu irmão; e abençoou-o."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 24, "E disse: És tu meu filho Esaú mesmo? E ele disse: Eu sou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 25,
				"Então disse: Faze chegar isso perto de mim, para que coma da caça de meu filho; para que a minha alma te abençoe. E chegou-lhe, e comeu; trouxe-lhe também vinho, e bebeu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 26,
				"E disse-lhe Isaque seu pai: Ora chega-te, e beija-me, filho meu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 27,
				"E chegou-se, e beijou-o; então sentindo o cheiro das suas vestes, abençoou-o, e disse: Eis que o cheiro do meu filho é como o cheiro do campo, que o SENHOR abençoou;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 28,
				"Assim, pois, te dê Deus do orvalho dos céus, e das gorduras da terra, e abundância de trigo e de mosto."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 29,
				"Sirvam-te povos, e nações se encurvem a ti; sê senhor de teus irmãos, e os filhos da tua mãe se encurvem a ti; malditos sejam os que te amaldiçoarem, e benditos sejam os que te abençoarem."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 30,
				"E aconteceu que, acabando Isaque de abençoar a Jacó, apenas Jacó acabava de sair da presença de Isaque seu pai, veio Esaú, seu irmão, da sua caça;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 31,
				"E fez também ele um guisado saboroso, e trouxe-o a seu pai; e disse a seu pai: Levanta-te, meu pai, e come da caça de teu filho, para que me abençoe a tua alma."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 32,
				"E disse-lhe Isaque seu pai: Quem és tu? E ele disse: Eu sou teu filho, o teu primogênito Esaú."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 33,
				"Então estremeceu Isaque de um estremecimento muito grande, e disse: Quem, pois, é aquele que apanhou a caça, e ma trouxe? E comi de tudo, antes que tu viesses, e abençoei-o, e ele será bendito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 34,
				"Esaú, ouvindo as palavras de seu pai, bradou com grande e mui amargo brado, e disse a seu pai: Abençoa-me também a mim, meu pai."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 27, 35, "E ele disse: Veio teu irmão com sutileza, e tomou a tua bênção."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 36,
				"Então disse ele: Não é o seu nome justamente Jacó, tanto que já duas vezes me enganou? A minha primogenitura me tomou, e eis que agora me tomou a minha bênção. E perguntou: Não reservaste, pois, para mim nenhuma bênção?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 37,
				"Então respondeu Isaque a Esaú dizendo: Eis que o tenho posto por senhor sobre ti, e todos os seus irmãos lhe tenho dado por servos; e de trigo e de mosto o tenho fortalecido; que te farei, pois, agora, meu filho?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 38,
				"E disse Esaú a seu pai: Tens uma só bênção, meu pai? Abençoa-me também a mim, meu pai. E levantou Esaú a sua voz, e chorou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 39,
				"Então respondeu Isaque, seu pai, e disse-lhe: Eis que a tua habitação será nas gorduras da terra e no orvalho dos altos céus."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 40,
				"E pela tua espada viverás, e ao teu irmão servirás. Acontecerá, porém, que quando te assenhoreares, então sacudirás o seu jugo do teu pescoço."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 41,
				"E Esaú odiou a Jacó por causa daquela bênção, com que seu pai o tinha abençoado; e Esaú disse no seu coração: Chegar-se-ão os dias de luto de meu pai; e matarei a Jacó meu irmão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 42,
				"E foram denunciadas a Rebeca estas palavras de Esaú, seu filho mais velho; e ela mandou chamar a Jacó, seu filho menor, e disse-lhe: Eis que Esaú teu irmão se consola a teu respeito, propondo matar-te."));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 43,
				"Agora, pois, meu filho, ouve a minha voz, e levanta-te; acolhe-te a Labão meu irmão, em Harã,"));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 27, 44, "E mora com ele alguns dias, até que passe o furor de teu irmão;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 45,
				"Até que se desvie de ti a ira de teu irmão, e se esqueça do que lhe fizeste; então mandarei trazer-te de lá; por que seria eu desfilhada também de vós ambos num mesmo dia?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 27, 46,
				"E disse Rebeca a Isaque: Enfadada estou da minha vida, por causa das filhas de Hete; se Jacó tomar mulher das filhas de Hete, como estas são, das filhas desta terra, para que me servirá a vida?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 1,
				"E ISAQUE chamou a Jacó, e abençoou-o, e ordenou-lhe, e disse-lhe: Não tomes mulher de entre as filhas de Canaã;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 2,
				"Levanta-te, vai a Padã-Arã, à casa de Betuel, pai de tua mãe, e toma de lá uma mulher das filhas de Labão, irmão de tua mãe;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 3,
				"E Deus Todo-Poderoso te abençoe, e te faça frutificar, e te multiplique, para que sejas uma multidão de povos;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 4,
				"E te dê a bênção de Abraão, a ti e à tua descendência contigo, para que em herança possuas a terra de tuas peregrinações, que Deus deu a Abraão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 5,
				"Assim despediu Isaque a Jacó, o qual se foi a Padã-Arã, a Labão, filho de Betuel, arameu, irmão de Rebeca, mãe de Jacó e de Esaú."));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 6,
				"Vendo, pois, Esaú que Isaque abençoara a Jacó, e o enviara a Padã-Arã, para tomar mulher dali para si, e que, abençoando-o, lhe ordenara, dizendo: Não tomes mulher das filhas de Canaã;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 7,
				"E que Jacó obedecera a seu pai e a sua mãe, e se fora a Padã-Arã;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 8,
				"Vendo também Esaú que as filhas de Canaã eram más aos olhos de Isaque seu pai,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 9,
				"Foi Esaú a Ismael, e tomou para si por mulher, além das suas mulheres, a Maalate filha de Ismael, filho de Abraão, irmã de Nebaiote."));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 10, "Partiu, pois, Jacó de Berseba, e foi a Harã;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 11,
				"E chegou a um lugar onde passou a noite, porque já o sol era posto; e tomou uma das pedras daquele lugar, e a pôs por seu travesseiro, e deitou-se naquele lugar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 12,
				"E sonhou: e eis uma escada posta na terra, cujo topo tocava nos céus; e eis que os anjos de Deus subiam e desciam por ela;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 13,
				"E eis que o SENHOR estava em cima dela, e disse: Eu sou o SENHOR Deus de Abraão teu pai, e o Deus de Isaque; esta terra, em que estás deitado, darei a ti e à tua descendência;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 14,
				"E a tua descendência será como o pó da terra, e estender-se-á ao ocidente, e ao oriente, e ao norte, e ao sul, e em ti e na tua descendência serão benditas todas as famílias da terra;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 15,
				"E eis que estou contigo, e te guardarei por onde quer que fores, e te farei tornar a esta terra; porque não te deixarei, até que haja cumprido o que te tenho falado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 16,
				"Acordando, pois, Jacó do seu sono, disse: Na verdade o SENHOR está neste lugar; e eu não o sabia."));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 17,
				"E temeu, e disse: Quão terrível é este lugar! Este não é outro lugar senão a casa de Deus; e esta é a porta dos céus."));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 18,
				"Então levantou-se Jacó pela manhã de madrugada, e tomou a pedra que tinha posto por seu travesseiro, e a pôs por coluna, e derramou azeite em cima dela."));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 19,
				"E chamou o nome daquele lugar Betel; o nome porém daquela cidade antes era Luz."));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 20,
				"E Jacó fez um voto, dizendo: Se Deus for comigo, e me guardar nesta viagem que faço, e me der pão para comer, e vestes para vestir;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 21,
				"E eu em paz tornar à casa de meu pai, o SENHOR me será por Deus;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 28, 22,
				"E esta pedra que tenho posto por coluna será casa de Deus; e de tudo quanto me deres, certamente te darei o dízimo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 1, "ENTÃO pôs-se Jacó a caminho e foi à terra do povo do oriente;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 2,
				"E olhou, e eis um poço no campo, e eis três rebanhos de ovelhas que estavam deitados junto a ele; porque daquele poço davam de beber aos rebanhos; e havia uma grande pedra sobre a boca do poço."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 3,
				"E ajuntavam ali todos os rebanhos, e removiam a pedra de sobre a boca do poço, e davam de beber às ovelhas; e tornavam a pôr a pedra sobre a boca do poço, no seu lugar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 4,
				"E disse-lhes Jacó: Meus irmãos, donde sois? E disseram: Somos de Harã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 5,
				"E ele lhes disse: Conheceis a Labão, filho de Naor? E disseram: Conhecemos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 6,
				"Disse-lhes mais: Está ele bem? E disseram: Está bem, e eis aqui Raquel sua filha, que vem com as ovelhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 7,
				"E ele disse: Eis que ainda é pleno dia, não é tempo de ajuntar o gado; dai de beber às ovelhas, e ide apascentá-las."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 8,
				"E disseram: Não podemos, até que todos os rebanhos se ajuntem, e removam a pedra de sobre a boca do poço, para que demos de beber às ovelhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 9,
				"Estando ele ainda falando com eles, veio Raquel com as ovelhas de seu pai; porque ela era pastora."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 10,
				"E aconteceu que, vendo Jacó a Raquel, filha de Labão, irmão de sua mãe, e as ovelhas de Labão, irmão de sua mãe, chegou Jacó, e revolveu a pedra de sobre a boca do poço e deu de beber às ovelhas de Labão, irmão de sua mãe."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 11, "E Jacó beijou a Raquel, e levantou a sua voz e chorou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 12,
				"E Jacó anunciou a Raquel que era irmão de seu pai, e que era filho de Rebeca; então ela correu, e o anunciou a seu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 13,
				"E aconteceu que, ouvindo Labão as novas de Jacó, filho de sua irmã, correu-lhe ao encontro, e abraçou-o, e beijou-o, e levou-o à sua casa; e ele contou a Labão todas estas coisas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 14,
				"Então Labão disse-lhe: Verdadeiramente és tu o meu osso e a minha carne. E ficou com ele um mês inteiro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 15,
				"Depois disse Labão a Jacó: Porque tu és meu irmão, hás de servir-me de graça? Declara-me qual será o teu salário."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 16,
				"E Labão tinha duas filhas; o nome da mais velha era Lia, e o nome da menor Raquel."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 17,
				"Lia tinha olhos tenros, mas Raquel era de formoso semblante e formosa à vista."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 18,
				"E Jacó amava a Raquel, e disse: Sete anos te servirei por Raquel, tua filha menor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 19,
				"Então disse Labão: Melhor é que eu a dê a ti, do que eu a dê a outro homem; fica comigo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 20,
				"Assim serviu Jacó sete anos por Raquel; e estes lhe pareceram como poucos dias, pelo muito que a amava."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 21,
				"E disse Jacó a Labão: Dá-me minha mulher, porque meus dias são cumpridos, para que eu me case com ela."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 22,
				"Então reuniu Labão a todos os homens daquele lugar, e fez um banquete."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 23,
				"E aconteceu, à tarde, que tomou Lia, sua filha, e trouxe-a a Jacó que a possuiu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 24, "E Labão deu sua serva Zilpa a Lia, sua filha, por serva."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 25,
				"E aconteceu que pela manhã, viu que era Lia; pelo que disse a Labão: Por que me fizeste isso? Não te tenho servido por Raquel? Por que então me enganaste?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 26,
				"E disse Labão: Não se faz assim no nosso lugar, que a menor se dê antes da primogênita."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 27,
				"Cumpre a semana desta; então te daremos também a outra, pelo serviço que ainda outros sete anos comigo servires."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 28,
				"E Jacó fez assim, e cumpriu a semana de Lia; então lhe deu por mulher Raquel sua filha."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 29, "E Labão deu sua serva Bila por serva a Raquel, sua filha."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 30,
				"E possuiu também a Raquel, e amou também a Raquel mais do que a Lia e serviu com ele ainda outros sete anos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 31,
				"Vendo, pois, o SENHOR que Lia era desprezada, abriu a sua madre; porém Raquel era estéril."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 32,
				"E concebeu Lia, e deu à luz um filho, e chamou-o Rúben; pois disse: Porque o SENHOR atendeu à minha aflição, por isso agora me amará o meu marido."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 33,
				"E concebeu outra vez, e deu à luz um filho, dizendo: Porquanto o SENHOR ouviu que eu era desprezada, e deu-me também este. E chamou-o Simeão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 34,
				"E concebeu outra vez, e deu à luz um filho, dizendo: Agora esta vez se unirá meu marido a mim, porque três filhos lhe tenho dado. Por isso chamou-o Levi."));
		verses.add(new Verse(null, 1l, 1l, 1l, 29, 35,
				"E concebeu outra vez e deu à luz um filho, dizendo: Esta vez louvarei ao SENHOR. Por isso chamou-o Judá; e cessou de dar à luz."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 1,
				"VENDO Raquel que não dava filhos a Jacó, teve inveja de sua irmã, e disse a Jacó: Dá-me filhos, se não morro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 2,
				"Então se acendeu a ira de Jacó contra Raquel, e disse: Estou eu no lugar de Deus, que te impediu o fruto de teu ventre?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 3,
				"E ela disse: Eis aqui minha serva Bila; coabita com ela, para que dê à luz sobre meus joelhos, e eu assim receba filhos por ela."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 30, 4, "Assim lhe deu a Bila, sua serva, por mulher; e Jacó a possuiu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 5, "E concebeu Bila, e deu a Jacó um filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 6,
				"Então disse Raquel: Julgou-me Deus, e também ouviu a minha voz, e me deu um filho; por isso chamou-lhe Dã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 7,
				"E Bila, serva de Raquel, concebeu outra vez, e deu a Jacó o segundo filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 8,
				"Então disse Raquel: Com grandes lutas tenho lutado com minha irmã; também venci; e chamou-lhe Naftali."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 9,
				"Vendo, pois, Lia que cessava de ter filhos, tomou também a Zilpa, sua serva, e deu-a a Jacó por mulher."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 10, "E deu Zilpa, serva de Lia, um filho a Jacó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 11, "Então disse Lia: Afortunada! e chamou-lhe Gade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 12, "Depois deu Zilpa, serva de Lia, um segundo filho a Jacó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 13,
				"Então disse Lia: Para minha ventura; porque as filhas me terão por bem-aventurada; e chamou-lhe Aser."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 14,
				"E foi Rúben nos dias da ceifa do trigo, e achou mandrágoras no campo. E trouxe-as a Lia sua mãe. Então disse Raquel a Lia: Ora dá-me das mandrágoras de teu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 15,
				"E ela lhe disse: É já pouco que hajas tomado o meu marido, tomarás também as mandrágoras do meu filho? Então disse Raquel: Por isso ele se deitará contigo esta noite pelas mandrágoras de teu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 16,
				"Vindo, pois, Jacó à tarde do campo, saiu-lhe Lia ao encontro, e disse: A mim possuirás, esta noite, porque certamente te aluguei com as mandrágoras do meu filho. E deitou-se com ela aquela noite."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 17, "E ouviu Deus a Lia, e concebeu, e deu à luz um quinto filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 18,
				"Então disse Lia: Deus me tem dado o meu galardão, pois tenho dado minha serva ao meu marido. E chamou-lhe Issacar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 19, "E Lia concebeu outra vez, e deu a Jacó um sexto filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 20,
				"E disse Lia: Deus me deu uma boa dádiva; desta vez morará o meu marido comigo, porque lhe tenho dado seis filhos. E chamou-lhe Zebulom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 21, "E depois teve uma filha, e chamou-lhe Diná."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 22,
				"E lembrou-se Deus de Raquel; e Deus a ouviu, e abriu a sua madre."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 23,
				"E ela concebeu, e deu à luz um filho, e disse: Tirou-me Deus a minha vergonha."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 30, 24, "E chamou-lhe José, dizendo: O SENHOR me acrescente outro filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 25,
				"E aconteceu que, como Raquel deu à luz a José, disse Jacó a Labão: Deixa-me ir, que me vá ao meu lugar, e à minha terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 26,
				"Dá-me as minhas mulheres, e os meus filhos, pelas quais te tenho servido, e ir-me-ei; pois tu sabes o serviço que te tenho feito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 27,
				"Então lhe disse Labão: Se agora tenho achado graça em teus olhos, fica comigo. Tenho experimentado que o SENHOR me abençoou por amor de ti."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 28, "E disse mais: Determina-me o teu salário, que to darei."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 29,
				"Então lhe disse: Tu sabes como te tenho servido, e como passou o teu gado comigo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 30,
				"Porque o pouco que tinhas antes de mim tem aumentado em grande número; e o SENHOR te tem abençoado por meu trabalho. Agora, pois, quando hei de trabalhar também por minha casa?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 31,
				"E disse ele: Que te darei? Então disse Jacó: Nada me darás. Se me fizeres isto, tornarei a apascentar e a guardar o teu rebanho;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 32,
				"Passarei hoje por todo o teu rebanho, separando dele todos os salpicados e malhados, e todos os morenos entre os cordeiros, e os malhados e salpicados entre as cabras; e isto será o meu salário."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 33,
				"Assim testificará por mim a minha justiça no dia de amanhã, quando vieres e o meu salário estiver diante de tua face; tudo o que não for salpicado e malhado entre as cabras e moreno entre os cordeiros, ser-me-á por furto."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 34, "Então disse Labão: Quem dera seja conforme a tua palavra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 35,
				"E separou naquele mesmo dia os bodes listrados e malhados e todas as cabras salpicadas e malhadas, todos em que havia brancura, e todos os morenos entre os cordeiros; e deu-os nas mãos dos seus filhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 36,
				"E pôs três dias de caminho entre si e Jacó; e Jacó apascentava o restante dos rebanhos de Labão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 37,
				"Então tomou Jacó varas verdes de álamo e de aveleira e de castanheiro, e descascou nelas riscas brancas, descobrindo a brancura que nas varas havia,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 38,
				"E pôs estas varas, que tinha descascado, em frente aos rebanhos, nos canos e nos bebedouros de água, aonde os rebanhos vinham beber, para que concebessem quando vinham beber."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 39,
				"E concebiam os rebanhos diante das varas, e as ovelhas davam crias listradas, salpicadas e malhadas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 40,
				"Então separou Jacó os cordeiros, e pôs as faces do rebanho para os listrados, e todo o moreno entre o rebanho de Labão; e pôs o seu rebanho à parte, e não o pôs com o rebanho de Labão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 41,
				"E sucedia que cada vez que concebiam as ovelhas fortes, punha Jacó as varas nos canos, diante dos olhos do rebanho, para que concebessem diante das varas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 42,
				"Mas, quando era fraco o rebanho, não as punha. Assim as fracas eram de Labão, e as fortes de Jacó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 30, 43,
				"E cresceu o homem em grande maneira, e teve muitos rebanhos, e servas, e servos, e camelos e jumentos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 1,
				"ENTÃO ouvia as palavras dos filhos de Labão, que diziam: Jacó tem tomado tudo o que era de nosso pai, e do que era de nosso pai fez ele toda esta glória."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 2,
				"Viu também Jacó o rosto de Labão, e eis que não era para com ele como anteriormente."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 3,
				"E disse o SENHOR a Jacó: Torna-te à terra dos teus pais, e à tua parentela, e eu serei contigo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 4,
				"Então mandou Jacó chamar a Raquel e a Lia ao campo, para junto do seu rebanho,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 5,
				"E disse-lhes: Vejo que o rosto de vosso pai não é para comigo como anteriormente; porém o Deus de meu pai tem estado comigo;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 6,
				"E vós mesmas sabeis que com todo o meu esforço tenho servido a vosso pai;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 7,
				"Mas vosso pai me enganou e mudou o salário dez vezes; porém Deus não lhe permitiu que me fizesse mal."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 8,
				"Quando ele dizia assim: Os salpicados serão o teu salário; então todos os rebanhos davam salpicados. E quando ele dizia assim: Os listrados serão o teu salário, então todos os rebanhos davam listrados."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 9, "Assim Deus tirou o gado de vosso pai, e deu-o a mim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 10,
				"E sucedeu que, ao tempo em que o rebanho concebia, eu levantei os meus olhos e vi em sonhos, e eis que os bodes, que cobriam as ovelhas, eram listrados, salpicados e malhados."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 11,
				"E disse-me o anjo de Deus em sonhos: Jacó! E eu disse: Eis-me aqui."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 12,
				"E disse ele: Levanta agora os teus olhos e vê todos os bodes que cobrem o rebanho, que são listrados, salpicados e malhados; porque tenho visto tudo o que Labão te fez."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 13,
				"Eu sou o Deus de Betel, onde tens ungido uma coluna, onde me fizeste um voto; levanta-te agora, sai-te desta terra e torna-te à terra da tua parentela."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 14,
				"Então responderam Raquel e Lia e disseram-lhe: Há ainda para nós parte ou herança na casa de nosso pai?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 15,
				"Não nos considera ele como estranhas? Pois vendeu-nos, e comeu de todo o nosso dinheiro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 16,
				"Porque toda a riqueza, que Deus tirou de nosso pai, é nossa e de nossos filhos; agora, pois, faze tudo o que Deus te mandou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 17,
				"Então se levantou Jacó, pondo os seus filhos e as suas mulheres sobre os camelos;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 18,
				"E levou todo o seu gado, e todos os seus bens, que havia adquirido, o gado que possuía, que alcançara em Padã-Arã, para ir a Isaque, seu pai, à terra de Canaã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 19,
				"E havendo Labão ido a tosquiar as suas ovelhas, furtou Raquel os ídolos que seu pai tinha."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 20,
				"E Jacó logrou a Labão, o arameu, porque não lhe fez saber que fugia."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 21,
				"E fugiu ele com tudo o que tinha, e levantou-se e passou o rio; e se dirigiu para a montanha de Gileade."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 31, 22, "E no terceiro dia foi anunciado a Labão que Jacó tinha fugido."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 23,
				"Então tomou consigo os seus irmãos, e atrás dele seguiu o seu caminho por sete dias; e alcançou-o na montanha de Gileade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 24,
				"Veio, porém, Deus a Labão, o arameu, em sonhos, de noite, e disse-lhe: Guarda-te, que não fales com Jacó nem bem nem mal."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 25,
				"Alcançou, pois, Labão a Jacó, e armara Jacó a sua tenda naquela montanha; armou também Labão com os seus irmãos a sua, na montanha de Gileade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 26,
				"Então disse Labão a Jacó: Que fizeste, que me lograste e levaste as minhas filhas como cativas pela espada?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 27,
				"Por que fugiste ocultamente, e lograste-me, e não me fizeste saber, para que eu te enviasse com alegria, e com cânticos, e com tamboril e com harpa?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 28,
				"Também não me permitiste beijar os meus filhos e as minhas filhas. Loucamente agiste, agora, fazendo assim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 29,
				"Poder havia em minha mão para vos fazer mal, mas o Deus de vosso pai me falou ontem à noite, dizendo: Guarda-te, que não fales com Jacó nem bem nem mal."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 30,
				"E agora se querias ir embora, porquanto tinhas saudades de voltar à casa de teu pai, por que furtaste os meus deuses?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 31,
				"Então respondeu Jacó, e disse a Labão: Porque temia; pois que dizia comigo, se porventura não me arrebatarias as tuas filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 32,
				"Com quem achares os teus deuses, esse não viva; reconhece diante de nossos irmãos o que é teu do que está comigo, e toma-o para ti. Pois Jacó não sabia que Raquel os tinha furtado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 33,
				"Então entrou Labão na tenda de Jacó, e na tenda de Lia, e na tenda de ambas as servas, e não os achou; e saindo da tenda de Lia, entrou na tenda de Raquel. 34 Mas tinha tomado Raquel os ídolos e os tinha posto na albarda de um camelo, e assentara-se sobre eles; e apalpou Labão toda a tenda, e não os achou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 34, "Verszeile ohne Text"));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 35,
				"E ela disse a seu pai: Não se acenda a ira aos olhos de meu senhor, que não posso levantar-me diante da tua face; porquanto tenho o costume das mulheres. E ele procurou, mas não achou os ídolos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 36,
				"Então irou-se Jacó e contendeu com Labão; e respondeu Jacó, e disse a Labão: Qual é a minha transgressão? Qual é o meu pecado, que tão furiosamente me tens perseguido?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 37,
				"Havendo apalpado todos os meus móveis, que achaste de todos os móveis de tua casa? Põe-no aqui diante dos meus irmãos e de teus irmãos; e que julguem entre nós ambos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 38,
				"Estes vinte anos eu estive contigo; as tuas ovelhas e as tuas cabras nunca abortaram, e não comi os carneiros do teu rebanho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 39,
				"Não te trouxe eu o despedaçado; eu o pagava; o furtado de dia e o furtado de noite da minha mão o requerias."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 40,
				"Estava eu assim: De dia me consumia o calor, e de noite a geada; e o meu sono fugiu dos meus olhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 41,
				"Tenho estado agora vinte anos na tua casa; catorze anos te servi por tuas duas filhas, e seis anos por teu rebanho; mas o meu salário tens mudado dez vezes."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 42,
				"Se o Deus de meu pai, o Deus de Abraão e o temor de Isaque não fora comigo, por certo me despedirias agora vazio. Deus atendeu à minha aflição, e ao trabalho das minhas mãos, e repreendeu-te ontem à noite."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 43,
				"Então respondeu Labão, e disse a Jacó: Estas filhas são minhas filhas, e estes filhos são meus filhos, e este rebanho é o meu rebanho, e tudo o que vês, é meu; e que farei hoje a estas minhas filhas, ou a seus filhos, que deram à luz?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 44,
				"Agora pois vem, e façamos aliança eu e tu, que seja por testemunho entre mim e ti."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 45, "Então tomou Jacó uma pedra, e erigiu-a por coluna."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 46,
				"E disse Jacó a seus irmãos: Ajuntai pedras. E tomaram pedras, e fizeram um montão, e comeram ali sobre aquele montão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 47, "E chamou-o Labão Jegar-Saaduta; porém Jacó chamou-o Galeede."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 48,
				"Então disse Labão: Este montão seja hoje por testemunha entre mim e ti. Por isso se lhe chamou Galeede,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 49,
				"E Mispá, porquanto disse: Atente o SENHOR entre mim e ti, quando nós estivermos apartados um do outro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 50,
				"Se afligires as minhas filhas, e se tomares mulheres além das minhas filhas, ninguém está conosco; atenta que Deus é testemunha entre mim e ti."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 51,
				"Disse mais Labão a Jacó: Eis aqui este mesmo montão, e eis aqui essa coluna que levantei entre mim e ti."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 52,
				"Este montão seja testemunha, e esta coluna seja testemunha, que eu não passarei este montão a ti, e que tu não passarás este montão e esta coluna a mim, para mal."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 53,
				"O Deus de Abraão e o Deus de Naor, o Deus de seu pai, julgue entre nós. E jurou Jacó pelo temor de seu pai Isaque."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 54,
				"E ofereceu Jacó um sacrifício na montanha, e convidou seus irmãos, para comer pão; e comeram pão e passaram a noite na montanha."));
		verses.add(new Verse(null, 1l, 1l, 1l, 31, 55,
				"E levantou-se Labão pela manhã de madrugada, e beijou seus filhos e suas filhas e abençoou-os e partiu; e voltou Labão ao seu lugar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 1,
				"JACÓ também seguiu o seu caminho, e encontraram-no os anjos de Deus."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 2,
				"E Jacó disse, quando os viu: Este é o exército de Deus. E chamou aquele lugar Maanaim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 3,
				"E enviou Jacó mensageiros adiante de si a Esaú, seu irmão, à terra de Seir, território de Edom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 4,
				"E ordenou-lhes, dizendo: Assim direis a meu senhor Esaú: Assim diz Jacó, teu servo: Como peregrino morei com Labão, e me detive lá até agora;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 5,
				"E tenho bois e jumentos, ovelhas, e servos e servas; e enviei para o anunciar a meu senhor, para que ache graça em teus olhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 6,
				"E os mensageiros voltaram a Jacó, dizendo: Fomos a teu irmão Esaú; e também ele vem para encontrar-te, e quatrocentos homens com ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 7,
				"Então Jacó temeu muito e angustiou-se; e repartiu o povo que com ele estava, e as ovelhas, e as vacas, e os camelos, em dois bandos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 8,
				"Porque dizia: Se Esaú vier a um bando e o ferir, o outro bando escapará."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 9,
				"Disse mais Jacó: Deus de meu pai Abraão, e Deus de meu pai Isaque, o SENHOR, que me disseste: Torna-te à tua terra, e a tua parentela, e far-te-ei bem;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 10,
				"Menor sou eu que todas as beneficências, e que toda a fidelidade que fizeste ao teu servo; porque com meu cajado passei este Jordão, e agora me tornei em dois bandos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 11,
				"Livra-me, peço-te, da mão de meu irmão, da mão de Esaú; porque eu o temo; porventura não venha, e me fira, e a mãe com os filhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 12,
				"E tu o disseste: Certamente te farei bem, e farei a tua descendência como a areia do mar, que pela multidão não se pode contar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 13,
				"E passou ali aquela noite; e tomou do que lhe veio à sua mão, um presente para seu irmão Esaú:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 14,
				"Duzentas cabras e vinte bodes; duzentas ovelhas e vinte carneiros;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 15,
				"Trinta camelas de leite com suas crias, quarenta vacas e dez novilhos; vinte jumentas e dez jumentinhos;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 16,
				"E deu-os na mão dos seus servos, cada rebanho à parte, e disse a seus servos: Passai adiante de mim e ponde espaço entre rebanho e rebanho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 17,
				"E ordenou ao primeiro, dizendo: Quando Esaú, meu irmão, te encontrar, e te perguntar, dizendo: De quem és, e para onde vais, e de quem são estes diante de ti?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 18,
				"Então dirás: São de teu servo Jacó, presente que envia a meu senhor, a Esaú; e eis que ele mesmo vem também atrás de nós."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 19,
				"E ordenou também ao segundo, e ao terceiro, e a todos os que vinham atrás dos rebanhos, dizendo: Conforme a esta mesma palavra falareis a Esaú, quando o achardes."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 20,
				"E direis também: Eis que o teu servo Jacó vem atrás de nós. Porque dizia: Eu o aplacarei com o presente, que vai adiante de mim, e depois verei a sua face; porventura ele me aceitará."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 21,
				"Assim, passou o presente adiante dele; ele, porém, passou aquela noite no arraial."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 22,
				"E levantou-se aquela mesma noite, e tomou as suas duas mulheres, e as suas duas servas, e os seus onze filhos, e passou o vau de Jaboque."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 23,
				"E tomou-os e fê-los passar o ribeiro; e fez passar tudo o que tinha."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 24,
				"Jacó, porém, ficou só; e lutou com ele um homem, até que a alva subiu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 25,
				"E vendo este que não prevalecia contra ele, tocou a juntura de sua coxa, e se deslocou a juntura da coxa de Jacó, lutando com ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 26,
				"E disse: Deixa-me ir, porque já a alva subiu. Porém ele disse: Não te deixarei ir, se não me abençoares."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 27, "E disse-lhe: Qual é o teu nome? E ele disse: Jacó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 28,
				"Então disse: Não te chamarás mais Jacó, mas Israel; pois como príncipe lutaste com Deus e com os homens, e prevaleceste."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 29,
				"E Jacó lhe perguntou, e disse: Dá-me, peço-te, a saber o teu nome. E disse: Por que perguntas pelo meu nome? E abençoou-o ali."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 30,
				"E chamou Jacó o nome daquele lugar Peniel, porque dizia: Tenho visto a Deus face a face, e a minha alma foi salva."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 31,
				"E saiu-lhe o sol, quando passou a Peniel; e manquejava da sua coxa."));
		verses.add(new Verse(null, 1l, 1l, 1l, 32, 32,
				"Por isso os filhos de Israel não comem o nervo encolhido, que está sobre a juntura da coxa, até o dia de hoje; porquanto tocara a juntura da coxa de Jacó no nervo encolhido."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 1,
				"E LEVANTOU Jacó os seus olhos, e olhou, e eis que vinha Esaú, e quatrocentos homens com ele. Então repartiu os filhos entre Lia, e Raquel, e as duas servas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 2,
				"E pôs as servas e seus filhos na frente, e a Lia e seus filhos atrás; porém a Raquel e José os derradeiros."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 3,
				"E ele mesmo passou adiante deles e inclinou-se à terra sete vezes, até que chegou a seu irmão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 4,
				"Então Esaú correu-lhe ao encontro, e abraçou-o, e lançou-se sobre o seu pescoço, e beijou-o; e choraram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 5,
				"Depois levantou os seus olhos, e viu as mulheres, e os meninos, e disse: Quem são estes contigo? E ele disse: Os filhos que Deus graciosamente tem dado a teu servo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 6,
				"Então chegaram as servas; elas e os seus filhos, e inclinaram-se."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 7,
				"E chegou também Lia com seus filhos, e inclinaram-se; e depois chegou José e Raquel e inclinaram-se."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 8,
				"E disse Esaú: De que te serve todo este bando que tenho encontrado? E ele disse: Para achar graça aos olhos de meu senhor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 9,
				"Mas Esaú disse: Eu tenho bastante, meu irmão; seja para ti o que tens."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 10,
				"Então disse Jacó: Não, se agora tenho achado graça em teus olhos, peço-te que tomes o meu presente da minha mão; porquanto tenho visto o teu rosto, como se tivesse visto o rosto de Deus, e tomaste contentamento em mim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 11,
				"Toma, peço-te, a minha bênção, que te foi trazida; porque Deus graciosamente ma tem dado; e porque tenho de tudo. E instou com ele, até que a tomou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 12, "E disse: Caminhemos, e andemos, e eu partirei adiante de ti."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 13,
				"Porém ele lhe disse: Meu senhor sabe que estes filhos são tenros, e que tenho comigo ovelhas e vacas de leite; se as afadigarem somente um dia, todo o rebanho morrerá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 14,
				"Ora passe o meu senhor adiante de seu servo; e eu irei como guia pouco a pouco, conforme ao passo do gado que vai adiante de mim, e conforme ao passo dos meninos, até que chegue a meu senhor em Seir."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 15,
				"E Esaú disse: Permite então que eu deixe contigo alguns da minha gente. E ele disse: Para que é isso? Basta que ache graça aos olhos de meu senhor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 16, "Assim voltou Esaú aquele dia pelo seu caminho a Seir."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 17,
				"Jacó, porém, partiu para Sucote e edificou para si uma casa; e fez cabanas para o seu gado; por isso chamou aquele lugar Sucote."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 18,
				"E chegou Jacó salvo à Salém, cidade de Siquém, que está na terra de Canaã, quando vinha de Padã-Arã; e armou a sua tenda diante da cidade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 33, 19,
				"E comprou uma parte do campo em que estendera a sua tenda, da mão dos filhos de Hamor, pai de Siquém, por cem peças de dinheiro."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 33, 20, "E levantou ali um altar, e chamou-lhe: Deus, o Deus de Israel."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 1,
				"E SAIU Diná, filha de Lia, que esta dera a Jacó, para ver as filhas da terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 2,
				"E Siquém, filho de Hamor, heveu, príncipe daquela terra, viu-a, e tomou-a, e deitou-se com ela, e humilhou-a."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 3,
				"E apegou-se a sua alma com Diná, filha de Jacó, e amou a moça e falou afetuosamente à moça."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 4,
				"Falou também Siquém a Hamor, seu pai, dizendo: Toma-me esta moça por mulher."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 5,
				"Quando Jacó ouviu que Diná, sua filha, fora violada, estavam os seus filhos no campo com o gado; e calou-se Jacó até que viessem."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 6, "E saiu Hamor, pai de Siquém, a Jacó, para falar com ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 7,
				"E vieram os filhos de Jacó do campo, ouvindo isso, e entristeceram-se os homens, e iraram-se muito, porquanto Siquém cometera uma insensatez em Israel, deitando-se com a filha de Jacó; o que não se devia fazer assim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 8,
				"Então falou Hamor com eles, dizendo: A alma de Siquém, meu filho, está enamorada da vossa filha; dai-lha, peço-vos, por mulher;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 9,
				"E aparentai-vos conosco, dai-nos as vossas filhas, e tomai as nossas filhas para vós;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 10,
				"E habitareis conosco; e a terra estará diante de vós; habitai e negociai nela, e tomai possessão nela."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 11,
				"E disse Siquém ao pai dela, e aos irmãos dela: Ache eu graça em vossos olhos, e darei o que me disserdes;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 12,
				"Aumentai muito sobre mim o dote e a dádiva e darei o que me disserdes; dai-me somente a moça por mulher."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 13,
				"Então responderam os filhos de Jacó a Siquém e a Hamor, seu pai, enganosamente, e falaram, porquanto havia violado a Diná, sua irmã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 14,
				"E disseram-lhe: Não podemos fazer isso, dar a nossa irmã a um homem não circuncidado; porque isso seria uma vergonha para nós;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 15,
				"Nisso, porém, consentiremos a vós: se fordes como nós; que se circuncide todo o homem entre vós;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 16,
				"Então dar-vos-emos as nossas filhas, e tomaremos nós as vossas filhas, e habitaremos convosco, e seremos um povo;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 17,
				"Mas se não nos ouvirdes, e não vos circuncidardes, tomaremos a nossa filha e ir-nos-emos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 18,
				"E suas palavras foram boas aos olhos de Hamor, e aos olhos de Siquém, filho de Hamor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 19,
				"E não tardou o jovem em fazer isto; porque a filha de Jacó lhe contentava; e ele era o mais honrado de toda a casa de seu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 20,
				"Veio, pois, Hamor e Siquém, seu filho, à porta da sua cidade, e falaram aos homens da sua cidade, dizendo:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 21,
				"Estes homens são pacíficos conosco; portanto habitarão nesta terra, e negociarão nela; eis que a terra é larga de espaço para eles; tomaremos nós as suas filhas por mulheres, e lhes daremos as nossas filhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 22,
				"Nisto, porém, consentirão aqueles homens, em habitar conosco, para que sejamos um povo, se todo o homem entre nós se circuncidar, como eles são circuncidados."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 23,
				"E seu gado, as suas possessões, e todos os seus animais não serão nossos? Consintamos somente com eles e habitarão conosco."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 24,
				"E deram ouvidos a Hamor e a Siquém, seu filho, todos os que saíam da porta da cidade; e foi circuncidado todo o homem, de todos os que saíam pela porta da sua cidade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 25,
				"E aconteceu que, ao terceiro dia, quando estavam com a mais violenta dor, os dois filhos de Jacó, Simeão e Levi, irmãos de Diná, tomaram cada um a sua espada, e entraram afoitamente na cidade, e mataram todos os homens."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 26,
				"Mataram também ao fio da espada a Hamor, e a seu filho Siquém; e tomaram a Diná da casa de Siquém, e saíram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 27,
				"Vieram os filhos de Jacó aos mortos e saquearam a cidade; porquanto violaram a sua irmã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 28,
				"As suas ovelhas, e as suas vacas, e os seus jumentos, e o que havia na cidade e no campo, tomaram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 29,
				"E todos os seus bens, e todos os seus meninos, e as suas mulheres, levaram presos, e saquearam tudo o que havia em casa."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 30,
				"Então disse Jacó a Simeão e a Levi: Tendes-me turbado, fazendo-me cheirar mal entre os moradores desta terra, entre os cananeus e perizeus; tendo eu pouco povo em número, eles ajuntar-se-ão, e serei destruído, eu e minha casa."));
		verses.add(new Verse(null, 1l, 1l, 1l, 34, 31,
				"E eles disseram: Devia ele tratar a nossa irmã como a uma prostituta?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 1,
				"DEPOIS disse Deus a Jacó: Levanta-te, sobe a Betel, e habita ali; e faze ali um altar ao Deus que te apareceu, quando fugiste da face de Esaú teu irmão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 2,
				"Então disse Jacó à sua família, e a todos os que com ele estavam: Tirai os deuses estranhos, que há no meio de vós, e purificai-vos, e mudai as vossas vestes."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 3,
				"E levantemo-nos, e subamos a Betel; e ali farei um altar ao Deus que me respondeu no dia da minha angústia, e que foi comigo no caminho que tenho andado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 4,
				"Então deram a Jacó todos os deuses estranhos, que tinham em suas mãos, e as arrecadas que estavam em suas orelhas; e Jacó os escondeu debaixo do carvalho que está junto a Siquém."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 5,
				"E partiram; e o terror de Deus foi sobre as cidades que estavam ao redor deles, e não seguiram após os filhos de Jacó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 6,
				"Assim chegou Jacó a Luz, que está na terra de Canaã (esta é Betel), ele e todo o povo que com ele havia."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 7,
				"E edificou ali um altar, e chamou aquele lugar El-Betel; porquanto Deus ali se lhe tinha manifestado, quando fugia da face de seu irmão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 8,
				"E morreu Débora, a ama de Rebeca, e foi sepultada ao pé de Betel, debaixo do carvalho cujo nome chamou Alom-Bacute."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 9,
				"E apareceu Deus outra vez a Jacó, vindo de Padã-Arã, e abençoou-o."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 10,
				"E disse-lhe Deus: O teu nome é Jacó; não te chamarás mais Jacó, mas Israel será o teu nome. E chamou-lhe Israel."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 11,
				"Disse-lhe mais Deus: Eu sou o Deus Todo-Poderoso; frutifica e multiplica-te; uma nação, sim, uma multidão de nações sairá de ti, e reis procederão dos teus lombos;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 12,
				"E te darei a ti a terra que tenho dado a Abraão e a Isaque, e à tua descendência depois de ti darei a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 13, "E Deus subiu dele, do lugar onde falara com ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 14,
				"E Jacó pôs uma coluna no lugar onde falara com ele, uma coluna de pedra; e derramou sobre ela uma libação, e deitou sobre ela azeite."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 15, "E chamou Jacó aquele lugar, onde Deus falara com ele, Betel."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 16,
				"E partiram de Betel; e havia ainda um pequeno espaço de terra para chegar a Efrata, e deu à luz Raquel, e ela teve trabalho em seu parto."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 17,
				"E aconteceu que, tendo ela trabalho em seu parto, lhe disse a parteira: Não temas, porque também este filho terás."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 18,
				"E aconteceu que, saindo-se-lhe a alma (porque morreu), chamou-lhe Benoni; mas seu pai chamou-lhe Benjamim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 19,
				"Assim morreu Raquel, e foi sepultada no caminho de Efrata; que é Belém."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 20,
				"E Jacó pôs uma coluna sobre a sua sepultura; esta é a coluna da sepultura de Raquel até o dia de hoje."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 21,
				"Então partiu Israel, e estendeu a sua tenda além de Migdal Eder."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 22,
				"E aconteceu que, habitando Israel naquela terra, foi Rúben e deitou-se com Bila, concubina de seu pai; e Israel o soube. E eram doze os filhos de Jacó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 23,
				"Os filhos de Lia: Rúben, o primogênito de Jacó, depois Simeão e Levi, e Judá, e Issacar e Zebulom;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 24, "Os filhos de Raquel: José e Benjamim;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 25, "E os filhos de Bila, serva de Raquel: Dã e Naftali;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 26,
				"E os filhos de Zilpa, serva de Lia: Gade e Aser. Estes são os filhos de Jacó, que lhe nasceram em Padã-Arã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 27,
				"E Jacó veio a seu pai Isaque, a Manre, a Quiriate-Arba (que é Hebrom), onde peregrinaram Abraão e Isaque."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 28, "E foram os dias de Isaque cento e oitenta anos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 35, 29,
				"E Isaque expirou, e morreu, e foi recolhido ao seu povo, velho e farto de dias; e Esaú e Jacó, seus filhos, o sepultaram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 1, "E ESTAS são as gerações de Esaú (que é Edom)."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 2,
				"Esaú tomou suas mulheres das filhas de Canaã; a Ada, filha de Elom, heteu, e a Aolibama, filha de Aná, filho de Zibeão, heveu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 3, "E a Basemate, filha de Ismael, irmã de Nebaiote."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 4, "E Ada teve de Esaú a Elifaz; e Basemate teve a Reuel;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 5,
				"E Aolibama deu à luz a Jeús, Jalão e Coré; estes são os filhos de Esaú, que lhe nasceram na terra de Canaã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 6,
				"E Esaú tomou suas mulheres, e seus filhos, e suas filhas, e todas as almas de sua casa, e seu gado, e todos os seus animais, e todos os seus bens, que havia adquirido na terra de Canaã; e foi para outra terra apartando-se de Jacó, seu irmão;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 7,
				"Porque os bens deles eram muitos para habitarem juntos; e a terra de suas peregrinações não os podia sustentar por causa do seu gado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 8, "Portanto Esaú habitou na montanha de Seir; Esaú é Edom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 9,
				"Estas, pois, são as gerações de Esaú, pai dos edomeus, na montanha de Seir."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 10,
				"Estes são os nomes dos filhos de Esaú: Elifaz, filho de Ada, mulher de Esaú; Reuel, filho de Basemate, mulher de Esaú."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 36, 11, "E os filhos de Elifaz foram: Temã, Omar, Zefô, Gaetã e Quenaz."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 12,
				"E Timna era concubina de Elifaz, filho de Esaú, e teve de Elifaz a Amaleque. Estes são os filhos de Ada, mulher de Esaú."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 13,
				"E estes foram os filhos de Reuel: Naate, Zerá, Samá e Mizá; estes foram os filhos de Basemate, mulher de Esaú."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 14,
				"E estes foram os filhos de Aolibama, mulher de Esaú, filha de Aná, filho de Zibeão; ela teve de Esaú: Jeús, Jalão e Coré."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 15,
				"Estes são os príncipes dos filhos de Esaú: os filhos de Elifaz, o primogênito de Esaú, o príncipe Temã, o príncipe Omar, o príncipe Zefô, o príncipe Quenaz."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 16,
				"O príncipe Coré, o príncipe Gaetã, o príncipe Amaleque; estes são os príncipes de Elifaz na terra de Edom; estes são os filhos de Ada."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 17,
				"E estes são os filhos de Reuel, filhos de Esaú: o príncipe Naate, o príncipe Zerá, o príncipe Samá, o príncipe Mizá; estes são os príncipes de Reuel, na terra de Edom; estes são os filhos de Basemate, mulher de Esaú."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 18,
				"E estes são os filhos de Aolibama, mulher de Esaú: o príncipe Jeús, o príncipe Jalão, o príncipe Coré; estes são os príncipes de Aolibama, filha de Aná, mulher de Esaú."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 19,
				"Estes são os filhos de Esaú, e estes são seus príncipes: Ele é Edom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 20,
				"Estes são os filhos de Seir, horeu, moradores daquela terra: Lotã, Sobal, Zibeão e Aná,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 21,
				"Disom, Eser e Disã; estes são os príncipes dos horeus, filhos de Seir, na terra de Edom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 22,
				"E os filhos de Lotã foram Hori e Homã; e a irmã de Lotã era Timna."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 36, 23, "Estes são os filhos de Sobal: Alvã, Manaate, Ebal, Sefô e Onã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 24,
				"E estes são os filhos de Zibeão: Aiá e Aná; este é o Aná que achou as fontes termais no deserto, quando apascentava os jumentos de Zibeão, seu pai."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 36, 25, "E estes são os filhos de Aná: Disom e Aolibama, a filha de Aná."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 26, "E estes são os filhos de Disã: Hendã, Esbã, Itrã e Querã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 27, "Estes são os filhos de Eser: Bilã, Zaavã e Acã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 28, "Estes são os filhos de Disã: Uz e Arã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 29,
				"Estes são os príncipes dos horeus: o príncipe Lotã, o príncipe Sobal, o príncipe Zibeão, o príncipe Aná."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 30,
				"O príncipe Disom, o príncipe Eser, o príncipe Disã: estes são os príncipes dos horeus segundo os seus principados na terra de Seir."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 31,
				"E estes são os reis que reinaram na terra de Edom, antes que reinasse rei algum sobre os filhos de Israel."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 32,
				"Reinou, pois, em Edom Bela, filho de Beor, e o nome da sua cidade foi Dinabá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 33,
				"E morreu Bela; e Jobabe, filho de Zerá, de Bozra, reinou em seu lugar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 34,
				"E morreu Jobabe; e Husão, da terra dos temanitas, reinou em seu lugar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 35,
				"E morreu Husão, e em seu lugar reinou Hadade, filho de Bedade, o que feriu a Midiã, no campo de Moabe; e o nome da sua cidade foi Avite."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 36, "E morreu Hadade; e Samlá de Masreca reinou em seu lugar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 37,
				"E morreu Samlá; e Saul de Reobote, junto ao rio, reinou em seu lugar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 38,
				"E morreu Saul; e Baal-Hanã, filho de Acbor, reinou em seu lugar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 39,
				"E morreu Baal-Hanã, filho de Acbor; e Hadar reinou em seu lugar, e o nome de sua cidade foi Pau; e o nome de sua mulher foi Meetabel, filha de Matrede, filha de Me-Zaabe."));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 40,
				"E estes são os nomes dos príncipes de Esaú, segundo as suas gerações, segundo os seus lugares, com os seus nomes: o príncipe Timna, o príncipe Alva, o príncipe Jetete,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 41, "O príncipe Aolibama, o príncipe Ela, o príncipe Pinom,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 42, "O príncipe Quenaz, o príncipe Temã, o príncipe Mibzar,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 36, 43,
				"O príncipe Magdiel, o príncipe Irã: estes são os príncipes de Edom, segundo as suas habitações, na terra da sua possessão. Este é Esaú, pai de Edom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 1,
				"E JACÓ habitou na terra das peregrinações de seu pai, na terra de Canaã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 2,
				"Estas são as gerações de Jacó. Sendo José de dezessete anos, apascentava as ovelhas com seus irmãos; sendo ainda jovem, andava com os filhos de Bila, e com os filhos de Zilpa, mulheres de seu pai; e José trazia más notícias deles a seu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 3,
				"E Israel amava a José mais do que a todos os seus filhos, porque era filho da sua velhice; e fez-lhe uma túnica de várias cores."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 4,
				"Vendo, pois, seus irmãos que seu pai o amava mais do que a todos eles, odiaram-no, e não podiam falar com ele pacificamente."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 5,
				"Teve José um sonho, que contou a seus irmãos; por isso o odiaram ainda mais."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 6, "E disse-lhes: Ouvi, peço-vos, este sonho, que tenho sonhado:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 7,
				"Eis que estávamos atando molhos no meio do campo, e eis que o meu molho se levantava, e também ficava em pé, e eis que os vossos molhos o rodeavam, e se inclinavam ao meu molho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 8,
				"Então lhe disseram seus irmãos: Tu, pois, deveras reinarás sobre nós? Tu deveras terás domínio sobre nós? Por isso ainda mais o odiavam por seus sonhos e por suas palavras."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 9,
				"E teve José outro sonho, e o contou a seus irmãos, e disse: Eis que tive ainda outro sonho; e eis que o sol, e a lua, e onze estrelas se inclinavam a mim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 10,
				"E contando-o a seu pai e a seus irmãos, repreendeu-o seu pai, e disse-lhe: Que sonho é este que tiveste? Porventura viremos, eu e tua mãe, e teus irmãos, a inclinar-nos perante ti em terra?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 11,
				"Seus irmãos, pois, o invejavam; seu pai porém guardava este negócio no seu coração."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 12,
				"E seus irmãos foram apascentar o rebanho de seu pai, junto de Siquém."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 13,
				"Disse, pois, Israel a José: Não apascentam os teus irmãos junto de Siquém? Vem, e enviar-te-ei a eles. E ele respondeu: Eis-me aqui."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 14,
				"E ele lhe disse: Ora vai, vê como estão teus irmãos, e como está o rebanho, e traze-me resposta. Assim o enviou do vale de Hebrom, e foi a Siquém."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 15,
				"E achou-o um homem, porque eis que andava errante pelo campo, e perguntou-lhe o homem, dizendo: Que procuras?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 16,
				"E ele disse: Procuro meus irmãos; dize-me, peço-te, onde eles apascentam."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 17,
				"E disse aquele homem: Foram-se daqui; porque ouvi-os dizer: Vamos a Dotã. José, pois, seguiu atrás de seus irmãos, e achou-os em Dotã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 18,
				"E viram-no de longe e, antes que chegasse a eles, conspiraram contra ele para o matarem."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 19, "E disseram um ao outro: Eis lá vem o sonhador-mor!"));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 20,
				"Vinde, pois, agora, e matemo-lo, e lancemo-lo numa destas covas, e diremos: Uma fera o comeu; e veremos que será dos seus sonhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 21,
				"E ouvindo-o Rúben, livrou-o das suas mãos, e disse: Não lhe tiremos a vida."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 22,
				"Também lhes disse Rúben: Não derrameis sangue; lançai-o nesta cova, que está no deserto, e não lanceis mãos nele; isto disse para livrá-lo das mãos deles e para torná-lo a seu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 23,
				"E aconteceu que, chegando José a seus irmãos, tiraram de José a sua túnica, a túnica de várias cores, que trazia."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 24,
				"E tomaram-no, e lançaram-no na cova; porém a cova estava vazia, não havia água nela."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 25,
				"Depois assentaram-se a comer pão; e levantaram os seus olhos, e olharam, e eis que uma companhia de ismaelitas vinha de Gileade; e seus camelos traziam especiarias e bálsamo e mirra, e iam levá-los ao Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 26,
				"Então Judá disse aos seus irmãos: Que proveito haverá que matemos a nosso irmão e escondamos o seu sangue?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 27,
				"Vinde e vendamo-lo a estes ismaelitas, e não seja nossa mão sobre ele; porque ele é nosso irmão, nossa carne. E seus irmãos obedeceram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 28,
				"Passando, pois, os mercadores midianitas, tiraram e alçaram a José da cova, e venderam José por vinte moedas de prata, aos ismaelitas, os quais levaram José ao Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 29,
				"Voltando, pois, Rúben à cova, eis que José não estava na cova; então rasgou as suas vestes."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 30,
				"E voltou a seus irmãos e disse: O menino não está; e eu aonde irei?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 31,
				"Então tomaram a túnica de José, e mataram um cabrito, e tingiram a túnica no sangue."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 32,
				"E enviaram a túnica de várias cores, mandando levá-la a seu pai, e disseram: Temos achado esta túnica; conhece agora se esta será ou não a túnica de teu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 33,
				"E conheceu-a, e disse: É a túnica de meu filho; uma fera o comeu; certamente José foi despedaçado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 34,
				"Então Jacó rasgou as suas vestes, pôs saco sobre os seus lombos e lamentou a seu filho muitos dias."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 35,
				"E levantaram-se todos os seus filhos e todas as suas filhas, para o consolarem; recusou porém ser consolado, e disse: Porquanto com choro hei de descer ao meu filho até à sepultura. Assim o chorou seu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 37, 36,
				"E os midianitas venderam-no no Egito a Potifar, oficial de Faraó, capitão da guarda."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 1,
				"E ACONTECEU no mesmo tempo que Judá desceu de entre seus irmãos e entrou na casa de um homem de Adulão, cujo nome era Hira,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 2,
				"E viu Judá ali a filha de um homem cananeu, cujo nome era Sua; e tomou-a por mulher, e a possuiu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 3, "E ela concebeu e deu à luz um filho, e chamou-lhe Er."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 4, "E tornou a conceber e deu à luz um filho, e chamou-lhe Onã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 5,
				"E continuou ainda e deu à luz um filho, e chamou-lhe Selá; e Judá estava em Quezibe, quando ela o deu à luz."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 6,
				"Judá, pois, tomou uma mulher para Er, o seu primogênito, e o seu nome era Tamar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 7,
				"Er, porém, o primogênito de Judá, era mau aos olhos do SENHOR, por isso o SENHOR o matou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 8,
				"Então disse Judá a Onã: Toma a mulher do teu irmão, e casa-te com ela, e suscita descendência a teu irmão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 9,
				"Onã, porém, soube que esta descendência não havia de ser para ele; e aconteceu que, quando possuía a mulher de seu irmão, derramava o sêmen na terra, para não dar descendência a seu irmão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 10,
				"E o que fazia era mau aos olhos do SENHOR, pelo que também o matou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 11,
				"Então disse Judá a Tamar sua nora: Fica-te viúva na casa de teu pai, até que Selá, meu filho, seja grande. Porquanto disse: Para que porventura não morra também este, como seus irmãos. Assim se foi Tamar e ficou na casa de seu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 12,
				"Passando-se pois muitos dias, morreu a filha de Sua, mulher de Judá; e depois de consolado Judá subiu aos tosquiadores das suas ovelhas em Timna, ele e Hira, seu amigo, o adulamita."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 13,
				"E deram aviso a Tamar, dizendo: Eis que o teu sogro sobe a Timna, a tosquiar as suas ovelhas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 14,
				"Então ela tirou de sobre si os vestidos da sua viuvez e cobriu-se com o véu, e envolveu-se, e assentou-se à entrada das duas fontes que estão no caminho de Timna, porque via que Selá já era grande, e ela não lhe fora dada por mulher."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 15,
				"E vendo-a Judá, teve-a por uma prostituta, porque ela tinha coberto o seu rosto."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 16,
				"E dirigiu-se a ela no caminho, e disse: Vem, peço-te, deixa-me possuir-te. Porquanto não sabia que era sua nora. E ela disse: Que darás, para que possuas a mim?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 17,
				"E ele disse: Eu te enviarei um cabrito do rebanho. E ela disse: Dar-me-ás penhor até que o envies?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 18,
				"Então ele disse: Que penhor é que te darei? E ela disse: O teu selo, e o teu cordão, e o cajado que está em tua mão. O que ele lhe deu, e possuiu-a, e ela concebeu dele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 19,
				"E ela se levantou, e se foi e tirou de sobre si o seu véu, e vestiu os vestidos da sua viuvez."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 20,
				"E Judá enviou o cabrito por mão do seu amigo, o adulamita, para tomar o penhor da mão da mulher; porém não a achou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 21,
				"E perguntou aos homens daquele lugar, dizendo: Onde está a prostituta que estava no caminho junto às duas fontes? E disseram: Aqui não esteve prostituta alguma."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 22,
				"E tornou-se a Judá e disse: Não a achei; e também disseram os homens daquele lugar: Aqui não esteve prostituta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 23,
				"Então disse Judá: Deixa-a ficar com o penhor, para que porventura não caiamos em desprezo; eis que tenho enviado este cabrito; mas tu não a achaste."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 24,
				"E aconteceu que, quase três meses depois, deram aviso a Judá, dizendo: Tamar, tua nora, adulterou, e eis que está grávida do adultério. Então disse Judá: Tirai-a fora para que seja queimada."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 25,
				"E tirando-a fora, ela mandou dizer a seu sogro: Do homem de quem são estas coisas eu concebi. E ela disse mais: Conhece, peço-te, de quem é este selo, e este cordão, e este cajado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 26,
				"E conheceu-os Judá e disse: Mais justa é ela do que eu, porquanto não a tenho dado a Selá meu filho. E nunca mais a conheceu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 27,
				"E aconteceu ao tempo de dar à luz que havia gêmeos em seu ventre;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 28,
				"E sucedeu que, dando ela à luz, que um pôs fora a mão, e a parteira tomou-a, e atou em sua mão um fio encarnado, dizendo: Este saiu primeiro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 29,
				"Mas aconteceu que, tornando ele a recolher a sua mão, eis que saiu o seu irmão, e ela disse: Como tu tens rompido, sobre ti é a rotura. E chamaram-lhe Perez."));
		verses.add(new Verse(null, 1l, 1l, 1l, 38, 30,
				"E depois saiu o seu irmão, em cuja mão estava o fio encarnado; e chamaram-lhe Zerá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 1,
				"E JOSÉ foi levado ao Egito, e Potifar, oficial de Faraó, capitão da guarda, homem egípcio, comprou-o da mão dos ismaelitas que o tinham levado lá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 2,
				"E o SENHOR estava com José, e foi homem próspero; e estava na casa de seu SENHOR egípcio."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 3,
				"Vendo, pois, o seu senhor que o SENHOR estava com ele, e tudo o que fazia o SENHOR prosperava em sua mão,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 4,
				"José achou graça em seus olhos, e servia-o; e ele o pôs sobre a sua casa, e entregou na sua mão tudo o que tinha."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 5,
				"E aconteceu que, desde que o pusera sobre a sua casa e sobre tudo o que tinha, o SENHOR abençoou a casa do egípcio por amor de José; e a bênção do SENHOR foi sobre tudo o que tinha, na casa e no campo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 6,
				"E deixou tudo o que tinha na mão de José, de maneira que nada sabia do que estava com ele, a não ser do pão que comia. E José era formoso de porte, e de semblante."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 7,
				"E aconteceu depois destas coisas que a mulher do seu senhor pôs os seus olhos em José, e disse: Deita-te comigo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 8,
				"Porém ele recusou, e disse à mulher do seu SENHOR: Eis que o meu senhor não sabe do que há em casa comigo, e entregou em minha mão tudo o que tem;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 9,
				"Ninguém há maior do que eu nesta casa, e nenhuma coisa me vedou, senão a ti, porquanto tu és sua mulher; como pois faria eu tamanha maldade, e pecaria contra Deus?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 10,
				"E aconteceu que, falando ela cada dia a José, e não lhe dando ele ouvidos, para deitar-se com ela, e estar com ela,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 11,
				"Sucedeu num certo dia que ele veio à casa para fazer seu serviço; e nenhum dos da casa estava ali;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 12,
				"E ela lhe pegou pela sua roupa, dizendo: Deita-te comigo. E ele deixou a sua roupa na mão dela, e fugiu, e saiu para fora."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 13,
				"E aconteceu que, vendo ela que deixara a sua roupa em sua mão, e fugira para fora,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 14,
				"Chamou aos homens de sua casa, e falou-lhes, dizendo: Vede, meu marido trouxe-nos um homem hebreu para escarnecer de nós; veio a mim para deitar-se comigo, e eu gritei com grande voz; 15 E aconteceu que, ouvindo ele que eu levantava a minha voz e gritava, deixou a sua roupa comigo, e fugiu, e saiu para fora."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 15, "Verszeile ohne Text"));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 16,
				"E ela pôs a sua roupa perto de si, até que o seu SENHOR voltou à sua casa."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 17,
				"Então falou-lhe conforme as mesmas palavras, dizendo: Veio a mim o servo hebreu, que nos trouxeste, para escarnecer de mim;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 18,
				"E aconteceu que, levantando eu a minha voz e gritando, ele deixou a sua roupa comigo, e fugiu para fora."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 19,
				"E aconteceu que, ouvindo o seu senhor as palavras de sua mulher, que lhe falava, dizendo: Conforme a estas mesmas palavras me fez teu servo, a sua ira se acendeu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 20,
				"E o senhor de José o tomou, e o entregou na casa do cárcere, no lugar onde os presos do rei estavam encarcerados; assim esteve ali na casa do cárcere."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 21,
				"O SENHOR, porém, estava com José, e estendeu sobre ele a sua benignidade, e deu-lhe graça aos olhos do carcereiro-mor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 22,
				"E o carcereiro-mor entregou na mão de José todos os presos que estavam na casa do cárcere, e ele ordenava tudo o que se fazia ali."));
		verses.add(new Verse(null, 1l, 1l, 1l, 39, 23,
				"E o carcereiro-mor não teve cuidado de nenhuma coisa que estava na mão dele, porquanto o SENHOR estava com ele, e tudo o que fazia o SENHOR prosperava."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 1,
				"E ACONTECEU, depois destas coisas, que o copeiro do rei do Egito, e o seu padeiro, ofenderam o seu SENHOR, o rei do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 2,
				"E indignou-se Faraó muito contra os seus dois oficiais, contra o copeiro-mor e contra o padeiro-mor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 3,
				"E entregou-os à prisão, na casa do capitão da guarda, na casa do cárcere, no lugar onde José estava preso."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 4,
				"E o capitão da guarda pô-los a cargo de José, para que os servisse; e estiveram muitos dias na prisão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 5,
				"E ambos tiveram um sonho, cada um seu sonho, na mesma noite, cada um conforme a interpretação do seu sonho, o copeiro e o padeiro do rei do Egito, que estavam presos na casa do cárcere."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 6,
				"E veio José a eles pela manhã, e olhou para eles, e viu que estavam perturbados."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 7,
				"Então perguntou aos oficiais de Faraó, que com ele estavam no cárcere da casa de seu senhor, dizendo: Por que estão hoje tristes os vossos semblantes?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 8,
				"E eles lhe disseram: Tivemos um sonho, e ninguém há que o interprete. E José disse-lhes: Não são de Deus as interpretações? Contai-mo, peço-vos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 9,
				"Então contou o copeiro-mor o seu sonho a José, e disse-lhe: Eis que em meu sonho havia uma vide diante da minha face."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 10,
				"E na vide três sarmentos, e brotando ela, a sua flor saía, e os seus cachos amadureciam em uvas;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 11,
				"E o copo de Faraó estava na minha mão, e eu tomava as uvas, e as espremia no copo de Faraó, e dava o copo na mão de Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 12,
				"Então disse-lhe José: Esta é a sua interpretação: Os três sarmentos são três dias;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 13,
				"Dentro ainda de três dias Faraó levantará a tua cabeça, e te restaurará ao teu estado, e darás o copo de Faraó na sua mão, conforme o costume antigo, quando eras seu copeiro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 14,
				"Porém lembra-te de mim, quando te for bem; e rogo-te que uses comigo de compaixão, e que faças menção de mim a Faraó, e faze-me sair desta casa;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 15,
				"Porque, de fato, fui roubado da terra dos hebreus; e tampouco aqui nada tenho feito para que me pusessem nesta cova."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 16,
				"Vendo então o padeiro-mor que tinha interpretado bem, disse a José: Eu também sonhei, e eis que três cestos brancos estavam sobre a minha cabeça;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 17,
				"E no cesto mais alto havia de todos os manjares de Faraó, obra de padeiro; e as aves o comiam do cesto, de sobre a minha cabeça."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 18,
				"Então respondeu José, e disse: Esta é a sua interpretação: Os três cestos são três dias;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 19,
				"Dentro ainda de três dias Faraó tirará a tua cabeça e te pendurará num pau, e as aves comerão a tua carne de sobre ti."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 20,
				"E aconteceu ao terceiro dia, o dia do nascimento de Faraó, que fez um banquete a todos os seus servos; e levantou a cabeça do copeiro-mor, e a cabeça do padeiro-mor, no meio dos seus servos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 21,
				"E fez tornar o copeiro-mor ao seu ofício de copeiro, e este deu o copo na mão de Faraó,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 22, "Mas ao padeiro-mor enforcou, como José havia interpretado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 40, 23,
				"O copeiro-mor, porém, não se lembrou de José, antes se esqueceu dele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 1,
				"E ACONTECEU que, ao fim de dois anos inteiros, Faraó sonhou, e eis que estava em pé junto ao rio."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 2,
				"E eis que subiam do rio sete vacas, formosas à vista e gordas de carne, e pastavam no prado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 3,
				"E eis que subiam do rio após elas outras sete vacas, feias à vista e magras de carne; e paravam junto às outras vacas na praia do rio."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 4,
				"E as vacas feias à vista e magras de carne, comiam as sete vacas formosas à vista e gordas. Então acordou Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 5,
				"Depois dormiu e sonhou outra vez, e eis que brotavam de um mesmo pé sete espigas cheias e boas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 6,
				"E eis que sete espigas miúdas, e queimadas do vento oriental, brotavam após elas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 7,
				"E as espigas miúdas devoravam as sete espigas grandes e cheias. Então acordou Faraó, e eis que era um sonho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 8,
				"E aconteceu que pela manhã o seu espírito perturbou-se, e enviou e chamou todos os adivinhadores do Egito, e todos os seus sábios; e Faraó contou-lhes os seus sonhos, mas ninguém havia que lhos interpretasse."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 9,
				"Então falou o copeiro-mor a Faraó, dizendo: Das minhas ofensas me lembro hoje:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 10,
				"Estando Faraó muito indignado contra os seus servos, e pondo-me sob prisão na casa do capitão da guarda, a mim e ao padeiro-mor,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 11,
				"Então tivemos um sonho na mesma noite, eu e ele; sonhamos, cada um conforme a interpretação do seu sonho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 12,
				"E estava ali conosco um jovem hebreu, servo do capitão da guarda, e contamos-lhe os nossos sonhos e ele no-los interpretou, a cada um conforme o seu sonho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 13,
				"E como ele nos interpretou, assim aconteceu; a mim me foi restituído o meu cargo, e ele foi enforcado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 14,
				"Então mandou Faraó chamar a José, e o fizeram sair logo do cárcere; e barbeou-se e mudou as suas roupas e apresentou-se a Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 15,
				"E Faraó disse a José: Eu tive um sonho, e ninguém há que o interprete; mas de ti ouvi dizer que quando ouves um sonho o interpretas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 16,
				"E respondeu José a Faraó, dizendo: Isso não está em mim; Deus dará resposta de paz a Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 17,
				"Então disse Faraó a José: Eis que em meu sonho estava eu em pé na margem do rio,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 18,
				"E eis que subiam do rio sete vacas gordas de carne e formosas à vista, e pastavam no prado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 19,
				"E eis que outras sete vacas subiam após estas, muito feias à vista e magras de carne; não tenho visto outras tais, quanto à fealdade, em toda a terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 20,
				"E as vacas magras e feias comiam as primeiras sete vacas gordas;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 21,
				"E entravam em suas entranhas, mas não se conhecia que houvessem entrado; porque o seu parecer era feio como no princípio. Então acordei."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 22,
				"Depois vi em meu sonho, e eis que de um mesmo pé subiam sete espigas cheias e boas;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 23,
				"E eis que sete espigas secas, miúdas e queimadas do vento oriental, brotavam após elas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 24,
				"E as sete espigas miúdas devoravam as sete espigas boas. E eu contei isso aos magos, mas ninguém houve que mo interpretasse."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 25,
				"Então disse José a Faraó: O sonho de Faraó é um só; o que Deus há de fazer, mostrou-o a Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 26,
				"As sete vacas formosas são sete anos, as sete espigas formosas também são sete anos, o sonho é um só."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 27,
				"E as sete vacas feias à vista e magras, que subiam depois delas, são sete anos, e as sete espigas miúdas e queimadas do vento oriental, serão sete anos de fome."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 28,
				"Esta é a palavra que tenho dito a Faraó; o que Deus há de fazer, mostrou-o a Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 29,
				"E eis que vêm sete anos, e haverá grande fartura em toda a terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 30,
				"E depois deles levantar-se-ão sete anos de fome, e toda aquela fartura será esquecida na terra do Egito, e a fome consumirá a terra;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 31,
				"E não será conhecida a abundância na terra, por causa daquela fome que haverá depois; porquanto será gravíssima."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 32,
				"E que o sonho foi repetido duas vezes a Faraó, é porque esta coisa é determinada por Deus, e Deus se apressa em fazê-la."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 33,
				"Portanto, Faraó previna-se agora de um homem entendido e sábio, e o ponha sobre a terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 34,
				"Faça isso Faraó e ponha governadores sobre a terra, e tome a quinta parte da terra do Egito nos sete anos de fartura,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 35,
				"E ajuntem toda a comida destes bons anos, que vêm, e amontoem o trigo debaixo da mão de Faraó, para mantimento nas cidades, e o guardem."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 36,
				"Assim será o mantimento para provimento da terra, para os sete anos de fome, que haverá na terra do Egito; para que a terra não pereça de fome."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 37,
				"E esta palavra foi boa aos olhos de Faraó, e aos olhos de todos os seus servos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 38,
				"E disse Faraó a seus servos: Acharíamos um homem como este em quem haja o espírito de Deus?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 39,
				"Depois disse Faraó a José: Pois que Deus te fez saber tudo isto, ninguém há tão entendido e sábio como tu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 40,
				"Tu estarás sobre a minha casa, e por tua boca se governará todo o meu povo, somente no trono eu serei maior que tu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 41,
				"Disse mais Faraó a José: Vês aqui te tenho posto sobre toda a terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 42,
				"E tirou Faraó o anel da sua mão, e o pôs na mão de José, e o fez vestir de roupas de linho fino, e pôs um colar de ouro no seu pescoço."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 43,
				"E o fez subir no segundo carro que tinha, e clamavam diante dele: Ajoelhai. Assim o pôs sobre toda a terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 44,
				"E disse Faraó a José: Eu sou Faraó; porém sem ti ninguém levantará a sua mão ou o seu pé em toda a terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 45,
				"E Faraó chamou a José de Zafenate-Panéia, e deu-lhe por mulher a Azenate, filha de Potífera, sacerdote de Om; e saiu José por toda a terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 46,
				"E José era da idade de trinta anos quando se apresentou a Faraó, rei do Egito. E saiu José da presença de Faraó e passou por toda a terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 47,
				"E nos sete anos de fartura a terra produziu abundantemente. 48 E ele ajuntou todo o mantimento dos sete anos, que houve na terra do Egito; e guardou o mantimento nas cidades, pondo nas mesmas o mantimento do campo que estava ao redor de cada cidade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 48, "Verszeile ohne Text"));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 49,
				"Assim ajuntou José muitíssimo trigo, como a areia do mar, até que cessou de contar; porquanto não havia numeração."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 50,
				"E nasceram a José dois filhos (antes que viesse um ano de fome), que lhe deu Azenate, filha de Potífera, sacerdote de Om."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 51,
				"E chamou José ao primogênito Manassés, porque disse: Deus me fez esquecer de todo o meu trabalho, e de toda a casa de meu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 52,
				"E ao segundo chamou Efraim; porque disse: Deus me fez crescer na terra da minha aflição."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 53,
				"Então acabaram-se os sete anos de fartura que havia na terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 54,
				"E começaram a vir os sete anos de fome, como José tinha dito; e havia fome em todas as terras, mas em toda a terra do Egito havia pão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 55,
				"E tendo toda a terra do Egito fome, clamou o povo a Faraó por pão; e Faraó disse a todos os egípcios: Ide a José; o que ele vos disser, fazei."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 56,
				"Havendo, pois, fome sobre toda a terra, abriu José tudo em que havia mantimento, e vendeu aos egípcios; porque a fome prevaleceu na terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 41, 57,
				"E de todas as terras vinham ao Egito, para comprar de José; porquanto a fome prevaleceu em todas as terras."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 1,
				"VENDO então Jacó que havia mantimento no Egito, disse a seus filhos: Por que estais olhando uns para os outros?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 2,
				"Disse mais: Eis que tenho ouvido que há mantimentos no Egito; descei para lá, e comprai-nos dali, para que vivamos e não morramos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 3,
				"Então desceram os dez irmãos de José, para comprarem trigo no Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 4,
				"A Benjamim, porém, irmão de José, não enviou Jacó com os seus irmãos, porque dizia: Para que lhe não suceda, porventura, algum desastre."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 5,
				"Assim, entre os que iam lá foram os filhos de Israel para comprar, porque havia fome na terra de Canaã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 6,
				"José, pois, era o governador daquela terra; ele vendia a todo o povo da terra; e os irmãos de José chegaram e inclinaram-se a ele, com o rosto em terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 7,
				"E José, vendo os seus irmãos, conheceu-os; porém mostrou-se estranho para com eles, e falou-lhes asperamente, e disse-lhes: De onde vindes? E eles disseram: Da terra de Canaã, para comprarmos mantimento."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 42, 8, "José, pois, conheceu os seus irmãos; mas eles não o conheceram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 9,
				"Então José lembrou-se dos sonhos que havia tido deles e disse-lhes: Vós sois espias, e viestes para ver a nudez da terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 10,
				"E eles lhe disseram: Não, senhor meu; mas teus servos vieram comprar mantimento."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 11,
				"Todos nós somos filhos de um mesmo homem; somos homens de retidão; os teus servos não são espias."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 42, 12, "E ele lhes disse: Não; antes viestes para ver a nudez da terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 13,
				"E eles disseram: Nós, teus servos, somos doze irmãos, filhos de um homem na terra de Canaã; e eis que o mais novo está com nosso pai hoje; mas um já não existe."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 14,
				"Então lhes disse José: Isso é o que vos tenho dito, sois espias;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 15,
				"Nisto sereis provados; pela vida de Faraó, não saireis daqui senão quando vosso irmão mais novo vier aqui."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 16,
				"Enviai um dentre vós, que traga vosso irmão, mas vós ficareis presos, e vossas palavras sejam provadas, se há verdade convosco; e se não, pela vida de Faraó, vós sois espias."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 17, "E pô-los juntos, em prisão, três dias."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 18,
				"E ao terceiro dia disse-lhes José: Fazei isso, e vivereis; porque eu temo a Deus."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 19,
				"Se sois homens de retidão, que fique um de vossos irmãos preso na casa de vossa prisão; e vós ide, levai mantimento para a fome de vossa casa,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 20,
				"E trazei-me o vosso irmão mais novo, e serão verificadas vossas palavras, e não morrereis. E eles assim fizeram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 21,
				"Então disseram uns aos outros: Na verdade, somos culpados acerca de nosso irmão, pois vimos a angústia da sua alma, quando nos rogava; nós porém não ouvimos, por isso vem sobre nós esta angústia."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 22,
				"E Rúben respondeu-lhes, dizendo: Não vo-lo dizia eu: Não pequeis contra o menino; mas não ouvistes; e vedes aqui, o seu sangue também é requerido."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 23,
				"E eles não sabiam que José os entendia, porque havia intérprete entre eles."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 24,
				"E retirou-se deles e chorou. Depois tornou a eles, e falou-lhes, e tomou a Simeão dentre eles, e amarrou-o perante os seus olhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 25,
				"E ordenou José, que enchessem os seus sacos de trigo, e que lhes restituíssem o seu dinheiro a cada um no seu saco, e lhes dessem comida para o caminho; e fizeram-lhes assim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 26,
				"E carregaram o seu trigo sobre os seus jumentos e partiram dali."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 27,
				"E, abrindo um deles o seu saco, para dar pasto ao seu jumento na estalagem, viu o seu dinheiro; porque eis que estava na boca do seu saco."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 28,
				"E disse a seus irmãos: Devolveram o meu dinheiro, e ei-lo também aqui no saco. Então lhes desfaleceu o coração, e pasmavam, dizendo um ao outro: Que é isto que Deus nos tem feito?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 29,
				"E vieram para Jacó, seu pai, na terra de Canaã; e contaram-lhe tudo o que lhes aconteceu, dizendo:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 30,
				"O homem, o senhor da terra, falou conosco asperamente, e tratou-nos como espias da terra;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 31, "Mas dissemos-lhe: Somos homens de retidão; não somos espias;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 32,
				"Somos doze irmãos, filhos de nosso pai; um não mais existe, e o mais novo está hoje com nosso pai na terra de Canaã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 33,
				"E aquele homem, o senhor da terra, nos disse: Nisto conhecerei que vós sois homens de retidão; deixai comigo um de vossos irmãos, e tomai para a fome de vossas casas, e parti,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 34,
				"E trazei-me vosso irmão mais novo; assim saberei que não sois espias, mas homens de retidão; então vos darei o vosso irmão e negociareis na terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 35,
				"E aconteceu que, despejando eles os seus sacos, eis que cada um tinha o pacote com seu dinheiro no seu saco; e viram os pacotes com seu dinheiro, eles e seu pai, e temeram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 36,
				"Então Jacó, seu pai, disse-lhes: Tendes-me desfilhado; José já não existe e Simeão não está aqui; agora levareis a Benjamim. Todas estas coisas vieram sobre mim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 37,
				"Mas Rúben falou a seu pai, dizendo: Mata os meus dois filhos, se eu não tornar a trazê-lo para ti; entrega-o em minha mão, e tornarei a trazê-lo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 42, 38,
				"Ele porém disse: Não descerá meu filho convosco; porquanto o seu irmão é morto, e só ele ficou. Se lhe suceder algum desastre no caminho por onde fordes, fareis descer minhas cãs com tristeza à sepultura."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 1, "E A FOME era gravíssima na terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 2,
				"E aconteceu que, como acabaram de comer o mantimento que trouxeram do Egito, disse-lhes seu pai: Voltai, comprai-nos um pouco de alimento."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 3,
				"Mas Judá respondeu-lhe, dizendo: Fortemente nos protestou aquele homem, dizendo: Não vereis a minha face, se o vosso irmão não vier convosco."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 4,
				"Se enviares conosco o nosso irmão, desceremos e te compraremos alimento;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 5,
				"Mas se não o enviares, não desceremos; porquanto aquele homem nos disse: Não vereis a minha face, se o vosso irmão não vier convosco."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 6,
				"E disse Israel: Por que me fizeste tal mal, fazendo saber àquele homem que tínheis ainda outro irmão?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 7,
				"E eles disseram: Aquele homem particularmente nos perguntou por nós, e pela nossa parentela, dizendo: Vive ainda vosso pai? Tendes mais um irmão? E respondemos-lhe conforme as mesmas palavras. Podíamos nós saber que diria: Trazei vosso irmão?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 8,
				"Então disse Judá a Israel, seu pai: Envia o jovem comigo, e levantar-nos-emos, e iremos, para que vivamos e não morramos, nem nós, nem tu, nem os nossos filhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 9,
				"Eu serei fiador por ele, da minha mão o requererás; se eu não o trouxer, e não o puser perante a tua face, serei réu de crime para contigo para sempre."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 10,
				"E se não nos tivéssemos detido, certamente já estaríamos segunda vez de volta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 11,
				"Então disse-lhes Israel, seu pai: Pois que assim é, fazei isso; tomai do mais precioso desta terra em vossos vasos, e levai ao homem um presente: um pouco do bálsamo e um pouco de mel, especiarias e mirra, terebinto e amêndoas;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 12,
				"E tomai em vossas mãos dinheiro em dobro, e o dinheiro que voltou na boca dos vossos sacos tornai a levar em vossas mãos; bem pode ser que fosse erro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 13,
				"Tomai também a vosso irmão, e levantai-vos e voltai àquele homem;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 14,
				"E Deus Todo-Poderoso vos dê misericórdia diante do homem, para que deixe vir convosco vosso outro irmão, e Benjamim; e eu, se for desfilhado, desfilhado ficarei."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 15,
				"E os homens tomaram aquele presente, e dinheiro em dobro em suas mãos, e a Benjamim; e levantaram-se, e desceram ao Egito, e apresentaram-se diante de José."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 16,
				"Vendo, pois, José a Benjamim com eles, disse ao que estava sobre a sua casa: Leva estes homens à casa, e mata reses, e prepara tudo; porque estes homens comerão comigo ao meio-dia."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 17, "E o homem fez como José dissera, e levou-os à casa de José."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 18,
				"Então temeram aqueles homens, porquanto foram levados à casa de José, e diziam: Por causa do dinheiro que dantes voltou nos nossos sacos, fomos trazidos aqui, para nos incriminar e cair sobre nós, para que nos tome por servos, e a nossos jumentos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 19,
				"Por isso chegaram-se ao homem que estava sobre a casa de José, e falaram com ele à porta da casa,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 20,
				"E disseram: Ai! senhor meu, certamente descemos dantes a comprar mantimento;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 21,
				"E aconteceu que, chegando à estalagem, e abrindo os nossos sacos, eis que o dinheiro de cada um estava na boca do seu saco, nosso dinheiro por seu peso; e tornamos a trazê-lo em nossas mãos;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 22,
				"Também trouxemos outro dinheiro em nossas mãos, para comprar mantimento; não sabemos quem tenha posto o nosso dinheiro nos nossos sacos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 23,
				"E ele disse: Paz seja convosco, não temais; o vosso Deus, e o Deus de vosso pai, vos tem dado um tesouro nos vossos sacos; o vosso dinheiro me chegou a mim. E trouxe-lhes fora a Simeão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 24,
				"Depois levou os homens à casa de José, e deu-lhes água, e lavaram os seus pés; também deu pasto aos seus jumentos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 25,
				"E prepararam o presente, para quando José viesse ao meio dia; porque tinham ouvido que ali haviam de comer pão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 26,
				"Vindo, pois, José à casa, trouxeram-lhe ali o presente que tinham em suas mãos; e inclinaram-se a ele até à terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 27,
				"E ele lhes perguntou como estavam, e disse: Vosso pai, o ancião de quem falastes, está bem? Ainda vive?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 28,
				"E eles disseram: Bem está o teu servo, nosso pai vive ainda. E abaixaram a cabeça, e inclinaram-se."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 29,
				"E ele levantou os seus olhos, e viu a Benjamim, seu irmão, filho de sua mãe, e disse: Este é vosso irmão mais novo de quem falastes? Depois ele disse: Deus te dê a sua graça, meu filho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 30,
				"E José apressou-se, porque as suas entranhas comoveram-se por causa do seu irmão, e procurou onde chorar; e entrou na câmara, e chorou ali."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 31,
				"Depois lavou o seu rosto, e saiu; e conteve-se, e disse: Ponde pão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 32,
				"E serviram-lhe à parte, e a eles também à parte, e aos egípcios, que comiam com ele, à parte; porque os egípcios não podem comer pão com os hebreus, porquanto é abominação para os egípcios."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 33,
				"E assentaram-se diante dele, o primogênito segundo a sua primogenitura, e o menor segundo a sua menoridade; do que os homens se maravilhavam entre si."));
		verses.add(new Verse(null, 1l, 1l, 1l, 43, 34,
				"E apresentou-lhes as porções que estavam diante dele; porém a porção de Benjamim era cinco vezes maior do que as porções deles todos. E eles beberam, e se regalaram com ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 1,
				"E DEU ordem ao que estava sobre a sua casa, dizendo: Enche de mantimento os sacos destes homens, quanto puderem levar, e põe o dinheiro de cada um na boca do seu saco."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 2,
				"E o meu copo, o copo de prata, porás na boca do saco do mais novo, com o dinheiro do seu trigo. E fez conforme a palavra que José tinha dito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 3,
				"Vinda a luz da manhã, despediram-se estes homens, eles com os seus jumentos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 4,
				"Saindo eles da cidade, e não se havendo ainda distanciado, disse José ao que estava sobre a sua casa: Levanta-te, e persegue aqueles homens; e, alcançando-os, lhes dirás: Por que pagastes mal por bem?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 5,
				"Não é este o copo em que bebe meu senhor e pelo qual bem adivinha? Procedestes mal no que fizestes."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 6, "E alcançou-os, e falou-lhes as mesmas palavras."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 7,
				"E eles disseram-lhe: Por que diz meu senhor tais palavras? Longe estejam teus servos de fazerem semelhante coisa."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 8,
				"Eis que o dinheiro, que temos achado nas bocas dos nossos sacos, te tornamos a trazer desde a terra de Canaã; como, pois, furtaríamos da casa do teu senhor prata ou ouro?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 9,
				"Aquele, com quem de teus servos for achado, morra; e ainda nós seremos escravos do meu senhor."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 10,
				"E ele disse: Ora seja também assim conforme as vossas palavras; aquele com quem se achar será meu escravo, porém vós sereis desculpados."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 11,
				"E eles apressaram-se e cada um pôs em terra o seu saco, e cada um abriu o seu saco."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 12,
				"E buscou, começando do maior, e acabando no mais novo; e achou-se o copo no saco de Benjamim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 13,
				"Então rasgaram as suas vestes, e carregou cada um o seu jumento, e tornaram à cidade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 14,
				"E veio Judá com os seus irmãos à casa de José, porque ele ainda estava ali; e prostraram-se diante dele em terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 15,
				"E disse-lhes José: Que é isto que fizestes? Não sabeis vós que um homem como eu pode, muito bem, adivinhar?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 16,
				"Então disse Judá: Que diremos a meu senhor? Que falaremos? E como nos justificaremos? Achou Deus a iniqüidade de teus servos; eis que somos escravos de meu senhor, tanto nós como aquele em cuja mão foi achado o copo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 17,
				"Mas ele disse: Longe de mim que eu tal faça; o homem em cuja mão o copo foi achado, esse será meu servo; porém vós, subi em paz para vosso pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 18,
				"Então Judá se chegou a ele, e disse: Ai! senhor meu, deixa, peço-te, o teu servo dizer uma palavra aos ouvidos de meu senhor, e não se acenda a tua ira contra o teu servo; porque tu és como Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 19,
				"Meu senhor perguntou a seus servos, dizendo: Tendes vós pai, ou irmão?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 20,
				"E dissemos a meu senhor: Temos um velho pai, e um filho da sua velhice, o mais novo, cujo irmão é morto; e só ele ficou de sua mãe, e seu pai o ama."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 21,
				"Então tu disseste a teus servos: Trazei-mo a mim, e porei os meus olhos sobre ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 22,
				"E nós dissemos a meu senhor: Aquele moço não poderá deixar a seu pai; se deixar a seu pai, este morrerá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 23,
				"Então tu disseste a teus servos: Se vosso irmão mais novo não descer convosco, nunca mais vereis a minha face."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 24,
				"E aconteceu que, subindo nós a teu servo meu pai, e contando-lhe as palavras de meu senhor,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 25, "Disse nosso pai: Voltai, comprai-nos um pouco de mantimento."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 26,
				"E nós dissemos: Não poderemos descer; mas, se nosso irmão menor for conosco, desceremos; pois não poderemos ver a face do homem se este nosso irmão menor não estiver conosco."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 27,
				"Então disse-nos teu servo, meu pai: Vós sabeis que minha mulher me deu dois filhos;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 28,
				"E um ausentou-se de mim, e eu disse: Certamente foi despedaçado, e não o tenho visto até agora;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 29,
				"Se agora também tirardes a este da minha face, e lhe acontecer algum desastre, fareis descer as minhas cãs com aflição à sepultura."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 30,
				"Agora, pois, indo eu a teu servo, meu pai, e o moço não indo conosco, como a sua alma está ligada com a alma dele,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 31,
				"Acontecerá que, vendo ele que o moço ali não está, morrerá; e teus servos farão descer as cãs de teu servo, nosso pai, com tristeza à sepultura."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 32,
				"Porque teu servo se deu por fiador por este moço para com meu pai, dizendo: Se eu o não tornar para ti, serei culpado para com meu pai por todos os dias."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 33,
				"Agora, pois, fique teu servo em lugar deste moço por escravo de meu senhor, e que suba o moço com os seus irmãos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 44, 34,
				"Porque, como subirei eu a meu pai, se o moço não for comigo? para que não veja eu o mal que sobrevirá a meu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 1,
				"ENTÃO José não se podia conter diante de todos os que estavam com ele; e clamou: Fazei sair daqui a todo o homem; e ninguém ficou com ele, quando José se deu a conhecer a seus irmãos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 2,
				"E levantou a sua voz com choro, de maneira que os egípcios o ouviam, e a casa de Faraó o ouviu."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 3,
				"E disse José a seus irmãos: Eu sou José; vive ainda meu pai? E seus irmãos não lhe puderam responder, porque estavam pasmados diante da sua face."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 4,
				"E disse José a seus irmãos: Peço-vos, chegai-vos a mim. E chegaram-se; então disse ele: Eu sou José vosso irmão, a quem vendestes para o Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 5,
				"Agora, pois, não vos entristeçais, nem vos pese aos vossos olhos por me haverdes vendido para cá; porque para conservação da vida, Deus me enviou adiante de vós."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 6,
				"Porque já houve dois anos de fome no meio da terra, e ainda restam cinco anos em que não haverá lavoura nem sega."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 7,
				"Pelo que Deus me enviou adiante de vós, para conservar vossa sucessão na terra, e para guardar-vos em vida por um grande livramento."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 8,
				"Assim não fostes vós que me enviastes para cá, senão Deus, que me tem posto por pai de Faraó, e por senhor de toda a sua casa, e como regente em toda a terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 9,
				"Apressai-vos, e subi a meu pai, e dizei-lhe: Assim tem dito o teu filho José: Deus me tem posto por senhor em toda a terra do Egito; desce a mim, e não te demores;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 10,
				"E habitarás na terra de Gósen, e estarás perto de mim, tu e os teus filhos, e os filhos dos teus filhos, e as tuas ovelhas, e as tuas vacas, e tudo o que tens."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 11,
				"E ali te sustentarei, porque ainda haverá cinco anos de fome, para que não pereças de pobreza, tu e tua casa, e tudo o que tens."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 12,
				"E eis que vossos olhos, e os olhos de meu irmão Benjamim, vêem que é minha boca que vos fala."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 13,
				"E fazei saber a meu pai toda a minha glória no Egito, e tudo o que tendes visto, e apressai-vos a fazer descer meu pai para cá."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 14,
				"E lançou-se ao pescoço de Benjamim seu irmão, e chorou; e Benjamim chorou também ao seu pescoço."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 15,
				"E beijou a todos os seus irmãos, e chorou sobre eles; e depois seus irmãos falaram com ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 16,
				"E esta notícia ouviu-se na casa de Faraó: Os irmãos de José são vindos; e pareceu bem aos olhos de Faraó, e aos olhos de seus servos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 17,
				"E disse Faraó a José: Dize a teus irmãos: Fazei isto: carregai os vossos animais e parti, tornai à terra de Canaã."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 18,
				"E tornai a vosso pai, e às vossas famílias, e vinde a mim; e eu vos darei o melhor da terra do Egito, e comereis da fartura da terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 19,
				"A ti, pois, é ordenado: Fazei isto: tomai vós da terra do Egito carros para vossos meninos, para vossas mulheres, e para vosso pai, e vinde."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 20,
				"E não vos pese coisa alguma dos vossos utensílios; porque o melhor de toda a terra do Egito será vosso."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 21,
				"E os filhos de Israel fizeram assim. E José deu-lhes carros, conforme o mandado de Faraó; também lhes deu comida para o caminho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 22,
				"A todos lhes deu, a cada um, mudas de roupas; mas a Benjamim deu trezentas peças de prata, e cinco mudas de roupas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 23,
				"E a seu pai enviou semelhantemente dez jumentos carregados do melhor do Egito, e dez jumentos carregados de trigo e pão, e comida para seu pai, para o caminho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 24,
				"E despediu os seus irmãos, e partiram; e disse-lhes: Não contendais pelo caminho."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 45, 25, "E subiram do Egito, e vieram à terra de Canaã, a Jacó seu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 26,
				"Então lhe anunciaram, dizendo: José ainda vive, e ele também é regente em toda a terra do Egito. E o seu coração desmaiou, porque não os acreditava."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 27,
				"Porém, havendo-lhe eles contado todas as palavras de José, que ele lhes falara, e vendo ele os carros que José enviara para levá-lo, reviveu o espírito de Jacó seu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 45, 28,
				"E disse Israel: Basta; ainda vive meu filho José; eu irei e o verei antes que morra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 1,
				"E PARTIU Israel com tudo quanto tinha, e veio a Berseba, e ofereceu sacrifícios ao Deus de seu pai Isaque."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 2,
				"E falou Deus a Israel em visões de noite, e disse: Jacó, Jacó! E ele disse: Eis-me aqui."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 3,
				"E disse: Eu sou Deus, o Deus de teu pai; não temas descer ao Egito, porque eu te farei ali uma grande nação."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 4,
				"E descerei contigo ao Egito, e certamente te farei tornar a subir, e José porá a sua mão sobre os teus olhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 5,
				"Então levantou-se Jacó de Berseba; e os filhos de Israel levaram a seu pai Jacó, e seus meninos, e as suas mulheres, nos carros que Faraó enviara para o levar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 6,
				"E tomaram o seu gado e os seus bens que tinham adquirido na terra de Canaã, e vieram ao Egito, Jacó e toda a sua descendência com ele;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 7,
				"Os seus filhos e os filhos de seus filhos com ele, as filhas, e as filhas de seus filhos, e toda a sua descendência levou consigo ao Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 8,
				"E estes são os nomes dos filhos de Israel, que vieram ao Egito, Jacó e seus filhos: Rúben, o primogênito de Jacó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 9, "E os filhos de Rúben: Enoque, Palu, Hezrom e Carmi."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 10,
				"E os filhos de Simeão: Jemuel, Jamim, Oade, Jaquim, Zoar e Saul, filho de uma mulher cananéia."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 11, "E os filhos de Levi: Gérson, Coate e Merari."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 12,
				"E os filhos de Judá: Er, Onã, Selá, Perez e Zerá; Er e Onã, porém, morreram na terra de Canaã; e os filhos de Perez foram Hezrom e Hamul."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 13, "E os filhos de Issacar: Tola, Puva, Jó e Sinrom."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 14, "E os filhos de Zebulom: Serede, Elom e Jaleel."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 15,
				"Estes são os filhos de Lia, que ela deu a Jacó em Padã-Arã, além de Diná, sua filha; todas as almas de seus filhos e de suas filhas foram trinta e três."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 16,
				"E os filhos de Gade: Zifiom, Hagi, Suni, Esbom, Eri, Arodi e Areli."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 17,
				"E os filhos de Aser: Imna, Isvá, Isvi, Berias e Sera, a irmã deles; e os filhos de Berias: Héber e Malquiel."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 18,
				"Estes são os filhos de Zilpa, a qual Labão deu à sua filha Lia; e deu a Jacó estas dezesseis almas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 19, "Os filhos de Raquel, mulher de Jacó: José e Benjamim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 20,
				"E nasceram a José na terra do Egito, Manassés e Efraim, que lhe deu Azenate, filha de Potífera, sacerdote de Om."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 21,
				"E os filhos de Benjamim: Belá, Bequer, Asbel, Gera, Naamã, Eí, Rôs, Mupim, Hupim e Arde."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 22,
				"Estes são os filhos de Raquel, que nasceram a Jacó, ao todo catorze almas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 23, "E o filho de Dã: Husim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 24, "E os filhos de Naftali: Jazeel, Guni, Jezer e Silém."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 25,
				"Estes são os filhos de Bila, a qual Labão deu à sua filha Raquel; e deu estes a Jacó; todas as almas foram sete."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 26,
				"Todas as almas que vieram com Jacó ao Egito, que saíram dos seus lombos, fora as mulheres dos filhos de Jacó, todas foram sessenta e seis almas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 27,
				"E os filhos de José, que lhe nasceram no Egito, eram duas almas. Todas as almas da casa de Jacó, que vieram ao Egito, eram setenta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 28,
				"E Jacó enviou Judá adiante de si a José, para o encaminhar a Gósen; e chegaram à terra de Gósen."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 29,
				"Então José aprontou o seu carro, e subiu ao encontro de Israel, seu pai, a Gósen. E, apresentando-se-lhe, lançou-se ao seu pescoço, e chorou sobre o seu pescoço longo tempo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 30,
				"E Israel disse a José: Morra eu agora, pois já tenho visto o teu rosto, que ainda vives."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 31,
				"Depois disse José a seus irmãos, e à casa de seu pai: Eu subirei e anunciarei a Faraó, e lhe direi: Meus irmãos e a casa de meu pai, que estavam na terra de Canaã, vieram a mim!"));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 32,
				"E os homens são pastores de ovelhas, porque são homens de gado, e trouxeram consigo as suas ovelhas, e as suas vacas, e tudo o que têm."));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 33,
				"Quando, pois, acontecer que Faraó vos chamar, e disser: Qual é o vosso negócio?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 46, 34,
				"Então direis: Teus servos foram homens de gado desde a nossa mocidade até agora, tanto nós como os nossos pais; para que habiteis na terra de Gósen, porque todo o pastor de ovelhas é abominação aos egípcios."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 1,
				"ENTÃO veio José e anunciou a Faraó, e disse: Meu pai e os meus irmãos e as suas ovelhas, e as suas vacas, com tudo o que têm, são vindos da terra de Canaã, e eis que estão na terra de Gósen."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 2,
				"E tomou uma parte de seus irmãos, a saber, cinco homens, e os pôs diante de Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 3,
				"Então disse Faraó a seus irmãos: Qual é o vosso negócio? E eles disseram a Faraó: Teus servos são pastores de ovelhas, tanto nós como nossos pais."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 4,
				"Disseram mais a Faraó: Viemos para peregrinar nesta terra; porque não há pasto para as ovelhas de teus servos, porquanto a fome é grave na terra de Canaã; agora, pois, rogamos-te que teus servos habitem na terra de Gósen."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 5,
				"Então falou Faraó a José, dizendo: Teu pai e teus irmãos vieram a ti;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 6,
				"A terra do Egito está diante de ti; no melhor da terra faze habitar teu pai e teus irmãos; habitem na terra de Gósen, e se sabes que entre eles há homens valentes, os porás por maiorais do gado, sobre o que eu tenho."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 7,
				"E trouxe José a Jacó, seu pai, e o apresentou a Faraó; e Jacó abençoou a Faraó."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 47, 8, "E Faraó disse a Jacó: Quantos são os dias dos anos da tua vida?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 9,
				"E Jacó disse a Faraó: Os dias dos anos das minhas peregrinações são cento e trinta anos, poucos e maus foram os dias dos anos da minha vida, e não chegaram aos dias dos anos da vida de meus pais nos dias das suas peregrinações."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 10, "E Jacó abençoou a Faraó, e saiu da sua presença."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 11,
				"E José fez habitar a seu pai e seus irmãos e deu-lhes possessão na terra do Egito, no melhor da terra, na terra de Ramessés, como Faraó ordenara."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 12,
				"E José sustentou de pão a seu pai, seus irmãos e toda a casa de seu pai, segundo as suas famílias."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 13,
				"E não havia pão em toda a terra, porque a fome era muito grave; de modo que a terra do Egito e a terra de Canaã desfaleciam por causa da fome."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 14,
				"Então José recolheu todo o dinheiro que se achou na terra do Egito, e na terra de Canaã, pelo trigo que compravam; e José trouxe o dinheiro à casa de Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 15,
				"Acabando-se, pois, o dinheiro da terra do Egito, e da terra de Canaã, vieram todos os egípcios a José, dizendo: Dá-nos pão; por que morreremos em tua presença? porquanto o dinheiro nos falta."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 16,
				"E José disse: Dai o vosso gado, e eu vo-lo darei por vosso gado, se falta o dinheiro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 17,
				"Então trouxeram o seu gado a José; e José deu-lhes pão em troca de cavalos, e das ovelhas, e das vacas e dos jumentos; e os sustentou de pão aquele ano por todo o seu gado."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 18,
				"E acabado aquele ano, vieram a ele no segundo ano e disseram-lhe: Não ocultaremos ao meu senhor que o dinheiro acabou; e meu senhor possui os animais, e nenhuma outra coisa nos ficou diante de meu senhor, senão o nosso corpo e a nossa terra;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 19,
				"Por que morreremos diante dos teus olhos, tanto nós como a nossa terra? Compra-nos a nós e a nossa terra por pão, e nós e a nossa terra seremos servos de Faraó; e dá-nos semente, para que vivamos, e não morramos, e a terra não se desole."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 20,
				"Assim José comprou toda a terra do Egito para Faraó, porque os egípcios venderam cada um o seu campo, porquanto a fome prevaleceu sobre eles; e a terra ficou sendo de Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 21,
				"E, quanto ao povo, fê-lo passar às cidades, desde uma extremidade da terra do Egito até a outra extremidade."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 22,
				"Somente a terra dos sacerdotes não a comprou, porquanto os sacerdotes tinham porção de Faraó, e eles comiam a sua porção que Faraó lhes tinha dado; por isso não venderam a sua terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 23,
				"Então disse José ao povo: Eis que hoje tenho comprado a vós e a vossa terra para Faraó; eis aí tendes semente para vós, para que semeeis a terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 24,
				"Há de ser, porém, que das colheitas dareis o quinto a Faraó, e as quatro partes serão vossas, para semente do campo, e para o vosso mantimento, e dos que estão nas vossas casas, e para que comam vossos filhos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 25,
				"E disseram: A vida nos tens dado; achemos graça aos olhos de meu senhor, e seremos servos de Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 26,
				"José, pois, estabeleceu isto por estatuto, até ao dia de hoje, sobre a terra do Egito, que Faraó tirasse o quinto; só a terra dos sacerdotes não ficou sendo de Faraó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 27,
				"Assim habitou Israel na terra do Egito, na terra de Gósen, e nela tomaram possessão, e frutificaram, e multiplicaram-se muito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 28,
				"E Jacó viveu na terra do Egito dezessete anos, de sorte que os dias de Jacó, os anos da sua vida, foram cento e quarenta e sete anos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 29,
				"Chegando-se, pois, o tempo da morte de Israel, chamou a José, seu filho, e disse-lhe: Se agora tenho achado graça em teus olhos, rogo-te que ponhas a tua mão debaixo da minha coxa, e usa comigo de beneficência e verdade; rogo-te que não me enterres no Egito,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 30,
				"Mas que eu jaza com os meus pais; por isso me levarás do Egito e me enterrarás na sepultura deles. E ele disse: Farei conforme a tua palavra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 47, 31,
				"E disse ele: Jura-me. E ele jurou-lhe; e Israel inclinou-se sobre a cabeceira da cama."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 1,
				"E ACONTECEU, depois destas coisas, que alguém disse a José: Eis que teu pai está enfermo. Então tomou consigo os seus dois filhos, Manassés e Efraim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 2,
				"E alguém participou a Jacó, e disse: Eis que José teu filho vem a ti. E esforçou-se Israel, e assentou-se sobre a cama."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 3,
				"E Jacó disse a José: O Deus Todo-Poderoso me apareceu em Luz, na terra de Canaã, e me abençoou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 4,
				"E me disse: Eis que te farei frutificar e multiplicar, e tornar-te-ei uma multidão de povos e darei esta terra à tua descendência depois de ti, em possessão perpétua."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 5,
				"Agora, pois, os teus dois filhos, que te nasceram na terra do Egito, antes que eu viesse a ti no Egito, são meus: Efraim e Manassés serão meus, como Rúben e Simeão;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 6,
				"Mas a tua geração, que gerarás depois deles, será tua; segundo o nome de seus irmãos serão chamados na sua herança."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 7,
				"Vindo, pois, eu de Padã, morreu-me Raquel no caminho, na terra de Canaã, havendo ainda pequena distância para chegar a Efrata; e eu a sepultei ali, no caminho de Efrata, que é Belém."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 8, "E Israel viu os filhos de José, e disse: Quem são estes?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 9,
				"E José disse a seu pai: Eles são meus filhos, que Deus me tem dado aqui. E ele disse: Peço-te, traze-mos aqui, para que os abençoe."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 10,
				"Os olhos de Israel, porém, estavam carregados de velhice, já não podia ver; e fê-los chegar a ele, e beijou-os, e abraçou-os."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 11,
				"E Israel disse a José: Eu não cuidara ver o teu rosto; e eis que Deus me fez ver também a tua descendência."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 12,
				"Então José os tirou dos joelhos de seu pai, e inclinou-se à terra diante da sua face."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 13,
				"E tomou José a ambos, a Efraim na sua mão direita, à esquerda de Israel, e Manassés na sua mão esquerda, à direita de Israel, e fê-los chegar a ele."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 14,
				"Mas Israel estendeu a sua mão direita e a pôs sobre a cabeça de Efraim, que era o menor, e a sua esquerda sobre a cabeça de Manassés, dirigindo as suas mãos propositadamente, não obstante Manassés ser o primogênito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 15,
				"E abençoou a José, e disse: O Deus, em cuja presença andaram os meus pais Abraão e Isaque, o Deus que me sustentou, desde que eu nasci até este dia;"));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 16,
				"O anjo que me livrou de todo o mal, abençoe estes rapazes, e seja chamado neles o meu nome, e o nome de meus pais Abraão e Isaque, e multipliquem-se como peixes, em multidão, no meio da terra."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 17,
				"Vendo, pois, José que seu pai punha a sua mão direita sobre a cabeça de Efraim, foi mau aos seus olhos; e tomou a mão de seu pai, para a transpor de sobre a cabeça de Efraim à cabeça de Manassés."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 18,
				"E José disse a seu pai: Não assim, meu pai, porque este é o primogênito; põe a tua mão direita sobre a sua cabeça."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 19,
				"Mas seu pai recusou, e disse: Eu o sei, meu filho, eu o sei; também ele será um povo, e também ele será grande; contudo o seu irmão menor será maior que ele, e a sua descendência será uma multidão de nações."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 20,
				"Assim os abençoou naquele dia, dizendo: Em ti abençoará Israel, dizendo: Deus te faça como a Efraim e como a Manassés. E pôs a Efraim diante de Manassés."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 21,
				"Depois disse Israel a José: Eis que eu morro, mas Deus será convosco, e vos fará tornar à terra de vossos pais."));
		verses.add(new Verse(null, 1l, 1l, 1l, 48, 22,
				"E eu tenho dado a ti um pedaço da terra a mais do que a teus irmãos, que tomei com a minha espada e com o meu arco, da mão dos amorreus."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 1,
				"DEPOIS chamou Jacó a seus filhos, e disse: Ajuntai-vos, e anunciar-vos-ei o que vos há de acontecer nos dias vindouros;"));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 49, 2, "Ajuntai-vos, e ouvi, filhos de Jacó; e ouvi a Israel vosso pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 3,
				"Rúben, tu és meu primogênito, minha força e o princípio de meu vigor, o mais excelente em alteza e o mais excelente em poder."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 4,
				"Impetuoso como a água, não serás o mais excelente, porquanto subiste ao leito de teu pai. Então o contaminaste; subiu à minha cama."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 5,
				"Simeão e Levi são irmãos; as suas espadas são instrumentos de violência."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 6,
				"No seu secreto conselho não entre minha alma, com a sua congregação minha glória não se ajunte; porque no seu furor mataram homens, e na sua teima arrebataram bois."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 7,
				"Maldito seja o seu furor, pois era forte, e a sua ira, pois era dura; eu os dividirei em Jacó, e os espalharei em Israel."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 8,
				"Judá, a ti te louvarão os teus irmãos; a tua mão será sobre o pescoço de teus inimigos; os filhos de teu pai a ti se inclinarão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 9,
				"Judá é um leãozinho, da presa subiste, filho meu; encurva-se, e deita-se como um leão, e como um leão velho; quem o despertará?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 10,
				"O cetro não se arredará de Judá, nem o legislador dentre seus pés, até que venha Siló; e a ele se congregarão os povos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 11,
				"Ele amarrará o seu jumentinho à vide, e o filho da sua jumenta à cepa mais excelente; ele lavará a sua roupa no vinho, e a sua capa em sangue de uvas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 12,
				"Os olhos serão vermelhos de vinho, e os dentes brancos de leite."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 13,
				"Zebulom habitará no porto dos mares, e será como porto dos navios, e o seu termo será para Sidom."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 49, 14, "Issacar é jumento de fortes ossos, deitado entre dois fardos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 15,
				"E viu ele que o descanso era bom, e que a terra era deliciosa e abaixou seu ombro para acarretar, e serviu debaixo de tributo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 16, "Dã julgará o seu povo, como uma das tribos de Israel."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 17,
				"Dã será serpente junto ao caminho, uma víbora junto à vereda, que morde os calcanhares do cavalo, e faz cair o seu cavaleiro por detrás."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 18, "A tua salvação espero, ó SENHOR!"));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 19,
				"Quanto a Gade, uma tropa o acometerá; mas ele a acometerá por fim."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 20, "De Aser, o seu pão será gordo, e ele dará delícias reais."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 21, "Naftali é uma gazela solta; ele dá palavras formosas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 22,
				"José é um ramo frutífero, ramo frutífero junto à fonte; seus ramos correm sobre o muro."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 23, "Os flecheiros lhe deram amargura, e o flecharam e odiaram."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 24,
				"O seu arco, porém, susteve-se no forte, e os braços de suas mãos foram fortalecidos pelas mãos do Valente de Jacó (de onde é o pastor e a pedra de Israel)."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 25,
				"Pelo Deus de teu pai, o qual te ajudará, e pelo Todo-Poderoso, o qual te abençoará com bênçãos dos altos céus, com bênçãos do abismo que está embaixo, com bênçãos dos seios e da madre."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 26,
				"As bênçãos de teu pai excederão as bênçãos de meus pais, até à extremidade dos outeiros eternos; elas estarão sobre a cabeça de José, e sobre o alto da cabeça do que foi separado de seus irmãos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 27,
				"Benjamim é lobo que despedaça; pela manhã comerá a presa, e à tarde repartirá o despojo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 28,
				"Todas estas são as doze tribos de Israel; e isto é o que lhes falou seu pai quando os abençoou; a cada um deles abençoou segundo a sua bênção."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 29,
				"Depois ordenou-lhes, e disse-lhes: Eu me congrego ao meu povo; sepultai-me com meus pais, na cova que está no campo de Efrom, o heteu,"));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 30,
				"Na cova que está no campo de Macpela, que está em frente de Manre, na terra de Canaã, a qual Abraão comprou com aquele campo de Efrom, o heteu, por herança de sepultura."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 31,
				"Ali sepultaram a Abraão e a Sara sua mulher; ali sepultaram a Isaque e a Rebeca sua mulher; e ali eu sepultei a Lia."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 32,
				"O campo e a cova que está nele, foram comprados aos filhos de Hete."));
		verses.add(new Verse(null, 1l, 1l, 1l, 49, 33,
				"Acabando, pois, Jacó de dar instruções a seus filhos, encolheu os pés na cama, e expirou, e foi congregado ao seu povo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 1,
				"ENTÃO José se lançou sobre o rosto de seu pai e chorou sobre ele, e o beijou."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 2,
				"E José ordenou aos seus servos, os médicos, que embalsamassem a seu pai; e os médicos embalsamaram a Israel."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 3,
				"E cumpriram-se-lhe quarenta dias; porque assim se cumprem os dias daqueles que se embalsamam; e os egípcios o choraram setenta dias."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 4,
				"Passados, pois, os dias de seu choro, falou José à casa de Faraó, dizendo: Se agora tenho achado graça aos vossos olhos, rogo-vos que faleis aos ouvidos de Faraó, dizendo:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 5,
				"Meu pai me fez jurar, dizendo: Eis que eu morro; em meu sepulcro, que cavei para mim na terra de Canaã, ali me sepultarás. Agora, pois, te peço, que eu suba, para que sepulte a meu pai; então voltarei."));
		verses.add(
				new Verse(null, 1l, 1l, 1l, 50, 6, "E Faraó disse: Sobe, e sepulta a teu pai como ele te fez jurar."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 7,
				"E José subiu para sepultar a seu pai; e subiram com ele todos os servos de Faraó, os anciãos da sua casa, e todos os anciãos da terra do Egito."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 8,
				"Como também toda a casa de José, e seus irmãos, e a casa de seu pai; somente deixaram na terra de Gósen os seus meninos, e as suas ovelhas e as suas vacas."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 9,
				"E subiram também com ele, tanto carros como gente a cavalo; e o cortejo foi grandíssimo."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 10,
				"Chegando eles, pois, à eira de Atade, que está além do Jordão, fizeram um grande e dolorido pranto; e fez a seu pai uma grande lamentação por sete dias."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 11,
				"E vendo os moradores da terra, os cananeus, o luto na eira de Atade, disseram: É este o pranto grande dos egípcios. Por isso chamou-se-lhe Abel-Mizraim, que está além do Jordão."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 12, "E fizeram-lhe os seus filhos assim como ele lhes ordenara."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 13,
				"Pois os seus filhos o levaram à terra de Canaã, e o sepultaram na cova do campo de Macpela, que Abraão tinha comprado com o campo, por herança de sepultura de Efrom, o heteu, em frente de Manre."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 14,
				"Depois de haver sepultado seu pai, voltou José para o Egito, ele e seus irmãos, e todos os que com ele subiram a sepultar seu pai."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 15,
				"Vendo então os irmãos de José que seu pai já estava morto, disseram: Porventura nos odiará José e certamente nos retribuirá todo o mal que lhe fizemos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 16,
				"Portanto mandaram dizer a José: Teu pai ordenou, antes da sua morte, dizendo:"));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 17,
				"Assim direis a José: Perdoa, rogo-te, a transgressão de teus irmãos, e o seu pecado, porque te fizeram mal; agora, pois, rogamos-te que perdoes a transgressão dos servos do Deus de teu pai. E José chorou quando eles lhe falavam."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 18,
				"Depois vieram também seus irmãos, e prostraram-se diante dele, e disseram: Eis-nos aqui por teus servos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 19,
				"E José lhes disse: Não temais; porventura estou eu em lugar de Deus?"));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 20,
				"Vós bem intentastes mal contra mim; porém Deus o intentou para bem, para fazer como se vê neste dia, para conservar muita gente com vida."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 21,
				"Agora, pois, não temais; eu vos sustentarei a vós e a vossos filhos. Assim os consolou, e falou segundo o coração deles."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 22,
				"José, pois, habitou no Egito, ele e a casa de seu pai; e viveu José cento e dez anos."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 23,
				"E viu José os filhos de Efraim, da terceira geração; também os filhos de Maquir, filho de Manassés, nasceram sobre os joelhos de José."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 24,
				"E disse José a seus irmãos: Eu morro; mas Deus certamente vos visitará, e vos fará subir desta terra à terra que jurou a Abraão, a Isaque e a Jacó."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 25,
				"E José fez jurar os filhos de Israel, dizendo: Certamente vos visitará Deus, e fareis transportar os meus ossos daqui."));
		verses.add(new Verse(null, 1l, 1l, 1l, 50, 26,
				"E morreu José da idade de cento e dez anos, e o embalsamaram e o puseram num caixão no Egito."));
		
		
		verse.saveAll(verses);
	}

}
