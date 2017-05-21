package models.rules

import models.rules.impl._

// scalastyle:off
object GameRulesSet {
  lazy val favorites = Seq(Klondike, KlondikeOneCard, FreeCell, Pyramid, Spider)
  lazy val (completed, unfinished) = allSortedByTitle.partition(_._2.completed)

  lazy val allByIdWithAliases = all.map(x => x.id -> x).toMap ++ all.flatMap(x => x.aka.map(aka => aka._1 -> x)).toMap
  lazy val allSortedByTitle = allByIdWithAliases.toSeq.sortBy { row =>
    if (row._1 == row._2.id) { row._2.title } else { row._2.aka(row._1) }
  }

  val all = Seq(
    AceOfHearts,
    AcesAndKings,
    AceyAndKingsley,
    Acme,
    Acquaintance,
    Adelaide,
    AgnesBernauer,
    AgnesSorel,
    Alaska,
    AlexanderTheGreat,
    Alexandria,
    Algiers,
    AliBaba,
    AllInARow,
    Alternate,
    Alternations,
    Alternative,
    AmericanCanister,
    AmericanToad,
    Antares,
    Ants,
    Anubis,
    Apophis,
    Applegate,
    Arabella,
    Arizona,
    Assembly,
    Astrocyte,
    Athena,
    AuldLangSyne,
    AuntMary,
    Australian,
    Backbone,
    Bakers,
    BakersDozen,
    BakersTwoDeck,
    Balcony,
    BarricadeA,
    BarricadeB,
    Bastion,
    Bath,
    Batsford,
    BatsfordAgain,
    Bavarian,
    BearRiver,
    Beehive,
    BeehiveGalleryMode,
    Beetle,
    BeleagueredCastle,
    BeleagueredFortress,
    BigApple,
    BigBertha,
    BigForty,
    BigFreeCell,
    BigHarp,
    BigSpider,
    BinaryStar,
    Bisley,
    BlackHole,
    BlackWidow,
    BlindAlleys,
    Block,
    Blockade,
    BlockTen,
    BlondesAndBrunettes,
    Bobby,
    Boulevard,
    BoxFan,
    BoxKite,
    Brazilian,
    Breakwater,
    Brigade,
    Brisbane,
    Bristol,
    BritishCanister,
    BrownRecluse,
    Bucket,
    BuffaloBill,
    Bunker,
    Bureau,
    BusyAces,
    Calculation,
    Canfield,
    CanfieldGalleryMode,
    CanfieldRush,
    Canister,
    Caprice,
    CaptiveQueens,
    Carlton,
    Carousel,
    Carpet,
    Carthage,
    Cassim,
    Castile,
    CastleMount,
    CastleOfIndolence,
    CastlesEnd,
    CastlesInSpain,
    CastOutNines,
    CeilingFan,
    CellEleven,
    ChallengeFreeCell,
    Chameleon,
    Chateau,
    Chelicera,
    Cheops,
    Chequers,
    Chessboard,
    Chinaman,
    Chinese,
    ChineseFreeCell,
    ChineseKlondike,
    ChineseSpider,
    Cicely,
    CircleEight,
    Citadel,
    Cleopatra,
    CloverLeaf,
    Colonel,
    Colorado,
    Congress,
    Contradance,
    Cornelius,
    Corners,
    CornerSuite,
    Corona,
    Countess,
    Courtyard,
    Coyote,
    Crescent,
    CrescentFour,
    CrissCross,
    Cromwell,
    Cruel,
    Czarina,
    DarkPyramid,
    Darwin,
    Demon,
    DemonFan,
    DemonsAndThieves,
    Deuces,
    DeucesAndQueens,
    Diavolo,
    Dieppe,
    Dimes,
    Diplomat,
    Dnieper,
    Dorothy,
    DoubleAcesAndKings,
    DoubleCanfield,
    DoubleDot,
    DoubleEasthaven,
    DoubleFourteens,
    DoubleFreeCell,
    DoubleGoldRush,
    DoubleJane,
    DoubleKlondike,
    DoubleLimited,
    DoubleMinerva,
    DoublePyramid,
    DoubleRail,
    DoubleRussian,
    DoubleScorpion,
    DoubleSeaTowers,
    DoubleSignora,
    DoubleStorehouse,
    DoubletCell,
    DoubleTrigon,
    Doublets,
    DoubleYukon,
    Dover,
    Dragon,
    Easthaven,
    Eclipse,
    EightByEight,
    Eighteens,
    EightOff,
    EightOn,
    EightsDown,
    EightyThieves,
    Elba,
    Elevens,
    ElevenTriangle,
    Eliminator,
    Emperor,
    EmpressOfItaly,
    EndlessHarp,
    EphemeralFreeCell,
    Escalator,
    EternalTriangle,
    EvenAndOdd,
    ExiledKings,
    FairMaids,
    FallingStar,
    FamousFifty,
    Fan,
    FarmersWife,
    Father,
    Fifteen,
    FifteenRush,
    Fifteens,
    Floradora,
    Flow,
    FlowerGarden,
    Fly,
    ForeCell,
    Fortress,
    FortressOfMercy,
    FortunesFavor,
    FortyAndEight,
    FortyBandits,
    FortyDevils,
    FortyNine,
    FortyThieves,
    FortyThieves3Deck,
    FortyThieves4Deck,
    FourByTen,
    FourLeafClovers,
    FourSeasons,
    FoursUp,
    FourteenOut,
    FredsSpider,
    FreeCell,
    FreeCellDuplex,
    FreeCellFourDeck,
    FreeCellThreeDeck,
    FreeFan,
    Friday,
    Frog,
    Gargantua,
    GayGordons,
    German,
    Giant,
    Gilbert,
    Giza,
    Gloucestershire,
    GoldMine,
    GoldRush,
    Golf,
    GolfRush,
    GoodMeasure,
    Gotham,
    Grandfather,
    GreatTriangle,
    GroundsForDivorce,
    Gypsy,
    HalfCell,
    Harp,
    Haystack,
    HowTheyRun,
    HugeSpider,
    Hypotenuse,
    ImperialGuards,
    Incompatibility,
    Indefatigable,
    Indian,
    Inquisitor,
    InsaneKlondike,
    Intelligence,
    Interchange,
    InvertedFreeCell,
    Irmgard,
    Isabel,
    JacksInTheBox,
    Josephine,
    JumboKlondike,
    Junction,
    Juvenile,
    Kansas,
    Kiev,
    KingAlbert,
    KingCell,
    Kingdom,
    KingsdownEights,
    Kingsley,
    KingTut,
    Klondike,
    KlondikeGalleryMode,
    KlondikeOneCard,
    KlondikeTerritory,
    KnottyNines,
    LaBelleLucie,
    LadyBetty,
    LadyCadogan,
    LadyJane,
    LadyPalk,
    Lafayette,
    Lanes,
    Lasker,
    LeapYear,
    Lily,
    Limited,
    LincolnGreens,
    Links,
    Linus,
    LittleBillie,
    LittleForty,
    LittleGiant,
    LittleMilligan,
    LittleNapolean,
    LoveADuck,
    Lower48,
    Lucas,
    LucasLeaps,
    LuckierThirteen,
    LuckyFan,
    LuckyPiles,
    LuckyThirteen,
    Malmaison,
    MamySusan,
    Manx,
    Maria,
    MarieRose,
    Martha,
    McClellan,
    MidnightClover,
    Midshipman,
    Millie,
    MilliganCell,
    MilliganHarp,
    MilliganYukon,
    Minerva,
    MissMilligan,
    MondoSpider,
    Moosehide,
    Morehead,
    MountOlympus,
    MovingLeft,
    Munger,
    Muse,
    Mystique,
    NapoleonsQuadrilateral,
    NapoleonsShoulder,
    NapoleonsSquare,
    Nationale,
    Needle,
    Neptune,
    Nestor,
    NewYork,
    Nines,
    NorthwestTerritory,
    NumberTen,
    OctupleKlondike,
    OddAndEven,
    Odessa,
    OldCarlton,
    Opus,
    Outback,
    Pantagruel,
    PantherCreek,
    Parliament,
    PasSeul,
    PatientPairs,
    PenelopesWeb,
    Penguin,
    Penta,
    PerseveranceA,
    PerseveranceB,
    Pharaohs,
    Phoenix,
    PileUp,
    Pitchfork,
    PokerSquares,
    Portuguese,
    Preference,
    PrivateLane,
    PuttPutt,
    Pyramid,
    PyramidDozen,
    Quadrangle,
    Quadrennial,
    QuadrupleCanfield,
    QuadrupleInterchange,
    QuadrupleKlondike,
    QuadrupleTrigon,
    QuadrupleYukon,
    Queenie,
    QueenVictoria,
    QuintupleKlondike,
    Quizzie,
    RacingAces,
    Raglan,
    Rainbow,
    RainbowFan,
    RankAndFile,
    RedAndBlack,
    Repair,
    RippleFan,
    Robert,
    Robie,
    Roman,
    Roosevelt,
    RougeEtNoir,
    RougeForty,
    RowsOfFour,
    RoyalCotillion,
    RoyalFamily,
    RoyalRendezvous,
    Rueil,
    Russian,
    RussianCell,
    Sally,
    Sandbox,
    SandboxB,
    SanJuanHill,
    Saratoga,
    Sarlacc,
    Saxony,
    Scorpion,
    ScorpionHead,
    ScorpionTail,
    Scotch,
    SeaTowers,
    SelectiveCastle,
    SelectiveFreeCell,
    Sevastopol,
    SevenByFive,
    SevenByFour,
    SevenBySeven,
    SevenDevils,
    SextupleKlondike,
    ShadyLanes,
    Shamrocks,
    Shuffle,
    Signora,
    SimonJester,
    SimonSays,
    SimplePairs,
    SimpleSimon,
    SingleInterchange,
    SingleLeft,
    SingleRail,
    SirTommy,
    SixByFour,
    SixesAndSevens,
    SixteenPiles,
    SixtyThieves,
    Skippy,
    Smokey,
    Somerset,
    Spanish,
    Spider,
    SpiderCells,
    Spiderette,
    SpiderOneSuit,
    SpiderThreeDeck,
    SpiderTwoSuits,
    Spidike,
    Spike,
    Squadron,
    Stages,
    Stalactites,
    Steps,
    Steve,
    Stewart,
    Stonewall,
    Storehouse,
    StraightFifteens,
    Strata,
    Streets,
    StreetAndAlleys,
    Stronghold,
    SuitElevens,
    SuitsUp,
    SuitTriangle,
    SuperChallengeFreeCell,
    SuperFlowerGarden,
    SuperiorCanfield,
    SweetSixteen,
    Swiss,
    Tabbycat,
    TakingSilk,
    Tarantula,
    TenAcross,
    TenByOne,
    Tens,
    TensOut,
    TheWish,
    ThievesOfEgypt,
    ThievesRush,
    Thirteens,
    ThirtyNineSteps,
    ThirtySix,
    Thoughtful,
    ThreeBears,
    ThreeBlindMice,
    ThreeCell,
    ThreeDemons,
    ThreePirates,
    ThreesCompany,
    ThreeShufflesAndADraw,
    ThumbAndPouch,
    Titan,
    Tournament,
    Trefoil,
    TreviGarden,
    Triangle,
    Trigon,
    TrigonLeft,
    Trillium,
    TripleCanfield,
    TripleEasthaven,
    TripleFourteens,
    TripleFreeCell,
    Tripleharp,
    TripleInterchange,
    TripleKlondike,
    TripleLeft,
    TripleMinerva,
    TripleRussian,
    TripleScorpion,
    TripleTriangle,
    TripleYukon,
    TrustyTwelve,
    Tuxedo,
    TvetesGrandfather,
    Twenty,
    TwoCell,
    Ukrainian,
    Unlimited,
    Unusual,
    UpAndUp,
    Usk,
    VariegatedCanfield,
    Vineyard,
    WadingPool,
    WaningMoon,
    Waterloo,
    WaveMotion,
    WaxingMoon,
    Westcliff,
    Whitehead,
    Whitehorse,
    Wildflower,
    WillOTheWisp,
    Willow,
    Winery,
    Wood,
    YakutatBay,
    Yukon,
    YukonCells,
    YukonicPlague,
    YukonKings,
    YukonOneSuit,
    Zerline
  )
}
// scalastyle:on
