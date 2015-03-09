package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Test;

/** 
 * Tests {@link DoubleMetaphone}.
 * 
 * <p>Keep this file in UTF-8 encoding for proper Javadoc processing.</p>
 * 
 * @see "http://www.cuj.com/documents/s=8038/cuj0006philips/"
 * @version $Id$
 */
public class DoubleMetaphoneTest extends StringEncoderAbstractTest<org.apache.commons.codec.language.DoubleMetaphone> {
    /** 
     * Test data from http://aspell.net/test/orig/batch0.tab.
     * 
     * "Copyright (C) 2002 Kevin Atkinson (kevina@gnu.org). Verbatim copying
     * and distribution of this entire article is permitted in any medium,
     * provided this notice is preserved."
     * 
     * Massaged the test data in the array below.
     */
private static final String[][] FIXTURE = new String[][]{ new String[]{ "Accosinly" , "Occasionally" } , new String[]{ "Ciculer" , "Circler" } , new String[]{ "Circue" , "Circle" } , new String[]{ "Maddness" , "Madness" } , new String[]{ "Occusionaly" , "Occasionally" } , new String[]{ "Steffen" , "Stephen" } , new String[]{ "Thw" , "The" } , new String[]{ "Unformanlly" , "Unfortunately" } , new String[]{ "Unfortally" , "Unfortunately" } , new String[]{ "abilitey" , "ability" } , new String[]{ "abouy" , "about" } , new String[]{ "absorbtion" , "absorption" } , new String[]{ "accidently" , "accidentally" } , new String[]{ "accomodate" , "accommodate" } , new String[]{ "acommadate" , "accommodate" } , new String[]{ "acord" , "accord" } , new String[]{ "adultry" , "adultery" } , new String[]{ "aggresive" , "aggressive" } , new String[]{ "alchohol" , "alcohol" } , new String[]{ "alchoholic" , "alcoholic" } , new String[]{ "allieve" , "alive" } , new String[]{ "alot" , "a lot" } , new String[]{ "alright" , "all right" } , new String[]{ "amature" , "amateur" } , new String[]{ "ambivilant" , "ambivalent" } , new String[]{ "amification" , "amplification" } , new String[]{ "amourfous" , "amorphous" } , new String[]{ "annoint" , "anoint" } , new String[]{ "annonsment" , "announcement" } , new String[]{ "annoyting" , "anting" } , new String[]{ "annuncio" , "announce" } , new String[]{ "anonomy" , "anatomy" } , new String[]{ "anotomy" , "anatomy" } , new String[]{ "antidesestablishmentarianism" , "antidisestablishmentarianism" } , new String[]{ "antidisestablishmentarism" , "antidisestablishmentarianism" } , new String[]{ "anynomous" , "anonymous" } , new String[]{ "appelet" , "applet" } , new String[]{ "appreceiated" , "appreciated" } , new String[]{ "appresteate" , "appreciate" } , new String[]{ "aquantance" , "acquaintance" } , new String[]{ "aratictature" , "architecture" } , new String[]{ "archeype" , "archetype" } , new String[]{ "aricticure" , "architecture" } , new String[]{ "artic" , "arctic" } , new String[]{ "asentote" , "asymptote" } , new String[]{ "ast" , "at" } , new String[]{ "asterick" , "asterisk" } , new String[]{ "asymetric" , "asymmetric" } , new String[]{ "atentively" , "attentively" } , new String[]{ "autoamlly" , "automatically" } , new String[]{ "bankrot" , "bankrupt" } , new String[]{ "basicly" , "basically" } , new String[]{ "batallion" , "battalion" } , new String[]{ "bbrose" , "browse" } , new String[]{ "beauro" , "bureau" } , new String[]{ "beaurocracy" , "bureaucracy" } , new String[]{ "beggining" , "beginning" } , new String[]{ "beging" , "beginning" } , new String[]{ "behaviour" , "behavior" } , new String[]{ "beleive" , "believe" } , new String[]{ "belive" , "believe" } , new String[]{ "benidifs" , "benefits" } , new String[]{ "bigginging" , "beginning" } , new String[]{ "blait" , "bleat" } , new String[]{ "bouyant" , "buoyant" } , new String[]{ "boygot" , "boycott" } , new String[]{ "brocolli" , "broccoli" } , new String[]{ "buch" , "bush" } , new String[]{ "buder" , "butter" } , new String[]{ "budr" , "butter" } , new String[]{ "budter" , "butter" } , new String[]{ "buracracy" , "bureaucracy" } , new String[]{ "burracracy" , "bureaucracy" } , new String[]{ "buton" , "button" } , new String[]{ "byby" , "by by" } , new String[]{ "cauler" , "caller" } , new String[]{ "ceasar" , "caesar" } , new String[]{ "cemetary" , "cemetery" } , new String[]{ "changeing" , "changing" } , new String[]{ "cheet" , "cheat" } , new String[]{ "cicle" , "circle" } , new String[]{ "cimplicity" , "simplicity" } , new String[]{ "circumstaces" , "circumstances" } , new String[]{ "clob" , "club" } , new String[]{ "coaln" , "colon" } , new String[]{ "cocamena" , "cockamamie" } , new String[]{ "colleaque" , "colleague" } , new String[]{ "colloquilism" , "colloquialism" } , new String[]{ "columne" , "column" } , new String[]{ "comiler" , "compiler" } , new String[]{ "comitmment" , "commitment" } , new String[]{ "comitte" , "committee" } , new String[]{ "comittmen" , "commitment" } , new String[]{ "comittmend" , "commitment" } , new String[]{ "commerciasl" , "commercials" } , new String[]{ "commited" , "committed" } , new String[]{ "commitee" , "committee" } , new String[]{ "companys" , "companies" } , new String[]{ "compicated" , "complicated" } , new String[]{ "comupter" , "computer" } , new String[]{ "concensus" , "consensus" } , new String[]{ "confusionism" , "confucianism" } , new String[]{ "congradulations" , "congratulations" } , new String[]{ "conibation" , "contribution" } , new String[]{ "consident" , "consistent" } , new String[]{ "consident" , "consonant" } , new String[]{ "contast" , "constant" } , new String[]{ "contastant" , "constant" } , new String[]{ "contunie" , "continue" } , new String[]{ "cooly" , "coolly" } , new String[]{ "copping" , "coping" } , new String[]{ "cosmoplyton" , "cosmopolitan" } , new String[]{ "courst" , "court" } , new String[]{ "crasy" , "crazy" } , new String[]{ "cravets" , "caveats" } , new String[]{ "credetability" , "credibility" } , new String[]{ "criqitue" , "critique" } , new String[]{ "croke" , "croak" } , new String[]{ "crucifiction" , "crucifixion" } , new String[]{ "crusifed" , "crucified" } , new String[]{ "ctitique" , "critique" } , new String[]{ "cumba" , "combo" } , new String[]{ "custamisation" , "customization" } , new String[]{ "dag" , "dog" } , new String[]{ "daly" , "daily" } , new String[]{ "danguages" , "dangerous" } , new String[]{ "deaft" , "draft" } , new String[]{ "defence" , "defense" } , new String[]{ "defenly" , "defiantly" } , new String[]{ "definate" , "definite" } , new String[]{ "definately" , "definitely" } , new String[]{ "dependeble" , "dependable" } , new String[]{ "descrption" , "description" } , new String[]{ "descrptn" , "description" } , new String[]{ "desparate" , "desperate" } , new String[]{ "dessicate" , "desiccate" } , new String[]{ "destint" , "distant" } , new String[]{ "develepment" , "developments" } , new String[]{ "developement" , "development" } , new String[]{ "develpond" , "development" } , new String[]{ "devulge" , "divulge" } , new String[]{ "diagree" , "disagree" } , new String[]{ "dieties" , "deities" } , new String[]{ "dinasaur" , "dinosaur" } , new String[]{ "dinasour" , "dinosaur" } , new String[]{ "direcyly" , "directly" } , new String[]{ "discuess" , "discuss" } , new String[]{ "disect" , "dissect" } , new String[]{ "disippate" , "dissipate" } , new String[]{ "disition" , "decision" } , new String[]{ "dispair" , "despair" } , new String[]{ "disssicion" , "discussion" } , new String[]{ "distarct" , "distract" } , new String[]{ "distart" , "distort" } , new String[]{ "distroy" , "destroy" } , new String[]{ "documtations" , "documentation" } , new String[]{ "doenload" , "download" } , new String[]{ "dongle" , "dangle" } , new String[]{ "doog" , "dog" } , new String[]{ "dramaticly" , "dramatically" } , new String[]{ "drunkeness" , "drunkenness" } , new String[]{ "ductioneery" , "dictionary" } , new String[]{ "dur" , "due" } , new String[]{ "duren" , "during" } , new String[]{ "dymatic" , "dynamic" } , new String[]{ "dynaic" , "dynamic" } , new String[]{ "ecstacy" , "ecstasy" } , new String[]{ "efficat" , "efficient" } , new String[]{ "efficity" , "efficacy" } , new String[]{ "effots" , "efforts" } , new String[]{ "egsistence" , "existence" } , new String[]{ "eitiology" , "etiology" } , new String[]{ "elagent" , "elegant" } , new String[]{ "elligit" , "elegant" } , new String[]{ "embarass" , "embarrass" } , new String[]{ "embarassment" , "embarrassment" } , new String[]{ "embaress" , "embarrass" } , new String[]{ "encapsualtion" , "encapsulation" } , new String[]{ "encyclapidia" , "encyclopedia" } , new String[]{ "encyclopia" , "encyclopedia" } , new String[]{ "engins" , "engine" } , new String[]{ "enhence" , "enhance" } , new String[]{ "enligtment" , "Enlightenment" } , new String[]{ "ennuui" , "ennui" } , new String[]{ "enought" , "enough" } , new String[]{ "enventions" , "inventions" } , new String[]{ "envireminakl" , "environmental" } , new String[]{ "enviroment" , "environment" } , new String[]{ "epitomy" , "epitome" } , new String[]{ "equire" , "acquire" } , new String[]{ "errara" , "error" } , new String[]{ "erro" , "error" } , new String[]{ "evaualtion" , "evaluation" } , new String[]{ "evething" , "everything" } , new String[]{ "evtually" , "eventually" } , new String[]{ "excede" , "exceed" } , new String[]{ "excercise" , "exercise" } , new String[]{ "excpt" , "except" } , new String[]{ "excution" , "execution" } , new String[]{ "exhileration" , "exhilaration" } , new String[]{ "existance" , "existence" } , new String[]{ "expleyly" , "explicitly" } , new String[]{ "explity" , "explicitly" } , new String[]{ "expresso" , "espresso" } , new String[]{ "exspidient" , "expedient" } , new String[]{ "extions" , "extensions" } , new String[]{ "factontion" , "factorization" } , new String[]{ "failer" , "failure" } , new String[]{ "famdasy" , "fantasy" } , new String[]{ "faver" , "favor" } , new String[]{ "faxe" , "fax" } , new String[]{ "febuary" , "february" } , new String[]{ "firey" , "fiery" } , new String[]{ "fistival" , "festival" } , new String[]{ "flatterring" , "flattering" } , new String[]{ "fluk" , "flux" } , new String[]{ "flukse" , "flux" } , new String[]{ "fone" , "phone" } , new String[]{ "forsee" , "foresee" } , new String[]{ "frustartaion" , "frustrating" } , new String[]{ "fuction" , "function" } , new String[]{ "funetik" , "phonetic" } , new String[]{ "futs" , "guts" } , new String[]{ "gamne" , "came" } , new String[]{ "gaurd" , "guard" } , new String[]{ "generly" , "generally" } , new String[]{ "ghandi" , "gandhi" } , new String[]{ "goberment" , "government" } , new String[]{ "gobernement" , "government" } , new String[]{ "gobernment" , "government" } , new String[]{ "gotton" , "gotten" } , new String[]{ "gracefull" , "graceful" } , new String[]{ "gradualy" , "gradually" } , new String[]{ "grammer" , "grammar" } , new String[]{ "hallo" , "hello" } , new String[]{ "hapily" , "happily" } , new String[]{ "harrass" , "harass" } , new String[]{ "havne" , "have" } , new String[]{ "heellp" , "help" } , new String[]{ "heighth" , "height" } , new String[]{ "hellp" , "help" } , new String[]{ "helo" , "hello" } , new String[]{ "herlo" , "hello" } , new String[]{ "hifin" , "hyphen" } , new String[]{ "hifine" , "hyphen" } , new String[]{ "higer" , "higher" } , new String[]{ "hiphine" , "hyphen" } , new String[]{ "hippie" , "hippy" } , new String[]{ "hippopotamous" , "hippopotamus" } , new String[]{ "hlp" , "help" } , new String[]{ "hourse" , "horse" } , new String[]{ "houssing" , "housing" } , new String[]{ "howaver" , "however" } , new String[]{ "howver" , "however" } , new String[]{ "humaniti" , "humanity" } , new String[]{ "hyfin" , "hyphen" } , new String[]{ "hypotathes" , "hypothesis" } , new String[]{ "hypotathese" , "hypothesis" } , new String[]{ "hystrical" , "hysterical" } , new String[]{ "ident" , "indent" } , new String[]{ "illegitament" , "illegitimate" } , new String[]{ "imbed" , "embed" } , new String[]{ "imediaetly" , "immediately" } , new String[]{ "imfamy" , "infamy" } , new String[]{ "immenant" , "immanent" } , new String[]{ "implemtes" , "implements" } , new String[]{ "inadvertant" , "inadvertent" } , new String[]{ "incase" , "in case" } , new String[]{ "incedious" , "insidious" } , new String[]{ "incompleet" , "incomplete" } , new String[]{ "incomplot" , "incomplete" } , new String[]{ "inconvenant" , "inconvenient" } , new String[]{ "inconvience" , "inconvenience" } , new String[]{ "independant" , "independent" } , new String[]{ "independenent" , "independent" } , new String[]{ "indepnends" , "independent" } , new String[]{ "indepth" , "in depth" } , new String[]{ "indispensible" , "indispensable" } , new String[]{ "inefficite" , "inefficient" } , new String[]{ "inerface" , "interface" } , new String[]{ "infact" , "in fact" } , new String[]{ "influencial" , "influential" } , new String[]{ "inital" , "initial" } , new String[]{ "initinized" , "initialized" } , new String[]{ "initized" , "initialized" } , new String[]{ "innoculate" , "inoculate" } , new String[]{ "insistant" , "insistent" } , new String[]{ "insistenet" , "insistent" } , new String[]{ "instulation" , "installation" } , new String[]{ "intealignt" , "intelligent" } , new String[]{ "intejilent" , "intelligent" } , new String[]{ "intelegent" , "intelligent" } , new String[]{ "intelegnent" , "intelligent" } , new String[]{ "intelejent" , "intelligent" } , new String[]{ "inteligent" , "intelligent" } , new String[]{ "intelignt" , "intelligent" } , new String[]{ "intellagant" , "intelligent" } , new String[]{ "intellegent" , "intelligent" } , new String[]{ "intellegint" , "intelligent" } , new String[]{ "intellgnt" , "intelligent" } , new String[]{ "intensionality" , "intensionally" } , new String[]{ "interate" , "iterate" } , new String[]{ "internation" , "international" } , new String[]{ "interpretate" , "interpret" } , new String[]{ "interpretter" , "interpreter" } , new String[]{ "intertes" , "interested" } , new String[]{ "intertesd" , "interested" } , new String[]{ "invermeantial" , "environmental" } , new String[]{ "irregardless" , "regardless" } , new String[]{ "irresistable" , "irresistible" } , new String[]{ "irritible" , "irritable" } , new String[]{ "islams" , "muslims" } , new String[]{ "isotrop" , "isotope" } , new String[]{ "isreal" , "israel" } , new String[]{ "johhn" , "john" } , new String[]{ "judgement" , "judgment" } , new String[]{ "kippur" , "kipper" } , new String[]{ "knawing" , "knowing" } , new String[]{ "latext" , "latest" } , new String[]{ "leasve" , "leave" } , new String[]{ "lesure" , "leisure" } , new String[]{ "liasion" , "lesion" } , new String[]{ "liason" , "liaison" } , new String[]{ "libary" , "library" } , new String[]{ "likly" , "likely" } , new String[]{ "lilometer" , "kilometer" } , new String[]{ "liquify" , "liquefy" } , new String[]{ "lloyer" , "layer" } , new String[]{ "lossing" , "losing" } , new String[]{ "luser" , "laser" } , new String[]{ "maintanence" , "maintenance" } , new String[]{ "majaerly" , "majority" } , new String[]{ "majoraly" , "majority" } , new String[]{ "maks" , "masks" } , new String[]{ "mandelbrot" , "Mandelbrot" } , new String[]{ "mant" , "want" } , new String[]{ "marshall" , "marshal" } , new String[]{ "maxium" , "maximum" } , new String[]{ "meory" , "memory" } , new String[]{ "metter" , "better" } , new String[]{ "mic" , "mike" } , new String[]{ "midia" , "media" } , new String[]{ "millenium" , "millennium" } , new String[]{ "miniscule" , "minuscule" } , new String[]{ "minkay" , "monkey" } , new String[]{ "minum" , "minimum" } , new String[]{ "mischievious" , "mischievous" } , new String[]{ "misilous" , "miscellaneous" } , new String[]{ "momento" , "memento" } , new String[]{ "monkay" , "monkey" } , new String[]{ "mosaik" , "mosaic" } , new String[]{ "mostlikely" , "most likely" } , new String[]{ "mousr" , "mouser" } , new String[]{ "mroe" , "more" } , new String[]{ "neccessary" , "necessary" } , new String[]{ "necesary" , "necessary" } , new String[]{ "necesser" , "necessary" } , new String[]{ "neice" , "niece" } , new String[]{ "neighbour" , "neighbor" } , new String[]{ "nemonic" , "pneumonic" } , new String[]{ "nevade" , "Nevada" } , new String[]{ "nickleodeon" , "nickelodeon" } , new String[]{ "nieve" , "naive" } , new String[]{ "noone" , "no one" } , new String[]{ "noticably" , "noticeably" } , new String[]{ "notin" , "not in" } , new String[]{ "nozled" , "nuzzled" } , new String[]{ "objectsion" , "objects" } , new String[]{ "obsfuscate" , "obfuscate" } , new String[]{ "ocassion" , "occasion" } , new String[]{ "occuppied" , "occupied" } , new String[]{ "occurence" , "occurrence" } , new String[]{ "octagenarian" , "octogenarian" } , new String[]{ "olf" , "old" } , new String[]{ "opposim" , "opossum" } , new String[]{ "organise" , "organize" } , new String[]{ "organiz" , "organize" } , new String[]{ "orientate" , "orient" } , new String[]{ "oscilascope" , "oscilloscope" } , new String[]{ "oving" , "moving" } , new String[]{ "paramers" , "parameters" } , new String[]{ "parametic" , "parameter" } , new String[]{ "paranets" , "parameters" } , new String[]{ "partrucal" , "particular" } , new String[]{ "pataphysical" , "metaphysical" } , new String[]{ "patten" , "pattern" } , new String[]{ "permissable" , "permissible" } , new String[]{ "permition" , "permission" } , new String[]{ "permmasivie" , "permissive" } , new String[]{ "perogative" , "prerogative" } , new String[]{ "persue" , "pursue" } , new String[]{ "phantasia" , "fantasia" } , new String[]{ "phenominal" , "phenomenal" } , new String[]{ "picaresque" , "picturesque" } , new String[]{ "playwrite" , "playwright" } , new String[]{ "poeses" , "poesies" } , new String[]{ "polation" , "politician" } , new String[]{ "poligamy" , "polygamy" } , new String[]{ "politict" , "politic" } , new String[]{ "pollice" , "police" } , new String[]{ "polypropalene" , "polypropylene" } , new String[]{ "pompom" , "pompon" } , new String[]{ "possable" , "possible" } , new String[]{ "practicle" , "practical" } , new String[]{ "pragmaticism" , "pragmatism" } , new String[]{ "preceeding" , "preceding" } , new String[]{ "precion" , "precision" } , new String[]{ "precios" , "precision" } , new String[]{ "preemptory" , "peremptory" } , new String[]{ "prefices" , "prefixes" } , new String[]{ "prefixt" , "prefixed" } , new String[]{ "presbyterian" , "Presbyterian" } , new String[]{ "presue" , "pursue" } , new String[]{ "presued" , "pursued" } , new String[]{ "privielage" , "privilege" } , new String[]{ "priviledge" , "privilege" } , new String[]{ "proceedures" , "procedures" } , new String[]{ "pronensiation" , "pronunciation" } , new String[]{ "pronisation" , "pronunciation" } , new String[]{ "pronounciation" , "pronunciation" } , new String[]{ "properally" , "properly" } , new String[]{ "proplematic" , "problematic" } , new String[]{ "protray" , "portray" } , new String[]{ "pscolgst" , "psychologist" } , new String[]{ "psicolagest" , "psychologist" } , new String[]{ "psycolagest" , "psychologist" } , new String[]{ "quoz" , "quiz" } , new String[]{ "radious" , "radius" } , new String[]{ "ramplily" , "rampantly" } , new String[]{ "reccomend" , "recommend" } , new String[]{ "reccona" , "raccoon" } , new String[]{ "recieve" , "receive" } , new String[]{ "reconise" , "recognize" } , new String[]{ "rectangeles" , "rectangle" } , new String[]{ "redign" , "redesign" } , new String[]{ "reoccurring" , "recurring" } , new String[]{ "repitition" , "repetition" } , new String[]{ "replasments" , "replacement" } , new String[]{ "reposable" , "responsible" } , new String[]{ "reseblence" , "resemblance" } , new String[]{ "respct" , "respect" } , new String[]{ "respecally" , "respectfully" } , new String[]{ "roon" , "room" } , new String[]{ "rought" , "roughly" } , new String[]{ "rsx" , "RSX" } , new String[]{ "rudemtry" , "rudimentary" } , new String[]{ "runnung" , "running" } , new String[]{ "sacreligious" , "sacrilegious" } , new String[]{ "saftly" , "safely" } , new String[]{ "salut" , "salute" } , new String[]{ "satifly" , "satisfy" } , new String[]{ "scrabdle" , "scrabble" } , new String[]{ "searcheable" , "searchable" } , new String[]{ "secion" , "section" } , new String[]{ "seferal" , "several" } , new String[]{ "segements" , "segments" } , new String[]{ "sence" , "sense" } , new String[]{ "seperate" , "separate" } , new String[]{ "sherbert" , "sherbet" } , new String[]{ "sicolagest" , "psychologist" } , new String[]{ "sieze" , "seize" } , new String[]{ "simpfilty" , "simplicity" } , new String[]{ "simplye" , "simply" } , new String[]{ "singal" , "signal" } , new String[]{ "sitte" , "site" } , new String[]{ "situration" , "situation" } , new String[]{ "slyph" , "sylph" } , new String[]{ "smil" , "smile" } , new String[]{ "snuck" , "sneaked" } , new String[]{ "sometmes" , "sometimes" } , new String[]{ "soonec" , "sonic" } , new String[]{ "specificialy" , "specifically" } , new String[]{ "spel" , "spell" } , new String[]{ "spoak" , "spoke" } , new String[]{ "sponsered" , "sponsored" } , new String[]{ "stering" , "steering" } , new String[]{ "straightjacket" , "straitjacket" } , new String[]{ "stumach" , "stomach" } , new String[]{ "stutent" , "student" } , new String[]{ "styleguide" , "style guide" } , new String[]{ "subisitions" , "substitutions" } , new String[]{ "subjecribed" , "subscribed" } , new String[]{ "subpena" , "subpoena" } , new String[]{ "substations" , "substitutions" } , new String[]{ "suger" , "sugar" } , new String[]{ "supercede" , "supersede" } , new String[]{ "superfulous" , "superfluous" } , new String[]{ "susan" , "Susan" } , new String[]{ "swimwear" , "swim wear" } , new String[]{ "syncorization" , "synchronization" } , new String[]{ "taff" , "tough" } , new String[]{ "taht" , "that" } , new String[]{ "tattos" , "tattoos" } , new String[]{ "techniquely" , "technically" } , new String[]{ "teh" , "the" } , new String[]{ "tem" , "team" } , new String[]{ "teo" , "two" } , new String[]{ "teridical" , "theoretical" } , new String[]{ "tesst" , "test" } , new String[]{ "tets" , "tests" } , new String[]{ "thanot" , "than or" } , new String[]{ "theirselves" , "themselves" } , new String[]{ "theridically" , "theoretical" } , new String[]{ "thredically" , "theoretically" } , new String[]{ "thruout" , "throughout" } , new String[]{ "ths" , "this" } , new String[]{ "titalate" , "titillate" } , new String[]{ "tobagan" , "tobaggon" } , new String[]{ "tommorrow" , "tomorrow" } , new String[]{ "tomorow" , "tomorrow" } , new String[]{ "tradegy" , "tragedy" } , new String[]{ "trubbel" , "trouble" } , new String[]{ "ttest" , "test" } , new String[]{ "tunnellike" , "tunnel like" } , new String[]{ "tured" , "turned" } , new String[]{ "tyrrany" , "tyranny" } , new String[]{ "unatourral" , "unnatural" } , new String[]{ "unaturral" , "unnatural" } , new String[]{ "unconisitional" , "unconstitutional" } , new String[]{ "unconscience" , "unconscious" } , new String[]{ "underladder" , "under ladder" } , new String[]{ "unentelegible" , "unintelligible" } , new String[]{ "unfortunently" , "unfortunately" } , new String[]{ "unnaturral" , "unnatural" } , new String[]{ "upcast" , "up cast" } , new String[]{ "upmost" , "utmost" } , new String[]{ "uranisium" , "uranium" } , new String[]{ "verison" , "version" } , new String[]{ "vinagarette" , "vinaigrette" } , new String[]{ "volumptuous" , "voluptuous" } , new String[]{ "volunteerism" , "voluntarism" } , new String[]{ "volye" , "volley" } , new String[]{ "wadting" , "wasting" } , new String[]{ "waite" , "wait" } , new String[]{ "wan\'t" , "won\'t" } , new String[]{ "warloord" , "warlord" } , new String[]{ "whaaat" , "what" } , new String[]{ "whard" , "ward" } , new String[]{ "whimp" , "wimp" } , new String[]{ "wicken" , "weaken" } , new String[]{ "wierd" , "weird" } , new String[]{ "wrank" , "rank" } , new String[]{ "writeen" , "righten" } , new String[]{ "writting" , "writing" } , new String[]{ "wundeews" , "windows" } , new String[]{ "yeild" , "yield" } , new String[]{ "youe" , "your" } };

    /** 
     * A subset of FIXTURE generated by this test.
     */
private static final String[][] MATCHES = new String[][]{ new String[]{ "Accosinly" , "Occasionally" } , new String[]{ "Maddness" , "Madness" } , new String[]{ "Occusionaly" , "Occasionally" } , new String[]{ "Steffen" , "Stephen" } , new String[]{ "Thw" , "The" } , new String[]{ "Unformanlly" , "Unfortunately" } , new String[]{ "Unfortally" , "Unfortunately" } , new String[]{ "abilitey" , "ability" } , new String[]{ "absorbtion" , "absorption" } , new String[]{ "accidently" , "accidentally" } , new String[]{ "accomodate" , "accommodate" } , new String[]{ "acommadate" , "accommodate" } , new String[]{ "acord" , "accord" } , new String[]{ "adultry" , "adultery" } , new String[]{ "aggresive" , "aggressive" } , new String[]{ "alchohol" , "alcohol" } , new String[]{ "alchoholic" , "alcoholic" } , new String[]{ "allieve" , "alive" } , new String[]{ "alot" , "a lot" } , new String[]{ "alright" , "all right" } , new String[]{ "amature" , "amateur" } , new String[]{ "ambivilant" , "ambivalent" } , new String[]{ "amourfous" , "amorphous" } , new String[]{ "annoint" , "anoint" } , new String[]{ "annonsment" , "announcement" } , new String[]{ "annoyting" , "anting" } , new String[]{ "annuncio" , "announce" } , new String[]{ "anotomy" , "anatomy" } , new String[]{ "antidesestablishmentarianism" , "antidisestablishmentarianism" } , new String[]{ "antidisestablishmentarism" , "antidisestablishmentarianism" } , new String[]{ "anynomous" , "anonymous" } , new String[]{ "appelet" , "applet" } , new String[]{ "appreceiated" , "appreciated" } , new String[]{ "appresteate" , "appreciate" } , new String[]{ "aquantance" , "acquaintance" } , new String[]{ "aricticure" , "architecture" } , new String[]{ "asterick" , "asterisk" } , new String[]{ "asymetric" , "asymmetric" } , new String[]{ "atentively" , "attentively" } , new String[]{ "bankrot" , "bankrupt" } , new String[]{ "basicly" , "basically" } , new String[]{ "batallion" , "battalion" } , new String[]{ "bbrose" , "browse" } , new String[]{ "beauro" , "bureau" } , new String[]{ "beaurocracy" , "bureaucracy" } , new String[]{ "beggining" , "beginning" } , new String[]{ "behaviour" , "behavior" } , new String[]{ "beleive" , "believe" } , new String[]{ "belive" , "believe" } , new String[]{ "blait" , "bleat" } , new String[]{ "bouyant" , "buoyant" } , new String[]{ "boygot" , "boycott" } , new String[]{ "brocolli" , "broccoli" } , new String[]{ "buder" , "butter" } , new String[]{ "budr" , "butter" } , new String[]{ "budter" , "butter" } , new String[]{ "buracracy" , "bureaucracy" } , new String[]{ "burracracy" , "bureaucracy" } , new String[]{ "buton" , "button" } , new String[]{ "byby" , "by by" } , new String[]{ "cauler" , "caller" } , new String[]{ "ceasar" , "caesar" } , new String[]{ "cemetary" , "cemetery" } , new String[]{ "changeing" , "changing" } , new String[]{ "cheet" , "cheat" } , new String[]{ "cimplicity" , "simplicity" } , new String[]{ "circumstaces" , "circumstances" } , new String[]{ "clob" , "club" } , new String[]{ "coaln" , "colon" } , new String[]{ "colleaque" , "colleague" } , new String[]{ "colloquilism" , "colloquialism" } , new String[]{ "columne" , "column" } , new String[]{ "comitmment" , "commitment" } , new String[]{ "comitte" , "committee" } , new String[]{ "comittmen" , "commitment" } , new String[]{ "comittmend" , "commitment" } , new String[]{ "commerciasl" , "commercials" } , new String[]{ "commited" , "committed" } , new String[]{ "commitee" , "committee" } , new String[]{ "companys" , "companies" } , new String[]{ "comupter" , "computer" } , new String[]{ "concensus" , "consensus" } , new String[]{ "confusionism" , "confucianism" } , new String[]{ "congradulations" , "congratulations" } , new String[]{ "contunie" , "continue" } , new String[]{ "cooly" , "coolly" } , new String[]{ "copping" , "coping" } , new String[]{ "cosmoplyton" , "cosmopolitan" } , new String[]{ "crasy" , "crazy" } , new String[]{ "croke" , "croak" } , new String[]{ "crucifiction" , "crucifixion" } , new String[]{ "crusifed" , "crucified" } , new String[]{ "cumba" , "combo" } , new String[]{ "custamisation" , "customization" } , new String[]{ "dag" , "dog" } , new String[]{ "daly" , "daily" } , new String[]{ "defence" , "defense" } , new String[]{ "definate" , "definite" } , new String[]{ "definately" , "definitely" } , new String[]{ "dependeble" , "dependable" } , new String[]{ "descrption" , "description" } , new String[]{ "descrptn" , "description" } , new String[]{ "desparate" , "desperate" } , new String[]{ "dessicate" , "desiccate" } , new String[]{ "destint" , "distant" } , new String[]{ "develepment" , "developments" } , new String[]{ "developement" , "development" } , new String[]{ "develpond" , "development" } , new String[]{ "devulge" , "divulge" } , new String[]{ "dieties" , "deities" } , new String[]{ "dinasaur" , "dinosaur" } , new String[]{ "dinasour" , "dinosaur" } , new String[]{ "discuess" , "discuss" } , new String[]{ "disect" , "dissect" } , new String[]{ "disippate" , "dissipate" } , new String[]{ "disition" , "decision" } , new String[]{ "dispair" , "despair" } , new String[]{ "distarct" , "distract" } , new String[]{ "distart" , "distort" } , new String[]{ "distroy" , "destroy" } , new String[]{ "doenload" , "download" } , new String[]{ "dongle" , "dangle" } , new String[]{ "doog" , "dog" } , new String[]{ "dramaticly" , "dramatically" } , new String[]{ "drunkeness" , "drunkenness" } , new String[]{ "ductioneery" , "dictionary" } , new String[]{ "ecstacy" , "ecstasy" } , new String[]{ "egsistence" , "existence" } , new String[]{ "eitiology" , "etiology" } , new String[]{ "elagent" , "elegant" } , new String[]{ "embarass" , "embarrass" } , new String[]{ "embarassment" , "embarrassment" } , new String[]{ "embaress" , "embarrass" } , new String[]{ "encapsualtion" , "encapsulation" } , new String[]{ "encyclapidia" , "encyclopedia" } , new String[]{ "encyclopia" , "encyclopedia" } , new String[]{ "engins" , "engine" } , new String[]{ "enhence" , "enhance" } , new String[]{ "ennuui" , "ennui" } , new String[]{ "enventions" , "inventions" } , new String[]{ "envireminakl" , "environmental" } , new String[]{ "enviroment" , "environment" } , new String[]{ "epitomy" , "epitome" } , new String[]{ "equire" , "acquire" } , new String[]{ "errara" , "error" } , new String[]{ "evaualtion" , "evaluation" } , new String[]{ "excede" , "exceed" } , new String[]{ "excercise" , "exercise" } , new String[]{ "excpt" , "except" } , new String[]{ "exhileration" , "exhilaration" } , new String[]{ "existance" , "existence" } , new String[]{ "expleyly" , "explicitly" } , new String[]{ "explity" , "explicitly" } , new String[]{ "failer" , "failure" } , new String[]{ "faver" , "favor" } , new String[]{ "faxe" , "fax" } , new String[]{ "firey" , "fiery" } , new String[]{ "fistival" , "festival" } , new String[]{ "flatterring" , "flattering" } , new String[]{ "flukse" , "flux" } , new String[]{ "fone" , "phone" } , new String[]{ "forsee" , "foresee" } , new String[]{ "frustartaion" , "frustrating" } , new String[]{ "funetik" , "phonetic" } , new String[]{ "gaurd" , "guard" } , new String[]{ "generly" , "generally" } , new String[]{ "ghandi" , "gandhi" } , new String[]{ "gotton" , "gotten" } , new String[]{ "gracefull" , "graceful" } , new String[]{ "gradualy" , "gradually" } , new String[]{ "grammer" , "grammar" } , new String[]{ "hallo" , "hello" } , new String[]{ "hapily" , "happily" } , new String[]{ "harrass" , "harass" } , new String[]{ "heellp" , "help" } , new String[]{ "heighth" , "height" } , new String[]{ "hellp" , "help" } , new String[]{ "helo" , "hello" } , new String[]{ "hifin" , "hyphen" } , new String[]{ "hifine" , "hyphen" } , new String[]{ "hiphine" , "hyphen" } , new String[]{ "hippie" , "hippy" } , new String[]{ "hippopotamous" , "hippopotamus" } , new String[]{ "hourse" , "horse" } , new String[]{ "houssing" , "housing" } , new String[]{ "howaver" , "however" } , new String[]{ "howver" , "however" } , new String[]{ "humaniti" , "humanity" } , new String[]{ "hyfin" , "hyphen" } , new String[]{ "hystrical" , "hysterical" } , new String[]{ "illegitament" , "illegitimate" } , new String[]{ "imbed" , "embed" } , new String[]{ "imediaetly" , "immediately" } , new String[]{ "immenant" , "immanent" } , new String[]{ "implemtes" , "implements" } , new String[]{ "inadvertant" , "inadvertent" } , new String[]{ "incase" , "in case" } , new String[]{ "incedious" , "insidious" } , new String[]{ "incompleet" , "incomplete" } , new String[]{ "incomplot" , "incomplete" } , new String[]{ "inconvenant" , "inconvenient" } , new String[]{ "inconvience" , "inconvenience" } , new String[]{ "independant" , "independent" } , new String[]{ "independenent" , "independent" } , new String[]{ "indepnends" , "independent" } , new String[]{ "indepth" , "in depth" } , new String[]{ "indispensible" , "indispensable" } , new String[]{ "inefficite" , "inefficient" } , new String[]{ "infact" , "in fact" } , new String[]{ "influencial" , "influential" } , new String[]{ "innoculate" , "inoculate" } , new String[]{ "insistant" , "insistent" } , new String[]{ "insistenet" , "insistent" } , new String[]{ "instulation" , "installation" } , new String[]{ "intealignt" , "intelligent" } , new String[]{ "intelegent" , "intelligent" } , new String[]{ "intelegnent" , "intelligent" } , new String[]{ "intelejent" , "intelligent" } , new String[]{ "inteligent" , "intelligent" } , new String[]{ "intelignt" , "intelligent" } , new String[]{ "intellagant" , "intelligent" } , new String[]{ "intellegent" , "intelligent" } , new String[]{ "intellegint" , "intelligent" } , new String[]{ "intellgnt" , "intelligent" } , new String[]{ "intensionality" , "intensionally" } , new String[]{ "internation" , "international" } , new String[]{ "interpretate" , "interpret" } , new String[]{ "interpretter" , "interpreter" } , new String[]{ "intertes" , "interested" } , new String[]{ "intertesd" , "interested" } , new String[]{ "invermeantial" , "environmental" } , new String[]{ "irresistable" , "irresistible" } , new String[]{ "irritible" , "irritable" } , new String[]{ "isreal" , "israel" } , new String[]{ "johhn" , "john" } , new String[]{ "kippur" , "kipper" } , new String[]{ "knawing" , "knowing" } , new String[]{ "lesure" , "leisure" } , new String[]{ "liasion" , "lesion" } , new String[]{ "liason" , "liaison" } , new String[]{ "likly" , "likely" } , new String[]{ "liquify" , "liquefy" } , new String[]{ "lloyer" , "layer" } , new String[]{ "lossing" , "losing" } , new String[]{ "luser" , "laser" } , new String[]{ "maintanence" , "maintenance" } , new String[]{ "mandelbrot" , "Mandelbrot" } , new String[]{ "marshall" , "marshal" } , new String[]{ "maxium" , "maximum" } , new String[]{ "mic" , "mike" } , new String[]{ "midia" , "media" } , new String[]{ "millenium" , "millennium" } , new String[]{ "miniscule" , "minuscule" } , new String[]{ "minkay" , "monkey" } , new String[]{ "mischievious" , "mischievous" } , new String[]{ "momento" , "memento" } , new String[]{ "monkay" , "monkey" } , new String[]{ "mosaik" , "mosaic" } , new String[]{ "mostlikely" , "most likely" } , new String[]{ "mousr" , "mouser" } , new String[]{ "mroe" , "more" } , new String[]{ "necesary" , "necessary" } , new String[]{ "necesser" , "necessary" } , new String[]{ "neice" , "niece" } , new String[]{ "neighbour" , "neighbor" } , new String[]{ "nemonic" , "pneumonic" } , new String[]{ "nevade" , "Nevada" } , new String[]{ "nickleodeon" , "nickelodeon" } , new String[]{ "nieve" , "naive" } , new String[]{ "noone" , "no one" } , new String[]{ "notin" , "not in" } , new String[]{ "nozled" , "nuzzled" } , new String[]{ "objectsion" , "objects" } , new String[]{ "ocassion" , "occasion" } , new String[]{ "occuppied" , "occupied" } , new String[]{ "occurence" , "occurrence" } , new String[]{ "octagenarian" , "octogenarian" } , new String[]{ "opposim" , "opossum" } , new String[]{ "organise" , "organize" } , new String[]{ "organiz" , "organize" } , new String[]{ "orientate" , "orient" } , new String[]{ "oscilascope" , "oscilloscope" } , new String[]{ "parametic" , "parameter" } , new String[]{ "permissable" , "permissible" } , new String[]{ "permmasivie" , "permissive" } , new String[]{ "persue" , "pursue" } , new String[]{ "phantasia" , "fantasia" } , new String[]{ "phenominal" , "phenomenal" } , new String[]{ "playwrite" , "playwright" } , new String[]{ "poeses" , "poesies" } , new String[]{ "poligamy" , "polygamy" } , new String[]{ "politict" , "politic" } , new String[]{ "pollice" , "police" } , new String[]{ "polypropalene" , "polypropylene" } , new String[]{ "possable" , "possible" } , new String[]{ "practicle" , "practical" } , new String[]{ "pragmaticism" , "pragmatism" } , new String[]{ "preceeding" , "preceding" } , new String[]{ "precios" , "precision" } , new String[]{ "preemptory" , "peremptory" } , new String[]{ "prefixt" , "prefixed" } , new String[]{ "presbyterian" , "Presbyterian" } , new String[]{ "presue" , "pursue" } , new String[]{ "presued" , "pursued" } , new String[]{ "privielage" , "privilege" } , new String[]{ "priviledge" , "privilege" } , new String[]{ "proceedures" , "procedures" } , new String[]{ "pronensiation" , "pronunciation" } , new String[]{ "pronounciation" , "pronunciation" } , new String[]{ "properally" , "properly" } , new String[]{ "proplematic" , "problematic" } , new String[]{ "protray" , "portray" } , new String[]{ "pscolgst" , "psychologist" } , new String[]{ "psicolagest" , "psychologist" } , new String[]{ "psycolagest" , "psychologist" } , new String[]{ "quoz" , "quiz" } , new String[]{ "radious" , "radius" } , new String[]{ "reccomend" , "recommend" } , new String[]{ "reccona" , "raccoon" } , new String[]{ "recieve" , "receive" } , new String[]{ "reconise" , "recognize" } , new String[]{ "rectangeles" , "rectangle" } , new String[]{ "reoccurring" , "recurring" } , new String[]{ "repitition" , "repetition" } , new String[]{ "replasments" , "replacement" } , new String[]{ "respct" , "respect" } , new String[]{ "respecally" , "respectfully" } , new String[]{ "rsx" , "RSX" } , new String[]{ "runnung" , "running" } , new String[]{ "sacreligious" , "sacrilegious" } , new String[]{ "salut" , "salute" } , new String[]{ "searcheable" , "searchable" } , new String[]{ "seferal" , "several" } , new String[]{ "segements" , "segments" } , new String[]{ "sence" , "sense" } , new String[]{ "seperate" , "separate" } , new String[]{ "sicolagest" , "psychologist" } , new String[]{ "sieze" , "seize" } , new String[]{ "simplye" , "simply" } , new String[]{ "sitte" , "site" } , new String[]{ "slyph" , "sylph" } , new String[]{ "smil" , "smile" } , new String[]{ "sometmes" , "sometimes" } , new String[]{ "soonec" , "sonic" } , new String[]{ "specificialy" , "specifically" } , new String[]{ "spel" , "spell" } , new String[]{ "spoak" , "spoke" } , new String[]{ "sponsered" , "sponsored" } , new String[]{ "stering" , "steering" } , new String[]{ "straightjacket" , "straitjacket" } , new String[]{ "stumach" , "stomach" } , new String[]{ "stutent" , "student" } , new String[]{ "styleguide" , "style guide" } , new String[]{ "subpena" , "subpoena" } , new String[]{ "substations" , "substitutions" } , new String[]{ "supercede" , "supersede" } , new String[]{ "superfulous" , "superfluous" } , new String[]{ "susan" , "Susan" } , new String[]{ "swimwear" , "swim wear" } , new String[]{ "syncorization" , "synchronization" } , new String[]{ "taff" , "tough" } , new String[]{ "taht" , "that" } , new String[]{ "tattos" , "tattoos" } , new String[]{ "techniquely" , "technically" } , new String[]{ "teh" , "the" } , new String[]{ "tem" , "team" } , new String[]{ "teo" , "two" } , new String[]{ "teridical" , "theoretical" } , new String[]{ "tesst" , "test" } , new String[]{ "theridically" , "theoretical" } , new String[]{ "thredically" , "theoretically" } , new String[]{ "thruout" , "throughout" } , new String[]{ "ths" , "this" } , new String[]{ "titalate" , "titillate" } , new String[]{ "tobagan" , "tobaggon" } , new String[]{ "tommorrow" , "tomorrow" } , new String[]{ "tomorow" , "tomorrow" } , new String[]{ "trubbel" , "trouble" } , new String[]{ "ttest" , "test" } , new String[]{ "tyrrany" , "tyranny" } , new String[]{ "unatourral" , "unnatural" } , new String[]{ "unaturral" , "unnatural" } , new String[]{ "unconisitional" , "unconstitutional" } , new String[]{ "unconscience" , "unconscious" } , new String[]{ "underladder" , "under ladder" } , new String[]{ "unentelegible" , "unintelligible" } , new String[]{ "unfortunently" , "unfortunately" } , new String[]{ "unnaturral" , "unnatural" } , new String[]{ "upcast" , "up cast" } , new String[]{ "verison" , "version" } , new String[]{ "vinagarette" , "vinaigrette" } , new String[]{ "volunteerism" , "voluntarism" } , new String[]{ "volye" , "volley" } , new String[]{ "waite" , "wait" } , new String[]{ "wan\'t" , "won\'t" } , new String[]{ "warloord" , "warlord" } , new String[]{ "whaaat" , "what" } , new String[]{ "whard" , "ward" } , new String[]{ "whimp" , "wimp" } , new String[]{ "wicken" , "weaken" } , new String[]{ "wierd" , "weird" } , new String[]{ "wrank" , "rank" } , new String[]{ "writeen" , "righten" } , new String[]{ "writting" , "writing" } , new String[]{ "wundeews" , "windows" } , new String[]{ "yeild" , "yield" } };

    /** 
     * Tests encoding APIs in one place.
     */
private void assertDoubleMetaphone(final String expected, final String source) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),556,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),558,getStringEncoder(),557,getStringEncoder().encode(source));
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),559,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),561,getStringEncoder(),560,getStringEncoder().encode(((java.lang.Object)(source))));
        } catch (final EncoderException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),562,("Unexpected expection: " + e));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),563,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),565,getStringEncoder(),564,getStringEncoder().doubleMetaphone(source));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),566,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),568,getStringEncoder(),567,getStringEncoder().doubleMetaphone(source, false));
    }

    /** 
     * Tests encoding APIs in one place.
     */
public void assertDoubleMetaphoneAlt(final String expected, final String source) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),571,getStringEncoder(),570,getStringEncoder().doubleMetaphone(source, true));
    }

    @Override
    protected DoubleMetaphone createStringEncoder() {
        return new DoubleMetaphone();
    }

    public void doubleMetaphoneEqualTest(final String[][] pairs, final boolean useAlternate) {
        validateFixture(pairs);
        for (final String[] pair : pairs) {
            final String name0 = pair[0];
            final String name1 = pair[1];
            final String failMsg = ((((("Expected match between " + name0) + " and ") + name1) + " (use alternate: ") + useAlternate) + ")";
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),572,failMsg);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),574,getStringEncoder(),573,getStringEncoder().isDoubleMetaphoneEqual(name0, name1, useAlternate));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),575,failMsg);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),577,getStringEncoder(),576,getStringEncoder().isDoubleMetaphoneEqual(name1, name0, useAlternate));
            if (!useAlternate) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),578,failMsg);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),580,getStringEncoder(),579,getStringEncoder().isDoubleMetaphoneEqual(name0, name1));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),581,failMsg);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),583,getStringEncoder(),582,getStringEncoder().isDoubleMetaphoneEqual(name1, name0));
            } 
        }
    }

    public void doubleMetaphoneNotEqualTest(final boolean alternate) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),585,getStringEncoder(),584,getStringEncoder().isDoubleMetaphoneEqual("Brain", "Band", alternate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),587,getStringEncoder(),586,getStringEncoder().isDoubleMetaphoneEqual("Band", "Brain", alternate));
        if (!alternate) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),589,getStringEncoder(),588,getStringEncoder().isDoubleMetaphoneEqual("Brain", "Band"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),591,getStringEncoder(),590,getStringEncoder().isDoubleMetaphoneEqual("Band", "Brain"));
        } 
    }

    @Test
    public void testCCedilla() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCCedilla");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,getStringEncoder(),592,getStringEncoder().isDoubleMetaphoneEqual("ç", "S"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodec184() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec184");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,new org.apache.commons.codec.language.DoubleMetaphone(),594,new org.apache.commons.codec.language.DoubleMetaphone().isDoubleMetaphoneEqual("", "", false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),597,new org.apache.commons.codec.language.DoubleMetaphone(),596,new org.apache.commons.codec.language.DoubleMetaphone().isDoubleMetaphoneEqual("", "", true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,new org.apache.commons.codec.language.DoubleMetaphone(),598,new org.apache.commons.codec.language.DoubleMetaphone().isDoubleMetaphoneEqual("aa", "", false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,new org.apache.commons.codec.language.DoubleMetaphone(),600,new org.apache.commons.codec.language.DoubleMetaphone().isDoubleMetaphoneEqual("aa", "", true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,new org.apache.commons.codec.language.DoubleMetaphone(),602,new org.apache.commons.codec.language.DoubleMetaphone().isDoubleMetaphoneEqual("", "aa", false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),605,new org.apache.commons.codec.language.DoubleMetaphone(),604,new org.apache.commons.codec.language.DoubleMetaphone().isDoubleMetaphoneEqual("", "aa", true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add151");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add152() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add152");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add153");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add154");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add155");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add156");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add157");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add158");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add159() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add159");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add160");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add161() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add161");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add162");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add163");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add164() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add164");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add165");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add166");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add167");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add168() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add168");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add169() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add169");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add170() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add170");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add171() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add171");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add172() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add172");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add173() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add173");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add174() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add174");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add175() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add175");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add176() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add176");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add177() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add177");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add178() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add178");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add179() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add179");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add180() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add180");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add181() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add181");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add182() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add182");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add183");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add184");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add185() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add185");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_add186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_add186");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone");
        assertDoubleMetaphone("foo", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation818() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation818");
        assertDoubleMetaphone("TSTN", "bar");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation819() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation819");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("bar", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation820() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation820");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "bar");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation821() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation821");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("foo", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation822() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation822");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "bar");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation823() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation823");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("foo", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation824() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation824");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "bar");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation825() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation825");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("bar", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation826() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation826");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "foo");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation827");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("bar", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation828() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation828");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "bar");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation829");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("foo", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation830() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation830");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "bar");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation831() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation831");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("foo", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation832() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation832");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "foo");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation833() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation833");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("bar", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation834() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation834");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "bar");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation835() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation835");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("bar", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation836() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation836");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "foo");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation837() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation837");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("foo", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation838() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation838");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "foo");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation839() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation839");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("bar", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation840() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation840");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "foo");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation841() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation841");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("bar", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation842() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation842");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "foo");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation843() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation843");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("foo", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation844() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation844");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "foo");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation845() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation845");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("bar", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation846() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation846");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "foo");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation847() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation847");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("foo", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation848() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation848");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "bar");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation849() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation849");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("foo", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation850() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation850");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "foo");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation851() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation851");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("bar", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation852() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation852");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "foo");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation853() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation853");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("foo", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation854() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation854");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "foo");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation855() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation855");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("foo", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation856() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation856");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "foo");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation857() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation857");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("foo", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation858() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation858");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "bar");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation859() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation859");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("bar", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation860() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation860");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "foo");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation861() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation861");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("foo", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation862() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation862");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "bar");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation863() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation863");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("bar", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation864() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation864");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "foo");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation865() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation865");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("foo", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation866() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation866");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "bar");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation867() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation867");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("foo", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation868() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation868");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "bar");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation869() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation869");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("foo", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation870() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation870");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "bar");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation871() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation871");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("foo", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation872");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "foo");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation873() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation873");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("foo", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation874() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation874");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "bar");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation875() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation875");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("bar", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation876() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation876");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "foo");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation877() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation877");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("bar", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation878() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation878");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "bar");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation879() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation879");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("bar", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation880() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation880");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "bar");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation881() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation881");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("bar", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation882() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation882");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "bar");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation883");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("foo", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation884() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation884");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "foo");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation885() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation885");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("foo", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation886() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation886");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "foo");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation887() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation887");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("foo", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDoubleMetaphone_literalMutation888() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_literalMutation888");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove134() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove134");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove135() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove135");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove136");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove137() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove137");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove138");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove139() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove139");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove140() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove140");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove141");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove142() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove142");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove143() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove143");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove144");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove145() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove145");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove146");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove147() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove147");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove148() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove148");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove149() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove149");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("TSTN", "testing");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove150() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove150");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove151");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove152() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove152");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove153");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove154");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove155");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove156");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove157");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove158");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove159() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove159");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove160");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove161() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove161");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove162");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove163");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove164() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove164");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove165");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove166");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove167");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove168() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove168");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleMetaphone_remove169() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleMetaphone_remove169");
        assertDoubleMetaphone("TSTN", "testing");
        assertDoubleMetaphone("0", "The");
        assertDoubleMetaphone("KK", "quick");
        assertDoubleMetaphone("PRN", "brown");
        assertDoubleMetaphone("FKS", "fox");
        assertDoubleMetaphone("JMPT", "jumped");
        assertDoubleMetaphone("AFR", "over");
        assertDoubleMetaphone("0", "the");
        assertDoubleMetaphone("LS", "lazy");
        assertDoubleMetaphone("TKS", "dogs");
        assertDoubleMetaphone("MKFR", "MacCafferey");
        assertDoubleMetaphone("STFN", "Stephan");
        assertDoubleMetaphone("KSSK", "Kuczewski");
        assertDoubleMetaphone("MKLL", "McClelland");
        assertDoubleMetaphone("SNHS", "san jose");
        assertDoubleMetaphone("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("T", "The");
        assertDoubleMetaphoneAlt("KK", "quick");
        assertDoubleMetaphoneAlt("PRN", "brown");
        assertDoubleMetaphoneAlt("FKS", "fox");
        assertDoubleMetaphoneAlt("AMPT", "jumped");
        assertDoubleMetaphoneAlt("AFR", "over");
        assertDoubleMetaphoneAlt("T", "the");
        assertDoubleMetaphoneAlt("LS", "lazy");
        assertDoubleMetaphoneAlt("TKS", "dogs");
        assertDoubleMetaphoneAlt("MKFR", "MacCafferey");
        assertDoubleMetaphoneAlt("STFN", "Stephan");
        assertDoubleMetaphoneAlt("KXFS", "Kutchefski");
        assertDoubleMetaphoneAlt("MKLL", "McClelland");
        assertDoubleMetaphoneAlt("SNHS", "san jose");
        assertDoubleMetaphoneAlt("SNFP", "xenophobia");
        assertDoubleMetaphoneAlt("FKR", "Fokker");
        assertDoubleMetaphoneAlt("AK", "Joqqi");
        assertDoubleMetaphoneAlt("HF", "Hovvi");
        assertDoubleMetaphoneAlt("XRN", "Czerny");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEmpty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),607,getStringEncoder(),606,getStringEncoder().doubleMetaphone(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),609,getStringEncoder(),608,getStringEncoder().doubleMetaphone(""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),611,getStringEncoder(),610,getStringEncoder().doubleMetaphone(" "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),613,getStringEncoder(),612,getStringEncoder().doubleMetaphone("\t\n\r "));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualBasic_add187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_add187");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualBasic_add188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_add188");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic");
        final String[][] testFixture = new String[][]{ new String[]{ "foo" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation890() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation890");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "bar" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation891() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation891");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "bar" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation892() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation892");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "bar" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation893() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation893");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "bar" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation894() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation894");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "bar" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation895() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation895");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "bar" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation896() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation896");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "foo" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation897() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation897");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "bar" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation898() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation898");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "bar" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation899() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation899");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "foo" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation900() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation900");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "bar" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation901() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation901");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "bar" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation902() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation902");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "bar" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation903() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation903");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "bar" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation904() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation904");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "foo" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation905() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation905");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "bar" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation906() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation906");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "bar" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation907() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation907");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "foo" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation908() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation908");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "foo" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation909() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation909");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, true);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualBasic_literalMutation910() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_literalMutation910");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, false);
        doubleMetaphoneEqualTest(testFixture, false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualBasic_remove170() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_remove170");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualBasic_remove171() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualBasic_remove171");
        final String[][] testFixture = new String[][]{ new String[]{ "" , "" } , new String[]{ "Case" , "case" } , new String[]{ "CASE" , "Case" } , new String[]{ "caSe" , "cAsE" } , new String[]{ "cookie" , "quick" } , new String[]{ "quick" , "cookie" } , new String[]{ "Brian" , "Bryan" } , new String[]{ "Auto" , "Otto" } , new String[]{ "Steven" , "Stefan" } , new String[]{ "Philipowitz" , "Filipowicz" } };
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Example in the original article but failures in this Java impl:
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended1");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualExtended2_add189() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended2_add189");
        final String[][] testFixture = new String[][]{ new String[]{ "Jablonski" , "Yablonsky" } };
        doubleMetaphoneEqualTest(testFixture, true);
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualExtended2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended2");
        final String[][] testFixture = new String[][]{ new String[]{ "foo" , "Yablonsky" } };
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualExtended2_literalMutation912() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended2_literalMutation912");
        final String[][] testFixture = new String[][]{ new String[]{ "Jablonski" , "bar" } };
        doubleMetaphoneEqualTest(testFixture, true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualExtended2_literalMutation913() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended2_literalMutation913");
        final String[][] testFixture = new String[][]{ new String[]{ "Jablonski" , "Yablonsky" } };
        doubleMetaphoneEqualTest(testFixture, false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualExtended2_remove172() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended2_remove172");
        final String[][] testFixture = new String[][]{ new String[]{ "Jablonski" , "Yablonsky" } };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualExtended3_add190() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_add190");
        validateFixture(FIXTURE);
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualExtended3_add191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_add191");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualExtended3_add192() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_add192");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualExtended3_add193() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_add193");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualExtended3_add194() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_add194");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("bar");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation915() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation915");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("foo" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation916() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation916");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 1;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation917() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation917");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = -1;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation918() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation918");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation919() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation919");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 1 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation920() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation920");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = -1 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation921() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation921");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation922() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation922");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][1];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation923");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][-1];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation924");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation925");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][2];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation926");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][0];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation927");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][0];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation928");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation929");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation930");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == true) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation931");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == true)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation932");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("foo" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation933() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation933");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "bar") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation934");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + "bar") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation935");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("bar" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation936");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "bar") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation937");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "bar") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation938");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("foo");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation939() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation939");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 1) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation940() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation940");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > -1) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test
    public void testIsDoubleMetaphoneEqualExtended3_literalMutation941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_literalMutation941");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualExtended3_remove173() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_remove173");
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualExtended3_remove174() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_remove174");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualExtended3_remove175() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_remove175");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualExtended3_remove176() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_remove176");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        matches.append(("private static final String[][] MATCHES = {" + cr));
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Used to generate the MATCHES array and test possible matches from the
     * FIXTURE array.
     */
@Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualExtended3_remove177() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualExtended3_remove177");
        validateFixture(FIXTURE);
        final StringBuilder failures = new StringBuilder();
        final StringBuilder matches = new StringBuilder();
        final String cr = java.lang.System.getProperty("line.separator");
        int failCount = 0;
        for (int i = 0 ; i < (FIXTURE.length) ; i++) {
            final String name0 = FIXTURE[i][0];
            final String name1 = FIXTURE[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                final String failMsg = ((((("[" + i) + "] ") + name0) + " and ") + name1) + cr;
                failures.append(failMsg);
                failCount++;
            } else {
                matches.append(((((("{\"" + name0) + "\", \"") + name1) + "\"},") + cr));
            }
        }
        matches.append("};");
        if (failCount > 0) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualWithMATCHES_add195() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_add195");
        validateFixture(MATCHES);
        validateFixture(MATCHES);
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES");
        validateFixture(MATCHES);
        for (int i = 1 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES_literalMutation943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_literalMutation943");
        validateFixture(MATCHES);
        for (int i = -1 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES_literalMutation944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_literalMutation944");
        validateFixture(MATCHES);
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES_literalMutation945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_literalMutation945");
        validateFixture(MATCHES);
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][1];
            final String name1 = MATCHES[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES_literalMutation946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_literalMutation946");
        validateFixture(MATCHES);
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][-1];
            final String name1 = MATCHES[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES_literalMutation947() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_literalMutation947");
        validateFixture(MATCHES);
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES_literalMutation948() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_literalMutation948");
        validateFixture(MATCHES);
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][2];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES_literalMutation949() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_literalMutation949");
        validateFixture(MATCHES);
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][0];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES_literalMutation950() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_literalMutation950");
        validateFixture(MATCHES);
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][0];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES_literalMutation951() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_literalMutation951");
        validateFixture(MATCHES);
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES_literalMutation952() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_literalMutation952");
        validateFixture(MATCHES);
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES_literalMutation953() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_literalMutation953");
        validateFixture(MATCHES);
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == true) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithMATCHES_literalMutation954() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_literalMutation954");
        validateFixture(MATCHES);
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == true)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsDoubleMetaphoneEqualWithMATCHES_remove178() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneEqualWithMATCHES_remove178");
        for (int i = 0 ; i < (MATCHES.length) ; i++) {
            final String name0 = MATCHES[i][0];
            final String name1 = MATCHES[i][1];
            final boolean match1 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, false);
            final boolean match2 = getStringEncoder().isDoubleMetaphoneEqual(name0, name1, true);
            if ((match1 == false) && (match2 == false)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),614,((((("Expected match [" + i) + "] ") + name0) + " and ") + name1));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsDoubleMetaphoneNotEqual_add196() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneNotEqual_add196");
        doubleMetaphoneNotEqualTest(false);
        doubleMetaphoneNotEqualTest(false);
        doubleMetaphoneNotEqualTest(true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsDoubleMetaphoneNotEqual_add197() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneNotEqual_add197");
        doubleMetaphoneNotEqualTest(false);
        doubleMetaphoneNotEqualTest(true);
        doubleMetaphoneNotEqualTest(true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneNotEqual() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneNotEqual");
        doubleMetaphoneNotEqualTest(true);
        doubleMetaphoneNotEqualTest(true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsDoubleMetaphoneNotEqual_literalMutation956() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneNotEqual_literalMutation956");
        doubleMetaphoneNotEqualTest(false);
        doubleMetaphoneNotEqualTest(false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsDoubleMetaphoneNotEqual_remove179() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneNotEqual_remove179");
        doubleMetaphoneNotEqualTest(true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsDoubleMetaphoneNotEqual_remove180() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsDoubleMetaphoneNotEqual_remove180");
        doubleMetaphoneNotEqualTest(true);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNTilde() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNTilde");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),616,getStringEncoder(),615,getStringEncoder().isDoubleMetaphoneEqual("ñ", "N"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test setting maximum length
     */
@Test(timeout = 1000)
    public void testSetMaxCodeLength_add198() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxCodeLength_add198");
        final String value = "jumped";
        final DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),618,doubleMetaphone,617,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,doubleMetaphone,619,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,doubleMetaphone,621,doubleMetaphone.doubleMetaphone(value, true));
        doubleMetaphone.setMaxCodeLen(3);
        doubleMetaphone.setMaxCodeLen(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),624,doubleMetaphone,623,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,doubleMetaphone,625,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,doubleMetaphone,627,doubleMetaphone.doubleMetaphone(value, true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test setting maximum length
     */
@Test
    public void testSetMaxCodeLength() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxCodeLength");
        final String value = "bar";
        final DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),618,doubleMetaphone,617,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,doubleMetaphone,619,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,doubleMetaphone,621,doubleMetaphone.doubleMetaphone(value, true));
        doubleMetaphone.setMaxCodeLen(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),624,doubleMetaphone,623,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,doubleMetaphone,625,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,doubleMetaphone,627,doubleMetaphone.doubleMetaphone(value, true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test setting maximum length
     */
@Test
    public void testSetMaxCodeLength_literalMutation958() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxCodeLength_literalMutation958");
        final String value = "jumped";
        final DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),618,doubleMetaphone,617,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,doubleMetaphone,619,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,doubleMetaphone,621,doubleMetaphone.doubleMetaphone(value, true));
        doubleMetaphone.setMaxCodeLen(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),624,doubleMetaphone,623,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,doubleMetaphone,625,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,doubleMetaphone,627,doubleMetaphone.doubleMetaphone(value, true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test setting maximum length
     */
@Test
    public void testSetMaxCodeLength_literalMutation959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxCodeLength_literalMutation959");
        final String value = "jumped";
        final DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),618,doubleMetaphone,617,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,doubleMetaphone,619,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,doubleMetaphone,621,doubleMetaphone.doubleMetaphone(value, true));
        doubleMetaphone.setMaxCodeLen(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),624,doubleMetaphone,623,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,doubleMetaphone,625,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,doubleMetaphone,627,doubleMetaphone.doubleMetaphone(value, true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test setting maximum length
     */
@Test
    public void testSetMaxCodeLength_literalMutation960() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxCodeLength_literalMutation960");
        final String value = "jumped";
        final DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),618,doubleMetaphone,617,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,doubleMetaphone,619,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,doubleMetaphone,621,doubleMetaphone.doubleMetaphone(value, true));
        doubleMetaphone.setMaxCodeLen(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),624,doubleMetaphone,623,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,doubleMetaphone,625,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,doubleMetaphone,627,doubleMetaphone.doubleMetaphone(value, true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test setting maximum length
     */
@Test
    public void testSetMaxCodeLength_literalMutation961() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxCodeLength_literalMutation961");
        final String value = "jumped";
        final DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),618,doubleMetaphone,617,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,doubleMetaphone,619,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,doubleMetaphone,621,doubleMetaphone.doubleMetaphone(value, true));
        doubleMetaphone.setMaxCodeLen(6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),624,doubleMetaphone,623,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,doubleMetaphone,625,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,doubleMetaphone,627,doubleMetaphone.doubleMetaphone(value, true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test setting maximum length
     */
@Test(timeout = 1000)
    public void testSetMaxCodeLength_remove181() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetMaxCodeLength_remove181");
        final String value = "jumped";
        final DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),618,doubleMetaphone,617,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),620,doubleMetaphone,619,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),622,doubleMetaphone,621,doubleMetaphone.doubleMetaphone(value, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),624,doubleMetaphone,623,doubleMetaphone.getMaxCodeLen());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),626,doubleMetaphone,625,doubleMetaphone.doubleMetaphone(value, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),628,doubleMetaphone,627,doubleMetaphone.doubleMetaphone(value, true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void validateFixture(final String[][] pairs) {
        if ((pairs.length) == 0) {
        } 
        for (int i = 0 ; i < (pairs.length) ; i++) {
            if ((pairs[i].length) != 2) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,("Error in test fixture in the data array at index " + i));
            } 
        }
    }
}

