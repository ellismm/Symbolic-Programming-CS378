; restdb.clj                           26 Nov 18

; restaurant database, converted from Mooney's prolog version

;   Gordon Novak     CS Dept   Univ. of Texas at Austin 78712

; >(length *restdb*)  =  9589

; define a database
(defn defdb [name fields data]
  (def dbfields fields)
  (def dbdata data) )

(defdb 'restdb
  '(number restaurant foodtype rating streetno street city county area)
'((225 dennys-restaurant american 2.0 250 fairgrounds-dr vallejo
  solano-county bay-area)
 (226 jamerican-cuisine american 2.0 730 lincoln-rd-e vallejo
  solano-county bay-area)
 (227 lyons-restaurant american 2.0 980 admiral-callaghan-ln vallejo
  solano-county bay-area)
 (228 rods-hickory-pit-restaurant american 2.0 199 lincoln-rd-w vallejo
  solano-county bay-area)
 (229 tommys american 2.0 950 sherwood-ave vallejo solano-county
  bay-area)
 (230 western-restaurant american 2.0 44 admiral-callaghan-ln vallejo
  solano-county bay-area)
 (231 abernathys-restaurant american 2.0 1411 locust-st walnut-creek
  contra-costa-county bay-area)
 (232 buttercup-kitchen american 2.3 2387 n-main-st walnut-creek
  contra-costa-county bay-area)
 (233 copper-skillet american 2.0 700 bancroft-rd walnut-creek
  contra-costa-county bay-area)
 (234 crogans-bar-&-grill american 2.3 1387 locust-st walnut-creek
  contra-costa-county bay-area)
 (235 dennys-restaurant american 2.0 660 ygnacio-valley-rd walnut-creek
  contra-costa-county bay-area)
 (236 lyons-restaurant american 1.7 1750 n-main-st walnut-creek
  contra-costa-county bay-area)
 (237 marie-callenders-walnut-creek american 2.0 1101 s-california-blvd
  walnut-creek contra-costa-county bay-area)
 (238 vic-stewarts american 2.5 850 s-brd walnut-creek
  contra-costa-county bay-area)
 (239 yountville-bar-&-grill american 2.0 6510 washington-st yountville
  napa-county napa-valley)
 (240 barbary-coast american 2.8 215 west-portal-avenue san-francisco
  san-francisco-county bay-area)
 (241 california-cafe american 3.6 0 unknown los-gatos
  santa-clara-county bay-area)
 (242 hawthorne-lane american 4.3 22 hawthorne-st san-francisco
  san-francisco-county bay-area)
 (243 boulevard american 4.0 1 mission-st san-francisco
  san-francisco-county bay-area)
 (244 tgi-fridays american 1.5 0 london-square oakland alameda-county
  bay-area)
 (245 gate-five american 2.8 305 harbor-dr. sausalito unknown bay-area)
 (246 cacti-bar-and-mesquite-grill american 3.3 1200 grant-avenue
  novato marin-county bay-area)
 (247 lark-creek-cafe american 3.1 1360 locust-st walnut-creek
  contra-costa-county bay-area)
 (248 the-house american 3.9 1230 grant-ave san-francisco
  san-francisco-county bay-area)
 (249 sylvias-country-kitchen american 2.7 2799 lone-tree-way antioch
  contra-costa-county bay-area)
 (250 spurs american 2.5 0 st byron unknown bay-area)
 (251 bakers-square american 2.0 303 soscol-ave napa napa-county
  napa-valley)
 (252 bakers-square-restaurant-&-pie-shop american 2.0 301
  rohnert-park-expy-w rohnert-park sonoma-county bay-area)
 (253 bakers-square-restaurant-&-pie-shop american 1.7 1350 farmers-ln
  santa-rosa sonoma-county bay-area)
 (254 checkers-pizza-&-frozen-yogurt american 2.0 0 unknown santa-rosa
  sonoma-county bay-area)
 (255 marios-family-restaurant american 2.0 1901 mendocino-ave
  santa-rosa sonoma-county bay-area)
 (256 union-hotel-restaurant american 2.0 3703 main sebastopol
  sonoma-county bay-area)
 (257 bakers-square-restaurant-&-pie american 2.0 2353 lombard-st
  san-francisco san-francisco-county bay-area)
 (258 bakers-square-restaurant-&-pies american 3.0 2010
  rollingwood-drive san-bruno san-mateo-county bay-area)
 (259 dunville-market american 2.7 5970 san-felipe-rd hollister
  san-benito-county northern-california)
 (260 flames american 2.3 0 teresa-and-bernal san-jose
  santa-clara-county bay-area)
 (261 birks american 2.3 3955 freedom-circle santa-clara
  santa-clara-county bay-area)
 (262 mixx-an-american-bistro american 2.8 0 unknown santa-rosa
  sonoma-county bay-area)
 (263 empire-tap-room american 3.1 651 emerson-st palo-alto
  santa-clara-county bay-area)
 (264 x94th-aero-squadron american 3.0 1160 coleman-ave san-jose
  santa-clara-county bay-area)
 (265 t.g.i.friday american 2.8 0 rita-rd.&-rosewood-dr. pleasanton
  alameda-county bay-area)
 (266 applebees american 2.3 0 st livermore alameda-county bay-area)
 (267 pleasanton-hotel american 3.5 855 main-st pleasanton
  alameda-county bay-area)
 (268 sky-kitchen american 2.0 620 airport-drive san-carlos
  san-mateo-county bay-area)
 (269 peggy-sues american 2.0 163 w-santa-clara-st san-jose
  santa-clara-county bay-area)
 (270 harbor-15 american 2.0 0 drive san-rafael marin-county bay-area)
 (271 pearls-cafe american 3.2 4096 bay-st fremont alameda-county
  bay-area)
 (272 banta-inn american 2.0 0 x7th-&-west-g banta unknown unknown)
 (273 green-mill-inn american 2.7 10201 old-redwood-hwy pengrove
  sonoma-county bay-area)
 (274 bagdad-cafe american 3.2 0 corner-16th-&-market san-francisco
  san-francisco-county bay-area)
 (275 little-orphan-andys american 2.6 3991 st san-francisco
  san-francisco-county bay-area)
 (276 tuba-garden american 2.3 3634 sacramento-st.-locust
  san-francisco san-francisco-county bay-area)
 (277 sorcis-restaurant american 2.5 330 tennant-station morgan-hill
  santa-clara-county bay-area)
 (278 kellys-restaurant american 3.0 nil nil antioch
  contra-costa-county bay-area)
 (280 parkside-restaurant american 2.7 2325 taraval-st san-francisco
  san-francisco-county bay-area)
 (281 ridge-side-cafe american 2.7 3140 alpine-rd portola-valley
  san-mateo-county bay-area)
 (282 kenwood-restaurant-&-bar american 3.0 9900 sonoma-hwy. kenwood
  sonoma-county bay-area)
 (283 buckley-lodge american 3.3 1717 adobe-canyon-rd kenwood
  sonoma-county bay-area)
 (284 broiler-express american 2.3 0 st san-carlos san-mateo-county
  bay-area)
 (285 union-hotel american 3.4 0 st benicia solano-county bay-area)
 (286 planet-hollywood american 2.3 0 square san-francisco
  san-francisco-county bay-area)
 (287 harbor-fifteen american 2.0 15 harbor-st san-rafael marin-county
  bay-area)
 (288 villa-coffee-shop american 2.7 4000 s.-el-camino-real san-mateo
  san-mateo-county bay-area)
 (289 allied-arts-guild american 2.7 75 arbor-rd. menlo-park
  san-mateo-county bay-area)
 (290 red-tractor-cafe american 2.3 5634 college-ave oakland
  alameda-county bay-area)
 (291 marie-callenders-restaurant-&-bakery american 2.3 751
  e.-el-camino-real sunnyvale santa-clara-county bay-area)
 (292 ricks american 2.7 1940 taraval san-francisco
  san-francisco-county bay-area)
 (293 chili-great-chili american 2.0 620 lighthouse-avenue
  pacific-grove monterey-county monterey)
 (294 goodie-goodie-cafe american 2.0 822 irving-st san-francisco
  san-francisco-county bay-area)
 (295 bandera american 3.6 0 antonio-rd los-altos santa-clara-county
  bay-area)
 (296 sophies-cookhouse american 2.3 42 columbus-ave san-francisco
  san-francisco-county bay-area)
 (297 big-horn american 2.3 0 ramon-blvd. san-ramon contra-costa-county
  bay-area)
 (298 julie-rings-heart-&-soul american 2.7 1695 st-clay
  san-francisco san-francisco-county bay-area)
 (299 home-plate american 3.0 2274 lombard-st san-francisco
  san-francisco-county bay-area)
 (300 brandons-of-saratoga american 3.4 14515 big-basin-way saratoga
  santa-clara-county bay-area)
 (301 alexis american 2.3 445 blossom-hill-rd. san-jose
  santa-clara-county bay-area)
 (302 shelbys american 2.0 2 theatre-square orinda contra-costa-county
  bay-area)
 (303 birks american 2.0 3955 freedom-circle santa-clara
  santa-clara-county bay-area)
 (304 julie-rings-heart-&-soul american 3.0 1695 polk-st-clay
  san-francisco san-francisco-county bay-area)
 (305 maxs-opera-cafe-of-burlingame american 2.6 1250 bayshore-hwy
  burlingame san-mateo-county bay-area)
 (306 bills-cafe american 2.8 1115 willow-st san-jose
  santa-clara-county bay-area)
 (307 applebees american 2.0 8200 arroyo-circle gilroy
  santa-clara-county bay-area)
 (308 zuni-cafe american 2.3 1658 market-st.-at-franklin-st.
  san-francisco san-francisco-county bay-area)
 (309 fridays american 2.0 450 water-st oakland alameda-county
  bay-area)
 (310 jims-country-style-restaurant american 2.7 5400 sunol-blvd
  pleasanton alameda-county bay-area)
 (311 hobees-california-restaurant american 2.3 5765 christie-ave
  emeryville alameda-county bay-area)
 (312 lehr-brothers-bistro-and-grill american 3.2 740 sutter-st
  san-francisco san-francisco-county bay-area)
 (313 mankas-inverness-lodge american 3.5 0 and-callendar inverness
  marin-county bay-area)
 (314 the-flying-boar american 2.0 4050 byway-east napa napa-county
  napa-valley)
 (315 faz american 2.0 5121 hopyard-rd pleasanton alameda-county
  bay-area)
 (316 bakers-square american 2.3 1680 willow-pass-rd concord
  contra-costa-county bay-area)
 (317 savoy-at-the-boundry-oak american 3.0 3800 valley-vista-rd.
  walnut-creek contra-costa-county bay-area)
 (318 blue-sky-cafe american 3.0 336 bryant-st. mountain-view
  santa-clara-county bay-area)
 (319 country-waffles american 2.6 800 southampton-rd benicia
  solano-county bay-area)
 (320 encore-cafe american 4.2 207 west-main-avenue morgan-hill
  santa-clara-county bay-area)
 (321 courtyard-cafe american 2.7 1349 park-st alameda alameda-county
  bay-area)
 (322 star-rockets american 2.3 550
  showers-dr.-/-walmart-shopping-center mountain-view
  santa-clara-county bay-area)
 (323 johns-grill american 3.5 63 ellis-st san-francisco
  san-francisco-county bay-area)
 (324 tadich-grill american 2.6 240 california san-francisco
  san-francisco-county bay-area)
 (325 hard-rock-cafe american 2.3 1699 van-ness-ave san-francisco
  san-francisco-county bay-area)
 (326 maxs-opera-cafe american 2.3 601 van-ness-ave san-francisco
  san-francisco-county bay-area)
 (327 vals-redwood-room american 2.5 2468 junipero-serra-bl. daly-city
  san-mateo-county bay-area)
 (328 maxs-opera-cafe american 3.2 1676 n.-california-blvd.
  walnut-creek contra-costa-county bay-area)
 (329 star american 3.4 nil nil fremont alameda-county bay-area)
 (330 the-restaurant-at-convict-lake american 2.0 0 lake-resort
  mammoth-lakes unknown yosemite-and-mono-lake-area)
 (331 the-mogul american 2.7 0 x1528-tavern-rd mammoth-lakes unknown
  yosemite-and-mono-lake-area)
 (332 eugenes-bay-view-bar-and-restaurant american 2.7 2421
  larkspur-landing-circle larkspur marin-county bay-area)
 (333 millies-kitchen american 2.6 0 unknown lafayette
  contra-costa-county bay-area)
 (334 bix american 3.3 56 gold-st san-francisco san-francisco-county
  bay-area)
 (335 powells-place american 2.3 511 hayes-st san-francisco
  san-francisco-county bay-area)
 (336 buttercup-pantry american 2.0 0 rd.-at-i-580 pleasanton
  alameda-county bay-area)
 (337 buttercup-pantry american 2.3 0 rd.-at-i-580 pleasanton
  alameda-county bay-area)
 (338 bear-republic-brewing-co.-inc. american 2.0 345 healdsburg-avenue
  healdsburg sonoma-county bay-area)
 (339 mecca american 3.3 2029 market-st san-francisco
  san-francisco-county bay-area)
 (340 alexs-restaurant-&-pub american 2.0 1437 lincoln-ave calistoga
  napa-county napa-valley)
 (341 sneakers-pub-&-grill american 3.3 1163 san-carlos-ave san-carlos
  san-mateo-county bay-area)
 (342 cinnabar american 2.0 1440 lincoln-ave calistoga napa-county
  napa-valley)
 (343 mimis-cafe american 2.7 1200 el-paseo-de-saratoga san-jose
  santa-clara-county bay-area)
 (344 del-monte-express american 2.0 2329 n.-fremont monterey
  monterey-county monterey)
 (345 crescent-park-grill american 2.7 546 university-ave palo-alto
  santa-clara-county bay-area)
 (346 caprices-restaurant-&-cafe american 2.7 347 primrose-rd
  burlingame san-mateo-county bay-area)
 (347 chilis-grill-&-bar american 2.0 899 el-camino-real san-bruno
  san-mateo-county bay-area)
 (348 meharrys american 2.0 1200 x6th.-st san-francisco
  san-francisco-county bay-area)
 (349 two-fools-cafe-&-market american 2.6 408 main-st half-moon-bay
  san-mateo-county bay-area)
 (350 tradewinds american 2.5 400 s.-main-st. fort-bragg
  mendocino-county northern-california)
 (351 elephant-bar american 2.3 1600 old-bayshore-highway burlingame
  san-mateo-county bay-area)
 (352 claim-jumper american 2.7 1981 diamond-blvd. concord
  contra-costa-county bay-area)
 (353 the-montclair-eggshop american 2.3 6126 medaue-place oakland
  alameda-county bay-area)
 (354 camerons-restaurant-and-inn american 2.0 1410 s.-cabrillo-hwy.
  half-moon-bay san-mateo-county bay-area)
 (355 swan-court-cafe american 2.0 0 blvd milpitas santa-clara-county
  bay-area)
 (356 the-hogs-breath-inn american 2.7 0 unknown carmel monterey-county
  monterey)
 (357 mission-ranch american 2.7 26270 dolores carmel monterey-county
  monterey)
 (358 elysium-cafe american 3.6 2434 mission-st san-francisco
  san-francisco-county bay-area)
 (359 spoons-restaurant arabic 2.9 3340 mowry-ave fremont
  alameda-county bay-area)
 (360 noors-cafe arabic 2.0 1919 ocean-avenue san-francisco
  san-francisco-county bay-area)
 (361 pasha arabic 2.1 1516 broadway san-francisco san-francisco-county
  bay-area)
 (362 the-grapeleaf-restaurant arabic 3.0 4031 balboa san-francisco
  san-francisco-county bay-area)
 (363 sunrise-deli arabic 2.7 2115 irving-st san-francisco
  san-francisco-county bay-area)
 (364 the-armenian-gourmet armenian 3.4 929 e-duane-ave sunnyvale
  santa-clara-county bay-area)
 (365 lucky-dragon asian 2.3 9071 soquel-dr aptos santa-cruz-county
  bay-area)
 (366 pacific-rim-buffet asian 2.0 8035 soquel-dr-ste-21 aptos
  santa-cruz-county bay-area)
 (367 fung-lum-restaurant asian 2.4 1815 s-bascom-ave campbell
  santa-clara-county bay-area)
 (368 house-of-orient asian 2.0 851 w-hamilton-ave campbell
  santa-clara-county bay-area)
 (369 oriental-garden-restaurant asian 2.0 2895 s-bascom-ave campbell
  santa-clara-county bay-area)
 (370 masayukis asian 2.0 427 capitola-ave capitola unknown bay-area)
 (371 wok-west asian 2.0 1855 x41st-ave-no.-r-6 capitola unknown
  bay-area)
 (372 oriental-kitchen asian 2.0 7 san-pedro-rd colma san-mateo-county
  bay-area)
 (373 lotus-garden asian 2.5 1058 shell-blvd foster-city
  san-mateo-county bay-area)
 (374 yet-wah-restaurant asian 2.8 1026 foster-city-blvd foster-city
  san-mateo-county bay-area)
 (375 mings-kitchen asian 2.3 1458 pollard-rd los-gatos
  santa-clara-county bay-area)
 (376 yeung-shing-restaurant asian 2.0 14107 winchester-blvd-no.-s
  los-gatos santa-clara-county bay-area)
 (377 chef-wang-restaurant asian 3.0 1320 el-camino-real millbrae
  san-mateo-county bay-area)
 (378 fung-jen-palace asian 2.4 90 s-abel-st milpitas
  santa-clara-county bay-area)
 (379 hong-kong-garden-restaurant asian 2.0 750 e-calaveras-blvd
  milpitas santa-clara-county bay-area)
 (380 hungkee-garden-restaurant asian 1.5 1818 milmont-dr milpitas
  santa-clara-county bay-area)
 (381 jangtu-soondae-restaurant asian 2.0 89 s-park-victoria-dr
  milpitas santa-clara-county bay-area)
 (382 manila-chopsticks asian 2.0 1549 landess-ave milpitas
  santa-clara-county bay-area)
 (383 pho-909-restaurant asian 2.0 72 s-park-victoria-dr milpitas
  santa-clara-county bay-area)
 (384 pho-super-bowl asian 3.5 1228 s-abel-st milpitas
  santa-clara-county bay-area)
 (385 pho-world asian 2.8 62 dixon-rd milpitas santa-clara-county
  bay-area)
 (386 the-new-orient asian 2.3 1470 n-milpitas-blvd milpitas
  santa-clara-county bay-area)
 (387 chef-wang asian 3.3 212 castro-st mountain-view
  santa-clara-county bay-area)
 (388 pedro-point-restaurant asian 3.3 303 san-pedro-ave pacifica
  san-mateo-county bay-area)
 (389 chins-restaurant asian 2.3 855 main-st redwood-city
  san-mateo-county bay-area)
 (390 ling-nam-noodle-house asian 2.0 2211 gellert-blvd
  south-san-francisco san-mateo-county bay-area)
 (391 bamboo-garden asian 2.0 480 san-anselmo-ave-s san-bruno
  san-mateo-county bay-area)
 (392 fon-yong-restaurant asian 2.0 130 el-camino-real san-bruno
  san-mateo-county bay-area)
 (393 golden-palace-restaurant asian 2.0 354 el-camino-real san-bruno
  san-mateo-county bay-area)
 (394 grandehos-hibachi asian 2.0 370 san-bruno-ave-w san-bruno
  san-mateo-county bay-area)
 (395 luck-jade-restaurant asian 2.0 649 san-mateo-ave san-bruno
  san-mateo-county bay-area)
 (396 wangs-house asian 2.3 576 san-mateo-ave san-bruno
  san-mateo-county bay-area)
 (397 chus-garden-restaurant asian 2.7 1195 laurel-st san-carlos
  san-mateo-county bay-area)
 (398 uncle-chen-restaurant asian 3.3 66 club-dr san-carlos
  san-mateo-county bay-area)
 (399 anh-dao-restaurant asian 2.0 374 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (400 bac-huong-restaurant asian 3.0 301 e-santa-clara-st-no.-c
  san-jose santa-clara-county bay-area)
 (401 binh-minh-restaurant asian 2.0 1006 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (402 chau-kee-restaurant asian 2.0 2859 senter-rd san-jose
  santa-clara-county bay-area)
 (403 dac-phuc-restaurant asian 2.3 198 w-santa-clara-st san-jose
  santa-clara-county bay-area)
 (404 hoa-xuan-restaurant asian 2.0 795 s-2nd-st san-jose
  santa-clara-county bay-area)
 (405 kowloon-kitchen asian 2.0 6081 meridian-ave-no.-f san-jose
  santa-clara-county bay-area)
 (406 lai-lai-restaurant asian 2.0 797 e-julian-st san-jose
  santa-clara-county bay-area)
 (407 long-hai-restaurant asian 2.0 674 n-13th-st-no.-a san-jose
  santa-clara-county bay-area)
 (408 long-hoa-restaurant asian 2.0 457 e-san-carlos-st san-jose
  santa-clara-county bay-area)
 (409 lung-wah-restaurant asian 2.0 3017 meridian-ave san-jose
  santa-clara-county bay-area)
 (410 nha-thanh-restaurant asian 2.0 1749 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (411 paradise-oriental-restaurant asian 2.0 0 unknown san-jose
  santa-clara-county bay-area)
 (412 pho-90-restaurant asian 2.0 2384 senter-rd san-jose
  santa-clara-county bay-area)
 (413 pho-hien asian 2.0 80 s-2nd-st san-jose santa-clara-county
  bay-area)
 (414 pho-hoang-restaurant asian 2.0 974 lundy-ave san-jose
  santa-clara-county bay-area)
 (415 pho-thanh-hien-restaurant asian 2.0 2345 mckee-rd san-jose
  santa-clara-county bay-area)
 (416 quang-da-restaurant asian 2.0 348 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (417 sanuki-restaurant asian 2.0 439 camille-cir-unit-15 san-jose
  santa-clara-county bay-area)
 (418 song-tien-restaurant asian 2.0 3656 cherry-ave san-jose
  santa-clara-county bay-area)
 (419 soong-soong-restaurant asian 2.0 3680 stevens-creek-blvd-no.-c
  san-jose santa-clara-county bay-area)
 (420 thanh-ha asian 2.0 2863 senter-rd san-jose santa-clara-county
  bay-area)
 (421 thanh-ha-com-chay asian 2.0 2597 senter-rd san-jose
  santa-clara-county bay-area)
 (422 thanh-huong-ii asian 2.0 2593 senter-rd san-jose
  santa-clara-county bay-area)
 (423 thanh-son-tofu-che-hien-khanh asian 2.0 2857 senter-rd-no.-c
  san-jose santa-clara-county bay-area)
 (424 thanh-van-ii-restaurant asian 2.0 1939 alum-rock-ave-no.-h
  san-jose santa-clara-county bay-area)
 (425 vung-tau-restaurant asian 1.8 535 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (426 yeungs-sung-yuan-restaurant asian 2.0 185 park-ave san-jose
  santa-clara-county bay-area)
 (427 new-kwok-wah asian 2.0 32 x42nd-ave san-mateo san-mateo-county
  bay-area)
 (428 the-pot-sticker asian 2.7 3708 s-el-camino-real san-mateo
  san-mateo-county bay-area)
 (429 viet-hung-restaurant asian 2.0 2456 s-el-camino-real san-mateo
  san-mateo-county bay-area)
 (430 mister-go-ii-oriental-cuisine asian 2.0 500 lawrence-expy-no.-c
  santa-clara santa-clara-county bay-area)
 (431 pho-hoa asian 2.5 3484 el-camino-real santa-clara
  santa-clara-county bay-area)
 (432 sham-hing-restaurant asian 2.0 61 washington-st santa-clara
  santa-clara-county bay-area)
 (433 sus-mongolian-b-b asian 3.0 1111 el-camino-real santa-clara
  santa-clara-county bay-area)
 (434 asian-rose-restaurant asian 3.2 1547 pacific-ave-no.-b santa-cruz
  santa-cruz-county bay-area)
 (435 asian-rose-restaurant asian 2.8 105 hagemann-ave santa-cruz
  santa-cruz-county bay-area)
 (436 bamboo-restaurant asian 2.0 1733 seabright-ave santa-cruz
  santa-cruz-county bay-area)
 (437 mei-garden-restaurant asian 2.0 533 ocean-st santa-cruz
  santa-cruz-county bay-area)
 (438 mei-garden-restaurant asian 2.3 4303 x12-scotts-valley-dr
  scotts-valley unknown bay-area)
 (439 golden-buddha-restaurant asian 2.8 4610 soquel-dr soquel unknown
  bay-area)
 (440 orient-expresso asian 2.0 3045 porter-st soquel unknown bay-area)
 (441 wee-ming-restaurant asian 2.0 4720 soquel-dr soquel unknown
  bay-area)
 (442 chef-chen asian 2.0 542 lakeside-dr-no.-3 sunnyvale
  santa-clara-county bay-area)
 (443 king-wah-restaurant asian 2.3 219 e-washington-ave sunnyvale
  santa-clara-county bay-area)
 (444 pho-golden-bowl-restaurant asian 2.7 172 s-murphy-ave sunnyvale
  santa-clara-county bay-area)
 (445 pho-xe-lua-noodle-house asian 2.0 0 unknown sunnyvale
  santa-clara-county bay-area)
 (446 phu-hai-restaurant asian 2.0 1031 e-duane-ave-no.-i sunnyvale
  santa-clara-county bay-area)
 (447 the-new-orient asian 2.0 307 n-fairoaks-ave sunnyvale
  santa-clara-county bay-area)
 (448 the-house asian 3.9 1230 grant-ave san-francisco
  san-francisco-county bay-area)
 (449 oriental-express asian 2.0 799 gravenstein-hwy-s sebastopol
  sonoma-county bay-area)
 (450 oriental-pearl-restaurant asian 2.0 760 clay-st san-francisco
  san-francisco-county bay-area)
 (451 oriental-restaurant asian 2.0 1107 market-st san-francisco
  san-francisco-county bay-area)
 (452 oriental-seafood-restaurant asian 2.0 2520 noriega-st
  san-francisco san-francisco-county bay-area)
 (453 wanton-house asian 2.3 1205 el-camino-real santa-clara
  santa-clara-county bay-area)
 (454 chicken-bowl asian 2.0 2277 el-camino-real santa-clara
  santa-clara-county bay-area)
 (455 sticks asian 3.0 5101 great-america-parkway-/-westin-hotel
  santa-clara santa-clara-county bay-area)
 (456 betelnut-pejiu-wu asian 3.6 2030 union-st san-francisco
  san-francisco-county bay-area)
 (457 season-buffet asian 2.2 5720 mowry-school-rd newark
  alameda-county bay-area)
 (458 lhasa-moon asian 3.0 2420 lombard-at-scott san-francisco
  san-francisco-county bay-area)
 (459 crustacean asian 3.0 1475 polk-st san-francisco
  san-francisco-county bay-area)
 (460 ru-lepic asian 2.7 900 pine-st. san-francisco
  san-francisco-county bay-area)
 (461 crustacean asian 2.0 2545 polk-st. san-francisco
  san-francisco-county bay-area)
 (462 bok-choy-asian-market-cafe asian 3.6 2 stanford-shopping-center
  palo-alto santa-clara-county bay-area)
 (463 s-&-b bbq 2.7 637 so.-b-st. san-mateo san-mateo-county bay-area)
 (464 boogie-woogie-bagel-boy bagels 2.7 1227 park-st alameda
  alameda-county bay-area)
 (465 lox-stock-&-bagel bagels 2.0 820 parker-st-bldg-13 berkeley
  alameda-county bay-area)
 (466 lox-stock-&-bagel bagels 2.0 2045 allston-way berkeley
  alameda-county bay-area)
 (467 noahs-bagels bagels 3.8 3170 college-ave berkeley alameda-county
  bay-area)
 (468 lox-stock-&-bagel-inc bagels 2.0 2000 powell-st emeryville
  alameda-county bay-area)
 (469 noahs-new-york-bagels bagels 2.0 4240 hollis-st emeryville
  alameda-county bay-area)
 (470 the-posh-bagel bagels 3.4 310 main-st los-altos
  santa-clara-county bay-area)
 (471 the-posh-bagel bagels 3.0 125 w-main-st los-gatos
  santa-clara-county bay-area)
 (472 the-posh-bagel bagels 2.0 869 santa-cruz-ave menlo-park
  san-mateo-county bay-area)
 (473 morgan-hill-bagel-house bagels 3.0 233 w-main-ave-no.-b
  morgan-hill santa-clara-county bay-area)
 (474 the-better-bagel bagels 2.4 1040 grant-rd-ste-160 mountain-view
  santa-clara-county bay-area)
 (475 that-bagel-place bagels 2.0 1011 x1st-st napa napa-county
  napa-valley)
 (476 the-bagel-adventure bagels 1.7 1408 clay-st napa napa-county
  napa-valley)
 (477 lox-stock-&-bagel bagels 2.0 180 grand-ave-ste-115 oakland
  alameda-county bay-area)
 (478 suzys-lox-&-bagel bagels 2.0 2204 broadway oakland alameda-county
  bay-area)
 (479 bagel-works bagels 3.7 642 ramona-st palo-alto santa-clara-county
  bay-area)
 (480 bagel bagels 2.7 1300 polk san-francisco san-francisco-county
  bay-area)
 (481 the-bagelry bagels 2.3 320 cedar-st-no.-a santa-cruz
  santa-cruz-county bay-area)
 (482 the-bagelry bagels 2.8 1634 seabright-ave santa-cruz
  santa-cruz-county bay-area)
 (483 broadway-bagels bagels 2.0 0 unknown saratoga santa-clara-county
  bay-area)
 (484 saratoga-bagels bagels 2.2 12840 saratoga-sunnyvale-rd saratoga
  santa-clara-county bay-area)
 (485 the-bagelry bagels 2.0 4763 soquel-dr soquel unknown bay-area)
 (486 phil-a-bagel bagels 2.7 2909 ygnacio-valley-rd walnut-creek
  contra-costa-county bay-area)
 (487 noahs-bagels bagels 3.1 0 hill-rd.-next-to-whole-foods los-gatos
  santa-clara-county bay-area)
 (488 brothers-bagels bagels 2.0 1200 or-1300-something-on-gilman-st.
  berkeley alameda-county bay-area)
 (489 sonoma-valley-bagel-co bagels 3.0 2310 mendocino-ave santa-rosa
  sonoma-county bay-area)
 (490 sonoma-valley-bagel-co bagels 2.0 515 hahman-dr santa-rosa
  sonoma-county bay-area)
 (491 home-grown-bagels-bakery-&-restaurant bagels 2.0 122 w-napa-st
  sonoma sonoma-county bay-area)
 (492 homegrown-bagels-bakery-&-restaurant bagels 2.0 19161 sonoma-hwy
  sonoma sonoma-county bay-area)
 (493 noahs-new-york-bagels bagels 2.6 278 university-ave palo-alto
  santa-clara-county bay-area)
 (494 house-of-bagels bagels 4.0 220 hamilton palo-alto
  santa-clara-county bay-area)
 (495 house-of-bagels bagels 2.7 260 lorton-avenue burlingame
  san-mateo-county bay-area)
 (496 the-bagelry bagels 3.0 2134 polk-st san-francisco
  san-francisco-county bay-area)
 (497 noahs-bagels bagels 2.7 0 shore-shopping-center alameda
  alameda-county bay-area)
 (498 berrys-pastry-shop bakery 2.0 1872 a-st antioch
  contra-costa-county bay-area)
 (499 windmill-family-restaurant-&-bakery bakery 2.0 324 g-st antioch
  contra-costa-county bay-area)
 (500 renees-bakery bakery 2.0 217 appleton-dr aptos santa-cruz-county
  bay-area)
 (501 hello-croissant bakery 2.0 1983 shattuck-ave berkeley
  alameda-county bay-area)
 (502 windmill-family-restaurant-&-bakery bakery 2.0 6258
  bethel-island-rd bethel-island unknown unknown)
 (503 gayles-bakery-&-rosticceria bakery 3.0 504 bay-ave capitola
  unknown bay-area)
 (504 granny-engs-donut-&-bakery bakery 2.0 295 lake-merced-blvd
  daly-city san-mateo-county bay-area)
 (505 paradise-bakery bakery 2.0 357 los-cerritos-ave el-cerrito
  contra-costa-county bay-area)
 (506 muffin-treat bakery 2.0 3333 n-texas-st fairfield solano-county
  bay-area)
 (507 conrads-pastries bakery 2.0 6259 graham-hill-rd felton unknown
  bay-area)
 (508 creative-croissants bakery 2.8 1029 arnold-dr-ste-3 martinez
  contra-costa-county bay-area)
 (509 marthas-pastries bakery 2.0 325 sharon-park-dr menlo-park
  san-mateo-county bay-area)
 (510 gold-ribbon-bakeshop-&-restaurant bakery 2.0 380 s-main-st
  milpitas santa-clara-county bay-area)
 (511 villa-corona-bakery bakery 2.0 174 cesta-st napa napa-county
  napa-valley)
 (512 la-brasserie bakery 2.7 542 grand-ave oakland alameda-county
  bay-area)
 (513 ruby-king-bakery bakery 2.0 718 franklin-st oakland
  alameda-county bay-area)
 (514 fairmont-bake-shop bakery 2.0 769 hickey-blvd pacifica
  san-mateo-county bay-area)
 (515 palo-alto-baking-co. bakery 3.8 381 california-ave palo-alto
  santa-clara-county bay-area)
 (516 prolific-oven bakery 3.3 550 waverley palo-alto
  santa-clara-county bay-area)
 (517 stanford-pastries bakery 2.0 700 welch-rd palo-alto
  santa-clara-county bay-area)
 (518 dutch-treats-bakery bakery 2.0 607 gregory-ln pleasant-hill
  contra-costa-county bay-area)
 (519 vie-de-france-corporation bakery 2.0 1108 stoneridge-mall
  pleasanton alameda-county bay-area)
 (520 noble-pies bakery 2.0 3520 solano-ave richmond
  contra-costa-county bay-area)
 (521 rosemarys-bakery bakery 2.7 101 park-pl. richmond
  contra-costa-county bay-area)
 (522 the-little-bread-board bakery 2.0 1119 industrial-rd san-carlos
  san-mateo-county bay-area)
 (523 andre-boudin-bakeries bakery 2.0 150 s-1st-st-ste-115 san-jose
  santa-clara-county bay-area)
 (524 freshly-baked-eatery bakery 2.0 152 n-3rd-st san-jose
  santa-clara-county bay-area)
 (525 the-bread-basket bakery 2.0 271 e-brokaw-rd san-jose
  santa-clara-county bay-area)
 (526 creative-croissante bakery 2.0 3151 crow-canyon-pl-no.-g
  san-ramon contra-costa-county bay-area)
 (527 german-bakery bakery 2.3 388 s-overlook-dr san-ramon
  contra-costa-county bay-area)
 (528 rebeccas-mighty-muffins bakery 3.0 514 front-st santa-cruz
  santa-cruz-county bay-area)
 (529 sisters-bake-shop-&-restaurant bakery 2.0 824 w-el-camino-real
  sunnyvale santa-clara-county bay-area)
 (530 vie-de-france-bakery bakery 2.0 29320 union-city-blvd union-city
  alameda-county bay-area)
 (531 andre-boudin-bakeries-inc bakery 2.3 67 broadway walnut-creek
  contra-costa-county bay-area)
 (532 california-bakery-and-restaurant bakery 2.0 41 simms-st
  san-rafael marin-county bay-area)
 (533 cocos-bakery bakery 2.0 1665 sebastopol-rd santa-rosa
  sonoma-county bay-area)
 (534 piner-bakery bakery 2.0 3080 marlow-rd santa-rosa sonoma-county
  bay-area)
 (535 east-west-bakery-cafe bakery 2.0 128 n-main-st sebastopol
  sonoma-county bay-area)
 (536 feed-store-cafe-&-bakery-the bakery 2.0 529 st sonoma
  sonoma-county bay-area)
 (537 home-grown-bagels-bakery-&-restaurant bakery 2.0 122 w-napa-st
  sonoma sonoma-county bay-area)
 (538 homegrown-bagels-bakery-&-restaurant bakery 2.0 19161 sonoma-hwy
  sonoma sonoma-county bay-area)
 (539 homegrown-baking-company-bakery-&-restaurant bakery 2.0 122
  w-napa-st sonoma sonoma-county bay-area)
 (540 homegrown-baking-company-bakery-&-restaurant bakery 2.0 19161
  sonoma-hwy sonoma sonoma-county bay-area)
 (541 oh-la-la-bakery-cafes bakery 2.0 123 battery-st san-francisco
  san-francisco-county bay-area)
 (542 suzannes-muffins bakery 2.0 376 university-ave palo-alto
  santa-clara-county bay-area)
 (543 o!-croissant bakery 2.0 125 university-ave palo-alto
  santa-clara-county bay-area)
 (544 douce-france bakery 3.3 nil nil palo-alto santa-clara-county
  bay-area)
 (545 douce-france bakery 2.0 93 town-&-country-village palo-alto
  santa-clara-county bay-area)
 (546 jils-patisserie bakery 3.4 1849 el-camino-real burlingame
  san-mateo-county bay-area)
 (547 red-a-bakery bakery 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (548 special-treats-patisserie bakery 3.0 81 e.-3rd-ave san-mateo
  san-mateo-county bay-area)
 (549 bijan bakery 3.0 441 saratoga-ave san-jose santa-clara-county
  bay-area)
 (550 the-cakery bakery 3.5 1308 burlingame-ave burlingame
  san-mateo-county bay-area)
 (551 specialtys-cafe-and-bakery bakery 3.0 101 new-montgomery
  san-francisco san-francisco-county bay-area)
 (552 napa-valley-ovens bakery 2.0 1353 lincoln-ave calistoga
  napa-county napa-valley)
 (553 stella-bakery bakery 3.6 446 columbus-avenue san-francisco
  san-francisco-county bay-area)
 (554 quicks-little-alaska bar 1.7 953 san-pablo-ave albany
  alameda-county bay-area)
 (555 the-office-inc bar 2.0 858 san-pablo-ave albany alameda-county
  bay-area)
 (556 beer-garden bar 2.0 809 w-2nd-st antioch contra-costa-county
  bay-area)
 (557 ausiellos-tavern bar 2.0 864 el-camino-real belmont
  san-mateo-county bay-area)
 (558 belmont-bar-&-grill bar 2.0 1410 old-county-rd belmont
  san-mateo-county bay-area)
 (559 henflings-tavern bar 1.8 11646 alba-rd ben-lomond
  santa-cruz-county bay-area)
 (560 choices bar 2.7 321 x1st-st benicia solano-county bay-area)
 (561 o-learys-pub bar 2.7 131 x1st-st-no.-b benicia solano-county
  bay-area)
 (562 pastime-club bar 2.7 726 x1st-st benicia solano-county bay-area)
 (563 the-brewery-tia-theresa bar 1.7 120 w-h-st benicia solano-county
  bay-area)
 (564 this-bar bar 2.0 1202 e-5th-st benicia solano-county bay-area)
 (565 barneys-solano bar 3.0 1591 solano-ave berkeley alameda-county
  bay-area)
 (566 berkeley-square bar 2.0 1333 university-ave berkeley
  alameda-county bay-area)
 (567 bison-brewing bar 2.6 2598 telegraph-ave berkeley alameda-county
  bay-area)
 (568 jupiter bar 3.2 2181 shattuck-ave berkeley alameda-county
  bay-area)
 (569 santa-fe-bar-and-grill bar 3.0 1310 university-ave berkeley
  alameda-county bay-area)
 (570 skates-on-the-bay bar 3.9 100 seawall-dr. berkeley alameda-county
  bay-area)
 (571 starry-plough-pub bar 2.5 3101 shattuck-ave berkeley
  alameda-county bay-area)
 (572 temple-bar bar 2.0 984 university-ave berkeley alameda-county
  bay-area)
 (573 the-albatross-pub bar 2.3 1822 san-pablo-ave berkeley
  alameda-county bay-area)
 (574 the-juice-bar-collective-inc bar 2.0 2114 vine-st berkeley
  alameda-county bay-area)
 (575 scopazzi-restaurant bar 2.8 0 unknown boulder-creek
  santa-cruz-county bay-area)
 (576 behans-an-irish-pub bar 2.0 1327 broadway burlingame
  san-mateo-county bay-area)
 (577 california-bar-&-grill bar 2.0 241 california-dr burlingame
  san-mateo-county bay-area)
 (578 california-bar-&-grill bar 2.0 241 california-dr burlingame
  san-mateo-county bay-area)
 (579 dicey-rileys-irish-pub bar 2.0 221 park-rd burlingame
  san-mateo-county bay-area)
 (580 calistoga-inn/calistoga-brewer bar 2.3 1250 lincoln-ave calistoga
  napa-county napa-valley)
 (581 garys-sports-bar-&-grill bar 2.6 2369 winchester-blvd campbell
  santa-clara-county bay-area)
 (582 grand-dell-saloon bar 1.7 0 unknown campbell santa-clara-county
  bay-area)
 (583 jerseys-tavern bar 2.8 1779 winchester-blvd-no.-81 campbell
  santa-clara-county bay-area)
 (584 kyoto-palace bar 2.7 1875 s.-bascom-ave campbell
  santa-clara-county bay-area)
 (585 deja-vu-cocktail-lounge bar 2.0 2617 carnation-ct castro-valley
  alameda-county bay-area)
 (586 doucet-saloon bar 2.0 20710 rutledge-rd castro-valley
  alameda-county bay-area)
 (587 poggis-waterfall-lounge bar 2.0 3717 castro-valley-blvd
  castro-valley alameda-county bay-area)
 (588 oaks-tavern bar 2.0 191 highway-156 castroville monterey-county
  monterey)
 (589 giovannis-bar-&-grill bar 2.0 2325 clayton-rd concord
  contra-costa-county bay-area)
 (590 hobies-roadhouse bar 2.3 2045 mount-diablo-st concord
  contra-costa-county bay-area)
 (591 t-r-s-bar-&-grill bar 3.3 2001 salvio-st concord
  contra-costa-county bay-area)
 (592 tachi-sushi-bar bar 2.0 5400 ygnacio-valley-rd concord
  contra-costa-county bay-area)
 (593 the-company-bar bar 2.0 1114 meadow-ln concord
  contra-costa-county bay-area)
 (594 tropical-squeeze-juice-bar bar 2.0 282 sun-valley-mall concord
  contra-costa-county bay-area)
 (595 upper-level-bar-&-grill bar 2.0 2118 willow-pass-rd-no.-600
  concord contra-costa-county bay-area)
 (596 valley-lounge bar 2.0 5400 ygnacio-valley-rd-no.-a10 concord
  contra-costa-county bay-area)
 (597 monte-vista-inn bar 2.0 21619 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (598 skips-bar-&-grill bar 2.0 19980 homestead-rd cupertino
  santa-clara-county bay-area)
 (599 carnival-bar-&-grill bar 2.0 6192 mission-st daly-city
  san-mateo-county bay-area)
 (600 globe-tavern bar 2.0 7379 mission-st daly-city san-mateo-county
  bay-area)
 (601 silver-moon-saloon bar 2.0 212 school-st daly-city
  san-mateo-county bay-area)
 (602 bartolomucci-incorporated bar 2.7 3456 camino-tassajara danville
  contra-costa-county bay-area)
 (603 elliotts-bar-inc bar 2.0 369 hartz-ave danville
  contra-costa-county bay-area)
 (604 evies-place bar 2.0 7459 amador-valley-blvd dublin alameda-county
  bay-area)
 (605 gallaghers-dublin-pub bar 2.0 7851 amador-valley-blvd dublin
  alameda-county bay-area)
 (606 lyons-brewery-of-dublin bar 3.2 7294 san-ramon-rd dublin
  alameda-county bay-area)
 (607 patricks-pub bar 2.0 7138 village-pky dublin alameda-county
  bay-area)
 (608 doctors-sports-bar-&-grill bar 2.0 2240 university-ave
  east-palo-alto san-mateo-county bay-area)
 (609 capri-club bar 2.0 4156 appian-way el-sobrante
  contra-costa-county bay-area)
 (610 nicks-lounge bar 2.0 212 regency-ct el-sobrante
  contra-costa-county bay-area)
 (611 the-club-omni bar 2.0 6701 bay-st emeryville alameda-county
  bay-area)
 (612 dings-cocktail-lounge bar 2.0 1712 w-texas-st fairfield
  solano-county bay-area)
 (613 ginos-sportsmans-club bar 2.0 833 texas-st fairfield
  solano-county bay-area)
 (614 legends-&-heroes-sports-bar bar 2.0 3990 paradise-valley-rd
  fairfield solano-county bay-area)
 (615 back-door-lounge bar 2.0 37422 fremont-blvd-no.-b fremont
  alameda-county bay-area)
 (616 cheers-cocktail-lounge bar 2.0 4500 peralta-blvd fremont
  alameda-county bay-area)
 (617 j-c-lounge bar 2.0 40645 fremont-blvd-ste-28 fremont
  alameda-county bay-area)
 (618 jds-cocktail-lounge bar 2.0 37671 niles-blvd fremont
  alameda-county bay-area)
 (619 mission-bell-tavern bar 2.0 43301 mission-blvd fremont
  alameda-county bay-area)
 (620 niles-hard-rock-station bar 2.0 37501 niles-blvd fremont
  alameda-county bay-area)
 (621 the-office-lounge bar 2.0 3575 peralta-blvd fremont
  alameda-county bay-area)
 (622 tonys-lounge bar 2.0 924 praderia-cir fremont alameda-county
  bay-area)
 (623 san-benito-house-&-saloon bar 3.0 356 main-st half-moon-bay
  san-mateo-county bay-area)
 (624 bottoms-up-club bar 2.0 27935 manon-ave hayward alameda-county
  bay-area)
 (625 buffalo-bills-brewery bar 3.3 1082 b-st hayward alameda-county
  bay-area)
 (626 calhoun-cocktail-lounge bar 2.0 18974 meekland-ave hayward
  alameda-county bay-area)
 (627 daphne-gonzales-food-bar bar 2.0 22779 x6th-st hayward
  alameda-county bay-area)
 (628 doucets-lounge bar 2.0 26966 aberdeen-pl hayward alameda-county
  bay-area)
 (629 driftwood-lounge bar 2.0 22170 mission-blvd hayward
  alameda-county bay-area)
 (630 fernandes-stein-longue bar 2.0 939 b-st hayward alameda-county
  bay-area)
 (631 gallaghers-pub bar 2.0 31113 mission-blvd hayward alameda-county
  bay-area)
 (632 geneos-lounge bar 2.0 20918 mission-blvd hayward alameda-county
  bay-area)
 (633 hot-spot-lounge bar 2.0 22580 grand-st hayward alameda-county
  bay-area)
 (634 jacks-saloon bar 2.0 26050 mocine-ave hayward alameda-county
  bay-area)
 (635 laymans-lounge bar 2.0 18553 mission-blvd hayward alameda-county
  bay-area)
 (636 mission-lounge bar 2.0 464 grove-way hayward alameda-county
  bay-area)
 (637 noraebang-bar bar 2.0 21995 mission-blvd hayward alameda-county
  bay-area)
 (638 rumors bar 2.0 22554 main-st hayward alameda-county bay-area)
 (639 shar-ade-cocktails bar 2.0 25144 mission-blvd hayward
  alameda-county bay-area)
 (640 vintage-cellars-wine-bar-cafe bar 2.3 1001 b-st hayward
  alameda-county bay-area)
 (641 whiskey-river-saloon bar 2.0 24018 hesperian-blvd hayward
  alameda-county bay-area)
 (642 zacks-sport-lounge bar 2.0 390 winton-ave hayward alameda-county
  bay-area)
 (643 whiskey-creek-saloon bar 2.0 201 x5th-st hollister
  san-benito-county northern-california)
 (644 round-up-saloon bar 1.7 3553 mount-diablo-blvd lafayette
  contra-costa-county bay-area)
 (645 toots-tavern bar 2.0 5 smoke-tree-ct lafayette
  contra-costa-county bay-area)
 (646 beebs-bar-&-grill bar 2.8 909 club-house-dr-no.-a livermore
  alameda-county bay-area)
 (647 rock-house-saloon bar 2.0 1840 portola-ave livermore
  alameda-county bay-area)
 (648 the-lounge bar 2.0 2677 old-1st-st livermore alameda-county
  bay-area)
 (649 mountain-charleys-saloon bar 2.0 15 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (650 fubars-comedy-club-bar-&-gril bar 2.0 1150 arnold-dr-no.-c
  martinez contra-costa-county bay-area)
 (651 main-street-tavern bar 2.0 501 main-st martinez
  contra-costa-county bay-area)
 (652 juice-club bar 2.0 1389 orange-ave menlo-park san-mateo-county
  bay-area)
 (653 oasis-beer-garden bar 3.0 241 el-camino-real menlo-park
  san-mateo-county bay-area)
 (654 galaxy-cocktail-lounge bar 2.0 134 s-main-st milpitas
  santa-clara-county bay-area)
 (655 town-tavern bar 2.0 1905 n-milpitas-blvd milpitas
  santa-clara-county bay-area)
 (656 moraga-barn bar 2.0 1002 viader-dr moraga unknown bay-area)
 (657 m-&-h-tavern bar 2.7 17365 monterey-rd morgan-hill
  santa-clara-county bay-area)
 (658 tied-house-cafe-&-brewery bar 3.0 0 unknown mountain-view
  santa-clara-county bay-area)
 (659 harry-oshortals-yard-of-ale bar 2.0 304 lincoln-ave napa
  napa-county napa-valley)
 (1 sparkys-diner x24-hour-diner 2.3 242 church-st san-francisco
  san-francisco-county bay-area)
 (2 kabul-afghan-cuisine afghani 3.8 135 el-camino-real san-carlos
  san-mateo-county bay-area)
 (3 helmand-restaurant afghani 4.0 430 broadway san-francisco
  san-francisco-county bay-area)
 (4 afghani-house afghani 3.6 1103 e.-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (5 kabul-afghan-cusine afghani 3.7 833 w.-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (6 bamyan-afghan-restaurant afghani 2.8 0 unknown san-rafael
  marin-county bay-area)
 (7 kabul-palace afghani 2.8 155 san-fernando san-jose
  santa-clara-county bay-area)
 (8 kandahar afghani 3.5 2118 mt-diablo-st concord contra-costa-county
  bay-area)
 (9 kabobs-house afghani 2.7 3005 alamo-drive-corner-nut-tree vacaville
  solano-county bay-area)
 (10 massawa-restaurant african 3.4 nil nil san-francisco
  san-francisco-county bay-area)
 (11 new-eritrea-restaurant-&-bar african 3.0 907 irving san-francisco
  san-francisco-county bay-area)
 (12 olas-africancarbbean-cajun-restaurant african 2.3 10905
  wolfe-rd.-cupertino cupertino santa-clara-county bay-area)
 (13 sum-yun-chick all-ethnic 3.6 4857 fremont-blvd fremont
  alameda-county bay-area)
 (14 alameda-grill american 2.3 1520 park-st alameda alameda-county
  bay-area)
 (15 anns-lounge-&-hofbrau american 2.0 1231 park-st alameda
  alameda-county bay-area)
 (16 lyons-restaurant american 2.3 2375 shoreline-dr alameda
  alameda-county bay-area)
 (17 casablanca-bar-&-grill american 2.0 979 san-pablo-ave albany
  alameda-county bay-area)
 (18 monterey-restaurant american 2.3 1477 solano-ave albany
  alameda-county bay-area)
 (19 lyons-restaurant american 2.0 2009 somersville-rd antioch
  contra-costa-county bay-area)
 (20 bob-eatery american 2.0 511 claverie-way benicia solano-county
  bay-area)
 (21 morgans-grill american 2.3 1034 x1st-st benicia solano-county
  bay-area)
 (22 papas-family-restaurant american 2.0 0 x2nd-st benicia
  solano-county bay-area)
 (23 ann-kongs-world-famous-bleach-bottle-pig-farm american 1.8 2072
  san-pablo-ave berkeley alameda-county bay-area)
 (24 au-coquelet american 2.6 2000 university-ave berkeley
  alameda-county bay-area)
 (25 gilman-grill american 2.0 1300 x4th-st berkeley alameda-county
  bay-area)
 (26 rick-&-anns american 3.5 2922 domingo-ave berkeley alameda-county
  bay-area)
 (27 shattuck-avenue-spats american 2.6 1974 shattuck-ave berkeley
  alameda-county bay-area)
 (28 brooks-ranch-restaurant american 2.0 1135 x2nd-st brentwood
  contra-costa-county bay-area)
 (29 the-silver-skillet american 2.0 8300 brentwood-blvd-no.-a
  brentwood contra-costa-county bay-area)
 (30 calistoga-roastery american 2.3 1631 lincoln-ave calistoga
  napa-county napa-valley)
 (31 the-silverado-restaurant-taver american 2.3 1374 lincoln-ave
  calistoga napa-county napa-valley)
 (32 dennys american 2.0 580 w-hamilton-ave campbell santa-clara-county
  bay-area)
 (33 dennys american 1.7 2060 s-bascom-ave campbell santa-clara-county
  bay-area)
 (34 lyons-castro-valley-442 american 2.0 3240 castro-valley-blvd
  castro-valley alameda-county bay-area)
 (35 special-continental-cuisine american 1.8 3774 castro-valley-blvd
  castro-valley alameda-county bay-area)
 (36 andys-restaurant american 2.0 1089 oak-grove-rd concord
  contra-costa-county bay-area)
 (37 cocos-873 american 2.0 4391 treat-blvd concord contra-costa-county
  bay-area)
 (38 dennys-restaurant american 2.0 1313 willow-pass-rd concord
  contra-costa-county bay-area)
 (39 legends-sports-restaurant-inc american 2.3 4050 port-chicago-hwy
  concord contra-costa-county bay-area)
 (40 lyons-restaurant american 2.0 4301 clayton-rd concord
  contra-costa-county bay-area)
 (41 marie-callenders-no american 2.3 2090 diamond-blvd concord
  contra-costa-county bay-area)
 (42 peppermill-inc american 2.8 1100 concord-ave concord
  contra-costa-county bay-area)
 (43 chuck-e-cheese american 2.0 0 unknown cupertino santa-clara-county
  bay-area)
 (44 hobees-restaurant american 3.3 21267 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (45 hobees-santa-cruz american 2.0 10215 anthony-pl cupertino
  santa-clara-county bay-area)
 (46 marriott-family-restaurants american 2.0 10145 n-de-anza-blvd
  cupertino santa-clara-county bay-area)
 (47 pauls-family-restaurant american 2.0 10700 s-de-anza-blvd
  cupertino santa-clara-county bay-area)
 (48 t-g-i-fridays american 1.8 10343 n-wolfe-rd cupertino
  santa-clara-county bay-area)
 (49 tgi-fridays american 2.0 10343 n-wolfe-rd cupertino
  santa-clara-county bay-area)
 (50 the-good-earth american 2.3 20807 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (51 hungry-hunter american 2.0 371 gellert-blvd daly-city
  san-mateo-county bay-area)
 (52 cocos-874 american 2.0 387 diablo-rd danville contra-costa-county
  bay-area)
 (53 dennys-restaurant american 2.0 807 camino-ramon danville
  contra-costa-county bay-area)
 (54 lyons-restaurant american 2.0 185 railroad danville
  contra-costa-county bay-area)
 (55 virtual-world american 2.0 117 town-and-country-dr-ste-a danville
  contra-costa-county bay-area)
 (56 carrows-hickory-chip-restauran american 2.0 7505 dublin-blvd
  dublin alameda-county bay-area)
 (57 cocos-872 american 2.0 7944 dublin-blvd dublin alameda-county
  bay-area)
 (58 copper-skillet-pantry-dublin american 1.7 7265 amador-valley-blvd
  dublin alameda-county bay-area)
 (59 dublin-buffet american 2.3 7783 amador-valley-blvd dublin
  alameda-county bay-area)
 (60 carrows-hickory-chip-restauran american 2.0 6120 potrero-ave
  el-cerrito contra-costa-county bay-area)
 (61 kirbys-family-restaurant american 2.0 10 el-cerrito-plz el-cerrito
  contra-costa-county bay-area)
 (62 blakes-restaurant american 2.0 4006 granada-rd el-sobrante
  contra-costa-county bay-area)
 (63 dennys-restaurant american 2.3 1776 powell-st emeryville
  alameda-county bay-area)
 (64 lyons-restaurant american 2.0 5750 christie-ave emeryville
  alameda-county bay-area)
 (65 townhouse-bar-&-grill american 3.1 5862 doyle-st emeryville
  alameda-county bay-area)
 (66 dennys american 2.0 260 pittman-rd fairfield solano-county
  bay-area)
 (67 dennys american 1.7 1360 holiday-ln fairfield solano-county
  bay-area)
 (68 dennys-restaurant american 2.0 2980 travis-blvd fairfield
  solano-county bay-area)
 (69 hickeys-brass-rail american 2.0 1545 webster-st-no.-a fairfield
  solano-county bay-area)
 (70 johnnie-gourmet-restaurant-cocktails american 2.0 1955 texas-st
  fairfield solano-county bay-area)
 (71 lyons-restaurant american 2.0 2390 n-texas-st fairfield
  solano-county bay-area)
 (72 chilis american 2.0 39131 fremont-blvd fremont alameda-county
  bay-area)
 (73 dennys american 1.3 5280 mowry-ave fremont alameda-county
  bay-area)
 (74 dennys-restaurant american 2.0 46645 mission-blvd fremont
  alameda-county bay-area)
 (75 dinas-family-restaurant american 3.0 40800 fremont-blvd fremont
  alameda-county bay-area)
 (76 dinos-family-restaurant american 2.3 36930 fremont-blvd fremont
  alameda-county bay-area)
 (77 harvest-farm-buffet american 2.0 4628 ariel-ave fremont
  alameda-county bay-area)
 (78 hungry-hunter american 2.5 5339 mowry-ave fremont alameda-county
  bay-area)
 (79 lyons-restaurant american 2.4 39350 paseo-padre-pky fremont
  alameda-county bay-area)
 (80 marie-callender american 2.3 39170 argonaut-way fremont
  alameda-county bay-area)
 (81 star-family-restaraunt american 2.7 3241 walnut-avenue fremont
  alameda-county bay-area)
 (82 carrows-hickory-chip-restauran american 2.0 20413 hesperian-blvd
  hayward alameda-county bay-area)
 (83 dennys-restaurant american 2.0 30163 industrial-pky-sw hayward
  alameda-county bay-area)
 (84 lyons-restaurant american 2.0 24100 mission-blvd hayward
  alameda-county bay-area)
 (85 lyons-restaurant american 2.0 25010 hesperian-blvd hayward
  alameda-county bay-area)
 (86 ernies-family-restaurant american 2.0 191 san-felipe-rd-no.-g
  hollister san-benito-county northern-california)
 (87 johnnies-bar-&-grill american 2.0 526 san-benito-st hollister
  san-benito-county northern-california)
 (88 hungry-hunter american 2.8 3201 mount-diablo-blvd lafayette
  contra-costa-county bay-area)
 (89 killarney-house american 2.0 3535 mount-diablo-blvd lafayette
  contra-costa-county bay-area)
 (90 papasan-catering american 2.0 3659 happy-valley-rd lafayette
  contra-costa-county bay-area)
 (91 peppers-bar-&-grill american 3.3 3474 mount-diablo-blvd lafayette
  contra-costa-county bay-area)
 (92 lyons-restaurant american 2.3 117 s-s-st livermore alameda-county
  bay-area)
 (93 mc-kays-bar-&-grill american 2.0 2293 x1st-st livermore
  alameda-county bay-area)
 (94 pine-street-grill american 2.0 875 rincon-ave livermore
  alameda-county bay-area)
 (95 emil-villas-hickry-pit-restaurant american 2.0 2310 homestead-rd
  los-altos santa-clara-county bay-area)
 (96 marie-callender-pie-shop american 2.4 4710 el-camino-real
  los-altos santa-clara-county bay-area)
 (97 los-gatos-brewing-co. american 3.3 130 n.-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (98 the-good-earth american 1.7 206 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (99 carrows-restaurant american 1.8 500 center-ave martinez
  contra-costa-county bay-area)
 (100 joes-martinez-bar-&-grill american 2.0 3925 alhambra-ave martinez
  contra-costa-county bay-area)
 (101 dennys american 2.0 200 serra-way-no.-170 milpitas
  santa-clara-county bay-area)
 (102 hungry-hunter american 3.3 1181 e-calaveras-blvd milpitas
  santa-clara-county bay-area)
 (103 marie-callenders american 2.3 333 s-abbott-ave milpitas
  santa-clara-county bay-area)
 (104 marie-callenders-pie-shops american 2.0 18599 sutter-blvd
  morgan-hill santa-clara-county bay-area)
 (105 mushrooms-grille-&-bar american 2.7 65 w-main-ave morgan-hill
  santa-clara-county bay-area)
 (106 marriott-family-restaurants american 2.0 1991 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (107 dennys-napa-valley-east american 2.0 1000 imola-ave napa
  napa-county napa-valley)
 (108 henrys american 2.0 1044 los-carneros-ave napa napa-county
  napa-valley)
 (109 lyons-restaurant american 2.0 1175 trancas-st napa napa-county
  napa-valley)
 (110 marie-callenders american 2.3 5 financial-plz-ste-120 napa
  napa-county napa-valley)
 (111 osullivans american 2.0 359 x1st-st napa napa-county napa-valley)
 (112 old-adobe-bar-&-grill american 2.0 376 soscol-ave napa
  napa-county napa-valley)
 (113 zapata-bar-and-grill american 2.3 3958 bel-aire-plz napa
  napa-county napa-valley)
 (114 lyons-restaurant american 2.3 5989 mowry-ave newark
  alameda-county bay-area)
 (115 red-robin-international-inc american 2.0 1031 newpark-mall newark
  alameda-county bay-area)
 (116 carrows-hickory-chip-restauran american 2.0 405 hegenberger-rd
  oakland alameda-county bay-area)
 (117 crogans-montclair american 2.7 1300 clay-st-ste-600 oakland
  alameda-county bay-area)
 (118 dennys-restaurant american 2.0 1000 cotton-st oakland
  alameda-county bay-area)
 (119 dennys-restaurant-296 american 2.0 601 hegenberger-rd oakland
  alameda-county bay-area)
 (120 family-affair american 2.0 1620 chestnut-st oakland
  alameda-county bay-area)
 (121 g-gs-family-restaurant american 2.0 3017 san-pablo-ave oakland
  alameda-county bay-area)
 (122 garys-grill-&-bar american 2.7 6118 medau-pl oakland
  alameda-county bay-area)
 (123 golden-bull-restaurant american 2.0 412 x14th-st oakland
  alameda-county bay-area)
 (124 grand-oaks-restaurant american 2.0 3701 grand-ave oakland
  alameda-county bay-area)
 (125 hunan-restaurant american 2.0 1916 franklin-st oakland
  alameda-county bay-area)
 (126 hungry-hunter american 2.0 1211 embarcadero oakland
  alameda-county bay-area)
 (127 hungry-hunter american 2.0 8475 edes-ave oakland alameda-county
  bay-area)
 (128 ikes-rotisserie american 2.7 3859 piedmont-ave oakland
  alameda-county bay-area)
 (129 jacks-restaurant-&-bar american 2.7 1 broadway oakland
  alameda-county bay-area)
 (130 l-j-quinns-lighthouse american 2.3 51 embarcadero-cv oakland
  alameda-county bay-area)
 (131 macs-bar-&-grill american 2.3 495 embarcadero oakland
  alameda-county bay-area)
 (132 montclair-restaurant american 2.0 2477 monterey-blvd oakland
  alameda-county bay-area)
 (133 overland-house-grill american 2.0 101 broadway oakland
  alameda-county bay-area)
 (134 soul-brothers-kitchen american 2.0 5239 telegraph-ave oakland
  alameda-county bay-area)
 (135 cookbook-restaurant american 3.0 127 town-and-country-vlg
  palo-alto santa-clara-county bay-area)
 (136 left-at-albuquerque american 3.0 445 emerson-st. palo-alto
  santa-clara-county bay-area)
 (137 macarthur-park-restaurant american 2.4 27 university-ave
  palo-alto santa-clara-county bay-area)
 (138 peninsula-fountain american 2.6 556 emerson palo-alto
  santa-clara-county bay-area)
 (139 q-cafe-billiards american 2.5 529 alma-st. palo-alto
  santa-clara-county bay-area)
 (140 stars-palo-alto american 2.6 265 lytton-ave palo-alto
  santa-clara-county bay-area)
 (141 sundance-mine-company american 3.5 1921 el-camino-real palo-alto
  santa-clara-county bay-area)
 (142 the-good-earth american 2.2 185 university-ave palo-alto
  santa-clara-county bay-area)
 (143 webster-grill american 2.0 34 dormidera-ave piedmont
  alameda-county bay-area)
 (144 the-persimmon-tree-restraunt american 2.7 2454 san-pablo-ave
  pinole contra-costa-county bay-area)
 (145 tommys american 2.0 2400 san-pablo-ave pinole contra-costa-county
  bay-area)
 (146 snooker-petes-bar-&-grill american 2.0 3788 railroad pittsburg
  contra-costa-county bay-area)
 (147 cocos-63-walnut-creek american 2.0 3200 buskirk-ave pleasant-hill
  contra-costa-county bay-area)
 (148 dennys-restaurant-162 american 2.0 612 contra-costa-blvd
  pleasant-hill contra-costa-county bay-area)
 (149 jojos-restaurant american 2.0 624 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (150 lyons-restaurant american 2.0 2059 contra-costa-blvd
  pleasant-hill contra-costa-county bay-area)
 (151 chilis american 3.0 4801 hopyard-rd pleasanton alameda-county
  bay-area)
 (152 dennys american 2.0 6455 owens-dr pleasanton alameda-county
  bay-area)
 (153 hungry-hunter american 3.4 6464 owens-dr pleasanton
  alameda-county bay-area)
 (154 lyons-restaurant american 2.0 4887 hopyard-rd pleasanton
  alameda-county bay-area)
 (155 velvet-turtle american 2.0 5121 hopyard-rd pleasanton
  alameda-county bay-area)
 (156 big-boy american 2.0 12976 san-pablo-ave richmond
  contra-costa-county bay-area)
 (157 edies-cafe american 2.0 145 tweksbury-ave richmond
  contra-costa-county bay-area)
 (158 general-store-at-marina-bay american 2.0 1950 esplanade richmond
  contra-costa-county bay-area)
 (159 great-american-hamburger-&-pie-co. american 2.0 35
  e.-richmond-ave richmond contra-costa-county bay-area)
 (160 little-louies american 2.5 49 washington-ave richmond
  contra-costa-county bay-area)
 (161 hungry-hunter american 2.0 180 s-airport-blvd south-san-francisco
  san-mateo-county bay-area)
 (162 cheris-a-family-restaurant american 2.0 641 main-st saint-helena
  napa-county napa-valley)
 (163 spring-street-restaurant american 2.7 1245 spring-st saint-helena
  napa-county napa-valley)
 (164 chuck-e-cheeses american 2.0 1270 el-camino-real-no.-1272
  san-bruno san-mateo-county bay-area)
 (165 t-g-i-fridays american 2.3 1250 grundy-ln san-bruno
  san-mateo-county bay-area)
 (166 tgi-fridays american 2.0 1250 grundy-ln san-bruno
  san-mateo-county bay-area)
 (167 amazing-grace-vegetarian-restaurant american 2.0 216 church
  san-francisco san-francisco-county bay-area)
 (168 bullshead-restaurant american 3.9 840 ulloa san-francisco
  san-francisco-county bay-area)
 (169 cafe-222 american 2.3 222 mason san-francisco
  san-francisco-county bay-area)
 (170 ellas-restaurant american 3.4 500 presidion-avenue san-francisco
  san-francisco-county bay-area)
 (171 fairmont-crown-buffet american 3.0 0 the-fairmont san-francisco
  san-francisco-county bay-area)
 (172 fog-city-diner american 3.1 1300 battery-st san-francisco
  san-francisco-county bay-area)
 (173 harpoon-louies american 2.3 55 stevenson san-francisco
  san-francisco-county bay-area)
 (174 harris-restaurant american 3.2 2100 van-ness-avenue san-francisco
  san-francisco-county bay-area)
 (175 huckleberry-finn-restaurant american 2.0 339
  taylor-steak-prime-rib san-francisco san-francisco-county bay-area)
 (176 izzys-steaks-&-chops american 4.0 3349 steiner san-francisco
  san-francisco-county bay-area)
 (177 joes-cable-car-restaurant american 3.3 4320 mission san-francisco
  san-francisco-county bay-area)
 (178 lasavane-west-african-restaurant-&-bar american 2.0 96
  mc-allister san-francisco san-francisco-county bay-area)
 (179 m-&-m-tavern american 2.0 198 x5th san-francisco
  san-francisco-county bay-area)
 (180 macarthur-park-restaurant american 3.0 607 front san-francisco
  san-francisco-county bay-area)
 (181 perrys american 3.0 1944 union san-francisco san-francisco-county
  bay-area)
 (182 sabella-&-la-torre american 2.7 0 wharf san-francisco
  san-francisco-county bay-area)
 (183 sugar-broiler american 2.0 2197 fillmore san-francisco
  san-francisco-county bay-area)
 (184 up-&-down-club american 3.3 1151 folsom san-francisco
  san-francisco-county bay-area)
 (185 vincesouth-san-francisco american 2.0 395 hayes san-francisco
  san-francisco-county bay-area)
 (186 broilerworks-retaurants-ltd american 2.0 150 s-1st-st san-jose
  santa-clara-county bay-area)
 (187 california-kitchen american 2.0 150 s-1st-st-ste-111 san-jose
  santa-clara-county bay-area)
 (188 cocos american 2.0 1753 n-1st-st san-jose santa-clara-county
  bay-area)
 (189 enios-family-restaurant american 2.0 2820 s-white-rd san-jose
  santa-clara-county bay-area)
 (190 hobees-montague-exp american 2.3 0 exp/riveroaks san-jose
  santa-clara-county bay-area)
 (191 hungry-hunter american 2.9 1051 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (192 jims-family-restaurant american 2.0 3758 stevens-creek-blvd-no.-9
  san-jose santa-clara-county bay-area)
 (193 marie-callenders american 2.0 620 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (194 marie-callenders-pie-shop american 2.3 780 s-winchester-blvd
  san-jose santa-clara-county bay-area)
 (195 marie-callenders american 2.3 2831 meridian-ave san-jose
  santa-clara-county bay-area)
 (196 marriott-family-restaurants american 2.0 981 blossom-hill-rd
  san-jose santa-clara-county bay-area)
 (197 carrows-hickory-chip-restauran american 2.0 15011 hesperian-blvd
  san-leandro alameda-county bay-area)
 (198 dennys-restaurant american 2.0 1803 marina-blvd san-leandro
  alameda-county bay-area)
 (199 dennys-restaurant american 2.0 15015 freedom-ave san-leandro
  alameda-county bay-area)
 (200 lyons-restaurant american 2.0 201 davis-st san-leandro
  alameda-county bay-area)
 (201 nicks-family-restaurant american 2.7 14660 washington-ave
  san-leandro alameda-county bay-area)
 (202 california-kitchen american 2.0 105 w-25th-ave san-mateo
  san-mateo-county bay-area)
 (203 t-g-i-fridays american 2.3 3101 s-el-camino-real san-mateo
  san-mateo-county bay-area)
 (204 fridays-of-california american 2.0 2410
  san-ramon-valley-blvd-no.130 san-ramon contra-costa-county bay-area)
 (205 mudds american 3.8 10 boardwalk-pl san-ramon contra-costa-county
  bay-area)
 (206 t-g-i-fridays american 2.3 2410 san-ramon-valley-blvd-no.130
  san-ramon contra-costa-county bay-area)
 (207 tommy-ts american 2.3 2410 san-ramon-valley-blvd san-ramon
  contra-costa-county bay-area)
 (208 marriott-family-restaurants american 2.0 2570 el-camino-real
  santa-clara santa-clara-county bay-area)
 (209 mcneils-bar-&-grill american 2.0 2886 sycamore-way santa-clara
  santa-clara-county bay-area)
 (210 the-good-earth american 2.0 2705 the-alameda santa-clara
  santa-clara-county bay-area)
 (211 petes-family-restaurant american 2.0 2018 mission-st santa-cruz
  santa-cruz-county bay-area)
 (212 pontiac-grill american 2.4 429 front-st santa-cruz
  santa-cruz-county bay-area)
 (213 mikayla-at-c.madrona american 3.4 801 bridgeway sausalito unknown
  bay-area)
 (214 dennys american 2.0 1879 rockville-rd suisun-city solano-county
  bay-area)
 (215 golden-grill-restaurant american 2.0 108 g-sunset-shopping-center
  suisun-city solano-county bay-area)
 (216 mullins-pub-&-grill american 2.3 603 &-605-main-st suisun-city
  solano-county bay-area)
 (217 country-gourmet-& american 3.0 1314 s-mary-ave sunnyvale
  santa-clara-county bay-area)
 (218 silver-spoon-cafe american 2.0 122 s.-sunnyvale-ave sunnyvale
  santa-clara-county bay-area)
 (219 silver-spoon-cafe american 2.0 122 s.-sunnyvale-ave sunnyvale
  santa-clara-county bay-area)
 (220 sunnyvale-cattlemans american 2.7 0 mathilda-at-hwy-237 sunnyvale
  santa-clara-county bay-area)
 (221 the-silver-spoon american 2.0 122 s.-sunnyvale-ave sunnyvale
  santa-clara-county bay-area)
 (222 carrows-hickory-chip-restauran american 2.0 34396
  alvarado-niles-rd union-city alameda-county bay-area)
 (223 zaidas-filipino-american-cuis american 2.0 31860 alvarado-blvd
  union-city alameda-county bay-area)
 (224 dennys-restaurant american 2.0 4355 sonoma-blvd vallejo
  solano-county bay-area)
 (660 hemphills-cocktail-lounge bar 2.0 3385 calif-blvd napa
  napa-county napa-valley)
 (661 lamplighter-lounge bar 2.0 974 franklin-st napa napa-county
  napa-valley)
 (662 nite-cap bar 2.0 2560 macgregor-ct napa napa-county napa-valley)
 (663 riverside-lounge bar 2.0 2443 w-park-ave napa napa-county
  napa-valley)
 (664 the-green-door bar 2.0 2043 w-f-st napa napa-county napa-valley)
 (665 guberas-pub-&-hofbrau bar 2.0 5810 jarvis-ave newark
  alameda-county bay-area)
 (666 hideway-lounge bar 2.0 35201 newark-blvd newark alameda-county
  bay-area)
 (667 ikes-cocktail-lounge bar 2.0 36601 newark-blvd-no.-81 newark
  alameda-county bay-area)
 (668 knotty-pine-tavern bar 2.0 37013 ash-st newark alameda-county
  bay-area)
 (669 la-movida-bar bar 2.0 7167 thornton-ave newark alameda-county
  bay-area)
 (670 x2101-club-inc bar 2.0 2101 macarthur-blvd oakland alameda-county
  bay-area)
 (671 x400-club bar 2.0 400 x29th-ave oakland alameda-county bay-area)
 (672 a-&-c-club bar 1.7 1950 san-pablo-ave oakland alameda-county
  bay-area)
 (673 bark-n-bun bar 2.0 1450 lakeshore-ave oakland alameda-county
  bay-area)
 (674 barneys bar 3.0 5819 college-ave oakland alameda-county bay-area)
 (675 barneys bar 3.0 4162 piedmont-ave oakland alameda-county
  bay-area)
 (676 bench-&-bar bar 2.3 120 x11th-st oakland alameda-county bay-area)
 (677 cabels-reef-bar bar 2.0 2272 telegraph-ave oakland alameda-county
  bay-area)
 (678 club-aloha bar 2.0 952 fruitvale-ave oakland alameda-county
  bay-area)
 (679 club-eve bar 2.0 266 x14th-st oakland alameda-county bay-area)
 (680 club-martinique bar 2.0 3000 macarthur-blvd oakland
  alameda-county bay-area)
 (681 club-millroc bar 2.0 2214 macarthur-blvd oakland alameda-county
  bay-area)
 (682 continental-club bar 2.0 1658 x12th-st-no.-a oakland
  alameda-county bay-area)
 (683 court-lounge bar 2.0 126 x14th-st-no.-32 oakland alameda-county
  bay-area)
 (684 elis-mile-high-club-&-restaur bar 2.0 3629
  martin-luther-king-jr-way oakland alameda-county bay-area)
 (685 fruitvale-lounge bar 2.0 1943 fruitvale-ave oakland
  alameda-county bay-area)
 (686 golden-hours-lounge bar 2.0 1358 fruitvale-ave oakland
  alameda-county bay-area)
 (687 heinolds-first-&-last-chance bar 2.7 56 jack-london-sq oakland
  alameda-county bay-area)
 (688 hilltop-tavern bar 2.0 3411 macarthur-blvd oakland alameda-county
  bay-area)
 (689 hughes-&-nells-soul-food-bar bar 2.0 1821 x90th-ave oakland
  alameda-county bay-area)
 (690 jo-ellens-lamp-lighter-lounge bar 2.0 34 eastmont-mall-no.-a
  oakland alameda-county bay-area)
 (691 kims-lounge bar 2.0 1534 san-pablo-ave oakland alameda-county
  bay-area)
 (692 laurel-lounge bar 2.0 3932 macarthur-blvd oakland alameda-county
  bay-area)
 (693 maxines bar 2.0 370 embarcadero oakland alameda-county bay-area)
 (694 mc-nallys-inc bar 2.0 435 x13th-st oakland alameda-county
  bay-area)
 (695 mc-nallys-inc bar 2.7 5352 college-ave oakland alameda-county
  bay-area)
 (696 olivers-hof-brau-&-cocktail bar 3.0 360 adeline-st oakland
  alameda-county bay-area)
 (697 rays-club bar 2.0 4428 martin-luther-king-jr-way oakland
  alameda-county bay-area)
 (698 rumors bar 2.0 5921 foothill-blvd oakland alameda-county
  bay-area)
 (699 seven-seas bar 2.0 4001 macarthur-blvd oakland alameda-county
  bay-area)
 (700 soons-cocktail-lounge bar 2.0 3449 fruitvale-ave oakland
  alameda-county bay-area)
 (701 sports-page bar 2.0 10440 macarthur-blvd oakland alameda-county
  bay-area)
 (702 stork-club bar 2.0 380 x12th-st oakland alameda-county bay-area)
 (703 the-club-omni bar 2.0 4799 shattuck-ave oakland alameda-county
  bay-area)
 (704 the-graduate bar 2.0 6202 claremont-ave oakland alameda-county
  bay-area)
 (705 the-hut bar 2.0 5515 college-ave oakland alameda-county bay-area)
 (706 villa-nova-lounge bar 2.0 2775 telegraph-ave oakland
  alameda-county bay-area)
 (707 whispers-cocktail-lounge bar 2.0 355 x19th-st oakland
  alameda-county bay-area)
 (708 yee-old-inn bar 2.0 3514 e-14th-st oakland alameda-county
  bay-area)
 (709 melody-lounge bar 2.0 200 w-cypress-rd oakley contra-costa-county
  bay-area)
 (710 olympic-juice-bar bar 2.0 1620 delta-meadows-way oakley
  contra-costa-county bay-area)
 (711 cheers-of-pacifica bar 2.0 1249 linda-mar-shopping-ctr pacifica
  san-mateo-county bay-area)
 (712 sports-bar-at-vallemar-statio bar 3.2 2125 cabrillo-hwy pacifica
  san-mateo-county bay-area)
 (713 big-sky-ranch-&-saloon bar 2.0 99 stanford-shopping-ctr palo-alto
  santa-clara-county bay-area)
 (714 gordon-biersch-brewery-restaurant bar 2.7 625 emerson-st
  palo-alto santa-clara-county bay-area)
 (715 rose-&-crown-english-food-and-ale bar 3.8 547 emerson-st
  palo-alto santa-clara-county bay-area)
 (716 duartes-tavern bar 3.5 0 unknown pescadero san-mateo-county
  bay-area)
 (717 antlers-tavern bar 2.0 2284 san-pablo-ave pinole
  contra-costa-county bay-area)
 (718 green-lantern-lounge bar 2.0 1907 san-pablo-ave pinole
  contra-costa-county bay-area)
 (719 petes-place bar 2.0 610 san-pablo-ave-apt-a pinole
  contra-costa-county bay-area)
 (720 silver-ridge-lounge bar 2.0 1481 tara-hills-dr pinole
  contra-costa-county bay-area)
 (721 kruegers-cocktail-lounge bar 2.0 2445 willow-pass-rd pittsburg
  contra-costa-county bay-area)
 (722 cjs-saloon bar 2.0 548 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (723 monument-lounge bar 2.0 2265 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (724 elviras-castle-bar bar 2.0 537 main-st pleasanton alameda-county
  bay-area)
 (725 haps-bar-&-restaurant bar 2.0 122 w-neal-st pleasanton
  alameda-county bay-area)
 (726 pardners-inn bar 2.0 3506 old-santa-rita-rd-no.-b pleasanton
  alameda-county bay-area)
 (727 popi-lounge bar 2.7 3059 hopyard-rd pleasanton alameda-county
  bay-area)
 (728 sunshine-saloon bar 3.0 1807 santa-rita-rd-ste-k pleasanton
  alameda-county bay-area)
 (729 the-hop-yard bar 2.8 3015 hopyard-rd-ste-h pleasanton
  alameda-county bay-area)
 (730 union-jack-pub bar 2.0 725 main-st pleasanton alameda-county
  bay-area)
 (731 y-all-come-back-saloon bar 2.0 5321 hopyard-rd-ste-c pleasanton
  alameda-county bay-area)
 (732 alpine-beer-garden bar 2.3 3915 alpine-rd portola-valley
  san-mateo-county bay-area)
 (733 dannys-tavern bar 2.0 816 x8th-ave redwood-city san-mateo-county
  bay-area)
 (734 pudleys bar 2.0 2312 hopkins-ave redwood-city san-mateo-county
  bay-area)
 (735 carousal-lounge bar 2.0 226 x44th-st richmond contra-costa-county
  bay-area)
 (736 jerrys-cocktail-lounge bar 2.0 13021 san-pablo-ave richmond
  contra-costa-county bay-area)
 (737 little-rickys-lounge bar 2.0 3024 cutting-blvd richmond
  contra-costa-county bay-area)
 (738 richmond-galileo-club bar 2.0 371 s-23rd-st richmond
  contra-costa-county bay-area)
 (739 rodys-bar bar 2.0 2227 macdonald-ave richmond contra-costa-county
  bay-area)
 (740 the-elkhorn-cocktail-lounge bar 2.0 2012 cutting-blvd richmond
  contra-costa-county bay-area)
 (741 striper-lounge-&-restaurant bar 2.3 210 main-st rio-vista
  solano-county bay-area)
 (742 states-tavern bar 2.3 200 grand-ave south-san-francisco
  san-mateo-county bay-area)
 (743 the-pub bar 2.0 2224 westborough-blvd south-san-francisco
  san-mateo-county bay-area)
 (744 the-rio-saloon bar 2.0 414 san-mateo-ave san-bruno
  san-mateo-county bay-area)
 (745 j-bs-laurel-cocktail-lounge bar 1.7 1189 laurel-st san-carlos
  san-mateo-county bay-area)
 (746 pudleys bar 2.0 10 daffodil-ln san-carlos san-mateo-county
  bay-area)
 (747 club-181 bar 2.0 181 eddy-st san-francisco san-francisco-county
  bay-area)
 (748 binis-bar-&-grille bar 2.7 337 e-taylor-st san-jose
  santa-clara-county bay-area)
 (749 buckhorn-tavern bar 2.0 3273 sierra-rd san-jose
  santa-clara-county bay-area)
 (750 cup-&-saucer bar 2.0 1375 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (751 drinks-drive-thru bar 2.0 2751 richland-ave san-jose
  santa-clara-county bay-area)
 (752 foxn-hounds-tavern bar 2.0 1143 saratoga-sunnyvale-rd san-jose
  santa-clara-county bay-area)
 (753 gaslight-bar-&-grill bar 2.0 858 n-13th-st san-jose
  santa-clara-county bay-area)
 (754 green-parrot-lounge bar 2.0 1711 mckee-rd san-jose
  santa-clara-county bay-area)
 (755 gregs-bar bar 2.0 309 n-montgomery-st san-jose santa-clara-county
  bay-area)
 (756 la-cueva-bar bar 2.0 939 old-oakland-rd san-jose
  santa-clara-county bay-area)
 (757 redwood-cabin-tavern bar 2.0 0 unknown san-jose
  santa-clara-county bay-area)
 (758 tavern-190 bar 2.0 2219 quimby-rd san-jose santa-clara-county
  bay-area)
 (759 daisys-saloon-&-liquors bar 2.0 0 unknown san-juan-bautista
  san-benito-county northern-california)
 (760 mom-&-pops-saloon bar 2.0 0 unknown san-juan-bautista
  san-benito-county northern-california)
 (761 river-oaks-store-&-saloon bar 2.0 2299 chittenden-rd
  san-juan-bautista san-benito-county northern-california)
 (762 billies-lounge bar 2.0 1680 washington-ave san-leandro
  alameda-county bay-area)
 (763 brass-putter bar 2.0 13800 neptune-dr-brass-putter san-leandro
  alameda-county bay-area)
 (764 gass-house-lounge bar 2.0 15105 washington-ave san-leandro
  alameda-county bay-area)
 (765 gerrys-lounge bar 2.0 656 e-14th-st san-leandro alameda-county
  bay-area)
 (766 lakeside-lounge bar 2.0 15293 hesperian-blvd san-leandro
  alameda-county bay-area)
 (767 marina-cocktail-lounge bar 2.0 13855 catalina-st san-leandro
  alameda-county bay-area)
 (768 shooters-cocktail-lounge bar 2.0 1500 x150th-ave san-leandro
  alameda-county bay-area)
 (769 tommy-ts-cocktail-lounge bar 2.0 150 w-juana-ave san-leandro
  alameda-county bay-area)
 (770 prince-of-wales bar 3.4 106 e-25th-ave san-mateo san-mateo-county
  bay-area)
 (771 r-bs-pub bar 2.0 635 el-portal-dr san-pablo contra-costa-county
  bay-area)
 (772 tinys-tavern bar 2.0 1503 x23rd-st san-pablo contra-costa-county
  bay-area)
 (773 sidelines-sport-bar/grill-rstr bar 2.0 500
  bollinger-canyon-way-no.-a-12 san-ramon contra-costa-county bay-area)
 (774 a-tinkers-damn bar 2.3 0 unknown santa-clara santa-clara-county
  bay-area)
 (775 dukes-cocktail-lounge bar 2.0 2175 monroe-st santa-clara
  santa-clara-county bay-area)
 (776 martins-cocktail-lounge bar 2.0 915 circle-dr santa-clara
  santa-clara-county bay-area)
 (777 sportsman-bar bar 2.0 2368 pruneridge-ave santa-clara
  santa-clara-county bay-area)
 (778 the-5-cs-tavern bar 2.0 2531 newhall-st santa-clara
  santa-clara-county bay-area)
 (779 x99-bottles-of-beer-on-the-wall bar 2.4 104 walnut-ave-no.-99
  santa-cruz santa-cruz-county bay-area)
 (780 island-pacific-beverage bar 2.0 203 younglove-ave santa-cruz
  santa-cruz-county bay-area)
 (781 pauls-cocktail-lounge bar 2.0 2405 mission-st santa-cruz
  santa-cruz-county bay-area)
 (782 poet-&-patriot-irish-pub bar 2.0 320 cedar-st-no.-e santa-cruz
  santa-cruz-county bay-area)
 (783 rons-seaside-saloon bar 2.0 233 ocean-st santa-cruz
  santa-cruz-county bay-area)
 (784 santa-cruz-brewing-company bar 3.0 516 front-st santa-cruz
  santa-cruz-county bay-area)
 (785 the-blue-lagoon-cocktail-lounge bar 2.3 923 pacific-ave
  santa-cruz santa-cruz-county bay-area)
 (786 j-j-s-saloon bar 2.0 4714 soquel-dr soquel unknown bay-area)
 (787 sir-froggys-pub bar 2.0 4771 soquel-dr soquel unknown bay-area)
 (788 a-js-waterin-hole bar 2.0 5050 sleepy-hollow-rd suisun-city
  solano-county bay-area)
 (789 parkers-old-town-tavern bar 2.0 711 main-st suisun-city
  solano-county bay-area)
 (790 vics-pioneer-bar bar 2.0 707 main-st suisun-city solano-county
  bay-area)
 (791 a-&-w-restaurant bar 2.0 302 n-fairoaks-ave sunnyvale
  santa-clara-county bay-area)
 (792 benchmark-brewing-company bar 2.0 0 unknown sunnyvale
  santa-clara-county bay-area)
 (793 cheers bar 1.7 685 e-el-camino-real sunnyvale santa-clara-county
  bay-area)
 (794 faultline-brewing-company bar 2.8 1235 oakmead-parkway sunnyvale
  santa-clara-county bay-area)
 (795 dyer-street-salon bar 2.0 31871 alvarado-blvd union-city
  alameda-county bay-area)
 (796 leos-lounge bar 2.0 33423 mission-blvd union-city alameda-county
  bay-area)
 (797 old-mill-tavern bar 2.0 6 union-square-blvd-unit-5 union-city
  alameda-county bay-area)
 (798 the-shuttle-cocktail-lounge bar 2.0 2625 decoto-rd union-city
  alameda-county bay-area)
 (799 after-five bar 2.0 2234 sacramento-st vallejo solano-county
  bay-area)
 (800 bandwagon-lounge bar 2.0 1817 capitol-st vallejo solano-county
  bay-area)
 (801 chriss-club bar 2.0 656 benicia-rd vallejo solano-county
  bay-area)
 (802 dinky-doos-bar bar 2.0 3008 sonoma-blvd vallejo solano-county
  bay-area)
 (803 dunphys-tavern bar 2.0 401 york-st vallejo solano-county
  bay-area)
 (804 freddies-china-barn bar 2.0 320 tuolumne-st vallejo solano-county
  bay-area)
 (805 georges-den bar 2.0 1113 maple-ave vallejo solano-county
  bay-area)
 (806 horse-&-cow bar 2.0 1324 interstate-80 vallejo solano-county
  bay-area)
 (807 josey-wales-country-nite-club bar 2.0 1506 marine-world-pky
  vallejo solano-county bay-area)
 (808 keslers-lounge bar 2.0 125 couch-st vallejo solano-county
  bay-area)
 (809 my-office-bar-&-grill bar 2.0 2414 sacramento-st vallejo
  solano-county bay-area)
 (810 nitti-gritti-lounge bar 2.0 905 lincoln-rd-e vallejo
  solano-county bay-area)
 (811 popcorn-tavern bar 2.0 1687 marine-world-pky vallejo
  solano-county bay-area)
 (812 shamrock-club bar 2.0 1817 capitol-st vallejo solano-county
  bay-area)
 (813 stans-lounge bar 2.0 2065 solano-ave-no.-a vallejo solano-county
  bay-area)
 (814 terrible-teris-tavern bar 2.0 472 benicia-rd vallejo
  solano-county bay-area)
 (815 arties-countrywood-lounge-inc bar 2.0 2068 treat-blvd-no.-b
  walnut-creek contra-costa-county bay-area)
 (816 d-j bar 2.0 1535 olympic-blvd walnut-creek contra-costa-county
  bay-area)
 (817 dans-bar bar 2.0 1524 civic-dr walnut-creek contra-costa-county
  bay-area)
 (818 onyx bar 2.0 1251 arroyo-way walnut-creek contra-costa-county
  bay-area)
 (819 sports-bar bar 2.0 2033 n-main-st-ste-110 walnut-creek
  contra-costa-county bay-area)
 (820 wpljs bar 2.3 2112 n-main-st walnut-creek contra-costa-county
  bay-area)
 (821 mels-waterfront-bar-&-food bar 2.0 328 walker-st watsonville
  santa-cruz-county bay-area)
 (822 pioneer-saloon bar 2.0 2925 woodside-rd-no.-b woodside
  san-mateo-county bay-area)
 (823 bad-otter bar 2.8 0 x1-just-north-of-strawflower-village
  half-moon-bay san-mateo-county bay-area)
 (824 jupiter bar 2.6 2181 shattuck-ave berkeley alameda-county
  bay-area)
 (825 fords-snack-bar bar 2.0 171 w-a-st dixon solano-county bay-area)
 (826 wallys-bar-&-grill bar 2.0 100 s-1st-st dixon solano-county
  bay-area)
 (827 wallys-restaurant-&-bar bar 2.0 100 s-1st-st dixon solano-county
  bay-area)
 (828 fords-snack-bar bar 2.0 630 union-ave fairfield solano-county
  bay-area)
 (829 russian-river-pub bar 2.0 11829 river-rd forestville
  sonoma-county bay-area)
 (830 holidaze-bar-&-grill bar 2.0 42 petaluma-boulevard petaluma
  sonoma-county bay-area)
 (831 kellys-bar-&-restaurant bar 2.0 10056 main petaluma sonoma-county
  bay-area)
 (832 mcnears-saloon-&-dining-house bar 3.0 23 petaluma-blvd-n petaluma
  sonoma-county bay-area)
 (833 papas-taverna bar 2.4 5688 lakeville-hwy petaluma sonoma-county
  bay-area)
 (834 stormys-bloomfield-tavern-spirits-&-supper bar 3.0 6650
  bloomfield-rd petaluma sonoma-county bay-area)
 (835 volpis-ristorante-&-bar bar 2.6 122 washington-st petaluma
  sonoma-county bay-area)
 (836 chilis-grill-&-bar bar 2.0 4851 redwood-dr rohnert-park
  sonoma-county bay-area)
 (837 cybelles-pizza-&-sports-bar bar 2.0 10 enterprise-dr rohnert-park
  sonoma-county bay-area)
 (838 dons-bar-&-sports bar 2.0 5000 commerce-blvd rohnert-park
  sonoma-county bay-area)
 (839 yu-shang-mandarin-restaurant-&-sushi-bar bar 1.7 180 bellam-blvd
  san-rafael marin-county bay-area)
 (840 barleycorns-saloon-&-eatery bar 2.0 2700 yulupa-ave santa-rosa
  sonoma-county bay-area)
 (841 bull-moose-saloon-&-pizza-co bar 2.0 1529 farmers-ln santa-rosa
  sonoma-county bay-area)
 (842 joes-of-santa-rosa-restaurant-&-bar bar 2.0 4776 sonoma-hwy
  santa-rosa sonoma-county bay-area)
 (843 john-barleycorn-saloon-&-eatery bar 2.0 2700 yulupa-ave
  santa-rosa sonoma-county bay-area)
 (844 lucas-wharf-restaurant-&-bar bar 2.0 595 highway-1 santa-rosa
  sonoma-county bay-area)
 (845 pierce-street-annex-restaurant-and-bar bar 2.0 19
  old-courthouse-sq santa-rosa sonoma-county bay-area)
 (846 r-&-s-bar bar 2.0 5344 sebastopol-rd santa-rosa sonoma-county
  bay-area)
 (847 rusty-putter-restaurant-&-bar bar 2.0 3330 yulupa-ave santa-rosa
  sonoma-county bay-area)
 (848 sharleens-snack-bar bar 2.0 600 administration-dr santa-rosa
  sonoma-county bay-area)
 (849 sweetriver-saloon bar 2.0 248 coddingtown-cetner santa-rosa
  sonoma-county bay-area)
 (850 sausalito-inn-bar-&-restaurant bar 2.0 599 bridgeway sausalito
  unknown bay-area)
 (851 greenhouse-restaurant-&-tavern-restaurant bar 2.0 124 s-main-st
  sebastopol sonoma-county bay-area)
 (852 jasper-ofarrells-pub-&-restaurant bar 2.0 6957 sebastopol-ave
  sebastopol sonoma-county bay-area)
 (853 skips-bar-&-grill bar 2.0 9005 graton-rd sebastopol sonoma-county
  bay-area)
 (854 eastside-oyster-bar-&-grill bar 2.7 133 e-napa-st sonoma
  sonoma-county bay-area)
 (855 sonoma-grove-bar-&-grill bar 2.0 19315 sonoma-hwy sonoma
  sonoma-county bay-area)
 (856 bankfirst-natl-bar-&-grill bar 2.0 701 main-st suisun-city
  solano-county bay-area)
 (857 todd-park-snack-bar bar 2.0 701 cedar-st suisun-city
  solano-county bay-area)
 (858 mortara-joe-snack-bar bar 2.0 900 fairgrounds-dr vallejo
  solano-county bay-area)
 (859 anchor-oyster-bar bar 2.7 579 castro-st san-francisco
  san-francisco-county bay-area)
 (860 aroma-espresso-bar bar 2.0 101 spear-st san-francisco
  san-francisco-county bay-area)
 (861 banks-bar bar 2.0 0 --300-plymouth-ave san-francisco
  san-francisco-county bay-area)
 (862 blarney-stone-bar-&-restaurant bar 2.0 5701 geary-blvd
  san-francisco san-francisco-county bay-area)
 (863 city-of-paris-restaurant-&-bar bar 2.7 101 shannon-st
  san-francisco san-francisco-county bay-area)
 (864 eat-&-run-snack-bar bar 2.0 800 stanyan-st san-francisco
  san-francisco-county bay-area)
 (865 el-oso-bar-and-restaurant bar 2.0 1153 valencia-st san-francisco
  san-francisco-county bay-area)
 (866 garden-juice-bar bar 2.0 10 mason-st san-francisco
  san-francisco-county bay-area)
 (867 greeleys-restaurant-&-bar bar 2.0 4314 california-st
  san-francisco san-francisco-county bay-area)
 (868 jazz-at-pearls-restaurant-&-bar bar 2.7 256 columbus-ave
  san-francisco san-francisco-county bay-area)
 (869 joes-snack-bar bar 2.0 400 van-ness-ave san-francisco
  san-francisco-county bay-area)
 (870 johnnys-os-snack-bar bar 2.0 630 sansome-st san-francisco
  san-francisco-county bay-area)
 (871 kezar-bar-&-restaurant bar 2.3 900 cole-st san-francisco
  san-francisco-county bay-area)
 (872 lees-snack-bar bar 2.0 200 paul-ave san-francisco
  san-francisco-county bay-area)
 (873 martin-macks-bar-&-restaurant bar 2.0 1568 haight-st
  san-francisco san-francisco-county bay-area)
 (874 metro-bar-and-restaurant-the bar 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (875 monte-carlo-restaurant-&-bar-t bar 2.0 1705 yosemite-ave
  san-francisco san-francisco-county bay-area)
 (876 oppenheimer-restaurant-&-bar bar 2.0 2050 divisadero-st
  san-francisco san-francisco-county bay-area)
 (877 parc-place-restaurant-&-bar bar 2.0 160 spear-st san-francisco
  san-francisco-county bay-area)
 (878 pearls-jazz-restaurant-&-bar bar 2.0 256 columbus-ave
  san-francisco san-francisco-county bay-area)
 (879 r-cafe-bar-&-restaurant bar 2.0 127 x7th san-francisco
  san-francisco-county bay-area)
 (880 raw-bar-hyde-street-seafood-ho bar 2.0 1509 hyde-st san-francisco
  san-francisco-county bay-area)
 (881 richards-snack-bar bar 2.0 400 van-ness-ave san-francisco
  san-francisco-county bay-area)
 (882 square-bar-&-restaurant-the bar 2.0 405 mason-st san-francisco
  san-francisco-county bay-area)
 (883 st-johns-snack-bar bar 2.0 925 chenery-st san-francisco
  san-francisco-county bay-area)
 (884 steves-snack-bar bar 2.0 211 main-st san-francisco
  san-francisco-county bay-area)
 (885 pasta-pomodor bar 2.0 655 union-st san-francisco
  san-francisco-county bay-area)
 (886 the-square-bar-&-restaurant bar 2.0 400 geary-st san-francisco
  san-francisco-county bay-area)
 (887 empire-tap-room bar 3.1 651 emerson-st palo-alto
  santa-clara-county bay-area)
 (888 los-gatos-bar-&-grill bar 2.7 15 x12-n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (889 horse-shoe-club bar 2.0 2655 el-camino-real santa-clara
  santa-clara-county bay-area)
 (890 roster-t.-feathers bar 2.0 157 e-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (891 island-food-&-grog-the bar 3.3 0 el-camino-real palo-alto
  santa-clara-county bay-area)
 (892 paddys-irish-bar bar 2.0 31 santa-clara san-jose
  santa-clara-county bay-area)
 (893 coachs-corner bar 2.0 152 san-fernando san-jose
  santa-clara-county bay-area)
 (894 gulf-coast-grill-&-bar bar 2.0 736 washington oakland
  alameda-county bay-area)
 (895 triple-rock-brewery bar 2.0 1920 shattuck berkeley alameda-county
  bay-area)
 (896 mooses bar 3.2 1652 stockton-st. san-francisco
  san-francisco-county bay-area)
 (897 akasaka-cocktail bar 2.7 1723 sutter san-francisco
  san-francisco-county bay-area)
 (898 the-hopyard bar 3.3 3015 hopyard-rd pleasanton alameda-county
  bay-area)
 (899 ivys-restaurant-&-bar bar 2.0 398 hayes-st san-francisco
  san-francisco-county bay-area)
 (900 annabelles-bar-&-bistro bar 2.7 68 fourth-st. san-francisco
  san-francisco-county bay-area)
 (901 clement-street-bar-and-grill bar 2.0 708 clement san-francisco
  san-francisco-county bay-area)
 (902 harbor-fifteen bar 2.0 15 harbor-st san-rafael marin-county
  bay-area)
 (903 mudville-grill bar 2.3 6200 center-st. clayton
  contra-costa-county bay-area)
 (904 big-horn bar 2.3 0 ramon-blvd. san-ramon contra-costa-county
  bay-area)
 (905 petes-brass-rail-and-car-wash bar 2.3 331 hartz-ave danville
  contra-costa-county bay-area)
 (906 burlingame-station bar 2.4 333 california-ave burlingame
  san-mateo-county bay-area)
 (907 infusion bar 2.3 555 x2nd-st san-francisco san-francisco-county
  bay-area)
 (908 mars-cafe bar 2.0 7 st-798-brannan san-francisco
  san-francisco-county bay-area)
 (909 maxs bar 2.0 1620 saratoga-avenue-no.390 san-jose
  santa-clara-county bay-area)
 (910 thirsty-bear-brewing-co bar 2.3 661 howard-st san-francisco
  san-francisco-county bay-area)
 (911 hydro-bar-&-grill bar 2.0 1403 lincoln-ave calistoga napa-county
  napa-valley)
 (912 bear-republic-brewing-co.-inc. bar 2.0 345 healdsburg-avenue
  healdsburg sonoma-county bay-area)
 (913 maui-rock-bar-&-grill bar 1.8 5995 mowry-ave newark
  alameda-county bay-area)
 (914 the-surfwood bar 2.0 0 unknown calistoga napa-county napa-valley)
 (915 susie bar 2.0 0 unknown calistoga napa-county napa-valley)
 (916 coles-bar-b barbeque 2.0 8059 aptos-st aptos santa-cruz-county
  bay-area)
 (917 carmen-&-family-bar-b-que barbeque 2.3 3252 adeline-st berkeley
  alameda-county bay-area)
 (918 mamas-barbeque barbeque 2.0 1686 shattuck-ave berkeley
  alameda-county bay-area)
 (919 thai-barbeque barbeque 1.8 1958 shattuck-ave berkeley
  alameda-county bay-area)
 (920 down-home-texas-barbeque barbeque 2.0 8335 brentwood-blvd-ste-c
  brentwood contra-costa-county bay-area)
 (921 andys-bar-b-q barbeque 2.4 700 e-campbell-ave campbell
  santa-clara-county bay-area)
 (922 tony-romas barbeque 3.0 200 sycamore-valley-rd-w danville
  contra-costa-county bay-area)
 (923 goldies-oakwood-bar-b-q barbeque 2.0 1940 university-ave-no.-c
  east-palo-alto san-mateo-county bay-area)
 (924 piggys-pizza-&-ribs barbeque 3.0 11299 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (925 tony-roma barbeque 2.0 420 executive-ct-n-ste-g fairfield
  solano-county bay-area)
 (926 blue-pacific barbeque 2.0 2904 alameda-ave half-moon-bay
  san-mateo-county bay-area)
 (927 emil-villa-barbeque-pit barbeque 2.5 2730 cavanagh-ct hayward
  alameda-county bay-area)
 (928 everett-&-jones barbeque 2.7 300 a-st hayward alameda-county
  bay-area)
 (929 han-yang-bbq barbeque 2.0 22365 mission-blvd hayward
  alameda-county bay-area)
 (930 hickory-pit barbeque 2.0 2730 cavanagh-ct hayward alameda-county
  bay-area)
 (931 california-barbeque barbeque 2.0 0 unknown los-altos
  santa-clara-county bay-area)
 (932 little-lous-bbq barbeque 2.0 15551 flintridge-dr los-gatos
  santa-clara-county bay-area)
 (933 down-home-texas-bbq barbeque 2.0 2250 pacheco-blvd martinez
  contra-costa-county bay-area)
 (934 rib-crib barbeque 2.0 209 s.-main-st milpitas santa-clara-county
  bay-area)
 (935 rib-cage-restaurant barbeque 2.0 5698 thornton-ave newark
  alameda-county bay-area)
 (936 big-daddys-smoke-house barbeque 2.0 326 e-18th-st oakland
  alameda-county bay-area)
 (937 everett-&-jones barbeque 3.0 2676 fruitvale-ave oakland
  alameda-county bay-area)
 (938 flints-barbeque barbeque 3.7 3114 san-pablo-ave oakland
  alameda-county bay-area)
 (939 happy-bar-b-q barbeque 2.0 5299 college-ave-no.-a oakland
  alameda-county bay-area)
 (940 the-drivers-soul-foods-&-bbq barbeque 2.0 10135 pippin-st oakland
  alameda-county bay-area)
 (941 walts-hickory barbeque 2.0 10739 macarthur-blvd oakland
  alameda-county bay-area)
 (942 wess-&-virginias-bbq barbeque 2.0 3415 telegraph-ave oakland
  alameda-county bay-area)
 (943 h-double-h-bar-b-que barbeque 2.0 799 san-antonio-ave palo-alto
  santa-clara-county bay-area)
 (944 the-back-forty-corporation barbeque 3.7 1941 oak-park-blvd-ste-40
  pleasant-hill contra-costa-county bay-area)
 (945 pearls-bar-b-que-pit barbeque 2.7 4040 pimlico-dr pleasanton
  alameda-county bay-area)
 (946 tommys-bar-b-que barbeque 2.0 574 wellington-dr san-carlos
  san-mateo-county bay-area)
 (947 big-nates-barbeque barbeque 1.7 1665 folsom san-francisco
  san-francisco-county bay-area)
 (948 colliers-bar-b-que barbeque 2.0 1516 ocean-avenue san-francisco
  san-francisco-county bay-area)
 (949 flintroys-bar-b-q barbeque 2.0 1117 fillmore san-francisco
  san-francisco-county bay-area)
 (950 tony-romas barbeque 2.0 126 ellis san-francisco
  san-francisco-county bay-area)
 (951 family-bar-b barbeque 2.0 491 saratoga-ave san-jose
  santa-clara-county bay-area)
 (952 flos-bar-b-que barbeque 2.0 154 post-st san-jose
  santa-clara-county bay-area)
 (953 gilbertos-bar barbeque 2.0 1870 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (954 goldies-oakwood-bar-b-q barbeque 2.0 21 n-2nd-st san-jose
  santa-clara-county bay-area)
 (955 kim-tuong-bbq-restaurant barbeque 2.0 505 e-santa-clara-st
  san-jose santa-clara-county bay-area)
 (956 kiu-kee-b-b-q-dim-sum-&-chine barbeque 2.0 1688 berryessa-rd
  san-jose santa-clara-county bay-area)
 (957 mr-barbeque barbeque 2.0 1711 branham-ln-ste-a-9 san-jose
  santa-clara-county bay-area)
 (958 nigels-bar-b-q-restaurant barbeque 2.0 5230 union-ave san-jose
  santa-clara-county bay-area)
 (959 quincys-bar-b barbeque 2.0 2985 cortina-dr san-jose
  santa-clara-county bay-area)
 (960 sams-bbq barbeque 3.3 1110 s-bascom-ave san-jose
  santa-clara-county bay-area)
 (961 scott-bar-b-que barbeque 2.0 1685 four-oaks-rd san-jose
  santa-clara-county bay-area)
 (962 tesss-b-bq-diner barbeque 2.0 3309 san-felipe-rd san-jose
  santa-clara-county bay-area)
 (963 the-bbq-boys barbeque 2.0 4999 westdale-dr san-jose
  santa-clara-county bay-area)
 (964 old-south-bar-b-que barbeque 3.6 16680 e-14th-st san-leandro
  alameda-county bay-area)
 (965 tony-romas-of-norcal barbeque 2.0 420 executive-ct-n-ste-g
  suisun-city solano-county bay-area)
 (966 miramar-cafe-bbq-express barbeque 2.0 101 s-murphy-ave sunnyvale
  santa-clara-county bay-area)
 (967 mr-ds-&-sons-bbq-&-catering barbeque 3.0 1038 e-el-camino-real
  sunnyvale santa-clara-county bay-area)
 (968 t&js-southern-style-bbq barbeque 2.0 1179 w.-el-camino-real
  sunnyvale santa-clara-county bay-area)
 (969 porkys-bar-b-que barbeque 2.8 410 west-a-st hayward
  alameda-county bay-area)
 (970 emil-villas-the-original-hickry-pit barbeque 2.5 3064 pacific-ave
  livermore alameda-county bay-area)
 (971 back-forty-texas-bbq barbeque 2.0 0 unknown benicia solano-county
  bay-area)
 (972 three-cooks-barbeque barbeque 2.7 841 petaluma-blvd-n petaluma
  sonoma-county bay-area)
 (973 bbq-al-gaucho barbeque 2.0 1380 lincoln-ave san-rafael
  marin-county bay-area)
 (974 johns-catering-&-traveling-barbeque barbeque 2.0 0 unknown
  santa-rosa sonoma-county bay-area)
 (975 pack-jack-bar-b-que-inn barbeque 2.3 3963 gravenstein-highway
  sebastopol sonoma-county bay-area)
 (976 ds-bar-b-q barbeque 2.0 108 sunset-ave suisun-city solano-county
  bay-area)
 (977 lees-barbque barbeque 2.0 310 mini-dr vallejo solano-county
  bay-area)
 (978 king-charcoal-barbeque barbeque 2.0 3741 geary-blvd san-francisco
  san-francisco-county bay-area)
 (979 smile-bbq barbeque 2.0 2619 mission-st san-francisco
  san-francisco-county bay-area)
 (980 youngs-barbeque barbeque 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (981 hung-won-bbq barbeque 2.0 404 s-2nd san-jose santa-clara-county
  bay-area)
 (982 new-tung-kee barbeque 2.0 262 s-2nd san-jose santa-clara-county
  bay-area)
 (983 de-angelos barbeque 2.0 175 s-2nd san-jose santa-clara-county
  bay-area)
 (984 clays-barbeque barbeque 2.3 129 first-st benicia solano-county
  bay-area)
 (985 barley-&-hopps barbeque 3.0 201 s.-b-st san-mateo
  san-mateo-county bay-area)
 (986 emil-villas-california-bbq barbeque 1.8 0 bl. fremont
  alameda-county bay-area)
 (987 willys barbeque 3.0 0 blvd-just-north-of-thorton-ave newark
  alameda-county bay-area)
 (988 willys-smokehouse-&-bbq barbeque 2.6 0 blvd. newark
  alameda-county bay-area)
 (989 michael-ks-the-original-hickry-pit barbeque 2.0 980
  east-campell-ave campbell santa-clara-county bay-area)
 (990 heavenly-hot-restaurant barbeque 2.3 4627 geary-blvd
  san-francisco san-francisco-county bay-area)
 (991 porter-street-barbeque barbeque 2.3 500 east-cotati-ave cotati
  sonoma-county bay-area)
 (992 rib-o-licious barbeque 2.0 34751 ardenwood-blvd newark
  alameda-county bay-area)
 (993 flints-bar-b-q-take-out barbeque 2.0 0 blvd-at-165th-ave
  san-leandro alameda-county bay-area)
 (994 the-central-texan-barbeque barbeque 3.0 0 castroville castroville
  monterey-county monterey)
 (995 redneck-earls barbeque 2.3 2319 south-el-camino san-mateo
  san-mateo-county bay-area)
 (996 austins barbeque 2.5 1616 west-el-camino-real mountain-view
  santa-clara-county bay-area)
 (997 austins barbeque 2.0 1616 w.-el-camino-real mountain-view
  santa-clara-county bay-area)
 (998 le-chalet-basque basque 2.7 405 north-san-pedro-rd san-rafael
  marin-county bay-area)
 (999 bistro-alexis belgian 3.0 1345 bush-st san-francisco
  san-francisco-county bay-area)
 (1000 mixx-an-american-bistro bistro 2.8 0 unknown santa-rosa
  sonoma-county bay-area)
 (1001 solano-cellars bistro 2.3 1580 solano-ave albany alameda-county
  bay-area)
 (1002 s.f.-gourmet bistro 2.7 2128 chestnut-st san-francisco
  san-francisco-county bay-area)
 (1003 annabelles-bar-&-bistro bistro 2.7 68 fourth-st. san-francisco
  san-francisco-county bay-area)
 (1004 carta bistro 3.0 1772 market san-francisco san-francisco-county
  bay-area)
 (1005 balzac-bistro bistro 3.0 112 capitola-av capitola unknown
  bay-area)
 (1006 kincaids-bayhouse bistro 3.4 0 london-square oakland
  alameda-county bay-area)
 (1007 the-flying-boar bistro 2.0 4050 byway-east napa napa-county
  napa-valley)
 (1008 bistro-don-giovanni bistro 2.7 4110 st.-helena-highway napa
  napa-county napa-valley)
 (1009 plouf bistro 3.0 40 belden-lane san-francisco
  san-francisco-county bay-area)
 (1010 ninos brazilian 2.6 1916 martin-luther-kng-jr-way-no.b berkeley
  alameda-county bay-area)
 (1011 brazilian-fruit-basket brazilian 2.0 104 x7th san-francisco
  san-francisco-county bay-area)
 (1012 eunices-restaurante brazilian 2.0 3392 x24th san-francisco
  san-francisco-county bay-area)
 (1013 bahia-brazilian-restaurant brazilian 2.3 41 franklin-st
  san-francisco san-francisco-county bay-area)
 (1014 x385-colusa brazilian 2.3 385 colusa-avenue kensington unknown
  bay-area)
 (1015 golden-grain-bakery bread 2.0 1197 laurel-st-no.-b san-carlos
  san-mateo-county bay-area)
 (1016 chez-croissant bread 2.0 1090 n-1st-st san-jose
  santa-clara-county bay-area)
 (1017 chez-croissant bread 2.0 51 e-san-carlos-st san-jose
  santa-clara-county bay-area)
 (1018 el-rico-pan-bakery bread 2.0 231 willow-st san-jose
  santa-clara-county bay-area)
 (1019 le-cake-bakery bread 2.0 105 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (1020 lucky-7-bakery-department bread 2.0 3058 marston-way san-jose
  santa-clara-county bay-area)
 (1021 queen-bakery bread 2.0 2869 senter-rd san-jose
  santa-clara-county bay-area)
 (1022 wilsons-jewel-bakery bread 2.0 1285 homestead-rd santa-clara
  santa-clara-county bay-area)
 (1023 el-kiosko bread 2.0 0 unknown santa-cruz santa-cruz-county
  bay-area)
 (1024 the-masters-bread bread 2.7 135 n-wolfe-rd-ste-20 sunnyvale
  santa-clara-county bay-area)
 (1025 crestview-creamery-&-bakery bread 2.0 1416 freedom-blvd
  watsonville santa-cruz-county bay-area)
 (1026 la-manzana-bakery bread 2.0 1262 main-st watsonville
  santa-cruz-county bay-area)
 (1027 plaza-diner-&-bakery bread 2.0 924 e-lake-ave watsonville
  santa-cruz-county bay-area)
 (1028 oles-waffle-shop breakfast 2.4 1507 park-st alameda
  alameda-county bay-area)
 (1029 millers-cafe breakfast 2.3 7 w-20th-st antioch
  contra-costa-county bay-area)
 (1030 bakery-cafe breakfast 2.0 2787 shattuck-ave berkeley
  alameda-county bay-area)
 (1031 buttercup-bakery breakfast 2.3 3201 college-avenue berkeley
  alameda-county bay-area)
 (1032 buttercup-restaurant breakfast 2.4 3201 college-ave berkeley
  alameda-county bay-area)
 (1033 homemade-cafe breakfast 3.3 2454 sacramento-st berkeley
  alameda-county bay-area)
 (1034 intnl-house-of-pancakes breakfast 1.7 4619 clayton-rd concord
  contra-costa-county bay-area)
 (1035 country-waffles breakfast 3.0 7274 san-ramon-rd dublin
  alameda-county bay-area)
 (1036 fatapples breakfast 2.8 7525 fairmount-ave el-cerrito
  contra-costa-county bay-area)
 (1037 golden-west-pancakes breakfast 2.0 11 green-valley-rd freedom
  unknown unknown)
 (1038 golden-west-pancakes breakfast 2.0 840 pacheco-pass-hwy gilroy
  santa-clara-county bay-area)
 (1039 iron-skillet breakfast 2.0 15662 los-gatos-blvd los-gatos
  santa-clara-county bay-area)
 (1040 winks-restaurant breakfast 2.0 3835 alhambra-ave martinez
  contra-costa-county bay-area)
 (1041 kens-house-of-pancakes breakfast 2.8 888 el-camino-real
  menlo-park san-mateo-county bay-area)
 (1042 millbrae-pancake-house breakfast 2.0 1301 el-camino-real
  millbrae san-mateo-county bay-area)
 (1043 hobees breakfast 3.0 2312 central-expy mountain-view
  santa-clara-county bay-area)
 (1044 kens-house-of-pancakes breakfast 2.6 89 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (1045 cafe-of-the-bay breakfast 3.0 4011 macarthur-blvd oakland
  alameda-county bay-area)
 (1046 kwik-way breakfast 3.0 2150 telegraph-ave oakland alameda-county
  bay-area)
 (1047 monclair-eggshop breakfast 2.8 6126 medau-pl oakland
  alameda-county bay-area)
 (1048 hobees breakfast 3.7 4224 el-camino-real palo-alto
  santa-clara-county bay-area)
 (1049 hobees-stanford breakfast 2.5 67 town-&-country-vlg palo-alto
  santa-clara-county bay-area)
 (1050 country-waffles breakfast 2.0 2921 harbor-st-no.-c pittsburg
  contra-costa-county bay-area)
 (1051 golden-west-pancakes breakfast 2.0 314 el-camino-real
  redwood-city san-mateo-county bay-area)
 (1052 international-house-of-pancake breakfast 2.0 491 veterans-blvd
  redwood-city san-mateo-county bay-area)
 (1053 intnl-house-of-pancakes breakfast 2.0 326 s-airport-blvd
  south-san-francisco san-mateo-county bay-area)
 (1054 international-house-of-pancake breakfast 2.0 590 el-camino-real
  san-bruno san-mateo-county bay-area)
 (1055 seal-rock-inn-restaurant breakfast 2.8 545 point-lobos-avenue
  san-francisco san-francisco-county bay-area)
 (1056 breakfast-express breakfast 2.0 4718 meridian-ave-no.-157
  san-jose santa-clara-county bay-area)
 (1057 holders-country-inn breakfast 2.3 508 el-paseo-de-saratoga
  san-jose santa-clara-county bay-area)
 (1058 the-original-pancake-house breakfast 2.4 1366
  saratoga-sunnyvale-rd san-jose santa-clara-county bay-area)
 (1059 golden-west-pancakes breakfast 2.0 909 ocean-st santa-cruz
  santa-cruz-county bay-area)
 (1060 ristorante-avanti breakfast 3.4 1711 mission-st santa-cruz
  santa-cruz-county bay-area)
 (1061 hobees-restaurant breakfast 2.0 1078 merrimac-dr sunnyvale
  santa-clara-county bay-area)
 (1062 omelettes-&-more-coffee-shop breakfast 2.0 439 molino-ave
  sunnyvale santa-clara-county bay-area)
 (1063 village-pancake breakfast 2.0 0 unknown sunnyvale
  santa-clara-county bay-area)
 (1064 buttercup-kitchen-family-rest breakfast 2.0 3288 sonoma-blvd
  vallejo solano-county bay-area)
 (1065 country-waffles breakfast 2.0 1049 n-regatta-dr vallejo
  solano-county bay-area)
 (1066 international-pancake-house breakfast 2.0 1400 tennessee-st
  vallejo solano-county bay-area)
 (1067 the-breakfast-break breakfast 3.0 301 georgia-st-ste-a7 vallejo
  solano-county bay-area)
 (1068 golden-west-pancakes breakfast 2.0 707 freedom-blvd watsonville
  santa-cruz-county bay-area)
 (1069 bucks-restaurant breakfast 3.0 3062 woodside-rd woodside
  san-mateo-county bay-area)
 (1070 international-house-of-pancakes breakfast 2.0 6480 redwood-dr
  rohnert-park sonoma-county bay-area)
 (1071 just-breakfast breakfast 2.6 3590 homestead-rd santa-clara
  santa-clara-county bay-area)
 (1072 alberts-cafe breakfast 2.3 1541 webster-st. alameda
  alameda-county bay-area)
 (1073 golden-west-pancake-house breakfast 2.0 2380 cabrillo-hwy-s
  half-moon-bay san-mateo-county bay-area)
 (1074 the-breakfast-club breakfast 2.0 1130 fremont seaside
  monterey-county monterey)
 (1075 ods breakfast 2.3 28 martin gilroy santa-clara-county bay-area)
 (1076 doidges breakfast 3.7 2217 union-st san-francisco
  san-francisco-county bay-area)
 (1077 country-waffles breakfast 2.3 0 blvd.-at-mcfrugals watsonville
  santa-cruz-county bay-area)
 (1078 new-taravel-cafe breakfast 2.8 1054 taravel-st san-francisco
  san-francisco-county bay-area)
 (1079 tygers-coffee-shop breakfast 2.4 2798 diamond-st. san-francisco
  san-francisco-county bay-area)
 (1080 peggs-western-grill-and-bakery breakfast 3.6 3210 pacheco-blvd.
  martinez contra-costa-county bay-area)
 (1081 international-house-of-pancakes breakfast 3.6 1401
  e.-monte-vista-ave vacaville solano-county bay-area)
 (1082 gordon-biersch-brewery-restaurant brewery 2.7 625 emerson-st
  palo-alto santa-clara-county bay-area)
 (1083 faultline-brewing-company brewery 2.8 1235 oakmead-parkway
  sunnyvale santa-clara-county bay-area)
 (1084 x20-tank-brewing-company brewery 3.0 316 x11th-st san-francisco
  san-francisco-county bay-area)
 (1085 the-hopyard brewery 3.3 3015 hopyard-rd pleasanton
  alameda-county bay-area)
 (1086 petes-brass-rail-and-car-wash brewery 2.3 331 hartz-ave danville
  contra-costa-county bay-area)
 (1087 burlingame-station brewery 2.4 333 california-ave burlingame
  san-mateo-county bay-area)
 (1088 stoddards-brewhouse brewery 3.5 0 unknown sunnyvale
  santa-clara-county bay-area)
 (1089 thirsty-bear-brewing-co brewery 2.3 661 howard-st san-francisco
  san-francisco-county bay-area)
 (1090 bear-republic-brewing-co.-inc. brewery 2.0 345 healdsburg-avenue
  healdsburg sonoma-county bay-area)
 (1091 rock-bottom-brewery brewery 3.0 0 ave-pruneyard-shopping-center
  campbell santa-clara-county bay-area)
 (1092 faultline-brewing-company brewery 2.7 1536 cypress-st.
  walnut-creek contra-costa-county bay-area)
 (1093 brittania-arms---cupertino british 2.5 1087
  saratoga-sunnyvale-rd cupertino santa-clara-county bay-area)
 (1094 duke-of-edinburgh british 3.2 10801 n-wolfe-rd cupertino
  santa-clara-county bay-area)
 (1095 bear-republic-brewing-co.-inc. british 2.0 345 healdsburg-avenue
  healdsburg sonoma-county bay-area)
 (1096 toll-house-hotel brunch 2.7 240 s.-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (1097 cafe-florian brunch 2.7 1221 chess-dr. foster-city
  san-mateo-county bay-area)
 (1098 hop-sings-buffet buffet 2.2 3191 crow-canyon-rd-no.-d san-ramon
  contra-costa-county bay-area)
 (1099 home-town-buffet buffet 3.0 0 and-hillsdale san-jose
  santa-clara-county bay-area)
 (1100 maxis-red-lion-inn buffet 3.0 2050 gateway-place san-jose
  santa-clara-county bay-area)
 (1101 hong-kong-express buffet 2.3 4555 hopyard-rd.-no.5 pleasanton
  alameda-county bay-area)
 (1102 country-harvest-buffet buffet 1.7 4067 fremont-hub fremont
  alameda-county bay-area)
 (1103 bobs-bulgarian-beefsteak-and-bbq bulgarian 2.4 3515 midvale-ave
  oakland alameda-county bay-area)
 (1104 fentons burgers 2.0 2327 central-ave alameda alameda-county
  bay-area)
 (1105 martis-place burgers 2.0 1829 central-ave alameda alameda-county
  bay-area)
 (1106 the-burger-orchard burgers 2.3 3211 encinal-ave-no.-a alameda
  alameda-county bay-area)
 (1107 wonder-burger burgers 2.0 2406 santa-clara-ave alameda
  alameda-county bay-area)
 (1108 als-big-burger burgers 3.0 437 san-pablo-ave albany
  alameda-county bay-area)
 (1109 burger-depot burgers 1.7 1116 solano-ave albany alameda-county
  bay-area)
 (1110 caspers-hot-dogs burgers 2.0 545 san-pablo-ave albany
  alameda-county bay-area)
 (1111 als-giant-burger burgers 2.0 2309 buchanan-rd antioch
  contra-costa-county bay-area)
 (1112 dairy-queen-no.-41 burgers 2.0 607 e-18th-st antioch
  contra-costa-county bay-area)
 (1113 happy-burger burgers 2.0 1115 e-18th-st antioch
  contra-costa-county bay-area)
 (1114 hazels-drive-in burgers 2.7 1820 w-10th-st antioch
  contra-costa-county bay-area)
 (1115 hot-dogs-etc-of-antioch burgers 2.0 2767 lone-tree-way antioch
  contra-costa-county bay-area)
 (1116 chubbys-168 burgers 2.0 489 mizner-ct benicia solano-county
  bay-area)
 (1117 foster-freeze burgers 2.0 90 solano-sq benicia solano-county
  bay-area)
 (1118 nations-giant-hamburgers burgers 2.0 191 military-e benicia
  solano-county bay-area)
 (1119 bongo-burger burgers 3.6 2505 dwight-way berkeley alameda-county
  bay-area)
 (1120 bongo-burger burgers 3.6 1839 euclid-ave berkeley alameda-county
  bay-area)
 (1121 golden-bear-hamburger burgers 2.8 2519 durant-ave-ste-a berkeley
  alameda-county bay-area)
 (1122 hot-dog-heaven burgers 2.0 2109 bancroft-way berkeley
  alameda-county bay-area)
 (1123 richs-bulky-burger burgers 2.0 1775 san-pablo-ave berkeley
  alameda-county bay-area)
 (1124 the-patti-melt-&-bar-b-q-plus burgers 2.0 1350 peralta-ave
  berkeley alameda-county bay-area)
 (1125 top-dog burgers 3.5 2534 durant-ave berkeley alameda-county
  bay-area)
 (1126 top-dog burgers 3.0 2503 hearst-ave berkeley alameda-county
  bay-area)
 (1127 twin-castle-drive-in burgers 2.0 3020 san-pablo-ave berkeley
  alameda-county bay-area)
 (1128 quarter-lb-big-burger burgers 1.7 8010 brentwood-blvd brentwood
  contra-costa-county bay-area)
 (1129 vals-burgers burgers 3.8 20632 redwood-rd-no.-b castro-valley
  alameda-county bay-area)
 (1130 wendys-old-fashion-hamburgers burgers 2.0 2475
  castro-valley-blvd castro-valley alameda-county bay-area)
 (1131 best-burgers burgers 2.7 1991 monument-blvd-no.-a concord
  contra-costa-county bay-area)
 (1132 dogs-on-the-bun burgers 2.0 3541 dumbarton-st concord
  contra-costa-county bay-area)
 (1133 fatts burgers 2.0 3498 clayton-rd concord contra-costa-county
  bay-area)
 (1134 fuddruckers-restaurant burgers 2.0 1975 diamond-blvd-ste-e260
  concord contra-costa-county bay-area)
 (1135 goldies-giant-hamburgers burgers 2.0 2151 salvio-st-ste-i
  concord contra-costa-county bay-area)
 (1136 hannahs-hot-dogs-etc burgers 2.0 1895 farm-bureau-rd-ste-b
  concord contra-costa-county bay-area)
 (1137 juniors-ultimate-burgers-&-dog burgers 2.0 705 citrus-ave
  concord contra-costa-county bay-area)
 (1138 maxi-burger burgers 2.0 2699 monument-blvd-ste-c concord
  contra-costa-county bay-area)
 (1139 nations-giant-hamburger burgers 2.0 785 oak-grove-rd concord
  contra-costa-county bay-area)
 (1140 red-robin-international-inc burgers 2.0 404
  sun-valley-mall-no.-a concord contra-costa-county bay-area)
 (1141 wendys-old-fashioned-hamburge burgers 2.0 1551 monument-blvd
  concord contra-costa-county bay-area)
 (1142 a-&-w-root-beer burgers 2.0 898 john-daly-blvd daly-city
  san-mateo-county bay-area)
 (1143 blazing-burgers burgers 2.0 836 southgate-ave daly-city
  san-mateo-county bay-area)
 (1144 yes-burger-&-malts burgers 2.0 1141 x87th-st daly-city
  san-mateo-county bay-area)
 (1145 caspers-hot-dogs burgers 2.3 6998 village-pky dublin
  alameda-county bay-area)
 (1146 red-robin-burger-&-spirits-emp burgers 2.0 6400 village-pky
  dublin alameda-county bay-area)
 (1147 chubbys burgers 2.0 195 el-cerrito-plz el-cerrito
  contra-costa-county bay-area)
 (1148 el-patio-chuckburger burgers 2.0 10682 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (1149 nations burgers 2.0 1437 kearney-st el-cerrito
  contra-costa-county bay-area)
 (1150 nations-giant-hamburgers burgers 2.0 11090 san-pablo-ave-ste-200
  el-cerrito contra-costa-county bay-area)
 (1151 nations-giant-hamburgers burgers 3.1 6060 central-ave el-cerrito
  contra-costa-county bay-area)
 (1152 nations-giant-hamburgers-no burgers 2.8 11090 san-pablo-ave
  el-cerrito contra-costa-county bay-area)
 (1153 wienerschnitzel burgers 2.0 11101 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (1154 bay-burger burgers 2.0 5800 shellmound-st emeryville
  alameda-county bay-area)
 (1155 doggie-diner-inc burgers 2.0 3801 san-pablo-ave emeryville
  alameda-county bay-area)
 (1156 churchs-fried-chicken burgers 2.0 2370 n-texas-st fairfield
  solano-county bay-area)
 (1157 daves-giant-hamburger burgers 2.0 1055 n-texas-st fairfield
  solano-county bay-area)
 (1158 hamburger-yous burgers 2.0 1161 x1st-st fairfield solano-county
  bay-area)
 (1159 johannes-hot-dogs burgers 2.0 1708 w-texas-st fairfield
  solano-county bay-area)
 (1160 nations burgers 2.0 955 w-texas-st fairfield solano-county
  bay-area)
 (1161 wendys-old-fashion-hamburgers burgers 2.0 2045 n-texas-st
  fairfield solano-county bay-area)
 (1162 wendys burgers 2.0 4447 central-pl fairfield solano-county
  bay-area)
 (1163 a-&-w-felton burgers 2.0 6112 highway-9 felton unknown bay-area)
 (1164 bobs-giant-burgers burgers 3.3 40720 fremont-blvd fremont
  alameda-county bay-area)
 (1165 burger-hub burgers 1.7 39150 argonaut-way fremont alameda-county
  bay-area)
 (1166 chubby-burger-&-freeze burgers 2.3 4796 thornton-ave fremont
  alameda-county bay-area)
 (1167 crazy-bunz burgers 2.0 0 x4101-egger-dr-no.-3 fremont
  alameda-county bay-area)
 (1168 harris-hotdogs burgers 2.0 4294 tiburon-dr fremont
  alameda-county bay-area)
 (1169 kaspers-hot-dogs burgers 2.0 39020 argonaut-way fremont
  alameda-county bay-area)
 (1170 mikes-hot-dogs burgers 2.0 34860 busby-way fremont
  alameda-county bay-area)
 (1171 mission-burger burgers 2.0 135 anza-st fremont alameda-county
  bay-area)
 (1172 nations burgers 2.8 39180 fremont-blvd fremont alameda-county
  bay-area)
 (1173 niles-burgers burgers 2.0 36149 niles-blvd fremont
  alameda-county bay-area)
 (1174 popeyes-famous-fried-chicken/b burgers 2.0 39350
  center-dr-no.135 fremont alameda-county bay-area)
 (1175 reza-hot-dog burgers 2.0 420 whitney-pl fremont alameda-county
  bay-area)
 (1176 reza-hot-dog burgers 2.0 4873 ridgewood-dr fremont
  alameda-county bay-area)
 (1177 reza-hot-dog burgers 2.0 4873 ridgewood-dr fremont
  alameda-county bay-area)
 (1178 waynes-burger-house burgers 2.0 39170 state-st fremont
  alameda-county bay-area)
 (1179 weinerschnitzel burgers 2.0 37119 fremont-blvd fremont
  alameda-county bay-area)
 (1180 weinerschnitzel burgers 2.0 40112 san-carlos-pl fremont
  alameda-county bay-area)
 (1181 weinerschnitzel burgers 2.0 34480 fremont-blvd fremont
  alameda-county bay-area)
 (1182 wendys-old-fashn-hamburgers burgers 2.0 39175 blacow-rd fremont
  alameda-county bay-area)
 (1183 western-hotdog burgers 2.0 36163 fremont-blvd-apt-28 fremont
  alameda-county bay-area)
 (1184 western-super-burger burgers 2.0 33909 shylock-dr fremont
  alameda-county bay-area)
 (1185 baha-ranch-burger burgers 2.0 10 w-7th-st gilroy
  santa-clara-county bay-area)
 (1186 best-burgers burgers 2.3 915 x1st-st gilroy santa-clara-county
  bay-area)
 (1187 aggies-hot-dogs burgers 2.0 19600 hesperian-blvd hayward
  alameda-county bay-area)
 (1188 best-burger burgers 2.0 251 a-st hayward alameda-county
  bay-area)
 (1189 burger-road burgers 2.0 2010 american-ave hayward alameda-county
  bay-area)
 (1190 caesars-chicken burgers 3.0 19450 hesperian-blvd hayward
  alameda-county bay-area)
 (1191 caspers-hot-dogs burgers 2.5 21670 foothill-blvd hayward
  alameda-county bay-area)
 (1192 caspers-hot-dogs burgers 2.4 951 c-st hayward alameda-county
  bay-area)
 (1193 cesares-chicken burgers 2.3 510 w-tennyson-rd hayward
  alameda-county bay-area)
 (1194 chubby-jr-burgers burgers 2.7 32513 mission-blvd hayward
  alameda-county bay-area)
 (1195 happy-dogs burgers 2.0 27343 industrial-blvd hayward
  alameda-county bay-area)
 (1196 jrs-hot-dogs burgers 2.0 27560 tampa-ave hayward alameda-county
  bay-area)
 (1197 kaspers-hot-dogs burgers 2.3 24020 hesperian-blvd hayward
  alameda-county bay-area)
 (1198 old-fashioned-burger burgers 2.0 24919 mission-blvd hayward
  alameda-county bay-area)
 (1199 quik-bite-fish-&-chips-hamburg burgers 2.0 1235 a-st hayward
  alameda-county bay-area)
 (1200 vals-burgers burgers 3.6 2115 kelly-st. hayward alameda-county
  bay-area)
 (1201 wendys-old-fashion-hamburgers burgers 2.0 23969 mission-blvd
  hayward alameda-county bay-area)
 (1202 burgerama burgers 2.0 1581 sycamore-ave-ste-8 hercules
  contra-costa-county bay-area)
 (1203 baha-ranch-burgers burgers 2.0 900 x4th-st hollister
  san-benito-county northern-california)
 (1204 caspers-hot-dogs burgers 2.0 3508 mount-diablo-blvd-ste-j
  lafayette contra-costa-county bay-area)
 (1205 caspers-hot-dogs burgers 2.0 3508 mount-diablo-blvd-no.-j
  lafayette contra-costa-county bay-area)
 (1206 bens-burgers burgers 3.3 777 rincon-ave livermore alameda-county
  bay-area)
 (1207 freddies-franks-&-more burgers 2.0 863 e-stanley-blvd livermore
  alameda-county bay-area)
 (1208 johns-char-burger burgers 2.7 2617 first-st livermore
  alameda-county bay-area)
 (1209 wienerschnitzel burgers 2.8 323 s-livermore-ave livermore
  alameda-county bay-area)
 (1210 yes-burgers-&-malts-valley-fair burgers 2.0 235
  mount-hamilton-ave los-altos santa-clara-county bay-area)
 (1211 classic-burgers-of-los-gatos burgers 2.7 15737 los-gatos-blvd
  los-gatos santa-clara-county bay-area)
 (1212 happy-hound burgers 3.5 15899 los-gatos-blvd los-gatos
  santa-clara-county bay-area)
 (1213 quarter-lb-big-burger burgers 2.0 3792 pacheco-blvd martinez
  contra-costa-county bay-area)
 (1214 vickis-hot-dogs burgers 2.0 925 main-st martinez
  contra-costa-county bay-area)
 (1215 wendys burgers 2.0 3455 alhambra-ave martinez
  contra-costa-county bay-area)
 (1216 a-&-w-root-beer burgers 1.7 1246 el-camino-real menlo-park
  san-mateo-county bay-area)
 (1217 a-&-w-root-beer burgers 2.0 180 constitution-dr-ste-3 menlo-park
  san-mateo-county bay-area)
 (1218 chilis-hamburger-grill-&-bar burgers 2.3 2560 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (1219 babes-burger-&-franks burgers 2.0 1115 walnut-st-apt-15 napa
  napa-county napa-valley)
 (1220 big-d-burgers burgers 2.0 1005 silverado-trl napa napa-county
  napa-valley)
 (1221 nations-giant-hamburgers burgers 2.0 1441 x3rd-st napa
  napa-county napa-valley)
 (1222 sandys-happy-hot-dog burgers 2.0 181 kaanapali-dr napa
  napa-county napa-valley)
 (1223 wendys-old-fashion-hamburgers burgers 2.0 1450 trancas-st napa
  napa-county napa-valley)
 (1224 bills-place burgers 2.0 36601 newark-blvd-no.-87 newark
  alameda-county bay-area)
 (1225 bobs-giant-burgers burgers 2.0 5454 central-ave newark
  alameda-county bay-area)
 (1226 bobs-giant-burgers burgers 2.0 5600 central-ave newark
  alameda-county bay-area)
 (1227 dairy-queen-orange-julius burgers 2.0 2084 newpark-mall newark
  alameda-county bay-area)
 (1228 giant-hamburgers-no burgers 2.0 6950 thornton-ave newark
  alameda-county bay-area)
 (1229 kaspers-hot-dogs burgers 3.8 5450 newpark-plz newark
  alameda-county bay-area)
 (1230 original-hamburger-stand burgers 2.0 35193 newark-blvd newark
  alameda-county bay-area)
 (1231 red-robin-burger-&-spirits-emp burgers 2.0 1031 newpark-mall
  newark alameda-county bay-area)
 (1232 the-great-hot-dog-experience burgers 2.0 2078 newpark-mall
  newark alameda-county bay-area)
 (1233 quarter-pound-giant-burger burgers 2.0 5325 san-pablo-ave oakland
  alameda-county bay-area)
 (1234 quarter-pound-giant-burger burgers 2.0 4215 macarthur-blvd oakland
  alameda-county bay-area)
 (1235 quarter-pound-giant-burgers burgers 2.7 2055 macarthur-blvd oakland
  alameda-county bay-area)
 (1236 quarter-pound-giant-burgers burgers 2.0 8040 e-14th-st oakland
  alameda-county bay-area)
 (1237 adams-burger burgers 2.0 3401 lakeshore-ave oakland
  alameda-county bay-area)
 (1238 ahns-quarter-pound-burger burgers 1.7 439 grand-ave oakland
  alameda-county bay-area)
 (1239 bill-&-joes-burgers burgers 2.0 4610 e-14th-st oakland
  alameda-county bay-area)
 (1240 caspers-hot-dogs burgers 2.0 1240 x1st-ave oakland
  alameda-county bay-area)
 (1241 chucks-quarter-lb-burger burgers 2.0 10555 e-14th-st oakland
  alameda-county bay-area)
 (1242 colonel-mustards burgers 2.0 3208 grand-ave oakland
  alameda-county bay-area)
 (1243 crazy-bunz burgers 2.0 7200 san-leandro-st oakland
  alameda-county bay-area)
 (1244 fatz burgers 2.3 6476 moraga-ave oakland alameda-county
  bay-area)
 (1245 flippers-gormet-burgers burgers 2.3 2060 mountain-blvd. oakland
  alameda-county bay-area)
 (1246 glenns-hotdog burgers 2.0 3506 macarthur-blvd oakland
  alameda-county bay-area)
 (1247 grand-burger burgers 2.0 949 w-grand-ave oakland alameda-county
  bay-area)
 (1248 hamburger-dave burgers 2.0 3764 piedmont-ave oakland
  alameda-county bay-area)
 (1249 happy-dog burgers 2.0 10601 macarthur-blvd oakland
  alameda-county bay-area)
 (1250 hegenburgers burgers 2.0 280 hegenberger-rd oakland
  alameda-county bay-area)
 (1251 js-hamburger-&-taco-zamorano burgers 2.0 4063 piedmont-ave
  oakland alameda-county bay-area)
 (1252 jimbos-burger-house burgers 2.0 400 x15th-st oakland
  alameda-county bay-area)
 (1253 jims-drive-in burgers 2.0 3000 san-pablo-ave oakland
  alameda-county bay-area)
 (1254 kirk-fresh-hot-dogs burgers 2.0 6101 laird-ave oakland
  alameda-county bay-area)
 (1255 kwik-way burgers 2.0 500 lake-park-ave oakland alameda-county
  bay-area)
 (1256 kwik-way burgers 2.0 6215 e-14th-st oakland alameda-county
  bay-area)
 (1257 mels-pancake-&-burger burgers 2.0 3400 fruitvale-ave oakland
  alameda-county bay-area)
 (1258 number-one-burgers burgers 2.0 5600 martin-luther-king-jr-way
  oakland alameda-county bay-area)
 (1259 pfc-fast-food burgers 2.0 402 x15th-st oakland alameda-county
  bay-area)
 (1260 pioneer-chicken burgers 2.0 898 w-grand-ave oakland
  alameda-county bay-area)
 (1261 scooters-chicago-style-hot-dog burgers 2.0 5925 college-ave
  oakland alameda-county bay-area)
 (1262 sparkys-giant-burger burgers 2.0 4120 redwood-rd oakland
  alameda-county bay-area)
 (1263 star-dogs burgers 2.0 260 eastmont-mall oakland alameda-county
  bay-area)
 (1264 the-grand-dog-of-oakland burgers 2.0 3512 grand-ave oakland
  alameda-county bay-area)
 (1265 the-original-kaspers-hot-dogs burgers 3.0 4521 telegraph-ave
  oakland alameda-county bay-area)
 (1266 top-dog burgers 2.0 5100 broadway oakland alameda-county
  bay-area)
 (1267 top-dog burgers 2.7 6114 la-salle-ave oakland alameda-county
  bay-area)
 (1268 wendys-old-fashion-hamburgers burgers 2.0 5211 broadway oakland
  alameda-county bay-area)
 (1269 wendys-old-fashioned-hamburge burgers 2.0 3111 e-14th-st oakland
  alameda-county bay-area)
 (1270 wendys-old-fashioned-hamburge burgers 2.0 1500 broadway oakland
  alameda-county bay-area)
 (1271 wendys-old-fashioned-hamburger burgers 2.0 363 thirteen-st
  oakland alameda-county bay-area)
 (1272 nations-giant-hamburgers burgers 2.0 76 moraga-way orinda
  contra-costa-county bay-area)
 (1273 wendys-old-fashioned-hamburge burgers 2.0 5943 pacheco-blvd
  pacheco unknown unknown)
 (1274 blackies-hamburger-fried-chicken burgers 2.0 600 tennent-ave
  pinole contra-costa-county bay-area)
 (1275 the-hot-dog-station burgers 2.0 1520 fitzgerald-dr-no.-a pinole
  contra-costa-county bay-area)
 (1276 wendys burgers 2.0 1281 page-ct pinole contra-costa-county
  bay-area)
 (1277 bens-burgers burgers 2.0 2775 willow-pass-rd pittsburg
  contra-costa-county bay-area)
 (1278 happy-burger burgers 2.0 3350 loveridge-rd pittsburg
  contra-costa-county bay-area)
 (1279 original-hamburger-stand burgers 2.0 2285 railroad pittsburg
  contra-costa-county bay-area)
 (1280 speedee-burger burgers 2.0 114 army-st pittsburg
  contra-costa-county bay-area)
 (1281 west-coast-super-hot-dog burgers 2.0 16 buena-vis pittsburg
  contra-costa-county bay-area)
 (1282 burger-road burgers 2.0 1625 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (1283 caspers-hot-dogs burgers 3.0 6 vivian-dr pleasant-hill
  contra-costa-county bay-area)
 (1284 giant-chef-burgers burgers 3.0 10 golf-club-rd pleasant-hill
  contra-costa-county bay-area)
 (1285 lisas-house-of-hot-dogs-no burgers 2.0 240 golf-club-rd
  pleasant-hill contra-costa-county bay-area)
 (1286 nations-giant-hamburger burgers 3.5 2195 contra-costa-blvd
  pleasant-hill contra-costa-county bay-area)
 (1287 oscars burgers 2.0 502 wilbur-dr pleasant-hill
  contra-costa-county bay-area)
 (1288 sacs-tasty-hot-dogs burgers 2.0 2021 mohawk-dr pleasant-hill
  contra-costa-county bay-area)
 (1289 stoinas-fast-food burgers 2.0 5 saint-lawrence-ct pleasant-hill
  contra-costa-county bay-area)
 (1290 wendys-old-fashioned-hamburge burgers 2.0 399
  taylor-blvd-ste-103 pleasant-hill contra-costa-county bay-area)
 (1291 bobs-giant-burgers burgers 2.0 4223 x1st-st pleasanton
  alameda-county bay-area)
 (1292 rings-super-burgers burgers 2.3 6654 koll-center-pky-ste-300
  pleasanton alameda-county bay-area)
 (1293 wienerschnitzel burgers 2.3 5681 gibraltar-dr pleasanton
  alameda-county bay-area)
 (1294 a-&-w-root-beer burgers 2.0 1280 el-camino-real redwood-city
  san-mateo-county bay-area)
 (1295 city-pub burgers 3.2 2620 broadway redwood-city san-mateo-county
  bay-area)
 (1296 berns-house-of-chicken-and-fis burgers 2.0 339 s-50th-st
  richmond contra-costa-county bay-area)
 (1297 bobs-bakery-&-fast-food burgers 2.0 1801 cutting-blvd richmond
  contra-costa-county bay-area)
 (1298 cafe-annie burgers 2.7 130 washington-ave richmond
  contra-costa-county bay-area)
 (1299 caspers-hot-dogs burgers 2.0 2530 macdonald-ave richmond
  contra-costa-county bay-area)
 (1300 giant-hamburgers-no burgers 2.0 1100 x23rd-st richmond
  contra-costa-county bay-area)
 (1301 great-america-hamburger burgers 2.7 35 e-richmond-ave richmond
  contra-costa-county bay-area)
 (1302 popeyes-famous-fried burgers 2.0 1000 nevin-ave richmond
  contra-costa-county bay-area)
 (1303 tinker-bells-hot-dogs burgers 2.0 2925 mcbryde-ave richmond
  contra-costa-county bay-area)
 (1304 wendys-old-fashion-hamburgers burgers 2.0 12201 san-pablo-ave
  richmond contra-costa-county bay-area)
 (1305 ds-giant-burgers burgers 2.0 358 parker-ave rodeo unknown
  unknown)
 (1306 flippys-burger-villa burgers 2.0 240 parker-ave rodeo unknown
  unknown)
 (1307 red-robin-international burgers 2.7 1274 el-camino-real
  san-bruno san-mateo-county bay-area)
 (1308 wendys burgers 2.0 499 el-camino-real san-bruno san-mateo-county
  bay-area)
 (1309 bills-place burgers 3.4 2315 clement san-francisco
  san-francisco-county bay-area)
 (1310 hot-n-hunky burgers 3.2 4039 x18th san-francisco
  san-francisco-county bay-area)
 (1311 johnny-rockets burgers 2.8 2201 chestnut-st san-francisco
  san-francisco-county bay-area)
 (1312 sliders-diner burgers 2.3 1204 sutter san-francisco
  san-francisco-county bay-area)
 (1313 sliders-diner burgers 1.7 449 castro san-francisco
  san-francisco-county bay-area)
 (1314 whats-your-beef burgers 2.0 759 columbus-avenue san-francisco
  san-francisco-county bay-area)
 (1315 burger-bar burgers 2.0 1101 s-1st-st san-jose santa-clara-county
  bay-area)
 (1316 burger-barn burgers 2.0 2485 forest-ave san-jose
  santa-clara-county bay-area)
 (1317 burger-pit burgers 2.0 1349 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (1318 burger-pit burgers 2.0 2402 forest-ave san-jose
  santa-clara-county bay-area)
 (1319 burger-pit burgers 2.0 2402 forest-ave san-jose
  santa-clara-county bay-area)
 (1320 burger-pit-steak-house burgers 2.0 120 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (1321 california-burger burgers 2.0 1116 foxhurst-way san-jose
  santa-clara-county bay-area)
 (1322 carls burgers 2.0 2 n-jackson-ave san-jose santa-clara-county
  bay-area)
 (1323 carls burgers 2.0 1690 tully-rd san-jose santa-clara-county
  bay-area)
 (1324 carls burgers 2.0 2551 n-1st-st san-jose santa-clara-county
  bay-area)
 (1325 carls burgers 2.0 1689 n-capitol-ave san-jose santa-clara-county
  bay-area)
 (1326 chilis-hamburger-grill-&-bar burgers 2.6 5650 almaden-expy
  san-jose santa-clara-county bay-area)
 (1327 chuck-e-cheeses burgers 2.0 2445 fontaine-rd san-jose
  santa-clara-county bay-area)
 (1328 foxy-burger-bar burgers 2.0 1401 foxworthy-ave san-jose
  santa-clara-county bay-area)
 (1329 georges-burger burgers 2.0 879 coleman-ave san-jose
  santa-clara-county bay-area)
 (1330 hamburger-marys burgers 2.6 170 w-saint-john-st san-jose
  santa-clara-county bay-area)
 (1331 juicy-burger burgers 2.0 1127 queensbridge-way san-jose
  santa-clara-county bay-area)
 (1332 juicy-burger burgers 2.0 1597 meridian-ave-no.-d san-jose
  santa-clara-county bay-area)
 (1333 lees-big-burger burgers 2.0 980 s-king-rd san-jose
  santa-clara-county bay-area)
 (1334 sams-burger-bar burgers 2.0 41 s-jackson-ave san-jose
  santa-clara-county bay-area)
 (1335 t-burger-pit burgers 2.0 3015 union-ave san-jose
  santa-clara-county bay-area)
 (1336 the-burger-house burgers 2.0 388 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (1337 wendys burgers 2.0 1405 monterey-hwy san-jose santa-clara-county
  bay-area)
 (1338 wendys burgers 2.0 1845 e-capitol-expy san-jose
  santa-clara-county bay-area)
 (1339 wendys burgers 2.0 2624 s-bascom-ave san-jose santa-clara-county
  bay-area)
 (1340 wendys burgers 2.0 782 s-bascom-ave san-jose santa-clara-county
  bay-area)
 (1341 best-burgers burgers 2.7 14393 washington-ave-ste-j san-leandro
  alameda-county bay-area)
 (1342 curb-dogz burgers 2.0 14345 acacia-st san-leandro alameda-county
  bay-area)
 (1343 frankies-hot-dogs burgers 2.0 16392 e-14th-st san-leandro
  alameda-county bay-area)
 (1344 jerrys-beefburgers burgers 2.8 560 macarthur-blvd san-leandro
  alameda-county bay-area)
 (1345 nations burgers 2.8 1335 washington-ave san-leandro
  alameda-county bay-area)
 (1346 olympic-burgers burgers 2.0 15025 hesperian-blvd san-leandro
  alameda-county bay-area)
 (1347 olympic-burgers burgers 3.0 15021 hesperian-blvd-ste-4
  san-leandro alameda-county bay-area)
 (1348 red-robin-burger-&-spirits-emp burgers 2.3 140 bay-fair-mall
  san-leandro alameda-county bay-area)
 (1349 sams-drive-thru burgers 2.0 501 e-14th-st san-leandro
  alameda-county bay-area)
 (1350 star-hot-dog burgers 2.0 15941 marcella-st-apt-14 san-leandro
  alameda-county bay-area)
 (1351 super-burger burgers 2.0 14988 farnsworth-st san-leandro
  alameda-county bay-area)
 (1352 wendy burgers 2.0 1133 san-leandro-blvd san-leandro
  alameda-county bay-area)
 (1353 wendys-hamburgers burgers 2.0 1133 san-leandro-blvd san-leandro
  alameda-county bay-area)
 (1354 wendys-old-fashioned-hamburge burgers 2.0 1133 san-leandro-blvd
  san-leandro alameda-county bay-area)
 (1355 wendys-old-fashioned-hamburge burgers 2.0 1133 san-leandro-blvd
  san-leandro alameda-county bay-area)
 (1356 wendys-restaurant burgers 2.0 1133 san-leandro-blvd san-leandro
  alameda-county bay-area)
 (1357 burger-town burgers 2.0 5 e-lewelling-blvd san-lorenzo
  alameda-county bay-area)
 (1358 classic-burger burgers 2.7 15927 hesperian-blvd san-lorenzo
  alameda-county bay-area)
 (1359 doggie-diner burgers 2.0 15600 hesperian-blvd san-lorenzo
  alameda-county bay-area)
 (1360 jeanies-weenies burgers 2.0 15607 dermody-ave san-lorenzo
  alameda-county bay-area)
 (1361 pahmir-hot-dog-company burgers 2.0 868 elgin-st san-lorenzo
  alameda-county bay-area)
 (1362 popeyes-famous-fried burgers 2.0 17555 hesperian-blvd
  san-lorenzo alameda-county bay-area)
 (1363 sams-drive-thru burgers 2.0 18401 hesperian-blvd san-lorenzo
  alameda-county bay-area)
 (1364 wendys-old-fashioned-hamburge burgers 2.0 17435 hesperian-blvd
  san-lorenzo alameda-county bay-area)
 (1365 western-super-burger burgers 2.0 15600 hesperian-blvd
  san-lorenzo alameda-county bay-area)
 (1366 prince-of-wales burgers 3.4 106 e-25th-ave san-mateo
  san-mateo-county bay-area)
 (1367 taxi burgers 2.0 2700 s-el-camino-real san-mateo
  san-mateo-county bay-area)
 (1368 taxis-hamburgers burgers 2.9 2700 s-el-camino-real san-mateo
  san-mateo-county bay-area)
 (1369 caspers-hot-dogs burgers 2.0 14417 san-pablo-ave san-pablo
  contra-costa-county bay-area)
 (1370 frank-dogs burgers 2.0 16368 san-pablo-ave san-pablo
  contra-costa-county bay-area)
 (1371 giant-hamburgers-no burgers 2.0 13296 san-pablo-ave san-pablo
  contra-costa-county bay-area)
 (1372 handy-dandy-drive-inn burgers 2.0 1789 rumrill-blvd san-pablo
  contra-costa-county bay-area)
 (1373 wienerschnitzel-no-443 burgers 2.0 14260 san-pablo-ave san-pablo
  contra-costa-county bay-area)
 (1374 the-hot-dog-spot-plus burgers 2.0 1061 marketplace san-ramon
  contra-costa-county bay-area)
 (1375 carls burgers 2.0 270 saratoga-ave santa-clara
  santa-clara-county bay-area)
 (1376 carls burgers 2.0 2900 bowers-ave santa-clara santa-clara-county
  bay-area)
 (1377 happy-burger burgers 2.0 2333 el-camino-real santa-clara
  santa-clara-county bay-area)
 (1378 juicy-burger burgers 2.7 2725 el-camino-real-no.-102 santa-clara
  santa-clara-county bay-area)
 (1379 wendys burgers 2.0 2240 el-camino-real santa-clara
  santa-clara-county bay-area)
 (1380 a-&-w-root-beer burgers 2.8 902 ocean-st santa-cruz
  santa-cruz-county bay-area)
 (1381 jacks-hamburgers burgers 2.3 202 lincoln-st santa-cruz
  santa-cruz-county bay-area)
 (1382 manoffs-rancho-burger burgers 2.0 139 water-st santa-cruz
  santa-cruz-county bay-area)
 (1383 wendys burgers 2.0 5620 scotts-valley-dr scotts-valley unknown
  bay-area)
 (1384 a-&-w-root-beer burgers 2.0 680 timberpine-ave sunnyvale
  santa-clara-county bay-area)
 (1385 wendys burgers 2.0 485 n-mathilda-ave sunnyvale
  santa-clara-county bay-area)
 (1386 wendys burgers 2.0 1313 s-wolfe-rd sunnyvale santa-clara-county
  bay-area)
 (1387 docs-super-hot-dog burgers 2.0 31847 alvarado-blvd union-city
  alameda-county bay-area)
 (1388 kaspers-hot-dogs burgers 2.0 34672 alvarado-niles-rd union-city
  alameda-county bay-area)
 (1389 buds-burgers burgers 2.7 3849 sonoma-blvd vallejo solano-county
  bay-area)
 (1390 chicken-express burgers 2.0 1075 redwood-st vallejo
  solano-county bay-area)
 (1391 churchs-fried-chicken burgers 2.0 1920 solano-ave vallejo
  solano-county bay-area)
 (1392 nations burgers 2.0 2525 sonoma-blvd vallejo solano-county
  bay-area)
 (1393 new-buds-burgers burgers 2.0 117 maritime-academy-dr vallejo
  solano-county bay-area)
 (1394 plutos-hot-dogs burgers 2.3 529 broadway vallejo solano-county
  bay-area)
 (1395 popeyes-famous-fried-chicken burgers 2.0 1601 marine-world-pky
  vallejo solano-county bay-area)
 (1396 wendys-of-vacaville burgers 2.0 1400 springs-rd vallejo
  solano-county bay-area)
 (1397 wendys-old-fashion-hamburgers burgers 2.0 1001 redwood-st
  vallejo solano-county bay-area)
 (1398 caspers-hot-dogs burgers 2.0 1280 newell-ave-no.-a walnut-creek
  contra-costa-county bay-area)
 (1399 evies-hamburger burgers 1.7 2861 ygnacio-valley-rd walnut-creek
  contra-costa-county bay-area)
 (1400 georges-giant-hamburger burgers 3.0 1491 newell-ave walnut-creek
  contra-costa-county bay-area)
 (1401 sues-house-of-hot-dogs burgers 2.0 2270 oak-grove-rd
  walnut-creek contra-costa-county bay-area)
 (1402 wendys-old-fashion-hamburgers burgers 2.0 2955 n-main-st
  walnut-creek contra-costa-county bay-area)
 (1403 wendys burgers 2.0 1480 freedom-blvd watsonville
  santa-cruz-county bay-area)
 (1404 super-hot-dog burgers 2.0 500 pamela-dr west-pittsburg
  contra-costa-county bay-area)
 (1405 dees-giant-hamburgers burgers 2.0 635 x1st-st benicia
  solano-county bay-area)
 (1406 landmark-hamburger-stand burgers 2.0 6630 milk-farm-rd dixon
  solano-county bay-area)
 (1407 jolly-giant-burgers burgers 2.0 2808 barton-pl fairfield
  solano-county bay-area)
 (1408 nations-giant-hamburgers burgers 2.0 1441 x3rd-st napa
  napa-county napa-valley)
 (1409 sugar-loaf-burger-shack burgers 2.0 5100 knoxville-rd napa
  napa-county napa-valley)
 (1410 perrys-burgers burgers 2.7 139 petaluma-boulevard petaluma
  sonoma-county bay-area)
 (1411 better-burgers-&-ribs burgers 2.0 1475 southwest-blvd
  rohnert-park sonoma-county bay-area)
 (1412 burger-city burgers 2.0 4645 redwood-dr rohnert-park
  sonoma-county bay-area)
 (1413 burgers-&-ribs burgers 2.0 1475 southwest-blvd rohnert-park
  sonoma-county bay-area)
 (1414 broiler-burger-2 burgers 2.0 3020 santa-rosa-ave santa-rosa
  sonoma-county bay-area)
 (1415 buns-&-burgers burgers 2.0 406 larkfield-ctr santa-rosa
  sonoma-county bay-area)
 (1416 hamburger-heaven burgers 2.0 2700 yulupa-ave santa-rosa
  sonoma-county bay-area)
 (1417 heavenly-hamburgers-restrnt burgers 2.3 4910 sonoma-hwy
  santa-rosa sonoma-county bay-area)
 (1418 hungry-burger burgers 2.0 0 unknown santa-rosa sonoma-county
  bay-area)
 (1419 perrys-burgers burgers 2.0 1129 sebastopol-rd santa-rosa
  sonoma-county bay-area)
 (1420 superburger-the burgers 2.0 0 unknown santa-rosa sonoma-county
  bay-area)
 (1421 babes-burgers-&-franks burgers 2.0 2660 fremont-dr sonoma
  sonoma-county bay-area)
 (1422 paradise-hamburgers-&-ice-cream burgers 2.0 1694 tiburon-blvd
  belvedere-tiburon marin-county bay-area)
 (1423 bills-burgers burgers 2.0 2260 tennessee-st vallejo
  solano-county bay-area)
 (1424 buds-burgers burgers 2.0 1339 springs-rd vallejo solano-county
  bay-area)
 (1425 buds-burgers burgers 2.0 3849 sonoma-blvd vallejo solano-county
  bay-area)
 (1426 nations-giant-hamburgers burgers 2.0 2525 sonoma-blvd vallejo
  solano-county bay-area)
 (1427 quarter-pound-big-burger burgers 2.0 25 rancho-sq vallejo
  solano-county bay-area)
 (1428 sunset-chicken-&-burger burgers 2.0 2564 springs-rd vallejo
  solano-county bay-area)
 (1429 hamburger-haven-restaurants burgers 2.0 800 clement-st
  san-francisco san-francisco-county bay-area)
 (1430 herbs-hamburger-house burgers 2.0 3991 st san-francisco
  san-francisco-county bay-area)
 (1431 nancys-hamburger burgers 2.0 2001 x17th-st san-francisco
  san-francisco-county bay-area)
 (1432 perfect-hamburger burgers 2.0 601 geary-st san-francisco
  san-francisco-county bay-area)
 (1433 tic-tock-selfserv-hamburger burgers 2.0 5411 x3rd-st
  san-francisco san-francisco-county bay-area)
 (1434 fosters-freeze burgers 2.5 1593 x1st-st livermore alameda-county
  bay-area)
 (1435 big-burger-freeze burgers 2.0 390 w-el-camino-real mountain-view
  santa-clara-county bay-area)
 (1436 juicy-burger burgers 2.7 nil nil los-gatos santa-clara-county
  bay-area)
 (1437 nations-giant-hamburgers burgers 3.0 317 broadway oakland
  alameda-county bay-area)
 (1438 chili-bowl burgers 2.3 1307 park-st. alameda alameda-county
  bay-area)
 (1439 rock-n-robs burgers 2.3 450 dondee-st-no.-1 pacifica
  san-mateo-county bay-area)
 (1440 kirks-steakburgers burgers 2.3 844 w.-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (1441 kirks burgers 3.0 1330 de-anza-blvd-at-hiway-85 san-jose
  santa-clara-county bay-area)
 (1442 jts-hamburger burgers 2.0 19 ave san-francisco
  san-francisco-county bay-area)
 (1443 taxis-hamburgers burgers 3.2 403 university palo-alto
  santa-clara-county bay-area)
 (1444 mc-donalds burgers 3.0 300 w-m-st benicia solano-county
  bay-area)
 (1445 bashfull-bull-the burgers 2.5 1222 noriega-st.-19th-ave
  san-francisco san-francisco-county bay-area)
 (1446 fentons-creamery-&-restaurant burgers 3.2 4226 piedmont-ave
  oakland alameda-county bay-area)
 (1447 nations-giant-hamburgers burgers 3.3 301 south-mayfair-avenue
  daly-city san-mateo-county bay-area)
 (1448 johnny-rockets burgers 2.8 840 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (1449 wendys burgers 2.0 576 linda-mar-blvd. pacifica san-mateo-county
  bay-area)
 (1450 orphan-andys burgers 2.6 0 unknown san-francisco
  san-francisco-county bay-area)
 (1451 murder-burgers burgers 2.3 978 olive-drive davis yolo-county
  sacramento-area)
 (1452 mc-donalds burgers 2.0 3509 homestead-rd santa-clara
  santa-clara-county bay-area)
 (1453 new-travavel-cafe burgers 3.5 1054 taravel-st san-francisco
  san-francisco-county bay-area)
 (1454 in-n-out-burger burgers 3.0 1417 fitzgerald-dr. pinole
  contra-costa-county bay-area)
 (1455 mandalay-restaurant burmese 2.8 4344 california san-francisco
  san-francisco-county bay-area)
 (1456 burma-super-star-restaurant burmese 3.0 309 clement-st
  san-francisco san-francisco-county bay-area)
 (1457 innya-lake burmese 2.3 0 bruno-ave san-bruno san-mateo-county
  bay-area)
 (1458 irrawaddy-burmese-cuisine burmese 3.6 1769 lombard-st
  san-francisco san-francisco-county bay-area)
 (1459 planet-fresh-gourmet-burritos burritos 3.4 0 unknown santa-cruz
  santa-cruz-county bay-area)
 (1460 alberts-cafe cafe 2.3 1541 webster-st alameda alameda-county
  bay-area)
 (1461 arthurs-coffee-shop cafe 2.0 2239 southshore-shopping-center
  alameda alameda-county bay-area)
 (1462 cafe-enrico cafe 3.3 875 island-dr-no.-d alameda alameda-county
  bay-area)
 (1463 cafe-mochaccino cafe 2.0 1245 park-st alameda alameda-county
  bay-area)
 (1464 coffee-&-tea-traders-ltd cafe 2.0 883 b-2-island-drive alameda
  alameda-county bay-area)
 (1465 eds-specialty-coffee-and-beans cafe 2.3 1409 park-st alameda
  alameda-county bay-area)
 (1466 elite-caffe cafe 2.0 2408 santa-clara-ave alameda alameda-county
  bay-area)
 (1467 jims-coffee-shop cafe 3.0 2333 lincoln-ave alameda
  alameda-county bay-area)
 (1468 linguinis-p-&-g-cafe cafe 3.8 1506 park-st alameda
  alameda-county bay-area)
 (1469 south-shore-cafe cafe 2.0 531 w-south-shore-center alameda
  alameda-county bay-area)
 (1470 courtyard-cafe cafe 2.7 3195 danville-blvd alamo
  contra-costa-county bay-area)
 (1471 the-alamo-cafe cafe 2.0 1 alamo-sq alamo contra-costa-county
  bay-area)
 (1472 alexs-cafe cafe 2.0 945 san-pablo-ave albany alameda-county
  bay-area)
 (1473 highland-cafe cafe 3.0 827 san-pablo-ave albany alameda-county
  bay-area)
 (1474 rendez-vous-cafe cafe 2.0 1389 solano-ave albany alameda-county
  bay-area)
 (1475 the-royal-cafe cafe 2.8 811 san-pablo-ave albany alameda-county
  bay-area)
 (1476 t-js-cafe cafe 2.0 521 viewridge-dr angwin napa-county
  napa-valley)
 (1477 christels-coffee-shop-&-bakery cafe 2.0 324 g-st antioch
  contra-costa-county bay-area)
 (1478 lone-tree-cafe cafe 2.0 3620 lone-tree-way antioch
  contra-costa-county bay-area)
 (1479 windmill-family-restaurant-&-bakery cafe 2.0 324 g-st antioch
  contra-costa-county bay-area)
 (1480 cafe-rio cafe 2.6 0 unknown aptos santa-cruz-county bay-area)
 (1481 cafe-sparrow cafe 3.3 0 unknown aptos santa-cruz-county
  bay-area)
 (1482 catsredible-cafe cafe 2.0 7488 soquel-dr aptos santa-cruz-county
  bay-area)
 (1483 courtside-caffe cafe 2.0 10 seascape-vlg aptos santa-cruz-county
  bay-area)
 (1484 rancho-del-mar-coffee-shop cafe 2.0 1 rancho-del-mar-no.-a aptos
  santa-cruz-county bay-area)
 (1485 surf-city-coffee cafe 2.0 9111 soquel-dr aptos santa-cruz-county
  bay-area)
 (1486 the-red-apple-cafe cafe 2.0 125 falmouth-ct aptos
  santa-cruz-county bay-area)
 (1487 cafe-capriccio cafe 2.0 36 irving-ave atherton san-mateo-county
  bay-area)
 (1488 caffe-strada cafe 2.0 55 deodora-dr atherton san-mateo-county
  bay-area)
 (1489 bens-coffee-shop cafe 2.0 2733 comstock-cir belmont
  san-mateo-county bay-area)
 (1490 commodore-cafe cafe 2.0 5 dionne-ct belmont san-mateo-county
  bay-area)
 (1491 indianas-coffee-shop cafe 2.0 740 el-camino-real-no.-a belmont
  san-mateo-county bay-area)
 (1492 kims-cafeteria cafe 2.0 477 harbor-blvd belmont san-mateo-county
  bay-area)
 (1493 paradise-garden-cafe cafe 2.0 1509 chula-vista-dr belmont
  san-mateo-county bay-area)
 (1494 shoreway-cafe cafe 2.0 1301 shoreway-rd-no.-120 belmont
  san-mateo-county bay-area)
 (1495 ten-twin-dolphin-cafe cafe 2.0 2623 prindle-rd belmont
  san-mateo-county bay-area)
 (1496 that-coffee-place cafe 2.0 951 old-county-rd-no.-146 belmont
  san-mateo-county bay-area)
 (1497 tigers-coffee-shop cafe 2.0 232 harbor-blvd belmont
  san-mateo-county bay-area)
 (1498 java-house cafe 2.0 366 x1st-st benicia solano-county bay-area)
 (1499 rosies-cafe cafe 2.0 3001 bayshore-rd benicia solano-county
  bay-area)
 (1500 waterfront-cafe-&-bistro cafe 2.0 131 x1st-st benicia
  solano-county bay-area)
 (1501 ashkenaz-music-&-dance-cafe cafe 2.0 1317 san-pablo-ave berkeley
  alameda-county bay-area)
 (1502 couscous cafe 2.0 2433 shattuck-ave berkeley alameda-county
  bay-area)
 (1503 bancroft-cafe cafe 2.7 2512 bancroft-way berkeley alameda-county
  bay-area)
 (1504 brewed-awakening cafe 2.2 1807 euclid-ave berkeley
  alameda-county bay-area)
 (1505 cafe-campanile cafe 2.0 2134 university-ave berkeley
  alameda-county bay-area)
 (1506 cafe-del-sol cafe 2.0 1742 solano-ave berkeley alameda-county
  bay-area)
 (1507 cafe-durant cafe 2.0 2517 durant-ave berkeley alameda-county
  bay-area)
 (1508 cafe-fanny cafe 2.2 1619 x5th-st berkeley alameda-county
  bay-area)
 (1509 cafe-jun cafe 2.0 2021 university-ave berkeley alameda-county
  bay-area)
 (1510 cafe-marmara cafe 2.0 1730 shattuck-ave berkeley alameda-county
  bay-area)
 (1511 cafe-nefeli cafe 3.0 1854 euclid-ave berkeley alameda-county
  bay-area)
 (1512 cafe-neutron-bakery cafe 2.7 2124 center-st berkeley
  alameda-county bay-area)
 (1513 cafe-retta cafe 3.0 2327 shattuck-ave berkeley alameda-county
  bay-area)
 (1514 cafe-rio cafe 2.0 2148 center-st berkeley alameda-county
  bay-area)
 (1515 caffe-espresso cafe 1.7 2481 hearst-ave berkeley alameda-county
  bay-area)
 (1516 caffe-mediterraneum cafe 3.2 2475 telegraph-ave berkeley
  alameda-county bay-area)
 (1517 chesters-cafe cafe 3.0 1508 walnut-st-ste-b berkeley
  alameda-county bay-area)
 (1518 clarinet-cafe cafe 2.7 1908 shattuck-ave berkeley alameda-county
  bay-area)
 (1519 dwight-way-cafe-subcity cafe 2.0 2450 dwight-way berkeley
  alameda-county bay-area)
 (1520 edys-of-berkeley cafe 1.8 2201 shattuck-ave berkeley
  alameda-county bay-area)
 (1521 elmwood-cafe cafe 2.0 2993 college-ave berkeley alameda-county
  bay-area)
 (1522 espresso-roma cafe 2.0 2554 bancroft-way berkeley alameda-county
  bay-area)
 (1523 espresso-roma-corp cafe 2.0 2116 shattuck-ave berkeley
  alameda-county bay-area)
 (1524 espresso-roma-corp cafe 2.0 2300 telegraph-ave berkeley
  alameda-county bay-area)
 (1525 espresso-roma-corp cafe 2.0 2307 telegraph-ave berkeley
  alameda-county bay-area)
 (1526 espresso-roma-corp cafe 2.0 2309 telegraph-ave berkeley
  alameda-county bay-area)
 (1527 espresso-roma-corp cafe 2.0 2522 bancroft-way berkeley
  alameda-county bay-area)
 (1528 espresso-roma-corp cafe 2.5 2960 college-ave berkeley
  alameda-county bay-area)
 (1529 espresso-roma-corp cafe 2.0 1549 hopkins-st berkeley
  alameda-county bay-area)
 (1530 espresso-roma-corp cafe 2.0 1540 shattuck-ave berkeley
  alameda-county bay-area)
 (1531 espresso-roma-corp cafe 2.0 2299 piedmont-ave berkeley
  alameda-county bay-area)
 (1532 euclid-cafe cafe 2.0 1870 euclid-ave berkeley alameda-county
  bay-area)
 (1533 expresso-experience cafe 2.0 2440 bancroft-way berkeley
  alameda-county bay-area)
 (1534 freight-&-salvage-coffee-house cafe 3.5 1111 addison-st berkeley
  alameda-county bay-area)
 (1535 home-cafe cafe 2.0 900 grayson-st berkeley alameda-county
  bay-area)
 (1536 kans-cafeteria cafe 2.0 1100 eastshore-hwy berkeley
  alameda-county bay-area)
 (1537 makris-cafe cafe 2.0 2105 university-ave berkeley alameda-county
  bay-area)
 (1538 maxim-cafe cafe 3.0 2190 bancroft-way berkeley alameda-county
  bay-area)
 (1539 missouri-cafe cafe 2.0 2600 san-pablo-ave berkeley
  alameda-county bay-area)
 (1540 pamir-afghan-cafe cafe 2.0 2161 university-ave berkeley
  alameda-county bay-area)
 (1541 paris-cafe-and-deli cafe 1.7 1650 university-ave berkeley
  alameda-county bay-area)
 (1542 pasqua-cafe cafe 2.0 2128 center berkeley alameda-county
  bay-area)
 (1543 raps-coffees-&-tea cafe 3.0 2109 allston-way berkeley
  alameda-county bay-area)
 (1544 renaissance-cafe-&-deli-burger cafe 2.0 2110 shattuck-ave
  berkeley alameda-county bay-area)
 (1545 rods-coffee-shop cafe 2.0 2787 shattuck-ave berkeley
  alameda-county bay-area)
 (1546 smokey-joes-cafe cafe 2.3 1620 shattuck-ave berkeley
  alameda-county bay-area)
 (1547 starbucks cafe 2.7 1799 solano-ave berkeley alameda-county
  bay-area)
 (1548 starbucks-coffee cafe 2.4 1799 solano-ave berkeley
  alameda-county bay-area)
 (1549 the-cafe-on-college cafe 2.0 3204 college-ave berkeley
  alameda-county bay-area)
 (1550 the-coffee-source cafe 2.5 2404 telegraph-ave berkeley
  alameda-county bay-area)
 (1551 tomate-cafe cafe 2.0 729 heinz-ave berkeley alameda-county
  bay-area)
 (1552 university-cafe cafe 2.0 1800 university-ave berkeley
  alameda-county bay-area)
 (1553 westside-bakery-cafe cafe 2.8 2570 x9th-st berkeley
  alameda-county bay-area)
 (1554 bistro-at-boulder-creek cafe 3.0 13090 pine-st-no.-b
  boulder-creek santa-cruz-county bay-area)
 (1555 boulder-creek-grille-&-cafe cafe 2.3 13040 highway-9
  boulder-creek santa-cruz-county bay-area)
 (1556 bobs-farm-house-cafe cafe 2.0 1410 state-highway-4 brentwood
  contra-costa-county bay-area)
 (1557 barbaras-cafeteria cafe 2.0 7000 marina-blvd brisbane
  san-mateo-county bay-area)
 (1558 hitacki-american-ltd-cafe cafe 2.0 2000 sierra-point-pky
  brisbane san-mateo-county bay-area)
 (1559 angels-cafe cafe 2.0 1633 bayshore-hwy burlingame
  san-mateo-county bay-area)
 (1560 any-time-coffee cafe 2.0 1251 broadway burlingame
  san-mateo-county bay-area)
 (1561 avenue-cafe cafe 2.0 1107 howard-ave burlingame san-mateo-county
  bay-area)
 (1562 cafe-express cafe 2.0 819 mitten-rd-no.-39 burlingame
  san-mateo-county bay-area)
 (1563 cafe-figaro cafe 2.0 1318 broadway burlingame san-mateo-county
  bay-area)
 (1564 cafe-royale cafe 2.0 1718 rollins-rd burlingame san-mateo-county
  bay-area)
 (1565 christy-street-cafe cafe 2.0 1720 marco-polo-way burlingame
  san-mateo-county bay-area)
 (1566 coffee-bistro cafe 2.0 1110 burlingame-ave burlingame
  san-mateo-county bay-area)
 (1567 copenhagen-bakery-&-coffee-shop cafe 3.7 1216 burlingame-ave
  burlingame san-mateo-county bay-area)
 (1568 ecco-cafe cafe 3.4 322 lorton-ave burlingame san-mateo-county
  bay-area)
 (1569 garden-cafe cafe 2.0 1447 burlingame-ave burlingame
  san-mateo-county bay-area)
 (1570 garden-coffee cafe 2.0 141 clarendon-rd burlingame
  san-mateo-county bay-area)
 (1571 giacomo-coffee-bar cafe 2.0 800 airport-blvd-ste-314 burlingame
  san-mateo-county bay-area)
 (1572 gilbreth-cafe cafe 2.0 1818 gilbreth-rd-no.-121 burlingame
  san-mateo-county bay-area)
 (1573 hot-spot-cafeteria cafe 2.0 0 unknown burlingame
  san-mateo-county bay-area)
 (1574 i-&-i-coffee-shop cafe 2.0 1828 el-camino-real burlingame
  san-mateo-county bay-area)
 (1575 ice-dream-cafe cafe 2.0 1809 el-camino-real burlingame
  san-mateo-county bay-area)
 (1576 il-piccolo-caffe cafe 2.0 1219 broadway burlingame
  san-mateo-county bay-area)
 (1577 nelsons-coffee-shop cafe 2.0 3 toledo-ct burlingame
  san-mateo-county bay-area)
 (1578 new-place-coffee-shop cafe 2.0 1675 rollins-rd-ste-e burlingame
  san-mateo-county bay-area)
 (1579 primrose-cafe cafe 2.0 321 primrose-rd burlingame
  san-mateo-county bay-area)
 (1580 starbucks-coffee cafe 2.3 1160 burlingame-ave burlingame
  san-mateo-county bay-area)
 (1581 yassou-cafe-&-roxannes-cateri cafe 2.0 866 malcolm-rd burlingame
  san-mateo-county bay-area)
 (1582 all-seasons-cafe cafe 3.0 1400 lincoln-ave calistoga napa-county
  napa-valley)
 (1583 cafe-pacifico cafe 2.7 1237 lincoln-ave calistoga napa-county
  napa-valley)
 (1584 sarafornia-cafe cafe 2.3 1413 lincoln-ave calistoga napa-county
  napa-valley)
 (1585 cafe-fame cafe 2.0 4151 w-rincon-ave campbell santa-clara-county
  bay-area)
 (1586 caffe-classico cafe 2.0 2080 s-bascom-ave campbell
  santa-clara-county bay-area)
 (1587 campbell-coffee-roasting cafe 2.0 1875 s-bascom-ave-ste-112
  campbell santa-clara-county bay-area)
 (1588 goodies-ii-coffee-shop cafe 2.3 2201 s-bascom-ave campbell
  santa-clara-county bay-area)
 (1589 mediterranean-cafe cafe 2.5 100 w-hamilton-ave-no.-b campbell
  santa-clara-county bay-area)
 (1590 starbucks-coffee cafe 3.0 1696 s-bascom-ave campbell
  santa-clara-county bay-area)
 (1591 cafe-capitola cafe 2.0 2180 x41st-ave capitola unknown bay-area)
 (1592 cafe-des-arts cafe 2.0 316 capitola-ave capitola unknown
  bay-area)
 (1593 cafe-monterey cafe 2.3 210 monterey-ave-no.-3 capitola unknown
  bay-area)
 (1594 cafe-violette cafe 2.0 104 stockton-ave capitola unknown
  bay-area)
 (1595 caffe-lido cafe 2.8 110 monterey-ave capitola unknown bay-area)
 (1596 coyote-cafe cafe 1.7 201 esplanade capitola unknown bay-area)
 (1597 mr.-toots-coffeehouse cafe 3.0 221 esplanade-no.-a capitola
  unknown bay-area)
 (1598 carrows cafe 2.0 2723 castro-valley-blvd castro-valley
  alameda-county bay-area)
 (1599 dell-cafe cafe 2.3 2637 castro-valley-blvd castro-valley
  alameda-county bay-area)
 (1600 priors-expresso cafe 3.2 20634 rustic-dr castro-valley
  alameda-county bay-area)
 (1601 skippers-cafe cafe 2.0 14585 russo-rd castroville
  monterey-county monterey)
 (1602 cafe-dolce-pacific-plaza cafe 2.0 25 nottingham-cir clayton
  contra-costa-county bay-area)
 (1603 jils-patisserie-&-cafe cafe 2.0 11 colma-blvd colma
  san-mateo-county bay-area)
 (1604 wongs-cafe cafe 2.0 1111 hillside-blvd colma san-mateo-county
  bay-area)
 (1605 american-expresso cafe 2.0 1242 stafford-ave concord
  contra-costa-county bay-area)
 (1606 cactus-cafe cafe 2.0 3872 concord-blvd concord
  contra-costa-county bay-area)
 (1607 cafe-express cafe 2.0 1001 willow-pass-rd concord
  contra-costa-county bay-area)
 (1608 elenis-coffee-shop cafe 2.0 5400 ygnacio-valley-rd-ste-e concord
  contra-costa-county bay-area)
 (1609 expresso-cafe cafe 2.0 970 detroit-ave-ste-a concord
  contra-costa-county bay-area)
 (1610 gateway-cafe cafe 2.0 1850 gateway-blvd-no.-140 concord
  contra-costa-county bay-area)
 (1611 mediterranean-cafe cafe 2.0 4710 clayton-rd concord
  contra-costa-county bay-area)
 (1612 mocha-lisa cafe 2.0 5100 clayton-rd-no.-14 concord
  contra-costa-county bay-area)
 (1613 park-cafe cafe 2.0 2520 stanwell-dr concord contra-costa-county
  bay-area)
 (1614 parkside-cafe cafe 2.0 1924 grant-st concord contra-costa-county
  bay-area)
 (1615 shimmys-cafe cafe 2.0 2123 pacheco-st concord
  contra-costa-county bay-area)
 (1616 sugar-plum-coffee-shop cafe 2.0 1815 colfax-st concord
  contra-costa-county bay-area)
 (1617 sunshine-cafe cafe 2.0 1130 aspen-dr concord contra-costa-county
  bay-area)
 (1618 the-metro-cafe cafe 2.0 1470 enea-cir-bldg-h concord
  contra-costa-county bay-area)
 (1619 treats-sidewalk-cafe-&-bakery cafe 2.0 2300 clayton-rd concord
  contra-costa-county bay-area)
 (1620 emilios-cafe cafe 2.0 1235 wanda-st crockett unknown bay-area)
 (1621 pages-cafe cafe 2.0 1322 pomona-ave crockett unknown bay-area)
 (1622 andrews-cafe cafe 2.0 10678 maplewood-rd-no.-a cupertino
  santa-clara-county bay-area)
 (1623 bobbi-s-coffee-shop cafe 2.0 1361 saratoga-sunnyvale-rd
  cupertino santa-clara-county bay-area)
 (1624 cafe-gourmet-&-catering-company cafe 3.0 10931 n.-wolfe-rd.
  cupertino santa-clara-county bay-area)
 (1625 cafe-tiburon cafe 2.0 10647 minette-dr cupertino
  santa-clara-county bay-area)
 (1626 coffee-society cafe 3.5 21265 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (1627 gloria-jeans-coffee-bean cafe 2.0 10123 n-wolfe-rd-ste-1014
  cupertino santa-clara-county bay-area)
 (1628 hina-beach-cafe cafe 2.0 20630 valley-green-dr cupertino
  santa-clara-county bay-area)
 (1629 lees-cafeteria cafe 2.0 10673 morengo-dr cupertino
  santa-clara-county bay-area)
 (1630 sports-city-cafe cafe 2.0 10745 n-de-anza-blvd cupertino
  santa-clara-county bay-area)
 (1631 syva-cafeteria cafe 2.0 20400 mariani-ave cupertino
  santa-clara-county bay-area)
 (1632 the-corner-cafe cafe 2.0 21730 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (1633 town-center-cafe cafe 2.0 20390 town-center-ln cupertino
  santa-clara-county bay-area)
 (1634 victoria-cafe cafe 2.0 10221 adriana-ave cupertino
  santa-clara-county bay-area)
 (1635 cafe-maisonnette cafe 2.0 88 oakmont-dr daly-city
  san-mateo-county bay-area)
 (1636 cafe-nautilus cafe 2.0 373 gellert-blvd daly-city
  san-mateo-county bay-area)
 (1637 classic-cafe cafe 2.0 2 san-miguel-ave daly-city
  san-mateo-county bay-area)
 (1638 johns-cafe cafe 2.0 62 seacliff-ave daly-city san-mateo-county
  bay-area)
 (1639 lily-cafe cafe 2.0 2408 junipero-serra-blvd-no.-a daly-city
  san-mateo-county bay-area)
 (1640 logitech-cafeteria cafe 2.0 860 campus-dr-apt-220 daly-city
  san-mateo-county bay-area)
 (1641 westlake-coffee-shop cafe 2.0 52 park-plaza-dr daly-city
  san-mateo-county bay-area)
 (1642 blackhawk-grille cafe 3.9 3540 blackhawk-plaza-cir danville
  contra-costa-county bay-area)
 (1643 captains-coffee cafe 2.0 145 town-and-country-dr-ste-104
  danville contra-costa-county bay-area)
 (1644 euro-cafe cafe 2.0 105 town-and-country-dr-ste-g danville
  contra-costa-county bay-area)
 (1645 kava-cafe cafe 2.0 208 kingswood-ct danville contra-costa-county
  bay-area)
 (1646 rising-loafer-bakery-cafe cafe 2.8 340 hartz-ave danville
  contra-costa-county bay-area)
 (1647 shawns-cafe-servo-foods cafe 2.0 3 auburn-ct danville
  contra-costa-county bay-area)
 (1648 uptown-cafe cafe 1.5 327 hartz-ave danville contra-costa-county
  bay-area)
 (1649 little-cafe cafe 2.0 11875 dublin-blvd-ste-c150 dublin
  alameda-county bay-area)
 (1650 two-pesos-mexican-cafe cafe 2.0 6568 village-pky dublin
  alameda-county bay-area)
 (1651 zacs-cafe cafe 2.0 6715 dublin-blvd dublin alameda-county
  bay-area)
 (1652 art-cafe cafe 2.0 10174 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (1653 board-of-education-cafe cafe 2.0 1029 everett-st el-cerrito
  contra-costa-county bay-area)
 (1654 the-shutter-cafe cafe 3.3 10066 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (1655 california-dream-cafe cafe 2.0 4557 appian-way el-sobrante
  contra-costa-county bay-area)
 (1656 weang-ping-cafe cafe 2.0 723 appian-way el-sobrante
  contra-costa-county bay-area)
 (1657 bank-club-cafe cafe 2.0 3900 san-pablo-ave emeryville
  alameda-county bay-area)
 (1658 bay-cafe cafe 2.0 5800 shellmound-st emeryville alameda-county
  bay-area)
 (1659 biscos-cafe cafe 2.0 4240 hollis-st emeryville alameda-county
  bay-area)
 (1660 broom-bush-coffee-shop cafe 2.0 4303 san-pablo-ave emeryville
  alameda-county bay-area)
 (1661 cafe-boui-boui cafe 2.0 5900 hollis-st-ste-k emeryville
  alameda-county bay-area)
 (1662 cafe-express cafe 2.0 1900 powell-st-ste-115 emeryville
  alameda-county bay-area)
 (1663 carraras-cafe cafe 2.3 1290 powell-st emeryville alameda-county
  bay-area)
 (1664 chiron-cafe cafe 2.0 4560 horton-st emeryville alameda-county
  bay-area)
 (1665 christophers-courtyard-cafe cafe 2.0 5857 christie-ave-no.-b
  emeryville alameda-county bay-area)
 (1666 jonahs-cafe cafe 2.0 1400 x53rd-st emeryville alameda-county
  bay-area)
 (1667 ot-cafe cafe 2.0 5800 shellmound-st emeryville alameda-county
  bay-area)
 (1668 robas-pizza-cafe cafe 2.0 2320 powell-st emeryville
  alameda-county bay-area)
 (1669 watergate-tower-ii-cafe cafe 2.0 2200 powell-st emeryville
  alameda-county bay-area)
 (1670 blue-cafe cafe 2.0 1500 oliver-rd-ste-f fairfield solano-county
  bay-area)
 (1671 coffee-world cafe 2.0 2401 waterman-blvd-no.-8 fairfield
  solano-county bay-area)
 (1672 espresso-inizio cafe 2.0 740 texas-st fairfield solano-county
  bay-area)
 (1673 heart-key-cafe cafe 2.7 1123 texas-st fairfield solano-county
  bay-area)
 (1674 higher-ground-coffee-house cafe 2.0 4476 tolenas-rd fairfield
  solano-county bay-area)
 (1675 jo-anns-cafeteria cafe 2.0 3101 busch-drive fairfield
  solano-county bay-area)
 (1676 marie-callender-restaurant cafe 2.0 1750 travis-blvd fairfield
  solano-county bay-area)
 (1677 north-bay-coffee-company cafe 2.0 3069 travis-blvd fairfield
  solano-county bay-area)
 (1678 omelette-house-cafe cafe 2.0 1690 w-texas-st fairfield
  solano-county bay-area)
 (1679 mac-phersons-premuim-coffee cafe 2.0 7450 highway-9 felton
  unknown bay-area)
 (1680 spankys-cafe cafe 2.0 0 unknown felton unknown bay-area)
 (1681 century-cafe cafe 2.0 1065 e-hillsdale-blvd-ste-101 foster-city
  san-mateo-county bay-area)
 (1682 iac-cafe cafe 2.0 362 lakeside-dr foster-city san-mateo-county
  bay-area)
 (1683 treats-sidewalk-cafe-&-bakery cafe 2.0 950 tower-ln-ste-100
  foster-city san-mateo-county bay-area)
 (1684 vwr-coffee-shop cafe 2.0 28 williams-ln foster-city
  san-mateo-county bay-area)
 (1685 fresh-cup-caffe-a cafe 2.0 39112 state-st fremont alameda-county
  bay-area)
 (1686 atari-cafeteria cafe 2.0 4610 fanwood-ter fremont alameda-county
  bay-area)
 (1687 cafe-med cafe 2.0 50 whitney-pl fremont alameda-county bay-area)
 (1688 cafe-restrnt-du-rondez-vous cafe 2.0 4903 central-ave-apt-233
  fremont alameda-county bay-area)
 (1689 candys-coffee-shop cafe 2.0 3681 peralta-blvd fremont
  alameda-county bay-area)
 (1690 christy-garden-cafe cafe 2.0 43014 christy-st fremont
  alameda-county bay-area)
 (1691 connies-cafe cafe 2.0 35632 nuttman-ln fremont alameda-county
  bay-area)
 (1692 fremont-coffee-works cafe 2.0 3339 walnut-ave fremont
  alameda-county bay-area)
 (1693 ginas-gourmet-coffee cafe 2.0 39180 paseo-padre-pky fremont
  alameda-county bay-area)
 (1694 golden-gate-cafe cafe 2.0 6700 stevenson-blvd fremont
  alameda-county bay-area)
 (1695 impressive-espresso cafe 2.0 40295 canyon-heights-dr fremont
  alameda-county bay-area)
 (1696 kaiser-cafe cafe 2.0 250 ottawa-way fremont alameda-county
  bay-area)
 (1697 kava-cafe cafe 2.0 39126 argonaut-way fremont alameda-county
  bay-area)
 (1698 lunch-place-cafe cafe 2.0 4062 isola-ct fremont alameda-county
  bay-area)
 (1699 mission-coffees-&-more cafe 2.3 151 washington-blvd fremont
  alameda-county bay-area)
 (1700 mission-pine-cafe cafe 2.3 129 anza-st fremont alameda-county
  bay-area)
 (1701 pearls-cafe cafe 4.1 4096 bay-st-no.-a fremont alameda-county
  bay-area)
 (1702 philips-cafeteria cafe 2.0 4355 othello-dr fremont
  alameda-county bay-area)
 (1703 safeway-cafeteria cafe 2.0 47400 kato-rd fremont alameda-county
  bay-area)
 (1704 sequel-cafe cafe 2.0 42679 fontainebleau-park-ln fremont
  alameda-county bay-area)
 (1705 simas-cafeteria cafe 2.0 620 azevedo-common fremont
  alameda-county bay-area)
 (1706 spikes-cafe cafe 2.0 4193 becerra-dr fremont alameda-county
  bay-area)
 (1707 sujus-coffee-&-tea cafe 2.0 39478 fremont-blvd fremont
  alameda-county bay-area)
 (1708 sunset-cactus-cafe cafe 2.0 3839 washington-blvd fremont
  alameda-county bay-area)
 (1709 sunshine-cafe cafe 2.0 4075 horatio-ct fremont alameda-county
  bay-area)
 (1710 syquest-cafeteria cafe 2.3 47071 bayside-pky fremont
  alameda-county bay-area)
 (1711 the-deluxe-cafe cafe 3.0 2020 springwater-dr fremont
  alameda-county bay-area)
 (1712 vinces-cafe cafe 2.0 46700 fremont-blvd fremont alameda-county
  bay-area)
 (1713 wiellies-cafe cafe 2.0 40210 dolerita-ave fremont alameda-county
  bay-area)
 (1714 gavillan-college-cafe cafe 2.0 5055 santa-teresa-blvd gilroy
  santa-clara-county bay-area)
 (1715 gilroy-cafe cafe 2.0 8225 arroyo-cir-no.-25 gilroy
  santa-clara-county bay-area)
 (1716 mexico-cafe cafe 2.0 7265 monterey-st gilroy santa-clara-county
  bay-area)
 (1717 oakhorst-cafe-shop cafe 2.0 2910 day-rd gilroy
  santa-clara-county bay-area)
 (1718 california-girls-cafe-&-bakery cafe 2.7 80 cabrillo-hwy-n-ste-s
  half-moon-bay san-mateo-county bay-area)
 (1719 half-moon-bay-coffee-company cafe 2.0 315 main-st half-moon-bay
  san-mateo-county bay-area)
 (1720 sams-coffee-shop cafe 2.0 210 san-mateo-rd half-moon-bay
  san-mateo-county bay-area)
 (1721 two-fools-cafe-and-market cafe 2.6 0 unknown half-moon-bay
  san-mateo-county bay-area)
 (1722 anitas-cafe cafe 2.0 24300 clauster-rd hayward alameda-county
  bay-area)
 (1723 annas-family-coffee-shop cafe 2.0 444 jackson-st hayward
  alameda-county bay-area)
 (1724 b-of-a-cafeteria cafe 2.0 24371 anna-st hayward alameda-county
  bay-area)
 (1725 cabot-cafe cafe 2.0 23595 cabot-blvd-no.-101 hayward
  alameda-county bay-area)
 (1726 cafe-dumas cafe 2.6 903 b-st hayward alameda-county bay-area)
 (1727 cafe-vasiliki cafe 3.0 25202 hesperian-blvd hayward
  alameda-county bay-area)
 (1728 caffe-flavia cafe 2.0 28014 fallbrook-dr hayward alameda-county
  bay-area)
 (1729 carillis-cafe cafe 2.0 25037 clawiter-rd hayward alameda-county
  bay-area)
 (1730 cherryland-cafe cafe 2.0 22472 ave hayward alameda-county
  bay-area)
 (1731 e-c-castor-cafeteria cafe 2.0 1173 hat-creek-way hayward
  alameda-county bay-area)
 (1732 eden-plaza-cafe cafe 2.0 3541 investment-blvd-ste-1 hayward
  alameda-county bay-area)
 (1733 haymont-coffee-shop cafe 2.0 26657 mission-blvd hayward
  alameda-county bay-area)
 (1734 hills-coffee-shop cafe 2.0 21458 foothill-blvd hayward
  alameda-county bay-area)
 (1735 idas-cafe cafe 2.3 22306 foothill-blvd hayward alameda-county
  bay-area)
 (1736 j-c-penney-cafeteria cafe 2.0 28283 beatron-way hayward
  alameda-county bay-area)
 (1737 janes-cafeteria cafe 2.0 22344 cynthia-ct hayward alameda-county
  bay-area)
 (1738 kjs-cafe-a-la-carte cafe 2.0 27400 hesperian-blvd hayward
  alameda-county bay-area)
 (1739 mannys-cafe cafe 2.0 29900 auction-ct hayward alameda-county
  bay-area)
 (1740 may-land-cafe cafe 2.0 3592 siskiyou-ct hayward alameda-county
  bay-area)
 (1741 steves-coffee-shop cafe 2.0 633 quincy-way hayward
  alameda-county bay-area)
 (1742 yucca-cafe cafe 2.3 162 b-st hayward alameda-county bay-area)
 (1743 angels-cafeteria cafe 2.0 124 tanager-way hercules
  contra-costa-county bay-area)
 (1744 bio-rad-cafe cafe 2.0 1000 alfred-nobel-dr hercules
  contra-costa-county bay-area)
 (1745 cafe-nobel cafe 2.0 825 alfred-nobel-dr-ste-a hercules
  contra-costa-county bay-area)
 (1746 cozy-cup-cafe cafe 2.0 380 x4th-st hollister san-benito-county
  northern-california)
 (1747 hollister-coffee-roasting cafe 2.3 420 san-benito-st hollister
  san-benito-county northern-california)
 (1748 mission-cafe cafe 2.0 360 cowden-rd hollister san-benito-county
  northern-california)
 (1749 rancho-cafe-taqueria cafe 2.0 40 san-felipe-rd hollister
  san-benito-county northern-california)
 (1750 avanti-cafe cafe 2.0 101 lafayette-cir lafayette
  contra-costa-county bay-area)
 (1751 express-cafe cafe 2.0 3732 mount-diablo-blvd-ste-170 lafayette
  contra-costa-county bay-area)
 (1752 g-e-ms-java-express-&-more cafe 2.0 3529 plaza-way lafayette
  contra-costa-county bay-area)
 (1753 lafayette-cafe cafe 2.0 3422 mount-diablo-blvd lafayette
  contra-costa-county bay-area)
 (1754 lafayette-coffee-roasters cafe 2.0 960 moraga-rd lafayette
  contra-costa-county bay-area)
 (1755 millies-kitchen cafe 2.6 1018 oak-hill-rd lafayette
  contra-costa-county bay-area)
 (1756 royal-cafe cafe 2.0 3518 mount-diablo-blvd-ste-a lafayette
  contra-costa-county bay-area)
 (1757 starbucks-coffee cafe 2.3 3547 mount-diablo-blvd-no.-a lafayette
  contra-costa-county bay-area)
 (1758 the-squirrels-coffee-shop cafe 2.5 998 moraga-rd lafayette
  contra-costa-county bay-area)
 (1759 g-&-a-cafe cafe 2.0 6952 preston-ave livermore alameda-county
  bay-area)
 (1760 railroad-cafe cafe 2.7 2041 railroad livermore alameda-county
  bay-area)
 (1761 triad-cafeteria cafe 2.0 3055 triad-dr livermore alameda-county
  bay-area)
 (1762 v-&-e-cafe cafe 2.0 2071 x1st-st livermore alameda-county
  bay-area)
 (1763 cafe-gourmet-&-catering-compan cafe 2.0 10573 creston-dr
  los-altos santa-clara-county bay-area)
 (1764 cookie-cafe-&-bakery cafe 2.0 133 main-st los-altos
  santa-clara-county bay-area)
 (1765 los-altos-coffee-shop cafe 2.8 240 x2nd-st los-altos
  santa-clara-county bay-area)
 (1766 metropolitan-cafe-of-art cafe 2.0 1571 carob-ln los-altos
  santa-clara-county bay-area)
 (1767 rx-caffe cafe 2.0 1230 woodview-ter los-altos santa-clara-county
  bay-area)
 (1768 second-cup-cafe cafe 2.0 987 n-san-antonio-rd los-altos
  santa-clara-county bay-area)
 (1769 starbucks-coffee cafe 2.0 296 main-st los-altos
  santa-clara-county bay-area)
 (1770 susies-cafe cafe 2.0 4546 el-camino-real los-altos
  santa-clara-county bay-area)
 (1771 x29-east-main-cafe cafe 3.0 29 e-main-st los-gatos
  santa-clara-county bay-area)
 (1772 blossom-hill-cafe cafe 2.0 798 blossom-hill-rd-no.-9 los-gatos
  santa-clara-county bay-area)
 (1773 cafe-trio cafe 3.4 15466 los-gatos-blvd los-gatos
  santa-clara-county bay-area)
 (1774 caffe-and-company cafe 2.0 405 alberto-way-no.-1 los-gatos
  santa-clara-county bay-area)
 (1775 city-expresso cafe 2.0 146 belridge-dr los-gatos
  santa-clara-county bay-area)
 (1776 city-expresso cafe 2.0 146 belridge-dr los-gatos
  santa-clara-county bay-area)
 (1777 gilleys-coffee-shoppe cafe 2.3 47 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (1778 great-bear-coffee cafe 3.0 19 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (1779 kaiser-cafe cafe 2.0 694 w-parr-ave los-gatos santa-clara-county
  bay-area)
 (1780 la-maison-du-cafe cafe 3.6 14103 winchester-blvd-no.-c los-gatos
  santa-clara-county bay-area)
 (1781 los-gatos-cafe cafe 2.7 340 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (1782 net-frame-cafeteria cafe 2.0 18173 mountain-view-ct los-gatos
  santa-clara-county bay-area)
 (1783 pacific-coffee-roasting-co cafe 2.0 405 alberto-way-no.-1
  los-gatos santa-clara-county bay-area)
 (1784 palo-alto-coffee-roasting-co cafe 2.0 405 alberto-way-no.-1
  los-gatos santa-clara-county bay-area)
 (1785 roohs-cafe-salsa cafe 2.3 15525 los-gatos-blvd los-gatos
  santa-clara-county bay-area)
 (1786 sunshine-caffe cafe 2.0 151 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (1787 the-espresso-works cafe 2.0 14685 oka-rd-lot-62 los-gatos
  santa-clara-county bay-area)
 (1788 the-flames-coffee-shop cafe 1.8 15200 los-gatos-blvd los-gatos
  santa-clara-county bay-area)
 (1789 cafe-bohemia cafe 2.0 514 main-st martinez contra-costa-county
  bay-area)
 (1790 cafe-romano-california-grill cafe 2.0 533 main-st martinez
  contra-costa-county bay-area)
 (1791 express-yourself-cafe-&-bakery cafe 2.0 811 ferry-st martinez
  contra-costa-county bay-area)
 (1792 anns-coffee-shop cafe 2.0 772 santa-cruz-ave menlo-park
  san-mateo-county bay-area)
 (1793 cafe-borrone cafe 3.2 1010 el-camino-real menlo-park
  san-mateo-county bay-area)
 (1794 cafe-latte cafe 2.0 1702 el-camino-real menlo-park
  san-mateo-county bay-area)
 (1795 cafe-montmarte cafe 2.0 5 cheryl-pl menlo-park san-mateo-county
  bay-area)
 (1796 cafe-tropical cafe 2.0 3215 middlefield-rd menlo-park
  san-mateo-county bay-area)
 (1797 commons-cafe cafe 2.0 300 constitution-dr menlo-park
  san-mateo-county bay-area)
 (1798 flea-st.-cafe cafe 3.7 3607 alameda-de-las-pulgas menlo-park
  san-mateo-county bay-area)
 (1799 la-luna-mexican-cafe cafe 2.3 1137 chestnut-st menlo-park
  san-mateo-county bay-area)
 (1800 qs-little-cafe cafe 2.0 1100 marsh-rd-ste-110 menlo-park
  san-mateo-county bay-area)
 (1801 tanas-cafe cafe 2.0 1525 obrien-dr menlo-park san-mateo-county
  bay-area)
 (1802 gateway-cafe cafe 2.0 7 christine-ln millbrae san-mateo-county
  bay-area)
 (1803 irenes-coffee-shop cafe 2.0 0 unknown millbrae san-mateo-county
  bay-area)
 (1804 kings-bowl-coffee-shop cafe 2.0 25 s-el-camino-real millbrae
  san-mateo-county bay-area)
 (1805 peters-cafe cafe 3.0 9 hillcrest-blvd millbrae san-mateo-county
  bay-area)
 (1806 starbucks-coffee cafe 3.3 513 broadway millbrae san-mateo-county
  bay-area)
 (1807 book-garden-cafe-a cafe 2.3 1215 e-calaveras-blvd milpitas
  santa-clara-county bay-area)
 (1808 cafe-bombay cafe 3.0 400 valley-way milpitas santa-clara-county
  bay-area)
 (1809 ky-nu-cafe cafe 2.0 78 dempsey-rd milpitas santa-clara-county
  bay-area)
 (1810 manila-bay-cafe cafe 2.0 1770 clear-lake-ave milpitas
  santa-clara-county bay-area)
 (1811 montague-cafe cafe 2.0 1666 centre-pointe-dr milpitas
  santa-clara-county bay-area)
 (1812 sherrys-cafe cafe 2.0 1760 houret-ct milpitas santa-clara-county
  bay-area)
 (1813 youngs-cafe cafe 2.0 1205 sassone-ct milpitas santa-clara-county
  bay-area)
 (1814 zahirs-cafe cafe 3.2 1350 s-park-victoria-dr-no.-27 milpitas
  santa-clara-county bay-area)
 (1815 coastal-affair-a cafe 2.0 0 x1-at-8th montara san-mateo-county
  bay-area)
 (1816 cappuccino cafe 2.0 588 center-st moraga unknown bay-area)
 (1817 cookhouse-cafe cafe 2.0 1012 school-st moraga unknown bay-area)
 (1818 moraga-coffee-shop cafe 2.0 1419 moraga-way moraga unknown
  bay-area)
 (1819 tommy-gs-valley-cafe cafe 2.0 552 center-st moraga unknown
  bay-area)
 (1820 bay-city-coffee-roasting-compa cafe 1.7 632 san-antonio-rd
  mountain-view santa-clara-county bay-area)
 (1821 caffe-mezzaluna cafe 2.0 650 castro-st-ste-130 mountain-view
  santa-clara-county bay-area)
 (1822 creekside-coffee cafe 2.0 0 unknown mountain-view
  santa-clara-county bay-area)
 (1823 georges-koffee-kup cafe 2.7 2483 old-middlefield-way
  mountain-view santa-clara-county bay-area)
 (1824 jjs-blues-cafe cafe 2.0 165 e-el-camino-real mountain-view
  santa-clara-county bay-area)
 (1825 jumpin-java-coffee-house cafe 2.8 744 w-dana-st mountain-view
  santa-clara-county bay-area)
 (1826 nicolinos-garden-cafe cafe 2.0 939 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (1827 shiangs-cafe cafe 2.0 1970 latham-st-apt-28 mountain-view
  santa-clara-county bay-area)
 (1828 tao-tao-cafe cafe 2.7 1351 ormonde-way mountain-view
  santa-clara-county bay-area)
 (1829 american-bistro-&-cafe cafe 2.0 1202 x1st-st napa napa-county
  napa-valley)
 (1830 caffeine-and-calories cafe 2.0 877 el-centro-ave napa
  napa-county napa-valley)
 (1831 chimney-rock-cafe cafe 2.0 5320 silverado-trl napa napa-county
  napa-valley)
 (1832 curb-side-cafe cafe 2.0 1245 x1st-st napa napa-county
  napa-valley)
 (1833 dennys cafe 2.0 4175 solano-ave napa napa-county napa-valley)
 (1834 jordeli-cafe cafe 2.0 1429 imola-ave napa napa-county
  napa-valley)
 (1835 la-crepe-cafe cafe 2.0 976 pearl-st napa napa-county
  napa-valley)
 (1836 paupaiz-espresso-bar-&-cafe cafe 2.0 1400 x2nd-st napa
  napa-county napa-valley)
 (1837 red-rock-partners/red-rock-caf cafe 2.3 1010 lincoln-ave napa
  napa-county napa-valley)
 (1838 soscol-cafe-all-affairs-cateri cafe 2.0 632 soscol-ave napa
  napa-county napa-valley)
 (1839 the-foothill-cafe cafe 2.7 2766 old-sonoma-rd napa napa-county
  napa-valley)
 (1840 bogarts-coffee-bistro cafe 1.7 5765 jarvis-ave newark
  alameda-county bay-area)
 (1841 cafe-my-tho cafe 2.3 39127 cedar-blvd newark alameda-county
  bay-area)
 (1842 dans-cafeteria cafe 2.0 39201 cherry-st newark alameda-county
  bay-area)
 (1843 fremont-ford-cafe cafe 2.0 39821 cedar-blvd-apt-109 newark
  alameda-county bay-area)
 (1844 gloria-jeans-coffee-bean-corp cafe 2.0 2098 newpark-mall newark
  alameda-county bay-area)
 (1845 minias-bake-shop cafe 2.0 36565 newark-blvd-ste-k newark
  alameda-county bay-area)
 (1846 newark-java cafe 2.0 35124 maidstone-ct newark alameda-county
  bay-area)
 (1847 peterbilt-coffee-shop cafe 2.0 4955 swindon-pl newark
  alameda-county bay-area)
 (1848 anns-cafe cafe 4.0 3401 fruitvale-ave oakland alameda-county
  bay-area)
 (1849 aroma-cafe-&-bakery cafe 2.0 1900 franklin-st oakland
  alameda-county bay-area)
 (1850 asia-coffee-shop cafe 2.0 1245 x6th-ave oakland alameda-county
  bay-area)
 (1851 brewberrys-fine-coffee cafe 2.0 4678 fair-ave oakland
  alameda-county bay-area)
 (1852 cafe cafe 2.0 3800 san-leandro-st oakland alameda-county
  bay-area)
 (1853 cafe-817 cafe 2.0 1530 wellington-st oakland alameda-county
  bay-area)
 (1854 cafe-camilles cafe 2.0 5004 telegraph-ave-no.-a oakland
  alameda-county bay-area)
 (1855 cafe-co-may cafe 2.0 417 e-18th-st oakland alameda-county
  bay-area)
 (1856 cafe-colucci cafe 2.0 6427 telegraph-ave oakland alameda-county
  bay-area)
 (1857 cafe-dathao cafe 2.0 1209 e-14th-st oakland alameda-county
  bay-area)
 (1858 cafe-eritrea-dafrique cafe 2.0 4069 telegraph-ave oakland
  alameda-county bay-area)
 (1859 cafe-green cafe 2.0 394 x12th-st-no.-d oakland alameda-county
  bay-area)
 (1860 cafe-marseille cafe 2.0 333 hegenberger-rd-ste-104 oakland
  alameda-county bay-area)
 (1861 cafe-piccolo cafe 2.0 417 x14th-st oakland alameda-county
  bay-area)
 (1862 cafe-royal cafe 2.0 2225 webster-st oakland alameda-county
  bay-area)
 (1863 cafe-spasso cafe 2.0 6021 college-ave oakland alameda-county
  bay-area)
 (1864 cafe-velarian cafe 2.0 4218 piedmont-ave oakland alameda-county
  bay-area)
 (1865 cafe-webster cafe 2.0 2101 webster-st oakland alameda-county
  bay-area)
 (1866 city-hall-plaza-grandma-coffee cafe 2.0 101 city-hall-plz
  oakland alameda-county bay-area)
 (1867 coffee-head cafe 2.3 5269 broadway oakland alameda-county
  bay-area)
 (1868 college-point-cafe cafe 2.0 5254 college-ave oakland
  alameda-county bay-area)
 (1869 dannys-cafe cafe 2.0 34 montwood-way oakland alameda-county
  bay-area)
 (1870 daves-coffee-shop cafe 2.3 4299 broadway oakland alameda-county
  bay-area)
 (1871 deck-cafe cafe 2.0 1995 embarcadero oakland alameda-county
  bay-area)
 (1872 dellas-china-cup-cafe cafe 2.0 7309 macarthur-blvd oakland
  alameda-county bay-area)
 (1873 duongs-cafe-cue cafe 2.0 1437 x23rd-ave oakland alameda-county
  bay-area)
 (1874 e-i-&-y-cafe cafe 2.0 5721 elizabeth-st oakland alameda-county
  bay-area)
 (1875 eastern-city-cafe cafe 2.0 346 x9th-st-no.-210 oakland
  alameda-county bay-area)
 (1876 eastmont-coffee-shop cafe 2.0 1 eastmont-mall-no.-34 oakland
  alameda-county bay-area)
 (1877 espresso-gourmet cafe 2.0 409 x14th-st oakland alameda-county
  bay-area)
 (1878 fongs-cafe cafe 2.0 6807 foothill-blvd oakland alameda-county
  bay-area)
 (1879 french-coffee-shop cafe 2.0 812 franklin-st oakland
  alameda-county bay-area)
 (1880 galbraith-coffee-shop cafe 2.0 10505 doolittle-dr oakland
  alameda-county bay-area)
 (1881 glenview-cafe cafe 2.0 4228 park-blvd oakland alameda-county
  bay-area)
 (1882 greggs-garden-cafe cafe 2.0 1000 broadway oakland alameda-county
  bay-area)
 (1883 hai-au-coffee-shop cafe 2.0 8209 e-14th-st oakland
  alameda-county bay-area)
 (1884 henrys-gallery-cafe cafe 2.0 1700 franklin-st oakland
  alameda-county bay-area)
 (1885 hide-a-way-cafe-dennison cafe 2.0 1920 dennison-st oakland
  alameda-county bay-area)
 (1886 hob-knob-coffee cafe 2.0 2200 broadway oakland alameda-county
  bay-area)
 (1887 hudson-bay-caffe cafe 2.3 5401 college-ave oakland
  alameda-county bay-area)
 (1888 incredible-edible-cafe cafe 2.0 2956 telegraph-ave oakland
  alameda-county bay-area)
 (1889 j-&-j-coffee-shop cafe 2.0 508 x16th-st oakland alameda-county
  bay-area)
 (1890 johns-coffee-shop cafe 2.0 3331 e-14th-st oakland alameda-county
  bay-area)
 (1891 johnnys-cafe cafe 2.0 1301 franklin-st oakland alameda-county
  bay-area)
 (1892 kans-cafeteria cafe 2.0 346 x9th-st-no.-260 oakland
  alameda-county bay-area)
 (1893 kelleys-j-l-coffee-shop cafe 2.0 444 embarcadero-w oakland
  alameda-county bay-area)
 (1894 kellys-kafe cafe 2.0 1939 fruitvale-ave oakland alameda-county
  bay-area)
 (1895 kims-coffee-shop cafe 2.0 280 w-macarthur-blvd oakland
  alameda-county bay-area)
 (1896 kings-coffee-shop cafe 2.0 3000 x38th-ave oakland alameda-county
  bay-area)
 (1897 koffee-pot cafe 2.0 2532 telegraph-ave oakland alameda-county
  bay-area)
 (1898 la-estrellita-cafe cafe 2.0 446 e-12th-st oakland alameda-county
  bay-area)
 (1899 lakeshore-coffee-roasters cafe 2.0 3415 lakeshore-ave oakland
  alameda-county bay-area)
 (1900 lang-du-cafe cafe 2.0 2285 e-14th-st oakland alameda-county
  bay-area)
 (1901 lattes-cafe cafe 2.0 1901 harrison-st oakland alameda-county
  bay-area)
 (1902 lobby-cafe cafe 2.0 5612 college-ave oakland alameda-county
  bay-area)
 (1903 lone-star-cafe cafe 2.0 2062 mountain-blvd oakland
  alameda-county bay-area)
 (1904 luis-coffee-shop cafe 2.0 5390 bancroft-ave oakland
  alameda-county bay-area)
 (1905 mamas-royal-cafe cafe 2.0 4012 broadway oakland alameda-county
  bay-area)
 (1906 mimosa-cafe cafe 2.0 462 santa-clara-ave oakland alameda-county
  bay-area)
 (1907 minnie-cafe cafe 2.0 367 x17th-st oakland alameda-county
  bay-area)
 (1908 mondtrays-cafe cafe 2.0 3016 e-14th-st oakland alameda-county
  bay-area)
 (1909 mong-mo-cafe cafe 2.0 617 e-12th-st oakland alameda-county
  bay-area)
 (1910 montclair-coffees-&-teas cafe 2.0 1952 mountain-blvd oakland
  alameda-county bay-area)
 (1911 nicoles-coffee-&-tea cafe 2.0 458 perkins-st oakland
  alameda-county bay-area)
 (1912 nineteenth-street-cafe cafe 2.0 1814 franklin-st oakland
  alameda-county bay-area)
 (1913 omars-coffee-shop-&-deli cafe 2.0 7700 edgewater-dr-ste-701
  oakland alameda-county bay-area)
 (1914 primos-coffee cafe 2.0 2101 webster-st oakland alameda-county
  bay-area)
 (1915 primos-coffee cafe 2.0 1221 broadway oakland alameda-county
  bay-area)
 (1916 rockridge-cafe cafe 2.3 5492 college-ave oakland alameda-county
  bay-area)
 (1917 royal-ground-coffee cafe 2.0 2058 mountain-blvd oakland
  alameda-county bay-area)
 (1918 salaam-cafe cafe 2.0 2021 e-24th-st oakland alameda-county
  bay-area)
 (1919 sammys-cafe cafe 2.0 3239 elm-st oakland alameda-county
  bay-area)
 (1920 seminary-coffee-shop cafe 2.0 2566 seminary-ave oakland
  alameda-county bay-area)
 (1921 songs-cafe cafe 2.0 3411 high-st oakland alameda-county
  bay-area)
 (1922 sufficient-grounds-coffee-and-cafe cafe 2.0 405
  x14th-st-ste-1200 oakland alameda-county bay-area)
 (1923 summit-cafe cafe 2.0 411 x30th-st oakland alameda-county
  bay-area)
 (1924 telegraph-cafe cafe 2.0 1711 telegraph-ave oakland
  alameda-county bay-area)
 (1925 the-beach-cafe cafe 2.0 7250 doolittle-dr oakland alameda-county
  bay-area)
 (1926 the-golden-bear-cafe cafe 2.0 389 grand-ave oakland
  alameda-county bay-area)
 (1927 the-hideaway-cafe cafe 2.0 6430 telegraph-ave oakland
  alameda-county bay-area)
 (1928 the-king-fish-cafe cafe 2.0 5227 claremont-ave oakland
  alameda-county bay-area)
 (1929 the-southern-cafe cafe 2.0 5327 e-14th-st oakland alameda-county
  bay-area)
 (1930 tryangle-cafe cafe 2.0 2534 mandela-pky oakland alameda-county
  bay-area)
 (1931 twentyth-street-grill-&-cafe cafe 2.0 466 x20th-st oakland
  alameda-county bay-area)
 (1932 twentythird-street-cafe cafe 2.0 326 x23rd-st oakland
  alameda-county bay-area)
 (1933 ultimate-grounds cafe 2.0 4255 park-blvd oakland alameda-county
  bay-area)
 (1934 vulcan-cafe cafe 2.0 915 x45th-ave oakland alameda-county
  bay-area)
 (1935 panther-cafe cafe 2.0 5029 teakwood-dr oakley
  contra-costa-county bay-area)
 (1936 caffe-teatro cafe 2.3 2 theatre-sq-ste-151 orinda
  contra-costa-county bay-area)
 (1937 hillerys-cafe cafe 2.0 87 orinda-way orinda contra-costa-county
  bay-area)
 (1938 shelbys cafe 2.6 43 charles-hill-rd orinda contra-costa-county
  bay-area)
 (1939 paddock-coffee-shop cafe 2.0 5921 pacheco-blvd pacheco unknown
  unknown)
 (1940 chez-d-cafe cafe 4.0 220 paloma-ave pacifica san-mateo-county
  bay-area)
 (1941 espresso-espresso cafe 2.0 0 unknown pacifica san-mateo-county
  bay-area)
 (1942 kerris-coffee-shop cafe 2.0 1241 linda-mar-shopping-ctr pacifica
  san-mateo-county bay-area)
 (1943 pacific-java cafe 3.3 450 dondee-st-no.-6 pacifica
  san-mateo-county bay-area)
 (1944 rons-cafe cafe 2.0 224 avalon-dr pacifica san-mateo-county
  bay-area)
 (1945 saddletown-cafe cafe 3.2 650 cape-breton-dr pacifica
  san-mateo-county bay-area)
 (1946 the-fog-cafe cafe 2.3 1821 palmetto-ave pacifica
  san-mateo-county bay-area)
 (1947 blue-chalk-cafe cafe 3.3 700 high-st palo-alto
  santa-clara-county bay-area)
 (1948 cafe-andrea cafe 2.7 610 stanford-shopping-ctr palo-alto
  santa-clara-county bay-area)
 (1949 printers-inc cafe 2.2 320 s-california-ave palo-alto
  santa-clara-county bay-area)
 (1950 cafe-eden cafe 2.0 655 arastradero-rd palo-alto
  santa-clara-county bay-area)
 (1951 cafe-sophia-&-coffee-roasting cafe 2.0 3904 middlefield-rd
  palo-alto santa-clara-county bay-area)
 (1952 jims-coffee-shop cafe 1.8 274 university-ave palo-alto
  santa-clara-county bay-area)
 (1953 joanies-cafe cafe 3.2 447 s-california-ave palo-alto
  santa-clara-county bay-area)
 (1954 kjs-cafe-a-la-carte cafe 2.0 307 kipling-st palo-alto
  santa-clara-county bay-area)
 (1955 la-creme-de-cafe cafe 2.0 3191 middlefield-rd palo-alto
  santa-clara-county bay-area)
 (1956 lytton-roasting cafe 2.3 401 lytton-ave palo-alto
  santa-clara-county bay-area)
 (1957 palo-alto-coffee-roasting-co cafe 3.3 159 stanford-shopping-ctr
  palo-alto santa-clara-county bay-area)
 (1958 palo-alto-coffee-roasting-co cafe 3.0 4119 el-camino-real
  palo-alto santa-clara-county bay-area)
 (1959 st-michaels-art-cafe cafe 2.8 0 unknown palo-alto
  santa-clara-county bay-area)
 (1960 starbucks-coffee cafe 1.8 276 university-ave palo-alto
  santa-clara-county bay-area)
 (1961 the-knot-hole-cafe cafe 2.0 4329 el-camino-real palo-alto
  santa-clara-county bay-area)
 (1962 the-terrace-cafe cafe 2.0 0 unknown palo-alto santa-clara-county
  bay-area)
 (1963 university-college-cafe cafe 2.1 271 university-ave palo-alto
  santa-clara-county bay-area)
 (1964 harold-chungs-cafe-elegrante cafe 2.0 130 latham-st piedmont
  alameda-county bay-area)
 (1965 bolos-espresso cafe 2.0 730 san-pablo-ave-apt-c-4 pinole
  contra-costa-county bay-area)
 (1966 espresso-a-la-carte cafe 2.0 1252 oak-ridge-ln pinole
  contra-costa-county bay-area)
 (1967 golden-oak-cafe cafe 2.0 3557 ponderosa-trl pinole
  contra-costa-county bay-area)
 (1968 terrace-cafe cafe 2.0 2840 goularte-dr pinole
  contra-costa-county bay-area)
 (1969 the-alley-cafe cafe 3.0 2265 pear-st pinole contra-costa-county
  bay-area)
 (1970 blew-whale-cafe cafe 2.0 306 railroad pittsburg
  contra-costa-county bay-area)
 (1971 dows-cafeteria cafe 2.0 1085 alamo-ct pittsburg
  contra-costa-county bay-area)
 (1972 andys-coffee-shop cafe 2.0 2265 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (1973 cafe-milano cafe 2.7 716 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (1974 fountainside-cafe cafe 2.0 250 camino-las-juntas pleasant-hill
  contra-costa-county bay-area)
 (1975 luppes-cafeteria-service cafe 2.0 120 chaucer-ct pleasant-hill
  contra-costa-county bay-area)
 (1976 plaza-cafe cafe 2.0 1912 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (1977 theresas-cafe cafe 2.0 75 mckissick-st pleasant-hill
  contra-costa-county bay-area)
 (1978 angies-cafe cafe 2.0 11555 dublin-canyon-rd pleasanton
  alameda-county bay-area)
 (1979 cafe-aioei cafe 2.0 4713 x1st-st-ste-150 pleasanton
  alameda-county bay-area)
 (1980 cafe-dansk cafe 2.0 4290 stanley-blvd pleasanton alameda-county
  bay-area)
 (1981 cafe-de-amis cafe 2.0 3966 stoneridge-dr-apt-8 pleasanton
  alameda-county bay-area)
 (1982 caffe-elegante cafe 2.7 1987 santa-rita-rd-ste-h pleasanton
  alameda-county bay-area)
 (1983 coffee-roast-express cafe 2.3 30 w-neal-st-ste-110 pleasanton
  alameda-county bay-area)
 (1984 deans-cafe cafe 2.6 620 main-st pleasanton alameda-county
  bay-area)
 (1985 downtown-garden-cafe cafe 2.0 724 main-st pleasanton
  alameda-county bay-area)
 (1986 el-portal-cafe cafe 2.0 310 main-st-ste-a pleasanton
  alameda-county bay-area)
 (1987 heublein-cafeteria cafe 2.0 3107 randick-ct pleasanton
  alameda-county bay-area)
 (1988 java-junction cafe 2.0 755 rose-ave-apt-9 pleasanton
  alameda-county bay-area)
 (1989 julies-cafe cafe 2.0 7601 stoneridge-dr pleasanton
  alameda-county bay-area)
 (1990 kaiser-cafe cafe 2.0 6177 sunol-blvd pleasanton alameda-county
  bay-area)
 (1991 merritt-college-cafeteria cafe 2.0 2520 via-espada pleasanton
  alameda-county bay-area)
 (1992 pleasanton-cafe cafe 2.0 3657 old-santa-rita-rd-apt-a pleasanton
  alameda-county bay-area)
 (1993 sassys-cafe cafe 3.0 4275 rosewood-dr-ste-20 pleasanton
  alameda-county bay-area)
 (1994 stable-cafe cafe 2.0 4501 pleasanton-ave pleasanton
  alameda-county bay-area)
 (1995 the-atrium-cafe cafe 2.0 5776 stoneridge-mall-rd-ste-110
  pleasanton alameda-county bay-area)
 (1996 the-coffee-company cafe 2.0 5424 sunol-blvd-ste-7 pleasanton
  alameda-county bay-area)
 (1997 the-coffee-company cafe 2.0 4211 b-rosewood-dr pleasanton
  alameda-county bay-area)
 (1998 valley-cafe cafe 2.0 4301 valley-ave-no.-b pleasanton
  alameda-county bay-area)
 (1999 wall-street-cafe cafe 2.0 6140 stoneridge-mall-rd-ste-155
  pleasanton alameda-county bay-area)
 (2000 big-foot-cafe cafe 1.7 2300 bay-rd redwood-city san-mateo-county
  bay-area)
 (2001 cafe-figaro cafe 2.7 2639 broadway redwood-city san-mateo-county
  bay-area)
 (2002 cafe-helmut cafe 2.3 701 chesapeake-dr redwood-city
  san-mateo-county bay-area)
 (2003 cafe-lucca cafe 2.0 630 el-camino-real redwood-city
  san-mateo-county bay-area)
 (2004 cafe-natlay cafe 2.0 822 lakeshore-dr redwood-city
  san-mateo-county bay-area)
 (2005 champlins-cafeteria cafe 2.0 401 marshall-st redwood-city
  san-mateo-county bay-area)
 (2006 court-house-coffee-shop cafe 2.0 0 unknown redwood-city
  san-mateo-county bay-area)
 (2007 darios-cafe cafe 2.7 2415 broadway redwood-city san-mateo-county
  bay-area)
 (2008 dimitris-cafe cafe 2.0 3726 florence-st redwood-city
  san-mateo-county bay-area)
 (2009 i-b-m-kims-cafeteria cafe 2.0 2010 nassau-dr redwood-city
  san-mateo-county bay-area)
 (2010 johns-coffee-shop cafe 2.0 2614 broadway redwood-city
  san-mateo-county bay-area)
 (2011 main-st-coffee-roasting cafe 2.8 1112 main-st redwood-city
  san-mateo-county bay-area)
 (2012 spankys-cafe cafe 2.0 4 cadiz-cir redwood-city san-mateo-county
  bay-area)
 (2013 spankys-cafe cafe 2.3 2114 broadway redwood-city
  san-mateo-county bay-area)
 (2014 starbucks-coffee cafe 2.0 1045 el-camino-real redwood-city
  san-mateo-county bay-area)
 (2015 the-patio-cafe cafe 2.0 1 lagoon-dr-ste-150 redwood-city
  san-mateo-county bay-area)
 (2016 the-redwood-cafe-&-spice-company cafe 3.0 1020 main-st
  redwood-city san-mateo-county bay-area)
 (2017 transit-cafe cafe 2.0 934 brewster-ave redwood-city
  san-mateo-county bay-area)
 (2018 twin-dolphin-cafe cafe 2.0 333 twin-dolphin-dr redwood-city
  san-mateo-county bay-area)
 (2019 venus-cafe cafe 2.0 2655 broadway redwood-city san-mateo-county
  bay-area)
 (2020 waterfront-cafe cafe 2.0 650 bair-island-rd-ste-102 redwood-city
  san-mateo-county bay-area)
 (2021 woodside-coffee-shop-&-tavern cafe 2.0 768 woodside-rd
  redwood-city san-mateo-county bay-area)
 (2022 cafe-annie cafe 2.0 130 washington-ave richmond
  contra-costa-county bay-area)
 (2023 cafe-mc-bryde cafe 2.0 4925 mcbryde-ave richmond
  contra-costa-county bay-area)
 (2024 cafeteria cafe 2.0 1108 bissell-ave richmond contra-costa-county
  bay-area)
 (2025 chapalas-mexican-cafe cafe 2.0 201 tweksbury-ave richmond
  contra-costa-county bay-area)
 (2026 golden-star-cafe cafe 2.0 1400 macdonald-ave richmond
  contra-costa-county bay-area)
 (2027 hidden-city-cafe cafe 3.0 109 park-pl richmond
  contra-costa-county bay-area)
 (2028 kamelias-cafe cafe 2.0 1300 quarry-ct-apt-308 richmond
  contra-costa-county bay-area)
 (2029 lake-merritt-cafe cafe 2.0 5737 skyview-pl richmond
  contra-costa-county bay-area)
 (2030 r-&-b-coffee-shop-&-catering cafe 2.0 332 macdonald-ave richmond
  contra-costa-county bay-area)
 (2031 rosier-gourmet-coffee-cart cafe 2.0 2824 regatta-blvd richmond
  contra-costa-county bay-area)
 (2032 the-honolulu-cafe cafe 2.0 12056 san-pablo-ave richmond
  contra-costa-county bay-area)
 (2033 union-oil-company-cafeteria cafe 2.0 1380 san-pablo-ave rodeo
  unknown unknown)
 (2034 brentwood-bowl-coffee-shop cafe 2.0 237 el-camino-real
  south-san-francisco san-mateo-county bay-area)
 (2035 cable-car-coffee-shop cafe 2.0 423 x12-grand-ave
  south-san-francisco san-mateo-county bay-area)
 (2036 cafe-de-venice cafe 2.0 562 poplar-ave south-san-francisco
  san-mateo-county bay-area)
 (2037 cappuccinos-cafe cafe 2.0 112 grand-ave south-san-francisco
  san-mateo-county bay-area)
 (2038 colazione-cafe cafe 2.0 290 utah-ave-bldg-b-ste
  south-san-francisco san-mateo-county bay-area)
 (2039 country-cottage-cafe cafe 2.0 238 x12-grand-ave
  south-san-francisco san-mateo-county bay-area)
 (2040 gunters-restaurant cafe 2.5 1057 el-camino-real-no.-59
  south-san-francisco san-mateo-county bay-area)
 (2041 hof-brau-cafe cafe 2.0 178 airport-blvd south-san-francisco
  san-mateo-county bay-area)
 (2042 hogans-cafe cafe 2.7 125 terminal-ct-no.-44 south-san-francisco
  san-mateo-county bay-area)
 (2043 indonesia-cafe cafe 2.0 2221 greendale-dr south-san-francisco
  san-mateo-county bay-area)
 (2044 joanns-cafe cafe 3.4 1131 el-camino-real south-san-francisco
  san-mateo-county bay-area)
 (2045 levitz-coffee-shop cafe 2.0 900 dubuque-ave south-san-francisco
  san-mateo-county bay-area)
 (2046 mr-green-beans-gourmet-coffee cafe 2.0 3860 crofton-way
  south-san-francisco san-mateo-county bay-area)
 (2047 southgate-coffee-shop cafe 2.0 8 clara-ave south-san-francisco
  san-mateo-county bay-area)
 (2048 the-patio-cafe cafe 2.0 1313 grandview-dr south-san-francisco
  san-mateo-county bay-area)
 (2049 green-valley-cafe cafe 2.0 1310 main-st saint-helena napa-county
  napa-valley)
 (2050 magnolia-cafe cafe 2.0 1118 hunt-ave saint-helena napa-county
  napa-valley)
 (2051 pairs-parkside-cafe cafe 2.5 1420 main-st saint-helena
  napa-county napa-valley)
 (2052 aquarius-coffee-shop cafe 2.0 487 san-mateo-ave san-bruno
  san-mateo-county bay-area)
 (2053 cafe-on-the-lake cafe 2.0 1200 bayhill-dr-no.-121 san-bruno
  san-mateo-county bay-area)
 (2054 camino-corner-coffee-shop-& cafe 2.0 110 el-camino-real
  san-bruno san-mateo-county bay-area)
 (2055 coffee-and-tobacco-club cafe 2.0 441 el-camino-real san-bruno
  san-mateo-county bay-area)
 (2056 double-rainbow-cafe cafe 2.0 1230 el-camino-real san-bruno
  san-mateo-county bay-area)
 (2057 herlindas-cafe cafe 2.0 108 skycrest-shopping-ctr san-bruno
  san-mateo-county bay-area)
 (2058 india-cafe cafe 2.3 189 el-camino-real san-bruno
  san-mateo-county bay-area)
 (2059 renees-cafe cafe 2.0 951 glenview-dr san-bruno san-mateo-county
  bay-area)
 (2060 serra-coffee cafe 2.0 0 unknown san-bruno san-mateo-county
  bay-area)
 (2061 spankys-cafe cafe 2.0 632 san-mateo-ave san-bruno
  san-mateo-county bay-area)
 (2062 cafe-gabriel cafe 2.0 990 industrial-rd san-carlos
  san-mateo-county bay-area)
 (2063 cafe-la-tosca cafe 2.8 777 laurel-st san-carlos san-mateo-county
  bay-area)
 (2064 coffee-aroma cafe 2.0 1261 san-carlos-ave san-carlos
  san-mateo-county bay-area)
 (2065 commons-cafe cafe 2.0 3 chicory-ln san-carlos san-mateo-county
  bay-area)
 (2066 depot-cafe cafe 2.6 599 el-camino-real san-carlos
  san-mateo-county bay-area)
 (2067 great-cafe-at-litton cafe 2.0 960 industrial-rd san-carlos
  san-mateo-county bay-area)
 (2068 jeans-cafe cafe 2.0 301 industrial-rd san-carlos
  san-mateo-county bay-area)
 (2069 le-boulanger-cafe-bakery cafe 2.3 622 laurel-st san-carlos
  san-mateo-county bay-area)
 (2070 nicks-cafe cafe 2.0 1691 bayport-ave-bld-4 san-carlos
  san-mateo-county bay-area)
 (2071 peninsula-cafe cafe 2.0 344 el-camino-real san-carlos
  san-mateo-county bay-area)
 (2072 sweet-darling-cafe cafe 2.0 3414 brittan-ave san-carlos
  san-mateo-county bay-area)
 (2073 up-town-cafe cafe 2.7 769 laurel-st. san-carlos san-mateo-county
  bay-area)
 (2074 angelinas-caffe-&-catering cafe 2.0 6000 california
  san-francisco san-francisco-county bay-area)
 (2075 arts-coffee-shop cafe 2.0 138 church san-francisco
  san-francisco-county bay-area)
 (2076 cafe cafe 2.0 2885 diamond san-francisco san-francisco-county
  bay-area)
 (2077 cafe-europa cafe 2.0 362 columbus-avenue san-francisco
  san-francisco-county bay-area)
 (2078 cafe-jacqueline cafe 2.3 1454 grant-avenue san-francisco
  san-francisco-county bay-area)
 (2079 cafe-la-boheme cafe 2.0 3318 x24th san-francisco
  san-francisco-county bay-area)
 (2080 caffe-delle-stelle cafe 2.8 330 gough san-francisco
  san-francisco-county bay-area)
 (2081 caffe-puccini cafe 2.0 411 columbus-avenue san-francisco
  san-francisco-county bay-area)
 (2082 eats cafe 2.0 50 clement san-francisco san-francisco-county
  bay-area)
 (2083 french-village cafe 2.0 60 west-portal-avenue san-francisco
  san-francisco-county bay-area)
 (2084 herbs-fine-food cafe 2.0 3991 x24th san-francisco
  san-francisco-county bay-area)
 (2085 judys-cafe cafe 2.5 2268 chestnut san-francisco
  san-francisco-county bay-area)
 (2086 judys-homestyle-cafe cafe 2.3 2268 chestnut san-francisco
  san-francisco-county bay-area)
 (2087 le-cafe cafe 2.0 1155 market san-francisco san-francisco-county
  bay-area)
 (2088 polk-street-beans-&-care cafe 2.0 1733 polk san-francisco
  san-francisco-county bay-area)
 (2089 sprouts-coffee-shop cafe 2.0 3 embarcadero-center san-francisco
  san-francisco-county bay-area)
 (2090 stella-pastry-&-cafe cafe 2.3 446 columbus-avenue san-francisco
  san-francisco-county bay-area)
 (2091 tassee cafe 2.0 1826 buchanan san-francisco san-francisco-county
  bay-area)
 (2092 the-savoy-tivoli cafe 2.5 1434 grant-avenue san-francisco
  san-francisco-county bay-area)
 (2093 a-&-d-cafeteria cafe 2.0 2921 tobin-dr san-jose
  santa-clara-county bay-area)
 (2094 adac-cafeteria cafe 2.0 3362 bien-way san-jose
  santa-clara-county bay-area)
 (2095 alexis-restaurant cafe 2.3 nil nil san-jose santa-clara-county
  bay-area)
 (2096 apollos-downtown-cafe cafe 2.0 260 n-6th-st san-jose
  santa-clara-county bay-area)
 (2097 b-&-j-cafe cafe 2.0 1460 old-oakland-rd-no.-b san-jose
  santa-clara-county bay-area)
 (2098 bills-cafe cafe 2.0 1115 willow-st san-jose santa-clara-county
  bay-area)
 (2099 blazenas-cafe cafe 2.0 5647 lathrop-dr san-jose
  santa-clara-county bay-area)
 (2100 bo-gia-cafe cafe 2.0 175 s-capitol-ave san-jose
  santa-clara-county bay-area)
 (2101 bonjour-cafe cafe 2.0 2590 s-bascom-ave-no.-e-b san-jose
  santa-clara-county bay-area)
 (2102 buzz-in-cafe cafe 2.0 1102 bird-ave san-jose santa-clara-county
  bay-area)
 (2103 cafe-1850 cafe 2.0 1718 parkview-green-cir san-jose
  santa-clara-county bay-area)
 (2104 cafe-de-matisse cafe 2.0 371 s-1st-st san-jose
  santa-clara-county bay-area)
 (2105 cafe-de-roma cafe 2.0 110 paseo-de-san-antonio san-jose
  santa-clara-county bay-area)
 (2106 cafe-di-vang cafe 2.0 1023 e-capitol-expy san-jose
  santa-clara-county bay-area)
 (2107 cafe-fame cafe 2.0 62 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (2108 cafe-lan cafe 2.0 2861 senter-rd san-jose santa-clara-county
  bay-area)
 (2109 cafe-meridian cafe 2.0 580 meridian-ave san-jose
  santa-clara-county bay-area)
 (2110 cafe-paradise cafe 2.0 1106 saratoga-ave san-jose
  santa-clara-county bay-area)
 (2111 cafe-rosa cafe 2.0 1639 rossburn-ct san-jose santa-clara-county
  bay-area)
 (2112 cafe-scarpelli cafe 2.0 1038 leigh-ave-no.-120 san-jose
  santa-clara-county bay-area)
 (2113 cafe-sophia cafe 2.0 1725 technology-dr san-jose
  santa-clara-county bay-area)
 (2114 caffe-adria cafe 2.0 7018 shearwater-dr san-jose
  santa-clara-county bay-area)
 (2115 caffe-dolce cafe 2.0 185 park-ave-no.-179 san-jose
  santa-clara-county bay-area)
 (2116 caffe-italia cafe 2.0 6574 san-ignacio-ave san-jose
  santa-clara-county bay-area)
 (2117 cappuccino-a-la-carte cafe 2.0 2828 westgrove-ln san-jose
  santa-clara-county bay-area)
 (2118 century-cafe cafe 2.0 100 homeland-ct-no.-120 san-jose
  santa-clara-county bay-area)
 (2119 charlyns-cafe cafe 2.0 4451 houndshaven-way san-jose
  santa-clara-county bay-area)
 (2120 cisco-cafe cafe 2.0 5637 ora-st san-jose santa-clara-county
  bay-area)
 (2121 coffee-plus cafe 2.0 3228 hostetter-rd san-jose
  santa-clara-county bay-area)
 (2122 coffee-talk cafe 2.0 1383 lincoln-ave san-jose
  santa-clara-county bay-area)
 (2123 colonial-inn-coffee-shop cafe 2.0 1140 hillsdale-ave san-jose
  santa-clara-county bay-area)
 (2124 commons-cafe cafe 2.0 2700 n-1st-st san-jose santa-clara-county
  bay-area)
 (2125 condor-cafe cafe 2.0 668 shirecrest-ct san-jose
  santa-clara-county bay-area)
 (2126 condor-cafe cafe 2.0 2133 branham-ln san-jose santa-clara-county
  bay-area)
 (2127 d-ds-cafe cafe 2.0 2055 gateway-pl-no.-100 san-jose
  santa-clara-county bay-area)
 (2128 dalat-cafe cafe 2.0 408 e-william-st san-jose santa-clara-county
  bay-area)
 (2129 deezi-cafe cafe 2.0 2062 curtner-ave san-jose santa-clara-county
  bay-area)
 (2130 do-thanh-restaurant-&-coffee cafe 2.0 322 e-santa-clara-st
  san-jose santa-clara-county bay-area)
 (2131 el-paso-cafe cafe 2.0 1 almaden-blvd-ste-204 san-jose
  santa-clara-county bay-area)
 (2132 el-savoy-cafe cafe 2.0 1030 n-10th-st san-jose
  santa-clara-county bay-area)
 (2133 f-j-&-w-cafe cafe 2.0 1255 oak-knoll-dr san-jose
  santa-clara-county bay-area)
 (2134 fat-city-cafe cafe 2.0 2288 lincoln-ave san-jose
  santa-clara-county bay-area)
 (2135 fiesta-cafe cafe 2.0 840 willow-st-no.-a-100 san-jose
  santa-clara-county bay-area)
 (2136 first-american-cafe cafe 2.0 675 n-1st-st-ste-305 san-jose
  santa-clara-county bay-area)
 (2137 first-floor-cafe cafe 2.0 25 n-14th-st-ste-130 san-jose
  santa-clara-county bay-area)
 (2138 flames-coffee-shop cafe 2.3 1812 hillsdale-ave san-jose
  santa-clara-county bay-area)
 (2139 flames-coffee-shop cafe 2.3 449 s-winchester-blvd san-jose
  santa-clara-county bay-area)
 (2140 fourth-street-cafe cafe 2.0 1560 n-4th-st san-jose
  santa-clara-county bay-area)
 (2141 freds-coffee-roasting cafe 2.0 29 n-san-pedro-st san-jose
  santa-clara-county bay-area)
 (2142 giang-ngoc-cafe cafe 2.0 1088 thorndale-ct san-jose
  santa-clara-county bay-area)
 (2143 gloria-jeans-coffee-bean-corp cafe 2.0 337 eastridge-mall
  san-jose santa-clara-county bay-area)
 (2144 hardwork-cafe cafe 2.0 1620 almaden-rd san-jose
  santa-clara-county bay-area)
 (2145 heo-may-cafe cafe 2.0 2398 senter-rd san-jose santa-clara-county
  bay-area)
 (2146 bens-fast-food cafe 2.0 27 fountain-aly san-jose
  santa-clara-county bay-area)
 (2147 jjs-blues-cafe cafe 2.0 4943 massachusetts-dr san-jose
  santa-clara-county bay-area)
 (2148 junction-cafe cafe 2.0 1758 junction-ave-no.-1a san-jose
  santa-clara-county bay-area)
 (2149 kangs-cafe cafe 2.0 1146 keltner-ave san-jose santa-clara-county
  bay-area)
 (2150 kjs-cafe-a-la-carte cafe 2.0 675 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (2151 kjs-cafe-a-la-carte cafe 2.0 250 hospital-pky san-jose
  santa-clara-county bay-area)
 (2152 kjs-cafe-a-la-carte cafe 2.0 751 s-bascom-ave san-jose
  santa-clara-county bay-area)
 (2153 kla-ii-cafe cafe 2.0 1305 piland-dr san-jose santa-clara-county
  bay-area)
 (2154 lang-thang-cafe cafe 2.0 1969 tully-rd-no.-a san-jose
  santa-clara-county bay-area)
 (2155 lang-tu-cafe cafe 2.0 3975 senter-rd san-jose santa-clara-county
  bay-area)
 (2156 le-bon-cafe cafe 2.0 210 town-and-country-vlg san-jose
  santa-clara-county bay-area)
 (2157 lee-&-ginas-cafe cafe 2.0 1503 timber-creek-dr san-jose
  santa-clara-county bay-area)
 (2158 linear-cafeteria cafe 2.0 747 creekfield-dr san-jose
  santa-clara-county bay-area)
 (2159 loral-cafeteria cafe 2.0 3151 zanker-rd san-jose
  santa-clara-county bay-area)
 (2160 louis-cafe-&-bbq cafe 3.0 6195 santa-teresa-blvd san-jose
  santa-clara-county bay-area)
 (2161 may-cafe cafe 2.0 2176 laddie-ct san-jose santa-clara-county
  bay-area)
 (2162 metro-plaza-cafe-&-grill cafe 2.0 191 metro-dr san-jose
  santa-clara-county bay-area)
 (2163 mikes-cafe cafe 2.0 905 s-bascom-ave san-jose santa-clara-county
  bay-area)
 (2164 mimos-cafe-san-jose cafe 2.0 2540 n-1st-st san-jose
  santa-clara-county bay-area)
 (2165 minh-vu-billiards-&-cafe cafe 2.0 2245 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (2166 moulin-rouge-coffee-roasting cafe 2.0 628 town-and-country-vlg
  san-jose santa-clara-county bay-area)
 (2167 mr-gs-sports-cafe cafe 2.0 2121 monterey-hwy san-jose
  santa-clara-county bay-area)
 (2168 my-my-coffee-&-sandwiches cafe 2.0 301 n-jackson-ave-no.-6
  san-jose santa-clara-county bay-area)
 (2169 new-fourth-street-coffee-shop cafe 2.0 1441 n-4th-st san-jose
  santa-clara-county bay-area)
 (2170 ngu-uyen-cafe cafe 2.0 3161 senter-rd-no.-a san-jose
  santa-clara-county bay-area)
 (2171 oasis-cafe cafe 2.0 2208 business-cir san-jose
  santa-clara-county bay-area)
 (2172 octel-cafeteria cafe 2.0 3669 turnwood-ct san-jose
  santa-clara-county bay-area)
 (2173 old-bayshore-cafe cafe 2.0 1764 old-bayshore-hwy san-jose
  santa-clara-county bay-area)
 (2174 plaza-cafe cafe 2.0 2444 moorpark-ave-ste-103 san-jose
  santa-clara-county bay-area)
 (2175 poco-cafe cafe 2.0 1688 hostetter-rd-no.-c san-jose
  santa-clara-county bay-area)
 (2176 quality-cafe&-deangelos-cater cafe 2.0 175 e-santa-clara-st
  san-jose santa-clara-county bay-area)
 (2177 raisleys-donut-cafe cafe 2.0 36 s-1st-st san-jose
  santa-clara-county bay-area)
 (2178 roof-top-cafe cafe 2.0 1245 s-winchester-blvd-no.-316 san-jose
  santa-clara-county bay-area)
 (2179 ross-1-cafeteria cafe 2.0 1428 lujoso-ct san-jose
  santa-clara-county bay-area)
 (2180 royale-coffee-roasting cafe 2.0 5293 prospect-rd-bldg-a san-jose
  santa-clara-county bay-area)
 (2181 rubens-cafe cafe 2.0 1661 mckee-rd san-jose santa-clara-county
  bay-area)
 (2182 sam-sung-cafeteria cafe 2.0 3655 n-1st-st san-jose
  santa-clara-county bay-area)
 (2183 san-jose-coffee-shop cafe 2.0 1860 the-alameda san-jose
  santa-clara-county bay-area)
 (2184 santa-teresa-coffee-shop cafe 2.0 7170 santa-teresa-blvd
  san-jose santa-clara-county bay-area)
 (2185 sao-dem-cafe-shop cafe 2.0 1657 tully-rd san-jose
  santa-clara-county bay-area)
 (2186 sci-cafe cafe 2.0 2000 ringwood-ave san-jose santa-clara-county
  bay-area)
 (2187 scv-wd-cafe cafe 2.0 667 bedivere-dr san-jose santa-clara-county
  bay-area)
 (2188 south-city-cafe cafe 3.2 1160 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (2189 south-side-cafe cafe 2.0 7028 santa-teresa-blvd san-jose
  santa-clara-county bay-area)
 (2190 stanford-cafe cafe 2.0 787 dubanski-dr san-jose
  santa-clara-county bay-area)
 (2191 starbucks-coffee cafe 2.0 854 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (2192 stratacom-cafeteria cafe 2.0 1385 cabrillo-ave san-jose
  santa-clara-county bay-area)
 (2193 teasara-cafe cafe 2.3 1138 saratoga-ave san-jose
  santa-clara-county bay-area)
 (2194 the-concourse-cafe cafe 2.0 3395 taper-ave san-jose
  santa-clara-county bay-area)
 (2195 thuy-duong-cafe cafe 2.0 535 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (2196 tinas-tds-cafeteria cafe 2.0 3428 madrid-dr san-jose
  santa-clara-county bay-area)
 (2197 tinh-cafe cafe 2.0 1915 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (2198 trines-cafe cafe 2.0 2825 s-white-rd san-jose santa-clara-county
  bay-area)
 (2199 trines-cafe-no cafe 2.0 428 toyon-ave san-jose
  santa-clara-county bay-area)
 (2200 trines-cafe cafe 2.0 146 s-jackson-ave san-jose
  santa-clara-county bay-area)
 (2201 trinis-cafe cafe 2.0 62 s-2nd-st san-jose santa-clara-county
  bay-area)
 (2202 victorias-cafe cafe 2.0 399 n-capitol-ave san-jose
  santa-clara-county bay-area)
 (2203 victorias-cafe cafe 2.0 2911 glen-craig-ct san-jose
  santa-clara-county bay-area)
 (2204 wen-yen-coffee-shop cafe 2.0 3095 mckee-rd san-jose
  santa-clara-county bay-area)
 (2205 winchester-coffee-house cafe 2.0 1101
  s-winchester-blvd-ste-p-300 san-jose santa-clara-county bay-area)
 (2206 xinh-xinh-cafe cafe 2.0 1075 tully-rd-no.-c san-jose
  santa-clara-county bay-area)
 (2207 yokohama-cafe cafe 2.0 230 jackson-st san-jose
  santa-clara-county bay-area)
 (2208 yorks-little-cafe cafe 2.0 2847 story-rd san-jose
  santa-clara-county bay-area)
 (2209 youngs-cafeteria cafe 2.0 2904 orchard-pky san-jose
  santa-clara-county bay-area)
 (2210 youngs-cafeteria cafe 2.0 3055 orchard-dr san-jose
  santa-clara-county bay-area)
 (2211 zitel-cafeteria cafe 2.0 6247 channel-dr san-jose
  santa-clara-county bay-area)
 (2212 asante-cafe cafe 2.0 281 juana-ave-apt-204 san-leandro
  alameda-county bay-area)
 (2213 cafe-europa cafe 2.0 833 hollyhock-dr san-leandro alameda-county
  bay-area)
 (2214 hot-line-coffee-shop cafe 2.0 2956 teagarden-st san-leandro
  alameda-county bay-area)
 (2215 kim-&-kathys-curb-cafe cafe 2.0 1915 fairway-dr san-leandro
  alameda-county bay-area)
 (2216 levitz-coffee-shop cafe 2.0 15362 farnsworth-st san-leandro
  alameda-county bay-area)
 (2217 p-i-cafe cafe 2.0 771 warden-ave san-leandro alameda-county
  bay-area)
 (2218 pelton-cafe cafe 2.0 194 pelton-center-way san-leandro
  alameda-county bay-area)
 (2219 presco-lite-cafeteria cafe 2.0 1251 doolittle-dr san-leandro
  alameda-county bay-area)
 (2220 real-rock-club-&-cafe cafe 2.0 907 burkhart-ave san-leandro
  alameda-county bay-area)
 (2221 ronakers-coffee-shop cafe 2.0 2123 doolittle-dr san-leandro
  alameda-county bay-area)
 (2222 royal-cafe cafe 2.0 794 davis-st san-leandro alameda-county
  bay-area)
 (2223 sabinos-coffee cafe 2.0 1273 macarthur-blvd san-leandro
  alameda-county bay-area)
 (2224 salsa-cafe cafe 2.0 395 bancroft-ave san-leandro alameda-county
  bay-area)
 (2225 sues-j-cafe cafe 2.0 787 crocus-dr san-leandro alameda-county
  bay-area)
 (2226 sunrise-cafe cafe 2.0 1865 orchard-ave san-leandro
  alameda-county bay-area)
 (2227 suzies-coffee-shop cafe 2.0 201 e-14th-st san-leandro
  alameda-county bay-area)
 (2228 the-cornerstone-cafe cafe 3.0 600 dutton-ave san-leandro
  alameda-county bay-area)
 (2229 the-cove-cafe cafe 2.0 16855 robey-dr san-leandro alameda-county
  bay-area)
 (2230 annas-cafe cafe 2.0 1403 bockman-rd san-lorenzo alameda-county
  bay-area)
 (2231 village-cafe cafe 2.0 573 paseo-grande san-lorenzo
  alameda-county bay-area)
 (2232 san-martin-cafe cafe 3.3 2045 e-san-martin-ave-no.-a san-martin
  santa-clara-county bay-area)
 (2233 aylas-cafe-&-grill cafe 2.0 173 e-4th-ave san-mateo
  san-mateo-county bay-area)
 (2234 bayshore-cafe cafe 2.0 1726 s-amphlett-blvd san-mateo
  san-mateo-county bay-area)
 (2235 bovet-road-cafe cafe 2.0 155 bovet-rd san-mateo san-mateo-county
  bay-area)
 (2236 cafe-for-all-seasons cafe 2.0 50 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (2237 ceresio-cafe cafe 3.0 742 polhemus-rd san-mateo san-mateo-county
  bay-area)
 (2238 clubhouse-coffee-shop cafe 2.0 2121 s-el-camino-real-no.-c-202
  san-mateo san-mateo-county bay-area)
 (2239 grinders-cafe cafe 2.0 30 x37th-ave san-mateo san-mateo-county
  bay-area)
 (2240 happy-cafe cafe 2.0 250 s-b-st san-mateo san-mateo-county
  bay-area)
 (2241 michaels-cafe cafe 2.0 1900 s-norfolk-st-ste-124 san-mateo
  san-mateo-county bay-area)
 (2242 ninis-coffee-shop cafe 3.4 1000 n-idaho-st san-mateo
  san-mateo-county bay-area)
 (2243 phylicias-finest-cafe cafe 2.0 53 e-39th-ave san-mateo
  san-mateo-county bay-area)
 (2244 rainbow-coffee-shop cafe 2.0 202 x2nd-ave san-mateo
  san-mateo-county bay-area)
 (2245 sacred-grounds-coffee-house cafe 2.0 740 s-norfolk-st-no.-221
  san-mateo san-mateo-county bay-area)
 (2246 san-mateo-coffee-shop-and-food cafe 2.0 400
  s-el-camino-real-ste-125 san-mateo san-mateo-county bay-area)
 (2247 steves-coffee-shop cafe 2.0 114 crystal-springs-shop-ctr
  san-mateo san-mateo-county bay-area)
 (2248 sunflower-coffee-&-tea cafe 2.0 255 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (2249 syntex-a-three-cafeteria cafe 2.0 1491 laurel-hill-dr san-mateo
  san-mateo-county bay-area)
 (2250 the-patio-cafe cafe 2.0 1825 s-grant-st-ste-110 san-mateo
  san-mateo-county bay-area)
 (2251 track-side-cafe cafe 2.0 38 e-25th-ave san-mateo
  san-mateo-county bay-area)
 (2252 wall-street-cafe cafe 2.0 777 mariners-island-blvd san-mateo
  san-mateo-county bay-area)
 (2253 yoon-cafe cafe 2.0 1640 overland-dr san-mateo san-mateo-county
  bay-area)
 (2254 annas-cafe cafe 2.0 847 madeline-rd san-pablo
  contra-costa-county bay-area)
 (2255 bea-my-guest-cafe cafe 2.0 2750 x15th-st san-pablo
  contra-costa-county bay-area)
 (2256 chriss-coffee-shop cafe 2.0 1260 rumrill-blvd san-pablo
  contra-costa-county bay-area)
 (2257 san-pablo-family-cafe cafe 2.0 2554 el-portal-dr san-pablo
  contra-costa-county bay-area)
 (2258 a-street-cafe cafe 2.0 3242 munras-pl san-ramon
  contra-costa-county bay-area)
 (2259 cafe-de-bordeaux cafe 2.0 240 riverton-pl san-ramon
  contra-costa-county bay-area)
 (2260 cafe-violi cafe 2.0 3104 crow-canyon-pl san-ramon
  contra-costa-county bay-area)
 (2261 caffe-orsini cafe 2.0 2005 crow-canyon-pl san-ramon
  contra-costa-county bay-area)
 (2262 danial-cafe cafe 2.0 3400 crow-canyon-rd san-ramon
  contra-costa-county bay-area)
 (2263 expresso-romano cafe 2.0 600 market-pl san-ramon
  contra-costa-county bay-area)
 (2264 a-taste-of-java cafe 2.0 3140 de-la-cruz-blvd-ste-200
  santa-clara santa-clara-county bay-area)
 (2265 advanced-coffee-service cafe 2.0 3260 de-la-cruz-blvd
  santa-clara santa-clara-county bay-area)
 (2266 cafe-aroma cafe 2.0 3488 el-camino-real santa-clara
  santa-clara-county bay-area)
 (2267 cafe-aroma cafe 2.0 3488 el-camino-real santa-clara
  santa-clara-county bay-area)
 (2268 de-la-cruz-cafe cafe 2.0 2315 de-la-cruz-blvd santa-clara
  santa-clara-county bay-area)
 (2269 flames-coffee-shop-of-santa-clara cafe 2.7 3590 el-camino-real
  santa-clara santa-clara-county bay-area)
 (2270 genas-espresso-and-shave-ice cafe 2.0 2770 newhall-st-apt-15
  santa-clara santa-clara-county bay-area)
 (2271 homestead-cafe cafe 2.0 2605 homestead-rd santa-clara
  santa-clara-county bay-area)
 (2272 kjs-cafe-a-la-carte cafe 2.0 900 kiely-blvd santa-clara
  santa-clara-county bay-area)
 (2273 mimos-cafe-santa-clara cafe 2.0 3074 scott-blvd-no.-b
  santa-clara santa-clara-county bay-area)
 (2274 nicks-cafe cafe 2.0 2015 lafayette-st santa-clara
  santa-clara-county bay-area)
 (2275 old-ironsides-cafe cafe 2.0 4655 old-ironsides-dr santa-clara
  santa-clara-county bay-area)
 (2276 paradise-coffee-shop cafe 2.0 2008 el-camino-real santa-clara
  santa-clara-county bay-area)
 (2277 regency-cafe-royale cafe 2.0 2350 mission-college-blvd-no.230
  santa-clara santa-clara-county bay-area)
 (2278 santa-clara-cafe cafe 2.0 57 washington-st santa-clara
  santa-clara-county bay-area)
 (2279 the-brown-bag-cafe cafe 2.0 4677 old-ironsides-dr santa-clara
  santa-clara-county bay-area)
 (2280 the-kids-cafe cafe 2.0 4351 lafayette-st santa-clara
  santa-clara-county bay-area)
 (2281 the-roasted-coffee-bean cafe 2.0 2158 rosita-ave santa-clara
  santa-clara-county bay-area)
 (2282 titto-cafe cafe 2.0 1505 space-park-dr santa-clara
  santa-clara-county bay-area)
 (2283 aptos-coffee-roasting-company cafe 3.0 0 unknown santa-cruz
  santa-cruz-county bay-area)
 (2284 asti-cafe cafe 2.0 715 pacific-ave santa-cruz santa-cruz-county
  bay-area)
 (2285 beach-street-cafe cafe 2.0 399 beach-st santa-cruz
  santa-cruz-county bay-area)
 (2286 blacks-beach-cafe cafe 2.3 21490 e-cliff-dr santa-cruz
  santa-cruz-county bay-area)
 (2287 cafe-bittersweet cafe 3.6 787 rio-del-mar-blvd rio-del-mar
  unknown unknown)
 (2288 cafe-brasil-arts-&-crafts cafe 2.0 1410 mission-st santa-cruz
  santa-cruz-county bay-area)
 (2289 cafe-coffeol cafe 2.0 307 beach-st santa-cruz santa-cruz-county
  bay-area)
 (2290 cafe-de-palma cafe 2.3 415 seabright-ave santa-cruz
  santa-cruz-county bay-area)
 (2291 cafe-milano cafe 2.0 1411 pacific-ave santa-cruz
  santa-cruz-county bay-area)
 (2292 cafe-pergolesi cafe 2.8 308 poplar-ave santa-cruz
  santa-cruz-county bay-area)
 (2293 caffe-bene cafe 2.0 214 keystone-ave santa-cruz
  santa-cruz-county bay-area)
 (2294 caffe-marciano cafe 2.0 343 soquel-ave-no.-188 santa-cruz
  santa-cruz-county bay-area)
 (2295 georgianas-cafe-santa-cruz cafe 2.0 1522 pacific-ave santa-cruz
  santa-cruz-county bay-area)
 (2296 harbor-cafe cafe 2.0 575 x7th-ave-no.-b santa-cruz
  santa-cruz-county bay-area)
 (2297 jennifers-bakery-cafe cafe 2.0 109 serrell-ave santa-cruz
  santa-cruz-county bay-area)
 (2298 lindas-seabreeze-cafe cafe 3.3 542 seabright-ave santa-cruz
  santa-cruz-county bay-area)
 (2299 malabar-cafe cafe 2.3 1116 soquel-ave santa-cruz
  santa-cruz-county bay-area)
 (2300 mollies-country-cafe cafe 2.0 1224 x17th-ave santa-cruz
  santa-cruz-county bay-area)
 (2301 oasis-cafe cafe 2.0 1201 soquel-ave santa-cruz santa-cruz-county
  bay-area)
 (2302 paulas-brooklyn-coffee-house cafe 2.0 3500 portola-dr santa-cruz
  santa-cruz-county bay-area)
 (2303 sandys-cafe cafe 2.0 3150 portola-dr santa-cruz
  santa-cruz-county bay-area)
 (2304 saturn-cafe cafe 2.2 1230 mission-st santa-cruz
  santa-cruz-county bay-area)
 (2305 sunnys-cafe cafe 2.0 334 swift-st santa-cruz santa-cruz-county
  bay-area)
 (2306 the-cliff-cafe cafe 2.0 815 x41st-ave santa-cruz
  santa-cruz-county bay-area)
 (2307 the-cooper-st-cafe cafe 2.0 725 front-st-no.-101 santa-cruz
  santa-cruz-county bay-area)
 (2308 altos-cafeteria cafe 2.0 12063 jamestown-ct saratoga
  santa-clara-county bay-area)
 (2309 french-bread-co-cafe cafe 2.0 14370 saratoga-ave saratoga
  santa-clara-county bay-area)
 (2310 cafe-carlos cafe 2.0 6016 scotts-valley-dr scotts-valley unknown
  bay-area)
 (2311 rosies-espresso-bar-cafe cafe 2.0 16 victor-sq-ste-a
  scotts-valley unknown bay-area)
 (2312 village-book-cafe cafe 2.0 245 mount-hermon-rd-no.-122
  scotts-valley unknown bay-area)
 (2313 sunrise-coffee-shop-&-restaurant cafe 2.0 4718 soquel-dr soquel
  unknown bay-area)
 (2314 breaktime-cafe-&-deli cafe 2.0 1320 rebecca-dr suisun-city
  solano-county bay-area)
 (2315 pioneer-cafe cafe 2.0 707 main-st suisun-city solano-county
  bay-area)
 (2316 backstage-cafe cafe 2.0 160 s-frances-st sunnyvale
  santa-clara-county bay-area)
 (2317 cafe-royale cafe 2.0 1023 renoir-ct sunnyvale santa-clara-county
  bay-area)
 (2318 cafe-yokohama cafe 2.0 550 lakeside-dr-no.-1 sunnyvale
  santa-clara-county bay-area)
 (2319 caffe-classico cafe 2.0 730 e-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (2320 coffee-express cafe 2.0 620 iris-ave-apt-130 sunnyvale
  santa-clara-county bay-area)
 (2321 collegan-cafeteria cafe 2.0 1571 finch-way sunnyvale
  santa-clara-county bay-area)
 (2322 f-&-b-cafeteria cafe 2.0 1575 tenaka-pl-no.-r-8 sunnyvale
  santa-clara-county bay-area)
 (2323 fei-microwave-cafeteria cafe 2.0 825 stewart-ave sunnyvale
  santa-clara-county bay-area)
 (2324 gamibee-cafeteria cafe 2.0 527 lakeside-dr sunnyvale
  santa-clara-county bay-area)
 (2325 gloria-jeans-coffee-bean cafe 2.0 1064 town-center-ln sunnyvale
  santa-clara-county bay-area)
 (2326 honduras-cafe cafe 2.0 124 s-murphy-ave sunnyvale
  santa-clara-county bay-area)
 (2327 kathys-cafeteria cafe 2.0 1170 willow-ave-no.-9 sunnyvale
  santa-clara-county bay-area)
 (2328 mira-mar-pool-hall-&-cafe cafe 2.0 101 s-murphy-ave-no.-103
  sunnyvale santa-clara-county bay-area)
 (2329 myungs-cafeteria cafe 2.0 201 w-california-ave-apt-603 sunnyvale
  santa-clara-county bay-area)
 (2330 starbucks-coffee cafe 2.0 795 e-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (2331 suraj-cafe cafe 2.0 921 e-duane-ave sunnyvale santa-clara-county
  bay-area)
 (2332 unas-cafeteria cafe 2.0 1772 kimberly-dr sunnyvale
  santa-clara-county bay-area)
 (2333 alison-leungs-cafeteria cafe 2.0 4906 lowry-rd union-city
  alameda-county bay-area)
 (2334 baldies-cafe cafe 3.3 2649 decoto-rd union-city alameda-county
  bay-area)
 (2335 ed-&-alan-drive-in-coffee-shop cafe 2.3 1854 whipple-rd
  union-city alameda-county bay-area)
 (2336 maxtor-cafeteria cafe 2.0 4467 lisa-dr union-city alameda-county
  bay-area)
 (2337 nec-cafe cafe 2.0 4601 korbel-st union-city alameda-county
  bay-area)
 (2338 new-haven-un-sch-dist-cafe-fun cafe 2.0 34200 alvarado-niles-rd
  union-city alameda-county bay-area)
 (2339 saul-cafeteria cafe 2.0 4608 rochelle-dr union-city
  alameda-county bay-area)
 (2340 alexs-deli-cafe cafe 2.0 300 virginia-st vallejo solano-county
  bay-area)
 (2341 alexs-deli-cafe cafe 2.0 1500 benicia-rd vallejo solano-county
  bay-area)
 (2342 b-&-w-cafe cafe 2.0 2632 sonoma-blvd vallejo solano-county
  bay-area)
 (2343 canyon-cafe cafe 2.0 3845 broadway vallejo solano-county
  bay-area)
 (2344 china-cafe cafe 2.0 512 sacramento-st vallejo solano-county
  bay-area)
 (2345 circus-cafe-shop cafe 2.0 744 tennessee-st vallejo solano-county
  bay-area)
 (2346 city-lights-cafe cafe 2.0 415 virginia-st vallejo solano-county
  bay-area)
 (2347 coffeeman cafe 2.0 504 broadway vallejo solano-county bay-area)
 (2348 g-&-l-cafe cafe 2.0 1030 tennessee-st vallejo solano-county
  bay-area)
 (2349 highway-29-cafe cafe 2.7 101 s-kelly-rd vallejo solano-county
  bay-area)
 (2350 home-cafe cafe 2.0 475 redwood-st-ste-10 vallejo solano-county
  bay-area)
 (2351 hwy-37-cafe cafe 2.0 1510 marine-world-pky vallejo solano-county
  bay-area)
 (2352 nubians-cafe-soul cafe 2.0 1801 solano-ave vallejo solano-county
  bay-area)
 (2353 philippine-village-cafe cafe 2.0 1836 tuolumne-st vallejo
  solano-county bay-area)
 (2354 sweet-affair-a cafe 2.0 1815 ygnacio-valley-rd-ste-f
  walnut-creek contra-costa-county bay-area)
 (2355 cafe-dolce cafe 2.0 100 pringle-ave-ste-120 walnut-creek
  contra-costa-county bay-area)
 (2356 cafe-panini cafe 2.0 1333 n-california-blvd-ste-180 walnut-creek
  contra-costa-county bay-area)
 (2357 eduardos-cafe cafe 2.0 1534 locust-st walnut-creek
  contra-costa-county bay-area)
 (2358 giacosa-caffe cafe 2.0 2121 n-california-blvd-ste-200
  walnut-creek contra-costa-county bay-area)
 (2359 gloria-jeans-coffee-bean-corp cafe 2.0 44 broadway walnut-creek
  contra-costa-county bay-area)
 (2360 hanh-truong-cafe cafe 2.0 575 lennon-ln walnut-creek
  contra-costa-county bay-area)
 (2361 main-street-cafe cafe 2.0 1329 n-main-st walnut-creek
  contra-costa-county bay-area)
 (2362 our-place-cafe cafe 2.7 2400 olympic-blvd-ste-5 walnut-creek
  contra-costa-county bay-area)
 (2363 pacific-plaza-cafe cafe 2.0 1340 treat-blvd-ste-160 walnut-creek
  contra-costa-county bay-area)
 (2364 park-place-cafe cafe 2.0 2960 camino-diablo-ste-110 walnut-creek
  contra-costa-county bay-area)
 (2365 sunrise-bistro cafe 2.7 1563 botelho-dr walnut-creek
  contra-costa-county bay-area)
 (2366 sunrise-cafe-&-bakery cafe 2.3 1355 s-california-blvd
  walnut-creek contra-costa-county bay-area)
 (2367 sunrise-cafe-&-bakery cafe 2.3 1559 botelho-dr walnut-creek
  contra-costa-county bay-area)
 (2368 sunshine-cafeteria cafe 2.0 149 bexley-pl walnut-creek
  contra-costa-county bay-area)
 (2369 susans-cafeteria cafe 2.0 1400 treat-blvd walnut-creek
  contra-costa-county bay-area)
 (2370 theatre-caffe cafe 2.0 1655 n-main-st walnut-creek
  contra-costa-county bay-area)
 (2371 amandas-cafe cafe 2.0 1047 freedom-blvd watsonville
  santa-cruz-county bay-area)
 (2372 bagel-cafe cafe 2.0 1830 main-st watsonville santa-cruz-county
  bay-area)
 (2373 cafe-petit-maison cafe 2.0 1974 main-st watsonville
  santa-cruz-county bay-area)
 (2374 capis-coffee-express cafe 2.0 1003 freedom-blvd watsonville
  santa-cruz-county bay-area)
 (2375 del-monte-cafe cafe 2.0 300 walker-st watsonville
  santa-cruz-county bay-area)
 (2376 el-puentito-cafe cafe 2.0 2904 freedom-blvd watsonville
  santa-cruz-county bay-area)
 (2377 ggmls-cafe cafe 2.0 25 penny-ln watsonville santa-cruz-county
  bay-area)
 (2378 los-gatitos-bar-&-cafe cafe 2.0 10 brooklyn-st watsonville
  santa-cruz-county bay-area)
 (2379 the-coffee-shop cafe 2.3 912 e-lake-ave watsonville
  santa-cruz-county bay-area)
 (2380 the-nook-cafe cafe 2.0 106 e-lake-ave watsonville
  santa-cruz-county bay-area)
 (2381 the-red-apple-cafe cafe 2.3 946 main-st watsonville
  santa-cruz-county bay-area)
 (2382 cafe-piazza cafe 2.0 310 ridgeway-rd woodside san-mateo-county
  bay-area)
 (2383 cafe-kinyon cafe 2.7 6525 washington-st yountville napa-county
  napa-valley)
 (2384 red-rock-partners/vintage-cafe cafe 2.0 6525 washington-st
  yountville napa-county napa-valley)
 (2385 cafe-classique cafe 2.5 117 sevilla el-granada san-mateo-county
  bay-area)
 (2386 cafe-grace cafe 2.0 2625 durant-avenue berkeley alameda-county
  bay-area)
 (2387 muddy-waters-coffee-house cafe 2.3 262 church-st san-francisco
  san-francisco-county bay-area)
 (2388 just-desserts cafe 2.2 248 church-st san-francisco
  san-francisco-county bay-area)
 (2389 petes-cafe cafe 2.7 800 chestnut-st. san-francisco
  san-francisco-county bay-area)
 (2390 joy-of-eating cafe 2.8 1828 springs-rd vallejo solano-county
  bay-area)
 (2391 cafe-mochas cafe 2.2 411 hartz-av danville contra-costa-county
  bay-area)
 (2392 sandys-cafe cafe 1.7 254 rose danville contra-costa-county
  bay-area)
 (2393 starbucks-coffee cafe 2.0 398 hartz-av danville
  contra-costa-county bay-area)
 (2394 the-coffee-zone cafe 2.0 1400 haight-st san-francisco
  san-francisco-county bay-area)
 (2395 sport-city-cafe cafe 2.7 150 s.-first-st san-jose
  santa-clara-county bay-area)
 (2396 cafe-louise cafe 2.0 7991 old-redwood-hwy cotati sonoma-county
  bay-area)
 (2397 cafe-mediterranean cafe 2.0 8204 old-redwood-hwy cotati
  sonoma-county bay-area)
 (2398 quincys-pub-&-cafe cafe 2.0 6590 commerce-blvd cotati
  sonoma-county bay-area)
 (2399 garden-court-cafe cafe 2.0 13875 sonoma-hwy glen-ellen
  sonoma-county bay-area)
 (2400 chariya-reun-thai-cafe cafe 3.0 252 almonte-blvd mill-valley
  marin-county bay-area)
 (2401 cafe-brix-restaurant cafe 2.7 4120 saint-helena-hwy napa
  napa-county napa-valley)
 (2402 garden-cafe cafe 2.0 651 trabajo-ln napa napa-county
  napa-valley)
 (2403 hy-29-cafe cafe 2.0 101 keller-rd napa napa-county napa-valley)
 (2404 thai-cafe cafe 2.7 750 grant-ave novato marin-county bay-area)
 (2405 arms-cafe cafe 2.0 122 kentucky-st petaluma sonoma-county
  bay-area)
 (2406 cafe-public cafe 2.0 201 e-washington-st petaluma sonoma-county
  bay-area)
 (2407 jeromes-cafe-&-grill cafe 3.0 1390 n-mcdowell-blvd petaluma
  sonoma-county bay-area)
 (2408 la-famiglia-deli-cafe cafe 2.3 220 western-ave petaluma
  sonoma-county bay-area)
 (2409 lan-mart-cafe cafe 2.0 16 kentucky-st petaluma sonoma-county
  bay-area)
 (2410 markeys-cafe-&-coffee-house cafe 2.0 316 western-ave petaluma
  sonoma-county bay-area)
 (2411 mr.-moms-cafe cafe 2.0 931 petaluma-blvd-s petaluma
  sonoma-county bay-area)
 (2412 mystic-cafe-&-coffee-house cafe 2.0 17 petaluma-blvd-n petaluma
  sonoma-county bay-area)
 (2413 park-deli-cafe cafe 2.0 1000 clegg-ct petaluma sonoma-county
  bay-area)
 (2414 rocket-cafe cafe 2.0 100 petaluma-blvd-n petaluma sonoma-county
  bay-area)
 (2415 sequoia-terrace-cafe cafe 2.0 1370 redwood-way petaluma
  sonoma-county bay-area)
 (2416 sola-cafeteria cafe 2.0 1500 cader-ln petaluma sonoma-county
  bay-area)
 (2417 zoyas-truck-stop-cafe cafe 2.0 2645 petaluma-blvd-s petaluma
  sonoma-county bay-area)
 (2418 french-quarter-coffee-company cafe 2.0 6356 commerce-blvd
  rohnert-park sonoma-county bay-area)
 (2419 gourmet-cafe cafe 2.0 5979 commerce-blvd rohnert-park
  sonoma-county bay-area)
 (2420 little-litas-coffee-shop cafe 2.0 1460 e-cotati-ave rohnert-park
  sonoma-county bay-area)
 (2421 cafe-italia-ristorante cafe 2.0 0 unknown san-rafael
  marin-county bay-area)
 (2422 cafe-ristorante-italia cafe 2.3 0 unknown san-rafael
  marin-county bay-area)
 (2423 cafe-villa-basque-restaurant-&-lounge cafe 2.0 1600 lincoln-ave
  san-rafael marin-county bay-area)
 (2424 chinook-restaurant-&-cafe cafe 3.2 0 unknown san-rafael
  marin-county bay-area)
 (2425 italia-cafe-ristorante cafe 2.0 0 unknown san-rafael
  marin-county bay-area)
 (2426 restaurant-italia-cafe cafe 2.0 1236 x4th-st san-rafael
  marin-county bay-area)
 (2427 arrigonis-delicatessen-&-cafe cafe 2.7 701 x4th-st santa-rosa
  sonoma-county bay-area)
 (2428 bleachers-sports-cafe cafe 2.0 1801 cleveland-ave santa-rosa
  sonoma-county bay-area)
 (2429 cafe-buon-gusto cafe 2.0 108 calistoga-rd santa-rosa
  sonoma-county bay-area)
 (2430 cafe-des-croissants cafe 2.0 1226 x4th-st santa-rosa
  sonoma-county bay-area)
 (2431 cafe-des-croissants cafe 2.0 1791 marlow-rd santa-rosa
  sonoma-county bay-area)
 (2432 cafe-des-croissants cafe 2.0 2444 lomitas-ave santa-rosa
  sonoma-county bay-area)
 (2433 cafe-europe cafe 2.3 65 brookwood-ave santa-rosa sonoma-county
  bay-area)
 (2434 cafe-express cafe 2.0 602 elsa-dr santa-rosa sonoma-county
  bay-area)
 (2435 cafe-lolo cafe 3.3 0 unknown santa-rosa sonoma-county bay-area)
 (2436 cafe-portofino cafe 2.7 535 x4th-st santa-rosa sonoma-county
  bay-area)
 (2437 cafe-salsa cafe 2.0 3082 marlow-rd santa-rosa sonoma-county
  bay-area)
 (2438 cafe-this cafe 2.0 0 unknown santa-rosa sonoma-county bay-area)
 (2439 caffe-p cafe 2.0 535 x4th-st santa-rosa sonoma-county bay-area)
 (2440 california-cafe-deli cafe 2.0 170 farmers-ln santa-rosa
  sonoma-county bay-area)
 (2441 carms-cafe-&-deli cafe 2.0 4323 montgomery-dr santa-rosa
  sonoma-county bay-area)
 (2442 cook-book-cafe cafe 2.0 359 coddingtown-ctr santa-rosa
  sonoma-county bay-area)
 (2443 dans-gold-star-cafeteria cafe 2.0 575 administration-dr
  santa-rosa sonoma-county bay-area)
 (2444 does-country-cafe cafe 2.0 3577 industrial-dr santa-rosa
  sonoma-county bay-area)
 (2445 east-west-cafe-&-restaurant cafe 2.0 2323 sonoma-ave santa-rosa
  sonoma-county bay-area)
 (2446 everything-yogurt-&-salad-cafe cafe 2.0 2109 santa-rosa-plz
  santa-rosa sonoma-county bay-area)
 (2447 for-play-cafe cafe 2.0 1024 sebastopol-rd santa-rosa
  sonoma-county bay-area)
 (2448 hot-spots-cafe cafe 2.0 0 unknown santa-rosa sonoma-county
  bay-area)
 (2449 marbles-cafe cafe 2.3 1770 piner-rd santa-rosa sonoma-county
  bay-area)
 (2450 mission-coffee-shop cafe 2.0 958 santa-rosa-ave santa-rosa
  sonoma-county bay-area)
 (2451 northpoint-cafe cafe 2.0 2160 northpoint-pky santa-rosa
  sonoma-county bay-area)
 (2452 parkside-cafe cafe 2.0 404 santa-rosa-ave santa-rosa
  sonoma-county bay-area)
 (2453 plaza-cafe cafe 2.0 478 lakfield-center santa-rosa sonoma-county
  bay-area)
 (2454 plaza-cafe cafe 2.0 614 x4th-st santa-rosa sonoma-county
  bay-area)
 (2455 roohscafe-salsa-restaurants cafe 2.0 3082 marlow-rd santa-rosa
  sonoma-county bay-area)
 (2456 sams-for-play-cafe cafe 2.0 1024 sebastopol-rd santa-rosa
  sonoma-county bay-area)
 (2457 sonoma-coffee-company cafe 2.0 0 unknown santa-rosa
  sonoma-county bay-area)
 (2458 sonoma-sun-coffee cafe 2.0 0 box-14113 santa-rosa sonoma-county
  bay-area)
 (2459 sunrise-cafe cafe 2.0 443 dutton-ave santa-rosa sonoma-county
  bay-area)
 (2460 willowside-cafe cafe 2.0 3535 guerneville-rd santa-rosa
  sonoma-county bay-area)
 (2461 cafe-tutti-restaurant cafe 1.7 12 el-portal sausalito unknown
  bay-area)
 (2462 caffe-trieste-restaurant cafe 2.0 1000 bridgeway sausalito
  unknown bay-area)
 (2463 copperfields-books-cafes-sebastopol cafe 2.0 138 n-main-st
  sebastopol sonoma-county bay-area)
 (2464 east-west-bakery-cafe cafe 2.0 128 n-main-st sebastopol
  sonoma-county bay-area)
 (2465 gallery-cafe-the cafe 2.0 138 n-main-st sebastopol sonoma-county
  bay-area)
 (2466 ginger-tree-cafe cafe 2.0 6961 sebastopol-ave sebastopol
  sonoma-county bay-area)
 (2467 gravenstein-cafe cafe 2.0 969 gravenstein-hwy-s sebastopol
  sonoma-county bay-area)
 (2468 happy-panda-cafe cafe 2.0 115 n-main-st sebastopol sonoma-county
  bay-area)
 (2469 nancys-vegetarian-cafe cafe 2.0 6970 mckinley-ave sebastopol
  sonoma-county bay-area)
 (2470 bear-flag-cafe cafe 3.0 18625 sonoma-hwy sonoma sonoma-county
  bay-area)
 (2471 breakaway-cafe cafe 2.0 239 boyes-blvd sonoma sonoma-county
  bay-area)
 (2472 cafe-at-sonoma-mission-inn cafe 2.0 18140 sonoma-hwy sonoma
  sonoma-county bay-area)
 (2473 feed-store-cafe-&-bakery-the cafe 2.0 529 st sonoma
  sonoma-county bay-area)
 (2474 fords-cafe cafe 2.0 22900 broadway sonoma sonoma-county
  bay-area)
 (2475 el-tapatio-cafe cafe 2.0 2982 rockville-rd suisun-city
  solano-county bay-area)
 (2476 heritage-house-cafe cafe 2.0 303 merchant-st vacaville
  solano-county bay-area)
 (2477 gold-star-cafe cafe 2.0 26 tennessee-st vallejo solano-county
  bay-area)
 (2478 omegas-stop-&-go-cafe cafe 2.0 300 mini-dr vallejo solano-county
  bay-area)
 (2479 pans-cafe cafe 2.0 623 tuolumne-st vallejo solano-county
  bay-area)
 (2480 aroma-espresso-bar cafe 2.0 101 spear-st san-francisco
  san-francisco-county bay-area)
 (2481 balboa-cafe-restaurant cafe 1.7 3199 fillmore-st san-francisco
  san-francisco-county bay-area)
 (2482 cafe-salmagundi-restaurant cafe 2.0 1 market-plz san-francisco
  san-francisco-county bay-area)
 (2483 caffe-trieste-restaurant cafe 2.0 601 vallejo-st san-francisco
  san-francisco-county bay-area)
 (2484 espresso-bongo cafe 2.0 44 montgomery-st san-francisco
  san-francisco-county bay-area)
 (2485 espresso-bongo cafe 2.0 5280 diamond-heights-blvd san-francisco
  san-francisco-county bay-area)
 (2486 espresso-bongo cafe 2.0 55 francisco-st san-francisco
  san-francisco-county bay-area)
 (2487 espresso-bongo cafe 2.0 950 battery-st san-francisco
  san-francisco-county bay-area)
 (2488 europa-espresso cafe 2.0 60 spear-tower san-francisco
  san-francisco-county bay-area)
 (2489 ice-cream-cafe-the cafe 2.0 536 davis-st san-francisco
  san-francisco-county bay-area)
 (2490 le-scoop-espresso-&-frozen-yog cafe 2.0 2 embarcadero-ctr
  san-francisco san-francisco-county bay-area)
 (2491 marios-bohemian-cigar-store-cafe cafe 2.0 2209 polk-st.
  san-francisco san-francisco-county bay-area)
 (2492 marios-bohemian-cigar-store-cafe cafe 2.8 566
  columbus-ave-at-union san-francisco san-francisco-county bay-area)
 (2493 narsais-cafe cafe 2.0 0 magnin-at-union-square san-francisco
  san-francisco-county bay-area)
 (2494 ocean-cafe-restaurant cafe 2.0 1031 ocean-ave san-francisco
  san-francisco-county bay-area)
 (2495 oh-la-la-bakery-cafes cafe 2.0 123 battery-st san-francisco
  san-francisco-county bay-area)
 (2496 on-the-go-espresso cafe 2.0 800 market-st san-francisco
  san-francisco-county bay-area)
 (2497 pazazz-cafe-restaurant cafe 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (2498 eagle-cafe cafe 2.7 0 39 san-francisco san-francisco-county
  bay-area)
 (2499 plumpjack-cafe cafe 3.8 3127 fillmore-st. san-francisco
  san-francisco-county bay-area)
 (2500 r-cafe-bar-&-restaurant cafe 2.0 127 x7th san-francisco
  san-francisco-county bay-area)
 (2501 rancilio-espresso-&-cappiccino cafe 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (2502 south-park-cafe cafe 2.0 0 --108-s-park-st san-francisco
  san-francisco-county bay-area)
 (2503 stars-restaurant-stars-cafe cafe 2.0 555 golden-gate-ave
  san-francisco san-francisco-county bay-area)
 (2504 thai-cafe cafe 3.0 3407 geary-blvd san-francisco
  san-francisco-county bay-area)
 (2505 uncle-gaylords-ice-cream-cafe cafe 2.0 721 irving-st
  san-francisco san-francisco-county bay-area)
 (2506 java-jones cafe 2.5 100 lafayette-circle lafayette
  contra-costa-county bay-area)
 (2507 cafe-classique cafe 2.7 0 unknown half-moon-bay san-mateo-county
  bay-area)
 (2508 lansdale-station cafe 2.7 1509 san-anselmo-ave san-anselmo
  marin-county bay-area)
 (2509 red-rock-caffe cafe 2.0 0 st mountain-view santa-clara-county
  bay-area)
 (2510 le-boulanger-cafe-bakery cafe 2.8 300 main-st los-altos
  santa-clara-county bay-area)
 (2511 tour-eiffel cafe 2.0 0 st los-altos santa-clara-county bay-area)
 (2512 menlo-java-&-juice-bar cafe 2.0 1083 el-camino-real menlo-park
  san-mateo-county bay-area)
 (2513 la-boulanger cafe 3.0 720 santa-cruz menlo-park san-mateo-county
  bay-area)
 (2514 menlo-cafe cafe 2.0 0 cruz menlo-park san-mateo-county bay-area)
 (2515 carmens-coffee-shop cafe 2.0 2614 broadway redwood-city
  san-mateo-county bay-area)
 (2516 peets-coffee-&-tea cafe 2.0 153 homer-st palo-alto
  santa-clara-county bay-area)
 (2517 tea-time cafe 2.7 0 unknown palo-alto santa-clara-county
  bay-area)
 (2518 cool-water-cafe cafe 2.0 0 no.84 la-honda san-mateo-county
  bay-area)
 (2519 peets-coffee-&-tea cafe 3.2 2124 vine-st berkeley alameda-county
  bay-area)
 (2520 little-paris cafe 2.0 939 stockton san-francisco
  san-francisco-county bay-area)
 (2521 little-house-coffe-shop cafe 2.0 889 sacramento san-francisco
  san-francisco-county bay-area)
 (2522 douce-france cafe 3.3 nil nil palo-alto santa-clara-county
  bay-area)
 (2523 douce-france cafe 2.0 93 town-&-country-village palo-alto
  santa-clara-county bay-area)
 (2524 bean-scene-the cafe 2.0 186 murphy-st. sunnyvale
  santa-clara-county bay-area)
 (2525 chacho cafe 2.0 0 unknown san-jose santa-clara-county bay-area)
 (2526 cafe-cheneville cafe 2.7 499 x9th oakland alameda-county
  bay-area)
 (2527 caffe-817 cafe 2.0 817 washington oakland alameda-county
  bay-area)
 (2528 la-towr-eiffel cafe 2.0 2020 university berkeley alameda-county
  bay-area)
 (2529 au-coquelet-cafe cafe 2.3 2000 university berkeley
  alameda-county bay-area)
 (2530 berkeley-espresso cafe 2.0 1900 shattuck berkeley alameda-county
  bay-area)
 (2531 cafe-europa cafe 2.0 1981 shattuck berkeley alameda-county
  bay-area)
 (2532 mooses cafe 3.2 1652 stockton-st. san-francisco
  san-francisco-county bay-area)
 (2533 kens-cafe cafe 2.0 2109 bancroft-st berkeley alameda-county
  bay-area)
 (2534 drink-drink-drink cafe 2.0 0 unknown berkeley alameda-county
  bay-area)
 (2535 happy-belly-deli-&-cafe cafe 2.7 30 jack-london-sq oakland
  alameda-county bay-area)
 (2536 southgate-cafe cafe 2.7 235 southgate-avenue daly-city
  san-mateo-county bay-area)
 (2537 cafe-mario cafe 2.7 2512 clement san-francisco
  san-francisco-county bay-area)
 (2538 our-court-cafe cafe 2.0 952 clement san-francisco
  san-francisco-county bay-area)
 (2539 village-cafe cafe 2.0 731 clement san-francisco
  san-francisco-county bay-area)
 (2540 cheers-cafe cafe 2.0 127 clement san-francisco
  san-francisco-county bay-area)
 (2541 cafe-riggio cafe 2.8 4110 geary san-francisco
  san-francisco-county bay-area)
 (2542 bajis-down-the-street-cafe cafe 2.3 0 old-middlefield
  mountain-view santa-clara-county bay-area)
 (2543 odyssia cafe 3.3 0 &-hearst berkeley alameda-county bay-area)
 (2544 healdsburg-coffee-company cafe 3.0 312 center-st. healdsburg
  sonoma-county bay-area)
 (2545 cafe-cruz-rosticceria-&-bar cafe 3.3 2621 x41st-avenue soquel
  unknown bay-area)
 (2546 galley-cafe cafe 2.0 0 san-pablo-yacht-harbor richmond
  contra-costa-county bay-area)
 (2547 toasties cafe 2.8 702 lighthouse-ave pacific-grove
  monterey-county monterey)
 (2548 zuni-cafe cafe 3.8 1658 market-st. san-francisco
  san-francisco-county bay-area)
 (2549 north-hill-cafe cafe 2.7 88 north-hill-drive brisbane
  san-mateo-county bay-area)
 (2550 pinole-creek-cafe cafe 2.7 0 pablo-ave pinole
  contra-costa-county bay-area)
 (2551 cove-cafe cafe 2.3 434 castro-st san-francisco
  san-francisco-county bay-area)
 (2552 blue-rock-shoot cafe 2.3 0 basin-way saratoga santa-clara-county
  bay-area)
 (2553 cafe-pacifica cafe 2.7 333 bush-st san-francisco
  san-francisco-county bay-area)
 (2554 universal-cafe cafe 2.7 2814 x19th-st san-francisco
  san-francisco-county bay-area)
 (2555 deans-beans cafe 2.7 645 bancroft-ave san-leandro alameda-county
  bay-area)
 (2556 universal-cafe cafe 2.3 416 barber-lane milpitas
  santa-clara-county bay-area)
 (2557 printers-inc.-bookstore/cafe cafe 2.3 301 castro mountain-view
  santa-clara-county bay-area)
 (2558 tom-foolery-saloon cajun 3.0 600 trancas-st napa napa-county
  napa-valley)
 (2559 tjs-gingerbread-house cajun 3.3 741 x5th-st oakland
  alameda-county bay-area)
 (2560 floogies-swamp-cafe cajun 3.4 1686 market-st san-francisco
  san-francisco-county bay-area)
 (2561 just-for-you-bakery-&-cafe cajun 2.0 1453 x18th san-francisco
  san-francisco-county bay-area)
 (2562 memphis-minnies cajun 2.7 1803 mission-st-no.-527 santa-cruz
  santa-cruz-county bay-area)
 (2563 olas-cajun-carib-afr-rst-nghtc cajun 2.0 986 pocatello-ave
  sunnyvale santa-clara-county bay-area)
 (2564 b-js-new-orleans-style cajun 2.0 3862 smith-st union-city
  alameda-county bay-area)
 (2565 creo-la. cajun 3.9 344 el-camino-real san-carlos
  san-mateo-county bay-area)
 (2566 bar-restaurant-the-quarterdeck cajun 2.7 718 x14th-st.
  san-francisco san-francisco-county bay-area)
 (2567 bar-restaurant-the-quarterdeck cajun 2.7 718 x14th-st.
  san-francisco san-francisco-county bay-area)
 (2568 jack-hunters-smokehouse cajun 2.0 1458 lincoln-ave calistoga
  napa-county napa-valley)
 (2569 jessies cajun 2.3 1256 folsom san-francisco san-francisco-county
  bay-area)
 (2570 liberty-cafe california 3.0 410 cortland-ave san-francisco
  san-francisco-county bay-area)
 (2571 fresco california 2.6 0 camino-south-of-page-mill palo-alto
  santa-clara-county bay-area)
 (2572 restaurant-sent-sovi california 4.2 14583 big-basin-way saratoga
  santa-clara-county bay-area)
 (2573 rubicon california 3.3 558 sacramento san-francisco
  san-francisco-county bay-area)
 (2574 palomino california 2.7 345
  spear-harrison-in-hills-brothers-pla san-francisco
  san-francisco-county bay-area)
 (2575 moraga-country-club-restaurant california 2.3 1600 st.-andrews
  moraga unknown bay-area)
 (2576 moraga-country-club-restaurant california 2.3 1600 st.-andrews
  moraga unknown bay-area)
 (2577 maxs-opera-cafe california 3.1 nil nil palo-alto
  santa-clara-county bay-area)
 (2578 sent-sovi california 3.8 0 basin-way saratoga santa-clara-county
  bay-area)
 (2579 the-dining-room-at-the-ritz-carlton california 4.5 600
  california san-francisco san-francisco-county bay-area)
 (2580 auberge-du-soleil california 2.7 0 trail rutherford napa-county
  napa-valley)
 (2581 quail-lodge california 3.0 8205 valley-greens-drive carmel
  monterey-county monterey)
 (2582 the-generals-daughter california 3.0 0 state-st sonoma
  sonoma-county bay-area)
 (2583 harveys california 2.8 500 castro-st san-francisco
  san-francisco-county bay-area)
 (2584 cafe-home-cooking california 2.7 0 1 davenport santa-cruz-county
  bay-area)
 (2585 zzas-trattoria california 2.8 nil nil oakland alameda-county
  bay-area)
 (2586 the-slow-club california 2.3 2501 mariposa san-francisco
  san-francisco-county bay-area)
 (2587 house california 2.7 1269 x9th-avenue san-francisco
  san-francisco-county bay-area)
 (2588 the-frog-and-the-peach california 3.0 106 throckmorton-ave
  mill-valley marin-county bay-area)
 (2589 evans-american-gourmet-cafe california 3.3 536 emerald-bay-rd
  south-lake-tahoe el-dorado-county lake-tahoe)
 (2590 checkers california 2.0 1414 lincoln-ave calistoga napa-county
  napa-valley)
 (2591 edgewood-tahoe california 3.0 0 lake-parkway south-lake-tahoe
  el-dorado-county lake-tahoe)
 (2592 columbia-city-hotel-restaurant california 2.3 22768 main-st
  columbia tuolumne-county yosemite-and-mono-lake-area)
 (2593 flying-saucer-the california 3.7 1000 guerrero san-francisco
  san-francisco-county bay-area)
 (2594 globe california 2.5 290 pacific-avenue san-francisco
  san-francisco-county bay-area)
 (2595 cafe-select california 2.3 1568 oak-view-ave kensington unknown
  bay-area)
 (2596 lalimes-cafe california 3.6 0 unknown berkeley alameda-county
  bay-area)
 (2597 2223 california 3.6 2223 market-st san-francisco
  san-francisco-county bay-area)
 (2598 mabels californian 3.1 635 x1st-st benicia solano-county
  bay-area)
 (2599 chez-panisse californian 4.4 1517 shattuck-ave berkeley
  alameda-county bay-area)
 (2600 pearls-cafe californian 4.1 4096 bay-st-no.-a fremont
  alameda-county bay-area)
 (2601 wente-bros-sparkling-cellars californian 4.0 nil nil livermore
  alameda-county bay-area)
 (2602 pedros californian 2.7 316 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (2603 flea-st.-cafe californian 3.7 3607 alameda-de-las-pulgas
  menlo-park san-mateo-county bay-area)
 (2604 california-cafe californian 3.2 700 welch-rd palo-alto
  santa-clara-county bay-area)
 (2605 pasta-villa-cafe californian 3.0 405 main-st. pleasanton
  alameda-county bay-area)
 (2606 cafe-majestic californian 2.3 1500 sutter san-francisco
  san-francisco-county bay-area)
 (2607 caffe-freddys californian 2.3 901 columbus-avenue san-francisco
  san-francisco-county bay-area)
 (2608 one-market californian 2.3 1 market-st san-francisco
  san-francisco-county bay-area)
 (2609 paulis-cafe californian 2.0 2500 washington san-francisco
  san-francisco-county bay-area)
 (2610 rumpus californian 3.6 1 tillman-place san-francisco
  san-francisco-county bay-area)
 (2611 the-flying-saucer californian 3.7 0 unknown san-francisco
  san-francisco-county bay-area)
 (2612 val21 californian 3.5 0 &-21st san-francisco
  san-francisco-county bay-area)
 (2613 woodwards-garden californian 3.3 1500 mission san-francisco
  san-francisco-county bay-area)
 (2614 california-pizza-kitchen californian 2.9 100 hillsdale-mall
  san-mateo san-mateo-county bay-area)
 (2615 le-mouton-noir californian 3.9 14560 big-basin-way saratoga
  santa-clara-county bay-area)
 (2616 avatars californian 3.7 0 unknown sausalito unknown bay-area)
 (2617 ricos-place californian 2.7 920 el-camino-real san-carlos
  san-mateo-county bay-area)
 (2618 sams-el-toreador californian 2.0 1541 taraval-st san-francisco
  san-francisco-county bay-area)
 (2619 postrio californian 3.4 545 post-st san-francisco
  san-francisco-county bay-area)
 (2620 faultline-brewing-company californian 2.8 nil nil sunnyvale
  santa-clara-county bay-area)
 (2621 lulu californian 2.9 816 folsom-&-fourth san-francisco
  san-francisco-county bay-area)
 (2622 vertigo californian 3.1 0 st san-francisco san-francisco-county
  bay-area)
 (2623 mountain-house californian 3.0 13808 skyline-boulevard woodside
  san-mateo-county bay-area)
 (2624 pasta-cafe californian 3.0 401 main-st. pleasanton
  alameda-county bay-area)
 (2625 sport-city-cafe californian 2.7 150 s.-first-st san-jose
  santa-clara-county bay-area)
 (2626 firefly californian 3.3 4288 x24th-st san-francisco
  san-francisco-county bay-area)
 (2627 sierra-mar californian 3.3 0 ranch-inn-highway-1 big-sur
  monterey-county monterey)
 (2628 napa-valley-grille californian 3.6 0 x29-at-madison yountville
  napa-county napa-valley)
 (2629 sticks californian 3.0 5101 great-america-parkway-/-westin-hotel
  santa-clara santa-clara-county bay-area)
 (2630 coleman-still californian 1.7 1240 coleman-avenue santa-clara
  santa-clara-county bay-area)
 (2631 lark-creek-inn californian 3.8 234 magnolia-avenue larkspur
  marin-county bay-area)
 (2632 campton-place californian 3.3 340 stockton-st san-francisco
  san-francisco-county bay-area)
 (2633 portola-park californian 3.0 3 portola-rd portola-valley
  san-mateo-county bay-area)
 (2634 buckley-lodge californian 3.3 1717 adobe-canyon-rd kenwood
  sonoma-county bay-area)
 (2635 hornblower-dining-yachts californian 3.3 0 marina-marriot
  berkeley alameda-county bay-area)
 (2636 timber-cove-inn californian 3.0 0 unknown jenner sonoma-county
  bay-area)
 (2637 speckmans-of-calistoga californian 2.0 1880 lincoln-avenue
  calistoga napa-county napa-valley)
 (2638 spiedo californian 2.8 223 e.-4th-st san-mateo san-mateo-county
  bay-area)
 (2639 ricks californian 3.0 1940 traraval san-francisco
  san-francisco-county bay-area)
 (2640 sinfuki californian 2.7 832 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (2641 tarpys-roadhouse californian 3.4 2999 monterey-salinas-highway
  monterey monterey-county monterey)
 (2642 rio-grill californian 2.7 0 x1-and-rio-rd carmel monterey-county
  monterey)
 (2643 ventana-inn-big-sur californian 2.7 0
  x1-2-miles-south-of-big-sur big-sur monterey-county monterey)
 (2644 ventana-inn-big-sur californian 2.7 0
  x1-2-miles-south-of-big-sur big-sur monterey-county monterey)
 (2645 post-ranch-inn californian 2.3 0 x1-2-miles-south-of-big-sur
  big-sur monterey-county monterey)
 (2646 confetti californian 3.0 1900 contra-costa-blvd. pleasant-hill
  contra-costa-county bay-area)
 (2647 ricks californian 2.7 1940 taraval san-francisco
  san-francisco-county bay-area)
 (2648 mountain-home-inn californian 3.3 810 panoramic-highway
  mill-valley marin-county bay-area)
 (2649 pinot-blanc californian 2.7 641 main-st saint-helena napa-county
  napa-valley)
 (2650 natty-bumppos californian 2.3 411 hartz-ave danville
  contra-costa-county bay-area)
 (2651 left-bank californian 2.7 507 magnolia-ave larkspur marin-county
  bay-area)
 (2652 cafe-kati californian 2.7 1963 sutter-st san-francisco
  san-francisco-county bay-area)
 (2653 brix californian 3.4 7377 st.-helena-hwy yountville napa-county
  napa-valley)
 (2654 x11-ristorante californian 2.3 374 eleventh-st. san-francisco
  san-francisco-county bay-area)
 (2655 californis-cafe californian 3.5 0 fair-mall san-jose
  santa-clara-county bay-area)
 (2656 ravenous-cafe californian 3.0 117 north-st healdsburg
  sonoma-county bay-area)
 (2657 bighorn-grill californian 3.0 2410 san-ramon-valley-blvd.
  san-ramon contra-costa-county bay-area)
 (2658 nightshade californian 3.5 2101 sutter san-francisco
  san-francisco-county bay-area)
 (2659 lakeside-cafe californian 2.0 2529 ocean-ave san-francisco
  san-francisco-county bay-area)
 (2660 cafe-home-cooking californian 2.7 0 1 davenport
  santa-cruz-county bay-area)
 (2661 blue-sky-cafe californian 3.0 336 bryant-st. mountain-view
  santa-clara-county bay-area)
 (2662 patrick-davids californian 2.5 nil nil danville
  contra-costa-county bay-area)
 (2663 pacifics-edge californian 3.0 0 x1-south-of-point-lobos carmel
  monterey-county monterey)
 (2664 montrio californian 3.0 414 calle-principal monterey
  monterey-county monterey)
 (2665 cafe-akimbo californian 3.0 116 maiden-lane san-francisco
  san-francisco-county bay-area)
 (2666 x42-degrees californian 2.3 235 x16th-st san-francisco
  san-francisco-county bay-area)
 (2667 essex-supper-club californian 2.0 847 montgomery san-francisco
  san-francisco-county bay-area)
 (2668 quetzal californian 3.0 1234 polk-st san-francisco
  san-francisco-county bay-area)
 (2669 coconut-grove californian 3.3 1415 van-ness san-francisco
  san-francisco-county bay-area)
 (2670 cafe-rouge californian 3.0 1782 x4th-st berkeley alameda-county
  bay-area)
 (2671 larbrea-de-la-vie californian 3.0 1760 miramonte-ave
  mountain-view santa-clara-county bay-area)
 (2672 canyon-view-restaurant californian 3.3 680 bolinger-canyon-way
  san-ramon contra-costa-county bay-area)
 (2673 gibson californian 2.6 201 east-third-avenue san-mateo
  san-mateo-county bay-area)
 (2674 caprices-restaurant-&-cafe californian 2.7 347 primrose-rd
  burlingame san-mateo-county bay-area)
 (2675 plumpjack-cafe californian 3.8 nil nil san-francisco
  san-francisco-county bay-area)
 (2676 peregrine californian 2.7 642 irving-st san-francisco
  san-francisco-county bay-area)
 (2677 peregrine californian/nouvelle 2.7 642 irving san-francisco
  san-francisco-county bay-area)
 (2678 the-cambodianas cambodian 3.2 2156 university-ave berkeley
  alameda-county bay-area)
 (2679 battambang-restaurant cambodian 2.8 850 broadway oakland
  alameda-county bay-area)
 (2680 angkor-palace cambodian 3.0 1769 lombard san-francisco
  san-francisco-county bay-area)
 (2681 angkor-wat cambodian 2.5 4217 geary-blvd-6th-avenue
  san-francisco san-francisco-county bay-area)
 (2682 chez-sovan cambodian 3.4 2425 south-bascom-avenue campbell
  santa-clara-county bay-area)
 (2683 cambodian-restaurant-angkor-wa cambodian 2.0 4217 geary-blvd
  san-francisco san-francisco-county bay-area)
 (2684 cambodian-restaurant-phnom-pen cambodian 2.7 631 larkin-st
  san-francisco san-francisco-county bay-area)
 (2685 new-pnomh-penh cambodian 2.7 1600 shattuck-avenue-no.218
  berkeley alameda-county bay-area)
 (2686 angkor-borei cambodian 2.7 3471 mission-st-cortland
  san-francisco san-francisco-county bay-area)
 (2687 caribbean-spice caribbean 2.5 1920 san-pablo-ave berkeley
  alameda-county bay-area)
 (2688 caribbean-gardens-nghtclub-&-restaurant caribbean 3.5 1306
  bayshore-hwy burlingame san-mateo-county bay-area)
 (2689 kathleens-doyle-st-cafe caribbean 2.0 5515 doyle-st emeryville
  alameda-county bay-area)
 (2690 mango-cafe caribbean 3.4 455 hamilton-ave palo-alto
  santa-clara-county bay-area)
 (2691 la-bamba-caribbean-restaurant-old caribbean 2.0 14395
  saratoga-ave-no.-110 saratoga santa-clara-county bay-area)
 (2692 caribbean-joses caribbean 2.3 0 camino-real palo-alto
  santa-clara-county bay-area)
 (2693 caribbean-zone caribbean 2.5 55 natoma-st san-francisco
  san-francisco-county bay-area)
 (2694 chicken!-chicken! caribbean 2.8 234 primrose burlingame
  san-mateo-county bay-area)
 (2695 judys-catering-company catering 2.0 312 harbor-light-rd alameda
  alameda-county bay-area)
 (2696 martinellis-full-serv-caterin catering 2.0 1819 nason-st alameda
  alameda-county bay-area)
 (2697 courtyard-catering-company catering 2.3 3208 danville-blvd alamo
  contra-costa-county bay-area)
 (2698 thymewise-catering-company catering 2.0 1410 solano-ave-no.-b
  albany alameda-county bay-area)
 (2699 divine-catering catering 2.0 150 valparaiso-ave atherton
  san-mateo-county bay-area)
 (2700 janet-coulston-catering catering 2.0 2023 lyon-ave belmont
  san-mateo-county bay-area)
 (2701 private-catering catering 2.0 1248 north-rd belmont
  san-mateo-county bay-area)
 (2702 a-b-m-catering catering 2.0 1728 curtis-st-apt-c berkeley
  alameda-county bay-area)
 (2703 chestnut-tree-catering catering 3.0 1012 grayson-st-no.-b
  berkeley alameda-county bay-area)
 (2704 rockin-roll-catering-co-deli catering 2.0 1123 x8th-st berkeley
  alameda-county bay-area)
 (2705 trumpetvine-catering-inc catering 2.0 2533 x7th-st berkeley
  alameda-county bay-area)
 (2706 club-catering catering 2.0 1676 gilbreth-rd burlingame
  san-mateo-county bay-area)
 (2707 edoardos-cuising-&-catering catering 2.0 146 loma-vista-dr
  burlingame san-mateo-county bay-area)
 (2708 starr-caterers catering 2.0 1311 schramsberg-rd calistoga
  napa-county napa-valley)
 (2709 catering-by-george catering 2.0 1334 dell-ave-no.-b campbell
  santa-clara-county bay-area)
 (2710 ms-moes-catering catering 2.0 20585 center-st castro-valley
  alameda-county bay-area)
 (2711 prof-bartending-serv-catrng catering 2.0 19690 forest-ave
  castro-valley alameda-county bay-area)
 (2712 antonios-catering catering 2.0 2880 minert-rd concord
  contra-costa-county bay-area)
 (2713 jenny-&-linda-catering catering 2.0 1800 ascot-ct concord
  contra-costa-county bay-area)
 (2714 tudor-catering catering 2.0 1754 landana-dr concord
  contra-costa-county bay-area)
 (2715 villanova-caterers catering 2.0 4061 port-chicago-hwy-ste-j
  concord contra-costa-county bay-area)
 (2716 gagnon-catoring-unlimited catering 2.0 569 san-ramon-valley-blvd
  danville contra-costa-county bay-area)
 (2717 dimples-&-company-catering catering 2.0 1943 university-ave
  east-palo-alto san-mateo-county bay-area)
 (2718 marujas-international-catering catering 2.0 3233
  santa-clara-ave-no.-e el-cerrito contra-costa-county bay-area)
 (2719 new-moon-catering catering 2.0 0 unknown el-granada
  san-mateo-county bay-area)
 (2720 dorotheas-catering catering 2.0 4935 san-pablo-dam-rd-apt-305
  el-sobrante contra-costa-county bay-area)
 (2721 heavenly-cafe-&-catering catering 2.0 6250 highway-9 felton
  unknown bay-area)
 (2722 judy-bentons-catering catering 2.0 1459 beach-park-blvd
  foster-city san-mateo-county bay-area)
 (2723 cloud-9-catering catering 2.0 3281 seldon-ct fremont
  alameda-county bay-area)
 (2724 marios-gourment-catering catering 2.0 40253 davis-ct fremont
  alameda-county bay-area)
 (2725 whos-your-caterer? catering 2.0 37567 mission-blvd fremont
  alameda-county bay-area)
 (2726 richard-bozzo-catering catering 2.0 8421 david-ct gilroy
  santa-clara-county bay-area)
 (2727 special-event-catering-&-prty catering 2.0 425 x1st-ave
  half-moon-bay san-mateo-county bay-area)
 (2728 catered-affairs-unlimited catering 2.0 29877
  clearbrook-cir-apt-156 hayward alameda-county bay-area)
 (2729 sunnys-catering catering 2.0 422 wait-st hayward alameda-county
  bay-area)
 (2730 swiss-catering-and-cafe catering 2.0 1202 w-winton-ave hayward
  alameda-county bay-area)
 (2731 t-&-t-catering catering 2.0 1798 catalpa-ct hayward
  alameda-county bay-area)
 (2732 fine-touch-catering catering 2.0 124 poppy-ct hercules
  contra-costa-county bay-area)
 (2733 glass-onion-catering catering 2.0 373 malibu-dr hercules
  contra-costa-county bay-area)
 (2734 falcone-catering catering 2.0 1371 sunset-dr hollister
  san-benito-county northern-california)
 (2735 catering-by-sharon catering 2.0 528 huntington-way livermore
  alameda-county bay-area)
 (2736 catering-with-class catering 2.0 124 maple-st livermore
  alameda-county bay-area)
 (2737 cafe-gourmet-&-catering-compan catering 2.0 10573 creston-dr
  los-altos santa-clara-county bay-area)
 (2738 macs-tea-room-&-catering catering 2.2 325 main-st los-altos
  santa-clara-county bay-area)
 (2739 b-&-n-creative-catering catering 2.0 15455 lone-hill-rd
  los-gatos santa-clara-county bay-area)
 (2740 la-bonne-vie-fine-catering catering 3.0 196 jo-drive los-gatos
  santa-clara-county bay-area)
 (2741 melody-catering catering 2.0 17375 melody-ln los-gatos
  santa-clara-county bay-area)
 (2742 something-special-catering catering 2.0 473 n-santa-cruz-ave
  los-gatos santa-clara-county bay-area)
 (2743 as-you-like-it-gourmet-caterin catering 2.0 3120 castro-st
  martinez contra-costa-county bay-area)
 (2744 catering-by-ollie catering 2.0 1261 el-camino-real menlo-park
  san-mateo-county bay-area)
 (2745 continental-caterers catering 2.0 425 el-camino-real menlo-park
  san-mateo-county bay-area)
 (2746 aloha-caterers catering 2.0 278 rodrigues-ave milpitas
  santa-clara-county bay-area)
 (2747 bay-area-chefs-catering catering 2.0 72 whittier-st milpitas
  santa-clara-county bay-area)
 (2748 k-&-t-catering catering 2.0 923 campbell-st milpitas
  santa-clara-county bay-area)
 (2749 mr-cs-catering catering 2.0 1425 calle-oriente-no.-3 milpitas
  santa-clara-county bay-area)
 (2750 nikkis-catering catering 2.0 1263 edsel-dr milpitas
  santa-clara-county bay-area)
 (2751 catering-by-dana catering 3.0 2540 california-st mountain-view
  santa-clara-county bay-area)
 (2752 cornucopia-catering-services catering 2.0 3401 ridgemont-dr
  mountain-view santa-clara-county bay-area)
 (2753 something-special-catering catering 2.0 2156 sunnyview-ln
  mountain-view santa-clara-county bay-area)
 (2754 splendid-feast-catering catering 2.0 1954
  old-middlefield-way-ste-p mountain-view santa-clara-county bay-area)
 (2755 five-star-catering catering 2.0 575 x3rd-st napa napa-county
  napa-valley)
 (2756 all-seasons-catering catering 2.0 2125 franklin-st oakland
  alameda-county bay-area)
 (2757 alzoshs-katering-koncepts catering 2.0 3340 x82nd-ave oakland
  alameda-county bay-area)
 (2758 avalon-catering catering 2.0 405 bellevue-ave-apt-305 oakland
  alameda-county bay-area)
 (2759 babineaux-catering catering 2.0 8930 seneca-st oakland
  alameda-county bay-area)
 (2760 california-catering catering 2.0 636 x3rd-st oakland
  alameda-county bay-area)
 (2761 catered-productions catering 2.0 121 maiden-ln oakland
  alameda-county bay-area)
 (2762 catering-with-a-caribbean-flai catering 2.0 5905 dover-st
  oakland alameda-county bay-area)
 (2763 cornucopian-cattering catering 2.0 700 glendome-cir oakland
  alameda-county bay-area)
 (2764 custom-catering catering 2.0 3250 butters-dr oakland
  alameda-county bay-area)
 (2765 ellen-yohai-catering catering 2.0 617 kenwyn-rd oakland
  alameda-county bay-area)
 (2766 executive-catering catering 2.0 9314 e-14th-st oakland
  alameda-county bay-area)
 (2767 fabulous-catering catering 2.0 2021 x101st-ave oakland
  alameda-county bay-area)
 (2768 matiers-catering catering 2.0 1831 x78th-ave oakland
  alameda-county bay-area)
 (2769 matthew-gipson-catering catering 2.0 493 merritt-ave-no.-4
  oakland alameda-county bay-area)
 (2770 mc-donoughs-catering catering 2.0 2908 minna-ave oakland
  alameda-county bay-area)
 (2771 miss-ms-baked-goods/catering catering 2.0 2031 hoover-ave
  oakland alameda-county bay-area)
 (2772 nealson-&-brooks-catering catering 2.0 3599 fruitvale-ave
  oakland alameda-county bay-area)
 (2773 olsen-catering catering 2.0 1309 x61st-st oakland alameda-county
  bay-area)
 (2774 patrick-catering-network catering 2.0 1425 harrison-st-apt-223
  oakland alameda-county bay-area)
 (2775 pride-catering catering 2.0 1940 lakeshore-ave-apt-22 oakland
  alameda-county bay-area)
 (2776 richards-catering catering 2.0 4537 fairbairn-ave oakland
  alameda-county bay-area)
 (2777 savoy-consummate-catering catering 2.0 3239 elm-st oakland
  alameda-county bay-area)
 (2778 shelby-catering catering 2.0 3551 x69th-ave oakland
  alameda-county bay-area)
 (2779 top-hat-catering catering 2.0 2018 x16th-ave oakland
  alameda-county bay-area)
 (2780 adys-excellent-cuisine-cateri catering 2.0 1133 alberdan-cir
  pinole contra-costa-county bay-area)
 (2781 heavenly-catering catering 2.0 530 sunnyview-dr-apt-i301 pinole
  contra-costa-county bay-area)
 (2782 yummy-food-service catering 2.0 326 wildrose-cir pinole
  contra-costa-county bay-area)
 (2783 beulahs-fine-catering catering 2.0 414 bay-crest-dr pittsburg
  contra-costa-county bay-area)
 (2784 food-with-love-catering catering 2.0 109 longfellow-dr
  pleasant-hill contra-costa-county bay-area)
 (2785 the-kings-table-catering-serv catering 2.0 390 camelback-rd
  pleasant-hill contra-costa-county bay-area)
 (2786 catering-by-sandi catering 2.0 3370 hopyard-rd pleasanton
  alameda-county bay-area)
 (2787 hamilton-catering catering 2.0 6783 payne-rd pleasanton
  alameda-county bay-area)
 (2788 joanies-creative-catering catering 2.0 7060 koll-center-pky
  pleasanton alameda-county bay-area)
 (2789 crocodile-catering catering 2.0 30 cima-way portola-valley
  san-mateo-county bay-area)
 (2790 bash-caterers catering 2.0 3965 lonesome-pine-rd redwood-city
  san-mateo-county bay-area)
 (2791 california-catering catering 2.0 1059 wilmington-way
  redwood-city san-mateo-county bay-area)
 (2792 x90-angel-catering catering 2.0 1405 florida-ave richmond
  contra-costa-county bay-area)
 (2793 bluitt-catering catering 2.0 4795 potrero-ave richmond
  contra-costa-county bay-area)
 (2794 geters-catering-service catering 2.0 2519 downer-ave richmond
  contra-costa-county bay-area)
 (2795 butler-catering-stadium-club catering 2.0 0 unknown
  south-san-francisco san-mateo-county bay-area)
 (2796 california-catering catering 2.0 920 stonegate-dr
  south-san-francisco san-mateo-county bay-area)
 (2797 california-catering catering 2.0 0 unknown south-san-francisco
  san-mateo-county bay-area)
 (2798 cow-hollow-catering catering 2.0 301 crown-cir-no.-7
  south-san-francisco san-mateo-county bay-area)
 (2799 mamas-catering catering 2.0 326 shaw-rd south-san-francisco
  san-mateo-county bay-area)
 (2800 south-san-francisco-catering catering 2.0 1225 edgewood-way
  south-san-francisco san-mateo-county bay-area)
 (2801 two-gs-catering catering 2.0 1381 lowrie-ave south-san-francisco
  san-mateo-county bay-area)
 (2802 alexanders-cafe-&-catering catering 2.0 140 e-san-carlos-st
  san-jose santa-clara-county bay-area)
 (2803 antonietas-catering catering 2.0 579 hermitage-dr san-jose
  santa-clara-county bay-area)
 (2804 ca-catering catering 2.0 3111 jenkins-ave san-jose
  santa-clara-county bay-area)
 (2805 front-page-catering catering 2.0 0 unknown san-jose
  santa-clara-county bay-area)
 (2806 garden-catering catering 2.0 1500 almaden-rd san-jose
  santa-clara-county bay-area)
 (2807 kensington-park-catering-compa catering 2.0 3588 minto-ct
  san-jose santa-clara-county bay-area)
 (2808 monterey-jacks-deli-&-caterer catering 2.0 1343
  s-winchester-blvd san-jose santa-clara-county bay-area)
 (2809 r-&-r-catering catering 2.0 2952 chiltern-way san-jose
  santa-clara-county bay-area)
 (2810 stm-catering catering 2.0 1590 berryessa-rd san-jose
  santa-clara-county bay-area)
 (2811 yvonnes-catering catering 2.0 5229 rio-grande-dr san-jose
  santa-clara-county bay-area)
 (2812 a-&-g-catering catering 2.0 13885 doolittle-dr-apt-127t
  san-leandro alameda-county bay-area)
 (2813 catering-by-brenda catering 2.0 620 black-pine-dr san-leandro
  alameda-county bay-area)
 (2814 nelsons-catering catering 2.0 15901 windsor-dr san-leandro
  alameda-county bay-area)
 (2815 yongs-lunch-room-&-catering catering 2.0 1032 grace-st
  san-leandro alameda-county bay-area)
 (2816 akays-catering catering 2.0 863 woodside-way san-mateo
  san-mateo-county bay-area)
 (2817 bayne-catering catering 2.0 2319 s-el-camino-real san-mateo
  san-mateo-county bay-area)
 (2818 four-season-caterers catering 2.0 0 unknown san-mateo
  san-mateo-county bay-area)
 (2819 pearls-bbq-cuisine-&-catering catering 2.3 207 n-amphlett-blvd
  san-mateo san-mateo-county bay-area)
 (2820 west-fresh-catering catering 2.0 1529 lago-st san-mateo
  san-mateo-county bay-area)
 (2821 mon-chef-catering catering 2.0 2121 vale-rd-apt-304 san-pablo
  contra-costa-county bay-area)
 (2822 party-time-catering-inc catering 2.0 2650 market-ave san-pablo
  contra-costa-county bay-area)
 (2823 sunshine-catering catering 2.0 3068 rollingwood-dr san-pablo
  contra-costa-county bay-area)
 (2824 buon-appetito-cafe-&-catering catering 2.0 12949
  alcosta-blvd-ste-100 san-ramon contra-costa-county bay-area)
 (2825 campus-caterers catering 2.0 1725 de-la-cruz-blvd-no.-6
  santa-clara santa-clara-county bay-area)
 (2826 mcdonnell-catering catering 2.0 1741 warburton-ave-apt-6
  santa-clara santa-clara-county bay-area)
 (2827 panees-catering catering 2.0 785 orkney-ave santa-clara
  santa-clara-county bay-area)
 (2828 touch-of-class-catering catering 2.0 630 park-view-dr
  santa-clara santa-clara-county bay-area)
 (2829 dorothy-wilson-caterers catering 2.0 303 potrero-st-ste-5
  santa-cruz santa-cruz-county bay-area)
 (2830 catered-events catering 2.0 0 unknown saratoga
  santa-clara-county bay-area)
 (2831 quebec-imports/shangrila-cater catering 2.0 4570 cabello-st
  union-city alameda-county bay-area)
 (2832 pancho-capones-catering catering 2.0 460 moorland-st vallejo
  solano-county bay-area)
 (2833 aviond-catering catering 2.0 2320 westcliffe-ln-apt-3
  walnut-creek contra-costa-county bay-area)
 (2834 cynthia-davis-catering catering 2.0 2075 stratton-rd
  walnut-creek contra-costa-county bay-area)
 (2835 julie-mc-ginley-catering catering 2.0 40 alberta-ter
  walnut-creek contra-costa-county bay-area)
 (2836 wild-thyme-catering-&-food catering 2.0 2770 camino-diablo
  walnut-creek contra-costa-county bay-area)
 (2837 evelyns-catering-service catering 2.0 152 celia-dr watsonville
  santa-cruz-county bay-area)
 (2838 michaels-catering catering 2.0 29 w-lake-ave watsonville
  santa-cruz-county bay-area)
 (2839 monterey-bay-caterers catering 2.0 152 w-lake-ave watsonville
  santa-cruz-county bay-area)
 (2840 rafas-mexican-food-&-catering catering 2.0 8230 old-redwood-hwy
  cotati sonoma-county bay-area)
 (2841 vintage-catering catering 2.0 11251 skyline-rd forestville
  sonoma-county bay-area)
 (2842 franzis-catering catering 2.0 1390 n-mcdowell-blvd petaluma
  sonoma-county bay-area)
 (2843 pedroni-classic-catering catering 2.0 24 western-ave petaluma
  sonoma-county bay-area)
 (2844 rose-catering catering 2.0 1340 commerce-st petaluma
  sonoma-county bay-area)
 (2845 cornelius-a-caterer catering 2.0 1495 francisco-blvd-e
  san-rafael marin-county bay-area)
 (2846 rosalind-catering catering 2.0 0 unknown san-rafael marin-county
  bay-area)
 (2847 a-la-heart-catering catering 2.0 600 wilson-st santa-rosa
  sonoma-county bay-area)
 (2848 canevari-delicatessen-and-catering catering 2.0 695 lewis-rd
  santa-rosa sonoma-county bay-area)
 (2849 chef-klaus-catering catering 2.0 946 santa-rosa-ave santa-rosa
  sonoma-county bay-area)
 (2850 countryside-catering catering 2.0 5441 pepperwood-rd santa-rosa
  sonoma-county bay-area)
 (2851 eager-to-please-catering catering 2.0 3200 dutton-ave santa-rosa
  sonoma-county bay-area)
 (2852 johns-catering-&-traveling-barbeque catering 2.0 0 unknown
  santa-rosa sonoma-county bay-area)
 (2853 martha-rowlands-catering catering 2.0 2054 montecito-ave
  santa-rosa sonoma-county bay-area)
 (2854 out-to-lunch-roods-&-catering catering 2.0 0 unknown santa-rosa
  sonoma-county bay-area)
 (2855 park-avenue-catering catering 2.0 3565 standish-ave santa-rosa
  sonoma-county bay-area)
 (2856 sonoma-county-catering catering 2.0 340 yolanda-ave santa-rosa
  sonoma-county bay-area)
 (2857 melons-catering catering 2.0 100 ebbtide-av-sausalito sausalito
  unknown bay-area)
 (2858 night-owl-catering catering 2.0 0 box sebastopol sonoma-county
  bay-area)
 (2859 bell-elaine-catering-company catering 2.0 682 w-napa-st sonoma
  sonoma-county bay-area)
 (2860 dejoy-jim-caterer catering 2.0 601 broadway sonoma sonoma-county
  bay-area)
 (2861 alexs-fine-catering-company catering 2.0 300 virginia-st vallejo
  solano-county bay-area)
 (2862 davids-delicatessen-&-caterer catering 2.3 474 geary-st
  san-francisco san-francisco-county bay-area)
 (2863 taste-taste-catering catering 3.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (2864 tifft-jane-caterer catering 2.0 2714 pine-st san-francisco
  san-francisco-county bay-area)
 (2865 party-primavera catering 3.0 1359 lincoln-ave san-jose
  santa-clara-county bay-area)
 (2866 dipuccios-pasta-shop catering 2.0 4710 meridian-ave san-jose
  santa-clara-county bay-area)
 (2867 avantis catering 3.0 1881 rollins-rd burlingame san-mateo-county
  bay-area)
 (2868 pollo-restaurant chicken 2.3 100 berkeley-sq berkeley
  alameda-county bay-area)
 (2869 popeyes-famous-fried-chicken chicken 2.0 1835 willow-pass-rd
  concord contra-costa-county bay-area)
 (2870 sesame-chicken chicken 2.0 82 serramonte-ctr daly-city
  san-mateo-county bay-area)
 (2871 popeyes-famous-fried-chicken chicken 2.3 555 oconnor-st
  east-palo-alto san-mateo-county bay-area)
 (2872 kentucky-fried-chicken chicken 2.0 10945 san-pablo-ave
  el-cerrito contra-costa-county bay-area)
 (2873 kentucky-fried-chicken chicken 2.0 3300 san-pablo-dam-rd
  el-sobrante contra-costa-county bay-area)
 (2874 kentucky-fried-chicken chicken 2.0 2277 n-texas-st fairfield
  solano-county bay-area)
 (2875 popeyes-famous-fried-chickn chicken 2.0 1015
  e-hillsdale-blvd-no.-209 foster-city san-mateo-county bay-area)
 (2876 tokyo-chicken chicken 2.0 3406 mount-diablo-blvd lafayette
  contra-costa-county bay-area)
 (2877 kentucky-fried-chicken chicken 2.0 3240 jefferson-st napa
  napa-county napa-valley)
 (2878 poulet chicken 2.0 5212 broadway oakland alameda-county
  bay-area)
 (2879 super-pollo-restaurant chicken 2.0 534 x7th-st oakland
  alameda-county bay-area)
 (2880 petalumas chicken 3.3 73 town-and-country-vlg palo-alto
  santa-clara-county bay-area)
 (2881 kentucky-fried-chicken chicken 2.0 1544 fitzgerald-dr pinole
  contra-costa-county bay-area)
 (2882 speedys-broasted-chicken chicken 2.0 756 woodside-rd
  redwood-city san-mateo-county bay-area)
 (2883 hotel-mac chicken 3.0 50 washington-ave richmond
  contra-costa-county bay-area)
 (2884 kentucky-fried-chicken chicken 1.7 12951 san-pablo-ave richmond
  contra-costa-county bay-area)
 (2885 popeyes-famous-fried-chicken-&-biscuits chicken 2.0 726 market
  san-francisco san-francisco-county bay-area)
 (2886 powells-place chicken 2.8 511 hayes san-francisco
  san-francisco-county bay-area)
 (2887 chic-n-rib chicken 2.0 148 w-alma-ave san-jose
  santa-clara-county bay-area)
 (2888 churchs-chicken chicken 2.0 2675 glen-fenton-way san-jose
  santa-clara-county bay-area)
 (2889 churchs-chicken chicken 2.0 2663 glen-loman-way san-jose
  santa-clara-county bay-area)
 (2890 el-pollo-asados chicken 2.0 1620 saratoga-ave-no.-a san-jose
  santa-clara-county bay-area)
 (2891 el-pollo-charro chicken 2.0 1696 berryessa-rd san-jose
  santa-clara-county bay-area)
 (2892 el-pollo-rico chicken 2.0 4112 monterey-hwy-no.-c san-jose
  santa-clara-county bay-area)
 (2893 el-pollo-rico chicken 2.0 2294 story-rd san-jose
  santa-clara-county bay-area)
 (2894 pioneer-chicken chicken 2.0 1671 n-capitol-ave san-jose
  santa-clara-county bay-area)
 (2895 road-runner-chicken chicken 3.0 5643 cottle-rd san-jose
  santa-clara-county bay-area)
 (2896 thai-orchid chicken 2.0 2591 n.-first-st. san-jose
  santa-clara-county bay-area)
 (2897 chicken-unlimited chicken 2.0 901 s-b-st san-mateo
  san-mateo-county bay-area)
 (2898 pacific-chicken chicken 2.0 120 peninsula-ave-apt-10 san-mateo
  san-mateo-county bay-area)
 (2899 california-chicken-express chicken 2.0 2855
  stevenson-st-no.-2192 santa-clara santa-clara-county bay-area)
 (2900 manila-charboil-chicken chicken 2.0 2026 agnew-rd santa-clara
  santa-clara-county bay-area)
 (2901 kentucky-fried-chicken chicken 2.0 841 n-branciforte-ave
  santa-cruz santa-cruz-county bay-area)
 (2902 kentucky-fried-chicken chicken 2.0 173 sunset-ave suisun-city
  solano-county bay-area)
 (2903 wings-n-things chicken 2.0 507 marina-ctr suisun-city
  solano-county bay-area)
 (2904 m-&-m-chicken chicken 2.0 109 appian-way union-city
  alameda-county bay-area)
 (2905 kentucky-fried-chicken chicken 2.0 1201 georgia-st vallejo
  solano-county bay-area)
 (2906 kentucky-fried-chicken chicken 2.0 991 redwood-st vallejo
  solano-county bay-area)
 (2907 pollo chicken 2.9 1040 grant-rd mountain-view santa-clara-county
  bay-area)
 (2908 menara-moroccan-restaurant chicken 2.3 41 east-gish-rd san-jose
  santa-clara-county bay-area)
 (2909 original-buffalo-wings-restaurant chicken 2.0 520
  alameda-del-prado novato marin-county bay-area)
 (2910 sunset-chicken-&-burger chicken 2.0 2564 springs-rd vallejo
  solano-county bay-area)
 (2911 nob-hill-chicken-&-ribs chicken 2.0 447 stockton-st
  san-francisco san-francisco-county bay-area)
 (2912 giannas-restaurant chicken 2.8 833 e.-stanley-blvd. livermore
  alameda-county bay-area)
 (2913 original-buffalo-wings chicken 3.0 663 union-columbus
  san-francisco san-francisco-county bay-area)
 (2914 kentucky-fried-chicken chicken 2.0 4408 coast-hwy. pacifica
  san-mateo-county bay-area)
 (2915 kenny-rogers-roasters chicken 2.0 4353 first-st livermore
  alameda-county bay-area)
 (2916 tavern-grill chicken 3.2 1448 burlingame-avenue burlingame
  san-mateo-county bay-area)
 (2917 cluck-u.-chicken-co. chicken 3.0 2603 the-alameda santa-clara
  santa-clara-county bay-area)
 (2918 asia-buffet chinese 2.0 1608 union-st-apt-c alameda
  alameda-county bay-area)
 (2919 bamboo-kitchen chinese 2.5 2105 lincoln-ave alameda
  alameda-county bay-area)
 (2920 chins-garden-restaurant chinese 1.8 2315 santa-clara-ave alameda
  alameda-county bay-area)
 (2921 china-house chinese 2.3 2328 santa-clara-ave alameda
  alameda-county bay-area)
 (2922 dragon-palace chinese 2.0 1521 webster-st alameda alameda-county
  bay-area)
 (2923 gims-chinese-kitchen chinese 2.3 2322 lincoln-ave alameda
  alameda-county bay-area)
 (2924 harbor-view-chinese-restaurant chinese 3.0 891 island-dr-no.-a
  alameda alameda-county bay-area)
 (2925 hongkong-city-restaurant chinese 2.6 1425 park-st alameda
  alameda-county bay-area)
 (2926 kye-wha-&-yeong-in-chung chinese 2.0 1307 park-st alameda
  alameda-county bay-area)
 (2927 magic-wok chinese 2.0 839 marina-village-pky alameda
  alameda-county bay-area)
 (2928 new-yeung-shing-restaurant chinese 2.0 409 kittyhawk-rd alameda
  alameda-county bay-area)
 (2929 panda-restaurant chinese 2.0 1434 park-st alameda alameda-county
  bay-area)
 (2930 sun-shing-restaurant chinese 2.0 409 kittyhawk-rd alameda
  alameda-county bay-area)
 (2931 the-china-hut chinese 3.0 642 lincoln-ave alameda alameda-county
  bay-area)
 (2932 the-china-hut chinese 2.7 642 lincoln-avenue alameda
  alameda-county bay-area)
 (2933 ton-shen-restaurant chinese 2.7 2410 santa-clara-ave alameda
  alameda-county bay-area)
 (2934 yu-hsiang-restaurant chinese 2.5 1405 park-st alameda
  alameda-county bay-area)
 (2935 da-nang-restaurant chinese 3.4 905 san-pablo-ave albany
  alameda-county bay-area)
 (2936 feng-yen-restaurant chinese 2.3 1113 solano-ave albany
  alameda-county bay-area)
 (2937 king-tu chinese 2.0 1335 solano-ave albany alameda-county
  bay-area)
 (2938 shaung-tung chinese 2.0 917 san-pablo-ave albany alameda-county
  bay-area)
 (2939 thanh-son chinese 2.0 1406 solano-ave albany alameda-county
  bay-area)
 (2940 x99-express-chinese-food chinese 2.0 2896 delta-fair-blvd antioch
  contra-costa-county bay-area)
 (2941 bun-bun-chinese-restaurant chinese 2.0 212 g-st antioch
  contra-costa-county bay-area)
 (2942 china-city-restaurant chinese 2.5 2757 lone-tree-way antioch
  contra-costa-county bay-area)
 (2943 chinese-kitchen chinese 2.0 2556 somersville-rd antioch
  contra-costa-county bay-area)
 (2944 dragon-inn chinese 2.0 2401 sycamore-dr antioch
  contra-costa-county bay-area)
 (2945 empress-garden chinese 2.3 1721 alhambra-dr antioch
  contra-costa-county bay-area)
 (2946 hong-kong-restaurant chinese 2.0 1611 a-st antioch
  contra-costa-county bay-area)
 (2947 lins-buffet chinese 2.0 2730 delta-fair-blvd antioch
  contra-costa-county bay-area)
 (2948 new-dynasty-chinese-restaurant chinese 2.0 2303 buchanan-rd
  antioch contra-costa-county bay-area)
 (2949 shanghai-cafe chinese 2.0 740 w-2nd-st antioch
  contra-costa-county bay-area)
 (2950 tai-sun-restaurant chinese 2.0 2621 somersville-rd antioch
  contra-costa-county bay-area)
 (2951 tao-san-jin-chinese-restaurant chinese 2.8 2378 buchanan-rd
  antioch contra-costa-county bay-area)
 (2952 wing-wah-restaurant chinese 2.3 1803 w-10th-st antioch
  contra-costa-county bay-area)
 (2953 wongs-restaurant chinese 2.8 3704 lone-tree-way antioch
  contra-costa-county bay-area)
 (2954 golden-city-chinese-restaurant chinese 2.0 207 sea-ridge-rd
  aptos santa-cruz-county bay-area)
 (2955 the-panda-inn chinese 3.0 5 deer-park-ctr aptos
  santa-cruz-county bay-area)
 (2956 uncle-kwoks-szechwan chinese 2.0 7960 soquel-dr-ste-k aptos
  santa-cruz-county bay-area)
 (2957 china-village-restaurant chinese 3.2 600 ralston-ave belmont
  san-mateo-county bay-area)
 (2958 hong-kong-restaurant chinese 2.7 945 ralston-ave belmont
  san-mateo-county bay-area)
 (2959 szechwan-court chinese 2.3 1625 el-camino-real belmont
  san-mateo-county bay-area)
 (2960 fong-chinese-cuisine chinese 1.5 718 x1st-st benicia
  solano-county bay-area)
 (2961 happy-house-chinese-restaurant chinese 2.0 408 military-e
  benicia solano-county bay-area)
 (2962 lai-wah-chinese-restaurant chinese 2.0 2040 columbus-pky benicia
  solano-county bay-area)
 (2963 rickshaw-restaurant chinese 2.0 836 southampton-rd-no.-e benicia
  solano-county bay-area)
 (2964 roberts-china-garden chinese 3.0 498 military-e benicia
  solano-county bay-area)
 (2965 china-station chinese 1.8 700 university-ave berkeley
  alameda-county bay-area)
 (2966 dragon-house chinese 2.0 1647 solano-ave berkeley alameda-county
  bay-area)
 (2967 dragon-house-restaurant chinese 2.8 1647 solano-ave berkeley
  alameda-county bay-area)
 (2968 emerald-garden-restaurant chinese 2.7 2533 telegraph-ave
  berkeley alameda-county bay-area)
 (2969 hai-loon-king chinese 2.8 2984 college-ave berkeley
  alameda-county bay-area)
 (2970 hong-fu-restaurant chinese 2.7 2126 center-st berkeley
  alameda-county bay-area)
 (2971 hong-kong-villa chinese 2.0 2042 university-ave berkeley
  alameda-county bay-area)
 (2972 hsiang-mann-yuan-chinese-rest chinese 2.3 2507 hearst-ave
  berkeley alameda-county bay-area)
 (2973 king-dong chinese 2.8 2429 shattuck-ave berkeley alameda-county
  bay-area)
 (2974 king-tsin-restaurant chinese 2.9 1699 solano-ave berkeley
  alameda-county bay-area)
 (2975 king-yen-restaurant chinese 3.4 2995 college-ave berkeley
  alameda-county bay-area)
 (2976 lee-wah-restaurant chinese 2.0 2026 san-pablo-ave berkeley
  alameda-county bay-area)
 (2977 little-hunan-restaurant chinese 2.6 124 berkeley-sq berkeley
  alameda-county bay-area)
 (2978 little-mandarin chinese 2.7 139 berkeley-sq berkeley
  alameda-county bay-area)
 (2979 lius-kitchen chinese 3.0 1593 solano-ave berkeley alameda-county
  bay-area)
 (2980 mandarin-garden chinese 3.5 2025 shattuck-ave-no.-29 berkeley
  alameda-county bay-area)
 (2981 mandarin-house-restaurant chinese 2.0 2519 durant-ave berkeley
  alameda-county bay-area)
 (2982 mandarin-villa-restaurant chinese 2.0 1556 solano-ave berkeley
  alameda-county bay-area)
 (2983 new-mings-kitchen chinese 2.0 1761 alcatraz-ave berkeley
  alameda-county bay-area)
 (2984 new-oriental-restaurant chinese 2.0 1717 university-ave-no.-a
  berkeley alameda-county bay-area)
 (2985 new-phom-penh-restaurant chinese 2.8 1600 shattuck-ave-ste-218
  berkeley alameda-county bay-area)
 (2986 sams-chinese-restaurant chinese 2.0 2521 dwight-way berkeley
  alameda-county bay-area)
 (2987 shin-shin-restaurant chinese 3.2 1715 solano-ave berkeley
  alameda-county bay-area)
 (2988 stir-fry-restaurant chinese 2.0 2523 durant-ave berkeley
  alameda-county bay-area)
 (2989 sun-peking-restaurant chinese 2.0 2068 center-st berkeley
  alameda-county bay-area)
 (2990 tai-san-restaurant chinese 2.3 2811 telegraph-ave berkeley
  alameda-county bay-area)
 (2991 taiwan-restaurant chinese 2.0 2071 university-ave berkeley
  alameda-county bay-area)
 (2992 the-great-china chinese 3.0 2115 kittredge-st berkeley
  alameda-county bay-area)
 (2993 tsing-tao-restaurant chinese 2.8 1767 solano-ave berkeley
  alameda-county bay-area)
 (2994 yangtze-river-restaurant chinese 2.5 1674 shattuck-ave berkeley
  alameda-county bay-area)
 (2995 yenching-restaurant chinese 2.0 2017 shattuck-ave berkeley
  alameda-county bay-area)
 (2996 new-peking-restaurant chinese 2.9 13375 highway-9 boulder-creek
  santa-cruz-county bay-area)
 (2997 canton-garden chinese 2.0 7840 brentwood-blvd brentwood
  contra-costa-county bay-area)
 (2998 chef-chen-chinese-restaurant chinese 3.0 8065
  brentwood-blvd-ste-9 brentwood contra-costa-county bay-area)
 (2999 szechuan-restaurant chinese 2.0 301 visitacion-ave brisbane
  san-mateo-county bay-area)
 (3000 empress-court-cuisine-of-china chinese 3.0 433
  airport-blvd-ste-500 burlingame san-mateo-county bay-area)
 (3001 gau-poang-chinese-restaurant chinese 3.0 1425 burlingame-ave
  burlingame san-mateo-county bay-area)
 (3002 jims-chinese-food chinese 2.0 1520 trousdale-dr burlingame
  san-mateo-county bay-area)
 (3003 king-yuan-restaurant chinese 2.0 1213 burlingame-ave burlingame
  san-mateo-county bay-area)
 (3004 mandarin-cuisine chinese 2.0 248 lorton-ave burlingame
  san-mateo-county bay-area)
 (3005 soo-yuan-restaurant chinese 2.0 1354 lincoln-ave calistoga
  napa-county napa-valley)
 (3006 chin-jin-eastern-house chinese 3.4 1638 w-campbell-ave campbell
  santa-clara-county bay-area)
 (3007 golden-phoenix-chinese-restaurant chinese 2.0 1731
  winchester-blvd campbell santa-clara-county bay-area)
 (3008 peking-eastern-house-restaurant chinese 2.0 1061 lucot-way
  campbell santa-clara-county bay-area)
 (3009 taipei-restaurant chinese 2.3 1740 winchester-blvd campbell
  santa-clara-county bay-area)
 (3010 tsing-tao-restaurant chinese 2.7 104 n-san-tomas-aquino-rd
  campbell santa-clara-county bay-area)
 (3011 woos-chinese-restaurant chinese 2.0 2455 winchester-blvd
  campbell santa-clara-county bay-area)
 (3012 ocean-view-chinese-restaurant chinese 2.7 209 esplanade capitola
  unknown bay-area)
 (3013 dang-how-chop-suey chinese 2.2 3789 castro-valley-blvd
  castro-valley alameda-county bay-area)
 (3014 fongs-restaurant chinese 3.5 3335 castro-valley-blvd
  castro-valley alameda-county bay-area)
 (3015 genghis-khan-kitchen chinese 2.8 20855 redwood-rd castro-valley
  alameda-county bay-area)
 (3016 hwangs-cafeteria chinese 2.0 4323 lawrence-dr castro-valley
  alameda-county bay-area)
 (3017 peking-village-restaurant chinese 2.0 3442 village-dr
  castro-valley alameda-county bay-area)
 (3018 szechuan-house-restaurant chinese 2.7 3563 castro-valley-blvd
  castro-valley alameda-county bay-area)
 (3019 yet-wah-restaurant chinese 2.7 22253 redwood-rd castro-valley
  alameda-county bay-area)
 (3020 li-yuen chinese 2.0 11578 merritt-st castroville monterey-county
  monterey)
 (3021 chens-mandarin-cuisine chinese 2.0 4340 clayton-rd concord
  contra-costa-county bay-area)
 (3022 chi-hos-restaurant chinese 2.0 1627 n.-brd walnut-creek
  contra-costa-county bay-area)
 (3023 chopsticks-delight chinese 2.7 1950 grant-st concord
  contra-costa-county bay-area)
 (3024 concord-siam-cuisine chinese 2.0 1980 galindo-st concord
  contra-costa-county bay-area)
 (3025 far-east-garden chinese 2.3 1975 diamond-blvd-ste-b140 concord
  contra-costa-county bay-area)
 (3026 fong-lin-chengs chinese 2.0 3622 willow-pass-rd concord
  contra-costa-county bay-area)
 (3027 hunan-restaurant chinese 2.7 4804 clayton-rd concord
  contra-costa-county bay-area)
 (3028 lims-garden chinese 3.2 1140 meadow-ln-no.-a concord
  contra-costa-county bay-area)
 (3029 little-china-restaurant chinese 2.0 1500 no.a1-monument-blvd
  concord contra-costa-county bay-area)
 (3030 lok-tao-chinese-restaurant chinese 3.5 1847 willow-pass-rd-no.-d
  concord contra-costa-county bay-area)
 (3031 luping-chinese-restaurant chinese 2.8 4375 clayton-rd concord
  contra-costa-county bay-area)
 (3032 manchu-wok chinese 2.0 381 sun-valley-mall-no.-e211 concord
  contra-costa-county bay-area)
 (3033 mandarin-garden chinese 2.5 1740 monument-blvd concord
  contra-costa-county bay-area)
 (3034 manns-chinese-cuisine chinese 2.7 4115 concord-blvd-ste-52
  concord contra-costa-county bay-area)
 (3035 ming-dynasty-restaurant chinese 2.0 4484 treat-blvd concord
  contra-costa-county bay-area)
 (3036 moon-yuen-restaurant chinese 2.0 5400 ygnacio-valley-rd concord
  contra-costa-county bay-area)
 (3037 new-lims-garden chinese 3.0 4340 clayton-rd concord
  contra-costa-county bay-area)
 (3038 shan-shan-low-restaurant chinese 3.0 1731 willow-pass-rd concord
  contra-costa-county bay-area)
 (3039 spring-garden-chinese-restaura chinese 3.3 785 oak-grove-rd
  concord contra-costa-county bay-area)
 (3040 sun-lim-restaurant chinese 2.0 288 sun-valley-mall-mall-f4
  concord contra-costa-county bay-area)
 (3041 taiwan-village-restaurant chinese 2.0 4485 clayton-rd concord
  contra-costa-county bay-area)
 (3042 the-chinese-kitchen chinese 2.0 3426 clayton-rd concord
  contra-costa-county bay-area)
 (3043 tok-yes-place chinese 2.0 1101 kaitlin-pl concord
  contra-costa-county bay-area)
 (3044 wat-phou-restaurant chinese 2.3 1823 broadway concord
  contra-costa-county bay-area)
 (3045 yet-wah-restaurant chinese 2.0 4635 clayton-rd concord
  contra-costa-county bay-area)
 (3046 yet-wah chinese 2.0 20050 highway-40 crockett unknown bay-area)
 (3047 central-china-restaurant chinese 2.0 7547 donegal-dr cupertino
  santa-clara-county bay-area)
 (3048 china-rose-restaurant chinese 2.0 20956 homestead-rd-no.-a
  cupertino santa-clara-county bay-area)
 (3049 china-shuttle chinese 2.5 22382 homestead-rd cupertino
  santa-clara-county bay-area)
 (3050 hong-fu-gourmet-chinese-rest chinese 3.3 20588
  stevens-creek-blvd cupertino santa-clara-county bay-area)
 (3051 jade-tree chinese 3.0 10074 e-estates-dr cupertino
  santa-clara-county bay-area)
 (3052 mandarin-gourmet chinese 3.8 10145 n.-deanza-blvd cupertino
  santa-clara-county bay-area)
 (3053 pot-sticker-king chinese 3.0 19740 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (3054 china-sky-restaurant chinese 2.0 83 skyline-plz daly-city
  san-mateo-county bay-area)
 (3055 egg-roll-king-chinese-restaurant chinese 2.0 6811 mission-st
  daly-city san-mateo-county bay-area)
 (3056 fishermans-village chinese 1.7 427 gellert-blvd daly-city
  san-mateo-county bay-area)
 (3057 jade-dragon chinese 2.8 2368 junipero-serra-blvd daly-city
  san-mateo-county bay-area)
 (3058 little-hunan-restaurant chinese 2.0 6127 mission-st daly-city
  san-mateo-county bay-area)
 (3059 china-paradise chinese 2.8 3446 camino-tassajara danville
  contra-costa-county bay-area)
 (3060 grand-china-restaurant chinese 2.0 105 &-d-town-&-country-dr
  danville contra-costa-county bay-area)
 (3061 uncle-yus chinese 3.0 150 hartz-ave danville contra-costa-county
  bay-area)
 (3062 sesame-mandarin-cuisine chinese 2.3 59 danville-sq danville
  contra-costa-county bay-area)
 (3063 suns-chinese-restaurant chinese 2.0 426 diablo-rd danville
  contra-costa-county bay-area)
 (3064 china-village-restaurant chinese 2.6 7200 regional-st dublin
  alameda-county bay-area)
 (3065 madam-sun chinese 3.5 6608 dublin-blvd dublin alameda-county
  bay-area)
 (3066 great-wall-chinese-cuisine chinese 2.7 8925 san-ramon-rd dublin
  alameda-county bay-area)
 (3067 hunan-house-restaurant chinese 2.2 7111 village-pky dublin
  alameda-county bay-area)
 (3068 mandarin-village-restaurant chinese 3.0 7150 village-pky dublin
  alameda-county bay-area)
 (3069 mings-chinese-restaurant chinese 2.0 7265 regional-st dublin
  alameda-county bay-area)
 (3070 china-joy-restaurant chinese 2.0 1972 university-ave
  east-palo-alto san-mateo-county bay-area)
 (3071 dangs-phai-cuisine chinese 2.0 7516 fairmount-ave el-cerrito
  contra-costa-county bay-area)
 (3072 golden-dynasty-restaurant chinese 2.5 10140 san-pablo-ave
  el-cerrito contra-costa-county bay-area)
 (3073 happy-garden-restaurant chinese 2.0 11265 san-pablo-ave-no.-a
  el-cerrito contra-costa-county bay-area)
 (3074 king-chwan-chinese-retuarant chinese 2.0 225 el-cerrito-plz
  el-cerrito contra-costa-county bay-area)
 (3075 little-hong-kong-restaurant chinese 2.7 10350 san-pablo-ave
  el-cerrito contra-costa-county bay-area)
 (3076 mandarian-house chinese 2.4 10443 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (3077 original-peking-restaurant chinese 2.0 10675 san-pablo-ave
  el-cerrito contra-costa-county bay-area)
 (3078 uncle-wongs-restaurant chinese 3.0 11760 san-pablo-ave-ste-c
  el-cerrito contra-costa-county bay-area)
 (3079 yummy-chinese-cuisine chinese 2.7 10264 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (3080 hong-kong-express chinese 2.0 3340 san-pablo-dam-rd-ste-f
  el-sobrante contra-costa-county bay-area)
 (3081 mandarin-house chinese 3.2 5047 appian-way el-sobrante
  contra-costa-county bay-area)
 (3082 hong-kong-chef-restaurant chinese 2.0 1310 x67th-st emeryville
  alameda-county bay-area)
 (3083 hongkong-east-ocean-restaurant chinese 3.4 3199 powell-st
  emeryville alameda-county bay-area)
 (3084 moons-chinese-kitchen chinese 2.0 3986 adeline-st emeryville
  alameda-county bay-area)
 (3085 moons-chinese-kitchen chinese 2.0 3986 adeline-st emeryville
  alameda-county bay-area)
 (3086 noodles-etc chinese 2.0 5800 shellmound-st emeryville
  alameda-county bay-area)
 (3087 birdcage-wok chinese 2.0 2731 n-texas-st fairfield solano-county
  bay-area)
 (3088 bridcage-wok-of-fairfield chinese 2.0 2731 n-texas-st fairfield
  solano-county bay-area)
 (3089 china-palace chinese 2.0 715 jackson-st fairfield solano-county
  bay-area)
 (3090 dragon-palace chinese 2.0 594 parker-rd fairfield solano-county
  bay-area)
 (3091 dynasty-restaurant chinese 3.0 2401 waterman-blvdsuite-7
  fairfield solano-county bay-area)
 (3092 frank-&-yuens-restaurant chinese 2.3 1955 w-texas-st fairfield
  solano-county bay-area)
 (3093 great-china chinese 2.0 1972 n-texas-st-no.-a fairfield
  solano-county bay-area)
 (3094 green-bamboo-restaurant chinese 2.0 4437 central-pl fairfield
  solano-county bay-area)
 (3095 han-kung-chinese-restaurant chinese 2.0 739 w-texas-st fairfield
  solano-county bay-area)
 (3096 new-manila-express chinese 2.0 2703 n-texas-st fairfield
  solano-county bay-area)
 (3097 pagoda-restaurant chinese 2.0 2155 n-texas-st fairfield
  solano-county bay-area)
 (3098 peking-restaurant chinese 2.0 3073 travis-blvd fairfield
  solano-county bay-area)
 (3099 six-fortunes chinese 2.0 844 texas-st fairfield solano-county
  bay-area)
 (3100 the-chopsticks-restaurant chinese 2.0 1343 oliver-rd fairfield
  solano-county bay-area)
 (3101 the-mandarin-restaurant chinese 2.0 219 w-texas-st fairfield
  solano-county bay-area)
 (3102 wokman chinese 2.0 1500 oliver-rd-ste-l fairfield solano-county
  bay-area)
 (3103 joy-restaurant chinese 3.0 1495 beach-park-blvd foster-city
  san-mateo-county bay-area)
 (3104 mr-fongs-restaurant chinese 2.7 1288 e-hillsdale-blvd-no.-ste
  foster-city san-mateo-county bay-area)
 (3105 rickshaw-corner-chines-restaurant chinese 2.0 901
  edgewater-blvd-no.-e foster-city san-mateo-county bay-area)
 (3106 kings-garden-cantonese-cuisine chinese 2.0 225 carnation-dr
  freedom unknown unknown)
 (3107 chef-lee-1-chinese-restaurant chinese 2.0 1025 glenhill-dr
  fremont alameda-county bay-area)
 (3108 chicken-a-la-king chinese 2.0 34360 fremont-blvd fremont
  alameda-county bay-area)
 (3109 china-buffet-court chinese 2.0 39176 argonaut-way fremont
  alameda-county bay-area)
 (3110 china-chili-restaurant chinese 3.8 39116 state-st fremont
  alameda-county bay-area)
 (3111 china-harbour-restaurant chinese 2.5 34755 ardenwood-blvd
  fremont alameda-county bay-area)
 (3112 china-paradise-restaurant chinese 2.0 681 mowry-ave fremont
  alameda-county bay-area)
 (3113 china-station-restaurant chinese 2.0 3880 lake-arrowhead-ave
  fremont alameda-county bay-area)
 (3114 chwan-nong-restaurant chinese 2.0 37415 fremont-blvd fremont
  alameda-county bay-area)
 (3115 full-house-chinese-restaurant chinese 2.4 39933 mission-blvd
  fremont alameda-county bay-area)
 (3116 furama-restaurant chinese 3.1 46850 warm-springs-blvd fremont
  alameda-county bay-area)
 (3117 golden-china-chinese-restauran chinese 2.0 3625 thornton-ave
  fremont alameda-county bay-area)
 (3118 grand-orient-restaurant chinese 2.3 39060 fremont-blvd fremont
  alameda-county bay-area)
 (3119 grand-taipei-restaurant chinese 2.5 40460 albrae-st fremont
  alameda-county bay-area)
 (3120 great-wall-peking-resturant chinese 2.0 42891 hamilton-way
  fremont alameda-county bay-area)
 (3121 happi-house-restaurant chinese 1.6 40559 fremont-blvd fremont
  alameda-county bay-area)
 (3122 ho-chow-restaurant chinese 3.7 47966 warm-springs-blvd fremont
  alameda-county bay-area)
 (3123 hong-kong-buffet chinese 2.0 41063 fremont-blvd fremont
  alameda-county bay-area)
 (3124 house-of-suns-chinese-rest chinese 2.0 34460 fremont-blvd-ste-b
  fremont alameda-county bay-area)
 (3125 hunan-palace chinese 2.8 39134 fremont-blvd fremont
  alameda-county bay-area)
 (3126 jade-village chinese 2.0 37533 niles-blvd fremont alameda-county
  bay-area)
 (3127 kingdo-restaurant chinese 2.7 39486 fremont-blvd fremont
  alameda-county bay-area)
 (3128 lumyuen chinese 2.0 39139 farwell-dr fremont alameda-county
  bay-area)
 (3129 mandarin-inn chinese 2.0 45401 fremont-blvd fremont
  alameda-county bay-area)
 (3130 marui-machi-cuisine chinese 2.0 41043 fremont-blvd fremont
  alameda-county bay-area)
 (3131 mings-szechwan-restaurant chinese 2.7 3915 washington-blvd
  fremont alameda-county bay-area)
 (3132 ninety-nine-madarin-delight chinese 2.0 39473 fremont-blvd
  fremont alameda-county bay-area)
 (3133 north-china-restaurant chinese 2.8 39144 paseo-padre-pky fremont
  alameda-county bay-area)
 (3134 ohlone-yen-ching chinese 2.3 1616 washington-blvd fremont
  alameda-county bay-area)
 (3135 orient-grill chinese 2.0 34299 quartz-ter fremont alameda-county
  bay-area)
 (3136 phoenix-garden-restaurant chinese 2.0 34123 fremont-blvd fremont
  alameda-county bay-area)
 (3137 r-&-j-chinese-food-to chinese 2.0 37149 fremont-blvd fremont
  alameda-county bay-area)
 (3138 sun-tung-restaurant chinese 2.0 4222 deep-creek-rd fremont
  alameda-county bay-area)
 (3139 szechwan-house-restaurant chinese 2.0 38256 glenmoor-dr-no.-a
  fremont alameda-county bay-area)
 (3140 tasty-chinese-food chinese 2.0 41039 fremont-blvd fremont
  alameda-county bay-area)
 (3141 the-new-orient chinese 2.0 3988 washington-blvd fremont
  alameda-county bay-area)
 (3142 uncle-chong-chinese-restuarant chinese 3.6 36659 fremont-blvd
  fremont alameda-county bay-area)
 (3143 wok-city-diner chinese 2.6 1847 argus-ct fremont alameda-county
  bay-area)
 (3144 yat-sing-restaurant chinese 2.0 3625 thornton-ave fremont
  alameda-county bay-area)
 (3145 yuk-wah-restaurant chinese 2.3 37418 fremont-blvd fremont
  alameda-county bay-area)
 (3146 luckies-chinese-restaurant chinese 2.0 7760 monterey-st-no.-e
  gilroy santa-clara-county bay-area)
 (3147 china-kitchen chinese 1.7 80 cabrillo-hwy-n-ste-u half-moon-bay
  san-mateo-county bay-area)
 (3148 gin-wah chinese 2.2 0 1 half-moon-bay san-mateo-county bay-area)
 (3149 abacus-chinese-restaurant chinese 2.5 20500 hesperian-blvd-ste-b
  hayward alameda-county bay-area)
 (3150 als-hof-brau-&-chinese-restaurant chinese 1.7 320 jackson-st
  hayward alameda-county bay-area)
 (3151 asian-wok-chinese-restaurant chinese 2.0 24933
  santa-clara-st-ste-a3 hayward alameda-county bay-area)
 (3152 beijing-restaurant chinese 2.0 22218 foothill-blvd hayward
  alameda-county bay-area)
 (3153 canton-house chinese 2.0 991 w-winton-ave hayward alameda-county
  bay-area)
 (3154 china-best-restaurant chinese 3.1 22545 foothill-blvd hayward
  alameda-county bay-area)
 (3155 china-cafe chinese 2.0 22624 vermont-st hayward alameda-county
  bay-area)
 (3156 china-chef-restaurant chinese 2.6 21439 foothill-blvd hayward
  alameda-county bay-area)
 (3157 china-kitchen chinese 2.0 392 st hayward alameda-county
  bay-area)
 (3158 chinese-garden-restaurant chinese 2.0 766 a-st hayward
  alameda-county bay-area)
 (3159 ching-chuan-restaurant chinese 2.7 754 w-a-st hayward
  alameda-county bay-area)
 (3160 golden-dragon-cafe chinese 2.0 320 a-st hayward alameda-county
  bay-area)
 (3161 golden-phoenix-restaurant chinese 2.0 26617 mission-blvd hayward
  alameda-county bay-area)
 (3162 grand-taipei-restaurant chinese 2.0 25036 hesperian-blvd hayward
  alameda-county bay-area)
 (3163 hop-sinh chinese 2.7 21101 mission-blvd hayward alameda-county
  bay-area)
 (3164 hunan-wok chinese 3.0 22436 foothill-blvd hayward alameda-county
  bay-area)
 (3165 imperial-star-empire-inc chinese 2.0 22292 foothill-blvd hayward
  alameda-county bay-area)
 (3166 manila-garden-restaurant chinese 2.0 20500 hesperian-blvd-ste-d
  hayward alameda-county bay-area)
 (3167 r-oriental-place chinese 2.0 591 penny-ln hayward alameda-county
  bay-area)
 (3168 rickshaw-restaurant chinese 2.0 20936 mission-blvd hayward
  alameda-county bay-area)
 (3169 shiansan-restaurant chinese 2.8 219 harder-rd hayward
  alameda-county bay-area)
 (3170 szechuan-taste-restaurant chinese 2.0 22544 mission-blvd hayward
  alameda-county bay-area)
 (3171 tin-fu-restaurant chinese 2.0 448 w-harder-rd hayward
  alameda-county bay-area)
 (3172 tong-ho-restaurant chinese 2.0 21849 mission-blvd hayward
  alameda-county bay-area)
 (3173 wonton-villa chinese 2.0 25817 mission-blvd-no.-4 hayward
  alameda-county bay-area)
 (3174 yees-restaurant chinese 2.0 2010 b-st hayward alameda-county
  bay-area)
 (3175 yu-chen-lien-sesame-chicken chinese 2.0 17 southland-mall
  hayward alameda-county bay-area)
 (3176 oriental-express-food-to chinese 2.0 1572 sycamore-ave-no.-b
  hercules contra-costa-county bay-area)
 (3177 cheung-sheng-chinese-restaurant chinese 2.0 201 x6th-st
  hollister san-benito-county northern-california)
 (3178 the-wok chinese 2.0 355 san-felipe-rd hollister
  san-benito-county northern-california)
 (3179 wongs-garden chinese 2.7 1709 airline-hwy-ste-j hollister
  san-benito-county northern-california)
 (3180 jade-palace chinese 3.0 3444 mount-diablo-blvd lafayette
  contra-costa-county bay-area)
 (3181 tangs-restaurant chinese 2.3 3555 mount-diablo-blvd lafayette
  contra-costa-county bay-area)
 (3182 the-great-wall-restaurant chinese 3.0 3500 golden-gate-way
  lafayette contra-costa-county bay-area)
 (3183 uncle-yus-restaurant chinese 2.5 999 oak-hill-rd lafayette
  contra-costa-county bay-area)
 (3184 canton-village-restaurant chinese 3.0 1100 e-stanley-blvd
  livermore alameda-county bay-area)
 (3185 celadon-chinese-restaurant chinese 2.6 2111 railroad livermore
  alameda-county bay-area)
 (3186 china-garden chinese 2.5 1536 railroad livermore alameda-county
  bay-area)
 (3187 great-szechwan-restaurant chinese 2.9 2059 x1st-st livermore
  alameda-county bay-area)
 (3188 che-win chinese 2.0 855 rincon-ave livermore alameda-county
  bay-area)
 (3189 hunan-restaurant chinese 2.3 2206 first-st livermore
  alameda-county bay-area)
 (3190 la-cocina-oriental chinese 2.0 961 bluebell-dr livermore
  alameda-county bay-area)
 (3191 lemon-grass-restaurant chinese 3.2 2216 x1st-st livermore
  alameda-county bay-area)
 (3192 chef-chus chinese 2.4 1067 north-san-antonio los-altos
  santa-clara-county bay-area)
 (3193 china-valley chinese 3.0 355 state-st los-altos
  santa-clara-county bay-area)
 (3194 grand-china-restaurant chinese 3.0 5100 el-camino-real los-altos
  santa-clara-county bay-area)
 (3195 hunan-homes-restaurant chinese 3.7 4880 el-camino-real los-altos
  santa-clara-county bay-area)
 (3196 lucky-chinese-restaurant chinese 2.7 140 state-st los-altos
  santa-clara-county bay-area)
 (3197 mandarin-classic chinese 3.3 397 main-st los-altos
  santa-clara-county bay-area)
 (3198 royal-palace chinese 2.5 4320 el-camino-real los-altos
  santa-clara-county bay-area)
 (3199 ednarays-restaurant chinese 1.7 406 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (3200 tea-garden-chinese-kitchen chinese 2.0 14030 blossom-hill-rd
  los-gatos santa-clara-county bay-area)
 (3201 ying-n-roses-chinese-deli chinese 2.0 15495 los-gatos-blvd-no.-f
  los-gatos santa-clara-county bay-area)
 (3202 canton-restaurant chinese 2.0 719 main-st martinez
  contra-costa-county bay-area)
 (3203 china-villa-restaurant chinese 2.0 2376 pacheco-blvd martinez
  contra-costa-county bay-area)
 (3204 grand-china chinese 2.3 1135 arnold-dr-ste-g martinez
  contra-costa-county bay-area)
 (3205 gung-ho-kitchen chinese 2.3 170 arnold-drive-no.120 martinez
  contra-costa-county bay-area)
 (3206 sunflower-garden chinese 2.0 822 escobar-st martinez
  contra-costa-county bay-area)
 (3207 k-2-the-ultimate-chinese-food chinese 2.0 1180 alma-st
  menlo-park san-mateo-county bay-area)
 (3208 su-hong-restaurant chinese 3.1 1039 el-camino-real menlo-park
  san-mateo-county bay-area)
 (3209 su-hong-to-go chinese 2.0 630 menlo-ave menlo-park
  san-mateo-county bay-area)
 (3210 yuen-yung-restaurant chinese 3.0 639 santa-cruz-ave menlo-park
  san-mateo-county bay-area)
 (3211 flower-lounge-restaurant chinese 2.5 51 millbrae-ave millbrae
  san-mateo-county bay-area)
 (3212 mandarin-restaurant chinese 3.0 465 broadway millbrae
  san-mateo-county bay-area)
 (3213 chins-take-out-chinese-food chinese 2.0 114 poppy-ct milpitas
  santa-clara-county bay-area)
 (3214 china-express chinese 2.0 1455 landess-ave milpitas
  santa-clara-county bay-area)
 (3215 fortune-china-restaurant chinese 2.0 978 hanson-ct milpitas
  santa-clara-county bay-area)
 (3216 koongs-mandarin-&-szechuan chinese 2.8 103 n-milpitas-blvd
  milpitas santa-clara-county bay-area)
 (3217 new-china-station chinese 2.7 1828 n-milpitas-blvd milpitas
  santa-clara-county bay-area)
 (3218 new-sam-kee-chinese-restaurant chinese 2.3 775
  e-capitol-ave-no.-a milpitas santa-clara-county bay-area)
 (3219 chef-chao-restaurant chinese 3.0 343 rheem-blvd moraga unknown
  bay-area)
 (3220 mandarin-flower-restaurant chinese 3.0 581 moraga-rd moraga
  unknown bay-area)
 (3221 shangri chinese 2.0 1460 moraga-rd-ste-b moraga unknown
  bay-area)
 (3222 uncle-lys-restaurant chinese 3.0 380 park-st moraga unknown
  bay-area)
 (3223 china-palace-restaurant chinese 2.8 16715 monterey-rd-no.-c
  morgan-hill santa-clara-county bay-area)
 (3224 golden-china chinese 2.0 16965 monterey-rd-no.-108e morgan-hill
  santa-clara-county bay-area)
 (3225 morgan-hill-chinese-food chinese 2.7 340 pebble-creek-ct
  morgan-hill santa-clara-county bay-area)
 (3226 peking-restaurant chinese 2.7 92 e-2nd-st morgan-hill
  santa-clara-county bay-area)
 (3227 beijing-house-restaurant chinese 2.7 779 e-evelyn-ave-no.-b
  mountain-view santa-clara-county bay-area)
 (3228 china-city-restaurant chinese 2.0 855 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (3229 china-hut chinese 2.0 2522 mardell-way mountain-view
  santa-clara-county bay-area)
 (3230 colonel-lees-mongolian-barbeque chinese 1.8 304 castro-st
  mountain-view santa-clara-county bay-area)
 (3231 golden-wok-restaurant chinese 2.7 895 villa-st mountain-view
  santa-clara-county bay-area)
 (3232 hangen-szechuan-restaurant chinese 3.4 134 castro-st
  mountain-view santa-clara-county bay-area)
 (3233 hong-kee-chinese-restaurant chinese 3.4 600 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (3234 hunan-gourmet chinese 2.9 102 castro-st mountain-view
  santa-clara-county bay-area)
 (3235 kirin-chinese-restaurant chinese 2.0 485 castro-st mountain-view
  santa-clara-county bay-area)
 (3236 pauls-chinese-food-to chinese 2.0 1924 old-middlefield-way-no.-e
  mountain-view santa-clara-county bay-area)
 (3237 south-china-restaurant chinese 2.0 152 castro-st mountain-view
  santa-clara-county bay-area)
 (3238 sun-sun-chinese-food chinese 2.5 867 e-el-camino-real
  mountain-view santa-clara-county bay-area)
 (3239 szechuan-garden-restaurant chinese 3.7 124 castro-st
  mountain-view santa-clara-county bay-area)
 (3240 the-szechuan-palace chinese 2.0 1991 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (3241 tien-fu chinese 3.6 174 castro-st mountain-view
  santa-clara-county bay-area)
 (3242 treasure-pot-chinese-restaurant chinese 2.8 2650
  w-el-camino-real mountain-view santa-clara-county bay-area)
 (3243 asia-cafe chinese 2.0 825 main-st napa napa-county napa-valley)
 (3244 china-cafe chinese 2.0 2940 jefferson-st napa napa-county
  napa-valley)
 (3245 china-light-restaurant chinese 2.0 1012 x1st-st napa napa-county
  napa-valley)
 (3246 hunan-restaurant chinese 2.0 915 freeway-dr napa napa-county
  napa-valley)
 (3247 mandarin-chinese-restaurant chinese 2.0 1675 trancas-st napa
  napa-county napa-valley)
 (3248 mini-garden-chinese-restaurant chinese 2.0 3638 bel-aire-plz
  napa napa-county napa-valley)
 (3249 peking-palace-restaurant chinese 2.0 1001 x2nd-st napa
  napa-county napa-valley)
 (3250 rainbow-garden chinese 2.0 2985 jefferson-st napa napa-county
  napa-valley)
 (3251 soo-yuan-restaurant chinese 2.7 1144 jordan-ln napa napa-county
  napa-valley)
 (3252 wahsing-chinese-mandarin-rest chinese 2.0 1445 imola-ave napa
  napa-county napa-valley)
 (3253 formosa-chinese-restaurant chinese 2.0 39119 cedar-blvd newark
  alameda-county bay-area)
 (3254 jade-palace-of-newark chinese 2.0 64 lewis-center newark
  alameda-county bay-area)
 (3255 kings-chop-suey chinese 2.0 36926 sycamore-st newark
  alameda-county bay-area)
 (3256 maychinese-food chinese 2.0 6295 jarvis-ave newark
  alameda-county bay-area)
 (3257 beef-noodle-soup chinese 2.0 354 x17th-st oakland alameda-county
  bay-area)
 (3258 beef-noodle-soup chinese 2.0 416 x13th-st oakland alameda-county
  bay-area)
 (3259 berkeley-sun-hong-kong-restaurant chinese 2.0 4000 rhoda-ave
  oakland alameda-county bay-area)
 (3260 canton-city chinese 2.0 1698 x7th-st oakland alameda-county
  bay-area)
 (3261 canton-restaurant chinese 2.0 1442 franklin-st oakland
  alameda-county bay-area)
 (3262 canton-restaurant chinese 2.0 10800 bancroft-ave oakland
  alameda-county bay-area)
 (3263 chans-restaurant chinese 2.0 4326 virginia-ave oakland
  alameda-county bay-area)
 (3264 china-cafe chinese 2.0 1327 peralta-st oakland alameda-county
  bay-area)
 (3265 china-cafe chinese 2.0 8012 macarthur-blvd oakland
  alameda-county bay-area)
 (3266 china-pack chinese 2.0 2943 carmel-st oakland alameda-county
  bay-area)
 (3267 china-station chinese 2.0 1614 castro-st oakland alameda-county
  bay-area)
 (3268 chinese-garden chinese 2.0 10 hegenberger-rd oakland
  alameda-county bay-area)
 (3269 chuan-yuen-restaurant chinese 2.0 5897 college-ave oakland
  alameda-county bay-area)
 (3270 deli-chinese-kitchen chinese 2.0 1100 bayview-ave oakland
  alameda-county bay-area)
 (3271 dragon-terrace-restaurant chinese 2.3 346 x9th-st-ste-210
  oakland alameda-county bay-area)
 (3272 economy-chop-suey chinese 2.0 399 x8th-st oakland alameda-county
  bay-area)
 (3273 egg-roll-kitchen chinese 2.0 6650 bancroft-ave oakland
  alameda-county bay-area)
 (3274 flower-lounge-restaurant chinese 2.0 2033 macarthur-blvd oakland
  alameda-county bay-area)
 (3275 fortune-restaurant chinese 2.0 940 webster-st oakland
  alameda-county bay-area)
 (3276 golden-lily-restaurant chinese 2.0 391 grand-ave oakland
  alameda-county bay-area)
 (3277 golden-peacock-restaurant chinese 2.0 825 webster-st oakland
  alameda-county bay-area)
 (3278 gourmet-house chinese 2.0 3407 fruitvale-avenue oakland
  alameda-county bay-area)
 (3279 grand-palace-resturant chinese 2.0 2216 broadway oakland
  alameda-county bay-area)
 (3280 great-wall-chinese-restaurant chinese 2.8 6247 college-ave
  oakland alameda-county bay-area)
 (3281 green-garden-mandarin-restaura chinese 2.0 296 hegenberger-rd
  oakland alameda-county bay-area)
 (3282 gum-wah-restaurant chinese 2.0 345 x8th-st oakland
  alameda-county bay-area)
 (3283 hai-king chinese 2.0 3941 piedmont-ave oakland alameda-county
  bay-area)
 (3284 happy-noodle-house chinese 2.3 723 webster-st oakland
  alameda-county bay-area)
 (3285 happy-seasons-restaurant chinese 2.3 1009 harrison-st oakland
  alameda-county bay-area)
 (3286 hawaii-of-china-chef chinese 2.0 333 x17th-st oakland
  alameda-county bay-area)
 (3287 hos-chinese-food chinese 1.7 186 eastmont-mall oakland
  alameda-county bay-area)
 (3288 hong-kong-fast-food chinese 2.0 900 market-st oakland
  alameda-county bay-area)
 (3289 hong-kong-garden chinese 2.0 310 broadway oakland alameda-county
  bay-area)
 (3290 hong-kong-kitchen chinese 2.7 3731 e-14th-st oakland
  alameda-county bay-area)
 (3291 hos-chinese-kitchen chinese 2.0 2907 fruitvale-ave oakland
  alameda-county bay-area)
 (3292 houng-que chinese 2.0 541 e-12th-st-no.-1 oakland alameda-county
  bay-area)
 (3293 hunan-rest chinese 2.0 333 e-15th-st oakland alameda-county
  bay-area)
 (3294 hunan-restaurant chinese 2.0 396 x11th-st oakland alameda-county
  bay-area)
 (3295 hunan-village chinese 2.7 3232 grand-ave oakland alameda-county
  bay-area)
 (3296 hunan-yuan-restaurant chinese 2.0 11893 skyline-blvd oakland
  alameda-county bay-area)
 (3297 hyang-won-restaurant chinese 2.0 308 x14th-st oakland
  alameda-county bay-area)
 (3298 imperial-garden chinese 2.0 320 x8th-st-ste-2-b oakland
  alameda-county bay-area)
 (3299 imperial-house chinese 2.0 1528 san-pablo-ave oakland
  alameda-county bay-area)
 (3300 jade-palace-restaurant chinese 1.7 2531 macarthur-blvd oakland
  alameda-county bay-area)
 (3301 jade-villa chinese 2.2 800 broadway oakland alameda-county
  bay-area)
 (3302 joy-luck-restaurant chinese 3.0 327 x8th-st oakland
  alameda-county bay-area)
 (3303 kams-chinese-restaurant chinese 2.0 2810 e-14th-st oakland
  alameda-county bay-area)
 (3304 kim-do-restaurant chinese 2.0 2328 x14th-ave oakland
  alameda-county bay-area)
 (3305 kim-huong-restaurant chinese 2.0 541 e-12th-st-no.-1 oakland
  alameda-county bay-area)
 (3306 kim-ling-chop-suey chinese 2.0 3284 e-14th-st oakland
  alameda-county bay-area)
 (3307 kin-li-little-restaurant chinese 2.0 4066 piedmont-ave oakland
  alameda-county bay-area)
 (3308 king-wah-restaurant chinese 2.7 383 x9th-st oakland
  alameda-county bay-area)
 (3309 king-yen-restaurant chinese 2.3 4080 piedmont-ave oakland
  alameda-county bay-area)
 (3310 kong-chow-restaurant chinese 2.0 373 x8th-st oakland
  alameda-county bay-area)
 (3311 kow-loon-chinese-kitchen chinese 2.0 3415 grand-ave oakland
  alameda-county bay-area)
 (3312 kum-hay-restaurant chinese 2.0 708 franklin-st oakland
  alameda-county bay-area)
 (3313 lees-cafe chinese 2.3 2852 mountain-blvd oakland alameda-county
  bay-area)
 (3314 lees-chinese-food chinese 2.0 932 loomis-ct oakland
  alameda-county bay-area)
 (3315 lims-garden chinese 2.0 9509 e-14th-st oakland alameda-county
  bay-area)
 (3316 little-plum-tree-restaurant chinese 2.0 326 x23rd-st-no.-d
  oakland alameda-county bay-area)
 (3317 little-shin-shin-restaurant chinese 3.3 4258 piedmont-ave
  oakland alameda-county bay-area)
 (3318 lucky-dragon-cafe chinese 2.0 2800 bartlettst oakland
  alameda-county bay-area)
 (3319 lucky-restaurant chinese 2.0 3271 lakeshore-ave oakland
  alameda-county bay-area)
 (3320 ly-luck-restaurant chinese 2.7 3537 fruitvale-ave oakland
  alameda-county bay-area)
 (3321 man-du-house chinese 2.0 346 x14th-st oakland alameda-county
  bay-area)
 (3322 maple-garden chinese 2.3 3601 grand-ave oakland alameda-county
  bay-area)
 (3323 mr-egg-roll chinese 2.0 6465 san-pablo-ave oakland
  alameda-county bay-area)
 (3324 nan-king-restaurant chinese 3.0 369 x12th-st oakland
  alameda-county bay-area)
 (3325 nan-yang-restaurant chinese 2.8 301 x8th-st oakland
  alameda-county bay-area)
 (3326 nan-yang-rockridge chinese 3.0 6048 college-ave oakland
  alameda-county bay-area)
 (3327 new-chinatown-restaurant chinese 2.0 2827 best-ave oakland
  alameda-county bay-area)
 (3328 new-dragon-phoenix-restaurant chinese 2.0 3655 piedmont-ave
  oakland alameda-county bay-area)
 (3329 new-peking-restaurant chinese 2.0 2935 foothill-blvd oakland
  alameda-county bay-area)
 (3330 new-tung-kee-noodle-house chinese 2.0 360 x11th-st oakland
  alameda-county bay-area)
 (3331 phoenix chinese 2.3 2000 park-blvd oakland alameda-county
  bay-area)
 (3332 quick-wak-restaurant chinese 2.0 5401 e-14th-st oakland
  alameda-county bay-area)
 (3333 shan-dong-mandarin-restaurant chinese 2.0 328 x10th-st oakland
  alameda-county bay-area)
 (3334 shen-wei-restaurant chinese 2.0 728 webster-st oakland
  alameda-county bay-area)
 (3335 silver-dragon chinese 2.8 835 webster-st oakland alameda-county
  bay-area)
 (3336 sings-kitchen chinese 2.0 6336 shattuck-ave oakland
  alameda-county bay-area)
 (3337 sings-garden-restaurant chinese 2.0 257 x12th-st oakland
  alameda-county bay-area)
 (3338 south-china-restaurant chinese 2.7 1852 park-blvd oakland
  alameda-county bay-area)
 (3339 sums-restaurant chinese 2.0 2541 telegraph-ave oakland
  alameda-county bay-area)
 (3340 sun-hong-kong-restaurant chinese 2.0 389 x8th-st oakland
  alameda-county bay-area)
 (3341 sun-luck-restaurant chinese 2.0 387 x9th-st oakland
  alameda-county bay-area)
 (3342 sun-tai-wong-restaurant chinese 2.0 729 webster-st oakland
  alameda-county bay-area)
 (3343 szchuan-restaurant chinese 3.3 528 lake-park-ave oakland
  alameda-county bay-area)
 (3344 szechuan-garden-restaurant chinese 2.0 4290 piedmont-ave oakland
  alameda-county bay-area)
 (3345 szechwan-restaurant chinese 2.0 366 x8th-st oakland
  alameda-county bay-area)
 (3346 tea-garden-restaurant chinese 2.0 3421 macarthur-blvd oakland
  alameda-county bay-area)
 (3347 thanh-tri-restaurant chinese 2.0 549 e-12th-st oakland
  alameda-county bay-area)
 (3348 the-best-dim-sum-&-pastry-rest chinese 2.0 723 e-12th-st oakland
  alameda-county bay-area)
 (3349 the-orient-express chinese 2.0 304 fairmount-ave-apt-2 oakland
  alameda-county bay-area)
 (3350 the-vo-restaurant chinese 2.0 59 grand-ave oakland
  alameda-county bay-area)
 (3351 tin-sing-restaurant chinese 2.0 2068 x35th-ave oakland
  alameda-county bay-area)
 (3352 toms-chinese-kitchen chinese 2.0 5907 foothill-blvd oakland
  alameda-county bay-area)
 (3353 vien-huong-restaurant chinese 2.0 712 franklin-st oakland
  alameda-county bay-area)
 (3354 wing-wing-restaurant chinese 2.0 3009 macarthur-blvd oakland
  alameda-county bay-area)
 (3355 wings-daily-kitchen chinese 2.0 3019 foothill-blvd oakland
  alameda-county bay-area)
 (3356 wongs-imperial-restaurant chinese 2.0 3219 lakeshore-ave oakland
  alameda-county bay-area)
 (3357 yang-chow-restaurant chinese 2.3 3211 grand-ave oakland
  alameda-county bay-area)
 (3358 ying-kee-noodle-house chinese 2.7 373 x8th-st oakland
  alameda-county bay-area)
 (3359 yuet-ming-restaurant chinese 2.0 2818 macarthur-blvd oakland
  alameda-county bay-area)
 (3360 yung-kee-restaurant chinese 2.7 888 webster-st oakland
  alameda-county bay-area)
 (3361 gold-chopsticks-restaurant chinese 2.5 2525 main-st oakley
  contra-costa-county bay-area)
 (3362 silver-river-restaurant chinese 2.0 276 main-st-no.-278 oakley
  contra-costa-county bay-area)
 (3363 szechwan-restaurant chinese 3.0 79 orinda-way orinda
  contra-costa-county bay-area)
 (3364 wu-kong-restaurant chinese 2.0 42 southwood-dr orinda
  contra-costa-county bay-area)
 (3365 hop-sings-kitchen chinese 2.0 5868 pacheco-blvd pacheco unknown
  unknown)
 (3366 wok-&-grill-restaurant chinese 2.0 5867 pacheco-blvd pacheco
  unknown unknown)
 (3367 sams-chinese-kitchen chinese 2.0 793 hickey-blvd pacifica
  san-mateo-county bay-area)
 (3368 tams chinese 2.7 494 manor-plz pacifica san-mateo-county
  bay-area)
 (3369 china-delight-restaurant chinese 3.2 461 emerson-st palo-alto
  santa-clara-county bay-area)
 (3370 china-lion chinese 3.3 3345 el-camino-real palo-alto
  santa-clara-county bay-area)
 (3371 fresh-taste-mandarin-kitchen chinese 3.5 2111 el-camino-real
  palo-alto santa-clara-county bay-area)
 (3372 jing-jing-szechwan-hunan-gourmet chinese 3.3 443 emerson-st
  palo-alto santa-clara-county bay-area)
 (3373 mandarin-gourmet chinese 2.9 420 ramona-st palo-alto
  santa-clara-county bay-area)
 (3374 mings-villa chinese 3.4 1700 embarcadero-rd palo-alto
  santa-clara-county bay-area)
 (3375 mr-chaus-chinese-fast-food chinese 3.2 3781 el-camino-real
  palo-alto santa-clara-county bay-area)
 (3376 peking-duck-restaurant chinese 3.0 2310 el-camino-real palo-alto
  santa-clara-county bay-area)
 (3377 rangoon-restaurant chinese 3.1 565 bryant-st palo-alto
  santa-clara-county bay-area)
 (3378 su-hong-restaurant chinese 3.2 4101 el-camino-way palo-alto
  santa-clara-county bay-area)
 (3379 szechwan-cafe-chinese-restaurant chinese 2.0 406
  s-california-ave palo-alto santa-clara-county bay-area)
 (3380 mandarin-cuisine-the chinese 2.0 3417 alma-st palo-alto
  santa-clara-county bay-area)
 (3381 house-of-hunan chinese 2.3 2700 pinole-valley-rd pinole
  contra-costa-county bay-area)
 (3382 hunan-villa-restaurant chinese 2.0 632 san-pablo-ave-no.-a
  pinole contra-costa-county bay-area)
 (3383 peking-garden-restaurant chinese 3.4 1501 tara-hills-dr pinole
  contra-costa-county bay-area)
 (3384 rich-potsticker-house chinese 2.0 516 lopes-ct pinole
  contra-costa-county bay-area)
 (3385 uncle-chungs-szechuan chinese 3.5 2550 appian-way pinole
  contra-costa-county bay-area)
 (3386 cantons-kitchen chinese 2.0 184 atlantic-ave pittsburg
  contra-costa-county bay-area)
 (3387 chinese-restaurant chinese 2.0 1205 railroad pittsburg
  contra-costa-county bay-area)
 (3388 good-view-chinese-restaurant chinese 2.5 2909 railroad pittsburg
  contra-costa-county bay-area)
 (3389 taste-of-the-orient-fast-food chinese 2.0 2273 railroad
  pittsburg contra-costa-county bay-area)
 (3390 yens-chinese-cuisine chinese 2.0 2141 loveridge-rd pittsburg
  contra-costa-county bay-area)
 (3391 almond-bud-villa chinese 2.0 2344 monument-blvd pleasant-hill
  contra-costa-county bay-area)
 (3392 china-garden chinese 2.3 2223 morello-ave pleasant-hill
  contra-costa-county bay-area)
 (3393 golden-ching chinese 2.0 2653 pleasant-hill-rd pleasant-hill
  contra-costa-county bay-area)
 (3394 golden-city-ii-restaurant chinese 2.0 548
  contra-costa-blvd-ste-w pleasant-hill contra-costa-county bay-area)
 (3395 lees-cafe chinese 2.0 548 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (3396 lee-wah-restaurant chinese 2.0 1428 contra-costa-blvd
  pleasant-hill contra-costa-county bay-area)
 (3397 ming-wah-restaurant chinese 2.7 2290 monument-blvd pleasant-hill
  contra-costa-county bay-area)
 (3398 sum-sun-garden chinese 2.7 1675 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (3399 three-brothers-from-china chinese 3.2 2001
  contra-costa-blvd-no.-a50 pleasant-hill contra-costa-county bay-area)
 (3400 tsing-tao-restaurant chinese 2.0 1958 contra-costa-blvd
  pleasant-hill contra-costa-county bay-area)
 (3401 china-room-restaurant chinese 2.0 1703 santa-rita-rd pleasanton
  alameda-county bay-area)
 (3402 china-wok-restaurant chinese 2.3 3350 bernal-avenue-no.130
  pleasanton alameda-county bay-area)
 (3403 chinese-garden-restaurant chinese 3.0 6654
  koll-center-pky-ste-115 pleasanton alameda-county bay-area)
 (3404 chinese-szechuan-restaurant chinese 2.0 3059 hopyard-rd-ste-f
  pleasanton alameda-county bay-area)
 (3405 first-hunan-restaurant chinese 2.3 239 main-st-no.-a pleasanton
  alameda-county bay-area)
 (3406 gold-chopsticks-restaurant chinese 2.9 3170
  santa-rita-rd-no.-a-11 pleasanton alameda-county bay-area)
 (3407 gum-kuo-restaurant chinese 2.0 3744 trenery-dr pleasanton
  alameda-county bay-area)
 (3408 hunan-chef-wong-chinese-restaurant chinese 2.0 4285 valley-ave
  pleasanton alameda-county bay-area)
 (3409 new-china-restaurant chinese 3.3 336 saint-marys-st pleasanton
  alameda-county bay-area)
 (3410 nicki-lees-chinese-cuisine chinese 2.0 201 main-st-ste-e
  pleasanton alameda-county bay-area)
 (3411 pot-sticker-of-pleasanton chinese 2.0 6063 w-las-positas-blvd
  pleasanton alameda-county bay-area)
 (3412 tongs-chinese-cuisine chinese 3.4 425 main-st pleasanton
  alameda-county bay-area)
 (3413 chef-peking-restaurant chinese 1.8 515 veterans-blvd
  redwood-city san-mateo-county bay-area)
 (3414 great-wall-chinese-restaurant chinese 2.7 670 el-camino-real
  redwood-city san-mateo-county bay-area)
 (3415 szechuan-palace-restaurant chinese 2.0 1784 broadway
  redwood-city san-mateo-county bay-area)
 (3416 u-s-chinese-food chinese 1.5 2490 el-camino-real redwood-city
  san-mateo-county bay-area)
 (3417 yat-sing-mandarin-cuisine chinese 2.0 1001 marsh-rd redwood-city
  san-mateo-county bay-area)
 (3418 golden-china-restaurant chinese 2.0 2800 hilltop-mall-rd-ste-250
  richmond contra-costa-county bay-area)
 (3419 golden-palace chinese 2.0 3829 macdonald-ave richmond
  contra-costa-county bay-area)
 (3420 hunan-chef chinese 2.3 130 railroad richmond contra-costa-county
  bay-area)
 (3421 hunan-chef-restaurant chinese 2.0 130 railroad richmond
  contra-costa-county bay-area)
 (3422 liaos-foods chinese 2.0 3503 lowell-ave richmond
  contra-costa-county bay-area)
 (3423 little-china chinese 2.3 152 washington-ave richmond
  contra-costa-county bay-area)
 (3424 little-china-restaurant chinese 2.0 152 washington-st. richmond
  contra-costa-county bay-area)
 (3425 mandarin-wok chinese 2.0 719 ventura-st richmond
  contra-costa-county bay-area)
 (3426 point-orient chinese 1.7 199 park-pl. richmond
  contra-costa-county bay-area)
 (3427 point-orient-restaurant chinese 2.0 199 park-pl richmond
  contra-costa-county bay-area)
 (3428 siam-grocery-&-noodle-house chinese 3.0 2330 macdonald-ave
  richmond contra-costa-county bay-area)
 (3429 sun-lim-restaurant chinese 2.0 2453 hilltop-mall-rd richmond
  contra-costa-county bay-area)
 (3430 uncle-sam-chinese-restaurant chinese 2.0 4705
  valley-view-rd-ste-f richmond contra-costa-county bay-area)
 (3431 uncle-sam-chinese-restaurant chinese 2.0 4705
  valley-view-rd-ste-f richmond contra-costa-county bay-area)
 (3432 happy-wok-chinese-restaurant chinese 2.0 677 parker-ave rodeo
  unknown unknown)
 (3433 gau-poang-chinese-restaurant chinese 2.0 275 s-airport-blvd
  south-san-francisco san-mateo-county bay-area)
 (3434 mandarin-palace chinese 2.0 2221 gellert-blvd
  south-san-francisco san-mateo-county bay-area)
 (3435 new-peking-duck-house-restaurant chinese 2.0 415 grand-ave
  south-san-francisco san-mateo-county bay-area)
 (3436 paradise-chinese-restaurant chinese 2.0 2284 westborough-blvd
  south-san-francisco san-mateo-county bay-area)
 (3437 superior-chinese-restaurant chinese 2.0 216 cypress-ave
  south-san-francisco san-mateo-county bay-area)
 (3438 taiwan-restaurant-of-san-franc chinese 2.0 3879 shamrock-ct
  south-san-francisco san-mateo-county bay-area)
 (3439 tengs-restaurant chinese 2.0 1113 hunt-ave saint-helena
  napa-county napa-valley)
 (3440 china-express chinese 2.0 851 cherry-ave-no.-34 san-bruno
  san-mateo-county bay-area)
 (3441 china-king chinese 2.0 711 el-camino-real san-bruno
  san-mateo-county bay-area)
 (3442 panda-express chinese 2.0 301 tanforan-park-no.-121 san-bruno
  san-mateo-county bay-area)
 (3443 szechwan-restaurant chinese 2.0 681 san-mateo-ave san-bruno
  san-mateo-county bay-area)
 (3444 a-b-c-ocean-restaurant chinese 2.3 nil nil san-carlos
  san-mateo-county bay-area)
 (3445 china-chef chinese 2.0 2653 san-carlos-ave san-carlos
  san-mateo-county bay-area)
 (3446 golden-china-restaurant chinese 2.0 66 club-dr san-carlos
  san-mateo-county bay-area)
 (3447 king-chwan-chinese-restaurant chinese 2.8 1188 san-carlos-ave
  san-carlos san-mateo-county bay-area)
 (3448 new-flower-drum-restaurant chinese 2.8 1050 el-camino-real
  san-carlos san-mateo-county bay-area)
 (3449 north-china-inn chinese 2.0 66 club-dr san-carlos
  san-mateo-county bay-area)
 (3450 royal-garden-chinese-cuisine chinese 2.8 1528 laurel-st
  san-carlos san-mateo-county bay-area)
 (3451 asian-restaurant chinese 2.0 5173 mission san-francisco
  san-francisco-county bay-area)
 (3452 bow-hon-restaurant chinese 2.0 850 grant-avenue san-francisco
  san-francisco-county bay-area)
 (3453 brandy-hos-hunan-food chinese 3.5 217 columbus-avenue
  san-francisco san-francisco-county bay-area)
 (3454 brandy-hos-on-broadway chinese 2.8 450 broadway san-francisco
  san-francisco-county bay-area)
 (3455 celadon-restaurant chinese 2.0 881 clay san-francisco
  san-francisco-county bay-area)
 (3456 chans-chinese-kitchen chinese 2.0 336 clement san-francisco
  san-francisco-county bay-area)
 (3457 china-court-restaurant chinese 2.5 599 castro san-francisco
  san-francisco-county bay-area)
 (3458 china-moon chinese 2.9 639 post-rd san-francisco
  san-francisco-county bay-area)
 (3459 china-sea-restaurant chinese 2.0 242 ofarrell san-francisco
  san-francisco-county bay-area)
 (3460 chinese-kitchen chinese 2.0 1358 mason san-francisco
  san-francisco-county bay-area)
 (3461 choke-your-chicken chinese 3.0 183 bay-st san-francisco
  san-francisco-county bay-area)
 (3462 chop-sticks-fast-food chinese 2.0 4615 mission san-francisco
  san-francisco-county bay-area)
 (3463 chu-lin-restaurant chinese 2.8 2428 clement san-francisco
  san-francisco-county bay-area)
 (3464 empress-of-china chinese 2.4 838 grant-avenue san-francisco
  san-francisco-county bay-area)
 (3465 fortune-restaurant chinese 2.0 675 broadway san-francisco
  san-francisco-county bay-area)
 (3466 fountain-court-restaurant chinese 2.9 354 clement san-francisco
  san-francisco-county bay-area)
 (3467 four-seas-restaurant chinese 2.3 731 grant-avenue san-francisco
  san-francisco-county bay-area)
 (3468 golden-dragon-restaurant chinese 2.3 816 washington
  san-francisco san-francisco-county bay-area)
 (3469 golden-phoenix chinese 2.0 728 washington san-francisco
  san-francisco-county bay-area)
 (3470 golden-phoenix-restaurant-no-2 chinese 2.0 1106
  market-in-regent-hotel san-francisco san-francisco-county bay-area)
 (3471 grand-palace-restaurant chinese 2.3 950 grant-avenue
  san-francisco san-francisco-county bay-area)
 (3472 great-wall-restaurant chinese 2.0 4542 irving san-francisco
  san-francisco-county bay-area)
 (3473 guilin-restaurant chinese 2.0 2234 mission san-francisco
  san-francisco-county bay-area)
 (3474 has-restaurant chinese 2.8 2335 irving san-francisco
  san-francisco-county bay-area)
 (3475 has-restaurant chinese 3.0 2360 van-ness-avenue san-francisco
  san-francisco-county bay-area)
 (3476 harbor-village-restaurant chinese 3.3 4 embarcadero-center
  san-francisco san-francisco-county bay-area)
 (3477 henry-chungs-original-hunan-restaurant chinese 3.1 924 sansome
  san-francisco san-francisco-county bay-area)
 (3478 henry-chungs-original-hunan-restaurant chinese 3.0 1016 bryant
  san-francisco san-francisco-county bay-area)
 (3479 henry-chungs-original-hunan-restaurant chinese 3.2 674
  sacramento san-francisco san-francisco-county bay-area)
 (3480 hing-lung-restaurant chinese 2.9 674 broadway san-francisco
  san-francisco-county bay-area)
 (3481 hong-kong-restaurant chinese 2.0 245 church-st san-francisco
  san-francisco-county bay-area)
 (3482 hong-kong-seafood-restaurant-noriega chinese 2.7 2578 noriega
  san-francisco san-francisco-county bay-area)
 (3483 house-of-nan-king chinese 3.6 919 kearny san-francisco
  san-francisco-county bay-area)
 (3484 hunan-shoalin-on-polk chinese 2.0 1150 polk san-francisco
  san-francisco-county bay-area)
 (3485 imperial-palace chinese 2.3 919 grant-avenue san-francisco
  san-francisco-county bay-area)
 (3486 kams-restaurant chinese 2.7 3620 balboa-st san-francisco
  san-francisco-county bay-area)
 (3487 lichee-garden-restaurant chinese 2.5 1416 powell san-francisco
  san-francisco-county bay-area)
 (3488 little-hunan-restaurant chinese 2.0 1537 ocean-avenue
  san-francisco san-francisco-county bay-area)
 (3489 little-wing-lee chinese 2.0 4450 cabrillo san-francisco
  san-francisco-county bay-area)
 (3490 m-b-e-restaurant chinese 2.3 239 clement san-francisco
  san-francisco-county bay-area)
 (3491 mai-lum-restaurant chinese 2.0 519 cortland-avenue san-francisco
  san-francisco-county bay-area)
 (3492 mandarin-palace chinese 2.0 2800 leavenworth san-francisco
  san-francisco-county bay-area)
 (3493 new-asia chinese 2.9 772 pacific-avenue san-francisco
  san-francisco-county bay-area)
 (3494 new-sun-hong-kong-restaurant chinese 2.0 606 broadway
  san-francisco san-francisco-county bay-area)
 (3495 ocean-restaurant chinese 2.4 726 clement san-francisco
  san-francisco-county bay-area)
 (3496 pearl-city chinese 2.3 641 jackson san-francisco
  san-francisco-county bay-area)
 (3497 pot-&-pan-restaurant chinese 2.3 1243 x9th-avenue san-francisco
  san-francisco-county bay-area)
 (3498 sampan-restaurants chinese 2.0 1900 ocean-avenue san-francisco
  san-francisco-county bay-area)
 (3499 shangri-la-chinese-vegetarian-restaurant chinese 2.3 2026 irving
  san-francisco san-francisco-county bay-area)
 (3500 sun-hung-heung-restaurant chinese 2.0 744 washington
  san-francisco san-francisco-county bay-area)
 (3501 sun-kwong-restaurant chinese 2.0 1400 jackson san-francisco
  san-francisco-county bay-area)
 (3502 szechwan-san-francisco chinese 2.0 2209 polk san-francisco
  san-francisco-county bay-area)
 (3503 the-mandarin-restaurant chinese 3.5 0 square san-francisco
  san-francisco-county bay-area)
 (3504 the-pot-sticker chinese 2.3 150 waverly-pl. san-francisco
  san-francisco-county bay-area)
 (3505 tommy-toys-haute-cuisine-chinoise chinese 3.8 655 montgomery
  san-francisco san-francisco-county bay-area)
 (3506 tonga-room chinese 2.6 0 the-fairmont san-francisco
  san-francisco-county bay-area)
 (3507 tsing-tao-chinese-restaurant chinese 2.3 3107 clement
  san-francisco san-francisco-county bay-area)
 (3508 wing-lee-restaurant chinese 2.8 1810 polk san-francisco
  san-francisco-county bay-area)
 (3509 wu-kong-restaurant chinese 3.0 101 spear san-francisco
  san-francisco-county bay-area)
 (3510 yank-sing-restaurants chinese 3.9 427 battery san-francisco
  san-francisco-county bay-area)
 (3511 yank-sing-restaurants chinese 2.7 49 stevenson san-francisco
  san-francisco-county bay-area)
 (3512 yet-wah-restaurant chinese 3.3 2140 clement san-francisco
  san-francisco-county bay-area)
 (3513 yet-wah-restaurant chinese 3.0 0 39 san-francisco
  san-francisco-county bay-area)
 (3514 yuens-garden chinese 2.0 1131 grant-avenue san-francisco
  san-francisco-county bay-area)
 (3515 yuet-lee-seafood-restaurant-inc chinese 3.2 1300 stockton
  san-francisco san-francisco-county bay-area)
 (3516 yuet-lee-seafood-restaurant-inc chinese 3.3 3601 x26th
  san-francisco san-francisco-county bay-area)
 (3517 x3.6.9.-shanghai-restaurant chinese 2.5 1698 hostetter-rd.-no.e
  san-jose santa-clara-county bay-area)
 (3518 x3-6-9-shanghai-restaurant chinese 3.0 1419 stanton-way san-jose
  santa-clara-county bay-area)
 (3519 blossom-valley-chinese-kitchen chinese 2.0 5585 snell-ave
  san-jose santa-clara-county bay-area)
 (3520 boda-restaurant chinese 2.0 2868 story-rd san-jose
  santa-clara-county bay-area)
 (3521 chaochi-chinese-food chinese 2.0 1657 n-capitol-ave san-jose
  santa-clara-county bay-area)
 (3522 chef-ming-restaurant chinese 2.3 1628 hostetter-rd-no.-g
  san-jose santa-clara-county bay-area)
 (3523 china-chen-restaurant chinese 2.0 400 s-3rd-st san-jose
  santa-clara-county bay-area)
 (3524 china-delight-restaurant chinese 2.8 2037 woodard-rd san-jose
  santa-clara-county bay-area)
 (3525 china-express chinese 2.0 2307 mckee-rd san-jose
  santa-clara-county bay-area)
 (3526 china-express chinese 2.0 2811 story-rd-no.-a san-jose
  santa-clara-county bay-area)
 (3527 china-garden chinese 2.0 1890 w-san-carlos-st san-jose
  santa-clara-county bay-area)
 (3528 china-station-restaurant chinese 2.0 80 senter-rd san-jose
  santa-clara-county bay-area)
 (3529 china-tasee chinese 2.0 670 river-oaks-pky san-jose
  santa-clara-county bay-area)
 (3530 china-wok chinese 2.0 9 n-market-st san-jose santa-clara-county
  bay-area)
 (3531 chinese-food-restaurant chinese 2.0 4320 moorpark-ave san-jose
  santa-clara-county bay-area)
 (3532 chou-house chinese 2.0 2622 union-ave san-jose
  santa-clara-county bay-area)
 (3533 dynasty-chinese-buffet chinese 2.0 1720 story-rd san-jose
  santa-clara-county bay-area)
 (3534 dynasty-chinese-restaurant chinese 2.0 1865 w-san-carlos-st
  san-jose santa-clara-county bay-area)
 (3535 emperors-garden-restaurant chinese 2.3 1181 lincoln-ave san-jose
  santa-clara-county bay-area)
 (3536 evergreen-chinese-restaurant chinese 2.0 1646
  saratoga-sunnyvale-rd san-jose santa-clara-county bay-area)
 (3537 fat-wok-restaurant chinese 1.7 4400 stevens-creek-blvd-no.-b
  san-jose santa-clara-county bay-area)
 (3538 fat-wok-restaurant chinese 2.8 6055 snell-ave san-jose
  santa-clara-county bay-area)
 (3539 fortune-chinese-restaurant chinese 2.0 1401 kooser-rd san-jose
  santa-clara-county bay-area)
 (3540 golden-buddha-chinese-restaurant chinese 2.0 2768 aborn-rd
  san-jose santa-clara-county bay-area)
 (3541 golden-house-chinese-restaurant chinese 2.0 7108
  santa-teresa-blvd san-jose santa-clara-county bay-area)
 (3542 golden-palace-restaurant chinese 2.0 1310 saratoga-ave san-jose
  santa-clara-county bay-area)
 (3543 good-year-chinese-restaurant chinese 2.0 1402 s-bascom-ave
  san-jose santa-clara-county bay-area)
 (3544 grand-china-dumpling-house chinese 2.0 1818 tully-rd-ste-128a
  san-jose santa-clara-county bay-area)
 (3545 hillsdale-chinese-restaurant chinese 2.0 1814
  hillsdale-ave-no.-c san-jose santa-clara-county bay-area)
 (3546 hoi-kee-chinese-food chinese 2.0 1818 tully-rd-ste-110 san-jose
  santa-clara-county bay-area)
 (3547 hongs-chinese-food-take-out chinese 3.3 6033 snell-avenue
  san-jose santa-clara-county bay-area)
 (3548 house-of-chu chinese 2.8 5365 camden-ave san-jose
  santa-clara-county bay-area)
 (3549 hunans-garden-restaurant chinese 2.0 2281 lincoln-ave san-jose
  santa-clara-county bay-area)
 (3550 hunan-taste chinese 3.9 998 n-4th-st san-jose santa-clara-county
  bay-area)
 (3551 jade-garden chinese 2.0 3479 mckee-rd san-jose
  santa-clara-county bay-area)
 (3552 kim-tar-b-b-q chinese 2.0 1698 hostetter-rd-no.-j san-jose
  santa-clara-county bay-area)
 (3553 king-egg-rolls chinese 2.0 980 lundy-ave san-jose
  santa-clara-county bay-area)
 (3554 little-hunan-restaurant chinese 2.3 1882 curtner-ave san-jose
  santa-clara-county bay-area)
 (3555 loon-wah-restaurant chinese 2.7 1132 saratoga-sunnyvale-rd
  san-jose santa-clara-county bay-area)
 (3556 mandarin-restaurant chinese 2.0 1317 s-winchester-blvd san-jose
  santa-clara-county bay-area)
 (3557 mayflower-chinese-rest chinese 2.0 1080 saratoga-ave-ste-5
  san-jose santa-clara-county bay-area)
 (3558 mings-take-out chinese 2.0 3855 x7-trees-blvd san-jose
  santa-clara-county bay-area)
 (3559 my-chinese-restaurant chinese 2.0 3080 landess-ave-no.-a
  san-jose santa-clara-county bay-area)
 (3560 nature-wok chinese 2.0 1060 leigh-ave san-jose
  santa-clara-county bay-area)
 (3561 new-china-station-restaurant chinese 2.0 4632 meridian-ave
  san-jose santa-clara-county bay-area)
 (3562 new-peking-chinese-restaurant chinese 2.7 5156 moorpark-ave
  san-jose santa-clara-county bay-area)
 (3563 new-szechwan-restaurant chinese 2.3 1075 saratoga-sunnyvale-rd
  san-jose santa-clara-county bay-area)
 (3564 new-viet-hoa-chinese-restaurant chinese 2.0 1144 n-4th-st
  san-jose santa-clara-county bay-area)
 (3565 orient-express-chinese-fast chinese 2.0 2632 alum-rock-ave
  san-jose santa-clara-county bay-area)
 (3566 orient-wok chinese 2.0 4750 almaden-expy-no.-f san-jose
  santa-clara-county bay-area)
 (3567 panda-delite-chinese-food chinese 2.0 1722 holin-st san-jose
  santa-clara-county bay-area)
 (3568 pearl-garden-chinese-restaurant chinese 2.3 4660 pearl-ave
  san-jose santa-clara-county bay-area)
 (3569 peking-garden-restaurant chinese 2.0 1375 blossom-hill-rd-no.-12
  san-jose santa-clara-county bay-area)
 (3570 peking-house-restaurant chinese 2.0 84 s-2nd-st san-jose
  santa-clara-county bay-area)
 (3571 phu-lam-chinese-restaurant chinese 2.0 3082 story-rd san-jose
  santa-clara-county bay-area)
 (3572 royal-garden-chinese-restaurant chinese 2.0 2760 glauser-dr
  san-jose santa-clara-county bay-area)
 (3573 sam-kee-chinese-restaurant chinese 2.0 301 n-jackson-ave-no.-c
  san-jose santa-clara-county bay-area)
 (3574 loon-wah chinese 2.0 1146 saratoga-sunnyvale-rd san-jose
  santa-clara-county bay-area)
 (3575 sechuan-chinese-food-to chinese 2.0 615 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (3576 snack-man-deli-chinese-rest chinese 2.0 523 mclaughlin-ave
  san-jose santa-clara-county bay-area)
 (3577 szechuan-taste-restaurant chinese 2.0 2678 cropley-ave san-jose
  santa-clara-county bay-area)
 (3578 tahoe-chinese-restaurant chinese 2.0 1431 foxworthy-ave san-jose
  santa-clara-county bay-area)
 (3579 taste-of-china chinese 3.5 1659 branham-ln-no.-i san-jose
  santa-clara-county bay-area)
 (3580 three-six-nine-shanghai-rstr chinese 2.0 1698 hostetter-rd-no.-e
  san-jose santa-clara-county bay-area)
 (3581 ume-chinese-fast-food chinese 2.0 2595 n-1st-st san-jose
  santa-clara-county bay-area)
 (3582 union-chinese-restaurant chinese 3.0 2615 union-ave san-jose
  santa-clara-county bay-area)
 (3583 wok-express chinese 2.0 150 s-1st-st-ste-f11 san-jose
  santa-clara-county bay-area)
 (3584 wok-inn-chinese-food chinese 2.0 1050 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (3585 wok-king-express chinese 2.0 2359 mckee-rd san-jose
  santa-clara-county bay-area)
 (3586 wons-chinese-food-take-out chinese 2.0 2524 berryessa-rd
  san-jose santa-clara-county bay-area)
 (3587 yuen-yung-restaurant chinese 2.3 7273 bark-ln san-jose
  santa-clara-county bay-area)
 (3588 chans-chinese-&-american-rstr chinese 2.0 1550 x162nd-ave-trlr-7
  san-leandro alameda-county bay-area)
 (3589 changs-garden-chinese-food chinese 2.0 15696 e-14th-st
  san-leandro alameda-county bay-area)
 (3590 china-kitchen chinese 2.0 15754 e-14th-st san-leandro
  alameda-county bay-area)
 (3591 chinese-food chinese 2.0 13 cascade-bayfair-ml san-leandro
  alameda-county bay-area)
 (3592 dragon-pearl-restaurant chinese 2.0 14736 e-14th-st san-leandro
  alameda-county bay-area)
 (3593 great-wall-restaurant chinese 2.5 15048 farnsworth-st
  san-leandro alameda-county bay-area)
 (3594 hidden-wok-restaurant chinese 2.7 145 pelton-center-way
  san-leandro alameda-county bay-area)
 (3595 house-of-wong chinese 2.0 2050 lewelling-blvd san-leandro
  alameda-county bay-area)
 (3596 jasmine-chinese-food-to chinese 2.3 14393 washington-ave-ste-g
  san-leandro alameda-county bay-area)
 (3597 king-wah-restaurant chinese 2.0 2113 marina-blvd san-leandro
  alameda-county bay-area)
 (3598 lees-garden chinese 2.3 21 thornton-st san-leandro
  alameda-county bay-area)
 (3599 mandarin-garden-restaurant chinese 2.0 14400 washington-ave
  san-leandro alameda-county bay-area)
 (3600 new-mings-restaurant chinese 2.3 16888 e-14th-st-no.-96
  san-leandro alameda-county bay-area)
 (3601 siu-hong-kong-restaurant chinese 2.3 16250 e-14th-st san-leandro
  alameda-county bay-area)
 (3602 szechwan chinese 2.3 14807 e-14th-st san-leandro alameda-county
  bay-area)
 (3603 the-sho-gun chinese 2.3 1042 marina-blvd san-leandro
  alameda-county bay-area)
 (3604 yee-wah-restaurant-mandarin chinese 2.0 13780 doolittle-dr
  san-leandro alameda-county bay-area)
 (3605 china-city chinese 2.3 15950 hesperian-blvd san-lorenzo
  alameda-county bay-area)
 (3606 east-sun-restaurant chinese 2.0 17383 hesperian-blvd san-lorenzo
  alameda-county bay-area)
 (3607 hong-kong-restaurant chinese 2.0 754 bockman-rd san-lorenzo
  alameda-county bay-area)
 (3608 hong-ye-restaurant chinese 2.0 15809 channel-st san-lorenzo
  alameda-county bay-area)
 (3609 lung-sing-restaurant chinese 2.0 1339 bockman-rd san-lorenzo
  alameda-county bay-area)
 (3610 sunn-hunan-restaurant chinese 2.0 203 lewelling-blvd san-lorenzo
  alameda-county bay-area)
 (3611 china-bee chinese 3.0 31 s-b-st san-mateo san-mateo-county
  bay-area)
 (3612 china-house-restaurant chinese 2.3 2507 s-el-camino-real
  san-mateo san-mateo-county bay-area)
 (3613 gia-nan-chinese-restaurant chinese 2.0 514 peninsula-ave
  san-mateo san-mateo-county bay-area)
 (3614 golden-wok-restaurant chinese 2.0 570 s-norfolk-st san-mateo
  san-mateo-county bay-area)
 (3615 hot-wok-cafe chinese 3.0 2960 s-norfolk-st san-mateo
  san-mateo-county bay-area)
 (3616 cloud-garden-chinese-food-restaurant chinese 2.6 17 e-25th-ave
  san-mateo san-mateo-county bay-area)
 (3617 hunan-restaurant chinese 2.0 220 s-b-st san-mateo
  san-mateo-county bay-area)
 (3618 little-hunan-restaurant chinese 2.3 120 crystal-springs-shop-ctr
  san-mateo san-mateo-county bay-area)
 (3619 meis-restaurant chinese 2.8 71 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (3620 szechuan-cuisine chinese 3.3 133 s-b-st san-mateo
  san-mateo-county bay-area)
 (3621 tasty-chinese-cuisine chinese 2.0 2318 s-el-camino-real
  san-mateo san-mateo-county bay-area)
 (3622 toa-yuen-restaurant chinese 2.3 3170 campus-dr san-mateo
  san-mateo-county bay-area)
 (3623 china-express chinese 2.0 1841 x23rd-st san-pablo
  contra-costa-county bay-area)
 (3624 fook-sing chinese 2.0 14465 san-pablo-ave san-pablo
  contra-costa-county bay-area)
 (3625 tongs-chinese-restaurant chinese 2.0 13350 san-pablo-ave
  san-pablo contra-costa-county bay-area)
 (3626 chef-wang chinese 2.0 1080 quartermaster-canyon-rd san-ramon
  contra-costa-county bay-area)
 (3627 china-cafe-restaurant chinese 2.0 12153 alcosta-blvd san-ramon
  contra-costa-county bay-area)
 (3628 china-delight chinese 2.0 2211 san-ramon-valley-blvd-no.-h
  san-ramon contra-costa-county bay-area)
 (3629 china-villa-restaurant chinese 2.0 2550
  san-ramon-valley-blvd-no.-c san-ramon contra-costa-county bay-area)
 (3630 chung-hei-low chinese 2.0 2550 san-ramon-valley-blvd-no.-c
  san-ramon contra-costa-county bay-area)
 (3631 hop-sings-buffet chinese 2.2 3191 crow-canyon-rd-no.-d san-ramon
  contra-costa-county bay-area)
 (3632 peking-tokyo-restaurant-&-bar chinese 2.4 500
  bollinger-canyon-way-no.-a1 san-ramon contra-costa-county bay-area)
 (3633 sun-sun-garden chinese 2.3 21314 san-ramon-valley-blvd-no.-g
  san-ramon contra-costa-county bay-area)
 (3634 uncle-yus-szechuan-san-ramon chinese 2.8 2005
  crow-canyon-pl-no.-160 san-ramon contra-costa-county bay-area)
 (3635 abc-chinese-restaurant chinese 2.0 2214 homestead-rd santa-clara
  santa-clara-county bay-area)
 (3636 china-delight chinese 2.4 2596 homestead-rd santa-clara
  santa-clara-county bay-area)
 (3637 china-stix-restaurant chinese 3.5 2110 el-camino-real
  santa-clara santa-clara-county bay-area)
 (3638 china-way chinese 2.8 3475 el-camino-real santa-clara
  santa-clara-county bay-area)
 (3639 elegant-garden-chinese-rest chinese 2.3 3540 homestead-rd
  santa-clara santa-clara-county bay-area)
 (3640 four-five-six-chinese-restaurant chinese 3.7 2362 pruneridge-ave
  santa-clara santa-clara-county bay-area)
 (3641 mr-chaus-chinese-fast chinese 2.2 2165 el-camino-real
  santa-clara santa-clara-county bay-area)
 (3642 north-china-restaurant chinese 2.5 2830 homestead-rd santa-clara
  santa-clara-county bay-area)
 (3643 peking-restaurant chinese 2.0 2331 el-camino-real santa-clara
  santa-clara-county bay-area)
 (3644 shanghai-cafe chinese 2.0 475 aldo-ave santa-clara
  santa-clara-county bay-area)
 (3645 teriyaki-palace chinese 2.0 2855 stevens-creek-blvd-ste-2193
  santa-clara santa-clara-county bay-area)
 (3646 trans-chinese-vietnms-restaurant-fst chinese 2.0 2595
  the-alameda santa-clara santa-clara-county bay-area)
 (3647 canton-restaurant chinese 2.0 820 x41st-ave santa-cruz
  santa-cruz-county bay-area)
 (3648 china-clipper-cafe chinese 2.0 1003 cedar-st santa-cruz
  santa-cruz-county bay-area)
 (3649 china-station-restaurant chinese 1.7 2301 mission-st santa-cruz
  santa-cruz-county bay-area)
 (3650 china-szechwan-restaurant chinese 4.3 221 cathcart-st santa-cruz
  santa-cruz-county bay-area)
 (3651 chinese-village chinese 2.0 3601 portola-dr santa-cruz
  santa-cruz-county bay-area)
 (3652 little-shanghai-chinese-restaurant chinese 2.5 1010 cedar-st
  santa-cruz santa-cruz-county bay-area)
 (3653 little-shanghai-chinese-restrn chinese 2.0 1547
  pacific-ave-no.-e santa-cruz santa-cruz-county bay-area)
 (3654 little-shanghai-chinese-restrn chinese 2.0 710 cedar-st
  santa-cruz santa-cruz-county bay-area)
 (3655 omei-restaurant chinese 3.0 2316 mission-st santa-cruz
  santa-cruz-county bay-area)
 (3656 little-china chinese 2.0 18782 cox-ave saratoga
  santa-clara-county bay-area)
 (3657 mandarin-chef chinese 3.0 14572 big-basin-way saratoga
  santa-clara-county bay-area)
 (3658 peking-restaurant chinese 2.0 2623 x41st-ave soquel unknown
  bay-area)
 (3659 dynasty-chinese-restaurant chinese 2.0 254 sunset-ave-no.-b
  suisun-city solano-county bay-area)
 (3660 chef-lee-chinese-restaurant chinese 2.0 1115 tasman-dr sunnyvale
  santa-clara-county bay-area)
 (3661 china-delite chinese 2.0 909 w-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (3662 china-eastern-house chinese 2.0 1627 hollenbeck-ave sunnyvale
  santa-clara-county bay-area)
 (3663 grand-palace-chinese-restaurant chinese 1.5 711 town-and-country
  sunnyvale santa-clara-county bay-area)
 (3664 jade-garden-restaurant chinese 1.7 675 s-bernardo-ave sunnyvale
  santa-clara-county bay-area)
 (3665 magic-wok-chinese-food-to-go chinese 2.0 734 s-wolfe-rd
  sunnyvale santa-clara-county bay-area)
 (3666 panda-restaurant chinese 2.0 1185 w-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (3667 pleasant-taste-chinese-restaurant chinese 2.3 670 n-fairoaks-ave
  sunnyvale santa-clara-county bay-area)
 (3668 taipei-food chinese 2.0 747 s-wolfe-rd sunnyvale
  santa-clara-county bay-area)
 (3669 delicious-chinese-restaurant chinese 2.0 34316 alvarado-niles-rd
  union-city alameda-county bay-area)
 (3670 florentinos-fins-asian-cuisine chinese 2.0 31851 alvarado-blvd
  union-city alameda-county bay-area)
 (3671 hong-kong-restaurant chinese 2.7 4100 dyer-st union-city
  alameda-county bay-area)
 (3672 kylin-chinese-food chinese 2.0 31859 alvarado-blvd union-city
  alameda-county bay-area)
 (3673 new-china-kitchen chinese 2.0 32 union-square-blvd-no.-b
  union-city alameda-county bay-area)
 (3674 jangs-garden-restaurant chinese 2.0 134 robles-way vallejo
  solano-county bay-area)
 (3675 jarearn-thait-chinese-cuisine chinese 2.7 907 tennessee-st
  vallejo solano-county bay-area)
 (3676 jaya-chinese-restaurant chinese 2.0 2215 sonoma-blvd vallejo
  solano-county bay-area)
 (3677 ling-nam-noodle-house chinese 2.0 972 admiral-callaghan-ln
  vallejo solano-county bay-area)
 (3678 mandarin-restaurant chinese 2.0 734 lincoln-rd-e vallejo
  solano-county bay-area)
 (3679 rickshaw-restaurant chinese 2.0 4300 sonoma-blvd vallejo
  solano-county bay-area)
 (3680 szechuan-chinese-cuisine chinese 2.0 2079 solano-ave vallejo
  solano-county bay-area)
 (3681 uncle-changs-chinese-food chinese 2.0 145 plaza-dr-ste-201
  vallejo solano-county bay-area)
 (3682 china-restaurant chinese 3.0 2580 n-main-st walnut-creek
  contra-costa-county bay-area)
 (3683 china-village-restaurant chinese 2.8 1841 ygnacio-valley-rd
  walnut-creek contra-costa-county bay-area)
 (3684 chinatown-cafe chinese 2.3 2064 h-treat-blvd. walnut-creek
  contra-costa-county bay-area)
 (3685 chinese-alley chinese 2.0 1441 n-brd walnut-creek
  contra-costa-county bay-area)
 (3686 golden-city-restaurant chinese 3.3 2932 n-main-st walnut-creek
  contra-costa-county bay-area)
 (3687 jade-garden chinese 2.5 2907 ygnacio-valley-rd walnut-creek
  contra-costa-county bay-area)
 (3688 king-tsin-restaurant chinese 2.0 2280 oak-grove-rd walnut-creek
  contra-costa-county bay-area)
 (3689 mr-wong chinese 2.0 2855 mitchell-dr-ste-101 walnut-creek
  contra-costa-county bay-area)
 (3690 szechwan-garden-restaurant chinese 2.5 1651 botelho-dr-no.-120
  walnut-creek contra-costa-county bay-area)
 (3691 tangs-restaurant chinese 2.3 1523 east-st walnut-creek
  contra-costa-county bay-area)
 (3692 wan-fu-restaurant chinese 2.7 1375 n-brd walnut-creek
  contra-costa-county bay-area)
 (3693 chopstick-restaurant chinese 2.0 437 main-st watsonville
  santa-cruz-county bay-area)
 (3694 golden-china-restaurant chinese 2.0 1866 main-st watsonville
  santa-cruz-county bay-area)
 (3695 lucky-mandarin-chinese-restaurant chinese 2.0 1439 freedom-blvd
  watsonville santa-cruz-county bay-area)
 (3696 peking-village chinese 2.5 370 e-lake-ave watsonville
  santa-cruz-county bay-area)
 (3697 shan-shan chinese 2.0 370 east-lake-avenue watsonville
  santa-cruz-county bay-area)
 (3698 garden-court-restaurant chinese 3.0 8141 redwood-blvd. novato
  marin-county bay-area)
 (3699 tsing-tao chinese 3.3 104 san-tomas-aquino-rd. campbell
  santa-clara-county bay-area)
 (3700 fon-yong chinese 3.0 1065 holly-st san-carlos san-mateo-county
  bay-area)
 (3701 willow-tree chinese 2.9 6513 regional-st dublin alameda-county
  bay-area)
 (3702 china-wok chinese 2.7 2633 california mountain-view
  santa-clara-county bay-area)
 (3703 tao-tao-cafe chinese 2.6 175 s.-murphy-ave sunnyvale
  santa-clara-county bay-area)
 (3704 samkee chinese 2.8 1686 s.-wolfe-rd sunnyvale santa-clara-county
  bay-area)
 (3705 bangkok-restaurant chinese 2.0 nil nil pleasant-hill
  contra-costa-county bay-area)
 (3706 berkeley-sun-hong-kong-restaurant chinese 2.1 91 shattuck-square
  berkeley alameda-county bay-area)
 (3707 ho-chow chinese 3.3 47846 warm-springs-bl. fremont
  alameda-county bay-area)
 (3708 trader-vics chinese 2.7 9 anchor-way emeryville alameda-county
  bay-area)
 (3709 choo-chew-stop-restaurant chinese 2.0 167 e-i-st benicia
  solano-county bay-area)
 (3710 szechwan-house chinese 3.0 500 x1st-st benicia solano-county
  bay-area)
 (3711 han-kung-mongolian-barbeque chinese 2.0 739 texas-st fairfield
  solano-county bay-area)
 (3712 tahoe-chinese-restaurant chinese 2.0 6484 mirabel-rd forestville
  sonoma-county bay-area)
 (3713 maylees-chinese-restaurant chinese 2.0 247 shoreline-hwy
  mill-valley marin-county bay-area)
 (3714 asia-buffet chinese 2.0 829 main-st napa napa-county
  napa-valley)
 (3715 moon-yuen-restaurant chinese 2.0 1012 x1st-st napa napa-county
  napa-valley)
 (3716 wah-sing-chinese-restraurant chinese 2.0 1445 w-imola-ave napa
  napa-county napa-valley)
 (3717 wah-sing-mandarin-restaurant chinese 2.0 0 shp-center napa
  napa-county napa-valley)
 (3718 shanghai-garden-restaurant chinese 2.0 471 entrada-dr novato
  marin-county bay-area)
 (3719 china-dragon chinese 2.0 127 n-mcdowell-blvd petaluma
  sonoma-county bay-area)
 (3720 china-palace chinese 2.7 20 e-washington-st petaluma
  sonoma-county bay-area)
 (3721 chinatown-restaurant chinese 2.0 157 kentucky-st petaluma
  sonoma-county bay-area)
 (3722 golden-china chinese 2.0 212 western-ave petaluma sonoma-county
  bay-area)
 (3723 kweibin-chinese-restaurant chinese 2.0 613 e-washington-st
  petaluma sonoma-county bay-area)
 (3724 lakeville-garden-chinese-cuisine chinese 2.0 1410
  s-mcdowell-blvd petaluma sonoma-county bay-area)
 (3725 peking-chinese-restaurant chinese 2.0 205 s-mcdowell-blvd
  petaluma sonoma-county bay-area)
 (3726 china-house chinese 2.0 5979 commerce-blvd rohnert-park
  sonoma-county bay-area)
 (3727 confucius-restaurant chinese 2.0 40 raleys-towne-ctr
  rohnert-park sonoma-county bay-area)
 (3728 dynasty-chinese-restaurant chinese 2.0 6555 hunter-dr
  rohnert-park sonoma-county bay-area)
 (3729 hong-kong-express chinese 2.0 6650 commerce-blvd rohnert-park
  sonoma-county bay-area)
 (3730 new-china-restaurant-rohnert-park chinese 2.0 295 southwest-blvd
  rohnert-park sonoma-county bay-area)
 (3731 new-hunan-village chinese 3.0 295 southwest-blvd rohnert-park
  sonoma-county bay-area)
 (3732 ritas-new-china-restaurant-&-lounge chinese 2.0 295
  southwest-blvd rohnert-park sonoma-county bay-area)
 (3733 tai-yuet-lau-chinese-restaurant chinese 3.3 941 golf-course-dr
  rohnert-park sonoma-county bay-area)
 (3734 chinar-indian-restaurant chinese 2.0 1025 c-st san-rafael
  marin-county bay-area)
 (3735 confucius-restaurant chinese 2.0 0 unknown san-rafael
  marin-county bay-area)
 (3736 hong-kong-seafood-restaurant chinese 2.0 0 unknown san-rafael
  marin-county bay-area)
 (3737 new-peking-low-restaurant chinese 2.0 411 x3rd-st san-rafael
  marin-county bay-area)
 (3738 pings-mandarin-restaurant chinese 3.0 817 w-francisco-bl
  san-rafael marin-county bay-area)
 (3739 sweet-rice-chinese-food-take-out chinese 2.0 601 del-ganado-rd
  san-rafael marin-county bay-area)
 (3740 szechuan-village-restaurant chinese 2.0 720 b-st san-rafael
  marin-county bay-area)
 (3741 tao-yuan-restaurant chinese 2.0 903 lincoln-ave san-rafael
  marin-county bay-area)
 (3742 three-dragons-restaurant chinese 2.0 4166 redwood-hwy san-rafael
  marin-county bay-area)
 (3743 tien-fu-restaurant chinese 2.0 1005 x3rd-st san-rafael
  marin-county bay-area)
 (3744 tsing-tao-mandarin-restaurant chinese 2.7 907 b-st san-rafael
  marin-county bay-area)
 (3745 yu-shang-mandarin-restaurant-&-sushi-bar chinese 1.7 180
  bellam-blvd san-rafael marin-county bay-area)
 (3746 china-chef chinese 2.5 594 larkfield-ctr santa-rosa
  sonoma-county bay-area)
 (3747 china-china-restaurant chinese 2.3 1403 maple-ave santa-rosa
  sonoma-county bay-area)
 (3748 china-court chinese 2.0 490 lewis-rd santa-rosa sonoma-county
  bay-area)
 (3749 china-garden-restaurant chinese 2.0 429 stony-point-rd
  santa-rosa sonoma-county bay-area)
 (3750 china-light-restaurant chinese 2.0 80 college-ave santa-rosa
  sonoma-county bay-area)
 (3751 china-light-restaurant chinese 2.0 80 college-ave santa-rosa
  sonoma-county bay-area)
 (3752 china-room-the chinese 3.0 500 mission-blvd santa-rosa
  sonoma-county bay-area)
 (3753 china-village chinese 2.0 850 farmers-ln santa-rosa
  sonoma-county bay-area)
 (3754 genehis-khan-mongolian-barbeque chinese 2.0 0
  --286-coddingtown-ctr santa-rosa sonoma-county bay-area)
 (3755 great-china-restaurant chinese 2.0 1589 farmers-ln santa-rosa
  sonoma-county bay-area)
 (3756 mandarin-restaurant chinese 2.0 2781 yulupa-ave santa-rosa
  sonoma-county bay-area)
 (3757 new-china-restaurant chinese 2.0 2265 cleveland-ave santa-rosa
  sonoma-county bay-area)
 (3758 new-china-restaurant chinese 2.0 138 calistoga-rd santa-rosa
  sonoma-county bay-area)
 (3759 panda-express chinese 2.0 235 santa-rosa-plz santa-rosa
  sonoma-county bay-area)
 (3760 peking-gardens-restaurant chinese 2.0 2446 patio-ct santa-rosa
  sonoma-county bay-area)
 (3761 ritas-new-china-restaurant-&-lounge chinese 2.0 138 calistoga-rd
  santa-rosa sonoma-county bay-area)
 (3762 ritas-new-china-restaurant-&-lounge chinese 2.0 2265
  cleveland-ave santa-rosa sonoma-county bay-area)
 (3763 royal-china-restaurant chinese 2.0 3080 marlow-rd santa-rosa
  sonoma-county bay-area)
 (3764 silver-moon-chinese-food chinese 2.0 1880 mendocino-ave
  santa-rosa sonoma-county bay-area)
 (3765 tahoe-chinese-restaurant chinese 2.0 975 piner-rd santa-rosa
  sonoma-county bay-area)
 (3766 peking-chef-chinese-restaurant chinese 2.0 7233 healdsburg-ave
  sebastopol sonoma-county bay-area)
 (3767 amys-peking-palace chinese 2.0 18350 sonoma-hwy sonoma
  sonoma-county bay-area)
 (3768 golden-spring-mandarin-cuisine chinese 2.0 18991 sonoma-hwy
  sonoma sonoma-county bay-area)
 (3769 dynasty-restaurant chinese 2.0 1801 tiburon-blvd
  belvedere-tiburon marin-county bay-area)
 (3770 south-china-restaurant chinese 2.0 519 main-st vacaville
  solano-county bay-area)
 (3771 chung-king-restaurant chinese 2.0 3611 sonoma-blvd vallejo
  solano-county bay-area)
 (3772 golden-lion-restaurant chinese 2.0 758 admiral-callaghan-ln
  vallejo solano-county bay-area)
 (3773 hong-kong-restaurant chinese 2.0 3570 sonoma-blvd vallejo
  solano-county bay-area)
 (3774 house-of-chan chinese 2.0 42 springstowne-ctr vallejo
  solano-county bay-area)
 (3775 mandarin-restaurant chinese 2.0 734 lincoln-rd vallejo
  solano-county bay-area)
 (3776 rickshaw-chinese-food chinese 2.0 4300 sonoma-blvd vallejo
  solano-county bay-area)
 (3777 szechuan-chef-chinese-restaurant chinese 2.0 2215 sonoma-blvd
  vallejo solano-county bay-area)
 (3778 szechuan-chinese-restaurant chinese 2.0 1549 severus-dr vallejo
  solano-county bay-area)
 (3779 tiens-grdn-mandarin-cuisine chinese 2.0 3570 sonoma-blvd vallejo
  solano-county bay-area)
 (3780 alices-chinese-restaurant chinese 2.0 420 judah-st san-francisco
  san-francisco-county bay-area)
 (3781 asia-chinese-food chinese 2.0 24 ellis-st san-francisco
  san-francisco-county bay-area)
 (3782 asia-chinese-food chinese 2.0 350 bay-st san-francisco
  san-francisco-county bay-area)
 (3783 beijing-on-irving-restaurant chinese 2.0 1030 irving-st
  san-francisco san-francisco-county bay-area)
 (3784 cam-hung-chinese-restaurant chinese 2.0 294 turk-st
  san-francisco san-francisco-county bay-area)
 (3785 canton-restaurant chinese 2.0 1400 leavenworth-st san-francisco
  san-francisco-county bay-area)
 (3786 canton-restaurant chinese 1.7 524 castro-st san-francisco
  san-francisco-county bay-area)
 (3787 canton-restaurant chinese 2.0 655 folsom-st san-francisco
  san-francisco-county bay-area)
 (3788 canton-restaurant-two chinese 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (3789 chef-jias-restaurant chinese 3.0 925 kearny-st san-francisco
  san-francisco-county bay-area)
 (3790 cheung-hing-chinese-restaurant chinese 2.7 2339 norlega
  san-francisco san-francisco-county bay-area)
 (3791 china-city-restaurant chinese 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (3792 china-pepper-restaurant chinese 2.0 1689 church-st san-francisco
  san-francisco-county bay-area)
 (3793 china-pepper-restaurant chinese 2.0 835 hyde-st san-francisco
  san-francisco-county bay-area)
 (3794 china-sea-restaurant chinese 2.0 1441 polk-st san-francisco
  san-francisco-county bay-area)
 (3795 china-station-restaurant chinese 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (3796 china-village-seafood-&-vegeta chinese 2.3 2263 chestnut-st
  san-francisco san-francisco-county bay-area)
 (3797 china-wok-restaurant chinese 2.0 667 monterey-blvd san-francisco
  san-francisco-county bay-area)
 (3798 chinese-fast-food chinese 2.0 3771 mission-st san-francisco
  san-francisco-county bay-area)
 (3799 delicious-chinese-food chinese 2.0 2729 mission-st san-francisco
  san-francisco-county bay-area)
 (3800 doragon-chinese-restaurant-the chinese 2.0 928 geary-st
  san-francisco san-francisco-county bay-area)
 (3801 dragon-city-restaurant chinese 2.0 1033 taraval-st san-francisco
  san-francisco-county bay-area)
 (3802 dragon-house-restaurant chinese 2.8 5344 geary-blvd
  san-francisco san-francisco-county bay-area)
 (3803 dragon-river-restaurant chinese 3.0 5045 geary-blvd
  san-francisco san-francisco-county bay-area)
 (3804 dynasty-restaurants chinese 2.0 101 oak-st san-francisco
  san-francisco-county bay-area)
 (3805 excelsior-chinese-food chinese 2.0 4845 mission-st san-francisco
  san-francisco-county bay-area)
 (3806 fung-yee-chinese-restaurant chinese 2.0 2257 mason-st
  san-francisco san-francisco-county bay-area)
 (3807 gold-mountain-restaurant chinese 2.5 644 broadway san-francisco
  san-francisco-county bay-area)
 (3808 golden-china-restaurant chinese 2.0 1612 ocean-ave san-francisco
  san-francisco-county bay-area)
 (3809 heung-heung-restaurant chinese 2.3 3608 balboa-st san-francisco
  san-francisco-county bay-area)
 (3810 heung-yuen-restaurant chinese 2.0 3279 st san-francisco
  san-francisco-county bay-area)
 (3811 hsun-kuang-restaurant chinese 2.0 30 leland-ave san-francisco
  san-francisco-county bay-area)
 (3812 hua-hua-restaurant chinese 2.0 1380 ave san-francisco
  san-francisco-county bay-area)
 (3813 hun-hing-restaurant chinese 2.0 1315 powell-st san-francisco
  san-francisco-county bay-area)
 (3814 hunan-city-restaurant chinese 2.0 1790 haight-st san-francisco
  san-francisco-county bay-area)
 (3815 hunan-court-restaurant chinese 2.0 2227 polk-st san-francisco
  san-francisco-county bay-area)
 (3816 hunan-express-restaurant chinese 2.0 680 clay-st san-francisco
  san-francisco-county bay-area)
 (3817 hunan-homes-restaurant chinese 2.6 622 jackson-st san-francisco
  san-francisco-county bay-area)
 (3818 hunan-village-restaurant chinese 2.0 839 kearny-st san-francisco
  san-francisco-county bay-area)
 (3819 imperial-china-restaurant chinese 2.0 2401 polk-st san-francisco
  san-francisco-county bay-area)
 (3820 jeong-hyun-restaurant chinese 2.0 2123 irving-st san-francisco
  san-francisco-county bay-area)
 (3821 new-kans-chinese-restaurant chinese 2.7 708 grant-ave
  san-francisco san-francisco-county bay-area)
 (3822 king-chow-chinese-restaurant chinese 2.0 501 clement-st
  san-francisco san-francisco-county bay-area)
 (3823 king-of-china-restaurant chinese 2.0 939 clement-st
  san-francisco san-francisco-county bay-area)
 (3824 kirin-chinese-restaurant chinese 3.7 6135 geary-blvd
  san-francisco san-francisco-county bay-area)
 (3825 little-beijing-restaurant chinese 2.0 1316 noriega-st
  san-francisco san-francisco-county bay-area)
 (3826 mission-hunan-restaurant chinese 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (3827 new-canton-restaurant chinese 2.0 2048 mission-st san-francisco
  san-francisco-county bay-area)
 (3828 new-china-foods chinese 2.0 575 natoma-st san-francisco
  san-francisco-county bay-area)
 (3829 new-china-restaurant chinese 2.0 272 mcallister-st san-francisco
  san-francisco-county bay-area)
 (3830 new-great-wall-restaurant chinese 2.0 823 clay-st san-francisco
  san-francisco-county bay-area)
 (3831 new-ocean-seafood-chinese-restaurant chinese 3.8 3727 geary-blvd
  san-francisco san-francisco-county bay-area)
 (3832 north-china-restaurant chinese 3.3 2315 van-ness-ave
  san-francisco san-francisco-county bay-area)
 (3833 chinese-harvest-restaurant chinese 2.0 1829 clement-st
  san-francisco san-francisco-county bay-area)
 (3834 panda-restaurant chinese 2.0 655 ellis-st san-francisco
  san-francisco-county bay-area)
 (3835 panda-restaurant chinese 2.0 73 leland-ave san-francisco
  san-francisco-county bay-area)
 (3836 paradise-chinese-restaurant chinese 2.0 2284 westborough-blvd
  south-san-francisco san-mateo-county bay-area)
 (3837 peacock-chinese-restaurant chinese 2.0 2646 san-bruno-ave
  san-francisco san-francisco-county bay-area)
 (3838 peking-restaurant chinese 2.0 1375 noriega-st san-francisco
  san-francisco-county bay-area)
 (3839 peking-restaurant chinese 2.0 943 cole-st san-francisco
  san-francisco-county bay-area)
 (3840 sams-chinese-restaurant chinese 3.0 1718 polk-st san-francisco
  san-francisco-county bay-area)
 (3841 san-tunjhg-chinese-restaurant chinese 2.0 2240 irving-st
  san-francisco san-francisco-county bay-area)
 (3842 shandy-chinese-fast-food chinese 3.0 211 kearny-st san-francisco
  san-francisco-county bay-area)
 (3843 szechuan-taste-restaurant chinese 2.7 917 taraval-st
  san-francisco san-francisco-county bay-area)
 (3844 szechuan-village-restaurant chinese 2.0 3317 steiner-st
  san-francisco san-francisco-county bay-area)
 (3845 taw-wah-chinese-food chinese 2.0 4508 x3rd-st san-francisco
  san-francisco-county bay-area)
 (3846 yan-yan-restaurant chinese 2.7 2241 judah-st san-francisco
  san-francisco-county bay-area)
 (3847 coriya chinese 1.8 852 clement-st san-francisco
  san-francisco-county bay-area)
 (3848 oriental-buffet chinese 2.0 961 bluebell-drive livermore
  alameda-county bay-area)
 (3849 tong-kee-noodles chinese 2.5 0 st mountain-view
  santa-clara-county bay-area)
 (3850 hong-kong-bakery chinese 2.0 210 castro-st mountain-view
  santa-clara-county bay-area)
 (3851 mandarin-gourmet chinese 3.3 0 ave-and-blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (3852 ten-fu chinese 2.3 1352 el-camino menlo-park san-mateo-county
  bay-area)
 (3853 delicious-dim-sum chinese 2.0 752 jackson san-francisco
  san-francisco-county bay-area)
 (3854 j-&-j-restaurant chinese 2.0 615 jackson san-francisco
  san-francisco-county bay-area)
 (3855 meriwa chinese 2.3 728 pacific san-francisco
  san-francisco-county bay-area)
 (3856 new-lum-ting chinese 2.0 670 jackson san-francisco
  san-francisco-county bay-area)
 (3857 karlina-cafe chinese 2.0 654 jackson san-francisco
  san-francisco-county bay-area)
 (3858 noodle-express chinese 2.3 301 g-st davis yolo-county
  sacramento-area)
 (3859 golden-palace chinese 2.3 223 f-st davis yolo-county
  sacramento-area)
 (3860 sweet-fragrance chinese 2.0 631 broadway san-francisco
  san-francisco-county bay-area)
 (3861 broadway-dim-sum chinese 2.0 686 broadway san-francisco
  san-francisco-county bay-area)
 (3862 dol-ho chinese 2.0 808 pacific san-francisco
  san-francisco-county bay-area)
 (3863 golden-garden chinese 2.0 835 pacific san-francisco
  san-francisco-county bay-area)
 (3864 yous-dim-sum chinese 2.0 937 stockton san-francisco
  san-francisco-county bay-area)
 (3865 new-fortune chinese 2.0 811 stockton san-francisco
  san-francisco-county bay-area)
 (3866 far-east-restaurant chinese 2.0 631 grant san-francisco
  san-francisco-county bay-area)
 (3867 cathay-house chinese 1.7 601 grant san-francisco
  san-francisco-county bay-area)
 (3868 kans-chinese-restaurant chinese 2.0 710 grant san-francisco
  san-francisco-county bay-area)
 (3869 snow-garden chinese 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (3870 r-&-g-lounge-&-restaurant chinese 3.3 631 kearney san-francisco
  san-francisco-county bay-area)
 (3871 hons-wun-tun-house chinese 2.0 640 kearney san-francisco
  san-francisco-county bay-area)
 (3872 mrs.-fongs-garden-restaurant chinese 2.0 714 kearney
  san-francisco san-francisco-county bay-area)
 (3873 sun-wah-kue chinese 2.0 848 washington san-francisco
  san-francisco-county bay-area)
 (3874 lucky-creation chinese 2.0 854 washington san-francisco
  san-francisco-county bay-area)
 (3875 all-seasons chinese 2.0 423 university-ave palo-alto
  santa-clara-county bay-area)
 (3876 mongolian-b.b.q. chinese 3.1 3380 el-camino-real santa-clara
  santa-clara-county bay-area)
 (3877 china-gourmet-restaurant chinese 2.8 2210 h-south-shore-center
  alameda alameda-county bay-area)
 (3878 yuen-yung chinese 2.7 639 santa-cruz-ave menlo-park
  san-mateo-county bay-area)
 (3879 mabels-lantern-house chinese 2.0 39 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (3880 wings-chinese-restaurant chinese 2.0 131 e-jackson san-jose
  santa-clara-county bay-area)
 (3881 youngs-sun-yuan chinese 2.0 183 park-ave san-jose
  santa-clara-county bay-area)
 (3882 flying-dragon chinese 2.0 1663 lundy-ave-no.-m san-jose
  santa-clara-county bay-area)
 (3883 shabu-shabu chinese 2.0 1663 lundy-ave-no.-f san-jose
  santa-clara-county bay-area)
 (3884 yung-kee-bbq chinese 2.3 1663 lundy-ave-no.-a san-jose
  santa-clara-county bay-area)
 (3885 new-fung-sing chinese 2.3 0 &-alma mountain-view
  santa-clara-county bay-area)
 (3886 quang-da-restaurant chinese 2.0 820 franklin oakland
  alameda-county bay-area)
 (3887 cam-huong-express chinese 2.0 818 franklin oakland
  alameda-county bay-area)
 (3888 tins-teahouse-restaurant chinese 1.8 701 webster oakland
  alameda-county bay-area)
 (3889 chinese-food-to-go chinese 2.0 1261 university berkeley
  alameda-county bay-area)
 (3890 sun-hong-kong-restaurant chinese 1.8 0 unknown berkeley
  alameda-county bay-area)
 (3891 new-chinese-express chinese 2.7 2024 shattuck berkeley
  alameda-county bay-area)
 (3892 king-wah-chinese-restaurant chinese 2.7 219 e.-washington-avenue
  sunnyvale santa-clara-county bay-area)
 (3893 pleasant-taste-chinese-restaurant chinese 2.4 670 n.-fair-oaks
  sunnyvale santa-clara-county bay-area)
 (3894 fortune-star chinese 2.3 173 w.-25th-avenue san-mateo
  san-mateo-county bay-area)
 (3895 abc-seafood-restaurant chinese 2.7 973 e.hillsdale-blvd.-b-5
  foster-city san-mateo-county bay-area)
 (3896 little-sichuan chinese 3.0 2121 south-el-camino san-mateo
  san-mateo-county bay-area)
 (3897 happy-valley chinese 2.8 11 st-next-to-hallmark-&-payless tracy
  san-joaquin-county unknown)
 (3898 gary-chus-gourmet-chinese-cuisine chinese 2.7 611 x5th-st
  santa-rosa sonoma-county bay-area)
 (3899 fish-palace chinese 3.0 1651 w.-campbell-ave campbell
  santa-clara-county bay-area)
 (3900 eos-restaurant/wine-bar chinese 3.3 901 cole-st san-francisco
  san-francisco-county bay-area)
 (3901 great-wall-imperial chinese 2.7 16135 monterey-rd morgan-hill
  santa-clara-county bay-area)
 (3902 peking-eastern-house chinese 2.0 269 west-calavaras-blvd
  milpitas santa-clara-county bay-area)
 (3903 new-hunan-restaurant chinese 3.0 2302 buchanan-rd antioch
  contra-costa-county bay-area)
 (3904 hong-kong-flower-lounge chinese 3.4 5322 geary-st san-francisco
  san-francisco-county bay-area)
 (3905 szechuan-flower-restaurant chinese 1.7 180 east-fourth-ave
  san-mateo san-mateo-county bay-area)
 (3906 gourmet-carousel chinese 2.0 2595 california-st. mountain-view
  santa-clara-county bay-area)
 (3907 vegetarian-house chinese 2.0 570 e-santa-clara san-jose
  santa-clara-county bay-area)
 (3908 mamon-luk chinese 2.0 0 unknown daly-city san-mateo-county
  bay-area)
 (3909 ku-&-family chinese 2.5 100 marketplace san-ramon
  contra-costa-county bay-area)
 (3910 china-house chinese 3.0 1163 s.-sunnyvale-saratoga-rd. san-jose
  santa-clara-county bay-area)
 (3911 redwood-city-buffet chinese 2.0 830 middlefield-rd redwood-city
  san-mateo-county bay-area)
 (3912 little-tai-pei-restaurant chinese 2.7 2715 contra-loma-blvd
  antioch contra-costa-county bay-area)
 (3913 fortune-cookie chinese 2.7 0 camino-&-flora-vista-near-shilpa
  santa-clara santa-clara-county bay-area)
 (3914 golden-pot-restaurant chinese 3.0 1888 clement san-francisco
  san-francisco-county bay-area)
 (3915 tong-palace chinese 2.0 933 clement san-francisco
  san-francisco-county bay-area)
 (3916 dumpling-house chinese 2.0 832 clement san-francisco
  san-francisco-county bay-area)
 (3917 happy-gardent-restaurant chinese 2.0 815 clement san-francisco
  san-francisco-county bay-area)
 (3918 five-happiness-restaurant chinese 2.0 4142 geary san-francisco
  san-francisco-county bay-area)
 (3919 green-garden chinese 3.2 0 ygnacio-valley-and-civic-dr.
  walnut-creek contra-costa-county bay-area)
 (3920 chef-chan chinese 2.8 1676 north-milpitas-blvd milpitas
  santa-clara-county bay-area)
 (3921 pacifics chinese 2.3 1045 terra-nova-blvd pacifica
  san-mateo-county bay-area)
 (3922 peach-garden chinese 2.0 nil nil newark alameda-county bay-area)
 (3923 lai-lai-restaurant chinese 2.8 5588 springdale-avenue pleasanton
  alameda-county bay-area)
 (3924 silver-restaurant chinese 2.3 737 washington-st san-francisco
  san-francisco-county bay-area)
 (3925 sinfuki chinese 2.7 832 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (3926 niwa-restaurant chinese 3.0 1 camino-sobrante orinda
  contra-costa-county bay-area)
 (3927 eves-hunan chinese 3.3 5620 college-avenue oakland
  alameda-county bay-area)
 (3928 genghis-khan-kitehen chinese 2.3 0 unknown alameda
  alameda-county bay-area)
 (3929 central-china-restaurant chinese 1.7 1362 winchester-blvd
  san-jose santa-clara-county bay-area)
 (3930 peony-restaurant chinese 3.5 388 st. oakland alameda-county
  bay-area)
 (3931 silver-house chinese 2.5 2224 s-el-camino-real san-mateo
  san-mateo-county bay-area)
 (3932 great-ocean-chinese-buffet chinese 2.0 1319 park-st alameda
  alameda-county bay-area)
 (3933 winton-seafood chinese 2.3 1540 ocean-avenue san-francisco
  san-francisco-county bay-area)
 (3934 canton-express-restaurant chinese 2.0 14799 washington-ave
  san-leandro alameda-county bay-area)
 (3935 kings-cafe chinese 2.0 4228 foothill-blvd. oakland
  alameda-county bay-area)
 (3936 gou-bu-lee-restaurant chinese 2.7 10684 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (3937 p-&-p-hunan chinese 3.4 1109 laurel-st san-carlos
  san-mateo-county bay-area)
 (3938 mr-chaus chinese 2.0 1072 s.-saratoga/sunnyvale cupertino
  santa-clara-county bay-area)
 (3939 mr-chaus chinese 2.0 1384 lincoln-ave san-jose
  santa-clara-county bay-area)
 (3940 full-moon-seafood-house chinese 2.0 228 broadway oakland
  alameda-county bay-area)
 (3941 ongpin-noodle-house-and-restaurant chinese 3.0 73 camaritas-ave
  south-san-francisco san-mateo-county bay-area)
 (3942 happy-palace chinese 2.7 696 monterey-blvd san-francisco
  san-francisco-county bay-area)
 (3943 bamboo-pavillion chinese 2.7 265 reservation-rd marina
  monterey-county monterey)
 (3944 china-palace chinese 2.8 353 e-10th-st. gilroy
  santa-clara-county bay-area)
 (3945 china-house-restaurant chinese 2.7 513 main-st vacaville
  solano-county bay-area)
 (3946 yin-yin-restaurant chinese 2.0 2083 x1st-st livermore
  alameda-county bay-area)
 (3947 hong-kong-express chinese 2.3 4555 hopyard-rd.-no.5 pleasanton
  alameda-county bay-area)
 (3948 new-mandarin-garden chinese 2.7 744 el-camino-real
  south-san-francisco san-mateo-county bay-area)
 (3949 happi-house chinese 2.0 4363 first-st livermore alameda-county
  bay-area)
 (3950 paradise-vegetarian-restaurant chinese 2.3 1444 x4th-st
  san-rafael marin-county bay-area)
 (3951 season-buffet chinese 2.2 0 unknown fremont alameda-county
  bay-area)
 (3952 red-crane chinese 2.7 1115 clement san-francisco
  san-francisco-county bay-area)
 (3953 gourmet-carousel chinese 2.3 1559 franklin-st san-francisco
  san-francisco-county bay-area)
 (3954 cuisineer-six chinese 2.3 20007 stevens-creek-blvd. cupertino
  santa-clara-county bay-area)
 (3955 crustaceans chinese 3.0 nil nil san-francisco
  san-francisco-county bay-area)
 (3956 chongs-beijing-restaurant chinese 3.0 39206 fremont-blvd fremont
  alameda-county bay-area)
 (3957 chrysanthemum chinese 2.7 2214 x4th-st san-rafael marin-county
  bay-area)
 (3958 jade-cafe-no.-3 chinese 2.0 2401 polk-st san-francisco
  san-francisco-county bay-area)
 (3959 kirin chinese 2.7 1767 solano-avenue berkeley alameda-county
  bay-area)
 (3960 pacific-restaurant chinese 2.7 250 --90th-st daly-city
  san-mateo-county bay-area)
 (3961 lu-lai-garden chinese 2.2 210 barber-court milpitas
  santa-clara-county bay-area)
 (3962 jumbo-seafood-restaurant chinese 2.7 0 unknown san-francisco
  san-francisco-county bay-area)
 (3963 x96-mandarin-house chinese 2.3 0 unknown burlingame
  san-mateo-county bay-area)
 (3964 oriental-tea-house chinese 2.3 604 macarthur-blvd. san-leandro
  alameda-county bay-area)
 (3965 golden-lake chinese 3.0 1749 decoto-rd union-city alameda-county
  bay-area)
 (3966 yet-wah chinese 1.7 5238 diamond-heights-blvd san-francisco
  san-francisco-county bay-area)
 (3967 kennys-cafe chinese 2.0 640 crespi-drive pacifica
  san-mateo-county bay-area)
 (3968 west-lake-restaurant chinese 2.7 320 jackson-st hayward
  alameda-county bay-area)
 (3969 mings-diner chinese 2.7 2129 taraval-st. san-francisco
  san-francisco-county bay-area)
 (3970 chef-lees-mandarin-house chinese 2.3 2031 north-fremont monterey
  monterey-county monterey)
 (3971 shan-shui-chinese-restaurant chinese 3.2 210 hope-st
  mountain-view santa-clara-county bay-area)
 (3972 cafe-won-kee chinese 2.3 206 barber-ct. milpitas
  santa-clara-county bay-area)
 (3973 sankee chinese 2.7 1686 s-wolfe-rd sunnyvale santa-clara-county
  bay-area)
 (3974 mayflower chinese 3.4 428 barber-lane milpitas
  santa-clara-county bay-area)
 (3975 kwang-tung chinese 2.3 12056 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (3976 man-bo-duck chinese 2.3 360 castro-st. mountain-view
  santa-clara-county bay-area)
 (3977 universal-cafe chinese 2.3 416 barber-lane milpitas
  santa-clara-county bay-area)
 (3978 pacific-regent chinese 2.7 835 pacific-avenue san-francisco
  san-francisco-county bay-area)
 (3979 happy-valley chinese 2.3 1594 meridian-ave san-jose
  santa-clara-county bay-area)
 (3980 golden-wok chinese 2.3 1677 hollenbeck-rd. sunnyvale
  santa-clara-county bay-area)
 (3981 grandview-restaurant chinese 3.0 1106 howard-avenue burlingame
  san-mateo-county bay-area)
 (3982 hunan-restaurant chinese 2.0 nil nil oakland alameda-county
  bay-area)
 (3983 hong-kong-flower-lounge-restaurant chinese 2.7 1671
  el-camino-real millbrae san-mateo-county bay-area)
 (3984 lido-garden chinese 2.7 35201 newark-blvd. newark alameda-county
  bay-area)
 (3985 the-rose-garden-restaurant chinese 3.7 0 unknown union-city
  alameda-county bay-area)
 (3986 moon-bay chinese 2.5 10151 n.-cabrillo-highway el-granada
  san-mateo-county bay-area)
 (3987 hot-pot-city chinese 2.7 500 barber-lane milpitas
  santa-clara-county bay-area)
 (3988 just-wonton chinese 2.7 1241 vicente-st san-francisco
  san-francisco-county bay-area)
 (3989 mei-long chinese 3.5 867 e.-el-camino mountain-view
  santa-clara-county bay-area)
 (3990 king-chwan chinese 2.3 415 ocean santa-cruz santa-cruz-county
  bay-area)
 (3991 wanhon-lo chinese 3.6 269 wykoff vacaville solano-county
  bay-area)
 (3992 hings-restaurant chinese 3.6 2 st davis yolo-county
  sacramento-area)
 (3993 fatima chinese-muslim 3.6 0 sunnyvale cupertino
  santa-clara-county bay-area)
 (3994 villa-coffee-shop coffee 2.7 4000 s.-el-camino-real san-mateo
  san-mateo-county bay-area)
 (3995 orchard-valley-coffee-shop coffee 2.0 349 e.-campbell-avenue
  campbell santa-clara-county bay-area)
 (3996 orchard-valley-coffee-shop coffee 2.7 nil nil campbell
  santa-clara-county bay-area)
 (3997 gildas coffee 2.8 37 municipal-wharf santa-cruz
  santa-cruz-county bay-area)
 (3998 javabobs coffee 2.7 20991 redwood-rd castro-valley
  alameda-county bay-area)
 (3999 the-coffee-critic coffee 2.7 0 ave burlingame san-mateo-county
  bay-area)
 (4000 the-coffee-critic coffee 2.7 0 camino-real san-mateo
  san-mateo-county bay-area)
 (4001 deans-beans coffee 2.7 645 bancroft-ave san-leandro
  alameda-county bay-area)
 (4002 georges-coffee-shop coffee 2.0 3712 railroad pittsburg
  contra-costa-county bay-area)
 (4003 latte-da-coffeehouse coffee 2.7 1501 ave san-leandro
  alameda-county bay-area)
 (4004 san-marco-espresso-co. coffee 2.0 1336 lincoln-ave calistoga
  napa-county napa-valley)
 (4005 cafe-meyers continental 2.8 3468 camino-tassajara danville
  contra-costa-county bay-area)
 (4006 connies-continental-calif-cui continental 2.5 1333 pine-st-no.-b
  martinez contra-costa-county bay-area)
 (4007 azur-restaurant continental 2.0 1375 santa-cruz-ave menlo-park
  san-mateo-county bay-area)
 (4008 village-inn-cafe continental 2.0 290 village-sq orinda
  contra-costa-county bay-area)
 (4009 maddalenas continental 3.6 544 emerson-st palo-alto
  santa-clara-county bay-area)
 (4010 magoos-grill-&-bar continental 2.0 1250 contra-costa-blvd
  pleasant-hill contra-costa-county bay-area)
 (4011 california-cafe continental 2.0 39 california-ave-ste-103
  pleasanton alameda-county bay-area)
 (4012 salvatores continental 3.0 1000 el-camino-real san-carlos
  san-mateo-county bay-area)
 (4013 adriatic-continental-and-seafood-cuisine continental 2.0 0
  of-polk/washington san-francisco san-francisco-county bay-area)
 (4014 mamas-of-san-francisco continental 2.8 398 geary-st.
  san-francisco san-francisco-county bay-area)
 (4015 the-squire continental 2.0 0 the-fairmont san-francisco
  san-francisco-county bay-area)
 (4016 washington-square-bar-and-grill continental 3.1 1707 powell
  san-francisco san-francisco-county bay-area)
 (4017 la-foret continental 4.5 21747 bertram-rd san-jose
  santa-clara-county bay-area)
 (4018 arthurs-restaurant continental 1.4 2875 lakeside-dr santa-clara
  santa-clara-county bay-area)
 (4019 central-station continental 2.2 0 unknown tracy
  san-joaquin-county unknown)
 (4020 x231-ellsworth continental 3.9 231 ellsworth-ave san-mateo
  san-mateo-county bay-area)
 (4021 bella-vista continental 4.4 13451 skyline-blvd woodside
  san-mateo-county bay-area)
 (4022 brazen-head continental 4.0 3166 buchanan san-francisco
  san-francisco-county bay-area)
 (4023 gourmet-corner continental 2.7 0 way benicia solano-county
  bay-area)
 (4024 the-garden-city continental 3.9 360 south-saratoga-ave san-jose
  santa-clara-county bay-area)
 (4025 les-saisons-at-the-fairmont continental 3.0 170 south-market-st
  san-jose santa-clara-county bay-area)
 (4026 bay-city-bar-&-grill continental 3.0 747 third-st san-francisco
  san-francisco-county bay-area)
 (4027 arthurs-restaurant continental 2.0 2875 lakeside-drive
  santa-clara santa-clara-county bay-area)
 (4028 napa-valley-grille continental 3.6 0 x29-at-madison yountville
  napa-county napa-valley)
 (4029 enzos continental 3.0 5891 broadway oakland alameda-county
  bay-area)
 (4030 rivoli continental 2.7 1539 solano albany alameda-county
  bay-area)
 (4031 charles-nob-hill continental 3.8 1250 jones-st san-francisco
  san-francisco-county bay-area)
 (4032 the-bayview-room continental 2.0 0 at-the-tides bodega-bay
  sonoma-county bay-area)
 (4033 greystone-restaurant continental 2.0 0 unknown bodega-bay
  sonoma-county bay-area)
 (4034 skylight-cafe continental 3.4 2320 central-avenue alameda
  alameda-county bay-area)
 (4035 kenwood-restaurant-&-bar continental 3.0 9900 sonoma-hwy.
  kenwood sonoma-county bay-area)
 (4036 john-bentleys continental 3.0 2991 woodside-rd woodside
  san-mateo-county bay-area)
 (4037 massimo-ristorante continental 3.2 1604 locust-st walnut-creek
  contra-costa-county bay-area)
 (4038 eight-fourty-north-first continental 3.3 840 north-first-st
  san-jose santa-clara-county bay-area)
 (4039 camelot-restaurant continental 2.4 275 e.-dunne-ave morgan-hill
  santa-clara-county bay-area)
 (4040 cafe-53 continental 3.0 50 third-st san-francisco
  san-francisco-county bay-area)
 (4041 white-dove continental 3.2 1151 lincoln san-jose
  santa-clara-county bay-area)
 (4042 patio-cafe continental 3.0 531 castro san-francisco
  san-francisco-county bay-area)
 (4043 california-cafe continental 3.0 1540 n.-california-st.
  walnut-creek contra-costa-county bay-area)
 (4044 julius-castle continental 2.7 0 st san-francisco
  san-francisco-county bay-area)
 (4045 spin-a-yarn continental 3.0 45915 warm-springs-blvd fremont
  alameda-county bay-area)
 (4046 a-street-cafe continental 3.0 1213 a-st hayward alameda-county
  bay-area)
 (4047 nathans-on-the-avenue continental 3.0 1310 burlingame-ave
  burlingame san-mateo-county bay-area)
 (4048 gibson continental 2.6 nil nil san-mateo san-mateo-county
  bay-area)
 (4049 gingerbread-house creole 3.3 nil nil oakland alameda-county
  bay-area)
 (4050 cafe-de-orleans creole 2.3 1029 el-camino-real menlo-park
  san-mateo-county bay-area)
 (4051 nola creole 3.5 535 ramona-st palo-alto santa-clara-county
  bay-area)
 (4052 creo-la. creole 3.9 344 el-camino-real san-carlos
  san-mateo-county bay-area)
 (4053 cha-cha-cha cuban 3.9 1805 haight-st. san-francisco
  san-francisco-county bay-area)
 (4054 el-nuevo-frutilandia cuban 2.8 3077 x24th san-francisco
  san-francisco-county bay-area)
 (4055 cuban-international-restaurant cuban 2.5 625 n-6th-st san-jose
  santa-clara-county bay-area)
 (4056 cuba-restaurant cuban 2.6 0 unknown san-francisco
  san-francisco-county bay-area)
 (4057 babaloo cuban 3.2 2030 lombard-st san-francisco
  san-francisco-county bay-area)
 (4058 habana-cuba-restaurant cuban 3.3 238 race-st san-jose
  santa-clara-county bay-area)
 (4059 city-delicatessen-&-catering deli 2.0 1337 park-st alameda
  alameda-county bay-area)
 (4060 digiulios-italian-delicatessen deli 2.0 3215 encinal-ave alameda
  alameda-county bay-area)
 (4061 dominicos-italian-deli deli 2.3 1407 webster-st alameda
  alameda-county bay-area)
 (4062 good-&-plenty-cafe-deli deli 2.5 1132 ballena-blvd alameda
  alameda-county bay-area)
 (4063 grace-street-catering-inc deli 2.3 1419 broadway alameda
  alameda-county bay-area)
 (4064 p-&-g-italian-deli deli 2.0 1514 park-st alameda alameda-county
  bay-area)
 (4065 the-waterfront-deli deli 2.3 1070 marina-village-pky-no.-105
  alameda alameda-county bay-area)
 (4066 rolls-deli-cafe deli 2.0 331 livorna-heights-rd alamo
  contra-costa-county bay-area)
 (4067 gold-country-donut-deli deli 2.0 3130 ponderosa-way antioch
  contra-costa-county bay-area)
 (4068 old-tyme-deli-&-cafe deli 2.0 1635 a-st antioch
  contra-costa-county bay-area)
 (4069 ducky-deli deli 2.0 0 unknown aromas unknown unknown)
 (4070 cazadores-deli-&-mexican-food deli 3.3 nil nil belmont
  san-mateo-county bay-area)
 (4071 old-county-deli deli 2.0 1334 old-county-rd belmont
  san-mateo-county bay-area)
 (4072 the-deli deli 2.0 1525 winding-way belmont san-mateo-county
  bay-area)
 (4073 pot-belly-deli deli 2.0 6000 egrett-ct-ste-1 benicia
  solano-county bay-area)
 (4074 washington-house-deli-cafe deli 2.7 333 x1st-st-ste-a benicia
  solano-county bay-area)
 (4075 b-&-l-deli deli 2.0 2439 martin-luther-king-jr-way berkeley
  alameda-county bay-area)
 (4076 evergreen-deli-&-juice-bar deli 2.0 1951 shattuck-ave berkeley
  alameda-county bay-area)
 (4077 intl-deli deli 2.0 2350 shattuck-ave berkeley alameda-county
  bay-area)
 (4078 new-burry-deli-&-cafe deli 2.0 2929 shattuck-ave berkeley
  alameda-county bay-area)
 (4079 roxie-foods deli 2.0 2999 shattuck berkeley alameda-county
  bay-area)
 (4080 broadway-deli deli 2.0 1431 broadway burlingame san-mateo-county
  bay-area)
 (4081 brothers-deli deli 2.7 1351 howard-ave burlingame
  san-mateo-county bay-area)
 (4082 francescos-deli-&-cafe deli 2.0 840 stanton-rd burlingame
  san-mateo-county bay-area)
 (4083 park-ave-cafe-deli deli 2.0 240 park-rd burlingame
  san-mateo-county bay-area)
 (4084 s-&-j-deli deli 2.0 980 david-rd burlingame san-mateo-county
  bay-area)
 (4085 the-deli-inn deli 2.0 1555 riverlake-rd-no.-e byron unknown
  bay-area)
 (4086 fellions-deli deli 2.0 1359 lincoln-ave calistoga napa-county
  napa-valley)
 (4087 continental-deli deli 2.0 1712 winchester-blvd campbell
  santa-clara-county bay-area)
 (4088 roses-deli deli 2.0 2087 winchester-blvd campbell
  santa-clara-county bay-area)
 (4089 schlotzskys-deli deli 2.7 1822 s-bascom-ave campbell
  santa-clara-county bay-area)
 (4090 togos deli 2.0 1550 s-bascom-ave-ste-250 campbell
  santa-clara-county bay-area)
 (4091 togos deli 2.0 900 e-campbell-ave campbell santa-clara-county
  bay-area)
 (4092 zellmans-kosher-style-deli deli 2.0 0 unknown campbell
  santa-clara-county bay-area)
 (4093 luccas-italian-delicatessen deli 3.3 3121 castro-valley-blvd
  castro-valley alameda-county bay-area)
 (4094 c-j-delicatessen deli 2.0 7741 mission-st colma san-mateo-county
  bay-area)
 (4095 andys-deli deli 2.0 1461 reganti-pl-apt-2 concord
  contra-costa-county bay-area)
 (4096 giorgios-deli-&-catering deli 2.3 2250 monument-blvd-ste-a
  concord contra-costa-county bay-area)
 (4097 andreas-deli deli 2.7 10211 s-de-anza-blvd cupertino
  santa-clara-county bay-area)
 (4098 deans-deli deli 2.0 7422 stanford-pl cupertino
  santa-clara-county bay-area)
 (4099 eriks-deli-cafe deli 2.4 19652 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (4100 monroes-deli-&-catering-deli-catering deli 2.0 10959 n-wolfe-rd
  cupertino santa-clara-county bay-area)
 (4101 nelis-deli deli 2.0 21801 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (4102 romeos-cafe-deli deli 2.3 19998 homestead-rd cupertino
  santa-clara-county bay-area)
 (4103 sweet-ending-delights deli 2.0 21267 stevens-creek-blvd
  cupertino santa-clara-county bay-area)
 (4104 g-&-m-deli deli 2.0 301 ottilia-st daly-city san-mateo-county
  bay-area)
 (4105 marios-deli deli 2.0 238 lincoln-ave daly-city san-mateo-county
  bay-area)
 (4106 serramonte-ridge-cafe-deli deli 2.0 901 campus-dr-no.-107
  daly-city san-mateo-county bay-area)
 (4107 westlake-deli deli 2.0 379 s-mayfair-ave daly-city
  san-mateo-county bay-area)
 (4108 danville-deli deli 2.0 301 hartz-ave danville
  contra-costa-county bay-area)
 (4109 eriks-delicafe deli 2.0 7603 amador-valley-blvd-no.-b dublin
  alameda-county bay-area)
 (4110 als-delicatessen deli 2.0 11100 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (4111 la-rosa-deli deli 2.0 4955 appian-way-no.-a el-sobrante
  contra-costa-county bay-area)
 (4112 delicor-of-northern-california deli 2.0 2000 powell-st-ste-12
  emeryville alameda-county bay-area)
 (4113 downtown-deli deli 2.0 714 texas-st fairfield solano-county
  bay-area)
 (4114 solano-deli deli 2.0 1364 travis-blvd-no.-b fairfield
  solano-county bay-area)
 (4115 adriatic-cafe-&-deli deli 2.0 1080 foster-city-blvd foster-city
  san-mateo-county bay-area)
 (4116 piccadilly-deli deli 2.0 1072 shell-blvd foster-city
  san-mateo-county bay-area)
 (4117 browns-deli-&-cafe deli 2.0 47918 warm-springs-blvd fremont
  alameda-county bay-area)
 (4118 cracker-barrel-deli deli 2.0 3100 capitol-ave-no.-h fremont
  alameda-county bay-area)
 (4119 eriks-deli-cafe deli 2.5 4138 walnut-ave fremont alameda-county
  bay-area)
 (4120 eriks-deli-cafe deli 2.7 45153 manzanita-ct fremont
  alameda-county bay-area)
 (4121 eriks-delicafe-otc deli 2.0 415153 manzanita-ct fremont
  alameda-county bay-area)
 (4122 georges-deli deli 2.0 46560 fremont-blvd-ste-101 fremont
  alameda-county bay-area)
 (4123 koalas-deli deli 2.0 44800 s-grimmer-blvd fremont alameda-county
  bay-area)
 (4124 monicas-store-&-deli deli 2.0 4414 calypso-ter fremont
  alameda-county bay-area)
 (4125 ohlone-deli deli 2.0 43625 mission-blvd-stno.101 fremont
  alameda-county bay-area)
 (4126 old-country-deli deli 2.0 39965 mission-blvd fremont
  alameda-county bay-area)
 (4127 pacific-deli-&-catering deli 2.0 46850 warm-springs-blvd fremont
  alameda-county bay-area)
 (4128 plaza-deli deli 2.0 4385 norris-rd fremont alameda-county
  bay-area)
 (4129 wine-sellers-deli deli 2.0 35317 cabrillo-dr fremont
  alameda-county bay-area)
 (4130 aztlan-bakery-&-deli deli 2.3 7419 monterey-st gilroy
  santa-clara-county bay-area)
 (4131 eriks-delicafe deli 2.0 6906 chestnut-st gilroy
  santa-clara-county bay-area)
 (4132 eriks-delicafe deli 2.0 6966 chestnut-st gilroy
  santa-clara-county bay-area)
 (4133 strawflower-delicatessen deli 2.0 80 cabrillo-hwy-n-ste-i
  half-moon-bay san-mateo-county bay-area)
 (4134 airport-deli deli 2.0 20950 corsair-blvd hayward alameda-county
  bay-area)
 (4135 angels-delite-no deli 2.0 204 cherry-way hayward alameda-county
  bay-area)
 (4136 breakwater-cafe-deli deli 2.0 3499 breakwater-ct hayward
  alameda-county bay-area)
 (4137 nellies-deli deli 2.0 2027 florida-way hayward alameda-county
  bay-area)
 (4138 pick-a-deli deli 2.0 23149 clawiter-rd hayward alameda-county
  bay-area)
 (4139 pot-belly-deli deli 2.0 30982 huntwood-ave hayward
  alameda-county bay-area)
 (4140 pot-belly-deli deli 2.0 26010 eden-landing-rd-ste-8 hayward
  alameda-county bay-area)
 (4141 ronnies-deli deli 2.0 3522 arden-rd hayward alameda-county
  bay-area)
 (4142 s-e-deli deli 2.0 21087 cabot-blvd-ste-1 hayward alameda-county
  bay-area)
 (4143 tokyo-deli deli 2.0 2828 d-st hayward alameda-county bay-area)
 (4144 winton-deli deli 2.0 2042 w-winton-ave hayward alameda-county
  bay-area)
 (4145 phillips-delicatessen deli 2.0 765 polaris-way livermore
  alameda-county bay-area)
 (4146 dari-delite deli 2.0 11070 eastbrook-ave los-altos
  santa-clara-county bay-area)
 (4147 delizioso-bakery-deli-cafe deli 2.3 133 n-santa-cruz-ave
  los-gatos santa-clara-county bay-area)
 (4148 la-stradas-kosher-style-deli deli 2.0 210 e-main-st los-gatos
  santa-clara-county bay-area)
 (4149 giovannis-deli-&-catering deli 2.0 601 main-st martinez
  contra-costa-county bay-area)
 (4150 helenes-deli-&-catering deli 2.0 6660 alhambra-ave martinez
  contra-costa-county bay-area)
 (4151 summit-centre-deli deli 2.0 2530 arnold-dr-ste-190 martinez
  contra-costa-county bay-area)
 (4152 ladera-country-deli deli 2.0 3140 alpine-rd-no.-300a menlo-park
  san-mateo-county bay-area)
 (4153 plantation-deli-cafe deli 2.0 865 el-camino-real menlo-park
  san-mateo-county bay-area)
 (4154 pot-belly-deli deli 3.0 1505 adams-dr menlo-park
  san-mateo-county bay-area)
 (4155 leonardos-cafe-&-deli deli 2.0 540 broadway millbrae
  san-mateo-county bay-area)
 (4156 d-n-l-deli deli 2.0 232 s-hillview-dr milpitas
  santa-clara-county bay-area)
 (4157 mays-deli deli 2.0 789 folsom-cir milpitas santa-clara-county
  bay-area)
 (4158 eriks-delicafe deli 2.0 309 vineyard-town-ctr morgan-hill
  santa-clara-county bay-area)
 (4159 moss-landing-deli deli 2.0 0 unknown moss-landing
  monterey-county monterey)
 (4160 dittmers-wursthouse deli 3.9 400 san-antonio-rd mountain-view
  santa-clara-county bay-area)
 (4161 old-san-francisco-deli deli 2.0 1910 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (4162 plantation-deli-cafe deli 3.0 809 cuesta-dr-no.-a mountain-view
  santa-clara-county bay-area)
 (4163 rogers-deli&-donuts deli 2.0 295 e-middlefield-rd mountain-view
  santa-clara-county bay-area)
 (4164 sonias-gourmet-deli deli 2.0 2550 w-el-camino-real-no.-60
  mountain-view santa-clara-county bay-area)
 (4165 the-country-deli deli 2.2 1674 n-shoreline-blvd mountain-view
  santa-clara-county bay-area)
 (4166 pot-belly-deli deli 2.0 902 enterprise-way napa napa-county
  napa-valley)
 (4167 cedars-deli-cafe deli 2.0 37300 cedar-blvd-ste-b newark
  alameda-county bay-area)
 (4168 kim-oanh-deli-restaurant deli 2.0 5774 mowry-school-rd newark
  alameda-county bay-area)
 (4169 x77-deli deli 2.0 7700 edgewater-dr-ste-710 oakland
  alameda-county bay-area)
 (4170 acorn-deli deli 2.0 900 market-st oakland alameda-county
  bay-area)
 (4171 athenian-deli deli 2.3 2125 franklin-st oakland alameda-county
  bay-area)
 (4172 beli-deli deli 2.8 8105 edgewater-dr oakland alameda-county
  bay-area)
 (4173 cactus-delicatessen deli 2.0 530 grand-ave oakland
  alameda-county bay-area)
 (4174 dolmas-deli deli 2.0 201 broadway oakland alameda-county
  bay-area)
 (4175 estelles-hoagie-&-deli-shoppe deli 2.0 6839 foothill-blvd
  oakland alameda-county bay-area)
 (4176 gee-bees-2-deli-&-catering deli 2.0 2350 broadway oakland
  alameda-county bay-area)
 (4177 international-deli deli 2.0 265 e-18th-st oakland alameda-county
  bay-area)
 (4178 jimmys-snack-and-deli deli 2.0 1938 broadway oakland
  alameda-county bay-area)
 (4179 kum-hay-deli deli 2.0 918 webster-st oakland alameda-county
  bay-area)
 (4180 manling-deli deli 2.0 2647 e-14th-st-ste-104 oakland
  alameda-county bay-area)
 (4181 port-deli deli 2.0 1900 embarcadero-no.-111 oakland
  alameda-county bay-area)
 (4182 psyche-deli deli 2.0 2948 california-st oakland alameda-county
  bay-area)
 (4183 railroad-deli deli 2.0 1210 x26th-st oakland alameda-county
  bay-area)
 (4184 rockridge-deli deli 2.0 5118 broadway oakland alameda-county
  bay-area)
 (4185 s-&-g-deli-lounge deli 2.0 3323 telegraph-ave oakland
  alameda-county bay-area)
 (4186 smellie-delli deli 2.0 7972 capwell-dr oakland alameda-county
  bay-area)
 (4187 sunrise-deli-&-market deli 2.0 1415 webster-st oakland
  alameda-county bay-area)
 (4188 swan-way-deli-&-cafe deli 2.0 80 swan-way-ste-125 oakland
  alameda-county bay-area)
 (4189 the-big-apple-cafe deli 2.3 401 x14th-st oakland alameda-county
  bay-area)
 (4190 ultra-lucca deli 2.0 0 dist. oakland alameda-county bay-area)
 (4191 we-never-close-deli-and-market deli 2.0 3338 san-leandro-st
  oakland alameda-county bay-area)
 (4192 orinda-deli deli 2.0 19 orinda-way-no.-f orinda
  contra-costa-county bay-area)
 (4193 ottinos-delicatessen deli 2.0 64 moraga-way orinda
  contra-costa-county bay-area)
 (4194 sams-deli deli 1.7 1261 linda-mar-shopping-ctr pacifica
  san-mateo-county bay-area)
 (4195 fratelli-deli deli 2.2 405 university-ave palo-alto
  santa-clara-county bay-area)
 (4196 gabors-delicatessen deli 2.0 85 town-and-country-vlg palo-alto
  santa-clara-county bay-area)
 (4197 plantation-deli-cafe deli 2.0 321 hamilton-ave palo-alto
  santa-clara-county bay-area)
 (4198 togos deli 2.0 528 university-ave palo-alto santa-clara-county
  bay-area)
 (4199 catalanos-deli deli 2.0 1578 fitzgerald-dr-no.-a pinole
  contra-costa-county bay-area)
 (4200 the-new-deli deli 2.7 624 san-pablo-ave-no.-a pinole
  contra-costa-county bay-area)
 (4201 caccis-delicatessen-&-caterin deli 2.0 3748 railroad pittsburg
  contra-costa-county bay-area)
 (4202 salty-dog deli 2.0 985 railroad pittsburg contra-costa-county
  bay-area)
 (4203 thats-amore-deli deli 2.0 453 railroad pittsburg
  contra-costa-county bay-area)
 (4204 blue-garden-deli deli 2.0 100 brixman-way pleasant-hill
  contra-costa-county bay-area)
 (4205 jans-deli deli 2.0 2143 norse-dr pleasant-hill
  contra-costa-county bay-area)
 (4206 amelias-deli-bistro deli 2.3 3309 dunsmuir-ct pleasanton
  alameda-county bay-area)
 (4207 eriks-delicafe-of-pleasanton deli 2.7 4247 rosewood-dr-ste-19
  pleasanton alameda-county bay-area)
 (4208 fairland-deli deli 2.0 3510 old-santa-rita-rd-ste-a pleasanton
  alameda-county bay-area)
 (4209 liguria-deli-&-pasta deli 2.0 915 main-st-ste-b pleasanton
  alameda-county bay-area)
 (4210 plaza-deli deli 2.0 5694 stoneridge-dr pleasanton alameda-county
  bay-area)
 (4211 plaza-deli-cafe deli 2.0 6654 koll-center-pky-ste-310 pleasanton
  alameda-county bay-area)
 (4212 pot-belly-deli deli 2.3 5820 stoneridge-mall-rd-ste-114
  pleasanton alameda-county bay-area)
 (4213 stoneridge-deli deli 2.0 7901 stoneridge-dr-ste-140 pleasanton
  alameda-county bay-area)
 (4214 a-m-deli deli 2.0 465 convention-way redwood-city
  san-mateo-county bay-area)
 (4215 caravan-deli deli 2.3 686 broadway redwood-city san-mateo-county
  bay-area)
 (4216 european-deli-&-imports deli 2.0 820 veterans-blvd-no.-d
  redwood-city san-mateo-county bay-area)
 (4217 georgie-deli deli 2.0 1755 e-bayshore-blvd-no.-10a redwood-city
  san-mateo-county bay-area)
 (4218 tivoli-cafe-&-deli deli 2.0 2327 broadway redwood-city
  san-mateo-county bay-area)
 (4219 togos deli 2.3 851 veterans-blvd redwood-city san-mateo-county
  bay-area)
 (4220 hilltop-deli deli 2.0 2946 hilltop-mall-rd richmond
  contra-costa-county bay-area)
 (4221 tarabinis-deli deli 2.0 322 harbour-way richmond
  contra-costa-county bay-area)
 (4222 taylor-made-catering deli 2.0 390 rainier-ct rio-vista
  solano-county bay-area)
 (4223 las-palomas-deli deli 2.0 159 longford-dr south-san-francisco
  san-mateo-county bay-area)
 (4224 linden-deli deli 2.0 314 linden-ave south-san-francisco
  san-mateo-county bay-area)
 (4225 marias-deli-&-mexican-food deli 2.0 394 grand-ave
  south-san-francisco san-mateo-county bay-area)
 (4226 south-city-deli deli 2.0 1429 san-mateo-ave south-san-francisco
  san-mateo-county bay-area)
 (4227 creekside-deli-cafe deli 2.0 1065 main-st saint-helena
  napa-county napa-valley)
 (4228 valley-deli deli 2.0 1138 main-st saint-helena napa-county
  napa-valley)
 (4229 express-deli deli 2.0 1225 san-mateo-ave san-bruno
  san-mateo-county bay-area)
 (4230 vicino-deli-&-cafe deli 2.0 8 bayhill-shopping-ctr san-bruno
  san-mateo-county bay-area)
 (4231 annas-deli deli 2.0 906 branham-ln san-jose santa-clara-county
  bay-area)
 (4232 annas-deli deli 2.0 2615 brahms-ave san-jose santa-clara-county
  bay-area)
 (4233 antipastos-gourmet-meat-deli deli 2.0 3454 mckee-rd san-jose
  santa-clara-county bay-area)
 (4234 big-apple-deli deli 2.0 55 s-market-st-ste-230 san-jose
  santa-clara-county bay-area)
 (4235 blossom-hill-bkry-deli-esprso deli 2.0 461 blossom-hill-rd-no.-e
  san-jose santa-clara-county bay-area)
 (4236 boxcar-deli deli 2.0 1818 saratoga-ave san-jose
  santa-clara-county bay-area)
 (4237 cheo-leo-cafe-&-deli deli 2.0 1692 tully-rd-ste-1 san-jose
  santa-clara-county bay-area)
 (4238 city-cafe-&-deli deli 2.0 55 s-1st-st san-jose
  santa-clara-county bay-area)
 (4239 d-agostinos-deli-&-catering deli 2.0 1594 meridian-ave san-jose
  santa-clara-county bay-area)
 (4240 deli-experts deli 2.0 1334 hapland-ct san-jose
  santa-clara-county bay-area)
 (4241 deli-fever deli 2.0 1150 murphy-ave-no.-a san-jose
  santa-clara-county bay-area)
 (4242 eriks-delicafe-otc deli 2.0 5705 cottle-rd san-jose
  santa-clara-county bay-area)
 (4243 european-deli deli 2.0 947 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (4244 gourmet-mexican-deli deli 2.0 6177 santa-teresa-blvd san-jose
  santa-clara-county bay-area)
 (4245 gunthers-delicatessen-restaurant deli 2.0 2880 gardendale-dr
  san-jose santa-clara-county bay-area)
 (4246 heidis-european-deli deli 2.7 124 blossom-hill-rd-ste-a san-jose
  santa-clara-county bay-area)
 (4247 italia-delicatessen deli 2.0 1440 kooser-rd san-jose
  santa-clara-county bay-area)
 (4248 jcs-bbq-&-deli deli 2.8 1080 saratoga-ave san-jose
  santa-clara-county bay-area)
 (4249 la-villa-deli deli 2.0 1319 lincoln-ave san-jose
  santa-clara-county bay-area)
 (4250 mexican-deli deli 2.0 3859 x7-trees-blvd san-jose
  santa-clara-county bay-area)
 (4251 missys-deli deli 2.0 6058 chesbro-ave san-jose
  santa-clara-county bay-area)
 (4252 montana-smokehouse-deli deli 2.0 885 delmas-ave san-jose
  santa-clara-county bay-area)
 (4253 monterey-jacks-deli-&-caterer deli 2.0 1343 s-winchester-blvd
  san-jose santa-clara-county bay-area)
 (4254 northside-mexican-deli deli 2.0 901 n-13th-st san-jose
  santa-clara-county bay-area)
 (4255 pot-belly-deli deli 2.0 111 n-market-st-ste-120 san-jose
  santa-clara-county bay-area)
 (4256 pot-belly-deli deli 2.0 70 decker-way san-jose
  santa-clara-county bay-area)
 (4257 roberts-hot-dog-&-deli deli 2.0 1489 fruitdale-ave-apt-36
  san-jose santa-clara-county bay-area)
 (4258 sandys-deli deli 2.0 3179 meridian-ave san-jose
  santa-clara-county bay-area)
 (4259 second-deli deli 2.0 11 s-2nd-st san-jose santa-clara-county
  bay-area)
 (4260 singh-subway deli 2.0 1256 bacchus-dr san-jose
  santa-clara-county bay-area)
 (4261 the-deli deli 2.0 2413 zanker-rd san-jose santa-clara-county
  bay-area)
 (4262 the-health-food-deli deli 2.0 2532 berryessa-rd san-jose
  santa-clara-county bay-area)
 (4263 time-deli deli 3.0 349 s-bascom-ave san-jose santa-clara-county
  bay-area)
 (4264 togos deli 3.0 336 e-william-st san-jose santa-clara-county
  bay-area)
 (4265 togos deli 3.0 5353 almaden-expy san-jose santa-clara-county
  bay-area)
 (4266 togos deli 3.0 1937 tully-rd san-jose santa-clara-county
  bay-area)
 (4267 togos deli 3.0 5677 snell-ave san-jose santa-clara-county
  bay-area)
 (4268 togos deli 3.0 14944 camden-ave san-jose santa-clara-county
  bay-area)
 (4269 togos deli 3.0 1150 willow-glen-way san-jose santa-clara-county
  bay-area)
 (4270 togos deli 3.0 4360 stevens-creek-blvd san-jose
  santa-clara-county bay-area)
 (4271 togos deli 3.0 3076 landess-ave san-jose santa-clara-county
  bay-area)
 (4272 togos deli 3.0 7130 santa-teresa-blvd san-jose
  santa-clara-county bay-area)
 (4273 train-track-deli deli 2.0 1725 rogers-ave-no.-a san-jose
  santa-clara-county bay-area)
 (4274 villa-lanzas-gourmet-deli deli 2.0 2854 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (4275 the-donkey-deli deli 2.0 0 unknown san-juan-bautista
  san-benito-county northern-california)
 (4276 deli-marina deli 2.0 2108 marina-blvd san-leandro alameda-county
  bay-area)
 (4277 happy-deli deli 2.0 14630 wicks-blvd san-leandro alameda-county
  bay-area)
 (4278 loris-deli-&-hot-dogs deli 2.0 15001 farnsworth-st san-leandro
  alameda-county bay-area)
 (4279 lucca-delicatessen deli 2.0 1509 e-14th-st san-leandro
  alameda-county bay-area)
 (4280 marina-liquor-deli deli 2.0 2260 marina-blvd san-leandro
  alameda-county bay-area)
 (4281 pot-belly-deli deli 2.0 611 mccormick-st san-leandro
  alameda-county bay-area)
 (4282 sandwitchery-deli-&-cstm-cater deli 2.0 312 davis-st san-leandro
  alameda-county bay-area)
 (4283 the-daily-deli deli 2.0 1750 doolittle-dr san-leandro
  alameda-county bay-area)
 (4284 the-deli-den deli 2.0 1933 davis-st-ste-111 san-leandro
  alameda-county bay-area)
 (4285 zorbas-deli-cafe deli 2.0 17780 hesperian-blvd san-lorenzo
  alameda-county bay-area)
 (4286 harrys-shoreview-deli deli 2.0 1446 cary-ave san-mateo
  san-mateo-county bay-area)
 (4287 las-palomas-deli deli 3.3 504 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (4288 new-york-subs deli 2.0 700 x19th-ave-apt-207 san-mateo
  san-mateo-county bay-area)
 (4289 rasputin-russian-restaurant-&-deli deli 2.0 163 w-25th-ave
  san-mateo san-mateo-county bay-area)
 (4290 take-five-deli deli 2.0 1510 fashion-island-blvd san-mateo
  san-mateo-county bay-area)
 (4291 the-olive-tree-deli deli 2.0 1829 gateway-dr-no.-110 san-mateo
  san-mateo-county bay-area)
 (4292 the-olive-tree-deli deli 2.0 1450 fashion-island-blvd-ste-110
  san-mateo san-mateo-county bay-area)
 (4293 vienglatri-coffee-&-deli-resta deli 2.0 2037 x23rd-st san-pablo
  contra-costa-county bay-area)
 (4294 diablo-deli deli 2.0 2435 san-ramon-valley-blvd san-ramon
  contra-costa-county bay-area)
 (4295 eriks-delicafe-of-san-ramon deli 2.4 2551
  san-ramon-valley-blvd-no.115 san-ramon contra-costa-county bay-area)
 (4296 de-la-cruz-deli deli 2.0 3075 olcott-st santa-clara
  santa-clara-county bay-area)
 (4297 eriks-deli-cafe-of-santa-clar deli 2.0 830 kiely-blvd
  santa-clara santa-clara-county bay-area)
 (4298 hayats-pastry-donuts-&-deli deli 2.7 2521 newhall-st santa-clara
  santa-clara-county bay-area)
 (4299 ninos-hip-hop-deli deli 2.0 2450 scott-blvd-no.-306 santa-clara
  santa-clara-county bay-area)
 (4300 p-j-s-deli deli 2.0 1555 laurelwood-rd santa-clara
  santa-clara-county bay-area)
 (4301 papa-deli deli 2.0 930 el-camino-real santa-clara
  santa-clara-county bay-area)
 (4302 pockets-deli deli 2.0 2503 scott-blvd santa-clara
  santa-clara-county bay-area)
 (4303 pommard-deli deli 2.0 2221 the-alameda santa-clara
  santa-clara-county bay-area)
 (4304 togos deli 2.0 3194 de-la-cruz-blvd-no.-a santa-clara
  santa-clara-county bay-area)
 (4305 woodham-deli deli 2.0 4491 stevens-creek-blvd santa-clara
  santa-clara-county bay-area)
 (4306 anchor-sandwich-&-deli deli 2.0 1658 soquel-dr santa-cruz
  santa-cruz-county bay-area)
 (4307 harbor-deli deli 2.0 460 x7th-ave santa-cruz santa-cruz-county
  bay-area)
 (4308 indian-summer-deli deli 2.0 122 rincon-st-apt-f santa-cruz
  santa-cruz-county bay-area)
 (4309 joes-pizza-and-subs deli 2.3 736 water-st santa-cruz
  santa-cruz-county bay-area)
 (4310 togos deli 3.0 425 barson-st santa-cruz santa-cruz-county
  bay-area)
 (4311 zabib-deli deli 2.0 2340 mission-st santa-cruz santa-cruz-county
  bay-area)
 (4312 argonaut-delicatessen deli 2.0 12866 saratoga-sunnyvale-rd
  saratoga santa-clara-county bay-area)
 (4313 beas-plaza-deli deli 2.0 12796 bach-ct saratoga
  santa-clara-county bay-area)
 (4314 mishkas-cafe-&-deli deli 2.0 14515 big-basin-way saratoga
  santa-clara-county bay-area)
 (4315 vienna-woods-delicatessen deli 2.3 14567 big-basin-way saratoga
  santa-clara-county bay-area)
 (4316 togos deli 2.0 606 bean-creek-rd scotts-valley unknown bay-area)
 (4317 togos deli 2.0 266 mount-hermon-rd scotts-valley unknown
  bay-area)
 (4318 mankas-corner-deli-restaurant deli 2.0 2522 mankas-corner-rd
  suisun-city solano-county bay-area)
 (4319 de-la-cruz-deli deli 2.0 250 e-java-dr sunnyvale
  santa-clara-county bay-area)
 (4320 elko-station-deli deli 2.0 1111 elko-dr-unit-a sunnyvale
  santa-clara-county bay-area)
 (4321 eriks-delicafe-of-sunnyvale deli 2.0 717 e-el-camino-real
  sunnyvale santa-clara-county bay-area)
 (4322 jans-deli-cafe deli 2.0 155 moffett-park-dr-no.-p sunnyvale
  santa-clara-county bay-area)
 (4323 togos deli 2.0 528 n-lawrence-expy sunnyvale santa-clara-county
  bay-area)
 (4324 togos deli 2.0 1253 w-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (4325 togos deli 2.8 779 e-el-camino-real-no.-1 sunnyvale
  santa-clara-county bay-area)
 (4326 togos deli 2.0 1220 crossman-ave sunnyvale santa-clara-county
  bay-area)
 (4327 tidalwave-deli-&-catering deli 2.0 29316 kohoutek-way union-city
  alameda-county bay-area)
 (4328 good-deeds-delicatessen deli 2.0 495 mare-island-way vallejo
  solano-county bay-area)
 (4329 executive-deli deli 2.0 2033 n-main-st-ste-160 walnut-creek
  contra-costa-county bay-area)
 (4330 lanas-deli deli 2.0 1981 n-brd walnut-creek contra-costa-county
  bay-area)
 (4331 locust-street-deli deli 2.0 1552 locust-st walnut-creek
  contra-costa-county bay-area)
 (4332 o-deli deli 2.0 1600 riviera-ave walnut-creek
  contra-costa-county bay-area)
 (4333 palermo-deli-&-catering deli 2.0 1845 ygnacio-valley-rd
  walnut-creek contra-costa-county bay-area)
 (4334 plaza-deli deli 2.0 2175 n-california-blvd-ste-204 walnut-creek
  contra-costa-county bay-area)
 (4335 pot-belly-deli deli 2.3 325 n-wiget-ln walnut-creek
  contra-costa-county bay-area)
 (4336 village-cupboard-delicatessen deli 2.0 1842 tice-valley-blvd
  walnut-creek contra-costa-county bay-area)
 (4337 togos deli 2.0 1985 main-st watsonville santa-cruz-county
  bay-area)
 (4338 plantation-deli-cafe deli 2.0 3605 tripp-rd woodside
  san-mateo-county bay-area)
 (4339 danielles-deli deli 2.0 1201 laurel-st san-carlos
  san-mateo-county bay-area)
 (4340 adeline-market-deli deli 2.3 1508 adeline-dr burlingame
  san-mateo-county bay-area)
 (4341 jorideli-restaurant deli 2.0 230 soscol-ave napa napa-county
  napa-valley)
 (4342 italian-delite-submarine-sandwiches deli 2.3 468 ignacio-blvd
  novato marin-county bay-area)
 (4343 charleys-liquors-&-deli deli 2.0 601 petaluma-blvd-s petaluma
  sonoma-county bay-area)
 (4344 franzi-swiss-italian-deli deli 2.0 1390 n-mcdowell-blvd petaluma
  sonoma-county bay-area)
 (4345 la-famiglia-deli-cafe deli 2.3 220 western-ave petaluma
  sonoma-county bay-area)
 (4346 lucchesis-delicatessen deli 2.0 231 mac-dowell-bl petaluma
  sonoma-county bay-area)
 (4347 marys-pizza-shack-delivery deli 2.0 501 lakeville petaluma
  sonoma-county bay-area)
 (4348 old-chicago-pizza-delivery deli 2.0 291 mc-dowell-bl petaluma
  sonoma-county bay-area)
 (4349 park-deli-cafe deli 2.0 1000 clegg-ct petaluma sonoma-county
  bay-area)
 (4350 tatos-pizza-plus-delivery deli 2.0 1060 petaluma-blvd-n petaluma
  sonoma-county bay-area)
 (4351 deli-on-wheels deli 2.0 607 martin-ave rohnert-park
  sonoma-county bay-area)
 (4352 hana-japanese-restaurant-&-deli deli 2.0 101
  golf-course-dr-red-lion-plaza rohnert-park sonoma-county bay-area)
 (4353 marys-pizza-shack-delivery deli 2.0 101 golf-course-dr
  rohnert-park sonoma-county bay-area)
 (4354 delicious-catrng deli 2.0 26 medway-rd san-rafael marin-county
  bay-area)
 (4355 annadeli deli 2.0 2700 yulupa-ave santa-rosa sonoma-county
  bay-area)
 (4356 arrigonis-delicatessen-&-cafe deli 2.7 701 x4th-st santa-rosa
  sonoma-county bay-area)
 (4357 bacchus-wine-co-&-deli deli 2.0 52 mission-blvd santa-rosa
  sonoma-county bay-area)
 (4358 benjelmos-deli-&-gourmet deli 2.0 515 hahman-dr santa-rosa
  sonoma-county bay-area)
 (4359 california-cafe-deli deli 2.0 170 farmers-ln santa-rosa
  sonoma-county bay-area)
 (4360 canevari-delicatessen-and-catering deli 2.0 695 lewis-rd
  santa-rosa sonoma-county bay-area)
 (4361 carms-cafe-&-deli deli 2.0 4323 montgomery-dr santa-rosa
  sonoma-county bay-area)
 (4362 carousel-fruit-delight deli 2.0 3185 cleveland-ave santa-rosa
  sonoma-county bay-area)
 (4363 good-stuff-market-&-deli deli 2.0 1760 pine-rd santa-rosa
  sonoma-county bay-area)
 (4364 lakeside-deli deli 2.0 531 summerfield-rd santa-rosa
  sonoma-county bay-area)
 (4365 macs-kosher-style-deli deli 2.0 630 x4th-st santa-rosa
  sonoma-county bay-area)
 (4366 montecito-delicatessen deli 2.0 791 montecito-ctr santa-rosa
  sonoma-county bay-area)
 (4367 perrys-delicatessen deli 2.0 1220 mendocino-ave santa-rosa
  sonoma-county bay-area)
 (4368 perrys-delicatessen deli 2.0 1117 sebastopol-rd santa-rosa
  sonoma-county bay-area)
 (4369 skyklane-deli deli 2.0 5350 skylane-blvd santa-rosa
  sonoma-county bay-area)
 (4370 duncans-mills-restaurant-&-deli deli 2.0 25191 highway-116
  sebastopol sonoma-county bay-area)
 (4371 giovannis-deli-&-wine-shop deli 2.7 173 pleasant-hill-ave-n
  sebastopol sonoma-county bay-area)
 (4372 deli-depot deli 2.0 555 st sonoma sonoma-county bay-area)
 (4373 marys-pizza-shack-delivery deli 2.0 452 st sonoma sonoma-county
  bay-area)
 (4374 island-delite deli 2.0 1920 springs-rd vallejo solano-county
  bay-area)
 (4375 ali-baba-deli-&-restaurant deli 2.0 3199 clement-st
  san-francisco san-francisco-county bay-area)
 (4376 davids-deli deli 2.0 0 --474-geary-st san-francisco
  san-francisco-county bay-area)
 (4377 davids-delicatessen-&-caterer deli 2.3 474 geary-st
  san-francisco san-francisco-county bay-area)
 (4378 delicious-chinese-food deli 2.0 2729 mission-st san-francisco
  san-francisco-county bay-area)
 (4379 j-js-deli-and-restaurant deli 2.0 1221 mission-st san-francisco
  san-francisco-county bay-area)
 (4380 new-deli-indian-restaurant deli 2.0 160 ellis-st san-francisco
  san-francisco-county bay-area)
 (4381 parrilla-deli-&-restaurant deli 2.0 3061 san-bruno-ave
  san-francisco san-francisco-county bay-area)
 (4382 maxs-opera-cafe deli 3.1 711 stanford-shopping-center palo-alto
  santa-clara-county bay-area)
 (4383 aux-delices-vietnamese-restaurant deli 2.7 2327 polk-st
  san-francisco san-francisco-county bay-area)
 (4384 plantation-deli-cafe deli 2.0 0 ave palo-alto santa-clara-county
  bay-area)
 (4385 togos-eatery deli 2.0 nil nil san-carlos san-mateo-county
  bay-area)
 (4386 delicatessen deli 2.0 14435 big-basin-way cupertino
  santa-clara-county bay-area)
 (4387 zoccolis deli 3.2 0 ave santa-cruz santa-cruz-county bay-area)
 (4388 togos deli 2.7 1911 w-el-camino-real mountain-view
  santa-clara-county bay-area)
 (4389 happy-belly-deli-&-cafe deli 2.7 30 jack-london-sq oakland
  alameda-county bay-area)
 (4390 togos deli 3.0 145 w-calaveras-blvd milpitas santa-clara-county
  bay-area)
 (4391 maxs deli 3.4 1001 el-camino-real redwood-city san-mateo-county
  bay-area)
 (4392 noahs-new-york-bagels deli 1.8 400 castro san-francisco
  san-francisco-county bay-area)
 (4393 colombos-deli deli 3.0 0 shopping-center pacifica
  san-mateo-county bay-area)
 (4394 portola-cafe-deli deli 2.3 3 portola-rd portola-valley
  san-mateo-county bay-area)
 (4395 jew-and-the-gentile-deli deli 2.7 570 n.-shoreline-bv
  mountain-view santa-clara-county bay-area)
 (4396 avantis deli 3.0 1881 rollins-rd burlingame san-mateo-county
  bay-area)
 (4397 borels-cafe deli 2.3 59 bovet-rd san-mateo san-mateo-county
  bay-area)
 (4398 village-deli deli 2.7 82 solano-sq. benicia solano-county
  bay-area)
 (4399 oakville-grocery deli 2.0 7859 st.-helena-highway oakville
  napa-county napa-valley)
 (4400 kleins-delicatessen delicatessen 2.3 501 connecticut
  san-francisco san-francisco-county bay-area)
 (4401 palisades-market-&-delicatessen delicatessen 2.0 1506 lincoln
  calistoga napa-county napa-valley)
 (4402 continental-delicatessen delicatessen 3.6 1971 san-pablo-avenue
  pinole contra-costa-county bay-area)
 (4403 dinner-is-served delivery 2.0 0 unknown sunnyvale
  santa-clara-county bay-area)
 (4404 walkers-pie-shop dessert 2.7 1489 solano-ave-no.-91 albany
  alameda-county bay-area)
 (4405 au-coquelet dessert 2.6 2000 university-ave berkeley
  alameda-county bay-area)
 (4406 crepe-a-go-go dessert 3.3 2125 university-ave berkeley
  alameda-county bay-area)
 (4407 mrs.-fields-cookies dessert 1.7 2399 telegraph-ave berkeley
  alameda-county bay-area)
 (4408 cookie-gourmet dessert 2.0 10175 parkwood-dr-apt-5 cupertino
  santa-clara-county bay-area)
 (4409 grannys-goodies dessert 2.0 15545 union-ave los-gatos
  santa-clara-county bay-area)
 (4410 j-higbys-yogurt-&-treat-shopp dessert 2.0 700
  el-camino-real-no.-165 menlo-park san-mateo-county bay-area)
 (4411 cookie-habit dessert 2.0 238 stanford-shopping-ctr palo-alto
  santa-clara-county bay-area)
 (4412 cheat-a-little-cheesecakes dessert 2.0 1246 park-ave san-bruno
  san-mateo-county bay-area)
 (4413 cheat-a-little-cheesecakes dessert 2.0 1590 el-camino-real-no.-i
  san-bruno san-mateo-county bay-area)
 (4414 hannahs-cookies dessert 2.0 150 s-1st-st-ste-7 san-jose
  santa-clara-county bay-area)
 (4415 aunt-bonnies-cookies dessert 2.0 1731 homestead-rd santa-clara
  santa-clara-county bay-area)
 (4416 blue-chip-cookies dessert 2.0 2855 stevens-creek-blvd-ste-2325
  santa-clara santa-clara-county bay-area)
 (4417 the-cookie-cupboard dessert 2.0 0 unknown saratoga
  santa-clara-county bay-area)
 (4418 feedlot dessert 2.8 6971 airline-hwy. tres-pinos unknown
  unknown)
 (4419 jillys-delectable-desserts dessert 2.0 1430 candelero-dr
  walnut-creek contra-costa-county bay-area)
 (4420 crepe-vine dessert 2.3 624 irving-st san-francisco
  san-francisco-county bay-area)
 (4421 classic-confections dessert 2.7 1469 shattuck-avenue berkeley
  alameda-county bay-area)
 (4422 dolce-spazio dessert 2.7 0 cruz-ave los-gatos santa-clara-county
  bay-area)
 (4423 just-desserts dessert 3.0 0 unknown palo-alto santa-clara-county
  bay-area)
 (4424 special-teas-&-heirlooms dessert 2.7 520 main-st pleasanton
  alameda-county bay-area)
 (4425 toy-boat-dessert dessert 1.7 401 clement san-francisco
  san-francisco-county bay-area)
 (4426 sweet-inspirations dessert 2.7 2123 fillmore-st san-francisco
  san-francisco-county bay-area)
 (4427 special-treats-patisserie dessert 3.0 81 e.-3rd-ave san-mateo
  san-mateo-county bay-area)
 (4428 javabobs dessert 2.7 20991 redwood-rd castro-valley
  alameda-county bay-area)
 (4429 ocean-view dim-sum 2.9 141 south-murphy-av sunnyvale
  santa-clara-county bay-area)
 (4430 gold-mountain-restaurant dim-sum 2.5 644 broadway san-francisco
  san-francisco-county bay-area)
 (4431 good-luck-dim-sum dim-sum 2.0 736 clement-st san-francisco
  san-francisco-county bay-area)
 (4432 tins-tea-house dim-sum 1.8 nil nil oakland alameda-county
  bay-area)
 (4433 sankee dim-sum 2.7 1686 s-wolfe-rd sunnyvale santa-clara-county
  bay-area)
 (4434 chubbys-diner diner 1.7 1265 harbor-bay-pky alameda
  alameda-county bay-area)
 (4435 doggie-diner diner 2.0 1700 webster-st alameda alameda-county
  bay-area)
 (4436 duffy-diner diner 2.0 1700 webster-st alameda alameda-county
  bay-area)
 (4437 harvey-west-railroad-&-diner diner 2.0 221 treasure-island-ave
  aptos santa-cruz-county bay-area)
 (4438 the-diner-los-gatos diner 2.0 7158 freedom-blvd aptos
  santa-cruz-county bay-area)
 (4439 chubbys-diner diner 2.3 820 southampton-rd benicia solano-county
  bay-area)
 (4440 bettes-oceanview-diner diner 3.0 1807 a-fourth-st berkeley
  alameda-county bay-area)
 (4441 the-berkeley-original-mels diner 2.3 2240 shattuck-ave berkeley
  alameda-county bay-area)
 (4442 folsom-diner diner 2.0 1499 bayshore-hwy-ste-134 burlingame
  san-mateo-county bay-area)
 (4443 cocos diner 2.0 330 e-hamilton-ave campbell santa-clara-county
  bay-area)
 (4444 dennys diner 2.0 580 w-hamilton-ave campbell santa-clara-county
  bay-area)
 (4445 dennys diner 1.7 2060 s-bascom-ave campbell santa-clara-county
  bay-area)
 (4446 goodies-diner diner 2.0 1395 w-hacienda-ave campbell
  santa-clara-county bay-area)
 (4447 sandis-diner diner 2.0 186 e-sunnyoaks-ave-no.-f-6 campbell
  santa-clara-county bay-area)
 (4448 lyons-restaurant diner 2.0 1900 x41st-ave capitola unknown
  bay-area)
 (4449 mels-original-diner diner 2.0 4600 clayton-rd-no.-a concord
  contra-costa-county bay-area)
 (4450 pauls-family-restaurant diner 2.0 10700 s-de-anza-blvd cupertino
  santa-clara-county bay-area)
 (4451 lyons-restaurant diner 2.0 2 poncetta-dr daly-city
  san-mateo-county bay-area)
 (4452 lyons-restaurant diner 2.0 1165 triton-dr foster-city
  san-mateo-county bay-area)
 (4453 dennys diner 1.7 8425 san-ysidro-ave gilroy santa-clara-county
  bay-area)
 (4454 lyons-restaurant diner 2.0 395 leavesley-rd gilroy
  santa-clara-county bay-area)
 (4455 lyons-restaurant diner 2.0 4298 el-camino-real los-altos
  santa-clara-county bay-area)
 (4456 the-diner-los-gatos diner 2.0 235 saratoga-ave los-gatos
  santa-clara-county bay-area)
 (4457 lyons-restaurant diner 2.0 135 s-el-camino-real millbrae
  san-mateo-county bay-area)
 (4458 lyons-restaurant diner 2.0 765 e-calaveras-blvd milpitas
  santa-clara-county bay-area)
 (4459 mils-diner diner 2.4 36 s-abbott-ave milpitas santa-clara-county
  bay-area)
 (4460 brothers-diner diner 2.3 2603 charleston-rd mountain-view
  santa-clara-county bay-area)
 (4461 dennys diner 2.0 1108 doyle-pl mountain-view santa-clara-county
  bay-area)
 (4462 claremont-diner diner 2.0 6200 claremont-ave oakland
  alameda-county bay-area)
 (4463 day-&-night-diner diner 2.0 1998 san-pablo-ave oakland
  alameda-county bay-area)
 (4464 j-js-diner diner 2.3 315 x27th-st oakland alameda-county
  bay-area)
 (4465 weebabys-diner diner 2.0 9314 e-14th-st oakland alameda-county
  bay-area)
 (4466 dennys diner 1.6 1201 linda-mar-shopping-ctr pacifica
  san-mateo-county bay-area)
 (4467 dennys diner 2.0 1201 broadway redwood-city san-mateo-county
  bay-area)
 (4468 johnnys-diner diner 2.0 171 harbour-way-s richmond
  contra-costa-county bay-area)
 (4469 river-city-diner diner 2.0 26 s-2nd-st rio-vista solano-county
  bay-area)
 (4470 chubbys-diner diner 2.0 250 e-grand-ave south-san-francisco
  san-mateo-county bay-area)
 (4471 dennys diner 2.0 2220 westborough-blvd south-san-francisco
  san-mateo-county bay-area)
 (4472 eds-diner diner 2.0 348 grand-ave south-san-francisco
  san-mateo-county bay-area)
 (4473 lyons-restaurant diner 1.7 10 airport-blvd south-san-francisco
  san-mateo-county bay-area)
 (4474 lyons-restaurant diner 2.0 751 san-bruno-ave-w san-bruno
  san-mateo-county bay-area)
 (4475 lyons-restaurant diner 1.7 1484 el-camino-real san-carlos
  san-mateo-county bay-area)
 (4476 cocos diner 2.3 1795 hillsdale-ave san-jose santa-clara-county
  bay-area)
 (4477 cocos diner 2.0 370 kiely-blvd san-jose santa-clara-county
  bay-area)
 (4478 dennys diner 2.0 1390 s-1st-st san-jose santa-clara-county
  bay-area)
 (4479 dennys diner 2.0 1490 n-1st-st san-jose santa-clara-county
  bay-area)
 (4480 dennys diner 2.0 1001 e-capitol-expy san-jose santa-clara-county
  bay-area)
 (4481 dennys diner 2.0 2401 lanai-ave san-jose santa-clara-county
  bay-area)
 (4482 dennys diner 2.7 1015 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (4483 dennys diner 2.0 555 saratoga-ave san-jose santa-clara-county
  bay-area)
 (4484 dennys diner 1.7 998 saratoga-sunnyvale-rd san-jose
  santa-clara-county bay-area)
 (4485 dennys diner 2.0 2077 n-1st-st san-jose santa-clara-county
  bay-area)
 (4486 dennys-restaurant diner 2.0 7531 morevern-cir san-jose
  santa-clara-county bay-area)
 (4487 lyons-of-san-jose diner 2.0 335 s-winchester-blvd san-jose
  santa-clara-county bay-area)
 (4488 lyons-of-san-jose-2-449 diner 2.0 5291 prospect-rd san-jose
  santa-clara-county bay-area)
 (4489 lyons-restaurant diner 2.0 5512 monterey-hwy san-jose
  santa-clara-county bay-area)
 (4490 shirleys-diner diner 2.0 2123 doolittle-dr san-leandro
  alameda-county bay-area)
 (4491 dennys diner 2.0 427 concar-dr san-mateo san-mateo-county
  bay-area)
 (4492 dennys diner 2.0 2920 s-norfolk-st san-mateo san-mateo-county
  bay-area)
 (4493 lyons-restaurant diner 2.3 1750 s-el-camino-real san-mateo
  san-mateo-county bay-area)
 (4494 the-good-earth diner 2.6 3190 campus-dr san-mateo
  san-mateo-county bay-area)
 (4495 dennys diner 2.0 1745 el-camino-real santa-clara
  santa-clara-county bay-area)
 (4496 dennys diner 2.8 3715 el-camino-real santa-clara
  santa-clara-county bay-area)
 (4497 lyons-restaurant diner 2.0 2390 el-camino-real santa-clara
  santa-clara-county bay-area)
 (4498 dannys-diner diner 2.0 2501 soquel-dr santa-cruz
  santa-cruz-county bay-area)
 (4499 dennys diner 2.0 1515 ocean-st santa-cruz santa-cruz-county
  bay-area)
 (4500 pauls-diner diner 2.0 2403 mission-st santa-cruz
  santa-cruz-county bay-area)
 (4501 dennys diner 2.3 5270 scotts-valley-dr scotts-valley unknown
  bay-area)
 (4502 babs-delta-diner diner 3.2 501 main-st-apt-d suisun-city
  solano-county bay-area)
 (4503 cocos diner 2.7 1209 oakmead-pky sunnyvale santa-clara-county
  bay-area)
 (4504 dennys diner 2.0 814 ahwanee-ave sunnyvale santa-clara-county
  bay-area)
 (4505 dennys-restaurant diner 2.0 311 s-mathilda-ave sunnyvale
  santa-clara-county bay-area)
 (4506 lyons-restaurant diner 2.3 415 e-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (4507 hubcaps-diner diner 3.0 1548 bonanza-st walnut-creek
  contra-costa-county bay-area)
 (4508 johnny-angels diner 3.5 2033 n-main-st-ste-210 walnut-creek
  contra-costa-county bay-area)
 (4509 rossmoor-diner diner 2.0 1908 tice-valley-blvd-no.-a
  walnut-creek contra-costa-county bay-area)
 (4510 taxis diner 3.0 1560 newell-ave walnut-creek contra-costa-county
  bay-area)
 (4511 california-diner diner 2.0 6795 washington-st yountville
  napa-county napa-valley)
 (4512 blueplate-diner diner 2.0 811 coombs-st napa napa-county
  napa-valley)
 (4513 center-city-diner diner 3.0 107 petaluma-blvd-n petaluma
  sonoma-county bay-area)
 (4514 two-niner-diner diner 3.0 561 skyranch-rd petaluma sonoma-county
  bay-area)
 (4515 valley-diner diner 2.0 134 lystra-ct-ste-a sebastopol
  sonoma-county bay-area)
 (4516 diner-the diner 2.0 6476 washington-st yountville napa-county
  napa-valley)
 (4517 chubbies-diner diner 2.0 250 e-grand-ave south-san-francisco
  san-mateo-county bay-area)
 (4518 valley-diner diner 2.0 1725 clay-st san-francisco
  san-francisco-county bay-area)
 (4519 valley-diner diner 2.0 1951 ocean-ave san-francisco
  san-francisco-county bay-area)
 (4520 big-joes-no.-3 diner 2.8 1397 el-camino-real belmont
  san-mateo-county bay-area)
 (4521 bajis-down-the-street-cafe diner 2.3 0 old-middlefield
  mountain-view santa-clara-county bay-area)
 (4522 cozy-family-restaurant diner 2.3 2089 the-alameda san-jose
  santa-clara-county bay-area)
 (4523 buttercup-kitchen-family-restaurant diner 2.0 229 broadway
  oakland alameda-county bay-area)
 (4524 casa-orinda dinner 3.0 20 bryant-way orinda contra-costa-county
  bay-area)
 (4525 magic-edge-officers-club dinner 3.0 1625 shoreline-blvd.
  mountain-view santa-clara-county bay-area)
 (4526 julie-rings-heart-&-soul dinner 3.0 1695 st-clay san-francisco
  san-francisco-county bay-area)
 (4527 donut-works donuts 2.0 2334 s-shore-ctr alameda alameda-county
  bay-area)
 (4528 golden-pin-donuts donuts 2.0 1353 park-st alameda alameda-county
  bay-area)
 (4529 hometown-donuts donuts 2.0 1930 main-st alameda alameda-county
  bay-area)
 (4530 marina-village-donuts donuts 2.0 845 marina-village-pky alameda
  alameda-county bay-area)
 (4531 star-donut donuts 2.0 1608 webster-st alameda alameda-county
  bay-area)
 (4532 great-donut donuts 2.0 115 alamo-plz-no.-b alamo
  contra-costa-county bay-area)
 (4533 bazian-donut donuts 3.3 909 w-10th-st antioch
  contra-costa-county bay-area)
 (4534 chucks-donuts donuts 1.7 641 ralston-ave belmont
  san-mateo-county bay-area)
 (4535 cafe-neutron-bakery donuts 2.7 2124 center-st berkeley
  alameda-county bay-area)
 (4536 happy-donuts donuts 2.0 1041 gilman-st berkeley alameda-county
  bay-area)
 (4537 king-pin-donut-shop donuts 2.0 2468 telegraph-ave berkeley
  alameda-county bay-area)
 (4538 king-pin-donut-shop donuts 2.6 2521 durant-ave-ste-a berkeley
  alameda-county bay-area)
 (4539 peter-piper-donuts donuts 2.0 737 x2nd-st brentwood
  contra-costa-county bay-area)
 (4540 christys-donuts donuts 2.0 138 old-county-rd brisbane
  san-mateo-county bay-area)
 (4541 royal-donut donuts 2.0 1165 broadway burlingame san-mateo-county
  bay-area)
 (4542 daily-donut donuts 2.0 100 w-hamilton-ave campbell
  santa-clara-county bay-area)
 (4543 maple-leaf-donuts donuts 2.0 2329 winchester-blvd campbell
  santa-clara-county bay-area)
 (4544 toms-donut-shop donuts 2.0 2006 winchester-blvd campbell
  santa-clara-county bay-area)
 (4545 donut-station donuts 2.0 715 capitola-ave-no.-a capitola unknown
  bay-area)
 (4546 forty-first-donut-house donuts 2.0 1550 x41st-ave capitola
  unknown bay-area)
 (4547 lees-donuts donuts 2.0 22319 redwood-rd castro-valley
  alameda-county bay-area)
 (4548 rudys-donut-house donuts 2.8 3692 castro-valley-blvd
  castro-valley alameda-county bay-area)
 (4549 allstar-donuts donuts 2.0 1900 monument-blvd concord
  contra-costa-county bay-area)
 (4550 allstar-donuts donuts 2.0 4375 clayton-rd concord
  contra-costa-county bay-area)
 (4551 best-little-donut-house-in-town donuts 2.7 1821 east-st concord
  contra-costa-county bay-area)
 (4552 chicks-donut-shop donuts 2.3 1801 willow-pass-rd concord
  contra-costa-county bay-area)
 (4553 kings-donuts donuts 2.0 3413 chestnut-ave concord
  contra-costa-county bay-area)
 (4554 donut-house donuts 2.0 7335 bollinger-rd-no.-a cupertino
  santa-clara-county bay-area)
 (4555 donut-wheel donuts 2.7 10250 n-de-anza-blvd cupertino
  santa-clara-county bay-area)
 (4556 manleys-donut donuts 2.0 10991 n-de-anza-blvd cupertino
  santa-clara-county bay-area)
 (4557 jelly-donut donuts 2.3 56 san-pedro-rd daly-city
  san-mateo-county bay-area)
 (4558 royal-donut donuts 2.0 210 skyline-plz daly-city
  san-mateo-county bay-area)
 (4559 sugar-bowl-bakery-&-donuts donuts 2.0 5999 mission-st daly-city
  san-mateo-county bay-area)
 (4560 doughboys-donuts donuts 2.3 7867 amador-valley-blvd dublin
  alameda-county bay-area)
 (4561 johnnys-donuts donuts 2.0 7355 village-pky dublin alameda-county
  bay-area)
 (4562 manleys-donut donuts 2.0 1940 university-ave-no.-b
  east-palo-alto san-mateo-county bay-area)
 (4563 hunts-quality-donuts donuts 2.0 290 el-cerrito-plz el-cerrito
  contra-costa-county bay-area)
 (4564 royal-jelly-donuts donuts 2.0 1430 n-texas-st fairfield
  solano-county bay-area)
 (4565 the-donut-wheel donuts 2.0 2629 n-texas-st fairfield
  solano-county bay-area)
 (4566 the-jelly-donut donuts 2.0 1615 w-texas-st fairfield
  solano-county bay-area)
 (4567 brads-donut-kitchen donuts 2.0 34390 fremont-blvd fremont
  alameda-county bay-area)
 (4568 brads-donut-kitchen donuts 2.0 34390 fremont-blvd fremont
  alameda-county bay-area)
 (4569 donut-kettle donuts 2.0 46850 warm-springs-blvd fremont
  alameda-county bay-area)
 (4570 donuts-house donuts 2.0 46625 mission-blvd fremont
  alameda-county bay-area)
 (4571 francis-donut donuts 2.0 41031 fremont-blvd fremont
  alameda-county bay-area)
 (4572 francis-donut-shop donuts 2.0 41031 fremont-blvd fremont
  alameda-county bay-area)
 (4573 francis-donuts donuts 2.0 4374 thornton-ave fremont
  alameda-county bay-area)
 (4574 lloyds-donut-kitchen donuts 3.0 5200 mowry-ave fremont
  alameda-county bay-area)
 (4575 maple-leaf-donuts donuts 2.0 41200 blacow-rd fremont
  alameda-county bay-area)
 (4576 mission-valley-donuts donuts 2.0 39975 mission-blvd fremont
  alameda-county bay-area)
 (4577 niles-donut donuts 2.0 38003 mission-blvd fremont alameda-county
  bay-area)
 (4578 vasy-donut-shop donuts 2.3 3942 washington-blvd fremont
  alameda-county bay-area)
 (4579 ohenry-donut donuts 2.0 401 e-10th-st gilroy santa-clara-county
  bay-area)
 (4580 winchells-donut-house donuts 2.0 705 x1st-st gilroy
  santa-clara-county bay-area)
 (4581 sunshine-donuts donuts 3.0 80 cabrillo-hwy-n-ste-p half-moon-bay
  san-mateo-county bay-area)
 (4582 dolphin-donut donuts 2.0 669 w-tennyson-rd hayward
  alameda-county bay-area)
 (4583 donut-express donuts 2.0 430 winton-ave hayward alameda-county
  bay-area)
 (4584 donut-express donuts 2.0 214 harder-rd-no.-a hayward
  alameda-county bay-area)
 (4585 donut-factory donuts 2.0 790 jackson-st hayward alameda-county
  bay-area)
 (4586 edna-donut-by-george donuts 2.3 113 w-tennyson-rd hayward
  alameda-county bay-area)
 (4587 fairway-park-donuts donuts 2.0 31125 mission-blvd hayward
  alameda-county bay-area)
 (4588 fashion-island-doughnuts donuts 2.0 12 southland-mall hayward
  alameda-county bay-area)
 (4589 garrys-donuts donuts 2.0 990 b-st hayward alameda-county
  bay-area)
 (4590 great-donut donuts 2.0 30048 mission-blvd-ste-132 hayward
  alameda-county bay-area)
 (4591 happy-doughnuts donuts 2.0 27451 industrial-blvd hayward
  alameda-county bay-area)
 (4592 lees-donuts-4-&-lees-donuts donuts 2.0 21471 foothill-blvd-no.-c
  hayward alameda-county bay-area)
 (4593 pixie-donuts donuts 2.0 27072 hesperian-blvd hayward
  alameda-county bay-area)
 (4594 stanly-donuts donuts 2.0 20942 mission-blvd hayward
  alameda-county bay-area)
 (4595 sunrise-donuts donuts 2.0 505 st hayward alameda-county
  bay-area)
 (4596 tommys-master-donut donuts 2.0 21863 foothill-blvd hayward
  alameda-county bay-area)
 (4597 world-fare-donuts donuts 2.0 20770 hesperian-blvd hayward
  alameda-county bay-area)
 (4598 mrs-gs-donuts donuts 2.0 844 willow-ave-ste-a-10 hercules
  contra-costa-county bay-area)
 (4599 donut-&-deli donuts 2.0 321 san-felipe-rd-no.-4 hollister
  san-benito-county northern-california)
 (4600 jessie-donut-house donuts 2.0 191 san-felipe-rd hollister
  san-benito-county northern-california)
 (4601 sweet-donuts donuts 2.0 500 tres-pinos-rd hollister
  san-benito-county northern-california)
 (4602 johnnys-donuts donuts 2.0 3629 mount-diablo-blvd lafayette
  contra-costa-county bay-area)
 (4603 best-donuts donuts 2.7 859 e-stanley-blvd livermore
  alameda-county bay-area)
 (4604 donut-wheel donuts 2.7 2017 x1st-st livermore alameda-county
  bay-area)
 (4605 springtown-donuts donuts 2.0 945 bluebell-dr livermore
  alameda-county bay-area)
 (4606 lucky-donuts donuts 2.0 108 state-st los-altos
  santa-clara-county bay-area)
 (4607 best-donuts donuts 2.0 14150 blossom-hill-rd los-gatos
  santa-clara-county bay-area)
 (4608 maple-leaf-donut donuts 2.0 540 n-santa-cruz-ave-no.-j los-gatos
  santa-clara-county bay-area)
 (4609 sk-donuts-shop donuts 2.0 1440 pollard-rd los-gatos
  santa-clara-county bay-area)
 (4610 the-donut-hole donuts 2.0 15708 los-gatos-blvd los-gatos
  santa-clara-county bay-area)
 (4611 mr-mom-donuts donuts 2.0 516 center-ave martinez
  contra-costa-county bay-area)
 (4612 sunrise-donut donuts 2.3 1160 arnold-dr-ste-c martinez
  contra-costa-county bay-area)
 (4613 donut-depot donuts 2.0 3383 middlefield-rd menlo-park
  san-mateo-county bay-area)
 (4614 menlo-donut-&-ice-cream donuts 2.0 1170 alma-st menlo-park
  san-mateo-county bay-area)
 (4615 sams-donuts donuts 2.0 180 el-camino-real millbrae
  san-mateo-county bay-area)
 (4616 beths-donut-shop donuts 2.0 263 w-calaveras-blvd milpitas
  santa-clara-county bay-area)
 (4617 christys-donuts donuts 2.0 1291 e-calaveras-blvd milpitas
  santa-clara-county bay-area)
 (4618 donut-basket donuts 2.0 242 n-abel-st milpitas
  santa-clara-county bay-area)
 (4619 donut-basket donuts 2.0 1559 landess-ave milpitas
  santa-clara-county bay-area)
 (4620 lombados-donuts donuts 3.0 219 w-main-ave morgan-hill
  santa-clara-county bay-area)
 (4621 ohenry-donut donuts 3.2 500 vineyard-town-ctr morgan-hill
  santa-clara-county bay-area)
 (4622 donut-basket donuts 2.0 2105 old-middlefield-way mountain-view
  santa-clara-county bay-area)
 (4623 donut-den donuts 2.0 1350 grant-rd mountain-view
  santa-clara-county bay-area)
 (4624 donuts-field donuts 2.0 1969 latham-st-apt-34 mountain-view
  santa-clara-county bay-area)
 (4625 olivari-donuts donuts 2.3 856 w-el-camino-real mountain-view
  santa-clara-county bay-area)
 (4626 coopers-donuts donuts 2.0 34916 newark-blvd newark
  alameda-county bay-area)
 (4627 dees-donuts-&-coffee donuts 2.0 36601 newark-blvd-no.-15 newark
  alameda-county bay-area)
 (4628 donut-world donuts 2.0 2085 newpark-mall newark alameda-county
  bay-area)
 (4629 mowry-donut donuts 2.0 5970 mowry-ave-ste-m newark
  alameda-county bay-area)
 (4630 penny-donut-shop donuts 2.0 39982 cedar-blvd newark
  alameda-county bay-area)
 (4631 baughmans-donut-shop donuts 2.0 818 jefferson-st oakland
  alameda-county bay-area)
 (4632 dicks-donuts donuts 2.0 3417 high-st oakland alameda-county
  bay-area)
 (4633 donut-corner donuts 2.0 3401 macarthur-blvd oakland
  alameda-county bay-area)
 (4634 donuts-&-thing donuts 2.0 3655 piedmont-ave-ste-1 oakland
  alameda-county bay-area)
 (4635 donuts-n-subs donuts 2.0 1460 x7th-st oakland alameda-county
  bay-area)
 (4636 fairway-pk-donut-shop-restaurant-bakery donuts 2.0 411 e-18th-st
  oakland alameda-county bay-area)
 (4637 golden-fluff-donuts donuts 2.0 4054 piedmont-ave oakland
  alameda-county bay-area)
 (4638 grand-donuts donuts 2.0 3249 grand-ave oakland alameda-county
  bay-area)
 (4639 great-donut donuts 2.0 1967 telegraph-ave oakland alameda-county
  bay-area)
 (4640 lees-donuts donuts 2.0 1448 high-st oakland alameda-county
  bay-area)
 (4641 lees-donuts donuts 2.0 4013 telegraph-ave-no.-d oakland
  alameda-county bay-area)
 (4642 lees-donuts donuts 2.0 4496 broadway oakland alameda-county
  bay-area)
 (4643 maly-donuts-&-ice-cream-&-burg donuts 2.0 144 x14th-st oakland
  alameda-county bay-area)
 (4644 queen-donuts donuts 2.0 592 x59th-st-apt-8 oakland
  alameda-county bay-area)
 (4645 silver-yuen-donut-shop donuts 2.0 1420 x3rd-ave oakland
  alameda-county bay-area)
 (4646 star-donuts donuts 2.0 2141 macarthur-blvd oakland
  alameda-county bay-area)
 (4647 giant-donuts-&-ice-cream donuts 2.0 2059 main-st oakley
  contra-costa-county bay-area)
 (4648 donut-time donuts 2.0 1235 linda-mar-blvd pacifica
  san-mateo-county bay-area)
 (4649 bobs-donuts donuts 2.0 3439 alma-st palo-alto santa-clara-county
  bay-area)
 (4650 moms-donuts donuts 2.0 636 bailey-rd pittsburg
  contra-costa-county bay-area)
 (4651 diablo-donuts donuts 2.0 1968 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (4652 donut-king donuts 2.0 1607 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (4653 donut-king donuts 2.0 1807 santa-rita-rd pleasanton
  alameda-county bay-area)
 (4654 hacienda-donut donuts 2.0 3170 santa-rita-rd-no.-a1 pleasanton
  alameda-county bay-area)
 (4655 heritage-donuts donuts 2.0 5480 sunol-blvd-ste-6 pleasanton
  alameda-county bay-area)
 (4656 the-jelly-donut donuts 2.5 2897 hopyard-rd pleasanton
  alameda-county bay-area)
 (4657 chucks-donuts donuts 3.0 801 woodside-rd redwood-city
  san-mateo-county bay-area)
 (4658 chucks-donut donuts 2.0 801 woodside-rd redwood-city
  san-mateo-county bay-area)
 (4659 fashion-island-doughnuts donuts 2.0 1310 madison-ave
  redwood-city san-mateo-county bay-area)
 (4660 fashion-island-doughnuts donuts 2.0 1330 el-camino-real
  redwood-city san-mateo-county bay-area)
 (4661 fashion-island-doughnuts donuts 2.0 204 franklin-st redwood-city
  san-mateo-county bay-area)
 (4662 nuris-donut-house donuts 2.0 416 el-camino-real redwood-city
  san-mateo-county bay-area)
 (4663 andys-donut-stop donuts 2.0 971 x23rd-st richmond
  contra-costa-county bay-area)
 (4664 donut-works donuts 2.0 2127 hilltop-mall-rd richmond
  contra-costa-county bay-area)
 (4665 mira-vista-donut-and-deli donuts 2.0 12221 san-pablo-ave-ste-1
  richmond contra-costa-county bay-area)
 (4666 margies-house-of-donuts donuts 2.0 673 parker-ave rodeo unknown
  unknown)
 (4667 donut-king donuts 2.0 504 grand-ave south-san-francisco
  san-mateo-county bay-area)
 (4668 chucks-donuts donuts 2.0 495 old-county-rd san-carlos
  san-mateo-county bay-area)
 (4669 wild-bills-donuts donuts 2.3 855 el-camino-real san-carlos
  san-mateo-county bay-area)
 (4670 bascom-donuts donuts 2.0 3966 bascom-ave san-jose
  santa-clara-county bay-area)
 (4671 brooks-donut donuts 2.0 1825 phelan-ct san-jose
  santa-clara-county bay-area)
 (4672 chaus-donut donuts 2.0 1631 e-capitol-expy-no.-104 san-jose
  santa-clara-county bay-area)
 (4673 christys-donut donuts 2.0 1150 n-capitol-ave san-jose
  santa-clara-county bay-area)
 (4674 city-donuts donuts 2.0 2910 stevens-creek-blvd san-jose
  santa-clara-county bay-area)
 (4675 daily-donuts donuts 2.0 6233 santa-teresa-blvd san-jose
  santa-clara-county bay-area)
 (4676 daily-donuts donuts 2.0 1913 pocoway-no.2 san-jose
  santa-clara-county bay-area)
 (4677 dawn-donut donuts 2.0 1020 s-white-rd-no.-g san-jose
  santa-clara-county bay-area)
 (4678 denises-donut-shop donuts 2.0 4134 monterey-hwy san-jose
  santa-clara-county bay-area)
 (4679 donut-basket donuts 2.0 1705 branham-ln-no.-b1 san-jose
  santa-clara-county bay-area)
 (4680 donut-basket donuts 2.0 461 blossom-hill-rd-no.-o san-jose
  santa-clara-county bay-area)
 (4681 donut-basket donuts 2.0 5175 moorpark-ave-no.-1 san-jose
  santa-clara-county bay-area)
 (4682 donut-basket donuts 2.0 4161 hamilton-ave san-jose
  santa-clara-county bay-area)
 (4683 donut-basket donuts 2.0 2848 s-white-rd san-jose
  santa-clara-county bay-area)
 (4684 donut-express donuts 2.0 389 n-capitol-ave san-jose
  santa-clara-county bay-area)
 (4685 donut-king donuts 2.0 1409 bird-ave-no.-e san-jose
  santa-clara-county bay-area)
 (4686 donut-works donuts 2.0 1531 hallbrook-dr san-jose
  santa-clara-county bay-area)
 (4687 dunkin-donuts donuts 2.0 3605 union-ave san-jose
  santa-clara-county bay-area)
 (4688 fresh-donut-&-muffin-shop donuts 2.0 1320 saratoga-ave san-jose
  santa-clara-county bay-area)
 (4689 georges-donuts donuts 2.0 4630 meridian-ave san-jose
  santa-clara-county bay-area)
 (4690 golden-lite-donuts donuts 2.0 1731 w-san-carlos-st san-jose
  santa-clara-county bay-area)
 (4691 honey-o-cream-donut donuts 2.0 4472 pearl-ave san-jose
  santa-clara-county bay-area)
 (4692 hooz-donuts donuts 2.0 3011 meridian-ave san-jose
  santa-clara-county bay-area)
 (4693 hooz-donuts donuts 2.0 2229 lincoln-ave san-jose
  santa-clara-county bay-area)
 (4694 jackson-donuts donuts 2.0 140 s-jackson-ave san-jose
  santa-clara-county bay-area)
 (4695 jelly-donuts donuts 2.0 2665 cropley-ave san-jose
  santa-clara-county bay-area)
 (4696 jim-donuts-shop donuts 2.0 2180 moorpark-ave san-jose
  santa-clara-county bay-area)
 (4697 kingberry-donut-shop donuts 2.0 2595 amaryl-dr san-jose
  santa-clara-county bay-area)
 (4698 manley-donut donuts 2.0 2590 s-bascom-ave san-jose
  santa-clara-county bay-area)
 (4699 manley-donut donuts 2.0 1592 meridian-ave san-jose
  santa-clara-county bay-area)
 (4700 manleys-donut donuts 2.0 5721 camden-ave san-jose
  santa-clara-county bay-area)
 (4701 maple-leaf-donut-shop donuts 2.0 1110 saratoga-ave san-jose
  santa-clara-county bay-area)
 (4702 maple-leaf-donuts donuts 2.0 6473 almaden-expy san-jose
  santa-clara-county bay-area)
 (4703 maple-leaf-donuts donuts 2.0 6473 almaden-expy san-jose
  santa-clara-county bay-area)
 (4704 o-henry-donut donuts 2.0 5709 cottle-rd san-jose
  santa-clara-county bay-area)
 (4705 queens-donut donuts 2.0 196 race-st san-jose santa-clara-county
  bay-area)
 (4706 rolfs-sputniks-&-donuts donuts 2.0 1093 foxworthy-ave san-jose
  santa-clara-county bay-area)
 (4707 rollos-donut donuts 2.0 602 n-13th-st san-jose
  santa-clara-county bay-area)
 (4708 sams-donuts donuts 2.0 6047 snell-ave san-jose
  santa-clara-county bay-area)
 (4709 tasty-donuts donuts 2.0 485 saratoga-ave san-jose
  santa-clara-county bay-area)
 (4710 tully-donuts donuts 2.0 1663 tully-rd san-jose
  santa-clara-county bay-area)
 (4711 winchells-donuts donuts 2.0 282 checkers-dr san-jose
  santa-clara-county bay-area)
 (4712 world-donut-&-ice-cream donuts 2.0 2758 aborn-rd san-jose
  santa-clara-county bay-area)
 (4713 yum-yum-donut donuts 2.0 1090 meridian-ave san-jose
  santa-clara-county bay-area)
 (4714 donut-express donuts 2.0 14393 washington-ave san-leandro
  alameda-county bay-area)
 (4715 donut-works donuts 2.0 0 cascades-bayfair-mall san-leandro
  alameda-county bay-area)
 (4716 jimmys-donut-&-pastries donuts 2.0 699 lewelling-blvd-ste-174
  san-leandro alameda-county bay-area)
 (4717 lees-donut donuts 2.0 1252 davis-st san-leandro alameda-county
  bay-area)
 (4718 lucky-donuts donuts 2.0 565 dutton-ave san-leandro
  alameda-county bay-area)
 (4719 mings-donuts donuts 2.0 13996 doolittle-dr san-leandro
  alameda-county bay-area)
 (4720 slikkers-donut donuts 2.0 1321 macarthur-blvd san-leandro
  alameda-county bay-area)
 (4721 sun-donuts donuts 2.0 15032 farnsworth-st san-leandro
  alameda-county bay-area)
 (4722 sunshine-donuts donuts 2.0 2160 e-14th-st san-leandro
  alameda-county bay-area)
 (4723 lees-donuts donuts 2.0 35 e-lewelling-blvd san-lorenzo
  alameda-county bay-area)
 (4724 chez-nicole-donuts donuts 2.0 1332 w-hillsdale-blvd san-mateo
  san-mateo-county bay-area)
 (4725 christine-donut donuts 2.0 29 laurie-meadows-dr san-mateo
  san-mateo-county bay-area)
 (4726 fashion-island-doughnuts donuts 2.0 1101 s-el-camino-real
  san-mateo san-mateo-county bay-area)
 (4727 granmas-donuts donuts 2.0 501 s-b-st san-mateo san-mateo-county
  bay-area)
 (4728 hunts-quality-donuts donuts 2.0 44 hillsdale-mall san-mateo
  san-mateo-county bay-area)
 (4729 wild-bills-donuts donuts 2.7 1500 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (4730 dam-good-donuts donuts 2.0 14401 san-pablo-ave-no.-b san-pablo
  contra-costa-county bay-area)
 (4731 danny-boy-donut-pastrie-&-deli donuts 2.0 13830
  san-pablo-ave-no.-i san-pablo contra-costa-county bay-area)
 (4732 ohenry-donuts donuts 2.0 13501 san-pablo-ave-ste-d san-pablo
  contra-costa-county bay-area)
 (4733 ohenry-donuts donuts 2.0 13501 san-pablo-ave-ste-i san-pablo
  contra-costa-county bay-area)
 (4734 best-donuts donuts 2.0 2217 san-ramon-valley-blvd-no.-k
  san-ramon contra-costa-county bay-area)
 (4735 digbys-donut donuts 2.7 429 market-pl san-ramon
  contra-costa-county bay-area)
 (4736 donut-&-things donuts 2.0 3325 montevideo-dr san-ramon
  contra-costa-county bay-area)
 (4737 best-donuts donuts 2.0 24 washington-st santa-clara
  santa-clara-county bay-area)
 (4738 donut-den donuts 2.0 2482 de-la-cruz-blvd santa-clara
  santa-clara-county bay-area)
 (4739 donut-den donuts 2.0 2915 el-camino-real santa-clara
  santa-clara-county bay-area)
 (4740 donuts-kettle donuts 2.0 3630 macgregor-ln santa-clara
  santa-clara-county bay-area)
 (4741 king-donut donuts 2.0 1401 el-camino-real-no.-1a santa-clara
  santa-clara-county bay-area)
 (4742 maple-leaf-donuts donuts 2.0 1795 scott-blvd-no.-104 santa-clara
  santa-clara-county bay-area)
 (4743 palm-donuts donuts 2.3 341 lafayette-st-ste-100 santa-clara
  santa-clara-county bay-area)
 (4744 stans-donut-shop donuts 3.3 2628 homestead-rd santa-clara
  santa-clara-county bay-area)
 (4745 allbrights-donuts donuts 2.0 1055 water-st santa-cruz
  santa-cruz-county bay-area)
 (4746 cefiross-donuts donuts 3.0 1222 mission-st santa-cruz
  santa-cruz-county bay-area)
 (4747 ferrells-donut-house donuts 2.0 1403 ocean-st santa-cruz
  santa-cruz-county bay-area)
 (4748 ferrells-donuts donuts 1.7 2227 mission-st santa-cruz
  santa-cruz-county bay-area)
 (4749 donut-kettle donuts 2.0 872 old-san-francisco-rd sunnyvale
  santa-clara-county bay-area)
 (4750 donut-shop donuts 2.0 110 s-sunnyvale-ave sunnyvale
  santa-clara-county bay-area)
 (4751 lawrence-donuts donuts 2.0 1133 n-lawrence-expy sunnyvale
  santa-clara-county bay-area)
 (4752 martys-donuts donuts 2.0 350 w-maude-ave sunnyvale
  santa-clara-county bay-area)
 (4753 amys-donut donuts 2.0 1812 whipple-rd union-city alameda-county
  bay-area)
 (4754 dees-bakery-&-donuts donuts 2.0 33354 alvarado-niles-rd
  union-city alameda-county bay-area)
 (4755 donut-delight donuts 2.0 34554 alvarado-niles-rd union-city
  alameda-county bay-area)
 (4756 happy-time-donut donuts 2.0 31876 alvarado-blvd union-city
  alameda-county bay-area)
 (4757 sk-donut-shop donuts 2.0 32102 alvarado-blvd union-city
  alameda-county bay-area)
 (4758 u-c-donuts-&-deli donuts 2.0 31080 union-city-blvd-ste-101
  union-city alameda-county bay-area)
 (4759 yum-yum-donut-franchise-613 donuts 2.0 34332 alvarado-niles-rd
  union-city alameda-county bay-area)
 (4760 yum-yum-donut-franchise-613b donuts 2.0 34332 alvarado-niles-rd
  union-city alameda-county bay-area)
 (4761 arthurs-donuts donuts 2.0 3718 sonoma-blvd vallejo solano-county
  bay-area)
 (4762 doughboy-donuts donuts 2.0 1601 marine-world-pky-no.-28 vallejo
  solano-county bay-area)
 (4763 royal-jelly-donuts donuts 2.0 2180 springs-rd vallejo
  solano-county bay-area)
 (4764 the-jelly-donut donuts 2.0 7 flemingtown-ctr vallejo
  solano-county bay-area)
 (4765 als-donuts donuts 2.0 1830 tice-valley-blvd walnut-creek
  contra-costa-county bay-area)
 (4766 als-donuts donuts 2.0 1830 tice-valley-blvd walnut-creek
  contra-costa-county bay-area)
 (4767 flaky-cream-donut-shop donuts 2.0 1358 n-main-st walnut-creek
  contra-costa-county bay-area)
 (4768 winchells-donut-house donuts 2.0 301 e-lake-ave watsonville
  santa-cruz-county bay-area)
 (4769 tonys-donut-shop donuts 2.0 250 grand-ave south-san-francisco
  san-mateo-county bay-area)
 (4770 winchells-donut-house donuts 2.0 2647 blanding-ave alameda
  alameda-county bay-area)
 (4771 alameda-golf-course-cktl-loung drinks 2.0 1
  clubhouse-memorial-rd alameda alameda-county bay-area)
 (4772 buckhorn-lounge drinks 3.0 1301 park-st alameda alameda-county
  bay-area)
 (4773 clancys-restaurant-&-bar drinks 2.0 104 dahlia-dr alameda
  alameda-county bay-area)
 (4774 driftwood-bar-&-coffee-house drinks 2.5 1313 park-st-no.-1315
  alameda alameda-county bay-area)
 (4775 exchange-bar drinks 2.0 1436 webster-st alameda alameda-county
  bay-area)
 (4776 fireside-lounge drinks 2.0 1453 webster-st-no.-a alameda
  alameda-county bay-area)
 (4777 mc-graths-irish-pub drinks 2.0 1539 lincoln-ave alameda
  alameda-county bay-area)
 (4778 oryans-island-city-tavern drinks 2.7 1611 minturn-st alameda
  alameda-county bay-area)
 (4779 shamrock-irish-pub drinks 2.0 1403 webster-st alameda
  alameda-county bay-area)
 (4780 the-buckhorn drinks 2.0 1301 park-st alameda alameda-county
  bay-area)
 (4781 time-out-lounge drinks 2.0 1710 lincoln-ave alameda
  alameda-county bay-area)
 (4782 youngs-cocktail-lounge drinks 2.0 1207 lincoln-ave alameda
  alameda-county bay-area)
 (4783 sidelines-sport-bar/brill-rstr drinks 2.0 2169 nelda-way alamo
  contra-costa-county bay-area)
 (4784 hotsy-totsy drinks 2.0 601 san-pablo-ave albany alameda-county
  bay-area)
 (4785 allstar-sports-bar-&-grill drinks 2.0 1004 fitzuren-rd antioch
  contra-costa-county bay-area)
 (4786 blus-club drinks 2.0 720 w-2nd-st antioch contra-costa-county
  bay-area)
 (4787 corner-club drinks 2.0 309 h-st antioch contra-costa-county
  bay-area)
 (4788 lous-bar drinks 2.0 701 a-st antioch contra-costa-county
  bay-area)
 (4789 new-wheel-lounge drinks 2.0 1615 st antioch contra-costa-county
  bay-area)
 (4790 nineteenth-hole drinks 2.0 2746 w-tregallas-rd antioch
  contra-costa-county bay-area)
 (4791 potatoe-barge drinks 2.3 105 f-st antioch contra-costa-county
  bay-area)
 (4792 puchs-pub drinks 2.0 992 fitzuren-rd antioch contra-costa-county
  bay-area)
 (4793 sherrys-cocktail-lounge drinks 2.0 400 calle-del-sol aptos
  santa-cruz-county bay-area)
 (4794 blakes-on-telegraph drinks 2.3 2367 telegraph-ave berkeley
  alameda-county bay-area)
 (4795 castro-st-bar-&-grill drinks 2.7 174 castro-st mountain-view
  santa-clara-county bay-area)
 (4796 charles-bar-&-grill drinks 2.0 1984 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (4797 joes-bar-&-grill drinks 2.0 1460 oakland-rd san-jose
  santa-clara-county bay-area)
 (4798 san-jose-tied-house drinks 3.3 0 unknown san-jose
  santa-clara-county bay-area)
 (4799 duffys-sports-cafe drinks 2.0 219 mount-hermon-rd-no.-b&c
  scotts-valley unknown bay-area)
 (4800 x41-st-yard-line-bar-&-grill drinks 2.0 2621 x41st-ave soquel
  unknown bay-area)
 (4801 feedlot drinks 2.8 6971 airline-hwy. tres-pinos unknown unknown)
 (4802 skyline-bar-&-grill drinks 2.0 17285 skyline-blvd woodside
  san-mateo-county bay-area)
 (4803 carrs-drive-in drive-in 2.0 6533 covey-rd forestville
  sonoma-county bay-area)
 (4804 supreme-drive-inn drive-in 2.0 7260 healdsburg-ave sebastopol
  sonoma-county bay-area)
 (4805 mels-drive-in drive-in 2.0 0 boulevard san-francisco
  san-francisco-county bay-area)
 (4806 haute-stuff eclectic 2.5 521 main-st. martinez
  contra-costa-county bay-area)
 (4807 pee-wee-muldoons eclectic 3.0 8065 brentwood-blvd. brentwood
  contra-costa-county bay-area)
 (4808 catahoula-restaurant-and-saloon eclectic 2.7 1457 lincoln-ave
  calistoga napa-county napa-valley)
 (4817 massawa ethiopian 3.4 1538 haight-st san-francisco
  san-francisco-county bay-area)
 (4809 sahari egyptian 3.4 126 e.-fremont-ave sunnyvale
  santa-clara-county bay-area)
 (4810 ethiopia-restaurant ethiopian 3.2 2955 telegraph-ave berkeley
  alameda-county bay-area)
 (4811 addis-ethiopian-restaurant ethiopian 2.5 6100 telegraph-ave
  oakland alameda-county bay-area)
 (4812 asmara-restaurant ethiopian 3.3 5020 telegraph-ave oakland
  alameda-county bay-area)
 (4813 ethiopian-restaurant-rasselas ethiopian 3.0 2801 california
  san-francisco san-francisco-county bay-area)
 (4814 the-blue-nile ethiopian 3.3 0 and-dwight berkeley alameda-county
  bay-area)
 (4815 gojo ethiopian 2.8 1261 w.-san-carlos-st san-jose
  santa-clara-county bay-area)
 (4816 nyala-restaurant ethiopian 3.0 39 grove-st san-francisco
  san-francisco-county bay-area)
 (4818 cafe-mozart european 3.6 708 bush-st san-francisco
  san-francisco-county bay-area)
 (4819 anton-&-michel european 3.0 0 between-ocean-and-7th carmel
  monterey-county monterey)
 (4820 crustacean european 2.0 2545 polk-st. san-francisco
  san-francisco-county bay-area)
 (4821 hot-dog-on-a-stick fast-food 2.0 1855 x41st-ave-ste-r-2 capitola
  unknown bay-area)
 (4822 kentucky-fried-chicken fast-food 2.0 2120 x41st-ave capitola
  unknown bay-area)
 (4823 alidos-ii-fast-food-restaurant fast-food 2.0 2729 mission-st
  san-francisco san-francisco-county bay-area)
 (4824 chinese-fast-food fast-food 2.0 3771 mission-st san-francisco
  san-francisco-county bay-area)
 (4825 dragons-fast-food-restaurant fast-food 2.0 307 kearny-st
  san-francisco san-francisco-county bay-area)
 (4826 russells-fast-food fast-food 2.0 333 market-st san-francisco
  san-francisco-county bay-area)
 (4827 shandy-chinese-fast-food fast-food 3.0 211 kearny-st
  san-francisco san-francisco-county bay-area)
 (4828 mr-chaus fast-food 2.0 1072 s.-saratoga/sunnyvale cupertino
  santa-clara-county bay-area)
 (4829 mr-chaus fast-food 2.0 1384 lincoln-ave san-jose
  santa-clara-county bay-area)
 (4830 mcdonalds fast-food 2.0 125 monterey-rd. pacifica
  san-mateo-county bay-area)
 (4831 taco-bell fast-food 2.0 535 oceana-blvd. pacifica
  san-mateo-county bay-area)
 (4832 taco-bell fast-food 2.0 5200 coast-hwy. pacifica
  san-mateo-county bay-area)
 (4833 camelot-fish-&-chips fast-food 3.3 nil nil pacifica
  san-mateo-county bay-area)
 (4834 x3-stars-filipino-chinese-rest filipino 2.0 323 s-mayfair-ave
  daly-city san-mateo-county bay-area)
 (4835 maharlika-filipino-fast-foods filipino 2.7 7367 mission-st
  daly-city san-mateo-county bay-area)
 (4836 maharlika-restaurant filipino 2.0 3671 thornton-ave fremont
  alameda-county bay-area)
 (4837 ronalds-kamayan filipino 2.0 2670 seeley-rd. milpitas
  santa-clara-county bay-area)
 (4838 goldilocks-bake-shop filipino 2.7 3565 callan-blvd
  south-san-francisco san-mateo-county bay-area)
 (4839 solita filipino 2.3 120 hazelwood-dr south-san-francisco
  san-mateo-county bay-area)
 (4840 kenkoys-diner filipino 2.0 54 mint san-francisco
  san-francisco-county bay-area)
 (4841 philippine-restaurant filipino 2.0 3619 balboa san-francisco
  san-francisco-county bay-area)
 (4842 the-house-of-lumpia filipino 2.0 380 bush san-francisco
  san-francisco-county bay-area)
 (4843 filipiniana-cuisine filipino 2.0 2855 sierra-rd san-jose
  santa-clara-county bay-area)
 (4844 filipino-food-outlet filipino 2.0 1154 story-rd san-jose
  santa-clara-county bay-area)
 (4845 ling-nam-noodle-house filipino 2.0 2211
  gellert-boulevard-gellert-square south-san-francisco san-mateo-county
  bay-area)
 (4846 barrio-fiesta filipino 2.3 1790 milmont-drive milpitas
  santa-clara-county bay-area)
 (4847 mamon-luk filipino 2.0 0 unknown daly-city san-mateo-county
  bay-area)
 (4848 toppings filipino 2.8 0 right-next-door-to-ling-nam daly-city
  san-mateo-county bay-area)
 (4849 ongpin-noodle-house-and-restaurant filipino 3.0 73 camaritas-ave
  south-san-francisco san-mateo-county bay-area)
 (4850 filipino-buffet filipino 3.0 1621 n.-capitol-avenue san-jose
  santa-clara-county bay-area)
 (4851 maxs-of-the-philippines filipino 2.7 1155 el-camino-real
  south-san-francisco san-mateo-county bay-area)
 (4852 the-stewart-house fine-intercontinental 3.6 124 bank-st
  grass-valley nil nil)
 (4853 fondue-fred fondue 2.9 2556 telegraph-ave berkeley
  alameda-county bay-area)
 (4854 anh-hong-restaurant fondue 2.3 0 unknown san-jose
  santa-clara-county bay-area)
 (4855 la-fondue fondue 4.2 14510 big-basin-way saratoga
  santa-clara-county bay-area)
 (4856 le-bouc french 2.7 2424 lincoln-ave alameda alameda-county
  bay-area)
 (4857 chez-renee french 3.1 9051 soquel-dr aptos santa-cruz-county
  bay-area)
 (4858 au-coquelet french 2.6 2000 university-ave berkeley
  alameda-county bay-area)
 (4859 le-bateau-ivre french 2.8 2629 telegraph-ave berkeley
  alameda-county bay-area)
 (4860 lescargot french 3.4 1137 california-dr burlingame
  san-mateo-county bay-area)
 (4861 cafe-de-paris french 2.8 3407 blackhawk-plaza-cir danville
  contra-costa-county bay-area)
 (4862 la-belle-creole french 3.3 4090 san-pablo-ave emeryville
  alameda-county bay-area)
 (4863 le-chalet-restaurant french 2.0 3035 travis-blvd fairfield
  solano-county bay-area)
 (4864 le-maconnais-restaurant french 3.0 21181 foothill-blvd hayward
  alameda-county bay-area)
 (4865 le-maconnais-restaurant french 2.0 21181 foothill-blvd hayward
  alameda-county bay-area)
 (4866 rue-de-main french 3.7 22622 main-st hayward alameda-county
  bay-area)
 (4867 le-marquis french 3.2 3524 mount-diablo-blvd-no.-b lafayette
  contra-costa-county bay-area)
 (4868 tourelle-cafe-&-restaurant french 3.2 3565 mount-diablo-blvd
  lafayette contra-costa-county bay-area)
 (4869 cafe-marcella french 4.3 368 village-ln los-gatos
  santa-clara-county bay-area)
 (4870 pigalle french 2.7 27 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (4871 la-beaus french 2.0 436 ferry-st martinez contra-costa-county
  bay-area)
 (4872 le-pot-au-feu french 3.7 1149 el-camino-real menlo-park
  san-mateo-county bay-area)
 (4873 chez-maurice-restaurant french 2.8 360 park-st moraga unknown
  bay-area)
 (4874 chanterelle french 2.8 804 x1st-st napa napa-county napa-valley)
 (4875 la-boucane french 3.0 1778 x2nd-st napa napa-county napa-valley)
 (4876 chef-pauls french 3.5 4179 piedmont-ave oakland alameda-county
  bay-area)
 (4877 chez-simone french 2.3 4125 piedmont-ave oakland alameda-county
  bay-area)
 (4878 la-creme-de-la-creme french 3.9 5362 college-ave oakland
  alameda-county bay-area)
 (4879 nouveau-trattoria french 3.3 541 bryant-st palo-alto
  santa-clara-county bay-area)
 (4880 le-paradis french 2.0 2554 appian-way pinole contra-costa-county
  bay-area)
 (4881 la-rochelle french 2.4 348 saint-marys-st pleasanton
  alameda-county bay-area)
 (4882 j-french-cooks french 2.3 1754 laurel-st san-carlos
  san-mateo-county bay-area)
 (4883 adriatic-continental-and-seafood-cuisine french 2.0 0
  of-polk/washington san-francisco san-francisco-county bay-area)
 (4884 aioli-restaurants french 2.0 469 grant san-francisco
  san-francisco-county bay-area)
 (4885 amelios french 2.3 1630 powell san-francisco
  san-francisco-county bay-area)
 (4886 bistro-clovis french 2.5 1596 market san-francisco
  san-francisco-county bay-area)
 (4887 brasserie-tomo french 2.7 745 columbus-avenue san-francisco
  san-francisco-county bay-area)
 (4888 cafe-bastille french 3.3 22 belden san-francisco
  san-francisco-county bay-area)
 (4889 cafe-claude french 2.6 7 claude-lane san-francisco
  san-francisco-county bay-area)
 (4890 cafe-maisonnette french 3.0 315 x8th-avenue san-francisco
  san-francisco-county bay-area)
 (4891 fleur-de-lys french 3.6 777 sutter san-francisco
  san-francisco-county bay-area)
 (4892 fringale-restaurant french 3.8 570 x4th san-francisco
  san-francisco-county bay-area)
 (4893 janots french 2.7 44 campton-pl. san-francisco
  san-francisco-county bay-area)
 (4894 jeanne-darc french 2.8 715 bush san-francisco
  san-francisco-county bay-area)
 (4895 lentrecote-de-paris french 2.0 2032 union san-francisco
  san-francisco-county bay-area)
 (4896 lolivier-french-restaurant french 3.0 465 davis san-francisco
  san-francisco-county bay-area)
 (4897 la-belle-saison-restaurant french 2.3 200 x23rd-avenue
  san-francisco san-francisco-county bay-area)
 (4898 la-brasserie-francaise-restaurant french 2.3 3
  embarcadero-center san-francisco san-francisco-county bay-area)
 (4899 la-marmite-restaurant french 2.0 2415 clement san-francisco
  san-francisco-county bay-area)
 (4900 la-quiche-restaurant french 2.0 550 taylor san-francisco
  san-francisco-county bay-area)
 (4901 le-central-restaurant-brasserie french 3.3 453 bush
  san-francisco san-francisco-county bay-area)
 (4902 le-trou-restaurant-francais french 2.5 1007 guerrero
  san-francisco san-francisco-county bay-area)
 (4903 les-joulins-bistro french 2.0 44 ellis san-francisco
  san-francisco-county bay-area)
 (4904 lupanns french 2.8 4072 x18th-steet san-francisco
  san-francisco-county bay-area)
 (4905 luzern-restaurant french 2.3 1429 noriega san-francisco
  san-francisco-county bay-area)
 (4906 masas-restaurant french 4.5 648 bush san-francisco
  san-francisco-county bay-area)
 (4907 prevots french 2.0 400 dewey-blvd. san-francisco
  san-francisco-county bay-area)
 (4908 rue-lepic french 2.7 900 pine san-francisco san-francisco-county
  bay-area)
 (4909 sherman-house french 3.0 2160 green san-francisco
  san-francisco-county bay-area)
 (4910 ti-couz french 3.0 3108 x16th-st. san-francisco
  san-francisco-county bay-area)
 (4911 zazie french 2.8 941 cole-st san-francisco san-francisco-county
  bay-area)
 (4912 cafe-les-amis french 2.0 2030 admiral-pl san-jose
  santa-clara-county bay-area)
 (4913 rue-de-paris-restaurant french 2.3 19 n-market-st san-jose
  santa-clara-county bay-area)
 (4914 little-europe french 2.0 13799 catalina-st san-leandro
  alameda-county bay-area)
 (4915 le-bistro french 2.0 825 grant-ave san-lorenzo alameda-county
  bay-area)
 (4916 bella-vista-restaurant french 4.4 13451 skyline-blvd woodside
  san-mateo-county bay-area)
 (4917 le-chateaubriand french 3.3 2065 san-ramon-valley-blvd san-ramon
  contra-costa-county bay-area)
 (4918 marjolaine-french-pastries french 2.8 14441 big-basin-way
  saratoga santa-clara-county bay-area)
 (4919 chez-dyon french 2.0 1450 central-rd walnut-creek
  contra-costa-county bay-area)
 (4920 lvirage french 3.0 2211 n-main-st walnut-creek
  contra-costa-county bay-area)
 (4921 la-cigale french 2.5 2195 n-brd walnut-creek contra-costa-county
  bay-area)
 (4922 la-cocotte-inc french 2.0 0 timcates-1501-n-brd walnut-creek
  contra-costa-county bay-area)
 (4923 soizic-bistro french 3.4 300 broadway oakland alameda-county
  bay-area)
 (4924 anjou french 3.3 44 campton-place san-francisco
  san-francisco-county bay-area)
 (4925 the-hilltop-cafe french 3.1 850 lamont novato marin-county
  bay-area)
 (4926 chez-michel french 2.8 804 north-point-st. san-francisco
  san-francisco-county bay-area)
 (4927 city-of-paris-restaurant-&-bar french 2.7 101 shannon-st
  san-francisco san-francisco-county bay-area)
 (4928 cyrano-le-french-restaurant french 2.0 4134 geary-blvd
  san-francisco san-francisco-county bay-area)
 (4929 lolivier-french-restaurant french 2.0 465 davis-ct san-francisco
  san-francisco-county bay-area)
 (4930 le-cyrano-french-restaurant french 2.7 4134 geary-blvd
  san-francisco san-francisco-county bay-area)
 (4931 moulin-rouge-restaurant french 2.7 887 geary-st san-francisco
  san-francisco-county bay-area)
 (4932 domaine-chandon french 4.0 0 california-drive yountville
  napa-county napa-valley)
 (4933 gourmet-corner french 2.7 0 way benicia solano-county bay-area)
 (4934 lamie-donia french 3.2 530 bryant palo-alto santa-clara-county
  bay-area)
 (4935 le-chalet-basque french 2.7 405 north-san-pedro-rd san-rafael
  marin-county bay-area)
 (4936 sent-sovi french 4.2 nil nil saratoga santa-clara-county
  bay-area)
 (4937 la-folie french 4.3 2316 polk-st san-francisco
  san-francisco-county bay-area)
 (4938 douce-france french 3.3 nil nil palo-alto santa-clara-county
  bay-area)
 (4939 douce-france french 2.0 93 town-&-country-village palo-alto
  santa-clara-county bay-area)
 (4940 act-iv french 2.7 333 fulton san-francisco san-francisco-county
  bay-area)
 (4941 eos-restaurant/wine-bar french 3.3 901 cole-st san-francisco
  san-francisco-county bay-area)
 (4942 crepe-bistro french 2.7 0 next-to-baskin-robbins davis
  yolo-county sacramento-area)
 (4943 pascal-french-oven french 2.5 1372 north-main-st walnut-creek
  contra-costa-county bay-area)
 (4944 ninas-cafe french 2.8 3525 alameda-de-las-pulgas menlo-park
  san-mateo-county bay-area)
 (4945 le-gourmet french 3.4 0 x14th-st. san-leandro alameda-county
  bay-area)
 (4946 alain-rondelli french 3.4 126 clement-st. san-francisco
  san-francisco-county bay-area)
 (4947 little-paris french 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (4948 pastis french 2.7 1015 battery-st. san-francisco
  san-francisco-county bay-area)
 (4949 cassis-bistro french 3.0 2120 greenwich-st san-francisco
  san-francisco-county bay-area)
 (4950 fresh-cream french 3.5 0 harbor monterey monterey-county
  monterey)
 (4951 avenue-the french 3.2 nil nil carmel monterey-county monterey)
 (4952 la-maison french 2.8 3774 castro-valley-blvd. castro-valley
  alameda-county bay-area)
 (4953 the-dining-room-at-the-ritz-carlton french 4.5 600 california
  san-francisco san-francisco-county bay-area)
 (4954 papillon french 3.0 37296 mission-blvd fremont alameda-county
  bay-area)
 (4955 left-bank french 2.7 507 magnolia-ave larkspur marin-county
  bay-area)
 (4956 chateau-des-fleurs french 3.4 523 church-st. half-moon-bay
  san-mateo-county bay-area)
 (4957 claude-&-dominique-bistro french 3.4 210 rose-ave pleasanton
  alameda-county bay-area)
 (4958 la-petite-auberge french 2.0 704 x4th-st san-rafael marin-county
  bay-area)
 (4959 the-resturant-at-meadowood french 3.8 900 meadowood-lane
  saint-helena napa-county napa-valley)
 (4960 kincaids-boulevard-restaurant-bistro french 2.0 217 crossrd
  carmel monterey-county monterey)
 (4961 french-rooster french 2.8 1101 valencia belmont san-mateo-county
  bay-area)
 (4962 la-bergerie french 2.7 4221 geary-st san-francisco
  san-francisco-county bay-area)
 (4963 creekside-bistro french 2.7 636 san-anselmo-ave san-anselmo
  marin-county bay-area)
 (4964 patisserie french 2.0 0 plaza-on-misson-st carmel
  monterey-county monterey)
 (4965 le-charm french 3.3 315 x5th-st san-francisco
  san-francisco-county bay-area)
 (4966 melacs french 3.3 663 lighthouse pacific-grove monterey-county
  monterey)
 (4967 mere-michelle french 1.7 14467 big-basin-way saratoga
  santa-clara-county bay-area)
 (4968 chef-pauls-restaurant french 3.0 4179 piedmont-ave piedmont
  alameda-county bay-area)
 (4969 ru-lepic french 2.7 900 pine-st. san-francisco
  san-francisco-county bay-area)
 (4970 bistro-alexis french 3.0 1345 bush-st san-francisco
  san-francisco-county bay-area)
 (4971 la-boheme-restaurant french 2.7 47031 kato-rd. fremont
  alameda-county bay-area)
 (4972 aqua french 4.1 0 unknown san-francisco san-francisco-county
  bay-area)
 (4973 zare french 2.7 568 sacramento-st san-francisco
  san-francisco-county bay-area)
 (4974 plouf french 3.0 40 belden-lane san-francisco
  san-francisco-county bay-area)
 (4975 cest-si-bon french 3.3 nil nil fremont alameda-county bay-area)
 (4976 hugos-cafe fusion 3.6 4219 elcamino-real palo-alto
  santa-clara-county bay-area)
 (4977 bavarian-corner german 2.3 8 st/buena-vista alameda
  alameda-county bay-area)
 (4978 tyrolean-inn german 2.8 9600 hy-9 ben-lomond santa-cruz-county
  bay-area)
 (4979 hof-brau-haus german 2.0 18 southland-mall-sp-t8 hayward
  alameda-county bay-area)
 (4980 tillies german 2.0 0 carlos-ave moss-beach san-mateo-county
  bay-area)
 (4981 mr-d-hofbrau german 2.0 346 x9th-st-no.-210 oakland
  alameda-county bay-area)
 (4982 elbe german 3.5 117 university-ave palo-alto santa-clara-county
  bay-area)
 (4983 the-cellar-hof-brau german 2.0 916 cumberland-st pittsburg
  contra-costa-county bay-area)
 (4984 german-cook-restaurant german 2.3 612 ofarrell san-francisco
  san-francisco-county bay-area)
 (4985 schroeders-restaurant german 2.7 240 front san-francisco
  san-francisco-county bay-area)
 (4986 speckmanns german 2.4 1550 church san-francisco
  san-francisco-county bay-area)
 (4987 germania-restaurant-at-the-hochburg german 3.6 261 n.-2nd-st
  san-jose santa-clara-county bay-area)
 (4988 hochburg-von-germania german 3.0 502 s-2nd-st san-jose
  santa-clara-county bay-area)
 (4989 teskes-germania-restaurant german 2.5 255 n-1st-st san-jose
  santa-clara-county bay-area)
 (4990 franks-saloon-hof-brau german 2.0 2014 marina-blvd san-leandro
  alameda-county bay-area)
 (4991 walnut-creek-hofbrau-house german 2.0 1401 mount-diablo-blvd
  walnut-creek contra-costa-county bay-area)
 (4992 hardys-bavaria german 3.4 111 w-evelyn-ave-ste-108 sunnyvale
  santa-clara-county bay-area)
 (4993 little-bavaria-restaurant german 2.3 271 alameda-del-prado
  novato marin-county bay-area)
 (4994 marshall-house-german-restaurant german 2.0 835 x2nd-st
  santa-rosa sonoma-county bay-area)
 (4995 roelz-axel-marshall-house-german-restaurant german 2.0 835
  x2nd-st santa-rosa sonoma-county bay-area)
 (4996 deutschlander-restaurant german 2.0 221 st san-francisco
  san-francisco-county bay-area)
 (4997 black-forest-inn german 3.0 376 x1st-st. los-altos
  santa-clara-county bay-area)
 (4998 sudwerk---hubsch-brau german 2.7 2001 second-st davis
  yolo-county sacramento-area)
 (4999 suppenkueche-restaurant german 3.5 601 hayes-st san-francisco
  san-francisco-county bay-area)
 (5000 speckmans-of-calistoga german 2.0 1880 lincoln-avenue calistoga
  napa-county napa-valley)
 (5001 german-restaurant-*-cafe german 2.7 500
  bollinger-cayon-way-suite-a-17 san-ramon contra-costa-county
  bay-area)
 (5002 yanni greek 2.0 224 primrose-rd burlingame san-mateo-county
  bay-area)
 (5003 yiassoo greek 2.6 2180 s-bascom-ave campbell santa-clara-county
  bay-area)
 (5004 yiassoo-cafe greek 2.0 20700 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (5005 yiassoo-restaurant greek 3.0 10660 s-de-anza-blvd cupertino
  santa-clara-county bay-area)
 (5006 sweiss-gyros-&-pita greek 2.8 5800 shellmound-st emeryville
  alameda-county bay-area)
 (5007 moonshadows greek 2.8 5447 highway-9 felton unknown bay-area)
 (5008 gyro-place greek 2.0 729 ferry-st martinez contra-costa-county
  bay-area)
 (5009 gyros-corner greek 2.0 2083 newpark-mall newark alameda-county
  bay-area)
 (5010 asimakopoulos-cafe-&-deli greek 2.8 288 connecticut
  san-francisco san-francisco-county bay-area)
 (5011 greco-romana-pizza-caffe greek 2.5 2448 clement san-francisco
  san-francisco-county bay-area)
 (5012 panos greek 2.5 4000 x24th san-francisco san-francisco-county
  bay-area)
 (5013 salonika-greek-restaurant greek 3.3 2237 polk san-francisco
  san-francisco-county bay-area)
 (5014 the-greek-islands-cafe greek 2.0 4 embarcadero-center
  san-francisco san-francisco-county bay-area)
 (5015 verona-restaurant-&-pizza greek 2.3 291 x30th san-francisco
  san-francisco-county bay-area)
 (5016 yiassoo greek 3.0 1362 kooser-rd san-jose santa-clara-county
  bay-area)
 (5017 eliopoulos-family-restaurant greek 2.0 260 floresta-blvd
  san-leandro alameda-county bay-area)
 (5018 papas-church greek 3.0 415 seabright-ave santa-cruz
  santa-cruz-county bay-area)
 (5019 evvia greek 3.2 410 emerson-st. palo-alto santa-clara-county
  bay-area)
 (5020 rainbow-pizza greek 2.7 112 crysrals-spring-shopping-center
  san-mateo san-mateo-county bay-area)
 (5021 greek-bistro greek 2.4 305 main-st sebastopol sonoma-county
  bay-area)
 (5022 athens-greek-restaurant greek 2.0 39 mason-st san-francisco
  san-francisco-county bay-area)
 (5023 bills-cafe greek 2.8 1115 willow-st san-jose santa-clara-county
  bay-area)
 (5024 santa-fe-bar-and-grill grill 3.0 1310 university-ave berkeley
  alameda-county bay-area)
 (5025 boulder-creek-grille-&-cafe grill 2.3 13040 highway-9
  boulder-creek santa-cruz-county bay-area)
 (5026 california-bar-&-grill grill 2.0 241 california-dr burlingame
  san-mateo-county bay-area)
 (5027 california-bar-&-grill grill 2.0 241 california-dr burlingame
  san-mateo-county bay-area)
 (5028 garys-sports-bar-&-grill grill 2.6 2369 winchester-blvd campbell
  santa-clara-county bay-area)
 (5029 busters-grill-&-bar grill 2.3 10123 n-wolfe-rd cupertino
  santa-clara-county bay-area)
 (5030 carnival-bar-&-grill grill 2.0 6192 mission-st daly-city
  san-mateo-county bay-area)
 (5031 park-hyatt grill 2.0 333 battery-st san-francisco
  san-francisco-county bay-area)
 (5032 stoddards grill 3.5 111 s.-murphy-ave sunnyvale
  santa-clara-county bay-area)
 (5033 sams-grill-and-seafood-restaurant grill 2.8 374 bush-st.
  san-francisco san-francisco-county bay-area)
 (5034 baby-sals-seafood-grill grill 3.2 60 corte-madera-ave
  corte-madera marin-county bay-area)
 (5035 wallys-bar-&-grill grill 2.0 100 s-1st-st dixon solano-county
  bay-area)
 (5036 jack-london-grill grill 2.0 13740 arnold-dr glen-ellen
  sonoma-county bay-area)
 (5037 sonoma-mountain-grill-the grill 2.0 13690 arnold-dr glen-ellen
  sonoma-county bay-area)
 (5038 holidaze-bar-&-grill grill 2.0 42 petaluma-boulevard petaluma
  sonoma-county bay-area)
 (5039 jeromes-cafe-&-grill grill 3.0 1390 n-mcdowell-blvd petaluma
  sonoma-county bay-area)
 (5040 chilis-grill-&-bar grill 2.0 4851 redwood-dr rohnert-park
  sonoma-county bay-area)
 (5041 harvest-grill-at-the-doubletree-hotel grill 2.0 3555
  round-barn-blvd santa-rosa sonoma-county bay-area)
 (5042 ozzies-grill grill 2.0 799 montecito-ctr santa-rosa
  sonoma-county bay-area)
 (5043 santa-rosa-grill-restaurant grill 2.0 450 mendocino-ave
  santa-rosa sonoma-county bay-area)
 (5044 stony-point-grill grill 2.0 130 stony-point-rd santa-rosa
  sonoma-county bay-area)
 (5045 valley-ford-grill grill 2.0 0 1 santa-rosa sonoma-county
  bay-area)
 (5046 applewood-grill-the grill 2.0 961 gravenstein-hwy-s sebastopol
  sonoma-county bay-area)
 (5047 skips-bar-&-grill grill 2.0 9005 graton-rd sebastopol
  sonoma-county bay-area)
 (5048 eastside-oyster-bar-&-grill grill 2.7 133 e-napa-st sonoma
  sonoma-county bay-area)
 (5049 grille-at-sonoma-mission-inn grill 2.0 18140 sonoma-hwy sonoma
  sonoma-county bay-area)
 (5050 sonoma-grove-bar-&-grill grill 2.0 19315 sonoma-hwy sonoma
  sonoma-county bay-area)
 (5051 bankfirst-natl-bar-&-grill grill 2.0 701 main-st suisun-city
  solano-county bay-area)
 (5052 nob-hill-grille-restaurant grill 2.0 969 hyde-st san-francisco
  san-francisco-county bay-area)
 (5053 park-grill-the grill 3.0 333 battery-st san-francisco
  san-francisco-county bay-area)
 (5054 stars-restaurant-private-grill grill 2.3 555 golden-gate-ave
  san-francisco san-francisco-county bay-area)
 (5055 mustards grill 3.2 7399 st.-helena-hwy yountville napa-county
  napa-valley)
 (5056 del-monte-bar-and-grill grill 2.8 100 south-murphy-avenue
  sunnyvale santa-clara-county bay-area)
 (5057 gulf-coast-grill-&-bar grill 2.0 736 washington oakland
  alameda-county bay-area)
 (5058 kincaids-bayhouse grill 3.4 0 london-square oakland
  alameda-county bay-area)
 (5059 smittys-bar-and-grill grill 1.8 199 e.-middlefield-rd
  mountain-view santa-clara-county bay-area)
 (5060 california-cafe-bar-&-grill grill 3.0 0 unknown walnut-creek
  contra-costa-county bay-area)
 (5061 merchant-&-main-grill-&-bar grill 2.5 349 merchant-st. vacaville
  solano-county bay-area)
 (5062 orida-grill grill 3.5 87 orinda-way orinda contra-costa-county
  bay-area)
 (5063 hydro-bar-&-grill grill 2.0 1403 lincoln-ave calistoga
  napa-county napa-valley)
 (5064 grillmaster grill 2.3 1480 s.-de-anza-blvd. cupertino
  santa-clara-county bay-area)
 (5065 la-belle-creole haitian 3.3 4090 san-pablo-ave emeryville
  alameda-county bay-area)
 (5066 touch-of-aloha-restaurant-a hawaiian 2.9 148 n-milpitas-blvd
  milpitas santa-clara-county bay-area)
 (5067 ricks hawaiian 3.0 1940 traraval san-francisco
  san-francisco-county bay-area)
 (5068 juice-club health 3.8 0 creek-blvd. cupertino santa-clara-county
  bay-area)
 (5069 smart-alecs health 2.5 0 &-durant berkeley alameda-county
  bay-area)
 (5070 hof-brau-haus hoffbrau 2.0 18 southland-mall-sp-t8 hayward
  alameda-county bay-area)
 (5071 court-hof-brau hoffbrau 2.0 126 x14th-st oakland alameda-county
  bay-area)
 (5072 first-and-ten-hof-brau hoffbrau 2.0 4390 telegraph-ave oakland
  alameda-county bay-area)
 (5073 jerry-ts-hof-brau hoffbrau 2.0 4090 whittle-ave oakland
  alameda-county bay-area)
 (5074 jesses-hof-brau hoffbrau 2.0 3655 piedmont-ave oakland
  alameda-county bay-area)
 (5075 the-cellar-hof-brau hoffbrau 2.0 916 cumberland-st pittsburg
  contra-costa-county bay-area)
 (5076 hof-brau-cafe hoffbrau 2.0 178 airport-blvd south-san-francisco
  san-mateo-county bay-area)
 (5077 franks-saloon-hof-brau hoffbrau 2.0 2014 marina-blvd san-leandro
  alameda-county bay-area)
 (5078 hof-brau hoffbrau 2.0 2220 fashion-island-blvd san-mateo
  san-mateo-county bay-area)
 (5079 san-mateo-hof-brau hoffbrau 2.0 60 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (5080 olivers-hof-brau hoffbrau 3.0 nil nil oakland alameda-county
  bay-area)
 (5081 harrys-hofbrau hoffbrau 2.3 14900 e.-14th.-st. san-leandro
  alameda-county bay-area)
 (5082 all-american-dog hot-dogs 2.0 1041 melrose-ave alameda
  alameda-county bay-area)
 (5083 jumbo-hot-dog hot-dogs 2.0 372 oleander-ave alameda
  alameda-county bay-area)
 (5084 super-hot-dog hot-dogs 2.0 2209 san-jose-ave-no.-d alameda
  alameda-county bay-area)
 (5085 weinerschnitzel hot-dogs 1.7 1007 rosewood-way alameda
  alameda-county bay-area)
 (5086 caspers-hot-dogs hot-dogs 2.0 1931 somersville-rd antioch
  contra-costa-county bay-area)
 (5087 ernies-hotdogs hot-dogs 2.0 3200 e-18th-st antioch
  contra-costa-county bay-area)
 (5088 jerrys-hot-dogs hot-dogs 2.3 3005 delta-fair-blvd antioch
  contra-costa-county bay-area)
 (5089 weinerschnitzel hot-dogs 2.0 200 e-18th-st antioch
  contra-costa-county bay-area)
 (5090 wieneschnitzel hot-dogs 2.0 200 e-18th-st antioch
  contra-costa-county bay-area)
 (5091 chars-hot-dogs hot-dogs 3.8 131 x1st-st benicia solano-county
  bay-area)
 (5092 hot-diggidy-dog hot-dogs 2.0 86 solano-sq benicia solano-county
  bay-area)
 (5093 rainbow-hotdog hot-dogs 2.0 2275 s-bascom-ave-apt-1203 campbell
  santa-clara-county bay-area)
 (5094 wienerschnitzel hot-dogs 2.0 1330 camden-ave campbell
  santa-clara-county bay-area)
 (5095 wienerschnitzel hot-dogs 2.0 1380 w-campbell-ave campbell
  santa-clara-county bay-area)
 (5096 daves-hot-dogs hot-dogs 2.0 5439 clayton-rd-ste-c clayton
  contra-costa-county bay-area)
 (5097 erics-all-american-hot-dogs hot-dogs 2.0 4224
  saint-paul-way-apt-101 concord contra-costa-county bay-area)
 (5098 hot-diggity-dogs hot-dogs 2.0 1031 fox-meadow-way concord
  contra-costa-county bay-area)
 (5099 lisas-house-of-hot-dogs hot-dogs 2.3 5100 clayton-rd-ste-31
  concord contra-costa-county bay-area)
 (5100 the-hot-dog-palace hot-dogs 2.3 1990 grant-st concord
  contra-costa-county bay-area)
 (5101 underdog hot-dogs 2.0 22 dana-plz concord contra-costa-county
  bay-area)
 (5102 wienerschnitzel hot-dogs 2.0 4320 clayton-rd concord
  contra-costa-county bay-area)
 (5103 zips-hot-dog hot-dogs 2.0 2380 salvio-st concord
  contra-costa-county bay-area)
 (5104 hot-dog-on-a-stick hot-dogs 1.7 10123 n-wolfe-rd cupertino
  santa-clara-county bay-area)
 (5105 hot-dog-on-a-stick hot-dogs 2.0 66 serramonte-ctr daly-city
  san-mateo-county bay-area)
 (5106 plus-hot-dogs hot-dogs 2.0 437 southgate-ave daly-city
  san-mateo-county bay-area)
 (5107 sams-dog-house hot-dogs 2.0 3857 san-pablo-dam-rd el-sobrante
  contra-costa-county bay-area)
 (5108 skis-hot-dogs hot-dogs 2.0 31103 mission-blvd hayward
  alameda-county bay-area)
 (5109 team-hot-dog hot-dogs 2.0 22628 foothill-blvd hayward
  alameda-county bay-area)
 (5110 bjs-chili-dogs hot-dogs 2.0 125 san-benito-st hollister
  san-benito-county northern-california)
 (5111 the-hot-dog-depot hot-dogs 2.0 400 ferry-st martinez
  contra-costa-county bay-area)
 (5112 hot-dog-bill hot-dogs 2.0 675 santa-barbara-ave millbrae
  san-mateo-county bay-area)
 (5113 the-famous-frankfurter hot-dogs 2.8 293 el-camino-real millbrae
  san-mateo-county bay-area)
 (5114 wienerschnitzel hot-dogs 2.0 1333 s-park-victoria-dr milpitas
  santa-clara-county bay-area)
 (5115 a-&-w-restaurant hot-dogs 2.0 260 moffett-blvd mountain-view
  santa-clara-county bay-area)
 (5116 wienerschnitzel hot-dogs 2.3 383 castro-st mountain-view
  santa-clara-county bay-area)
 (5117 ernies-hotdogs hot-dogs 2.0 286 old-hwy-4 oakley
  contra-costa-county bay-area)
 (5118 hot-dog-heaven hot-dogs 2.0 5860 pacheco-blvd pacheco unknown
  unknown)
 (5119 gourmet-franks hot-dogs 2.0 199 stanford-shopping-ctr palo-alto
  santa-clara-county bay-area)
 (5120 dogs-on-the-bun hot-dogs 2.0 1340 treat-blvd pleasant-hill
  contra-costa-county bay-area)
 (5121 b-js-gourmet-hot-dogs hot-dogs 2.0 1056 x16th-ave redwood-city
  san-mateo-county bay-area)
 (5122 bjs-gourmet-hot-dogs hot-dogs 2.0 1056 x16th-ave redwood-city
  san-mateo-county bay-area)
 (5123 wienerschnitzel hot-dogs 2.0 709 woodside-rd redwood-city
  san-mateo-county bay-area)
 (5124 general-franks hot-dogs 2.0 739 golden-gate-ave richmond
  contra-costa-county bay-area)
 (5125 pup-hut hot-dogs 2.0 12505 san-pablo-ave richmond
  contra-costa-county bay-area)
 (5126 the-dog-house hot-dogs 2.0 130 el-camino-real san-bruno
  san-mateo-county bay-area)
 (5127 a-&-w-restaurant hot-dogs 2.0 1502 sleepy-meadow-ct san-jose
  santa-clara-county bay-area)
 (5128 alexanders-haute-dogs hot-dogs 2.0 14050 lieb-ct san-jose
  santa-clara-county bay-area)
 (5129 billys-hot-dogs hot-dogs 2.0 3047 betsy-way san-jose
  santa-clara-county bay-area)
 (5130 daddy-dog hot-dogs 2.0 4360 stevens-creek-blvd san-jose
  santa-clara-county bay-area)
 (5131 franks-a-million hot-dogs 2.0 5281 discovery-ave san-jose
  santa-clara-county bay-area)
 (5132 grand-slam-dogs hot-dogs 2.0 3446 cunard-ct san-jose
  santa-clara-county bay-area)
 (5133 h-ts-hot-dogs hot-dogs 2.0 3031 yancy-dr san-jose
  santa-clara-county bay-area)
 (5134 happy-dogs hot-dogs 2.0 5968 cabral-ave san-jose
  santa-clara-county bay-area)
 (5135 hot-dog-on-a-stick hot-dogs 2.0 348 eastridge-mall san-jose
  santa-clara-county bay-area)
 (5136 jr-hot-dog hot-dogs 2.0 741 delmas-ave san-jose
  santa-clara-county bay-area)
 (5137 mari-linns-hot-dogs hot-dogs 2.0 4822 pine-forest-pl san-jose
  santa-clara-county bay-area)
 (5138 marks-hot-dogs hot-dogs 2.0 1920 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (5139 mels-crazy-dogs hot-dogs 2.0 2778 mclaughlin-ave san-jose
  santa-clara-county bay-area)
 (5140 nicoles-hot-dogs-etc hot-dogs 2.0 5427 century-meadow-ct
  san-jose santa-clara-county bay-area)
 (5141 tebereh-hot-dog hot-dogs 2.0 1836 luke-ct san-jose
  santa-clara-county bay-area)
 (5142 wienerschnitzel hot-dogs 2.0 935 s-1st-st san-jose
  santa-clara-county bay-area)
 (5143 wienerschnitzel hot-dogs 2.0 702 n-4th-st san-jose
  santa-clara-county bay-area)
 (5144 wienerschnitzel hot-dogs 2.0 95 s-market-st san-jose
  santa-clara-county bay-area)
 (5145 wienerschnitzel hot-dogs 2.0 209 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (5146 wienerschnitzel hot-dogs 2.0 1095 tully-rd san-jose
  santa-clara-county bay-area)
 (5147 wienerschnitzel hot-dogs 2.0 925 meridian-ave san-jose
  santa-clara-county bay-area)
 (5148 wienerschnitzel hot-dogs 2.0 411 n-capitol-ave san-jose
  santa-clara-county bay-area)
 (5149 wienerschnitzel hot-dogs 2.0 845 branham-ln san-jose
  santa-clara-county bay-area)
 (5150 wienerschnitzel hot-dogs 2.0 845 branham-ln san-jose
  santa-clara-county bay-area)
 (5151 vs-hot-dogs hot-dogs 2.0 1430 x136th-ave san-leandro
  alameda-county bay-area)
 (5152 dog-house hot-dogs 2.0 3211 crow-canyon-pl san-ramon
  contra-costa-county bay-area)
 (5153 chicago-hot-dog-factory hot-dogs 2.0 2785 el-camino-real
  santa-clara santa-clara-county bay-area)
 (5154 wienerschnitzel hot-dogs 2.0 3655 pruneridge-ave-apt-144
  santa-clara santa-clara-county bay-area)
 (5155 wienerschnitzel hot-dogs 2.0 75 saratoga-ave santa-clara
  santa-clara-county bay-area)
 (5156 great-american-wiener-works hot-dogs 2.0 1141 soquel-ave
  santa-cruz santa-cruz-county bay-area)
 (5157 hot-dog-on-a-stick hot-dogs 2.0 400 beach-st santa-cruz
  santa-cruz-county bay-area)
 (5158 josephs-hot-dogs hot-dogs 2.0 211 waverly-ave sunnyvale
  santa-clara-county bay-area)
 (5159 dogs-on-the-bun hot-dogs 2.0 200 ygnacio-valley-rd walnut-creek
  contra-costa-county bay-area)
 (5160 the-original-hot-dog-place hot-dogs 2.8 1420 lincoln-ave
  walnut-creek contra-costa-county bay-area)
 (5161 ameridog-hot-dogs hot-dogs 2.0 1969 san-miguel-rd santa-rosa
  sonoma-county bay-area)
 (5162 carousel-hot-dog hot-dogs 2.0 334 coddingtown-ctr santa-rosa
  sonoma-county bay-area)
 (5163 alleys-hot-dogs hot-dogs 2.0 1505 tennessee-st vallejo
  solano-county bay-area)
 (5164 americas-hot-dogs hot-dogs 2.0 212 sonora-pass-rd vallejo
  solano-county bay-area)
 (5165 friendly-freds-hotdogs hot-dogs 2.7 409 tennant-station
  morgan-hill santa-clara-county bay-area)
 (5166 kaspers-hot-dogs-the-original hot-dogs 2.5 4521 telegraph-ave
  oakland alameda-county bay-area)
 (5167 hot-&-spicy-restaurant hunan 2.0 1819 market san-francisco
  san-francisco-county bay-area)
 (5168 hunan-on-haight hunan 2.0 1419 haight san-francisco
  san-francisco-county bay-area)
 (5169 hunan-red-peppers-restaurant hunan 2.0 450 balboa san-francisco
  san-francisco-county bay-area)
 (5170 taste-of-china hunan 3.5 0 unknown san-jose santa-clara-county
  bay-area)
 (5171 hungarian-sausage-factory-&-bistro hungarian 2.0 419
  cortland-avenue san-francisco san-francisco-county bay-area)
 (5172 alameda-ice-cream-dock ice-cream 2.7 871 island-dr-no.-c alameda
  alameda-county bay-area)
 (5173 baskin-robbins ice-cream 3.0 2635 blanding-ave alameda
  alameda-county bay-area)
 (5174 foster-freeze-alameda ice-cream 2.0 630 central-ave alameda
  alameda-county bay-area)
 (5175 tuckers-super-creamed-ice-cream ice-cream 3.2 1528 park-st
  alameda alameda-county bay-area)
 (5176 i-love-ice-cream ice-cream 2.0 1162 solano-ave albany
  alameda-county bay-area)
 (5177 velvet-creamery-of-antioch ice-cream 2.3 3030 delta-fair-blvd
  antioch contra-costa-county bay-area)
 (5178 baskin-robbins ice-cream 2.0 100 rancho-del-mar aptos
  santa-cruz-county bay-area)
 (5179 fosters-old-fashion-freeze ice-cream 2.0 160 woodview-dr
  ben-lomond santa-cruz-county bay-area)
 (5180 baskin-robbins ice-cream 2.8 191 military-e-ste-g benicia
  solano-county bay-area)
 (5181 x2001-flavors-ice-cream-&-yogur ice-cream 2.0 2485 telegraph-ave
  berkeley alameda-county bay-area)
 (5182 baskin-robbins ice-cream 2.0 1471 shattuck-ave berkeley
  alameda-county bay-area)
 (5183 double-rainbow ice-cream 2.0 2236 shattuck-ave berkeley
  alameda-county bay-area)
 (5184 fosters-freeze ice-cream 1.7 1199 university-ave berkeley
  alameda-county bay-area)
 (5185 marble-twenty-one-ice-cream ice-cream 2.0 2270 shattuck-ave
  berkeley alameda-county bay-area)
 (5186 sacramento-ice-cream-shop ice-cream 2.0 2448 sacramento-st
  berkeley alameda-county bay-area)
 (5187 the-latest-scoop ice-cream 2.0 1017 ashby-ave berkeley
  alameda-county bay-area)
 (5188 baskin-robins ice-cream 2.0 1145 x2nd-st-no.-d brentwood
  contra-costa-county bay-area)
 (5189 baskin-robins ice-cream 2.0 1145 x2nd-st brentwood
  contra-costa-county bay-area)
 (5190 baskin-robbins ice-cream 2.0 1409 burlingame-ave burlingame
  san-mateo-county bay-area)
 (5191 double-rainbow ice-cream 2.0 23 vista-ln burlingame
  san-mateo-county bay-area)
 (5192 baskin-robbins ice-cream 2.0 2116 surrey-pl campbell
  santa-clara-county bay-area)
 (5193 baskin-robbins ice-cream 2.3 1720 w-campbell-ave campbell
  santa-clara-county bay-area)
 (5194 camden-foster-freeze ice-cream 2.0 1970 white-oaks-rd campbell
  santa-clara-county bay-area)
 (5195 dairy-queen ice-cream 2.0 2255 winchester-blvd campbell
  santa-clara-county bay-area)
 (5196 fosters-freeze ice-cream 2.0 2200 s-bascom-ave campbell
  santa-clara-county bay-area)
 (5197 swensens-ice-cream ice-cream 2.0 74 redding-rd campbell
  santa-clara-county bay-area)
 (5198 swensens-ice-cream ice-cream 2.0 119 the-pruneyard campbell
  santa-clara-county bay-area)
 (5199 baskin-robbins ice-cream 2.0 1601 x41st-ave capitola unknown
  bay-area)
 (5200 dairy-queen-drive ice-cream 2.0 816 bay-ave capitola unknown
  bay-area)
 (5201 souzas-ice-cream ice-cream 2.0 200 monterey-ave-no.-1 capitola
  unknown bay-area)
 (5202 double-rainbow-gourmet-ice-cream ice-cream 3.0 3032
  castro-valley-blvd castro-valley alameda-county bay-area)
 (5203 ice-creamery-castro-valley ice-cream 2.8 3323 castro-valley-blvd
  castro-valley alameda-county bay-area)
 (5204 loards-ice-cream-&-candies ice-cream 2.0 6003 mount-olympus-dr
  castro-valley alameda-county bay-area)
 (5205 crystals-ice-cream-shop ice-cream 2.0 10481 merritt-st-ste-a
  castroville monterey-county monterey)
 (5206 baskin-robbins ice-cream 2.0 785 oak-grove-rd concord
  contra-costa-county bay-area)
 (5207 baskin-robbins ice-cream 2.0 2151 salvio-st-ste-k concord
  contra-costa-county bay-area)
 (5208 baskin-robbins ice-cream 2.0 4530 clayton-rd concord
  contra-costa-county bay-area)
 (5209 cookies-to ice-cream 2.0 1115 victory-ln concord
  contra-costa-county bay-area)
 (5210 cousins-creamery ice-cream 2.0 1847 willow-pass-rd-no.-b concord
  contra-costa-county bay-area)
 (5211 baskin-robbins ice-cream 2.0 7472 dumas-dr cupertino
  santa-clara-county bay-area)
 (5212 cupertino-fosters-freeze ice-cream 2.0 19940 homestead-rd
  cupertino santa-clara-county bay-area)
 (5213 moms-ice-creamery-&-grill ice-cream 2.0 21267
  stevens-creek-blvd-ste-314 cupertino santa-clara-county bay-area)
 (5214 swensens-ice-cream ice-cream 2.0 7454 dumas-dr cupertino
  santa-clara-county bay-area)
 (5215 baskin-robbins ice-cream 2.0 383 s-mayfair-ave daly-city
  san-mateo-county bay-area)
 (5216 petes-ice-cream-parlour ice-cream 2.0 6771 mission-st daly-city
  san-mateo-county bay-area)
 (5217 scoopful-ice-cream-shop ice-cream 2.0 83 lake-meadow-dr
  daly-city san-mateo-county bay-area)
 (5218 toons-restaurant-&-ice-cream-parlor ice-cream 2.0 138
  serramonte-ctr daly-city san-mateo-county bay-area)
 (5219 baskin-robbins ice-cream 2.0 301 hartz-ave-ste-100 danville
  contra-costa-county bay-area)
 (5220 baskin-&-robbins-ice-cream ice-cream 2.0 201 hartz-ave danville
  contra-costa-county bay-area)
 (5221 daisys-yogurt-shop ice-cream 2.3 412 sycamore-valley-rd-w
  danville contra-costa-county bay-area)
 (5222 fosters-old-fashion-freeze ice-cream 2.0 180 hartz-ave danville
  contra-costa-county bay-area)
 (5223 baskin-&-robbins-ice-cream ice-cream 2.0 7225 regional-st dublin
  alameda-county bay-area)
 (5224 foster-freeze ice-cream 2.0 7989 amador-valley-blvd dublin
  alameda-county bay-area)
 (5225 baskin-robbins ice-cream 2.0 10598 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (5226 honey-hut-yogurt ice-cream 2.0 175 el-cerrito-plz el-cerrito
  contra-costa-county bay-area)
 (5227 hopkins-ice-cream-parlor ice-cream 2.0 165 el-cerrito-plz
  el-cerrito contra-costa-county bay-area)
 (5228 foster-freeze ice-cream 2.0 3850 san-pablo-dam-rd el-sobrante
  contra-costa-county bay-area)
 (5229 baskin-robbins ice-cream 2.0 2121 n-texas-st fairfield
  solano-county bay-area)
 (5230 bresslers-33-flavors-ice-crea ice-cream 2.0 1350 travis-blvd
  fairfield solano-county bay-area)
 (5231 dairy-queen-brazier-no-18296 ice-cream 2.0 1730 w-texas-st
  fairfield solano-county bay-area)
 (5232 baskin-robbins ice-cream 2.0 1086 foster-city-blvd foster-city
  san-mateo-county bay-area)
 (5233 dbl-rainbw-gourmet-ice-crm-ser ice-cream 2.0 1056 edgewater-blvd
  foster-city san-mateo-county bay-area)
 (5234 heavenly-ice-cream-frozen-yogurt ice-cream 2.0 969
  edgewater-blvd-no.-g foster-city san-mateo-county bay-area)
 (5235 baskin-robbins ice-cream 2.0 2024 freedom-blvd freedom unknown
  unknown)
 (5236 baskin-robbins ice-cream 2.0 5176 mowry-ave fremont
  alameda-county bay-area)
 (5237 baskin-robbins ice-cream 2.0 2973 bruce-dr fremont
  alameda-county bay-area)
 (5238 breslers-33-flavors ice-cream 2.0 41085 pajaro-dr fremont
  alameda-county bay-area)
 (5239 cloverdale-creamery ice-cream 3.0 37085 fremont-blvd fremont
  alameda-county bay-area)
 (5240 dairy-belle-freeze ice-cream 2.0 4342 thornton-ave-no.-a fremont
  alameda-county bay-area)
 (5241 dairy-belle-freeze ice-cream 2.0 41965 fremont-blvd fremont
  alameda-county bay-area)
 (5242 delce-dessert ice-cream 2.0 4656 creekwood-dr fremont
  alameda-county bay-area)
 (5243 gelato-classico-italian-ice ice-cream 2.8 39191 farwell-dr
  fremont alameda-county bay-area)
 (5244 honey-treat-yogurt ice-cream 2.0 3948 washington-blvd fremont
  alameda-county bay-area)
 (5245 honey-treat-yogurt-shoppe ice-cream 2.0 5255 mowry-ave-no.-5
  fremont alameda-county bay-area)
 (5246 leatherbys-ice-cream-parlour ice-cream 2.9 39300 argonaut-way
  fremont alameda-county bay-area)
 (5247 loards-ice-cream-paseo-padre ice-cream 2.0 34400 fremont-blvd
  fremont alameda-county bay-area)
 (5248 loards-ice-cream-store ice-cream 2.0 40575 fremont-blvd fremont
  alameda-county bay-area)
 (5249 uptown-yougurt ice-cream 2.0 48913 rosegarden-ct fremont
  alameda-county bay-area)
 (5250 yogurt-delite-fremont ice-cream 2.0 4378 thornton-ave fremont
  alameda-county bay-area)
 (5251 baskin-robbins ice-cream 2.3 1150 x1st-st gilroy
  santa-clara-county bay-area)
 (5252 baskin-robbins ice-cream 2.0 20780 hesperian-blvd hayward
  alameda-county bay-area)
 (5253 baskin-robbins ice-cream 2.0 20800 hesperian-blvd hayward
  alameda-county bay-area)
 (5254 baskin-robbins ice-cream 2.0 26953 mission-blvd-no.-a hayward
  alameda-county bay-area)
 (5255 dairy-belle-freeze ice-cream 2.0 2285 w-tennyson-rd hayward
  alameda-county bay-area)
 (5256 dairy-queen-orange-julius ice-cream 2.0 349 southland-mall
  hayward alameda-county bay-area)
 (5257 everything-yogurt/bananas ice-cream 2.0 14 southland-mall
  hayward alameda-county bay-area)
 (5258 honey-treat-yogurt ice-cream 3.0 29627 mission-blvd hayward
  alameda-county bay-area)
 (5259 honey-treat-yogurt-shoppe ice-cream 2.0 794 jackson-st hayward
  alameda-county bay-area)
 (5260 honey-treat-yogurt-t-s ice-cream 2.0 25034 hesperian-blvd
  hayward alameda-county bay-area)
 (5261 loards-ice-cream-&-candels ice-cream 2.0 247 w-jackson-st
  hayward alameda-county bay-area)
 (5262 whats-the-scoop ice-cream 2.0 1045 c-st hayward alameda-county
  bay-area)
 (5263 dairy-queen-brazier-restaurant ice-cream 2.0 106 eagle-ct
  hercules contra-costa-county bay-area)
 (5264 kensington-ice-cream-parlor ice-cream 2.0 303 arlington-ave
  kensington unknown bay-area)
 (5265 baskin-robbins ice-cream 2.0 3651 mount-diablo-blvd lafayette
  contra-costa-county bay-area)
 (5266 double-rainbow-cafe ice-cream 2.0 53 lafayette-cir lafayette
  contra-costa-county bay-area)
 (5267 baskin-robbins ice-cream 2.0 1770 x1st-st livermore
  alameda-county bay-area)
 (5268 loards-ice-cream-&-candies ice-cream 3.5 1875 x2nd-st livermore
  alameda-county bay-area)
 (5269 my-hearts-delight-yogurt ice-cream 2.0 980 murrieta-blvd
  livermore alameda-county bay-area)
 (5270 not-just-yogurt ice-cream 2.7 1350 railroad livermore
  alameda-county bay-area)
 (5271 big-scoops-and-more ice-cream 2.0 680 berry-ave los-altos
  santa-clara-county bay-area)
 (5272 moms-ice-creamery-&-grill ice-cream 2.0 991 fremont-ave
  los-altos santa-clara-county bay-area)
 (5273 dolce-spazio ice-cream 3.3 221 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (5274 los-gatos-swensens-ice-cream ice-cream 2.3 20
  s-santa-cruz-ave-ste-201 los-gatos santa-clara-county bay-area)
 (5275 baskin-robbins ice-cream 2.0 1175 arnold-dr-no.-a martinez
  contra-costa-county bay-area)
 (5276 family-kitchen-martinez-creame ice-cream 2.0 825 escobar-st
  martinez contra-costa-county bay-area)
 (5277 foster-freeze-113 ice-cream 2.3 1500 pacheco-blvd martinez
  contra-costa-county bay-area)
 (5278 the-yogurt-place ice-cream 2.0 530 center-ave martinez
  contra-costa-county bay-area)
 (5279 yogurt-palace ice-cream 2.0 6656 alhambra-ave martinez
  contra-costa-county bay-area)
 (5280 baskin-robbins ice-cream 2.0 863 santa-cruz-ave menlo-park
  san-mateo-county bay-area)
 (5281 foster-freeze ice-cream 2.0 580 oak-grove-ave menlo-park
  san-mateo-county bay-area)
 (5282 swensen-ice-cream ice-cream 2.0 1350 el-camino-real menlo-park
  san-mateo-county bay-area)
 (5283 baskin-robbins ice-cream 2.0 669 broadway millbrae
  san-mateo-county bay-area)
 (5284 dairy-belle-freeze ice-cream 2.0 832 n-hillview-dr milpitas
  santa-clara-county bay-area)
 (5285 fosters-freeze ice-cream 2.0 51 s-park-victoria-dr milpitas
  santa-clara-county bay-area)
 (5286 milpitas-fosters-freeze ice-cream 2.3 78 serra-way milpitas
  santa-clara-county bay-area)
 (5287 baskin-robbins ice-cream 2.0 560 center-st moraga unknown
  bay-area)
 (5288 baskin-robbins ice-cream 2.0 214 tennant-sta morgan-hill
  santa-clara-county bay-area)
 (5289 baskin-robbins ice-cream 2.0 703 e-el-camino-real mountain-view
  santa-clara-county bay-area)
 (5290 baskin-robbins ice-cream 2.0 1249 w-el-camino-real mountain-view
  santa-clara-county bay-area)
 (5291 baskin-robbins ice-cream 1.8 2585 w-middlefield-rd mountain-view
  santa-clara-county bay-area)
 (5292 double-rainbow ice-cream 4.2 135 castro-st mountain-view
  santa-clara-county bay-area)
 (5293 foster-freeze ice-cream 2.0 412 w-el-camino-real mountain-view
  santa-clara-county bay-area)
 (5294 baskin-robbins ice-cream 2.0 2967 jefferson-st napa napa-county
  napa-valley)
 (5295 blue-chip-cookies ice-cream 2.0 1201 napa-town-ctr-spc-207 napa
  napa-county napa-valley)
 (5296 browns-valley-yogurt-espresso ice-cream 2.0 3265
  browns-valley-rd napa napa-county napa-valley)
 (5297 foster-freeze ice-cream 2.0 1195 w-imola-ave napa napa-county
  napa-valley)
 (5298 honey-treat-yogurt-shoppee ice-cream 2.0 1080 coombs-st napa
  napa-county napa-valley)
 (5299 lite-n-sweet-yogurt ice-cream 2.0 1160 x3rd-ave napa napa-county
  napa-valley)
 (5300 napa-dairy-queen ice-cream 2.0 1601 jefferson-st napa
  napa-county napa-valley)
 (5301 swensens-ice-cream ice-cream 2.0 3138 jefferson-st napa
  napa-county napa-valley)
 (5302 udder-delights-yogurt&coffee ice-cream 2.0 627 trancas-st napa
  napa-county napa-valley)
 (5303 baskin-robbins ice-cream 2.0 34980 newark-blvd-no.-a-9 newark
  alameda-county bay-area)
 (5304 baskin-robbins ice-cream 2.0 3540 fruitvale-ave oakland
  alameda-county bay-area)
 (5305 baskin-robbins ice-cream 2.0 5942 macarthur-blvd-ste-a oakland
  alameda-county bay-area)
 (5306 bens-daily-freeze ice-cream 2.0 10921 macarthur-blvd oakland
  alameda-county bay-area)
 (5307 cheri-ice-cream ice-cream 2.0 3206 e-14th-st oakland
  alameda-county bay-area)
 (5308 chubby-freezer ice-cream 2.0 600 hegenberger-rd oakland
  alameda-county bay-area)
 (5309 double-rainbow ice-cream 2.0 6099 claremont-ave oakland
  alameda-county bay-area)
 (5310 ice-house ice-cream 2.0 0 dist. oakland alameda-county bay-area)
 (5311 the-ice-house ice-cream 2.0 6111 la-salle-ave oakland
  alameda-county bay-area)
 (5312 loards-ice-cream-&-candies ice-cream 2.3 230 brookwood-rd orinda
  contra-costa-county bay-area)
 (5313 pacifica-ice-creamery ice-cream 2.0 1624 francisco-blvd pacifica
  san-mateo-county bay-area)
 (5314 baskin-robbins ice-cream 2.0 682 arastradero-rd palo-alto
  santa-clara-county bay-area)
 (5315 baskin-robbins ice-cream 2.0 2615 middlefield-rd palo-alto
  santa-clara-county bay-area)
 (5316 gelato-classico-italian-ice ice-cream 3.0 435 emerson-st
  palo-alto santa-clara-county bay-area)
 (5317 peninsula-fountain ice-cream 2.6 556 emerson palo-alto
  santa-clara-county bay-area)
 (5318 ricks-rather-rich-ice-cream ice-cream 2.7 3946 middlefield-rd
  palo-alto santa-clara-county bay-area)
 (5319 baskin-robbins ice-cream 2.0 1514 fitzgerald-dr pinole
  contra-costa-county bay-area)
 (5320 pinole-foster-freeze ice-cream 2.0 993 san-pablo-ave pinole
  contra-costa-county bay-area)
 (5321 baskin-robbins ice-cream 2.0 2243 railroad pittsburg
  contra-costa-county bay-area)
 (5322 baskin-robins-ice-cream-2354 ice-cream 2.0 4493 century-blvd
  pittsburg contra-costa-county bay-area)
 (5323 moms-donuts-&-ice-cream ice-cream 2.0 636 bailey-rd pittsburg
  contra-costa-county bay-area)
 (5324 baskin-robbins ice-cream 2.0 1966 contra-costa-blvd
  pleasant-hill contra-costa-county bay-area)
 (5325 baskin-robbins ice-cream 2.0 260 golf-club-rd pleasant-hill
  contra-costa-county bay-area)
 (5326 tobys-cafe-&-ice-cream ice-cream 2.0 1661 contra-costa-blvd
  pleasant-hill contra-costa-county bay-area)
 (5327 yogurt-clouds ice-cream 2.0 690 gregory-ln pleasant-hill
  contra-costa-county bay-area)
 (5328 sweet-affair-a ice-cream 2.0 1685 santa-rita-rd pleasanton
  alameda-county bay-area)
 (5329 baskin-robbins ice-cream 2.0 3500 bernal-ave-unit-145 pleasanton
  alameda-county bay-area)
 (5330 baskin-robbins ice-cream 2.0 4001 santa-rita-rd-ste-2 pleasanton
  alameda-county bay-area)
 (5331 baskin-robbins ice-cream 2.0 3424 palmer-pl pleasanton
  alameda-county bay-area)
 (5332 dairy-belle-freeze ice-cream 2.0 6003 w-las-positas-blvd
  pleasanton alameda-county bay-area)
 (5333 dairy-belle-freeze ice-cream 2.0 6003 w-las-positas-blvd
  pleasanton alameda-county bay-area)
 (5334 meadowlark-dairy ice-cream 2.0 57 w-neal-st pleasanton
  alameda-county bay-area)
 (5335 sweet-retreat ice-cream 2.0 690 main-st-no.-b pleasanton
  alameda-county bay-area)
 (5336 swensens-ice-cream-&-food ice-cream 1.7 1991 santa-rita-rd-ste-a
  pleasanton alameda-county bay-area)
 (5337 baskin-robbins ice-cream 2.0 2647 washington-ave redwood-city
  san-mateo-county bay-area)
 (5338 dairy-queen ice-cream 2.3 640 woodside-rd redwood-city
  san-mateo-county bay-area)
 (5339 frios-ice-cream-&-coffee-too ice-cream 3.0 980 woodside-rd
  redwood-city san-mateo-county bay-area)
 (5340 woodside-fosters-freeze ice-cream 2.0 865 woodside-rd
  redwood-city san-mateo-county bay-area)
 (5341 halls-ice-cream ice-cream 2.0 124 hazelwood-dr
  south-san-francisco san-mateo-county bay-area)
 (5342 baskin-robbins ice-cream 2.0 9 bayhill-shopping-ctr san-bruno
  san-mateo-county bay-area)
 (5343 baskin-robbins ice-cream 2.0 6 graceland-ln san-carlos
  san-mateo-county bay-area)
 (5344 baskin-robbins ice-cream 1.7 1648 el-camino-real san-carlos
  san-mateo-county bay-area)
 (5345 squires-ice-cream ice-cream 2.0 784 laurel-st san-carlos
  san-mateo-county bay-area)
 (5346 st.-francis ice-cream 3.0 2801 x24th-st san-francisco
  san-francisco-county bay-area)
 (5347 baskin-robbins-31-flavors ice-cream 2.0 5353 almaden-expy
  san-jose santa-clara-county bay-area)
 (5348 baskin-robbins ice-cream 2.0 1025 mazzone-dr san-jose
  santa-clara-county bay-area)
 (5349 baskin-robbins ice-cream 2.0 5647 cottle-rd san-jose
  santa-clara-county bay-area)
 (5350 baskin-robbins ice-cream 2.0 1105 s-white-rd san-jose
  santa-clara-county bay-area)
 (5351 baskin-robbins ice-cream 2.0 2467 forest-ave san-jose
  santa-clara-county bay-area)
 (5352 baskin-robbins ice-cream 2.0 1302 s-winchester-blvd san-jose
  santa-clara-county bay-area)
 (5353 baskin-robbins ice-cream 2.0 1137 saratoga-sunnyvale-rd san-jose
  santa-clara-county bay-area)
 (5354 baskin-robbins ice-cream 2.0 1498 greene-dr san-jose
  santa-clara-county bay-area)
 (5355 baskin-robbins ice-cream 2.0 651 saratoga-ave san-jose
  santa-clara-county bay-area)
 (5356 baskin-robbins ice-cream 2.0 2137 morrill-ave san-jose
  santa-clara-county bay-area)
 (5357 baskin-robbins ice-cream 2.0 7040 santa-teresa-blvd san-jose
  santa-clara-county bay-area)
 (5358 baskin-robbins ice-cream 2.0 3355 quesada-dr san-jose
  santa-clara-county bay-area)
 (5359 big-scoop ice-cream 2.0 1341 redmond-ave san-jose
  santa-clara-county bay-area)
 (5360 dairy-belle-freeze ice-cream 2.0 3060 monterey-hwy san-jose
  santa-clara-county bay-area)
 (5361 dairy-belle-freeze ice-cream 2.0 3110 mckee-rd san-jose
  santa-clara-county bay-area)
 (5362 foster-freeze ice-cream 2.0 698 n-4th-st san-jose
  santa-clara-county bay-area)
 (5363 foster-freeze ice-cream 2.0 2285 mckee-rd san-jose
  santa-clara-county bay-area)
 (5364 fosters-freeze ice-cream 2.0 1645 flickinger-ave san-jose
  santa-clara-county bay-area)
 (5365 grand-olde-ice-cream-parlor ice-cream 2.0 0 unknown san-jose
  santa-clara-county bay-area)
 (5366 jose-foster-freeze ice-cream 2.0 102 willow-st san-jose
  santa-clara-county bay-area)
 (5367 lanies-donuts-n-ice-cream-& ice-cream 2.0 1055 e-capitol-expy
  san-jose santa-clara-county bay-area)
 (5368 loards-ice-cream-store ice-cream 2.0 0 unknown san-jose
  santa-clara-county bay-area)
 (5369 lydons-ice-cream ice-cream 3.0 1345 s-winchester-blvd san-jose
  santa-clara-county bay-area)
 (5370 mello-m-gee-ice-cream-parlor ice-cream 2.0 6950 almaden-expy
  san-jose santa-clara-county bay-area)
 (5371 san-jose-dairy-queen ice-cream 2.0 2170 fruitdale-ave san-jose
  santa-clara-county bay-area)
 (5372 swensens-ice-cream-factory ice-cream 2.0 300
  el-paseo-de-saratoga san-jose santa-clara-county bay-area)
 (5373 swensens-ice-cream ice-cream 2.0 1779 hillsdale-ave san-jose
  santa-clara-county bay-area)
 (5374 swensons-ice-cream-factory ice-cream 2.0 162 oakridge-mall
  san-jose santa-clara-county bay-area)
 (5375 the-fosters-freeze ice-cream 2.0 2935 senter-rd san-jose
  santa-clara-county bay-area)
 (5376 town-&-cntry-ice-cream-yogurt ice-cream 2.0 2980
  stevens-ln-no.-910 san-jose santa-clara-county bay-area)
 (5377 on-the-dot-ice-cream-shoppe ice-cream 2.0 0 unknown
  san-juan-bautista san-benito-county northern-california)
 (5378 dairy-belle-freeze ice-cream 2.0 1766 marina-blvd san-leandro
  alameda-county bay-area)
 (5379 foster-freeze ice-cream 2.0 2601 alvarado-st san-leandro
  alameda-county bay-area)
 (5380 marina-ice-cream-parlor ice-cream 2.0 13700 doolittle-dr-ste-102
  san-leandro alameda-county bay-area)
 (5381 baskin-robbins ice-cream 2.0 15844 hesperian-blvd san-lorenzo
  alameda-county bay-area)
 (5382 baskin-robbins ice-cream 2.0 133 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (5383 baskin-robbins ice-cream 2.0 1809 whitecliff-way san-mateo
  san-mateo-county bay-area)
 (5384 double-rainbow ice-cream 2.0 44 hillsdale-mall san-mateo
  san-mateo-county bay-area)
 (5385 swensens-ice-cream-parlor ice-cream 2.0 1308 w-hillsdale-blvd
  san-mateo san-mateo-county bay-area)
 (5386 baskin-robbins ice-cream 2.0 14444 san-pablo-ave san-pablo
  contra-costa-county bay-area)
 (5387 san-pablo-foster-freeze ice-cream 2.0 1890 x23rd-st san-pablo
  contra-costa-county bay-area)
 (5388 baskin-robbins ice-cream 2.0 2005 crow-canyon-pl-no.-156
  san-ramon contra-costa-county bay-area)
 (5389 fosters-freeze ice-cream 2.0 9260 alcosta-blvd-ste-a5 san-ramon
  contra-costa-county bay-area)
 (5390 the-country-scoop ice-cream 2.0 3327 montevideo-dr san-ramon
  contra-costa-county bay-area)
 (5391 baskin-robbins ice-cream 2.0 3591 homestead-rd santa-clara
  santa-clara-county bay-area)
 (5392 dairy-belle-freeze ice-cream 2.0 3438 el-camino-real santa-clara
  santa-clara-county bay-area)
 (5393 dairy-belle-freeze ice-cream 2.0 890 aldo-ave santa-clara
  santa-clara-county bay-area)
 (5394 real-ice-cream ice-cream 2.8 3077 el-camino-real santa-clara
  santa-clara-county bay-area)
 (5395 time-donuts-&-ice-cream ice-cream 2.0 2325
  el-camino-real-no.-103 santa-clara santa-clara-county bay-area)
 (5396 donatellos-gelato ice-cream 2.0 113 walnut-ave santa-cruz
  santa-cruz-county bay-area)
 (5397 foster-freeze ice-cream 2.0 229 laurel-st santa-cruz
  santa-cruz-county bay-area)
 (5398 fosters-freeze ice-cream 2.0 1836 soquel-ave santa-cruz
  santa-cruz-county bay-area)
 (5399 polar-bear-ice-cream ice-cream 2.0 389 coral-st santa-cruz
  santa-cruz-county bay-area)
 (5400 baskin-robbins ice-cream 2.0 19227 gunther-ct saratoga
  santa-clara-county bay-area)
 (5401 baskin-robbins ice-cream 2.0 19768 solana-dr saratoga
  santa-clara-county bay-area)
 (5402 haagen-dazs-ice-cream-shoppe ice-cream 2.0 0 unknown saratoga
  santa-clara-county bay-area)
 (5403 baskin-robbins ice-cream 2.0 0 unknown scotts-valley unknown
  bay-area)
 (5404 caseys-ice-cream-parlor ice-cream 2.0 224 mount-hermon-rd-no.-a
  scotts-valley unknown bay-area)
 (5405 kimos-favor-islnd-food-cake ice-cream 2.0 258 sunset-ave
  suisun-city solano-county bay-area)
 (5406 baskin-robbins ice-cream 2.0 744 s-wolfe-rd sunnyvale
  santa-clara-county bay-area)
 (5407 dairy-belle ice-cream 2.0 736 n-mathilda-ave sunnyvale
  santa-clara-county bay-area)
 (5408 dairy-belle-freeze ice-cream 3.0 1323 sunnyvale-saratoga-rd
  sunnyvale santa-clara-county bay-area)
 (5409 newark-swensen-ice-cream-facto ice-cream 2.0 1031 bryant-way
  sunnyvale santa-clara-county bay-area)
 (5410 the-ice-cream-store ice-cream 2.0 1111 w-el-camino-real
  sunnyvale santa-clara-county bay-area)
 (5411 baskin-robbins ice-cream 2.0 1613 decoto-rd union-city
  alameda-county bay-area)
 (5412 baskin-robbins ice-cream 2.0 31848 alvarado-blvd union-city
  alameda-county bay-area)
 (5413 x2001-flavors ice-cream 2.0 137 plaza-dr-no.-313 vallejo
  solano-county bay-area)
 (5414 baskin-robbins ice-cream 2.0 5182 sonoma-blvd vallejo
  solano-county bay-area)
 (5415 dairy-queen ice-cream 2.0 2120 springs-rd vallejo solano-county
  bay-area)
 (5416 dairyland ice-cream 2.0 818 tennessee-st vallejo solano-county
  bay-area)
 (5417 fosters-freeze ice-cream 2.0 1143 tennessee-st vallejo
  solano-county bay-area)
 (5418 baskin-robbins ice-cream 2.0 1550 newell-ave walnut-creek
  contra-costa-county bay-area)
 (5419 fosters-freeze ice-cream 2.0 2300 n-main-st walnut-creek
  contra-costa-county bay-area)
 (5420 gourmet-hut-&-ice-cream ice-cream 2.0 2977 ygnacio-valley-rd
  walnut-creek contra-costa-county bay-area)
 (5421 h-&-e-double-rainbow-ice-cream ice-cream 2.0 2305 lomond-ln
  walnut-creek contra-costa-county bay-area)
 (5422 dairy-queen ice-cream 2.0 130 e-lake-ave watsonville
  santa-cruz-county bay-area)
 (5423 tiffanys-ice-cream-oriental ice-cream 2.0 640 port-chicago-hwy
  west-pittsburg contra-costa-county bay-area)
 (5424 cotati-freeze ice-cream 2.0 7764 old-redwood-hwy cotati
  sonoma-county bay-area)
 (5425 big-chill-yogurt-&-ice-cream-northgate-plaza ice-cream 2.0 424
  las-gallinas-ave san-rafael marin-county bay-area)
 (5426 ice-cream-&-shoe ice-cream 2.0 1055 las-ovejas-ave san-rafael
  marin-county bay-area)
 (5427 orcas-killer-ice-cream ice-cream 2.0 767 lincoln-ave san-rafael
  marin-county bay-area)
 (5428 silbermanns-ice-cream ice-cream 2.0 196 northgate-one san-rafael
  marin-county bay-area)
 (5429 wholly-cow-ice-cream ice-cream 2.0 1111 francisco-blvd-e
  san-rafael marin-county bay-area)
 (5430 clos-ice-creamery ice-cream 2.0 901 village-ct santa-rosa
  sonoma-county bay-area)
 (5431 d-n-ys-ice-cream ice-cream 2.0 2790 santa-rosa-ave santa-rosa
  sonoma-county bay-area)
 (5432 schwans-ice-cream-&-frozen-foods ice-cream 2.0 440 e-todd-rd
  santa-rosa sonoma-county bay-area)
 (5433 fosters-freeze-of-sebastopo ice-cream 2.0 935 gravenstein-hwy-s
  sebastopol sonoma-county bay-area)
 (5434 buds-ice-cream-&-yogurt ice-cream 2.8 1 blackfield-dr
  belvedere-tiburon marin-county bay-area)
 (5435 paradise-hamburgers-&-ice-cream ice-cream 2.0 1694 tiburon-blvd
  belvedere-tiburon marin-county bay-area)
 (5436 ben-&-jerrys-ice-cream ice-cream 2.0 1480 haight-st
  san-francisco san-francisco-county bay-area)
 (5437 gelato-classico-ice-cream-shop ice-cream 2.7 2223 chestnut-st
  san-francisco san-francisco-county bay-area)
 (5438 halls-ice-cream ice-cream 2.0 124 hazelwood-dr
  south-san-francisco san-mateo-county bay-area)
 (5439 happy-valley-italian-ice-cream ice-cream 2.0 1305 sutter-st
  san-francisco san-francisco-county bay-area)
 (5440 honey-bee-ice-cream ice-cream 2.0 984 market-st san-francisco
  san-francisco-county bay-area)
 (5441 ice-cream-cafe-the ice-cream 2.0 536 davis-st san-francisco
  san-francisco-county bay-area)
 (5442 joes-ice-cream ice-cream 2.0 5351 geary-blvd san-francisco
  san-francisco-county bay-area)
 (5443 marco-polo-italin-ice-cream ice-cream 2.0 1447 taraval-st
  san-francisco san-francisco-county bay-area)
 (5444 mitchells-ice-cream ice-cream 3.0 688 san-jose-ave san-francisco
  san-francisco-county bay-area)
 (5445 miyako-old-fashioned-ice-cream ice-cream 2.0 1470 fillmore-st
  san-francisco san-francisco-county bay-area)
 (5446 breyers-ice-cream ice-cream 2.0 39 pier san-francisco
  san-francisco-county bay-area)
 (5447 polly-ann-ice-cream ice-cream 2.0 3142 noriega-st san-francisco
  san-francisco-county bay-area)
 (5448 rorys-twisted-scoop-ice-cream ice-cream 2.0 1300 castro-st
  san-francisco san-francisco-county bay-area)
 (5449 rorys-twisted-scoop-ice-cream ice-cream 3.0 2015 fillmore-st
  san-francisco san-francisco-county bay-area)
 (5450 t-j-pizza-&-ice-cream-parlor ice-cream 2.0 2842 diamond-st
  san-francisco san-francisco-county bay-area)
 (5451 thirty-one-flavors-ice-cream ice-cream 2.0 1804 polk-st
  san-francisco san-francisco-county bay-area)
 (5452 uncle-gaylords-ice-cream-cafe ice-cream 2.0 721 irving-st
  san-francisco san-francisco-county bay-area)
 (5453 yang-photo-&-ice-cream ice-cream 2.0 1108 market-st
  san-francisco san-francisco-county bay-area)
 (5454 haagen-dazs-ice-cream-shoppe ice-cream 2.0 203 univerisity-ave
  palo-alto santa-clara-county bay-area)
 (5455 max-scoop ice-cream 2.0 0 ave palo-alto santa-clara-county
  bay-area)
 (5456 stanford-ice-cream-&-yogurt ice-cream 2.7 341 santa-cruz
  menlo-park san-mateo-county bay-area)
 (5457 double-rainbow ice-cream 3.8 520 ramona palo-alto
  santa-clara-county bay-area)
 (5458 swensens-ice-cream ice-cream 2.0 0 unknown palo-alto
  santa-clara-county bay-area)
 (5459 sweet-retreat-ice-cream-parlor ice-cream 3.0 0
  of-cahalan-ave-and-santa-teresa-blvd. san-jose santa-clara-county
  bay-area)
 (5460 india-palace indian 3.3 737 buena-vista-ave alameda
  alameda-county bay-area)
 (5461 sagar-indian-restaurant indian 2.7 1400 el-camino-real belmont
  san-mateo-county bay-area)
 (5462 ajanta indian 3.8 1888 solano-ave berkeley alameda-county
  bay-area)
 (5463 bombay-cuisine indian 2.0 2006 x9th-st berkeley alameda-county
  bay-area)
 (5464 india-pavilion indian 2.7 2914 college-ave berkeley
  alameda-county bay-area)
 (5465 mother-india-restaurant indian 2.8 1459 university-ave berkeley
  alameda-county bay-area)
 (5466 new-delhi-junction indian 2.7 2556 telegraph-ave berkeley
  alameda-county bay-area)
 (5467 pasand indian 1.8 2286 shattuck-ave berkeley alameda-county
  bay-area)
 (5468 raja-indian-cuisine indian 3.2 2160 university-ave berkeley
  alameda-county bay-area)
 (5469 restoran-rasa-sayang indian 2.2 1902 university-ave berkeley
  alameda-county bay-area)
 (5470 shilpa-india-restaurant indian 2.0 2175 allston-way berkeley
  alameda-county bay-area)
 (5471 sujatha indian 1.4 48 shattuck-sq-no.-99 berkeley alameda-county
  bay-area)
 (5472 taj-express indian 1.3 2012 shattuck-ave berkeley alameda-county
  bay-area)
 (5473 dasa-prakash indian 3.8 11321 e.183rd-st. cerritos
  los-angeles-county los-angeles-area)
 (5474 swagat-indian-cuisine indian 3.0 1901 salvio-st concord
  contra-costa-county bay-area)
 (5475 prince-india-restaurant indian 2.5 6830 village-pky dublin
  alameda-county bay-area)
 (5476 shan-india-cuisine indian 2.0 5901 christie-ave-ste-207
  emeryville alameda-county bay-area)
 (5477 imperial-tandoori-restaurant indian 2.0 2617 n-texas-st-no.-a
  fairfield solano-county bay-area)
 (5478 india-mahal-restaurant indian 2.1 3790 mowry-ave fremont
  alameda-county bay-area)
 (5479 sarovar-indian-causine indian 2.0 44018 geddy-ct fremont
  alameda-county bay-area)
 (5480 savera-india-restaurant-&-swee indian 2.0 34145
  fremont-blvd-no.-a8 fremont alameda-county bay-area)
 (5481 taste-of-india indian 2.6 5144 mowry-ave fremont alameda-county
  bay-area)
 (5482 moonlight-india-cuisine indian 3.2 22532 foothill-blvd hayward
  alameda-county bay-area)
 (5483 passage-to-india indian 2.3 38 los-altos-sq los-altos
  santa-clara-county bay-area)
 (5484 mount-everest-fine-indian-cuis indian 3.0 412 n-santa-cruz-ave
  los-gatos santa-clara-county bay-area)
 (5485 swagat-india-cuisine indian 3.1 68 s-abel-st milpitas
  santa-clara-county bay-area)
 (5486 amber-india-restaurant indian 3.3 0 camino-real mountain-view
  santa-clara-county bay-area)
 (5487 india-cookhouse indian 2.2 288 castro-st mountain-view
  santa-clara-county bay-area)
 (5488 mumtaj-indian-cusine indian 2.7 126 castro-st mountain-view
  santa-clara-county bay-area)
 (5489 sues-indian-cuisine indian 3.3 216 castro-st. mountain-view
  santa-clara-county bay-area)
 (5490 swagat-indian-cuisine indian 3.5 2700 west-el-camino-real
  mountain-view santa-clara-county bay-area)
 (5491 taj-mahal-indian-cuisine indian 3.1 185 castro-st mountain-view
  santa-clara-county bay-area)
 (5492 bombay-wala-indian-cuisine indian 2.0 2042 macarthur-blvd
  oakland alameda-county bay-area)
 (5493 hawa-mehal indian 2.0 1400 franklin-st oakland alameda-county
  bay-area)
 (5494 royal-india-cuisine indian 2.0 1400 franklin-st oakland
  alameda-county bay-area)
 (5495 sabina-india-cuisine indian 2.7 1628 webster-st oakland
  alameda-county bay-area)
 (5496 janta indian 3.2 369 lytton-ave palo-alto santa-clara-county
  bay-area)
 (5497 shaikhs-india-foods indian 2.0 393 s-california-ave palo-alto
  santa-clara-county bay-area)
 (5498 kababish-indian-cuisine indian 2.0 337 railroad pittsburg
  contra-costa-county bay-area)
 (5499 royal-taj-cuisine-of-india indian 2.0 4555 hopyard-rd-ste-5
  pleasanton alameda-county bay-area)
 (5500 khyber-india indian 2.8 846 jefferson-ave-no.-d redwood-city
  san-mateo-county bay-area)
 (5501 gaylord-india-restaurant indian 2.8 1 embarcadero-center
  san-francisco san-francisco-county bay-area)
 (5502 gaylord-india-restaurant indian 2.6 0 square san-francisco
  san-francisco-county bay-area)
 (5503 india-house-restaurant indian 3.0 350 jackson san-francisco
  san-francisco-county bay-area)
 (5504 maharani-restaurant indian 3.2 1122 post san-francisco
  san-francisco-county bay-area)
 (5505 mela-indian-restaurant indian 2.0 417 ofarrell san-francisco
  san-francisco-county bay-area)
 (5506 moghul-india-cuisine indian 2.0 1956 x12-lombard san-francisco
  san-francisco-county bay-area)
 (5507 new-delhi-restaurant indian 2.3 160 ellis san-francisco
  san-francisco-county bay-area)
 (5508 north-india-restaurant indian 3.5 3131 webster san-francisco
  san-francisco-county bay-area)
 (5509 pasand-madras-cuisine indian 2.6 1875 union san-francisco
  san-francisco-county bay-area)
 (5510 scenic-india-restaurant indian 2.3 532 valencia san-francisco
  san-francisco-county bay-area)
 (5511 sir-taj-indian-cuisine indian 2.0 48 x5th san-francisco
  san-francisco-county bay-area)
 (5512 the-ganges indian 3.4 775 frederick san-francisco
  san-francisco-county bay-area)
 (5513 zantes indian 2.4 3489 mission-st. san-francisco
  san-francisco-county bay-area)
 (5514 jewel-of-india indian 2.7 2634 alum-rock-avenue san-jose
  santa-clara-county bay-area)
 (5515 raj-palace indian 2.0 2843 s-white-rd san-jose
  santa-clara-county bay-area)
 (5516 sues-indian-cusine indian 2.8 895 willow-st san-jose
  santa-clara-county bay-area)
 (5517 taj-palace indian 2.0 484 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (5518 gandhi-indian-restaurant indian 2.1 2299 s-el-camino-real
  san-mateo san-mateo-county bay-area)
 (5519 royal-taj indian 2.0 5155 stevens-creek-blvd santa-clara
  santa-clara-county bay-area)
 (5520 sanraj-india-cuisine indian 1.7 3650 el-camino-real santa-clara
  santa-clara-county bay-area)
 (5521 sanraj-india-cuisine indian 1.7 3660 el-camino-real santa-clara
  santa-clara-county bay-area)
 (5522 sarovar indian 2.7 544 lawrence-expressway santa-clara
  santa-clara-county bay-area)
 (5523 shilpa-south-indian-restaurant indian 2.2 3530 el-camino-real
  santa-clara santa-clara-county bay-area)
 (5524 sues-indian-cusine indian 2.0 1700 civic-center-dr-apt-402
  santa-clara santa-clara-county bay-area)
 (5525 the-empress-of-india indian 3.5 3426 el-camino-real santa-clara
  santa-clara-county bay-area)
 (5526 india-joze indian 3.3 1001 center-st santa-cruz
  santa-cruz-county bay-area)
 (5527 royal-taj indian 2.5 270 soquel-ave santa-cruz santa-cruz-county
  bay-area)
 (5528 avatars indian 3.7 0 unknown sausalito unknown bay-area)
 (5529 royal-taj indian 2.0 2525 s-main-st soquel unknown bay-area)
 (5530 pick-n-move-indian-restaurant indian 3.0 1214 apollo-way-no.-404
  sunnyvale santa-clara-county bay-area)
 (5531 sarovar-indian-restaurant indian 2.3 0 expwy-just-south-of-101
  sunnyvale santa-clara-county bay-area)
 (5532 sneha indian 2.3 1214 apollo-way-suite-404b sunnyvale
  santa-clara-county bay-area)
 (5533 taj-india-cuisine indian 2.8 889 e-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (5534 cafe-india indian 2.3 1521 n-main-st walnut-creek
  contra-costa-county bay-area)
 (5535 bombay-oven indian 2.6 20803 stevens-creek-blvd. cupertino
  santa-clara-county bay-area)
 (5536 alkas-indian-gourmet indian 2.5 2550 san-ramon-valley-blvd
  san-ramon contra-costa-county bay-area)
 (5537 maharani-restaurant indian 2.0 1025 university-ave berkeley
  alameda-county bay-area)
 (5538 india-palace-restaurant indian 2.0 707 redwood-hwy mill-valley
  marin-county bay-area)
 (5539 sizzling-tandoor indian 3.2 409 mendocino-ave santa-rosa
  sonoma-county bay-area)
 (5540 taj-mahal indian 2.8 535 ross-st santa-rosa sonoma-county
  bay-area)
 (5541 sizzling-tandoor indian 2.0 9960 highway-1 sebastopol
  sonoma-county bay-area)
 (5542 indian-mela-restaurant indian 2.0 417 ofarrell-st san-francisco
  san-francisco-county bay-area)
 (5543 indian-oven-restaurant indian 2.7 237 fillmore-st san-francisco
  san-francisco-county bay-area)
 (5544 new-delhi-restaurant indian 2.0 160 ellis-st san-francisco
  san-francisco-county bay-area)
 (5545 vishal-indian-restaurant indian 3.0 5625 geary-blvd
  san-francisco san-francisco-county bay-area)
 (5546 meenas-cuisine-of-india indian 2.6 5255 mowry fremont
  alameda-county bay-area)
 (5547 little-india indian 2.7 2606 broadway redwood-city
  san-mateo-county bay-area)
 (5548 sargam-indian-cuisine indian 4.0 140 n.-civic-dr. walnut-creek
  contra-costa-county bay-area)
 (5549 darbar-indian-restaurant indian 2.8 129 lytton-avenue palo-alto
  santa-clara-county bay-area)
 (5550 cafe-bombay indian 3.4 400 valley-way milpitas
  santa-clara-county bay-area)
 (5551 passage-to-india indian 2.8 1100 w.-el-camino-real mountain-view
  santa-clara-county bay-area)
 (5552 saysetha-restaurant indian 2.3 nil nil oakland alameda-county
  bay-area)
 (5553 kamal-palace indian 3.0 641 vallejo-st san-francisco
  san-francisco-county bay-area)
 (5554 rasoi indian 3.4 1037 valencia-st.-near-21st-st san-francisco
  san-francisco-county bay-area)
 (5555 pakistan-cuisine indian 2.7 0 ave-south-of-coe. san-jose
  santa-clara-county bay-area)
 (5556 star-india indian 2.7 3721 geary san-francisco
  san-francisco-county bay-area)
 (5557 india-palace indian 2.7 236 castro-st. mountain-view
  santa-clara-county bay-area)
 (5558 swarna indian 2.7 1690 locust walnut-creek contra-costa-county
  bay-area)
 (5559 samrat indian 2.8 20956 homestead-rd cupertino
  santa-clara-county bay-area)
 (5560 clay-oven indian 2.6 78 east-3rd-avenue san-mateo
  san-mateo-county bay-area)
 (5561 shalimar-indian-resturant indian 3.4 0
  between-greary-and-ofarrell san-francisco san-francisco-county
  bay-area)
 (5562 sargam-indian-cuisine indian 3.0 7467 village-parkway dublin
  alameda-county bay-area)
 (5563 cable-car-indian-restaurant indian 3.6 1040 columbus
  san-fransisco nil nil)
 (5564 indonesia-restaurant indonesian 3.2 678 post san-francisco
  san-francisco-county bay-area)
 (5565 jakarta-indonesian-cuisine indonesian 3.5 615 balboa
  san-francisco san-francisco-county bay-area)
 (5566 java-restaurant indonesian 2.3 417 clement san-francisco
  san-francisco-county bay-area)
 (5567 indonesian-kitchen-restaurant indonesian 2.0 4041 judah-st
  san-francisco san-francisco-county bay-area)
 (5568 the-rice-table-restaurant indonesian 2.3 1617 fourth-st
  san-rafael marin-county bay-area)
 (5569 world-wraps international 2.6 201 university-ave palo-alto
  santa-clara-county bay-area)
 (5570 zazoos international 2.3 0 london-villiage oakland
  alameda-county bay-area)
 (5571 sunset-restaurant irish 2.0 1243 noriega san-francisco
  san-francisco-county bay-area)
 (5572 nutty-irishman-the irish 2.3 995 pine-rd santa-rosa
  sonoma-county bay-area)
 (5573 murphys-irish-pub irish 2.0 464 st sonoma sonoma-county
  bay-area)
 (5574 blarney-stone-bar-&-restaurant irish 2.0 5701 geary-blvd
  san-francisco san-francisco-county bay-area)
 (5575 oconnells irish 2.0 518 bryant palo-alto santa-clara-county
  bay-area)
 (5576 okanes irish 2.7 200 montgomery-st san-ramon contra-costa-county
  bay-area)
 (5577 shenanigans irish 2.0 30 jack-london-square oakland
  alameda-county bay-area)
 (5578 giovellis italian 2.0 0 o-box-4025-156 alameda alameda-county
  bay-area)
 (5579 veneto-cucina-ristorante italian 2.0 2337 blanding-ave alameda
  alameda-county bay-area)
 (5580 iuliano italian 2.0 150 rancho-del-mar aptos santa-cruz-county
  bay-area)
 (5581 t-castagnola-pasta italian 3.0 2039 ralston-ave belmont
  san-mateo-county bay-area)
 (5582 caffe-giovanni italian 2.9 2420 shattuck-ave berkeley
  alameda-county bay-area)
 (5583 fontina italian 2.0 0 &-virginia berkeley alameda-county
  bay-area)
 (5584 ginos italian 2.0 2629 ashby-ave berkeley alameda-county
  bay-area)
 (5585 panini italian 3.0 2115 allston-way berkeley alameda-county
  bay-area)
 (5586 rivoli-restaurant italian 4.0 1539 solano-ave berkeley
  alameda-county bay-area)
 (5587 salerno-restaurant italian 2.3 2468 shattuck-ave berkeley
  alameda-county bay-area)
 (5588 trevinos italian 2.7 1235 san-pablo-ave berkeley alameda-county
  bay-area)
 (5589 venezia italian 2.8 1799 university-ave berkeley alameda-county
  bay-area)
 (5590 venezia italian 3.5 1799 university-ave berkeley alameda-county
  bay-area)
 (5591 caffe-bacio italian 2.0 313 oak-st brentwood contra-costa-county
  bay-area)
 (5592 ercolinis-pasta-bravo italian 3.0 216 california-dr burlingame
  san-mateo-county bay-area)
 (5593 kuletos-trattoria italian 2.9 1095 rollins-rd-no.-200 burlingame
  san-mateo-county bay-area)
 (5594 milanos-italian-kitchen italian 2.0 1818 gilbreth-rd burlingame
  san-mateo-county bay-area)
 (5595 sams-italian-sandwich italian 2.0 297 california-dr burlingame
  san-mateo-county bay-area)
 (5596 boskos-ristorante italian 2.6 1364 lincoln-ave calistoga
  napa-county napa-valley)
 (5597 wappo-bar-&-bistro italian 3.0 1226 washington-st-ste-b
  calistoga napa-county napa-valley)
 (5598 al-castello-ristorante-&-pizzeria italian 2.8 3155
  south-bascom-avenue campbell santa-clara-county bay-area)
 (5599 di-ciccos-italian-restaurant italian 2.8 2509 s-bascom-ave
  campbell santa-clara-county bay-area)
 (5600 giuseppe-italian-restaurant italian 3.0 33 s-central-ave
  campbell santa-clara-county bay-area)
 (5601 love-italian-chickn-pasta-& italian 2.0 3155 s-bascom-ave-no.-b
  campbell santa-clara-county bay-area)
 (5602 fiorellas italian 2.0 911 capitola-ave-no.-a capitola unknown
  bay-area)
 (5603 sbarro-italian-eatery italian 2.0 1855 x41st-ave capitola
  unknown bay-area)
 (5604 tonys-cafe-des-artes italian 2.0 316 capitola-ave capitola
  unknown bay-area)
 (5605 dinos-restaurant italian 2.3 3600 castro-valley-blvd
  castro-valley alameda-county bay-area)
 (5606 pasta-paeddler italian 2.7 3837 castro-valley-blvd castro-valley
  alameda-county bay-area)
 (5607 sazio-ristorante-italiano italian 3.5 20400 lake-chabot-rd
  castro-valley alameda-county bay-area)
 (5608 ciao-cafe italian 2.0 1825 sutter-st concord contra-costa-county
  bay-area)
 (5609 kathys-bistro italian 2.0 4668 deercreek-ln concord
  contra-costa-county bay-area)
 (5610 paisano-restaurant italian 1.7 1140 lane concord
  contra-costa-county bay-area)
 (5611 pasta-primavera-cafe italian 3.0 4425 treat-blvd-ste-f concord
  contra-costa-county bay-area)
 (5612 peppinos italian 2.0 1508 kirker-pass-rd concord
  contra-costa-county bay-area)
 (5613 florentine-italian-foods italian 3.3 10275 s-de-anza-blvd
  cupertino santa-clara-county bay-area)
 (5614 fontanas italian 3.0 20840 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (5615 mondello-ristorante-italiano italian 3.4 20343
  stevens-creek-blvd cupertino santa-clara-county bay-area)
 (5616 sbarro italian 2.0 10348 n-wolfe-rd cupertino santa-clara-county
  bay-area)
 (5617 joes-of-westlake italian 2.2 11 glenwood-ave daly-city
  san-mateo-county bay-area)
 (5618 allegro-restaurant italian 3.1 267 hartz-ave danville
  contra-costa-county bay-area)
 (5619 la-scala italian 2.0 3459 blackhawk-plaza-cir danville
  contra-costa-county bay-area)
 (5620 lotsa-pasta italian 2.8 171 hartz-ave danville
  contra-costa-county bay-area)
 (5621 pastavino italian 3.1 111 town-and-country-dr danville
  contra-costa-county bay-area)
 (5622 the-great-impasta italian 2.0 318 sycamore-valley-rd-w danville
  contra-costa-county bay-area)
 (5623 buccis italian 3.8 6121 hollis-st emeryville alameda-county
  bay-area)
 (5624 olive-garden-italian-restaurant italian 2.0 1300 gateway-blvd
  fairfield solano-county bay-area)
 (5625 pietro italian 2.0 711 madison-st fairfield solano-county
  bay-area)
 (5626 mama-capones italian 2.0 6250 highway-9 felton unknown bay-area)
 (5627 mama-mia italian 3.2 6231 graham-hill-rd. felton unknown
  bay-area)
 (5628 florentine-rstrnt-&-pasta-mkt italian 2.5 5141 mowry-ave fremont
  alameda-county bay-area)
 (5629 mas-restaurant italian 2.4 5200 mowry-ave fremont alameda-county
  bay-area)
 (5630 otis-scalise-coffee-shop-alame italian 2.7 42249 forsythia-dr
  fremont alameda-county bay-area)
 (5631 pasta-presto italian 2.0 40723 grimmer-blvd fremont
  alameda-county bay-area)
 (5632 vincenza italian 2.8 35760 fremont-blvd fremont alameda-county
  bay-area)
 (5633 joes-ristorante-italiano italian 2.2 1360 x1st-st gilroy
  santa-clara-county bay-area)
 (5634 pasta-moon italian 3.3 315 main-st half-moon-bay
  san-mateo-county bay-area)
 (5635 bancheros-italian-dinners italian 2.9 20102 mission-blvd hayward
  alameda-county bay-area)
 (5636 la-cocina-restaurant italian 2.3 467 jackson-st hayward
  alameda-county bay-area)
 (5637 patissie-francaise italian 2.0 22521 main-st hayward
  alameda-county bay-area)
 (5638 rene-j-marcotte-restaurant italian 2.0 24131 mission-blvd
  hayward alameda-county bay-area)
 (5639 the-olive-garden-italian-rest italian 2.6 24688 hesperian-blvd
  hayward alameda-county bay-area)
 (5640 the-sicilian-restaurant italian 2.0 846 b-st hayward
  alameda-county bay-area)
 (5641 confetti-restaurant-&-pasta italian 2.0 3196 lucas-cir lafayette
  contra-costa-county bay-area)
 (5642 flavios-pasta-forum-inc italian 2.3 3604 mount-diablo-blvd
  lafayette contra-costa-county bay-area)
 (5643 papa-charlies-italian-dnr/piz italian 2.0 5 smoke-tree-ct
  lafayette contra-costa-county bay-area)
 (5644 plaza-bistro italian 2.3 3685 mount-diablo-blvd-ste-120
  lafayette contra-costa-county bay-area)
 (5645 spruzzo italian 2.9 210 lafayette-cir lafayette
  contra-costa-county bay-area)
 (5646 gios-trattoria italian 3.7 2220 first-st livermore
  alameda-county bay-area)
 (5647 american-italian-delicatessen italian 2.6 139 main-st los-altos
  santa-clara-county bay-area)
 (5648 florentine-restaurant italian 2.0 4546 el-camino-real los-altos
  santa-clara-county bay-area)
 (5649 piccolo-mondo italian 3.2 4926 el-camino-real los-altos
  santa-clara-county bay-area)
 (5650 fish-again-&-pasta-too italian 2.0 50 university-ave-ste-38
  los-gatos santa-clara-county bay-area)
 (5651 strings-the-pasta-place italian 2.0 0 unknown los-gatos
  santa-clara-county bay-area)
 (5652 valerianos-ristorante italian 3.6 160 w-main-st los-gatos
  santa-clara-county bay-area)
 (5653 dimaggios-restaurant italian 2.0 701 main-st martinez
  contra-costa-county bay-area)
 (5654 louie-bertolas italian 2.3 611 escobar-st martinez
  contra-costa-county bay-area)
 (5655 strings-pasta-cafe italian 2.0 309 warmcastle-ct martinez
  contra-costa-county bay-area)
 (5656 fontanas-italian italian 3.0 1850 el-camino-real menlo-park
  san-mateo-county bay-area)
 (5657 florentine-restaurant italian 2.7 118 castro-st mountain-view
  santa-clara-county bay-area)
 (5658 gelato-classic-italian-ice-cre italian 2.0 2025 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (5659 palominos italian 2.0 933 freeway-dr napa napa-county
  napa-valley)
 (5660 pighinis-calif-pasta italian 2.0 2161 sandra-dr napa napa-county
  napa-valley)
 (5661 ruffinos italian 2.0 645 x1st-st napa napa-county napa-valley)
 (5662 spaghetti-western italian 2.0 1508 meek-ave napa napa-county
  napa-valley)
 (5663 villa-romano-restaurant italian 2.7 1011 soscol-rd napa
  napa-county napa-valley)
 (5664 fellini-o italian 2.8 3900 new-park-mall-rd newark
  alameda-county bay-area)
 (5665 bella-napoli italian 2.0 2330 telegraph-ave oakland
  alameda-county bay-area)
 (5666 big-stuff-pizza-&-pasta italian 2.0 3100 high-st oakland
  alameda-county bay-area)
 (5667 ciao-bambino/pronto-expresso italian 2.0 3306 lakeshore-ave
  oakland alameda-county bay-area)
 (5668 francescos italian 2.8 8520 pardee-dr oakland alameda-county
  bay-area)
 (5669 il-fornaio italian 2.0 2059 mountain-blvd oakland alameda-county
  bay-area)
 (5670 italian-colors italian 3.5 2220 mountain-blvd-ste-100 oakland
  alameda-county bay-area)
 (5671 italian-house italian 2.0 1532 san-pablo-ave oakland
  alameda-county bay-area)
 (5672 little-bistro italian 2.0 1464 webster-st oakland alameda-county
  bay-area)
 (5673 oliveto-cafe-&-restaurant italian 2.9 5655 college-ave oakland
  alameda-county bay-area)
 (5674 pastino italian 2.7 4207 park-blvd oakland alameda-county
  bay-area)
 (5675 spretto italian 3.1 3355 lakeshore-ave oakland alameda-county
  bay-area)
 (5676 the-pasta-shop italian 2.0 5655 college-ave oakland
  alameda-county bay-area)
 (5677 ti-bacio-restorante italian 2.5 5912 college-ave oakland
  alameda-county bay-area)
 (5678 via-venero-restaurant italian 2.0 5356 college-ave oakland
  alameda-county bay-area)
 (5679 vitos-italian-delicatessen italian 2.7 3953 piedmont-ave oakland
  alameda-county bay-area)
 (5680 zzas-trattoria italian 2.8 552 grand-ave oakland alameda-county
  bay-area)
 (5681 lanzone-alexander-restaurant italian 2.3 65 moraga-way orinda
  contra-costa-county bay-area)
 (5682 pasta-cuisine italian 2.8 0 unknown orinda contra-costa-county
  bay-area)
 (5683 viva-italiano italian 2.8 67 aura-vista-dr pacifica
  san-mateo-county bay-area)
 (5684 babbos italian 2.6 717 stanford-shopping-ctr palo-alto
  santa-clara-county bay-area)
 (5685 cafe-pro-bono italian 3.6 2437 birch-st palo-alto
  santa-clara-county bay-area)
 (5686 cenzos italian 2.8 233 university-ave palo-alto
  santa-clara-county bay-area)
 (5687 florentine-italian-foods italian 2.6 560 waverley-st palo-alto
  santa-clara-county bay-area)
 (5688 fontanas-italian italian 2.0 1058 elwell-ct palo-alto
  santa-clara-county bay-area)
 (5689 formicos-italian-rest italian 3.3 2115 saint-francis-dr
  palo-alto santa-clara-county bay-area)
 (5690 il-fornaio italian 3.2 520 cowper-st palo-alto
  santa-clara-county bay-area)
 (5691 il-fornaio-bakery italian 3.2 388 university-ave palo-alto
  santa-clara-county bay-area)
 (5692 osteria italian 3.4 247 hamilton-ave palo-alto
  santa-clara-county bay-area)
 (5693 palermo-rotisserie italian 2.9 452 university-ave palo-alto
  santa-clara-county bay-area)
 (5694 cafe-giostra italian 2.5 1390 n.mcdowell-no.l petaluma
  sonoma-county bay-area)
 (5695 fino-cucina-italiana italian 2.5 208 petaluma-boulevard-north
  petaluma sonoma-county bay-area)
 (5696 luigis-tavern italian 2.0 1569 kingsly-dr pittsburg
  contra-costa-county bay-area)
 (5697 padrinos-restaurant italian 2.0 745 railroad pittsburg
  contra-costa-county bay-area)
 (5698 delatorres-restaurant italian 2.7 6025 w-las-positas-blvd
  pleasanton alameda-county bay-area)
 (5699 maestros italian 3.2 5100 hopyard-rd pleasanton alameda-county
  bay-area)
 (5700 pasta-villa-cafe italian 3.0 405 main-st. pleasanton
  alameda-county bay-area)
 (5701 strings-the-pasta-place italian 1.7 4555 hopyard-rd-ste-25
  pleasanton alameda-county bay-area)
 (5702 strizzis italian 2.9 649 main-st pleasanton alameda-county
  bay-area)
 (5703 florentine-italian-foods italian 2.3 2525 el-camino-real
  redwood-city san-mateo-county bay-area)
 (5704 natales-italian-restaurant italian 2.0 593 woodside-rd
  redwood-city san-mateo-county bay-area)
 (5705 pazzo italian 3.0 2616 broadway redwood-city san-mateo-county
  bay-area)
 (5706 franciscos-restaurant italian 2.0 230 x2nd-st richmond
  contra-costa-county bay-area)
 (5707 pregos italian 2.0 151 park-pl. richmond contra-costa-county
  bay-area)
 (5708 salute-ristorante-at-marina-bay italian 2.7 1900
  esplanade-dr-suite-100 richmond contra-costa-county bay-area)
 (5709 buon-gusto-restaurant italian 2.5 224 grand-ave
  south-san-francisco san-mateo-county bay-area)
 (5710 papa-joes-italian-dinners italian 1.7 414 hemlock-ave
  south-san-francisco san-mateo-county bay-area)
 (5711 pasta-moon italian 2.0 425 marina-blvd south-san-francisco
  san-mateo-county bay-area)
 (5712 ristorante-piacere italian 3.2 727 laurel-st san-carlos
  san-mateo-county bay-area)
 (5713 allegro-ristorante-italiano italian 2.5 1701 jones san-francisco
  san-francisco-county bay-area)
 (5714 amicis-east-coast-pizzeria italian 2.5 2033 union-st
  san-francisco san-francisco-county bay-area)
 (5715 angelo-ristorante-italiano italian 2.0 2234 chestnut
  san-francisco san-francisco-county bay-area)
 (5716 antipasti italian 2.8 1838 union san-francisco
  san-francisco-county bay-area)
 (5717 basta-pasta italian 3.1 1268 grant-avenue san-francisco
  san-francisco-county bay-area)
 (5718 bellavoce-ristorante italian 3.6 0 the-fairmont san-francisco
  san-francisco-county bay-area)
 (5719 benvenuti-pizzeria-&-italian-restaurant italian 2.3 418 beach
  san-francisco san-francisco-county bay-area)
 (5720 benvenuti-pizzeria-&-italian-restaurant italian 2.3 598 haight
  san-francisco san-francisco-county bay-area)
 (5721 bocce-cafe-italian-restaurant italian 2.6 478 green
  san-francisco san-francisco-county bay-area)
 (5722 bonta italian 2.5 2223 union san-francisco san-francisco-county
  bay-area)
 (5723 buca-giovanni italian 3.5 800 greenwich san-francisco
  san-francisco-county bay-area)
 (5724 buona-sera italian 2.0 622 green san-francisco
  san-francisco-county bay-area)
 (5725 caesars-italian-restaurant italian 2.3 0 &-powell san-francisco
  san-francisco-county bay-area)
 (5726 cafe-rocco italian 2.8 1131 folsom san-francisco
  san-francisco-county bay-area)
 (5727 cafe-moka italian 2.0 3130 fillmore san-francisco
  san-francisco-county bay-area)
 (5728 cafe-tiramisu italian 3.0 28 belden san-francisco
  san-francisco-county bay-area)
 (5729 caffe-barberini-ristorante-&-pizzeria italian 2.0 229
  columbus-avenue san-francisco san-francisco-county bay-area)
 (5730 caffe-cozzolino italian 2.3 300 precita-avenue san-francisco
  san-francisco-county bay-area)
 (5731 caffe-freddys italian 2.3 901 columbus-avenue san-francisco
  san-francisco-county bay-area)
 (5732 caffe-sport italian 3.9 574 green san-francisco
  san-francisco-county bay-area)
 (5733 calzones-pizza-cucina italian 3.4 430 columbus-avenue
  san-francisco san-francisco-county bay-area)
 (5734 capps-corner italian 3.1 1600 powell san-francisco
  san-francisco-county bay-area)
 (5735 ciao-northern-italian-ristorante italian 3.1 230 jackson
  san-francisco san-francisco-county bay-area)
 (5736 dame italian 3.2 1815 market-st san-francisco
  san-francisco-county bay-area)
 (5737 dantes-italian-seafood-restaurant italian 3.1 0 39 san-francisco
  san-francisco-county bay-area)
 (5738 diamond-pizza-restaurant italian 2.0 683 chenery san-francisco
  san-francisco-county bay-area)
 (5739 digrande-italian-&-seafood-cuisine italian 1.7 1439 taraval
  san-francisco san-francisco-county bay-area)
 (5740 eangelo-italian-restaurant italian 2.8 2234 chestnut
  san-francisco san-francisco-county bay-area)
 (5741 ernestos-pizza-restaurant italian 2.5 2311 clement san-francisco
  san-francisco-county bay-area)
 (5742 fior-ditalia-restaurant italian 2.9 601 union san-francisco
  san-francisco-county bay-area)
 (5743 firenze-by-night-ristorante italian 3.5 1429 stockton
  san-francisco san-francisco-county bay-area)
 (5744 francos-italian-restaurant italian 2.0 1912 lombard
  san-francisco san-francisco-county bay-area)
 (5745 frascati-ristorante italian 3.0 1901 hyde san-francisco
  san-francisco-county bay-area)
 (5746 giorgios-pizzeria italian 3.2 151 clement san-francisco
  san-francisco-county bay-area)
 (5747 girapolli italian 3.0 659 union san-francisco
  san-francisco-county bay-area)
 (5748 goat-hill italian 3.4 300 connecticut san-francisco
  san-francisco-county bay-area)
 (5749 gold-spike-restaurant italian 2.3 527 columbus-avenue
  san-francisco san-francisco-county bay-area)
 (5750 granada-cafe italian 2.7 4753 mission san-francisco
  san-francisco-county bay-area)
 (5751 grazie-restaurant italian 2.5 515 columbus-avenue san-francisco
  san-francisco-county bay-area)
 (5752 haystack-pizza-restaurant italian 2.0 3881 x24th san-francisco
  san-francisco-county bay-area)
 (5753 hyde-street-bistro italian 3.8 1521 hyde-st. san-francisco
  san-francisco-county bay-area)
 (5754 i-fratelli italian 2.1 1896 hyde san-francisco
  san-francisco-county bay-area)
 (5755 ideale italian 3.3 1315 grant-avenue san-francisco
  san-francisco-county bay-area)
 (5756 il-fornaio italian 2.9 1265 battery san-francisco
  san-francisco-county bay-area)
 (5757 jackson-fillmore-trattoria italian 3.5 2506 fillmore
  san-francisco san-francisco-county bay-area)
 (5758 joes-on-van-ness italian 2.0 2299 van-ness-avenue san-francisco
  san-francisco-county bay-area)
 (5759 kuletos-restaurant italian 3.8 221 powell san-francisco
  san-francisco-county bay-area)
 (5760 losteria-del-forno italian 3.4 519 columbus-ave san-francisco
  san-francisco-county bay-area)
 (5761 la-felce-italian-cuisine italian 3.0 1570 stockton san-francisco
  san-francisco-county bay-area)
 (5762 la-fiammetta italian 2.3 1701 octavia san-francisco
  san-francisco-county bay-area)
 (5763 la-pergola italian 2.0 2060 chestnut san-francisco
  san-francisco-county bay-area)
 (5764 la-trattoria italian 2.0 1507 polk san-francisco
  san-francisco-county bay-area)
 (5765 la-traviata italian 3.0 2854 mission san-francisco
  san-francisco-county bay-area)
 (5766 laghi italian 3.6 1801 clement san-francisco
  san-francisco-county bay-area)
 (5767 little-city-antipasti-bar italian 3.7 0 at-powell san-francisco
  san-francisco-county bay-area)
 (5768 little-henry-italian-food italian 2.5 3600 balboa san-francisco
  san-francisco-county bay-area)
 (5769 little-henry-italian-food italian 2.3 1000 clement san-francisco
  san-francisco-county bay-area)
 (5770 little-henrys italian 2.0 955 larkin san-francisco
  san-francisco-county bay-area)
 (5771 little-henrys-jr italian 2.0 280 golden-gate-avenue
  san-francisco san-francisco-county bay-area)
 (5772 little-italy italian 2.5 4109 x24th san-francisco
  san-francisco-county bay-area)
 (5773 little-joes-pizzeria-restaurant italian 2.0 5006 mission
  san-francisco san-francisco-county bay-area)
 (5774 lo-cocos-restaurant italian 3.3 510 union san-francisco
  san-francisco-county bay-area)
 (5775 luisas-italian-restaurant italian 3.0 1851 union san-francisco
  san-francisco-county bay-area)
 (5776 marcellos-restaurant italian 2.7 2100 travel san-francisco
  san-francisco-county bay-area)
 (5777 marina-cafe italian 2.0 2417 lombard san-francisco
  san-francisco-county bay-area)
 (5778 mescolanza italian 2.7 2221 clement san-francisco
  san-francisco-county bay-area)
 (5779 milano-restaurant italian 4.0 1448 pacific-avenue san-francisco
  san-francisco-county bay-area)
 (5780 mr-pizza-man italian 2.0 657 mission san-francisco
  san-francisco-county bay-area)
 (5781 new-pisa-restaurant italian 3.0 550 green san-francisco
  san-francisco-county bay-area)
 (5782 noes-grill italian 2.0 3782 x24th san-francisco
  san-francisco-county bay-area)
 (5783 noe-valley-pizza italian 2.7 3898 x24th san-francisco
  san-francisco-county bay-area)
 (5784 north-beach-cafe italian 2.0 1512 stockton san-francisco
  san-francisco-county bay-area)
 (5785 north-beach-restaurant italian 3.5 1512 stockton san-francisco
  san-francisco-county bay-area)
 (5786 olive-garden-italian-restaurant italian 2.0 3251 x20th-avenue
  san-francisco san-francisco-county bay-area)
 (5787 original-henrys italian 2.7 3339 steiner san-francisco
  san-francisco-county bay-area)
 (5788 original-joes-italian-restaurant italian 3.6 144 taylor
  san-francisco san-francisco-county bay-area)
 (5789 original-joes-no-2-restaurant italian 3.0 2001 chestnut
  san-francisco san-francisco-county bay-area)
 (5790 osteria italian 2.7 3277 sacramento san-francisco
  san-francisco-county bay-area)
 (5791 palio-dasti italian 2.8 640 sacramento san-francisco
  san-francisco-county bay-area)
 (5792 papa-potreros-pizza italian 2.0 2700 x24th san-francisco
  san-francisco-county bay-area)
 (5793 pasta-ii italian 2.0 381 south-van-ness-avenue san-francisco
  san-francisco-county bay-area)
 (5794 peters-pizza-house italian 2.0 1810 clement san-francisco
  san-francisco-county bay-area)
 (5795 pizza-americana italian 2.0 2680 x22d san-francisco
  san-francisco-county bay-area)
 (5796 prego-northern-italian-ristorante italian 3.0 2000 union-st.
  san-francisco san-francisco-county bay-area)
 (5797 restaurant-tiramisu italian 2.0 28 belden san-francisco
  san-francisco-county bay-area)
 (5798 ricardos italian 2.0 5099 mission san-francisco
  san-francisco-county bay-area)
 (5799 salvatores italian 2.8 2400 polk san-francisco
  san-francisco-county bay-area)
 (5800 spuntino-italian-express-restaurant italian 2.0 524
  van-ness-avenue san-francisco san-francisco-county bay-area)
 (5801 swiss-louis-italian-&-seafood-restaurant italian 2.0 0 39
  san-francisco san-francisco-county bay-area)
 (5802 the-front-room italian 2.3 823 clement san-francisco
  san-francisco-county bay-area)
 (5803 the-iron-horse-restaurant italian 2.3 19 maiden-lane
  san-francisco san-francisco-county bay-area)
 (5804 the-magic-flute-restaurant italian 2.7 3673 sacramento
  san-francisco san-francisco-county bay-area)
 (5805 the-sausage-factory italian 3.0 517 castro san-francisco
  san-francisco-county bay-area)
 (5806 tommaso-famous-pizzeria italian 3.6 1042 kearny san-francisco
  san-francisco-county bay-area)
 (5807 trattoria-contadina italian 3.2 1800 mason san-francisco
  san-francisco-county bay-area)
 (5808 tre-fratelli italian 3.2 2101 sutter san-francisco
  san-francisco-county bay-area)
 (5809 tre-fratelli-i-fratelli italian 2.0 1896 hyde san-francisco
  san-francisco-county bay-area)
 (5810 twin-peaks-pizza-and-pasta italian 2.0 1681 church san-francisco
  san-francisco-county bay-area)
 (5811 u-s-restaurant-&-coffee-shop italian 2.5 431 columbus-avenue
  san-francisco san-francisco-county bay-area)
 (5812 undici italian 2.0 374 x11th san-francisco san-francisco-county
  bay-area)
 (5813 vanessis-nob-hill italian 3.0 1177 california san-francisco
  san-francisco-county bay-area)
 (5814 via-veneto italian 2.3 2244 fillmore san-francisco
  san-francisco-county bay-area)
 (5815 villa-romana-pizzeria-and-restaurant italian 2.0 731 irving
  san-francisco san-francisco-county bay-area)
 (5816 vivande italian 3.8 2125 fillmore san-francisco
  san-francisco-county bay-area)
 (5817 angelos-italian-restaurant italian 3.3 436 blossom-hill-rd
  san-jose santa-clara-county bay-area)
 (5818 bella-mia italian 2.9 58 south-first-st. san-jose
  santa-clara-county bay-area)
 (5819 di-puccios italian 3.8 4710 meridian-ave san-jose
  santa-clara-county bay-area)
 (5820 florentine-italian-foods italian 3.0 1057 blossom-hill-rd
  san-jose santa-clara-county bay-area)
 (5821 florentine-restaurant-&-pasta-market italian 2.7 1070
  commercial-st-no.-107 san-jose santa-clara-county bay-area)
 (5822 florentine-restaurant-&-pasta-market italian 2.8 745
  s-winchester-blvd san-jose santa-clara-county bay-area)
 (5823 florentine-restaurant-&-pasta italian 2.0 1070
  commercial-st-ste-107 san-jose santa-clara-county bay-area)
 (5824 la-pastaia italian 3.7 233 w-santa-clara-st san-jose
  santa-clara-county bay-area)
 (5825 italian-gardens italian 2.0 3154 yuma-dr san-jose
  santa-clara-county bay-area)
 (5826 la-pastaria-fresca italian 2.0 3116 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (5827 olive-garden-italian-restaurant italian 2.0 942 blossom-hill-rd
  san-jose santa-clara-county bay-area)
 (5828 original-joes italian 2.9 301 s-1st-st san-jose
  santa-clara-county bay-area)
 (5829 palermo-ristorante-italiano italian 3.4 394 s-2nd-st san-jose
  santa-clara-county bay-area)
 (5830 pasta-mia italian 2.0 2565 n-1st-st san-jose santa-clara-county
  bay-area)
 (5831 raviolis italian 2.0 184 park san-jose santa-clara-county
  bay-area)
 (5832 sal-&-luigi italian 2.0 347 s-1st-st san-jose santa-clara-county
  bay-area)
 (5833 sorrentos-ristorante-italiano italian 3.4 2550 berryessa-rd
  san-jose santa-clara-county bay-area)
 (5834 strings-the-pasta-place italian 2.0 5055 dent-ave-apt-55
  san-jose santa-clara-county bay-area)
 (5835 the-old-spaghetti-factory italian 2.6 51 n-san-pedro-st san-jose
  santa-clara-county bay-area)
 (5836 village-italian-dinners-pizzer italian 2.3 4996
  stevens-creek-blvd san-jose santa-clara-county bay-area)
 (5837 guidos italian 2.0 991 manor-blvd san-leandro alameda-county
  bay-area)
 (5838 jakes-lion italian 2.6 1045 macarthur-blvd san-leandro
  alameda-county bay-area)
 (5839 marios-family-restaurant italian 2.0 14660 washington-ave
  san-leandro alameda-county bay-area)
 (5840 portofino-ristorante italian 2.0 15100 hesperian-blvd-ste-308
  san-leandro alameda-county bay-area)
 (5841 strizzis italian 3.1 1376 e-14th-st san-leandro alameda-county
  bay-area)
 (5842 strizzis italian 2.7 151 callan-ave-ste-108 san-leandro
  alameda-county bay-area)
 (5843 capellini italian 4.0 310 baldwin-ave san-mateo san-mateo-county
  bay-area)
 (5844 g-&-g-italian-deli italian 1.7 46 x37th-ave san-mateo
  san-mateo-county bay-area)
 (5845 pasta-corner italian 2.0 1330 w-hillsdale-blvd san-mateo
  san-mateo-county bay-area)
 (5846 san-remo-italian-foods italian 2.0 44 hillsdale-mall san-mateo
  san-mateo-county bay-area)
 (5847 sofia-italian-restaurant italian 2.0 2121 s-el-camino-real
  san-mateo san-mateo-county bay-area)
 (5848 spiedo italian 2.8 223 e-4th-ave san-mateo san-mateo-county
  bay-area)
 (5849 tutto-pasta italian 2.0 440 hillsdale-mall-no.-2228 san-mateo
  san-mateo-county bay-area)
 (5850 maestros italian 2.8 2323 san-ramon-valley-blvd san-ramon
  contra-costa-county bay-area)
 (5851 nicolo-pasta-&-grill italian 2.0 3211 crow-canyon-pl-no.-j
  san-ramon contra-costa-county bay-area)
 (5852 pacific-pasta italian 3.0 192 market-pl san-ramon
  contra-costa-county bay-area)
 (5853 pasta-primavera italian 3.7 3124 crow-canyon-pl-no.-c san-ramon
  contra-costa-county bay-area)
 (5854 buy-the-bucket italian 3.4 4565 stevens-creek-blvd santa-clara
  santa-clara-county bay-area)
 (5855 vesuvio-restaurant italian 2.9 3044 el-camino-real santa-clara
  santa-clara-county bay-area)
 (5856 gabriella-cafe italian 3.4 910 cedar-st santa-cruz
  santa-cruz-county bay-area)
 (5857 ristorante-avanti italian 3.0 1711 mission-st santa-cruz
  santa-cruz-county bay-area)
 (5858 ristorante-italiano italian 3.0 555 soquel-ave santa-cruz
  santa-cruz-county bay-area)
 (5859 florentine-pasta-shop italian 2.8 14510 big-basin-way-no.-c
  saratoga santa-clara-county bay-area)
 (5860 pezzellas-villa-napoli italian 4.1 1025 w-el-camino-real
  sunnyvale santa-clara-county bay-area)
 (5861 gumbahs-italian-beef italian 2.0 138 tennessee-st vallejo
  solano-county bay-area)
 (5862 lucianos-restaurant italian 2.0 301 arrowhead-dr vallejo
  solano-county bay-area)
 (5863 tonellis-dinner-house italian 2.0 6240 napa-vallejo-hwy vallejo
  solano-county bay-area)
 (5864 vallejo-joes-restaurant italian 2.0 1906 broadway vallejo
  solano-county bay-area)
 (5865 bella-piatti italian 2.0 1630 n-main-st-ste-137 walnut-creek
  contra-costa-county bay-area)
 (5866 caffe-italiano italian 2.0 1440 n-main-st walnut-creek
  contra-costa-county bay-area)
 (5867 florentine-rstrnt-&-pasta-mark italian 2.0 1251
  s-california-blvd walnut-creek contra-costa-county bay-area)
 (5868 florentino-restaurant-&-pasta italian 2.0 1251 s-california-blvd
  walnut-creek contra-costa-county bay-area)
 (5869 gios-trattoria italian 2.0 1265 montego-way-apt-37 walnut-creek
  contra-costa-county bay-area)
 (5870 il-pavone-ristorante-italiano italian 3.7 2291 olympic-blvd
  walnut-creek contra-costa-county bay-area)
 (5871 magic-garlic-restaurant italian 2.7 2910 n-main-st walnut-creek
  contra-costa-county bay-area)
 (5872 montecatini italian 3.4 1528 civic-dr walnut-creek
  contra-costa-county bay-area)
 (5873 papagottsos italian 1.7 1995 n-main-st walnut-creek
  contra-costa-county bay-area)
 (5874 pasta-primavera italian 3.0 2929 n-main-st walnut-creek
  contra-costa-county bay-area)
 (5875 pasta-primavera-cafe-too italian 2.0 2997 n-main-st walnut-creek
  contra-costa-county bay-area)
 (5876 prima italian 4.1 1522 n-main-st walnut-creek
  contra-costa-county bay-area)
 (5877 ristorante-toscano italian 2.0 1520 palos-verdes-mall
  walnut-creek contra-costa-county bay-area)
 (5878 rotisseria-on-main italian 3.2 1630 n-main-st-no.-444
  walnut-creek contra-costa-county bay-area)
 (5879 sepps-kitchen italian 3.2 1606 n-main-st walnut-creek
  contra-costa-county bay-area)
 (5880 si-mangia-bene italian 2.0 1218 boulevard-way walnut-creek
  contra-costa-county bay-area)
 (5881 sorrento-broadway-restaurant italian 2.0 2065 n-brd walnut-creek
  contra-costa-county bay-area)
 (5882 sorrentos italian 2.3 2064 treat-blvd-ste-b walnut-creek
  contra-costa-county bay-area)
 (5883 piatti-restaurant-co italian 3.2 6480 washington-st yountville
  napa-county napa-valley)
 (5884 milano italian 2.8 3425 grand-ave oakland alameda-county
  bay-area)
 (5885 olive-garden-italian-restaurant italian 2.3 39145 farwell-ave
  fremont alameda-county bay-area)
 (5886 il-postale italian 3.6 127 west-washington-st sunnyvale
  santa-clara-county bay-area)
 (5887 tra-vigne italian 3.8 1050 charter-oak-ave saint-helena
  napa-county napa-valley)
 (5888 spiedini-northern-italian-ristorante italian 2.5 101
  ygnacio-valley-rd walnut-creek contra-costa-county bay-area)
 (5889 guidos-restaurant italian 2.8 0 shopping-center---1875-s.-bascom
  campbell santa-clara-county bay-area)
 (5890 mas-caribbean-cuisine-&-roti-shop italian 3.3 1711 telegraph
  oakland alameda-county bay-area)
 (5891 stelline italian 2.6 429 gough-st. san-francisco
  san-francisco-county bay-area)
 (5892 bella-vista italian 4.4 13451 skyline-blvd woodside
  san-mateo-county bay-area)
 (5893 saros-ristorante italian 2.5 254 rose danville
  contra-costa-county bay-area)
 (5894 the-old-spaghetti-factory italian 3.1 62 jack-london-square
  oakland alameda-county bay-area)
 (5895 italian-kitchen italian 2.0 994 roswell-st marietta unknown
  unknown)
 (5896 caffe-centro italian 3.3 3340 steiner-st. san-francisco
  san-francisco-county bay-area)
 (5897 caffe-della-stella italian 3.9 1532 n.-main-st. walnut-creek
  contra-costa-county bay-area)
 (5898 pasta-cafe italian 3.0 401 main-st. pleasanton alameda-county
  bay-area)
 (5899 durant-garden-restaurant-classical italian 2.7 2517 durant-ave
  berkeley alameda-county bay-area)
 (5900 sbarros-italian-eatery italian 2.0 1832 redwood-hwy corte-madera
  marin-county bay-area)
 (5901 pasta-king italian 2.0 1492 lowell-ave cotati sonoma-county
  bay-area)
 (5902 sbarro-italian-eatery italian 2.0 1377 solano-mall fairfield
  solano-county bay-area)
 (5903 piazza-dangelo-restaurant italian 3.3 22 miller-ave mill-valley
  marin-county bay-area)
 (5904 italian-delite-submarine-sandwiches italian 2.3 468 ignacio-blvd
  novato marin-county bay-area)
 (5905 ristorante-dalecio italian 2.0 350 ignacio-blvd novato
  marin-county bay-area)
 (5906 buona-sera-ristorante italian 3.0 148 kentucky-st petaluma
  sonoma-county bay-area)
 (5907 franzi-swiss-italian-deli italian 2.0 1390 n-mcdowell-blvd
  petaluma sonoma-county bay-area)
 (5908 romeos-sourdough-pizza-&-pasta italian 2.0 239 s-mcdowell-blvd
  petaluma sonoma-county bay-area)
 (5909 volpis-ristorante-&-bar italian 2.6 122 washington-st petaluma
  sonoma-county bay-area)
 (5910 all-star-pizza-&-pasta italian 2.0 1451 southwest-blvd
  rohnert-park sonoma-county bay-area)
 (5911 cafe-ristorante-italia italian 2.3 0 unknown san-rafael
  marin-county bay-area)
 (5912 carlos-italian-restaurant italian 2.0 1700 x4th-st san-rafael
  marin-county bay-area)
 (5913 lococos-joe-ristorante italian 2.0 300 drakes-landing-rd
  san-rafael marin-county bay-area)
 (5914 lococos-ristorante italian 2.0 300 drakes-landing-rd san-rafael
  marin-county bay-area)
 (5915 sbarros-italian-eatery italian 2.0 5030 northgate-mall
  san-rafael marin-county bay-area)
 (5916 dinuccis-italian-dinners italian 2.0 14485 valley-ford-rd
  santa-rosa sonoma-county bay-area)
 (5917 italian-affair italian 2.0 1612 terrace-way santa-rosa
  sonoma-county bay-area)
 (5918 lenas-italian-restaurant italian 2.0 509 adams-st santa-rosa
  sonoma-county bay-area)
 (5919 lorenzos-ristaurante-italiano italian 2.7 0 towne-centre
  santa-rosa sonoma-county bay-area)
 (5920 micheles-italian-continental-restaurant italian 1.7 7
  &-adams/near-old-railrd santa-rosa sonoma-county bay-area)
 (5921 monterey-pasta-company italian 2.0 355 santa-rosa-plz santa-rosa
  sonoma-county bay-area)
 (5922 pasta-shop-&-gourmet-to-go italian 2.0 3080 marlow-rd santa-rosa
  sonoma-county bay-area)
 (5923 sbarro-the-italian-eatery italian 2.0 540 coddingtown-ctr
  santa-rosa sonoma-county bay-area)
 (5924 buona-pasta italian 2.0 550 gravenstein-hwy-n sebastopol
  sonoma-county bay-area)
 (5925 ristorante-italiano italian 2.7 1015 gravenstein-hwy-s
  sebastopol sonoma-county bay-area)
 (5926 pasta-nostra italian 2.0 139 e-napa-st sonoma sonoma-county
  bay-area)
 (5927 oly-oops-pizza-&-pasta-extrav italian 2.0 4300 central-way
  suisun-city solano-county bay-area)
 (5928 servino-ristorante-italiano italian 2.0 114 main-st
  belvedere-tiburon marin-county bay-area)
 (5929 san-marco-italian-restaurant italian 2.0 1801 solano-ave vallejo
  solano-county bay-area)
 (5930 capri-italian-restaurant italian 2.0 1129 el-camino-real
  south-san-francisco san-mateo-county bay-area)
 (5931 florentine-restaurants-&-pasta-markets italian 2.0 1290
  del-monte-shopping-center san-francisco san-francisco-county
  bay-area)
 (5932 padrinos-italian-restaurant-& italian 2.0 900 stanyan-st
  san-francisco san-francisco-county bay-area)
 (5933 papa-joes-italian-dinners italian 2.0 415 linden-ave
  south-san-francisco san-mateo-county bay-area)
 (5934 pasta-bella-restaurants italian 2.0 30 fremont-st san-francisco
  san-francisco-county bay-area)
 (5935 pauls-italian-restaurant italian 2.0 2642 ocean-ave
  san-francisco san-francisco-county bay-area)
 (5936 peppinos-italian-restaurant italian 2.0 1247 polk-st
  san-francisco san-francisco-county bay-area)
 (5937 salvatores-italan-restaurant italian 2.0 2400 polk-st
  san-francisco san-francisco-county bay-area)
 (5938 sbarros-italian-eatery italian 2.0 3251 ave san-francisco
  san-francisco-county bay-area)
 (5939 scalas-bistro italian 2.0 432 powell-st. san-francisco
  san-francisco-county bay-area)
 (5940 spinalis-taste-of-italy italian 2.0 1317 mission-rd
  south-san-francisco san-mateo-county bay-area)
 (5941 cafe-venezia italian 2.8 1799 university berkeley alameda-county
  bay-area)
 (5942 barones italian 3.8 475 st.-john-st. pleasanton alameda-county
  bay-area)
 (5943 trattoria-buon-gusto italian 2.0 651 oak-grove-ave menlo-park
  san-mateo-county bay-area)
 (5944 a-tavola italian 3.3 716 laurel-st san-carlos san-mateo-county
  bay-area)
 (5945 steps-of-rome-trattoria italian 3.2 0 unknown san-francisco
  san-francisco-county bay-area)
 (5946 mikes-cafe-etc. italian 3.0 2680 middlefield-rd palo-alto
  santa-clara-county bay-area)
 (5947 frantoio italian 2.8 152 shoreline-hwy mill-valley marin-county
  bay-area)
 (5948 papa-revato italian 2.0 1706 el-camino-real menlo-park
  san-mateo-county bay-area)
 (5949 cento-stelle-tuscan-trattoria italian 3.4 901 lincoln-ave
  san-rafael marin-county bay-area)
 (5950 vicolo italian 3.3 473 university palo-alto santa-clara-county
  bay-area)
 (5951 cucina-italiana italian 2.3 0 unknown palo-alto
  santa-clara-county bay-area)
 (5952 tullios italian 2.3 2065 north-brd walnut-creek
  contra-costa-county bay-area)
 (5953 cafe-greco italian 3.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (5954 firgro italian 2.0 414 columbus san-francisco
  san-francisco-county bay-area)
 (5955 giancarlos italian 3.4 16180 monterey-rd morgan-hill
  santa-clara-county bay-area)
 (5956 giorgios italian 4.0 1445 foxworthy-ave san-jose
  santa-clara-county bay-area)
 (5957 ciao-amore italian 3.2 788 laurel-st san-carlos san-mateo-county
  bay-area)
 (5958 trattoria italian 2.0 14510 big-basin-way saratoga
  santa-clara-county bay-area)
 (5959 dolce-vita italian 3.3 14482 big-basin-way saratoga
  santa-clara-county bay-area)
 (5960 big-basin-bistro italian 2.8 14480 big-basin-way saratoga
  santa-clara-county bay-area)
 (5961 dolice-spazio italian 2.7 221 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (5962 la-pastaia italian 3.5 233 santa-clara san-jose
  santa-clara-county bay-area)
 (5963 cucina-di-ratto italian 3.0 821 washington oakland
  alameda-county bay-area)
 (5964 strawberry-joes italian 2.8 0 town-and-country-village
  mill-valley marin-county bay-area)
 (5965 tutto-mare italian 2.3 0 st tiburon marin-county bay-area)
 (5966 harbor-15 italian 2.0 0 drive san-rafael marin-county bay-area)
 (5967 cafe-figaro italian 3.0 1318 broadway burlingame
  san-mateo-county bay-area)
 (5968 i-fratelli italian 2.7 388 main-st los-altos santa-clara-county
  bay-area)
 (5969 pastaio italian 2.2 3182 x16th-st san-francisco
  san-francisco-county bay-area)
 (5970 strizzis italian 2.8 3456 camino-tassajara danville
  contra-costa-county bay-area)
 (5971 caffe-della-stelle italian 3.0 1532 n.-main-st. walnut-creek
  contra-costa-county bay-area)
 (5972 la-ginestra italian 2.7 127 throckmorton-ave mill-valley
  marin-county bay-area)
 (5973 lorenzos-ristorante-italiano italian 3.0 500 raleys-towne-centre
  rohnert-park sonoma-county bay-area)
 (5974 il-davide italian 3.2 901 a-st san-rafael marin-county bay-area)
 (5975 la-fontaine-restaurant italian 2.3 3421 blackhawk-plaza-cir
  danville contra-costa-county bay-area)
 (5976 ristorante-il-porcino italian 3.4 3339 walnut-av fremont
  alameda-county bay-area)
 (5977 the-boulevard-cafe-&-trattoria italian 3.0 6731 north-lake-blvd.
  tahoe-vista placer-county lake-tahoe)
 (5978 the-boulevard-cafe-&-trattoria italian 2.7 6731 north-lake-blvd
  tahoe-vista placer-county lake-tahoe)
 (5979 pasta-cafe italian 3.0 2085 main-st. oakley contra-costa-county
  bay-area)
 (5980 parkside-restaurant italian 2.7 2325 taraval-st san-francisco
  san-francisco-county bay-area)
 (5981 tuti-mari italian 2.0 0 st tiburon marin-county bay-area)
 (5982 the-olive-garden-italian-restaurant italian 2.7 6430 redwood-dr.
  rohnert-park sonoma-county bay-area)
 (5983 vivace italian 3.0 0 avenue-near-the-alameda belmont
  san-mateo-county bay-area)
 (5984 cafe-citti italian 3.0 9049 sonoma-highway kenwood sonoma-county
  bay-area)
 (5985 mondellos italian 2.7 337 rheem-blvd. moraga unknown bay-area)
 (5986 giannas-restaurant italian 2.8 0 unknown livermore
  alameda-county bay-area)
 (5987 aromi italian 2.6 0 at-california san-francisco
  san-francisco-county bay-area)
 (5988 double-play italian 2.0 2401 x16th.-st. san-francisco
  san-francisco-county bay-area)
 (5989 spiedo italian 2.8 223 e.-4th-st san-mateo san-mateo-county
  bay-area)
 (5990 harbor-fifteen italian 2.0 15 harbor-st san-rafael marin-county
  bay-area)
 (5991 bacchis-inn italian 2.7 2 mi.-n.e.-taloe-city-in-lake-forest
  tahoe-city placer-county lake-tahoe)
 (5992 cafe-brioche italian 2.7 445 california-ave palo-alto
  santa-clara-county bay-area)
 (5993 incontro italian 2.3 41 franklin-st san-francisco
  san-francisco-county bay-area)
 (5994 carpaccio italian 3.6 0 unknown menlo-park san-mateo-county
  bay-area)
 (5995 dipuccios-pasta-shop italian 2.0 4710 meridian-ave san-jose
  santa-clara-county bay-area)
 (5996 la-piazza italian 2.7 15 moraga-way orinda contra-costa-county
  bay-area)
 (5997 the-garden-club italian 2.3 1144 old-mission-rd.
  south-san-francisco san-mateo-county bay-area)
 (5998 zingari italian 2.3 501 post-st. san-francisco
  san-francisco-county bay-area)
 (5999 pasta-per-tutti italian 2.5 3576 mt.-diablo-blvd. lafayette
  contra-costa-county bay-area)
 (6000 dipuccios-pasta-shop-&-catering italian 2.7 4710 meridian-ave
  san-jose santa-clara-county bay-area)
 (6001 capriccio-ristorante-italiono italian 2.8 325 sharon-park-drive
  menlo-park san-mateo-county bay-area)
 (6002 cafe-la-scala italian 3.2 1219 burlingame-ave burlingame
  san-mateo-county bay-area)
 (6003 fabios italian 3.0 88 west-10th-st tracy san-joaquin-county
  unknown)
 (6004 girasole italian 3.9 0 unknown pleasanton alameda-county
  bay-area)
 (6005 barronies italian 2.7 475 saint-john-st pleasanton
  alameda-county bay-area)
 (6006 spaghetteria italian 2.3 356 kearny san-francisco
  san-francisco-county bay-area)
 (6007 milano italian 2.0 0 st. emeryville alameda-county bay-area)
 (6008 frankie-johnny-&-luigi-too! italian 3.2 11891 dublin-blvd.
  dublin alameda-county bay-area)
 (6009 mangia-bene italian 2.5 1170 arnold-drive martinez
  contra-costa-county bay-area)
 (6010 sergios-trattoria italian 3.5 5299 college-ave oakland
  alameda-county bay-area)
 (6011 bravo-fono italian 2.7 0 unknown palo-alto santa-clara-county
  bay-area)
 (6012 gold-mirror-italian-restaurant italian 2.7 800 taraval-st.
  san-francisco san-francisco-county bay-area)
 (6013 ristorante-orsi italian 4.1 0 blvd novato marin-county bay-area)
 (6014 i-gatti italian 3.4 25 e.-main los-gatos santa-clara-county
  bay-area)
 (6015 scalas-bistro italian 3.8 432 powell-st. san-francisco
  san-francisco-county bay-area)
 (6016 margherita-de-roma italian 3.0 0 shopping-center cupertino
  santa-clara-county bay-area)
 (6017 oreganos italian 3.3 4546 el-camino-real los-altos
  santa-clara-county bay-area)
 (6018 giovannis-italian-restaurant italian 3.5 2605 homestead-rd
  santa-clara santa-clara-county bay-area)
 (6019 cafe-lido italian 2.7 110 monterey-ave capitola unknown
  bay-area)
 (6020 gambardellas italian 3.3 561 oak-grove-avenue menlo-park
  san-mateo-county bay-area)
 (6021 ristorante-mare italian 3.3 404 san-pedro-ave pacifica
  san-mateo-county bay-area)
 (6022 lottavo-ristorante italian 2.3 692 sutter san-francisco
  san-francisco-county bay-area)
 (6023 bills-cafe italian 2.8 1115 willow-st san-jose
  santa-clara-county bay-area)
 (6024 rigatonis italian 2.9 20860 rustic-dr castro-valley
  alameda-county bay-area)
 (6025 michaelangelo-cafe italian 3.6 579 columbus-ave-at-union-st.
  san-francisco san-francisco-county bay-area)
 (6026 fusilli-ristorante italian 2.8 620 jackson-st. fairfield
  solano-county bay-area)
 (6027 beppo italian 3.1 643 emerson-st palo-alto santa-clara-county
  bay-area)
 (6028 impatiens italian 1.7 0 9 boulder-creek santa-cruz-county
  bay-area)
 (6029 cafe-terzetto italian 2.7 1419 moraga-way moraga unknown
  bay-area)
 (6030 la-collina italian 2.7 355 el-camino-real millbrae
  san-mateo-county bay-area)
 (6031 forli italian 2.7 0 blvd alamo contra-costa-county bay-area)
 (6032 nightshade italian 3.5 2101 sutter san-francisco
  san-francisco-county bay-area)
 (6033 strings-italian-cafe italian 2.0 4520 las-positas-rd livermore
  alameda-county bay-area)
 (6034 capri-pizza italian 2.0 nil nil san-francisco
  san-francisco-county bay-area)
 (6035 capri-pizza italian 2.8 2272 market-st san-francisco
  san-francisco-county bay-area)
 (6036 t.r.-italina-restaurant italian 2.7 466 san-mateo-avenue
  san-bruno san-mateo-county bay-area)
 (6037 olive-garden italian 2.0 19 somersville-rd antioch
  contra-costa-county bay-area)
 (6038 venticello italian 3.4 1257 taylor san-francisco
  san-francisco-county bay-area)
 (6039 milanos italian 2.3 1829 mt.-diablo-blvd. walnut-creek
  contra-costa-county bay-area)
 (6040 mondos-trattoria italian 2.7 0 st carmel monterey-county
  monterey)
 (6041 bella-luna italian 1.6 2299 van-ness san-francisco
  san-francisco-county bay-area)
 (6042 scomas italian 2.7 nil nil san-francisco san-francisco-county
  bay-area)
 (6043 paolos-resturant italian 3.5 0 unknown san-jose
  santa-clara-county bay-area)
 (6044 blandinas-cafe italian 2.7 907 first-st. benicia solano-county
  bay-area)
 (6045 abalonetti italian 2.3 57 fishermans-wharf monterey
  monterey-county monterey)
 (6046 joe-rombis italian 2.0 208 x17th-st. pacific-grove
  monterey-county monterey)
 (6047 caffe-focaccia italian 2.7 55 second-st san-francisco
  san-francisco-county bay-area)
 (6048 mio-vicino italian 3.0 384 e.-campbell-avenue campbell
  santa-clara-county bay-area)
 (6049 la-dolce-vita italian 2.0 0 carlos-bt-7th-&-8th carmel
  monterey-county monterey)
 (6050 nouveau-trattoria italian 3.3 541 bryant-st palo-alto
  santa-clara-county bay-area)
 (6051 cucina-cucina italian 3.0 1000 el-paseo-de-saratoga san-jose
  santa-clara-county bay-area)
 (6052 antica-trattoria italian 3.0 2400 polk-st san-francisco
  san-francisco-county bay-area)
 (6053 rose-pistola italian 3.0 0 and-union san-francisco
  san-francisco-county bay-area)
 (6054 pazzia-caffe italian 2.7 337 x3rd san-francisco
  san-francisco-county bay-area)
 (6055 radicchio-trattoria italian 2.7 1809 union-st san-francisco
  san-francisco-county bay-area)
 (6056 pallaris italian 2.7 352 broadway millbrae san-mateo-county
  bay-area)
 (6057 figaro-ristorante italian 3.0 414 columbus san-francisco
  san-francisco-county bay-area)
 (6058 lucias-italian-restaurant italian 2.3 700 mowry-av. fremont
  alameda-county bay-area)
 (6059 allegro-gourmet-pizzeria italian 2.7 1184 forest-avenue
  pacific-grove monterey-county monterey)
 (6060 il-fornaio italian 2.7 302 s.-market-st. san-jose
  santa-clara-county bay-area)
 (6061 cibo italian 3.3 301 alvarado-st monterey monterey-county
  monterey)
 (6062 olivios italian 1.7 0 camino belmont san-mateo-county bay-area)
 (6063 giovannis-pizzeria italian 3.5 1127 lawrence-expy sunnyvale
  santa-clara-county bay-area)
 (6064 mangia-mangia italian 3.0 755 san-pablo-ave albany
  alameda-county bay-area)
 (6065 inn-at-tres-pinos italian 3.0 6991 airline-hwy. tres-pinos
  unknown unknown)
 (6066 al-castello-ristorante-&-pizzeria italian 2.3 20950
  stevens-creek-blvd. cupertino santa-clara-county bay-area)
 (6067 checkers italian 2.0 1414 lincoln-ave calistoga napa-county
  napa-valley)
 (6068 salvatore-ristorante italian 3.2 1627 n.-brd walnut-creek
  contra-costa-county bay-area)
 (6069 spados italian 2.0 66 west-alisal-st salinas monterey-county
  monterey)
 (6070 ginos-fine-italian-food-&-pizza italian 2.0 1410 south-main-st
  salinas monterey-county monterey)
 (6071 san-remos-neapolitan-pizzeria italian 2.3 1152 san-carlos-avenue
  san-carlos san-mateo-county bay-area)
 (6072 buongiorno italian 1.7 2075 s.-el-camino-real san-mateo
  san-mateo-county bay-area)
 (6073 caprices-restaurant-&-cafe italian 2.7 347 primrose-rd
  burlingame san-mateo-county bay-area)
 (6074 fratellos italian 2.7 1712 meridian-ave san-jose
  santa-clara-county bay-area)
 (6075 spaghetteria italian 2.7 42 columbus-ave san-francisco
  san-francisco-county bay-area)
 (6076 cincin-ristorante italian 3.0 1154 robson-st. vancouver unknown
  unknown)
 (6077 spalti italian 2.7 417 california-ave palo-alto
  santa-clara-county bay-area)
 (6078 isernia italian 2.7 0 arthur-blvd. san-leandro alameda-county
  bay-area)
 (6079 pasta!-pasta! italian 3.5 4040 pimlico-drive-no.116 pleasanton
  alameda-county bay-area)
 (6080 aragonas italian 3.0 0 unknown aptos santa-cruz-county bay-area)
 (6081 dalecio-e-le-coco italian 2.0 0 unknown larkspur marin-county
  bay-area)
 (6082 filippos-pastaria italian 2.7 5400 college oakland
  alameda-county bay-area)
 (6083 fontanas italian 3.6 20840 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (6084 continental-delicatessen italian 3.6 1971 san-pablo-avenue
  pinole contra-costa-county bay-area)
 (6085 cademartoris italian 3.6 601 x1st-st san-juan-bautista
  san-benito-county northern-california)
 (6086 villaggio-ristorante-italiano italian 3.6 4996
  stevens-creek-blvd san-jose santa-clara-county bay-area)
 (6087 peppinos-ristorante-italiano italian 3.6 1247 polk-st
  san-francisco san-francisco-county bay-area)
 (6088 j-&-g-jamaican-cuisine jamaican 2.0 1732 san-pablo-ave berkeley
  alameda-county bay-area)
 (6089 prince-neville-original-jamaican-restaurant jamaican 2.3 1279
  fulton san-francisco san-francisco-county bay-area)
 (6090 happi-house japanese 2.0 523 west-plaza alameda alameda-county
  bay-area)
 (6091 kamakura-restaurant japanese 3.9 2549 santa-clara-ave alameda
  alameda-county bay-area)
 (6092 midori japanese 2.0 1427 webster-st alameda alameda-county
  bay-area)
 (6093 sushi-sue japanese 3.8 0 st.-near-santa-clara alameda
  alameda-county bay-area)
 (6094 yumeya-japanese-restaurant japanese 2.6 807 marina-village-pky
  alameda alameda-county bay-area)
 (6095 hayama-restaurant japanese 3.0 3160 danville-blvd-ste-e alamo
  contra-costa-county bay-area)
 (6096 sakura-restaurant japanese 1.7 1401 solano-ave albany
  alameda-county bay-area)
 (6097 sugata-restaurant japanese 2.3 1105 solano-ave albany
  alameda-county bay-area)
 (6098 okawa japanese 3.0 2327 buchanan-rd antioch contra-costa-county
  bay-area)
 (6099 tamamis-jap-restaurant japanese 2.0 3047 van-buren-dr antioch
  contra-costa-county bay-area)
 (6100 yebisu-japanese-restaurant japanese 2.0 6024 soquel-dr aptos
  santa-cruz-county bay-area)
 (6101 ak-restaurant japanese 2.5 2505 hearst-ave berkeley
  alameda-county bay-area)
 (6102 banzai japanese 2.3 1019 camellia berkeley alameda-county
  bay-area)
 (6103 edokko japanese 2.0 2215 san-pablo-ave berkeley alameda-county
  bay-area)
 (6104 kirala-restaurant japanese 3.9 2100 ward-st berkeley
  alameda-county bay-area)
 (6105 miyuki-japanese-restaurant japanese 2.0 1695 solano-ave berkeley
  alameda-county bay-area)
 (6106 o-chame japanese 3.4 1830 x4th-st berkeley alameda-county
  bay-area)
 (6107 osumo-restaurant japanese 2.0 725 cleveland-ave berkeley
  alameda-county bay-area)
 (6108 party-sushi japanese 2.6 1776 shattuck-ave berkeley
  alameda-county bay-area)
 (6109 sushi-sho japanese 1.7 1645 solano-ave berkeley alameda-county
  bay-area)
 (6110 toyo-japanese-restaurant japanese 2.0 2556 telegraph-ave
  berkeley alameda-county bay-area)
 (6111 yokohama-station japanese 2.2 2521 durant-ave-ste-c berkeley
  alameda-county bay-area)
 (6112 benihana-of-tokyo japanese 3.0 1496 bayshore-hwy burlingame
  san-mateo-county bay-area)
 (6113 ramen-club-&-catering japanese 2.7 723 california-dr burlingame
  san-mateo-county bay-area)
 (6114 shigemasu japanese 2.0 1190 broadway burlingame san-mateo-county
  bay-area)
 (6115 ten-ichi japanese 2.0 2740 el-prado-rd burlingame
  san-mateo-county bay-area)
 (6116 yakiniku-house-juban japanese 3.7 0 unknown burlingame
  san-mateo-county bay-area)
 (6117 restaurant-michi japanese 2.0 2220 winchester-blvd campbell
  santa-clara-county bay-area)
 (6118 miyako-japanese-restaurant japanese 2.7 1820 x41st-ave-no.-g
  capitola unknown bay-area)
 (6119 katsu-restaurant japanese 2.3 20861 redwood-rd castro-valley
  alameda-county bay-area)
 (6120 benihana-of-tokyo japanese 3.4 1989 diamond-blvd concord
  contra-costa-county bay-area)
 (6121 osaka-restaurant japanese 2.3 2650 monument-blvd concord
  contra-costa-county bay-area)
 (6122 suwas-japanese-restaurant japanese 2.7 2151 suite-e-selvio-st
  concord contra-costa-county bay-area)
 (6123 tachi-sushi-bar japanese 2.0 5400 ygnacio-valley-rd concord
  contra-costa-county bay-area)
 (6124 teriyaki-express japanese 2.0 2118 willow-pass-rd-ste-200
  concord contra-costa-county bay-area)
 (6125 tokyo-express japanese 2.0 970 detroit-ave-ste-a concord
  contra-costa-county bay-area)
 (6126 yanagi-japanese-restaurant japanese 2.0 4305 clayton-rd-apt-a
  concord contra-costa-county bay-area)
 (6127 azuma japanese 3.1 19645 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (6128 benihana-of-tokyo japanese 2.8 2074 vallco-fashion-park
  cupertino santa-clara-county bay-area)
 (6129 hamasushi japanese 3.5 20030 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (6130 ikenohana-restaurant japanese 3.4 20625 alves-dr cupertino
  santa-clara-county bay-area)
 (6131 kimura-enterprises japanese 2.0 8085 hyannisport-dr cupertino
  santa-clara-county bay-area)
 (6132 osaka-teriyaki japanese 1.7 10123 n-wolfe-rd-ste-994 cupertino
  santa-clara-county bay-area)
 (6133 irashaimase-japanese-rest japanese 2.0 108 victoria-st daly-city
  san-mateo-county bay-area)
 (6134 tempura-express japanese 2.0 264 polaris-way daly-city
  san-mateo-county bay-area)
 (6135 tokyo-tempura-house japanese 2.3 91 skyline-plz daly-city
  san-mateo-county bay-area)
 (6136 sen-dai-teriyaki japanese 1.7 101 town-and-country-dr-ste-c
  danville contra-costa-county bay-area)
 (6137 sushi-bar-hana japanese 3.0 165 prospect-ave danville
  contra-costa-county bay-area)
 (6138 yuki-of-tokyo japanese 2.0 200 hartz-ave-no.-e danville
  contra-costa-county bay-area)
 (6139 hana-japan-steak-house japanese 2.0 7298 san-ramon-rd dublin
  alameda-county bay-area)
 (6140 koto japanese 2.0 7723 amador-valley-blvd dublin alameda-county
  bay-area)
 (6141 sato-japanese-cuisine japanese 2.0 7567
  amador-valley-blvd-ste-101 dublin alameda-county bay-area)
 (6142 tomoe-sushi japanese 2.0 7467 village-pky-no.-69 dublin
  alameda-county bay-area)
 (6143 katana-ya-ramen japanese 2.7 10546 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (6144 moqami-japanese-restaurant japanese 2.7 10887
  san-pablo-ave-no.-89 el-cerrito contra-costa-county bay-area)
 (6145 restaurant-yokohama japanese 2.7 11880 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (6146 izumi-japanese-restaurant japanese 2.7 2773 n-texas-st fairfield
  solano-county bay-area)
 (6147 shogun-teriyaki japanese 2.0 3355 whitemarsh-ln fairfield
  solano-county bay-area)
 (6148 teriyaki-kitchen japanese 2.0 3079 travis-blvd fairfield
  solano-county bay-area)
 (6149 tomiyoshi-japanese-restaurant japanese 2.0 740 texas-st
  fairfield solano-county bay-area)
 (6150 tokies-teriyaki-house japanese 3.7 1058 shell-blvd-no.-g
  foster-city san-mateo-county bay-area)
 (6151 mikado-restaurant japanese 3.0 46565 mission-blvd fremont
  alameda-county bay-area)
 (6152 miyoshi-restaurant japanese 2.0 3353 walnut-ave fremont
  alameda-county bay-area)
 (6153 sei-sho-japanese-restaurant japanese 3.5 40645
  fremont-blvd-ste-8 fremont alameda-county bay-area)
 (6154 yuki-japanese-restaurant japanese 2.3 43486 ellsworth-st fremont
  alameda-county bay-area)
 (6155 yuri-japanese-restaurant japanese 3.3 3810 mowry-ave fremont
  alameda-county bay-area)
 (6156 california-roll japanese 2.0 195 harder-rd hayward
  alameda-county bay-area)
 (6157 ichiban japanese 3.5 22560 foothill-blvd hayward alameda-county
  bay-area)
 (6158 kokeshi japanese 2.3 24830 mission-blvd hayward alameda-county
  bay-area)
 (6159 wakamatsu japanese 2.7 22724 foothill-blvd hayward
  alameda-county bay-area)
 (6160 akane-japanese-cuisine japanese 3.7 250 x3rd-st los-altos
  santa-clara-county bay-area)
 (6161 sushi-on-wheels japanese 2.0 0 unknown los-gatos
  santa-clara-county bay-area)
 (6162 peking-tokyo-restaurant japanese 2.0 522 center-ave martinez
  contra-costa-county bay-area)
 (6163 gombei-japanese-restaurant japanese 3.6 1438 el-camino-real
  menlo-park san-mateo-county bay-area)
 (6164 kiyoshi-japanese-restaurant japanese 2.8 1328 el-camino-real
  menlo-park san-mateo-county bay-area)
 (6165 tenichi-sushi-restaurant japanese 2.6 925 el-camino-real
  menlo-park san-mateo-county bay-area)
 (6166 tokyo-subway japanese 2.4 605 santa-cruz-ave menlo-park
  san-mateo-county bay-area)
 (6167 tamamis-japanese-restaurant japanese 2.3 356 park-st moraga
  unknown bay-area)
 (6168 hiromis-japanese-restaurant japanese 3.0 35 e-main-ave
  morgan-hill santa-clara-county bay-area)
 (6169 izakaya-japanese-restaurant japanese 2.0 17415 monterey-rd-ste-e
  morgan-hill santa-clara-county bay-area)
 (6170 fumi-yoshi japanese 3.0 1991 w.-el-camino-real mountain-view
  santa-clara-county bay-area)
 (6171 happi-house-restaurants japanese 2.0 286 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (6172 kamei japanese 2.3 240 castro-st. mountain-view
  santa-clara-county bay-area)
 (6173 shogun-restaurant japanese 3.8 841 villa-st mountain-view
  santa-clara-county bay-area)
 (6174 sono-japanese-restaurant japanese 1.9 357 castro-st-no.-3-a
  mountain-view santa-clara-county bay-area)
 (6175 yakko-restaurant japanese 3.4 975 w-dana-st mountain-view
  santa-clara-county bay-area)
 (6176 fujiya japanese 2.0 921 freeway-dr napa napa-county napa-valley)
 (6177 sush-bar-mari-ya japanese 2.3 1015 coombs-st napa napa-county
  napa-valley)
 (6178 yosh-shige-trdtnl-japanese-cus japanese 2.7 3381 california-blvd
  napa napa-county napa-valley)
 (6179 kioku japanese 3.9 6180 jarvis-ave-ste-v newark alameda-county
  bay-area)
 (6180 the-bento-box japanese 2.3 39945 balentine-dr newark
  alameda-county bay-area)
 (6181 tokyo-station japanese 2.0 2076 newpark-mall newark
  alameda-county bay-area)
 (6182 fujiya-restaurant japanese 2.3 1611 x2nd-ave oakland
  alameda-county bay-area)
 (6183 genji japanese 2.0 1221 broadway oakland alameda-county
  bay-area)
 (6184 kaede-house-of-teriyaki japanese 2.7 382 x17th-st oakland
  alameda-county bay-area)
 (6185 mijori japanese 2.0 3260 grand-ave oakland alameda-county
  bay-area)
 (6186 mikado-japanese-restaurant japanese 3.0 3417 grand-ave oakland
  alameda-county bay-area)
 (6187 suki-palace japanese 2.0 2670 fruitvale-ave oakland
  alameda-county bay-area)
 (6188 sushi japanese 2.0 1405 franklin-st oakland alameda-county
  bay-area)
 (6189 tachibana-japanese-restaurant japanese 2.3 5812 college-ave
  oakland alameda-county bay-area)
 (6190 yoshis-japanese-restaurant japanese 3.0 6030 claremont-ave
  oakland alameda-county bay-area)
 (6191 serika-restaurant japanese 2.5 2 theatre-sq-ste-118 orinda
  contra-costa-county bay-area)
 (6192 kani-kosen japanese 3.0 580 crespi-dr-no.-a-5 pacifica
  san-mateo-county bay-area)
 (6193 mitsu japanese 3.3 1301 palmetto-ave-no.-d pacifica
  san-mateo-county bay-area)
 (6194 miyake japanese 2.7 100 university palo-alto santa-clara-county
  bay-area)
 (6195 tokyo japanese 2.3 3090 stelling-dr palo-alto santa-clara-county
  bay-area)
 (6196 tachikawa japanese 2.7 632 san-pablo-ave-no.-e pinole
  contra-costa-county bay-area)
 (6197 mikasa-japanese-restaurant japanese 2.0 149 atlantic-ave
  pittsburg contra-costa-county bay-area)
 (6198 zakuro-japanese-rstrnt-sushi japanese 2.3 150
  longbrook-way-ste-c pleasant-hill contra-costa-county bay-area)
 (6199 haruos-place japanese 2.7 3120 santa-rita-rd-ste-g pleasanton
  alameda-county bay-area)
 (6200 bonsai-japanese-restaurant japanese 3.0 878 jefferson-ave
  redwood-city san-mateo-county bay-area)
 (6201 happi-house-restaurants japanese 2.0 30 woodside-plz
  redwood-city san-mateo-county bay-area)
 (6202 higuma-japanese-restaurant japanese 3.3 540 el-camino-real
  redwood-city san-mateo-county bay-area)
 (6203 ichiban japanese 2.0 1742 el-camino-real redwood-city
  san-mateo-county bay-area)
 (6204 tokyo-restaurant japanese 2.0 3044 hilltop-mall-rd richmond
  contra-costa-county bay-area)
 (6205 ozuma-japanese-restaurant japanese 2.2 894 laurel-st san-carlos
  san-mateo-county bay-area)
 (6206 sakuaa-japanese-restaurant japanese 2.0 1109 laurel-st
  san-carlos san-mateo-county bay-area)
 (6207 benihana-of-tokyo japanese 2.0 1737 post-in-japan-center
  san-francisco san-francisco-county bay-area)
 (6208 benkay japanese 2.0 222 mason san-francisco san-francisco-county
  bay-area)
 (6209 castro-hibachi japanese 2.3 4063 x18th san-francisco
  san-francisco-county bay-area)
 (6210 cho-cho-japanese-restaurant japanese 2.0 1020 kearny
  san-francisco san-francisco-county bay-area)
 (6211 ebisu-restaurant japanese 4.0 1283 x9th-avenue san-francisco
  san-francisco-county bay-area)
 (6212 fuji japanese 2.0 301 west-portal-avenue san-francisco
  san-francisco-county bay-area)
 (6213 fujiya-restaurant japanese 2.7 1 embarcadero-center
  san-francisco san-francisco-county bay-area)
 (6214 fuku-sushi-restaurant-no-1 japanese 2.7 1581 webster
  san-francisco san-francisco-county bay-area)
 (6215 hamano-sushi japanese 3.0 1332 castro san-francisco
  san-francisco-county bay-area)
 (6216 hana-restaurant japanese 2.7 408 irving san-francisco
  san-francisco-county bay-area)
 (6217 ichirin japanese 2.0 330 mason san-francisco
  san-francisco-county bay-area)
 (6218 ino-sushi japanese 3.0 1620 webster san-francisco
  san-francisco-county bay-area)
 (6219 iroha-restaurant japanese 2.5 1728 buchanan san-francisco
  san-francisco-county bay-area)
 (6220 isobune-sushi japanese 3.0 1737 post san-francisco
  san-francisco-county bay-area)
 (6221 izumi-ya-restaurant japanese 2.0 1581 webster san-francisco
  san-francisco-county bay-area)
 (6222 jojis-house-of-teriyaki japanese 2.5 1919 union san-francisco
  san-francisco-county bay-area)
 (6223 kansai-restaurant japanese 2.0 325 sacramento san-francisco
  san-francisco-county bay-area)
 (6224 kantaro-sushi japanese 2.0 124 ellis san-francisco
  san-francisco-county bay-area)
 (6225 kinoko japanese 2.0 55 x4th-in-the-san-francisco-marriott
  san-francisco san-francisco-county bay-area)
 (6226 kiraku-japanese-restaurant japanese 2.0 841 irving san-francisco
  san-francisco-county bay-area)
 (6227 kita-bento japanese 2.3 355 kearny san-francisco
  san-francisco-county bay-area)
 (6228 koji-osakaya-restaurant japanese 2.0 1737 post san-francisco
  san-francisco-county bay-area)
 (6229 kushitsuru japanese 2.0 1737 post san-francisco
  san-francisco-county bay-area)
 (6230 kyo-ya-restaurant japanese 3.0 0 &-new-montgomery san-francisco
  san-francisco-county bay-area)
 (6231 ma-tante-sumi japanese 2.7 4243 x18th-st san-francisco
  san-francisco-county bay-area)
 (6232 maruya-sushi japanese 2.0 1904 fillmore san-francisco
  san-francisco-county bay-area)
 (6233 matsuya-restaurant japanese 2.0 3856 x24th san-francisco
  san-francisco-county bay-area)
 (6234 micado-restaurant japanese 2.0 2126 irving san-francisco
  san-francisco-county bay-area)
 (6235 mifune-restaurant japanese 3.0 1737 post san-francisco
  san-francisco-county bay-area)
 (6236 moshi-moshi japanese 2.0 2092 x3d san-francisco
  san-francisco-county bay-area)
 (6237 osome japanese 2.0 3145 fillmore san-francisco
  san-francisco-county bay-area)
 (6238 osome japanese 3.2 1923 fillmore san-francisco
  san-francisco-county bay-area)
 (6239 sagami-ya-restaurant japanese 2.0 1525 irving san-francisco
  san-francisco-county bay-area)
 (6240 sanppo-restaurant japanese 2.7 1702 post san-francisco
  san-francisco-county bay-area)
 (6241 sanraku-four-seasons-japanese-restaurant japanese 2.7 704 sutter
  san-francisco san-francisco-county bay-area)
 (6242 sapporo-ya-japanese-restaurant japanese 2.3 0 center
  san-francisco san-francisco-county bay-area)
 (6243 sushi-bune-restaurant japanese 2.8 389 geary san-francisco
  san-francisco-county bay-area)
 (6244 sushi-chardonnay japanese 2.6 1785 union san-francisco
  san-francisco-county bay-area)
 (6245 sushi-man-restaurant japanese 2.0 731 bush san-francisco
  san-francisco-county bay-area)
 (6246 tachibana japanese 2.7 301 mission san-francisco
  san-francisco-county bay-area)
 (6247 taraval-japanese-food japanese 2.3 1713 taraval san-francisco
  san-francisco-county bay-area)
 (6248 tempura-house japanese 2.0 529 powell san-francisco
  san-francisco-county bay-area)
 (6249 ten-ichi-restaurant japanese 2.0 2235 fillmore san-francisco
  san-francisco-county bay-area)
 (6250 tokyo-sukiyaki-restaurant-and-sushi-bar japanese 2.0 225
  jefferson san-francisco san-francisco-county bay-area)
 (6251 tora-ya-restaurant japanese 2.8 1914 fillmore san-francisco
  san-francisco-county bay-area)
 (6252 yamato-restaurant-&-sushi-bar japanese 2.0 717 california
  san-francisco san-francisco-county bay-area)
 (6253 yoshida-ya-japanese-restaurant japanese 2.7 2909 webster
  san-francisco san-francisco-county bay-area)
 (6254 zaoh-restaurant japanese 2.0 1555 mission san-francisco
  san-francisco-county bay-area)
 (6255 azabu-japanese-restaurant japanese 2.7 375 saratoga-ave-no.-m
  san-jose santa-clara-county bay-area)
 (6256 ginza-cafe japanese 2.0 215 jackson-st san-jose
  santa-clara-county bay-area)
 (6257 gombei japanese 3.6 193 jackson-st san-jose santa-clara-county
  bay-area)
 (6258 happi-house-restaurants japanese 2.0 695 n-5th-st san-jose
  santa-clara-county bay-area)
 (6259 happi-house-restaurants japanese 2.0 695 n-5th-st san-jose
  santa-clara-county bay-area)
 (6260 happi-house-restaurants japanese 2.0 5353 almaden-expy-ste-m22
  san-jose santa-clara-county bay-area)
 (6261 happi-house-restaurants japanese 2.0 3015 mckee-rd san-jose
  santa-clara-county bay-area)
 (6262 happi-house-restaurants japanese 2.0 397 saratoga-ave san-jose
  santa-clara-county bay-area)
 (6263 happi-house-restaurants japanese 2.0 1080 saratoga-sunnyvale-rd
  san-jose santa-clara-county bay-area)
 (6264 katana-ya-ramer japanese 2.7 154 jackson-st san-jose
  santa-clara-county bay-area)
 (6265 kazoo-restaurant japanese 3.0 250 jackson-st. san-jose
  santa-clara-county bay-area)
 (6266 kiku-japanese-restaurant japanese 2.8 1187
  saratoga-sunnyvale-rd-no.-b san-jose santa-clara-county bay-area)
 (6267 kitahama-japanese-restaurant japanese 3.0 974
  saratoga-sunnyvale-rd san-jose santa-clara-county bay-area)
 (6268 o-ishi-teriyaki japanese 2.0 2910 stevens-ln-no.-110 san-jose
  santa-clara-county bay-area)
 (6269 okayama-restaurant japanese 3.5 565 n-6th-st-ste-a san-jose
  santa-clara-county bay-area)
 (6270 teriyaki-palace japanese 2.0 356 eastridge-mall san-jose
  santa-clara-county bay-area)
 (6271 teriyaki-stop japanese 2.0 5556 monterey-hwy san-jose
  santa-clara-county bay-area)
 (6272 teriyaki-stop japanese 2.0 5556 monterey-hwy san-jose
  santa-clara-county bay-area)
 (6273 tokyo-sushi japanese 2.0 1663 lundy-ave-no.-g san-jose
  santa-clara-county bay-area)
 (6274 tomisushi-restaurant japanese 3.0 4336 moorpark-ave san-jose
  santa-clara-county bay-area)
 (6275 tsugaru japanese 2.0 224 jackson-st san-jose santa-clara-county
  bay-area)
 (6276 yuri-japanese-restaurant japanese 4.0 3236 s-white-rd san-jose
  santa-clara-county bay-area)
 (6277 fuji-sukiyaki japanese 3.0 428 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (6278 fukuya-japanese-restaurant japanese 2.7 2654 corte-de-flores
  san-mateo san-mateo-county bay-area)
 (6279 kisaku japanese 2.8 209 s-b-st san-mateo san-mateo-county
  bay-area)
 (6280 suisha-japanese-restaurant japanese 2.0 2946 s-norfolk-st
  san-mateo san-mateo-county bay-area)
 (6281 toda-japanese-restaurant japanese 1.5 41 e-4th-ave san-mateo
  san-mateo-county bay-area)
 (6282 hasegawa-japanese-restaurant japanese 2.0 2695 corey-pl
  san-ramon contra-costa-county bay-area)
 (6283 miraku-japanese-restaurant japanese 3.2 2416
  san-ramon-valley-blvd-no.-120 san-ramon contra-costa-county bay-area)
 (6284 sakura-japanese-cuisine japanese 2.8 3151 crow-canyon-pl
  san-ramon contra-costa-county bay-area)
 (6285 bento-box-teriyaki japanese 2.0 2634 homestead-rd santa-clara
  santa-clara-county bay-area)
 (6286 hakone-japanese-rest japanese 2.0 2045 white-oak-ln santa-clara
  santa-clara-county bay-area)
 (6287 hatcho-authentic-japanese-cuisine japanese 3.1 3074
  el-camino-real santa-clara santa-clara-county bay-area)
 (6288 kiraku-japanese-restaurant japanese 2.0 20 washington-st
  santa-clara santa-clara-county bay-area)
 (6289 kobe-restaurant japanese 3.0 2086 el-camino-real santa-clara
  santa-clara-county bay-area)
 (6290 komatsu-japanese-cuisine japanese 2.0 927 baird-ave santa-clara
  santa-clara-county bay-area)
 (6291 komatsu-teriyaki-house japanese 2.0 927 baird-ave santa-clara
  santa-clara-county bay-area)
 (6292 tokyo-sushi japanese 2.0 3006 el-camino-real santa-clara
  santa-clara-county bay-area)
 (6293 takara-japanese-restaurant japanese 3.3 1800 soquel-ave
  santa-cruz santa-cruz-county bay-area)
 (6294 tasuke-restaurant japanese 2.0 314 spring-st suisun-city
  solano-county bay-area)
 (6295 imperial-teriyaki japanese 2.0 1036 e-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (6296 kadoya-japanese-restaurant japanese 2.7 161 s-sunnyvale-ave
  sunnyvale santa-clara-county bay-area)
 (6297 jiro-japanese-restaurant japanese 2.0 34533 alvarado-niles-rd
  union-city alameda-county bay-area)
 (6298 shabana japanese 2.0 34579 alvarado-niles-rd union-city
  alameda-county bay-area)
 (6299 house-of-saki-restaurant japanese 3.4 1716 n-main-st
  walnut-creek contra-costa-county bay-area)
 (6300 imura-japanese-restaurant japanese 2.0 1994 main-st-no.-c
  watsonville santa-cruz-county bay-area)
 (6301 restaurant-miyuki japanese 3.0 452 e-lake-ave watsonville
  santa-cruz-county bay-area)
 (6302 ma-ma-ya japanese 2.7 92 judah-st san-francisco
  san-francisco-county bay-area)
 (6303 shimo-no.-2 japanese 2.0 733 taraval-st san-francisco
  san-francisco-county bay-area)
 (6304 new-mallys japanese 2.6 2118 first-st livermore alameda-county
  bay-area)
 (6305 tengu-japanese-restaurant japanese 2.0 8235 old-redwood-hwy
  cotati sonoma-county bay-area)
 (6306 sushi-bar japanese 2.0 1015 coombs-st napa napa-county
  napa-valley)
 (6307 matsuyama-restaurant japanese 2.0 185 sn-marin-dr novato
  marin-county bay-area)
 (6308 taki-japanese-restaurant japanese 3.0 452 ignacio-blvd novato
  marin-county bay-area)
 (6309 hana-japanese-restaurant-&-deli japanese 2.0 101
  golf-course-dr-red-lion-plaza rohnert-park sonoma-county bay-area)
 (6310 kyoto-restaurant japanese 2.7 5 padre-pky rohnert-park
  sonoma-county bay-area)
 (6311 fujiyama-japanese-restaurant japanese 2.0 2130 x4th-st
  san-rafael marin-county bay-area)
 (6312 tomoe-japanese-restaurant japanese 2.0 810 x3rd-st san-rafael
  marin-county bay-area)
 (6313 yu-shang-restaurant-&-sushi-bar japanese 1.7 180 bellam-blvd
  san-rafael marin-county bay-area)
 (6314 hibachi-san japanese 2.0 235 santa-rosa-plz santa-rosa
  sonoma-county bay-area)
 (6315 musashi-japanese-cuisine japanese 2.0 0 unknown santa-rosa
  sonoma-county bay-area)
 (6316 sakura-japanese-restaurant-&-sushi-bar japanese 2.8 300
  coddingtown-ctr santa-rosa sonoma-county bay-area)
 (6317 shogun japanese 2.3 2350 midway-dr santa-rosa sonoma-county
  bay-area)
 (6318 yao-kiku-japanese-restaurant japanese 2.0 2700 yulupa-ave
  santa-rosa sonoma-county bay-area)
 (6319 fukusuke-japanese-restaurant japanese 2.3 45 caledonia-st
  sausalito unknown bay-area)
 (6320 misaki japanese 2.0 2138 springs-rd vallejo solano-county
  bay-area)
 (6321 isuzu-restaurant japanese 2.0 1581 webster-st san-francisco
  san-francisco-county bay-area)
 (6322 kabuki-hibachi-restaurant japanese 2.0 22 peace-plz
  san-francisco san-francisco-county bay-area)
 (6323 kame-sushi-restaurant japanese 2.0 1825 post-st san-francisco
  san-francisco-county bay-area)
 (6324 kappa-japanese-restaurant japanese 3.3 1700 post-st
  san-francisco san-francisco-county bay-area)
 (6325 kitaro-japanese-restaurant japanese 2.8 5850 geary-blvd
  san-francisco san-francisco-county bay-area)
 (6326 mikaku-restaurant japanese 2.0 323 grant-ave san-francisco
  san-francisco-county bay-area)
 (6327 miyabi-japanese-restaurant japanese 2.7 253 church-st
  san-francisco san-francisco-county bay-area)
 (6328 miyako-restaurant-yakitori japanese 2.0 1707 buchanan-st
  san-francisco san-francisco-county bay-area)
 (6329 saji-japanese-restaurant japanese 2.7 3232 scott-st
  san-francisco san-francisco-county bay-area)
 (6330 sakura-japanese-restaurant japanese 2.0 5041 geary-blvd
  san-francisco san-francisco-county bay-area)
 (6331 sushi-a-restaurant japanese 3.7 1737 buchanan-st san-francisco
  san-francisco-county bay-area)
 (6332 tekka-japanese-restaurant japanese 3.0 537 balboa-st
  san-francisco san-francisco-county bay-area)
 (6333 tokyo-express-restaurant japanese 2.0 660 sacramento-st
  san-francisco san-francisco-county bay-area)
 (6334 tora-ya-restaurant japanese 2.0 1734 post-st san-francisco
  san-francisco-county bay-area)
 (6335 tsuruyoshi-restaurant japanese 2.0 209 kearny-st san-francisco
  san-francisco-county bay-area)
 (6336 wayo-sushi-restaurant japanese 2.0 1407 van-ness-ave
  san-francisco san-francisco-county bay-area)
 (6337 we-be-sushi japanese 2.3 1071 valencia-st san-francisco
  san-francisco-county bay-area)
 (6338 we-be-sushi japanese 2.5 3226 geary-blvd san-francisco
  san-francisco-county bay-area)
 (6339 we-be-sushi japanese 2.0 94 judah-st san-francisco
  san-francisco-county bay-area)
 (6340 mikado japanese 2.0 161 main-st los-altos santa-clara-county
  bay-area)
 (6341 house-of-genji japanese 2.3 1335 n.-first-st san-jose
  santa-clara-county bay-area)
 (6342 sushi-to-dai-for japanese 2.3 869 x4th-st san-rafael
  marin-county bay-area)
 (6343 sushi-ran japanese 3.1 107 caledonia sausalito unknown bay-area)
 (6344 minokichi japanese 2.9 150 high-st palo-alto santa-clara-county
  bay-area)
 (6345 jidaiya japanese 2.0 0 unknown palo-alto santa-clara-county
  bay-area)
 (6346 tomisuno japanese 2.0 0 el-camino-real mountain-view
  santa-clara-county bay-area)
 (6347 sushi-on-the-run japanese 2.7 114 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (6348 sushizen japanese 2.0 1305 n.-first-st san-jose
  santa-clara-county bay-area)
 (6349 may-japanese-sushi-bento japanese 2.0 2204 x22nd oakland
  alameda-county bay-area)
 (6350 sushi-a-float japanese 2.2 2014 shattuck berkeley alameda-county
  bay-area)
 (6351 tokyos-bliss japanese 2.7 2134 allison berkeley alameda-county
  bay-area)
 (6352 yo-yo japanese 2.0 1611 post san-francisco san-francisco-county
  bay-area)
 (6353 benkyo-do japanese 2.0 1747 sutter san-francisco
  san-francisco-county bay-area)
 (6354 hua-bei-restaurant japanese 2.0 1711 sutter san-francisco
  san-francisco-county bay-area)
 (6355 akasaka-cocktail japanese 2.7 1723 sutter san-francisco
  san-francisco-county bay-area)
 (6356 hana-cable-sushi japanese 2.0 0 center san-francisco
  san-francisco-county bay-area)
 (6357 umeko japanese 2.0 0 center san-francisco san-francisco-county
  bay-area)
 (6358 kuishnbo japanese 2.0 0 center-no.260 san-francisco
  san-francisco-county bay-area)
 (6359 tanpopo japanese 3.0 0 center-no.280 san-francisco
  san-francisco-county bay-area)
 (6360 on-the-bridge japanese 2.0 0 center san-francisco
  san-francisco-county bay-area)
 (6361 maki japanese 2.0 0 center san-francisco san-francisco-county
  bay-area)
 (6362 tan-tan japanese 2.0 0 center san-francisco san-francisco-county
  bay-area)
 (6363 benihana japanese 2.3 2203 n.-tracy-blvd tracy
  san-joaquin-county unknown)
 (6364 yama-sushi japanese 2.0 1421 w.-11th-st tracy san-joaquin-county
  unknown)
 (6365 sushi-zen japanese 3.6 1305 north-first-st san-jose
  santa-clara-county bay-area)
 (6366 eulipia japanese 3.1 nil nil san-jose santa-clara-county
  bay-area)
 (6367 momomtaro japanese 2.8 46997 warm-springs-blvd fremont
  alameda-county bay-area)
 (6368 sushi-boats japanese 2.3 4193 cushing-parkway fremont
  alameda-county bay-area)
 (6369 okazu-ya japanese 2.0 914 clement san-francisco
  san-francisco-county bay-area)
 (6370 murasaki japanese 2.0 211 clement san-francisco
  san-francisco-county bay-area)
 (6371 dojima-an japanese 2.0 219 ofarrell san-francisco
  san-francisco-county bay-area)
 (6372 hime japanese 2.0 336 ofarrell san-francisco
  san-francisco-county bay-area)
 (6373 ichiraku japanese 2.8 3 geary san-francisco san-francisco-county
  bay-area)
 (6374 berkel-berkel japanese 2.0 2428 telegraph-ave berkeley
  alameda-county bay-area)
 (6375 akira japanese 2.3 819 x4th-st san-rafael marin-county bay-area)
 (6376 jidai-ya japanese 2.5 0 ave palo-alto santa-clara-county
  bay-area)
 (6377 sinfuki japanese 2.7 832 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (6378 niwa-restaurant japanese 3.0 1 camino-sobrante orinda
  contra-costa-county bay-area)
 (6379 nori-sushi japanese 3.0 1815 market-st san-francisco
  san-francisco-county bay-area)
 (6380 michikusa japanese 2.7 190 s.-frances sunnyvale
  santa-clara-county bay-area)
 (6381 kyoto-palace japanese 3.0 0 shopping-center campbell
  santa-clara-county bay-area)
 (6382 sushi-express japanese 1.8 4300 great-america-parkway
  santa-clara santa-clara-county bay-area)
 (6383 toshi-sushi japanese 2.8 6100 la-salle-ave oakland
  alameda-county bay-area)
 (6384 kotoburi-japanese-restaurant japanese 2.2 3920 piedmont-ave
  oakland alameda-county bay-area)
 (6385 sato japanese 3.3 3015 hopyard-rd pleasanton alameda-county
  bay-area)
 (6386 kitahama japanese 2.7 974 s.-saratoga-sunnyvale-rd. san-jose
  santa-clara-county bay-area)
 (6387 toshis-sushiya japanese 3.9 211 el-camino-real menlo-park
  san-mateo-county bay-area)
 (6388 teriyaki-house japanese 2.0 1778 piner-rd santa-rosa
  sonoma-county bay-area)
 (6389 ganko-sushi japanese 3.3 1131 cherry-st san-carlos
  san-mateo-county bay-area)
 (6390 nijo-castle japanese 2.0 39888 balentine-dr. newark
  alameda-county bay-area)
 (6391 momiji japanese 2.6 0 unknown pleasanton alameda-county
  bay-area)
 (6392 tenkyu japanese 2.7 1315 x4th-st. san-rafael marin-county
  bay-area)
 (6393 saffron japanese 2.7 1662 lombard san-francisco
  san-francisco-county bay-area)
 (6394 sushi-sams-etomata japanese 3.2 218 e.-3rd-st san-mateo
  san-mateo-county bay-area)
 (6395 miraku japanese 2.7 2131 n.-brd walnut-creek contra-costa-county
  bay-area)
 (6396 sushi-capitola japanese 3.0 820 bay-st capitola unknown
  bay-area)
 (6397 kabocha japanese 2.0 5912 college-avenue oakland alameda-county
  bay-area)
 (6398 seto-restaurant japanese 3.3 1082 e-el-camino sunnyvale
  santa-clara-county bay-area)
 (6399 chopsticks japanese 2.0 209 forest-ave pacific-grove
  monterey-county monterey)
 (6400 kuya-rey japanese 2.0 53 x3rd san-francisco san-francisco-county
  bay-area)
 (6401 yoshimina-bowl japanese 2.0 0 w.-el-camino sunnyvale
  santa-clara-county bay-area)
 (6402 teriyaki-to-go japanese 2.7 822 irving-st san-francisco
  san-francisco-county bay-area)
 (6403 komatsu japanese 3.4 300 orchard-city-dr campbell
  santa-clara-county bay-area)
 (6404 kamakura japanese 2.3 135 n.-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (6405 tsuru-sushi japanese 2.7 1427 e.-14th-st san-leandro
  alameda-county bay-area)
 (6406 subaru-restaurant japanese 2.8 nil nil mountain-view
  santa-clara-county bay-area)
 (6407 isobune japanese 3.6 5897 college-ave oakland alameda-county
  bay-area)
 (6408 california-juice juice-bar 3.4 0 laurel-across-from-b-of-a
  san-carlos san-mateo-county bay-area)
 (6409 andys-sunrise-juice-bar juice-bar 2.0 1129 market-st
  san-francisco san-francisco-county bay-area)
 (6410 davids-juice-bar juice-bar 2.0 1650 balboa-st san-francisco
  san-francisco-county bay-area)
 (6411 menlo-java-&-juice-bar juice-bar 2.0 1083 el-camino-real
  menlo-park san-mateo-county bay-area)
 (6412 juice-central juice-bar 2.8 0 camino-real menlo-park
  san-mateo-county bay-area)
 (6413 korean-barbeque-restaurant korean 2.0 1722 university-ave
  berkeley alameda-county bay-area)
 (6414 milvia-restaurant korean 2.3 2235 milvia-st berkeley
  alameda-county bay-area)
 (6415 korea-palace korean 3.3 4436 clayton-rd concord
  contra-costa-county bay-area)
 (6416 koreana-restaurant korean 2.0 574 parker-rd fairfield
  solano-county bay-area)
 (6417 jin-mi-korean-restaurant korean 2.0 39033 state-st. fremont
  alameda-county bay-area)
 (6418 sun-set-korean-b-b korean 2.0 3655 thornton-ave fremont
  alameda-county bay-area)
 (6419 dong-nae-korean-cuisine korean 2.7 19740 mission-blvd hayward
  alameda-county bay-area)
 (6420 seoul-house-korean-rest korean 2.0 346 x13th-st oakland
  alameda-county bay-area)
 (6421 royal-korean-restaurant korean 2.8 2025 santa-rita-rd pleasanton
  alameda-county bay-area)
 (6422 korea-bar-b korean 2.0 1610 el-camino-real san-bruno
  san-mateo-county bay-area)
 (6423 korea-garden-b-b korean 2.0 528 san-mateo-ave san-bruno
  san-mateo-county bay-area)
 (6424 hahns-hibachi korean 2.6 1710 polk-st. san-francisco
  san-francisco-county bay-area)
 (6425 han-il-kwan-korean-restaurant korean 2.3 1802 balboa
  san-francisco san-francisco-county bay-area)
 (6426 korea-house korean 2.7 1640 post san-francisco
  san-francisco-county bay-area)
 (6427 new-korea-house korean 3.0 1620 post san-francisco
  san-francisco-county bay-area)
 (6428 seoul-garden korean 3.0 22 peace-plaza san-francisco
  san-francisco-county bay-area)
 (6429 korea-buffet korean 2.3 1783 w-san-carlos-st san-jose
  santa-clara-county bay-area)
 (6430 korean-palace-restaurant korean 2.0 2297 stevens-creek-blvd
  san-jose santa-clara-county bay-area)
 (6431 seoul-restaurant korean 2.0 1926 cape-hilda-pl san-jose
  santa-clara-county bay-area)
 (6432 the-palace-korean-restaurant-&-nght korean 2.0 1205 the-alameda
  san-jose santa-clara-county bay-area)
 (6433 korea-house korean 3.8 2340 el-camino-real santa-clara
  santa-clara-county bay-area)
 (6434 korea-restaurant korean 2.0 3258 el-camino-real santa-clara
  santa-clara-county bay-area)
 (6435 emi korean 2.3 1001 cedar-st santa-cruz santa-cruz-county
  bay-area)
 (6436 emi-korean-cuisine korean 2.0 111 liberty-st santa-cruz
  santa-cruz-county bay-area)
 (6437 california-buffet korean 2.0 1010 sunnyvale-saratoga-rd
  sunnyvale santa-clara-county bay-area)
 (6438 kimberlys-korean-garden-cabar korean 2.0 606
  s-bernardo-ave-no.-b sunnyvale santa-clara-county bay-area)
 (6439 korean-garden-restaurant korean 2.0 606 s-bernardo-ave sunnyvale
  santa-clara-county bay-area)
 (6440 korean-cuisine korean 2.0 32083 alvarado-niles-rd union-city
  alameda-county bay-area)
 (6441 soon-kee-restaurant korean 2.0 32136 alvarado-blvd union-city
  alameda-county bay-area)
 (6442 sorabol korean 3.3 1546 bonanza-st walnut-creek
  contra-costa-county bay-area)
 (6443 chowon-korean-restaurant korean 2.0 2769 lombard-st
  san-francisco san-francisco-county bay-area)
 (6444 korean-restaurant-sorabol korean 2.0 121 spear-st san-francisco
  san-francisco-county bay-area)
 (6445 new-village-korean-restaurant korean 2.0 4828 geary-blvd
  san-francisco san-francisco-county bay-area)
 (6446 sorabol-korean-restaurant korean 2.0 121 spear-st san-francisco
  san-francisco-county bay-area)
 (6447 brothers-restaurant korean 3.6 4128 geary-blvd. san-francisco
  san-francisco-county bay-area)
 (6448 berkel-berkel korean 2.0 2428 telegraph-ave berkeley
  alameda-county bay-area)
 (6449 korean-bbq-buffet korean 2.0 1192 davis-st. san-leandro
  alameda-county bay-area)
 (6450 koryo-restaurant korean 2.5 0 unknown oakland alameda-county
  bay-area)
 (6451 three-jung korean 2.3 459 castro-st mountain-view
  santa-clara-county bay-area)
 (6452 jang-tu-restaurant korean 2.7 1012 e.-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (6453 sa-rang-bang korean 3.8 937 geary-st san-francisco
  san-francisco-county bay-area)
 (6454 invitation-house korean 2.3 270 rockaway-beach-avenue pacifica
  san-mateo-county bay-area)
 (6455 sam-won-kal-bi-korean-cuisine korean 3.0 2600 telegraph-avenue
  oakland alameda-county bay-area)
 (6456 buckhorn-steak-&-roadhouse lamb 2.3 2 main-st winters
  yolo-county sacramento-area)
 (6457 cafe-vox-populi latin 2.0 3105 shattuck-ave berkeley
  alameda-county bay-area)
 (6458 cafe-de-la-paz latin 3.0 1600 shattuck-ave berkeley
  alameda-county bay-area)
 (6459 just-like-home-restaurant lebanese 2.0 1924 irving san-francisco
  san-francisco-county bay-area)
 (6460 special-teas-&-heirlooms lunch 2.7 520 main-st pleasanton
  alameda-county bay-area)
 (6461 good-heavens lunch 2.7 49 n.-washington sonora tuolumne-county
  yosemite-and-mono-lake-area)
 (6462 burma-super-star-restaurant mandarin 3.0 309 clement-st
  san-francisco san-francisco-county bay-area)
 (6463 taste-of-china mandarin 3.5 nil nil san-jose santa-clara-county
  bay-area)
 (6464 panama-hotel-and-restaurant mediterranean 2.3 4 bayview-st
  san-rafael marin-county bay-area)
 (6465 the-mediterranean-cocktail-lou mediterranean 2.0 265 center-ave
  aptos santa-cruz-county bay-area)
 (6466 la-mediterranee mediterranean 3.7 2936 college-ave berkeley
  alameda-county bay-area)
 (6467 lalimes mediterranean 3.9 1329 gilman-st berkeley alameda-county
  bay-area)
 (6468 mediterraneum-kitchen mediterranean 2.0 2475 telegraph-ave
  berkeley alameda-county bay-area)
 (6469 la-cocina mediterranean 2.0 19950 hesperian-blvd hayward
  alameda-county bay-area)
 (6470 baltic-restaurant mediterranean 3.0 135 park-pl. richmond
  contra-costa-county bay-area)
 (6471 circolo-restaurant-&-champagneria mediterranean 2.0 161 sutter
  san-francisco san-francisco-county bay-area)
 (6472 kan-zeman mediterranean 3.4 nil nil san-francisco
  san-francisco-county bay-area)
 (6473 la-mediterranee mediterranean 3.2 288 noe-st san-francisco
  san-francisco-county bay-area)
 (6474 ramis-caffe-&-patio mediterranean 2.3 1361 church san-francisco
  san-francisco-county bay-area)
 (6475 el-maghreb-moroccan-restaurant mediterranean 2.0 145
  w-santa-clara-st san-jose santa-clara-county bay-area)
 (6476 menara-moroccan-restaurant mediterranean 2.4 41 e-gish-rd
  san-jose santa-clara-county bay-area)
 (6477 the-silver-spoon mediterranean 2.0 122 s.-sunnyvale-ave
  sunnyvale santa-clara-county bay-area)
 (6478 el-jarrito-mexican-food-restrn mediterranean 2.0 31810
  alvarado-blvd union-city alameda-county bay-area)
 (6479 mexicolindo mediterranean 2.0 33306 alvarado-niles-rd union-city
  alameda-county bay-area)
 (6480 taheris mediterranean 2.7 2999 oak-rd walnut-creek
  contra-costa-county bay-area)
 (6481 mark-allen-restaurant mediterranean 3.0 6795 washington-st
  yountville napa-county napa-valley)
 (6482 mediterranean-cafe-bistro mediterranean 2.8 1077 el-camino-real
  menlo-park san-mateo-county bay-area)
 (6483 rendezvous-du-monde mediterranean 3.0 431 bush san-francisco
  san-francisco-county bay-area)
 (6484 splendido mediterranean 3.0 0 embarcadero-podium-level
  san-francisco san-francisco-county bay-area)
 (6485 opera-plaza-delicatessen mediterranean 2.7 601 van-ness-avenue
  san-francisco san-francisco-county bay-area)
 (6486 ristorante-vino mediterranean 2.3 701 union-st san-francisco
  san-francisco-county bay-area)
 (6487 cafe-mediterranean mediterranean 2.0 8204 old-redwood-hwy cotati
  sonoma-county bay-area)
 (6488 bistro-mediterranean mediterranean 2.0 641 vallejo san-francisco
  san-francisco-county bay-area)
 (6489 faz mediterranean 2.7 1100 n.-mathilda sunnyvale
  santa-clara-county bay-area)
 (6490 odyssia mediterranean 3.3 0 &-hearst berkeley alameda-county
  bay-area)
 (6491 faz mediterranean 3.2 600 hartz-ave danville contra-costa-county
  bay-area)
 (6492 margherita-de-roma mediterranean 3.0 0 shopping-center cupertino
  santa-clara-county bay-area)
 (6493 marbella mediterranean 3.0 14109 winchester-blvd. los-gatos
  santa-clara-county bay-area)
 (6494 taheris mediterranean 2.0 2999 oak-rd walnut-creek
  contra-costa-county bay-area)
 (6495 zax mediterranean 2.7 2330 taylor-st san-francisco
  san-francisco-county bay-area)
 (6496 paradiso mediterranean 3.1 685 bancroft-ave san-leandro
  alameda-county bay-area)
 (6497 le-pleasant-jardin mediterranean 2.0 500 main-st pleasanton
  alameda-county bay-area)
 (6498 blandinas-cafe mediterranean 2.7 907 first-st. benicia
  solano-county bay-area)
 (6499 courtyard-cafe mediterranean 2.7 1349 park-st alameda
  alameda-county bay-area)
 (6500 fandango mediterranean 2.8 223 x17th pacific-grove
  monterey-county monterey)
 (6501 iszernia mediterranean 3.0 0 blvd.-bet.-estudillo-&-collier
  san-leandro alameda-county bay-area)
 (6502 the-garden-restaurant mediterranean 2.3 nil nil novato
  marin-county bay-area)
 (6503 asena-restaurant mediterranean 2.7 2508 santa-clara-avenue
  alameda alameda-county bay-area)
 (6504 the-acorn-restaurant mediterranean 2.7 1906 el-camino-real
  menlo-park san-mateo-county bay-area)
 (6505 ya-yas mesopotamian 2.8 1220
  avenue-between-lincoln-and-irving-st san-francisco
  san-francisco-county bay-area)
 (6506 metropolitan metropolitan 2.7 0 st san-francisco
  san-francisco-county bay-area)
 (6507 acapulco-restaurant mexican 3.7 2104 lincoln-ave alameda
  alameda-county bay-area)
 (6508 alameda-taqueria mexican 2.8 1513 park-st alameda alameda-county
  bay-area)
 (6509 chevys-mexican-restaurant mexican 3.0 2400 mariner-square
  alameda alameda-county bay-area)
 (6510 cocina-maria mexican 2.0 2525 blanding-ave alameda
  alameda-county bay-area)
 (6511 el-caballo-restaurant mexican 3.2 891 island-dr alameda
  alameda-county bay-area)
 (6512 juanitas-restaurant mexican 3.0 1324 park-st alameda
  alameda-county bay-area)
 (6513 la-pinata mexican 3.0 1440 park-st alameda alameda-county
  bay-area)
 (6514 mazatlan-restaurant mexican 2.0 300 park-st alameda
  alameda-county bay-area)
 (6515 taqueria-ramiro-&-sons mexican 2.8 2321 alameda-ave alameda
  alameda-county bay-area)
 (6516 wholly-guacamole mexican 2.0 1410 encinal-ave alameda
  alameda-county bay-area)
 (6517 don-joses-mexican-restaurants mexican 2.0 3168 danville-blvd
  alamo contra-costa-county bay-area)
 (6518 gordo-taqueria mexican 3.2 1423 solano-ave albany alameda-county
  bay-area)
 (6519 hot-shop mexican 2.8 909 san-pablo-ave albany alameda-county
  bay-area)
 (6520 cantina-de-rio mexican 2.0 416 w-2nd-st antioch
  contra-costa-county bay-area)
 (6521 la-buena-suerte mexican 2.0 3702 lone-tree-way-no.-13 antioch
  contra-costa-county bay-area)
 (6522 little-mexico-mexican-food mexican 2.5 2100 a-st antioch
  contra-costa-county bay-area)
 (6523 los-three-amigos mexican 2.7 1123 e-18th-st antioch
  contra-costa-county bay-area)
 (6524 taqueria-salsa mexican 2.7 3612 delta-fair-blvd antioch
  contra-costa-county bay-area)
 (6525 manuels-mexican-restaurant mexican 3.2 0 unknown aptos
  santa-cruz-county bay-area)
 (6526 rio-del-mar-mexican-cuisine mexican 2.0 9067 soquel-dr aptos
  santa-cruz-county bay-area)
 (6527 the-acapulco-restaurant mexican 2.0 270 carneros-ave aromas
  unknown unknown)
 (6528 los-metates-taqueria mexican 2.3 120 harbor-blvd belmont
  san-mateo-county bay-area)
 (6529 t-&-b mexican 2.8 520 masonic-way belmont san-mateo-county
  bay-area)
 (6530 la-salsa mexican 2.3 9410 mill-st ben-lomond santa-cruz-county
  bay-area)
 (6531 ensenada-restaurant mexican 2.0 864 southampton-rd benicia
  solano-county bay-area)
 (6532 mi-casita-mexican-restaurant mexican 2.5 818 x1st-st benicia
  solano-county bay-area)
 (6533 ay-caramba mexican 3.0 1901 university-ave berkeley
  alameda-county bay-area)
 (6534 ay-caramba mexican 3.0 1903 university-ave berkeley
  alameda-county bay-area)
 (6535 cancun-taqueria mexican 3.3 2134 allston-way berkeley
  alameda-county bay-area)
 (6536 casa-de-eva-mexican-restaurant mexican 1.7 2826 telegraph-ave
  berkeley alameda-county bay-area)
 (6537 celias mexican 2.0 2040 x4th-st berkeley alameda-county
  bay-area)
 (6538 dos-burros-inc mexican 2.0 2242 sacramento-st berkeley
  alameda-county bay-area)
 (6539 el-sombrero mexican 2.3 2101 university-ave berkeley
  alameda-county bay-area)
 (6540 gordo-taqueria mexican 3.4 2989 college-ave berkeley
  alameda-county bay-area)
 (6541 guerreos mexican 2.7 2504 shattuck-ave berkeley alameda-county
  bay-area)
 (6542 guerreros-taqueria mexican 2.0 2501 san-pablo-ave berkeley
  alameda-county bay-area)
 (6543 juans-place mexican 2.7 941 carleton-st berkeley alameda-county
  bay-area)
 (6544 kims-burrito mexican 1.7 2525 dwight-way berkeley alameda-county
  bay-area)
 (6545 la-burrita mexican 2.0 2530 durant-ave berkeley alameda-county
  bay-area)
 (6546 la-mancha mexican 2.0 2971 shattuck-ave berkeley alameda-county
  bay-area)
 (6547 la-pinatita-restaurant mexican 2.0 2309 san-pablo-ave berkeley
  alameda-county bay-area)
 (6548 laburrita mexican 1.7 1832 euclid-ave berkeley alameda-county
  bay-area)
 (6549 las-palmas mexican 2.0 3221 adeline-st berkeley alameda-county
  bay-area)
 (6550 picante-taqueria-&-cantina mexican 3.2 1328 x6th-st berkeley
  alameda-county bay-area)
 (6551 taqueria mexican 3.0 2119 kittredge-st berkeley alameda-county
  bay-area)
 (6552 zona-rosa mexican 3.1 2366 telegraph-ave berkeley alameda-county
  bay-area)
 (6553 adelitas mexican 2.6 0 unknown boulder-creek santa-cruz-county
  bay-area)
 (6554 el-camino-restaurant mexican 2.3 6611 brentwood-blvd brentwood
  contra-costa-county bay-area)
 (6555 taqueria-cha-cha-cha mexican 2.5 8335 brentwood-blvd-ste-b
  brentwood contra-costa-county bay-area)
 (6556 el-patio-taqueria mexican 2.3 1419 burlingame-ave burlingame
  san-mateo-county bay-area)
 (6557 el-torito mexican 2.8 1590 bayshore-hwy burlingame
  san-mateo-county bay-area)
 (6558 la-pinata mexican 3.4 1205 burlingame-ave burlingame
  san-mateo-county bay-area)
 (6559 mexico-city-tacos mexican 1.5 1159 california-dr burlingame
  san-mateo-county bay-area)
 (6560 las-brasas mexican 2.0 1350 lincoln-ave calistoga napa-county
  napa-valley)
 (6561 morenos mexican 2.0 1428 lincoln-ave calistoga napa-county
  napa-valley)
 (6562 del-taco mexican 2.0 771 w-hamilton-ave campbell
  santa-clara-county bay-area)
 (6563 el-burro-restaurants mexican 2.6 570 the-pruneyard campbell
  santa-clara-county bay-area)
 (6564 el-toreo mexican 2.0 2298 s-bascom-ave campbell
  santa-clara-county bay-area)
 (6565 jalisco mexican 2.8 525 east-campbell-ave campbell
  santa-clara-county bay-area)
 (6566 la-perla-taqueria mexican 2.0 2298 s-bascom-ave campbell
  santa-clara-county bay-area)
 (6567 rock-n-tacos mexican 2.0 100 w-rincon-ave-no.-208 campbell
  santa-clara-county bay-area)
 (6568 taco-bravo-of-campbell mexican 3.3 1950 s-bascom-ave campbell
  santa-clara-county bay-area)
 (6569 una-mas mexican 3.3 1640 s-bascom-ave-ste-a campbell
  santa-clara-county bay-area)
 (6570 el-toro-bravo mexican 2.0 123 monterey-ave capitola unknown
  bay-area)
 (6571 mexicali-taqueria mexican 2.0 3555 clares-st-ste-ll capitola
  unknown bay-area)
 (6572 burrito-shops-inc mexican 3.0 3843 castro-valley-blvd
  castro-valley alameda-county bay-area)
 (6573 burrito-shops-inc mexican 2.8 3483 castro-valley-blvd
  castro-valley alameda-county bay-area)
 (6574 don-joses mexican 2.6 3430 village-dr castro-valley
  alameda-county bay-area)
 (6575 panchos-homemade-mexican-food mexican 2.3 2788
  castro-valley-blvd castro-valley alameda-county bay-area)
 (6576 tacos-uruapan-taqueria mexican 2.0 22343 redwood-rd
  castro-valley alameda-county bay-area)
 (6577 alfonsos-mexican-restaurant mexican 2.0 11252 merritt-st
  castroville monterey-county monterey)
 (6578 betos-taqueria-bar-&-pool mexican 2.0 10499 merritt-st
  castroville monterey-county monterey)
 (6579 el-torito mexican 2.0 10624 merritt-st castroville
  monterey-county monterey)
 (6580 margaritas-taqueria mexican 2.0 10680 merritt-st castroville
  monterey-county monterey)
 (6581 los-metates-taqueria mexican 2.0 260 san-pedro-rd colma
  san-mateo-county bay-area)
 (6582 c-c-oles mexican 2.5 4633 clayton-rd concord contra-costa-county
  bay-area)
 (6583 el-faro-mexican-fast-food mexican 2.3 2280 monument-blvd concord
  contra-costa-county bay-area)
 (6584 el-rancho-restaurant mexican 2.0 1450 monument-blvd-no.-a
  concord contra-costa-county bay-area)
 (6585 el-tapatio-restaurant mexican 2.3 1802 willow-pass-rd concord
  contra-costa-county bay-area)
 (6586 el-torito mexican 2.5 1975 diamond-blvd concord
  contra-costa-county bay-area)
 (6587 el-yahualica-tacos mexican 2.0 2699 monument-blvd-ste-i concord
  contra-costa-county bay-area)
 (6588 guadalajara-grill mexican 3.2 5400 ygnacio-valley-rd-ste-b-6
  concord contra-costa-county bay-area)
 (6589 la-limenita mexican 2.0 4860 clayton-rd-apt-7 concord
  contra-costa-county bay-area)
 (6590 las-flautas mexican 2.0 3601 dumbarton-st concord
  contra-costa-county bay-area)
 (6591 los-compadres-mex-restaurant mexican 2.0 2151 salvio-st-ste-l
  concord contra-costa-county bay-area)
 (6592 margaritas-taqueria mexican 2.0 2186 solano-way concord
  contra-costa-county bay-area)
 (6593 mexican-burritos mexican 2.3 1500 monument-blvd-ste-e3 concord
  contra-costa-county bay-area)
 (6594 rancho-grande mexican 2.7 1960 concord-ave concord
  contra-costa-county bay-area)
 (6595 salsas-gourmet-mexican-food mexican 2.0 785 oak-grove-rd-ste-e4
  concord contra-costa-county bay-area)
 (6596 senor-burrito mexican 2.0 1844 grant-st concord
  contra-costa-county bay-area)
 (6597 taquerea-de-marin-&-de-walnut mexican 2.0 1847 willow-pass-rd
  concord contra-costa-county bay-area)
 (6598 taqueria-las-comadres mexican 2.0 1895 farm-bureau-rd-ste-e
  concord contra-costa-county bay-area)
 (6599 taqueria-m-grill mexican 2.0 4787 clayton-rd-no.-a concord
  contra-costa-county bay-area)
 (6600 el-torito mexican 3.3 10330 n-wolfe-rd cupertino
  santa-clara-county bay-area)
 (6601 taqueria-las-flores mexican 2.7 10123 n-wolfe-rd cupertino
  santa-clara-county bay-area)
 (6602 el-gran-taco mexican 2.0 950 king-dr-no.-125 daly-city
  san-mateo-county bay-area)
 (6603 el-torito mexican 2.3 379 gellert-blvd daly-city
  san-mateo-county bay-area)
 (6604 taqueria-la-reina mexican 2.0 311 e-market-st daly-city
  san-mateo-county bay-area)
 (6605 taqueria-morelos mexican 2.0 2 chester-st daly-city
  san-mateo-county bay-area)
 (6606 taqueria-taconazo mexican 2.0 7384 mission-st daly-city
  san-mateo-county bay-area)
 (6607 az-teca mexican 1.4 558 san-ramon-valley-blvd danville
  contra-costa-county bay-area)
 (6608 el-nido mexican 2.8 107 town-and-country-dr-no.-a danville
  contra-costa-county bay-area)
 (6609 high-tech-burrito-corporation mexican 3.5 202
  sycamore-valley-rd-w danville contra-costa-county bay-area)
 (6610 la-ultima mexican 2.4 263 hartz-ave danville contra-costa-county
  bay-area)
 (6611 tagueria-express mexican 2.0 3452 camino-tassajara danville
  contra-costa-county bay-area)
 (6612 taqueria-mexican-grill-3-danvi mexican 2.3 348 hartz-ave
  danville contra-costa-county bay-area)
 (6613 casa-orozco mexican 2.8 7995 amador-valley-blvd dublin
  alameda-county bay-area)
 (6614 el-torito mexican 1.5 7202 amador-plaza-rd dublin alameda-county
  bay-area)
 (6615 taqueria-azteca mexican 2.0 7155 amador-plaza-rd dublin
  alameda-county bay-area)
 (6616 two-pesos-mexican-cafe mexican 2.0 6568 village-pky dublin
  alameda-county bay-area)
 (6617 belias-mexican-food-&-video mexican 2.0 641 donohoe-st
  east-palo-alto san-mateo-county bay-area)
 (6618 emmanuel-bakery-taqueria-pizze mexican 2.0 1489
  e-bayshore-rd-no.-91 east-palo-alto san-mateo-county bay-area)
 (6619 las-carretas-mexican-restaurant mexican 2.0 2118 university-ave
  east-palo-alto san-mateo-county bay-area)
 (6620 marias-taqueria mexican 2.0 2150 university-ave east-palo-alto
  san-mateo-county bay-area)
 (6621 tacos-jalapa mexican 2.0 960 oconnor-st east-palo-alto
  san-mateo-county bay-area)
 (6622 best-burritos mexican 2.0 10390 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (6623 chevys-mexican-restaurant mexican 2.3 0 el-cerrito-plaza
  el-cerrito contra-costa-county bay-area)
 (6624 guadalajaras-super-burrito mexican 2.7 11252 san-pablo-ave
  el-cerrito contra-costa-county bay-area)
 (6625 el-sobrante mexican 2.0 3873 san-pablo-dam-rd el-sobrante
  contra-costa-county bay-area)
 (6626 el-sobrante mexican 2.0 3873 san-pablo-dam-rd el-sobrante
  contra-costa-county bay-area)
 (6627 los-cerro mexican 2.0 4705 valley-view-rd-ste-h el-sobrante
  contra-costa-county bay-area)
 (6628 la-chalupa-restaurant mexican 2.0 1092 x43rd-st-apt-c emeryville
  alameda-county bay-area)
 (6629 alex-tacos mexican 2.0 1902 n-texas-st fairfield solano-county
  bay-area)
 (6630 azteca mexican 2.0 1731 n-texas-st fairfield solano-county
  bay-area)
 (6631 burrito-palace-iii mexican 2.0 1350 gateway-blvd-ste-a5
  fairfield solano-county bay-area)
 (6632 chevys-mexican-restaurant mexican 2.3 1730 travis-blvd fairfield
  solano-county bay-area)
 (6633 gorditos mexican 2.0 1025 oliver-rd fairfield solano-county
  bay-area)
 (6634 la-cabana mexican 2.0 2785 n-texas-st-no.-b fairfield
  solano-county bay-area)
 (6635 la-charrita-mexican-market mexican 2.0 1444 w-texas-st fairfield
  solano-county bay-area)
 (6636 los-gallos-taqueria mexican 2.0 936 w-texas-st fairfield
  solano-county bay-area)
 (6637 puerto-vallarta mexican 2.0 720 madison-st fairfield
  solano-county bay-area)
 (6638 quinto-patio-taqueria mexican 2.0 3505 norwalk-pl fairfield
  solano-county bay-area)
 (6639 chevys-mexican-restaurant mexican 3.2 979 edgewater-blvd.
  foster-city san-mateo-county bay-area)
 (6640 el-torito mexican 2.0 350 foster-city-blvd foster-city
  san-mateo-county bay-area)
 (6641 mama-lupe-taqueria mexican 2.0 0 unknown foster-city
  san-mateo-county bay-area)
 (6642 taco-loco mexican 2.0 0 unknown foster-city san-mateo-county
  bay-area)
 (6643 taqueria-chavez mexican 2.0 0 unknown freedom unknown unknown)
 (6644 burrito-bar mexican 2.0 39227 fremont-hub fremont alameda-county
  bay-area)
 (6645 chilos-mexicatessen mexican 2.0 4767 versailles-park-ct fremont
  alameda-county bay-area)
 (6646 cocina-mexico mexican 2.3 46663 mission-blvd fremont
  alameda-county bay-area)
 (6647 el-burrito-loco mexican 2.0 3649 thornton-ave fremont
  alameda-county bay-area)
 (6648 el-indio-mexican-restaurant mexican 2.0 34265 fremont-blvd
  fremont alameda-county bay-area)
 (6649 el-patio-restaurant mexican 2.8 4572 glenmoor-mall fremont
  alameda-county bay-area)
 (6650 el-torito-restaurants-inc mexican 2.3 39550 paseo-padre-pky
  fremont alameda-county bay-area)
 (6651 juanitas-chan-cafeteria mexican 2.0 46916 bodie-ter fremont
  alameda-county bay-area)
 (6652 la-casita mexican 2.9 41240 fremont-blvd fremont alameda-county
  bay-area)
 (6653 la-cumbre mexican 2.0 555 mowry-ave fremont alameda-county
  bay-area)
 (6654 mi-pueblo-restaurant mexican 2.0 41025 fremont-blvd-no.-a
  fremont alameda-county bay-area)
 (6655 mission-jarrito-mexican-rest mexican 2.7 1530 washington-blvd
  fremont alameda-county bay-area)
 (6656 rock-n-tacos mexican 2.0 3283 walnut-ave fremont alameda-county
  bay-area)
 (6657 rockn-tacos mexican 2.3 3283 walnut-ave fremont alameda-county
  bay-area)
 (6658 super-taco mexican 2.0 40798 fremont-blvd fremont alameda-county
  bay-area)
 (6659 taco-bravo mexican 2.0 43472 grimmer-blvd fremont alameda-county
  bay-area)
 (6660 taqueria-el-urge mexican 2.0 38003 mission-blvd-no.-b fremont
  alameda-county bay-area)
 (6661 taqueria-los-gallos mexican 3.2 39459 fremont-blvd fremont
  alameda-county bay-area)
 (6662 chevys-mexican-restaurant mexican 2.8 8440 murray-ave gilroy
  santa-clara-county bay-area)
 (6663 gaetas-taqueria mexican 2.7 353 e-10th-st-ste-i-2 gilroy
  santa-clara-county bay-area)
 (6664 mi-su-taqueria mexican 2.3 611 x1st-st gilroy santa-clara-county
  bay-area)
 (6665 super-taqueria-restaurants mexican 2.5 401 e-10th-st gilroy
  santa-clara-county bay-area)
 (6666 taqueria-rancho-viejo mexican 2.0 7574 monterey-st gilroy
  santa-clara-county bay-area)
 (6667 victorias-mexican-restaurant mexican 3.5 757 x1st-st gilroy
  santa-clara-county bay-area)
 (6668 happy-taco mexican 1.7 184 san-mateo-rd half-moon-bay
  san-mateo-county bay-area)
 (6669 santanas-ii-mexican-restaurant mexican 2.0 108 cabrillo-hwy-n
  half-moon-bay san-mateo-county bay-area)
 (6670 spanish-town-mexican-restaurant mexican 3.3 515 church-st
  half-moon-bay san-mateo-county bay-area)
 (6671 taqueria-eduardo mexican 3.0 360 grand-blvd half-moon-bay
  san-mateo-county bay-area)
 (6672 taqueria-la-mexicana mexican 2.0 250 cabrillo-hwy-s
  half-moon-bay san-mateo-county bay-area)
 (6673 three-amigos mexican 3.2 200 cabrillo-hwy-s half-moon-bay
  san-mateo-county bay-area)
 (6674 el-bucanero mexican 2.0 225 w-winton-ave hayward alameda-county
  bay-area)
 (6675 el-indio-family-restaurant mexican 2.0 22221 hathaway-ave
  hayward alameda-county bay-area)
 (6676 el-indio-family-restaurant mexican 2.0 155 jackson-st hayward
  alameda-county bay-area)
 (6677 el-rinconcito-mexicano mexican 2.0 114 a-st hayward
  alameda-county bay-area)
 (6678 el-taco mexican 2.4 27915 mission-blvd hayward alameda-county
  bay-area)
 (6679 el-taquito mexican 3.3 22354 mission-blvd hayward alameda-county
  bay-area)
 (6680 la-imperial mexican 3.6 948 c-st hayward alameda-county
  bay-area)
 (6681 la-pinata mexican 3.0 904 rose-st hayward alameda-county
  bay-area)
 (6682 la-tapatia-mexican-restaurant mexican 2.0 555 w-tennyson-rd
  hayward alameda-county bay-area)
 (6683 las-casuelas-grill-restaurant mexican 2.0 28257 mission-blvd
  hayward alameda-county bay-area)
 (6684 little-mexico mexican 2.0 465 w-a-st hayward alameda-county
  bay-area)
 (6685 los-compadres mexican 2.8 944 c-st hayward alameda-county
  bay-area)
 (6686 los-dos-gallos mexican 2.0 27702 orlando-ave hayward
  alameda-county bay-area)
 (6687 los-planes-de-renderos mexican 2.0 25140 mission-blvd hayward
  alameda-county bay-area)
 (6688 mexicali-rose-of-hayward mexican 2.0 29097 mission-blvd hayward
  alameda-county bay-area)
 (6689 miguels-restaurant mexican 2.3 22865 atherton-st hayward
  alameda-county bay-area)
 (6690 old-california-deli-&-taqueria mexican 2.0 24085 amador-st
  hayward alameda-county bay-area)
 (6691 pablitos-restaurant mexican 2.0 22800 mission-blvd hayward
  alameda-county bay-area)
 (6692 palm-villa mexican 2.0 25088 hesperian-blvd hayward
  alameda-county bay-area)
 (6693 pepes-restaurant mexican 2.0 2613 oliver-dr hayward
  alameda-county bay-area)
 (6694 senor-z-taqueria mexican 2.0 25125 santa-clara-st-no.-c hayward
  alameda-county bay-area)
 (6695 taco-express mexican 2.0 225 w-winton-ave-ste-219 hayward
  alameda-county bay-area)
 (6696 tacos-uruapan mexican 2.0 27907 thackeray-way hayward
  alameda-county bay-area)
 (6697 taqueria-arandas mexican 2.0 512 w-tennyson-rd hayward
  alameda-county bay-area)
 (6698 taqueria-eduardo-two mexican 2.0 1104 w-tennyson-rd hayward
  alameda-county bay-area)
 (6699 taqueria-esmeralda mexican 2.0 26712 gading-rd hayward
  alameda-county bay-area)
 (6700 taqueria-estrella mexican 2.0 22767 watkins-st hayward
  alameda-county bay-area)
 (6701 taqueria-senaidas mexican 2.3 150 w-tennyson-rd hayward
  alameda-county bay-area)
 (6702 mi-taqueria mexican 2.0 696 x4th-st hollister san-benito-county
  northern-california)
 (6703 progreso-tamale-parlor mexican 2.0 230 x3rd-st hollister
  san-benito-county northern-california)
 (6704 rancho-cafe-taqueria mexican 2.0 40 san-felipe-rd hollister
  san-benito-county northern-california)
 (6705 super-taqueria-restaurant mexican 2.3 460 tres-pinos-rd
  hollister san-benito-county northern-california)
 (6706 c-c-ole mexican 2.0 3196 lucas-cir lafayette contra-costa-county
  bay-area)
 (6707 el-charro-mexican-foods mexican 2.6 3339 mount-diablo-blvd
  lafayette contra-costa-county bay-area)
 (6708 anitas-taqueria mexican 3.3 2124 railroad livermore
  alameda-county bay-area)
 (6709 casa-orozco mexican 2.0 325 s-l-st livermore alameda-county
  bay-area)
 (6710 elsys-tagueria mexican 2.0 2130 x1st-st livermore alameda-county
  bay-area)
 (6711 la-estrella-market mexican 2.0 104 n-k-st livermore
  alameda-county bay-area)
 (6712 pollo-salsa mexican 2.0 211 n-p-st livermore alameda-county
  bay-area)
 (6713 casa-lupe mexican 1.7 185 main-st los-altos santa-clara-county
  bay-area)
 (6714 el-torito mexican 2.5 4470 el-camino-real los-altos
  santa-clara-county bay-area)
 (6715 red-pepper mexican 2.6 2310 homestead-rd los-altos
  santa-clara-county bay-area)
 (6716 andale-taqueria mexican 3.4 6 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (6717 roohs-cafe-salsa mexican 2.3 0 unknown los-gatos
  santa-clara-county bay-area)
 (6718 chicken-asado mexican 2.0 1311 pine-st martinez
  contra-costa-county bay-area)
 (6719 margaritas mexican 1.7 536 main-st martinez contra-costa-county
  bay-area)
 (6720 numero-uno-tacqueria mexican 2.0 1125 arnold-dr-no.-d martinez
  contra-costa-county bay-area)
 (6721 old-garcias-restaurant mexican 2.0 309 warmcastle-ct martinez
  contra-costa-county bay-area)
 (6722 aguililla-mexican-market-&-del mexican 2.0 3250 middlefield-rd
  menlo-park san-mateo-county bay-area)
 (6723 castillos-mexican-restaurant mexican 2.0 325 sharon-park-dr
  menlo-park san-mateo-county bay-area)
 (6724 el-rincon-tarasco mexican 2.0 3200 middlefield-rd menlo-park
  san-mateo-county bay-area)
 (6725 mextogo mexican 2.0 1081 el-camino-real menlo-park
  san-mateo-county bay-area)
 (6726 ridgeside-cafe mexican 3.0 3140 alpine-rd menlo-park
  san-mateo-county bay-area)
 (6727 taqueria-apatzingan mexican 2.0 3305 middlefield-rd menlo-park
  san-mateo-county bay-area)
 (6728 el-super-burrito-restaurant mexican 2.3 780 el-camino-real
  millbrae san-mateo-county bay-area)
 (6729 las-palomas-taqueria mexican 3.0 1625 el-camino-real millbrae
  san-mateo-county bay-area)
 (6730 mi-tequila-restaurant mexican 2.0 1595 el-camino-real millbrae
  san-mateo-county bay-area)
 (6731 barrio-fiesta-restaurant mexican 2.0 1790 milmont-dr milpitas
  santa-clara-county bay-area)
 (6732 burrito-express mexican 2.0 275 jacklin-rd milpitas
  santa-clara-county bay-area)
 (6733 casa-azteca-mexican-restaurant mexican 1.7 20 n-abel-st milpitas
  santa-clara-county bay-area)
 (6734 el-torito mexican 2.3 477 e-calaveras-blvd milpitas
  santa-clara-county bay-area)
 (6735 la-milpa-mexican-restaurant mexican 3.7 107 n-milpitas-blvd
  milpitas santa-clara-county bay-area)
 (6736 la-mission-taqueria mexican 2.0 1466 n-milpitas-blvd milpitas
  santa-clara-county bay-area)
 (6737 linas-place mexican 3.0 1362 s.-main milpitas santa-clara-county
  bay-area)
 (6738 los-reyes-taqueria-restaurant mexican 2.0 100 dempsey-rd
  milpitas santa-clara-county bay-area)
 (6739 rositas-mexican-restaurant mexican 2.0 52 s-abel-st milpitas
  santa-clara-county bay-area)
 (6740 royal-taco mexican 2.0 1469 landess-ave milpitas
  santa-clara-county bay-area)
 (6741 la-fonda mexican 1.7 556 center-st moraga unknown bay-area)
 (6742 el-rancho-grande-restaurant mexican 2.3 17555 condit-rd
  morgan-hill santa-clara-county bay-area)
 (6743 el-taco-rico mexican 2.0 411 vineyard-town-ctr morgan-hill
  santa-clara-county bay-area)
 (6744 jesus-mexican-restaurant mexican 2.0 95 e-3rd-st morgan-hill
  santa-clara-county bay-area)
 (6745 panchos-mexican-restaurant mexican 2.0 16490 monterey-rd
  morgan-hill santa-clara-county bay-area)
 (6746 sinaloa-restaurant mexican 3.4 19210 monterey-rd morgan-hill
  santa-clara-county bay-area)
 (6747 super-taqueria-restaurants mexican 3.4 15840 monterey-rd
  morgan-hill santa-clara-county bay-area)
 (6748 el-gran-amigo-taqueria mexican 2.3 0 unknown moss-beach
  san-mateo-county bay-area)
 (6749 bueno-bueno mexican 3.0 2500 w-el-camino-real-no.-b
  mountain-view santa-clara-county bay-area)
 (6750 bueno-bueno mexican 2.7 1477 plymouth-st mountain-view
  santa-clara-county bay-area)
 (6751 chapala-mexican-restaurant mexican 3.0 166 oak-st mountain-view
  santa-clara-county bay-area)
 (6752 el-paso-cafe mexican 4.1 1407 w-el-camino-real mountain-view
  santa-clara-county bay-area)
 (6753 estrellita mexican 2.6 971 san-antonio-rd mountain-view
  santa-clara-county bay-area)
 (6754 fiesta-del-mar mexican 2.7 1005 n.-shoreline-blvd. mountain-view
  santa-clara-county bay-area)
 (6755 garcias-taqueria mexican 2.0 1929 latham-st mountain-view
  santa-clara-county bay-area)
 (6756 la-costena mexican 4.2 2078 old-middlefield-rd mountain-view
  santa-clara-county bay-area)
 (6757 roohs-cafe mexican 2.7 650 castro-st. mountain-view
  santa-clara-county bay-area)
 (6758 taqueria-labamba mexican 3.8 2058 old-middlefield-way
  mountain-view santa-clara-county bay-area)
 (6759 una-mas mexican 1.7 825 e-el-camino-real mountain-view
  santa-clara-county bay-area)
 (6760 chavez-tacos mexican 2.0 1620 central-ave napa napa-county
  napa-valley)
 (6761 el-gudalajara-restaurant mexican 2.0 1520 silverado-trl napa
  napa-county napa-valley)
 (6762 las-manaitas mexican 2.0 1139 lincoln-ave napa napa-county
  napa-valley)
 (6763 red-hen-cantina mexican 2.7 5091 saint-helena-hwy napa
  napa-county napa-valley)
 (6764 rio-poco mexican 1.7 807 main-st napa napa-county napa-valley)
 (6765 tacos-la-playita mexican 2.0 3069 jefferson-st napa napa-county
  napa-valley)
 (6766 taqueria-3-hermanos mexican 2.0 1122 x1st-st-no.-a napa
  napa-county napa-valley)
 (6767 taqueria-michoacan mexican 2.0 2053 wilkins-ave-apt-45 napa
  napa-county napa-valley)
 (6768 taqueria-rosita mexican 2.0 1214 main-st napa napa-county
  napa-valley)
 (6769 bakery-taqueria-uno mexican 2.0 36601 newark-blvd-no.-17 newark
  alameda-county bay-area)
 (6770 casa-la-palma-restaurant mexican 2.8 7383 thornton-ave newark
  alameda-county bay-area)
 (6771 chevys-mexican-restaurant mexican 2.6 5605 mowry-school-rd
  newark alameda-county bay-area)
 (6772 el-burro-restaurants-inc mexican 2.0 3100 newpark-mall newark
  alameda-county bay-area)
 (6773 el-ranchito-restaurant mexican 2.0 5409 central-ave-ste-15
  newark alameda-county bay-area)
 (6774 la-cabana-restaurant mexican 2.0 7163 rich-ave newark
  alameda-county bay-area)
 (6775 salsa-picante mexican 2.0 2075 newpark-mall newark
  alameda-county bay-area)
 (6776 taqueria-los-gallos mexican 2.5 35232 newark-blvd newark
  alameda-county bay-area)
 (6777 taqueria-mexico mexican 2.0 36782 cedar-blvd newark
  alameda-county bay-area)
 (6778 baja-taqueria mexican 2.4 4070 piedmont-ave oakland
  alameda-county bay-area)
 (6779 burrito-shops mexican 2.0 3256 lakeshore-ave oakland
  alameda-county bay-area)
 (6780 burrito-shops-inc mexican 2.0 5359 college-ave oakland
  alameda-county bay-area)
 (6781 burrito-villa mexican 2.0 2505 market-st oakland alameda-county
  bay-area)
 (6782 cactus-taqueria mexican 3.5 5525 college-ave oakland
  alameda-county bay-area)
 (6783 casa-vallarta mexican 2.0 1910 park-blvd oakland alameda-county
  bay-area)
 (6784 cervantes-grocery-&-mexican mexican 2.0 320 x17th-st oakland
  alameda-county bay-area)
 (6785 cesares mexican 2.5 2820 mountain-blvd oakland alameda-county
  bay-area)
 (6786 cielito-lindo-taqueria mexican 2.0 3805 foothill-blvd oakland
  alameda-county bay-area)
 (6787 club-tejano mexican 2.0 925 high-st oakland alameda-county
  bay-area)
 (6788 echale-salsa mexican 2.0 4293 piedmont-ave oakland
  alameda-county bay-area)
 (6789 el-burrito-gordo mexican 1.7 326 x23rd-st oakland alameda-county
  bay-area)
 (6790 el-gato-negro mexican 2.0 2808 e-14th-st oakland alameda-county
  bay-area)
 (6791 el-mezon-restuarant mexican 2.0 3842 e-14th-st oakland
  alameda-county bay-area)
 (6792 el-nido-express mexican 2.0 1615 clay-st oakland alameda-county
  bay-area)
 (6793 el-pavo-real-restaurant mexican 2.0 3646 e-14th-st oakland
  alameda-county bay-area)
 (6794 el-taco-zamorano mexican 2.7 4032 foothill-blvd oakland
  alameda-county bay-area)
 (6795 el-taco-zamorano mexican 2.0 1244 high-st oakland alameda-county
  bay-area)
 (6796 el-tapatio mexican 2.0 3030 bona-st oakland alameda-county
  bay-area)
 (6797 el-torero-club mexican 2.0 2298 san-pablo-ave oakland
  alameda-county bay-area)
 (6798 el-torito-restaurants mexican 1.4 67 jack-london-sq oakland
  alameda-county bay-area)
 (6799 gauchos-burritos mexican 2.5 5478 college-ave oakland
  alameda-county bay-area)
 (6800 gauchos-burritos mexican 2.0 5295 college-ave-no.-a oakland
  alameda-county bay-area)
 (6801 jalisco-restaurant mexican 2.0 1721 e-14th-st oakland
  alameda-county bay-area)
 (6802 jorges-el-tapatio mexican 2.0 1416 fruitvale-ave oakland
  alameda-county bay-area)
 (6803 juanitas-restaurant mexican 2.0 1734 webster-st oakland
  alameda-county bay-area)
 (6804 la-borinquena mexican 2.0 582 x7th-st oakland alameda-county
  bay-area)
 (6805 la-fiesta-brava-restaurant mexican 2.0 1462 high-st oakland
  alameda-county bay-area)
 (6806 la-fonda mexican 2.0 1457 fruitvale-ave oakland alameda-county
  bay-area)
 (6807 la-frontera mexican 2.0 6245 baker-st oakland alameda-county
  bay-area)
 (6808 la-mancha mexican 2.0 4010 macarthur-blvd oakland alameda-county
  bay-area)
 (6809 la-mexicana mexican 2.0 3930 e-14th-st oakland alameda-county
  bay-area)
 (6810 la-morena-restaurant mexican 2.0 3801 e-12th-st oakland
  alameda-county bay-area)
 (6811 la-ultima mexican 2.8 3618 patterson-ave oakland alameda-county
  bay-area)
 (6812 la-ultima mexican 2.8 3220 wisconsin-st oakland alameda-county
  bay-area)
 (6813 las-palmas mexican 2.0 4390 telegraph-ave-no.-g oakland
  alameda-county bay-area)
 (6814 lisas-happy-burrito mexican 2.0 1616 webster-st oakland
  alameda-county bay-area)
 (6815 loeras-burrito-shop mexican 2.0 2635 san-pablo-ave oakland
  alameda-county bay-area)
 (6816 los-amigos mexican 2.0 1430 x47th-ave oakland alameda-county
  bay-area)
 (6817 los-cocos-restaurant mexican 2.0 1449 fruitvale-ave oakland
  alameda-county bay-area)
 (6818 los-dos-hermanos mexican 2.0 2331 e-14th-st oakland
  alameda-county bay-area)
 (6819 los-jalicienses mexican 2.0 3925 lyon-ave oakland alameda-county
  bay-area)
 (6820 los-paloma-restaurant mexican 2.0 2815 e-23rd-st oakland
  alameda-county bay-area)
 (6821 los-tres-amigos mexican 2.0 2001 e-14th-st oakland
  alameda-county bay-area)
 (6822 mexicali-rose-restaurant mexican 2.6 701 clay-st oakland
  alameda-county bay-area)
 (6823 mexicana-restaurant mexican 2.0 3930 e-14th-st oakland
  alameda-county bay-area)
 (6824 mi-casita-restaurant mexican 2.0 1001 fruitvale-ave oakland
  alameda-county bay-area)
 (6825 mi-casita-restaurant mexican 2.0 1967 telegraph-ave-no.-71
  oakland alameda-county bay-area)
 (6826 nito-burrito mexican 2.0 5927 e-14th-st oakland alameda-county
  bay-area)
 (6827 pico-paco mexican 2.0 4911 telegraph-ave oakland alameda-county
  bay-area)
 (6828 playa-azul mexican 2.0 2818 e-14th-st oakland alameda-county
  bay-area)
 (6829 tacos-la-pinata mexican 2.0 1231 x40th-ave oakland
  alameda-county bay-area)
 (6830 tacos-tio-tono mexican 2.0 4021 e-14th-st oakland alameda-county
  bay-area)
 (6831 taqueria mexican 2.0 3433 e-14th-st oakland alameda-county
  bay-area)
 (6832 taqueria-el-grullo mexican 2.0 2630 foothill-blvd oakland
  alameda-county bay-area)
 (6833 taqueria-las-comadres mexican 2.0 2105 macarthur-blvd oakland
  alameda-county bay-area)
 (6834 taqueria-lorenas mexican 2.0 7001 e-14th-st oakland
  alameda-county bay-area)
 (6835 taqueria-morelia mexican 3.0 4493 e-14th-st oakland
  alameda-county bay-area)
 (6836 taqueria-pelayo mexican 2.0 3661 foothill-blvd oakland
  alameda-county bay-area)
 (6837 the-burrito-shop mexican 2.0 412 x15th-st oakland alameda-county
  bay-area)
 (6838 the-happy-burrito mexican 2.5 1616 webster-st oakland
  alameda-county bay-area)
 (6839 tijuana-restaurant mexican 2.0 1308 e-14th-st oakland
  alameda-county bay-area)
 (6840 don-joses mexican 2.3 1 orinda-way orinda contra-costa-county
  bay-area)
 (6841 senor-neros-of-orinda mexican 2.0 15 moraga-way orinda
  contra-costa-county bay-area)
 (6842 casa-nava-restaurant mexican 3.0 50 eureka-sq pacifica
  san-mateo-county bay-area)
 (6843 el-grano-de-oro-restaurant mexican 2.3 1710 francisco-blvd
  pacifica san-mateo-county bay-area)
 (6844 los-amigos mexican 1.7 540 vista-mar-ave pacifica
  san-mateo-county bay-area)
 (6845 playa-de-acapulco mexican 2.3 145 rockaway-beach-ave pacifica
  san-mateo-county bay-area)
 (6846 randitos-burrito mexican 2.0 611 linda-mar-blvd pacifica
  san-mateo-county bay-area)
 (6847 andale-taqueria mexican 3.3 209 university-ave palo-alto
  santa-clara-county bay-area)
 (6848 compadres-mexican-bar-&-grill mexican 2.6 3877 el-camino-real
  palo-alto santa-clara-county bay-area)
 (6849 palo-alto-sol mexican 3.6 408 california-ave palo-alto
  santa-clara-county bay-area)
 (6850 pollos mexican 2.9 543 emerson-blvd. palo-alto
  santa-clara-county bay-area)
 (6851 red-pepper mexican 3.2 4125 el-camino-way palo-alto
  santa-clara-county bay-area)
 (6852 una-mas mexican 2.3 244 stanford-shopping-ctr palo-alto
  santa-clara-county bay-area)
 (6853 las-palmas-number-nine mexican 2.0 1150 oakland-ave piedmont
  alameda-county bay-area)
 (6854 alfonsos mexican 3.0 624 san-pablo-ave pinole
  contra-costa-county bay-area)
 (6855 ricos-mexican-food-take-out mexican 1.7 2860
  pinole-valley-rd-ste-c pinole contra-costa-county bay-area)
 (6856 the-red-onion mexican 2.0 2870 pinole-valley-rd pinole
  contra-costa-county bay-area)
 (6857 birrieria-&-taqueria-yahualica mexican 2.0 31 alves-ln pittsburg
  contra-costa-county bay-area)
 (6858 el-cazadore-restaurant mexican 2.0 1335 buchanan-rd pittsburg
  contra-costa-county bay-area)
 (6859 el-taco-loco mexican 2.0 950 west-st pittsburg
  contra-costa-county bay-area)
 (6860 frito-bandido mexican 2.0 2447 willow-pass-rd pittsburg
  contra-costa-county bay-area)
 (6861 los-medanos-comm-hosp mexican 2.0 2311 loveridge-rd pittsburg
  contra-costa-county bay-area)
 (6862 los-medanos-lanes-cafe mexican 2.0 1411 e-leland-rd pittsburg
  contra-costa-county bay-area)
 (6863 los-panchos mexican 2.0 4353 oakdale-pl pittsburg
  contra-costa-county bay-area)
 (6864 super-taco mexican 2.0 295 e-10th-st pittsburg
  contra-costa-county bay-area)
 (6865 super-taco mexican 2.0 295 w-10th-st pittsburg
  contra-costa-county bay-area)
 (6866 super-taco mexican 2.0 2175 railroad pittsburg
  contra-costa-county bay-area)
 (6867 carlos-murphys-inc mexican 2.0 999 contra-costa-blvd
  pleasant-hill contra-costa-county bay-area)
 (6868 chevys-mexican-restaurant mexican 3.0 650 ellinwood-way
  pleasant-hill contra-costa-county bay-area)
 (6869 el-tapatio-restaurant mexican 2.8 40 golf-club-rd pleasant-hill
  contra-costa-county bay-area)
 (6870 mexican-burritos mexican 2.0 2101 contra-costa-blvd
  pleasant-hill contra-costa-county bay-area)
 (6871 mi-casita mexican 2.0 508 contra-costa-blvd-ste-q pleasant-hill
  contra-costa-county bay-area)
 (6872 albertos-cantina mexican 2.2 435 main-st pleasanton
  alameda-county bay-area)
 (6873 chevys-mexican-restaurant mexican 3.1 5877 owens-dr pleasanton
  alameda-county bay-area)
 (6874 el-molino-tortilla-factory mexican 2.7 5321 hopyard-rd
  pleasanton alameda-county bay-area)
 (6875 hacienda-del-sol mexican 2.0 625 main-st pleasanton
  alameda-county bay-area)
 (6876 mexico-lindo-restaurants-inc mexican 2.7 6690 koll-center-pky
  pleasanton alameda-county bay-area)
 (6877 taco-grande mexican 2.0 5870 stoneridge-mall-rd-ste-200
  pleasanton alameda-county bay-area)
 (6878 the-burrito-stop mexican 2.0 929 main-st-no.-b pleasanton
  alameda-county bay-area)
 (6879 amelias-restaurant mexican 3.2 2042 broadway redwood-city
  san-mateo-county bay-area)
 (6880 chevys-mexican-restaurant mexican 2.0 2907 el-camino-real
  redwood-city san-mateo-county bay-area)
 (6881 el-molino-taqueria mexican 2.0 820 veterans-blvd redwood-city
  san-mateo-county bay-area)
 (6882 el-sombrero mexican 2.0 3726 florence-st redwood-city
  san-mateo-county bay-area)
 (6883 karlitas-taco-place mexican 2.5 512 woodside-rd redwood-city
  san-mateo-county bay-area)
 (6884 la-hacienda-taqueria mexican 2.0 895 x2nd-ave redwood-city
  san-mateo-county bay-area)
 (6885 la-salsa mexican 2.0 1475 broadway redwood-city san-mateo-county
  bay-area)
 (6886 la-siesta-mexican-food mexican 2.0 143 redwood-ave-no.-1
  redwood-city san-mateo-county bay-area)
 (6887 los-dos-amigos mexican 2.0 828 x5th-ave redwood-city
  san-mateo-county bay-area)
 (6888 los-ladrillos-mexican-cuisine mexican 2.0 2053 broadway
  redwood-city san-mateo-county bay-area)
 (6889 mariscos-taqueria-sirena-rosa mexican 2.0 2601 middlefield-rd
  redwood-city san-mateo-county bay-area)
 (6890 mexicali-grill mexican 2.0 3203 oak-knoll-dr redwood-city
  san-mateo-county bay-area)
 (6891 naranjos-taqueria mexican 2.0 500 douglas-ave redwood-city
  san-mateo-county bay-area)
 (6892 rosita mexican 2.7 1615 hudson-st-apt-1 redwood-city
  san-mateo-county bay-area)
 (6893 taco-el-camino mexican 2.0 0 camino redwood-city
  san-mateo-county bay-area)
 (6894 tacos-el-camino mexican 2.0 2627 el-camino-real redwood-city
  san-mateo-county bay-area)
 (6895 tacos-la-pachanga mexican 2.0 3102 middlefield-rd redwood-city
  san-mateo-county bay-area)
 (6896 taqueria-3-hermanos mexican 2.0 3432 bay-rd redwood-city
  san-mateo-county bay-area)
 (6897 taqueria-los-dos-hermanos mexican 2.0 957 x7th-ave redwood-city
  san-mateo-county bay-area)
 (6898 azteca mexican 2.0 550 dimm-st richmond contra-costa-county
  bay-area)
 (6899 chapalas-mexican-cafe mexican 2.0 201 tweksbury-ave richmond
  contra-costa-county bay-area)
 (6900 chapalas mexican 2.0 2626 mcbryde-ave richmond
  contra-costa-county bay-area)
 (6901 el-tapatio mexican 2.0 910 x23rd-st richmond contra-costa-county
  bay-area)
 (6902 el-tumi-restaurant mexican 2.0 6332 jerilynn-ave richmond
  contra-costa-county bay-area)
 (6903 gonzalez-mexican-restaurant mexican 2.3 12955 san-pablo-ave
  richmond contra-costa-county bay-area)
 (6904 hacienda-restaurant mexican 2.0 12020 san-pablo-ave richmond
  contra-costa-county bay-area)
 (6905 la-flor-de-jalisco mexican 2.0 2409 macdonald-ave richmond
  contra-costa-county bay-area)
 (6906 mexico-del-noche-restaurant mexican 2.0 250 x23rd-st richmond
  contra-costa-county bay-area)
 (6907 taqueria-labamba mexican 2.8 12345 san-pablo-ave richmond
  contra-costa-county bay-area)
 (6908 taqueria-reyes mexican 2.0 909 x8th-st richmond
  contra-costa-county bay-area)
 (6909 burrito-palace mexican 2.0 133 main-st rio-vista solano-county
  bay-area)
 (6910 marias-mexican-food-restaurant mexican 2.0 646 state-highway-12
  rio-vista solano-county bay-area)
 (6911 x3-amigos mexican 2.0 206 grand-ave south-san-francisco
  san-mateo-county bay-area)
 (6912 angelas-taqueria mexican 2.0 1158 mission-rd south-san-francisco
  san-mateo-county bay-area)
 (6913 barrio-fiesta-restaurnt-of-man mexican 2.0 909 antoinette-ln
  south-san-francisco san-mateo-county bay-area)
 (6914 chevys-mexican-restaurant mexican 2.0 141 hickey-blvd
  south-san-francisco san-mateo-county bay-area)
 (6915 el-faro-mexican-foods mexican 2.6 435 el-camino-real
  south-san-francisco san-mateo-county bay-area)
 (6916 los-metates-taqueria mexican 2.0 231 lux-ave south-san-francisco
  san-mateo-county bay-area)
 (6917 marias-mexican-restaurant mexican 2.0 205 grand-ave
  south-san-francisco san-mateo-county bay-area)
 (6918 mexico-tipico mexican 2.0 223 grand-ave south-san-francisco
  san-mateo-county bay-area)
 (6919 taqueria-la-morena mexican 3.0 319 baden-ave south-san-francisco
  san-mateo-county bay-area)
 (6920 anas-cantina mexican 2.0 1205 main-st saint-helena napa-county
  napa-valley)
 (6921 garcias-mexican-restaurant mexican 2.0 1202 el-camino-real
  san-bruno san-mateo-county bay-area)
 (6922 la-fiesta-restaurant mexican 2.0 201 el-camino-real san-bruno
  san-mateo-county bay-area)
 (6923 la-taqueria mexican 2.0 404 san-bruno-ave-w san-bruno
  san-mateo-county bay-area)
 (6924 chayitos-burrito-palace mexican 3.0 1037 laurel-st san-carlos
  san-mateo-county bay-area)
 (6925 taqueria-mi-ranchito mexican 2.5 660 laurel-st san-carlos
  san-mateo-county bay-area)
 (6926 bad-man-joses mexican 2.6 4077 x18th san-francisco
  san-francisco-county bay-area)
 (6927 cadillac-bar mexican 2.2 325 minna san-francisco
  san-francisco-county bay-area)
 (6928 caliente mexican 2.0 1100 van-ness-ave san-francisco
  san-francisco-county bay-area)
 (6929 casa-aguila mexican 3.7 1240 noriega san-francisco
  san-francisco-county bay-area)
 (6930 cazadores-mexican-food mexican 2.0 2455 noriega san-francisco
  san-francisco-county bay-area)
 (6931 celias-mexican-restaurant mexican 2.3 4019 judah san-francisco
  san-francisco-county bay-area)
 (6932 chavas-mexican-restaurant mexican 3.3 3248 x18th san-francisco
  san-francisco-county bay-area)
 (6933 chevys-mexican-restaurant mexican 2.5 150 x4th san-francisco
  san-francisco-county bay-area)
 (6934 chevys-mexican-restaurant mexican 2.3 2 embarcadero-center
  san-francisco san-francisco-county bay-area)
 (6935 compadres-mexican-bar-&-grill mexican 2.0 900 north-point
  san-francisco san-francisco-county bay-area)
 (6936 corona-bar-&-grill mexican 2.0 88 cyril-magnin san-francisco
  san-francisco-county bay-area)
 (6937 cucous-restaurant mexican 2.0 488 haight san-francisco
  san-francisco-county bay-area)
 (6938 don-ramons mexican 2.7 225 x11th san-francisco
  san-francisco-county bay-area)
 (6939 el-taco-loco-2 mexican 2.0 3274 x24th san-francisco
  san-francisco-county bay-area)
 (6940 el-toreador-fonda-mejicana-west-portal mexican 2.3 50
  west-portal-avenue san-francisco san-francisco-county bay-area)
 (6941 el-toreador-sams-mexican-restaurant mexican 2.7 1541 taraval
  san-francisco san-francisco-county bay-area)
 (6942 el-toro-taqueria mexican 3.0 598 valencia san-francisco
  san-francisco-county bay-area)
 (6943 la-barca mexican 2.7 2036 lombard san-francisco
  san-francisco-county bay-area)
 (6944 la-canasta mexican 2.7 3006 buchanan san-francisco
  san-francisco-county bay-area)
 (6945 la-canasta mexican 2.7 2219 filbert san-francisco
  san-francisco-county bay-area)
 (6946 la-placita-mexicatessen mexican 2.0 2531 san-bruno-avenue
  san-francisco san-francisco-county bay-area)
 (6947 la-posada mexican 2.8 2298 fillmore san-francisco
  san-francisco-county bay-area)
 (6948 la-rondalla-restaurant-food-to-go mexican 2.0 901 valencia
  san-francisco san-francisco-county bay-area)
 (6949 la-taqueria mexican 3.8 2889 mission san-francisco
  san-francisco-county bay-area)
 (6950 la-taqueria-menudo mexican 2.3 4591 mission san-francisco
  san-francisco-county bay-area)
 (6951 las-margaritas-restaurant-and-cantina mexican 2.0 2801
  leavenworth san-francisco san-francisco-county bay-area)
 (6952 leticias mexican 2.5 2247 market san-francisco
  san-francisco-county bay-area)
 (6953 line-up mexican 2.0 398 x7th san-francisco san-francisco-county
  bay-area)
 (6954 los-jarritos mexican 2.0 901 south-van-ness-avenue san-francisco
  san-francisco-county bay-area)
 (6955 mercedes-restaurant mexican 3.3 653 commercial san-francisco
  san-francisco-county bay-area)
 (6956 mom-is-cooking mexican 2.4 1166 geneva-avenue san-francisco
  san-francisco-county bay-area)
 (6957 muchachos-on-18th-street mexican 2.0 4238 x18th san-francisco
  san-francisco-county bay-area)
 (6958 pablitos-authentic-mexican-cuisine mexican 2.0 3409 x24th
  san-francisco san-francisco-county bay-area)
 (6959 pancho-villa-taqueria mexican 3.8 3071 x16th san-francisco
  san-francisco-county bay-area)
 (6960 puerto-alegre-restaurant mexican 2.0 546 valencia san-francisco
  san-francisco-county bay-area)
 (6961 ricos-fine-mexican-restaurant mexican 2.5 943 columbus-avenue
  san-francisco san-francisco-county bay-area)
 (6962 roosevelt-tamale-parlor mexican 2.0 2817 x24th san-francisco
  san-francisco-county bay-area)
 (6963 stonestown-galleria mexican 2.6 3251 x20th-avenue san-francisco
  san-francisco-county bay-area)
 (6964 t-&-bs-iii mexican 2.0 1 market-plaza san-francisco
  san-francisco-county bay-area)
 (6965 taco-express mexican 2.0 969 sutter san-francisco
  san-francisco-county bay-area)
 (6966 taco-loco mexican 2.5 3306 mission san-francisco
  san-francisco-county bay-area)
 (6967 taqueria-la-paz mexican 2.0 305 turk san-francisco
  san-francisco-county bay-area)
 (6968 taqueria-san-jose mexican 3.5 2830 mission san-francisco
  san-francisco-county bay-area)
 (6969 taqueria-tepa mexican 2.0 2198 folsom san-francisco
  san-francisco-county bay-area)
 (6970 tia-margarita-mexican-restaurant mexican 3.3 19 avenue-&-clement
  san-francisco san-francisco-county bay-area)
 (6971 wa-ha-ka-oaxaca-mexican-grill mexican 2.6 2141 polk
  san-francisco san-francisco-county bay-area)
 (6972 antunas-mexican-food mexican 2.0 470 s-10th-st san-jose
  santa-clara-county bay-area)
 (6973 azteca-restaurant mexican 2.0 2270 monterey-hwy san-jose
  santa-clara-county bay-area)
 (6974 bakery-&-taqueria-nayarit mexican 2.0 22 n-jackson-ave san-jose
  santa-clara-county bay-area)
 (6975 burrito-factory mexican 3.2 4750 almaden-expy san-jose
  santa-clara-county bay-area)
 (6976 casa-castillo-mexican-restaurant mexican 2.8 200 s-1st-st
  san-jose santa-clara-county bay-area)
 (6977 chevys-mexican-restaurant mexican 2.6 5305 almaden-expy san-jose
  santa-clara-county bay-area)
 (6978 chevys-mexican-restaurant mexican 2.8 550 s-winchester-blvd
  san-jose santa-clara-county bay-area)
 (6979 don-panchos-taqueria mexican 2.0 1056 leigh-ave san-jose
  santa-clara-county bay-area)
 (6980 eduardos-fine-mexican-food mexican 2.0 721 willow-st san-jose
  santa-clara-county bay-area)
 (6981 eduardos-mexican-food mexican 2.0 721 willow-st san-jose
  santa-clara-county bay-area)
 (6982 el-amigo-burrito mexican 2.3 1142 saratoga-ave san-jose
  santa-clara-county bay-area)
 (6983 el-amigo-restaurant mexican 2.0 806 sylvandale-ave san-jose
  santa-clara-county bay-area)
 (6984 el-cerrito-bar mexican 2.0 1948 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (6985 el-mariachi mexican 2.0 1101 fleming-ave san-jose
  santa-clara-county bay-area)
 (6986 el-mexicano mexican 2.0 375 saratoga-ave-no.-e san-jose
  santa-clara-county bay-area)
 (6987 el-mexicano-taqueria mexican 2.0 2651 senter-rd san-jose
  santa-clara-county bay-area)
 (6988 el-mexicano-taqueria mexican 2.3 1102 bird-ave san-jose
  santa-clara-county bay-area)
 (6989 el-mexico-lindo mexican 2.0 3919 cherry-ave san-jose
  santa-clara-county bay-area)
 (6990 el-palenque-taqueria mexican 2.0 503 w-san-carlos-st san-jose
  santa-clara-county bay-area)
 (6991 el-palenzque-taqueria mexican 2.0 235 e-julian-st san-jose
  santa-clara-county bay-area)
 (6992 el-paseo mexican 2.0 1709 tully-rd san-jose santa-clara-county
  bay-area)
 (6993 el-pique-taqueria mexican 2.0 233 s-white-rd-no.-j san-jose
  santa-clara-county bay-area)
 (6994 el-sombrero-restaurant mexican 2.0 555 mill-pond-dr san-jose
  santa-clara-county bay-area)
 (6995 el-taco-rico mexican 2.0 1730 story-rd san-jose
  santa-clara-county bay-area)
 (6996 el-taco-rico mexican 2.0 1495 the-alameda san-jose
  santa-clara-county bay-area)
 (6997 el-taco-rico mexican 2.0 1336 saratoga-ave san-jose
  santa-clara-county bay-area)
 (6998 el-taco-rico-&-las-palms-mexcn mexican 2.0 1495 the-alameda
  san-jose santa-clara-county bay-area)
 (6999 el-tarasco-mexican-food mexican 2.7 1905 baker-pl san-jose
  santa-clara-county bay-area)
 (7000 estebans-taqueria mexican 2.0 42 laumer-ave san-jose
  santa-clara-county bay-area)
 (7001 fiesta-hut mexican 2.0 1100 n-1st-st-no.-e san-jose
  santa-clara-county bay-area)
 (7002 gabbys-taqueria mexican 2.0 3975 senter-rd-no.-108 san-jose
  santa-clara-county bay-area)
 (7003 la-chiquita-restaurant mexican 2.0 1805 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (7004 la-taqueria mexican 2.0 15 s-1st-st san-jose santa-clara-county
  bay-area)
 (7005 lanita-taqueria mexican 2.0 2100 story-rd-no.-c san-jose
  santa-clara-county bay-area)
 (7006 lydias-gourmet-tamales mexican 2.0 5587 snell-ave san-jose
  santa-clara-county bay-area)
 (7007 margaritas-mexican-dining mexican 2.0 384 n-capitol-ave san-jose
  santa-clara-county bay-area)
 (7008 mexico-city-restaurant mexican 2.0 1616 almaden-rd san-jose
  santa-clara-county bay-area)
 (7009 mexico-lindo-restaurant mexican 2.3 1415 foxworthy-ave san-jose
  santa-clara-county bay-area)
 (7010 mexico-lindo-restaurants mexican 2.0 1610 e-capitol-expy
  san-jose santa-clara-county bay-area)
 (7011 mexicolindo mexican 2.0 1415 foxworthy-ave san-jose
  santa-clara-county bay-area)
 (7012 mi-ranchito-taqueria mexican 2.0 1954 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (7013 nacos-tacos mexican 2.0 1925 alum-rock-ave-no.-c san-jose
  santa-clara-county bay-area)
 (7014 ortegas-produce-and-taqueria mexican 2.0 1460 park-ave san-jose
  santa-clara-county bay-area)
 (7015 paulitas-cocina-mexican-food mexican 2.0 855 n-13th-st san-jose
  santa-clara-county bay-area)
 (7016 rock-n-tacos mexican 2.8 131 w-santa-clara-st san-jose
  santa-clara-county bay-area)
 (7017 rock-n-tacos mexican 3.0 2980 stevens-ln-blv-1002 san-jose
  santa-clara-county bay-area)
 (7018 royal-taco mexican 2.0 311 n-capitol-ave-no.-b san-jose
  santa-clara-county bay-area)
 (7019 ruthies-taqueria mexican 2.0 1148 e-william-st san-jose
  santa-clara-county bay-area)
 (7020 salsa-taqueria mexican 2.0 463 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (7021 salsa-taqueria mexican 2.0 2928 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (7022 san-jose-tio-nacho-restaurant mexican 2.0 85 s-2nd-st san-jose
  santa-clara-county bay-area)
 (7023 senor-taco mexican 2.0 798 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (7024 super-taqueria-restaurants mexican 3.7 476 s-10th-st san-jose
  santa-clara-county bay-area)
 (7025 super-taqueria-restaurants mexican 2.8 1095 s-white-rd san-jose
  santa-clara-county bay-area)
 (7026 taco-villa mexican 2.0 1462 s-winchester-blvd san-jose
  santa-clara-county bay-area)
 (7027 tacos-al-pastor mexican 2.7 400 s-bascom-ave san-jose
  santa-clara-county bay-area)
 (7028 tacos-al-pastor-of-almaden mexican 2.0 6469 almaden-expy
  san-jose santa-clara-county bay-area)
 (7029 tacos-monte-alban mexican 2.0 454 keyes-st san-jose
  santa-clara-county bay-area)
 (7030 taqueria-california mexican 2.0 461 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (7031 taqueria-california mexican 2.0 2055 camden-ave san-jose
  santa-clara-county bay-area)
 (7032 taqueria-el-caminito mexican 2.0 782 n-13th-st san-jose
  santa-clara-county bay-area)
 (7033 taqueria-el-grullense mexican 2.0 2148 story-rd-no.-b san-jose
  santa-clara-county bay-area)
 (7034 taqueria-el-mexicano mexican 2.0 1896 curtner-ave-no.-b san-jose
  santa-clara-county bay-area)
 (7035 taqueria-el-mexicano-iii mexican 2.0 1729 mckee-rd san-jose
  santa-clara-county bay-area)
 (7036 taqueria-garcia mexican 2.0 3161 senter-rd-no.-c san-jose
  santa-clara-county bay-area)
 (7037 taqueria-la-huasteca mexican 2.0 330 s-3rd-st san-jose
  santa-clara-county bay-area)
 (7038 taqueria-las-flores mexican 2.0 844 s-winchester-blvd san-jose
  santa-clara-county bay-area)
 (7039 taqueria-lorenas mexican 2.0 399 s-24th-st san-jose
  santa-clara-county bay-area)
 (7040 taqueria-luna-tapatia mexican 2.0 1130 lucretia-ave san-jose
  santa-clara-county bay-area)
 (7041 taqueria-t-las-flores mexican 2.0 2616 union-ave san-jose
  santa-clara-county bay-area)
 (7042 tico-tacos mexican 2.6 291 n-4th-st san-jose santa-clara-county
  bay-area)
 (7043 tio-felipes-taqueria mexican 2.0 2530 berryessa-rd-ste-417
  san-jose santa-clara-county bay-area)
 (7044 tjs-mexican-restaurant mexican 2.0 71 e-san-fernando-st san-jose
  santa-clara-county bay-area)
 (7045 tlaquepaque-taqueria mexican 2.0 163 w-alma-ave san-jose
  santa-clara-county bay-area)
 (7046 tlaquepaque-taqueria mexican 2.0 108 race-st san-jose
  santa-clara-county bay-area)
 (7047 toros-taqueria mexican 2.0 3327 san-felipe-rd san-jose
  santa-clara-county bay-area)
 (7048 una-mas mexican 2.0 2559 n-1st-st san-jose santa-clara-county
  bay-area)
 (7049 la-casa-rosa mexican 2.7 0 unknown san-juan-bautista
  san-benito-county northern-california)
 (7050 azteca-de-oro-restaurant mexican 2.0 16496 e-14th-st san-leandro
  alameda-county bay-area)
 (7051 burrito-shops-inc mexican 2.3 140 greenhouse-mktpl san-leandro
  alameda-county bay-area)
 (7052 chavas-taqueria mexican 2.0 14393 washington-ave-ste-d
  san-leandro alameda-county bay-area)
 (7053 chevys-mexican-restaurant mexican 3.2 312 bay-fair-mall
  san-leandro alameda-county bay-area)
 (7054 dos-amigos mexican 2.0 129 w-joaquin-ave san-leandro
  alameda-county bay-area)
 (7055 el-farolito mexican 2.0 13515 e-14th-st san-leandro
  alameda-county bay-area)
 (7056 el-sueno mexican 2.0 1568 wayne-ave san-leandro alameda-county
  bay-area)
 (7057 el-taco-king-de-san-leandro mexican 2.0 300 w-estudillo-ave
  san-leandro alameda-county bay-area)
 (7058 king-burrito mexican 2.0 1240 kentwood-ln-apt-915 san-leandro
  alameda-county bay-area)
 (7059 la-pequena-taqueria mexican 2.0 2014 marina-blvd san-leandro
  alameda-county bay-area)
 (7060 marina-mexican-restaurant mexican 2.3 2144 marina-blvd
  san-leandro alameda-county bay-area)
 (7061 plaza-z-cantina-inc mexican 2.0 15294 liberty-st san-leandro
  alameda-county bay-area)
 (7062 titos mexican 3.0 15508 e-14th-st san-leandro alameda-county
  bay-area)
 (7063 papa-panchos-taqueria mexican 3.5 15939 hesperian-blvd
  san-lorenzo alameda-county bay-area)
 (7064 ay-caramba mexican 2.4 1622 palm-ave san-mateo san-mateo-county
  bay-area)
 (7065 miguels-mexican-kitchen mexican 2.0 44 hillsdale-mall san-mateo
  san-mateo-county bay-area)
 (7066 taqueria-de-amigos mexican 2.3 2974 s-norfolk-st san-mateo
  san-mateo-county bay-area)
 (7067 taqueria-la-cumbre mexican 3.4 28 n-b-st san-mateo
  san-mateo-county bay-area)
 (7068 the-burrito-palace mexican 1.4 1326 w-hillsdale-blvd san-mateo
  san-mateo-county bay-area)
 (7069 three-amigos mexican 3.3 243 s-b-st san-mateo san-mateo-county
  bay-area)
 (7070 cabo-taqueria mexican 2.0 13501 san-pablo-ave san-pablo
  contra-costa-county bay-area)
 (7071 el-bohemio mexican 2.0 1600 rumrill-blvd san-pablo
  contra-costa-county bay-area)
 (7072 la-hacienda-bar-restaurant-inc mexican 2.0 1847 rumrill-blvd
  san-pablo contra-costa-county bay-area)
 (7073 la-plaza-del-tapatio mexican 2.0 2100 broadway san-pablo
  contra-costa-county bay-area)
 (7074 restaurant-guadalajara mexican 2.0 1762 rumrill-blvd san-pablo
  contra-costa-county bay-area)
 (7075 tacos-autlan mexican 2.0 1957 x21st-st san-pablo
  contra-costa-county bay-area)
 (7076 taqueria-mendoza mexican 2.0 2031 x23rd-st san-pablo
  contra-costa-county bay-area)
 (7077 caramba-burritos-etc mexican 2.0 12165 alcosta-blvd san-ramon
  contra-costa-county bay-area)
 (7078 el-nuevo-chaparral mexican 2.0 2450 san-ramon-valley-blvd
  san-ramon contra-costa-county bay-area)
 (7079 the-hot-shop-gourmet mexican 3.0 3141 crow-canyon-pl san-ramon
  contra-costa-county bay-area)
 (7080 acapulco-inn mexican 2.0 2776 el-camino-real santa-clara
  santa-clara-county bay-area)
 (7081 burrito-grande-&-grande-bakery mexican 1.7 4747 lafayette-st
  santa-clara santa-clara-county bay-area)
 (7082 el-quixote mexican 2.0 3551 homestead-rd santa-clara
  santa-clara-county bay-area)
 (7083 el-torito mexican 2.1 2950 lakeside-dr santa-clara
  santa-clara-county bay-area)
 (7084 la-paloma mexican 3.0 2280 el-camino-real santa-clara
  santa-clara-county bay-area)
 (7085 miguels-mexican-food mexican 2.0 1823 shamrock-ave santa-clara
  santa-clara-county bay-area)
 (7086 pedros-restaurant-&-cantina mexican 2.5 3935 freedom-cir
  santa-clara santa-clara-county bay-area)
 (7087 taqueria-cazadores mexican 2.0 3763 lafayette-st santa-clara
  santa-clara-county bay-area)
 (7088 taqueria-el-mero-mero mexican 2.3 2325 el-camino-real
  santa-clara santa-clara-county bay-area)
 (7089 two-pesos-taqueria mexican 2.0 787 franklin-st santa-clara
  santa-clara-county bay-area)
 (7090 adelitas-taqueria mexican 2.0 302 potrero-st santa-cruz
  santa-cruz-county bay-area)
 (7091 burrito-&-oriental-express mexican 2.0 920 pacific-ave-ste-4
  santa-cruz santa-cruz-county bay-area)
 (7092 casa-rositas mexican 2.7 2608 portola-dr santa-cruz
  santa-cruz-county bay-area)
 (7093 el-paisano-tamales mexican 2.3 609 beach-st santa-cruz
  santa-cruz-county bay-area)
 (7094 joses-cantina-&-parrilla mexican 2.3 123 washington-st
  santa-cruz santa-cruz-county bay-area)
 (7095 mi-taqueria-alejandra mexican 2.0 1220 mission-st santa-cruz
  santa-cruz-county bay-area)
 (7096 super-burrito mexican 2.0 301 la-fonda-ave-no.-5 santa-cruz
  santa-cruz-county bay-area)
 (7097 tacos-moreno mexican 3.3 1053 water-st santa-cruz
  santa-cruz-county bay-area)
 (7098 taqueria-pacifico mexican 2.0 200 mclaughlin-dr-ucsc-merrill
  santa-cruz santa-cruz-county bay-area)
 (7099 taqueria-santa-cruz mexican 2.3 2215 mission-st santa-cruz
  santa-cruz-county bay-area)
 (7100 taqueria-vallarta mexican 3.6 608 soquel-ave santa-cruz
  santa-cruz-county bay-area)
 (7101 ticos-tacos mexican 2.0 1210 ocean-st santa-cruz
  santa-cruz-county bay-area)
 (7102 chicken-salsa mexican 3.4 12019 saratoga-sunnyvale-rd saratoga
  santa-clara-county bay-area)
 (7103 avatars mexican 3.7 0 unknown sausalito unknown bay-area)
 (7104 tucson-taqueria mexican 3.3 218 mount-hermon-rd-no.-g
  scotts-valley unknown bay-area)
 (7105 adelitas-taqueria mexican 2.0 4637 soquel-dr soquel unknown
  bay-area)
 (7106 mexico-city mexican 2.0 5050 soquel-dr soquel unknown bay-area)
 (7107 tortilla-flats mexican 2.3 4616 soquel-dr soquel unknown
  bay-area)
 (7108 burrito-palace mexican 2.0 307 marina-ctr suisun-city
  solano-county bay-area)
 (7109 el-tapatio mexican 2.0 2982 rockville-rd suisun-city
  solano-county bay-area)
 (7110 la-cabana mexican 2.0 415 main-st suisun-city solano-county
  bay-area)
 (7111 taqueria-azteca mexican 2.0 288 sunset-ave-ste-g suisun-city
  solano-county bay-area)
 (7112 amigos-restaurant mexican 2.0 1274 persian-dr sunnyvale
  santa-clara-county bay-area)
 (7113 chevys-mexican-restaurant mexican 2.9 204 s.-mathilda sunnyvale
  santa-clara-county bay-area)
 (7114 el-faro mexican 3.2 168 so.-murphy-ave sunnyvale
  santa-clara-county bay-area)
 (7115 los-jarritos-taqueria mexican 2.0 1053 e-el-camino-real
  sunnyvale santa-clara-county bay-area)
 (7116 savor-mexican-food mexican 2.0 305 n-fairoaks-ave sunnyvale
  santa-clara-county bay-area)
 (7117 taqueria-hot-&-mild mexican 2.0 848 e-evelyn-ave sunnyvale
  santa-clara-county bay-area)
 (7118 taqueria-vallarta mexican 2.0 436 bryan-ave sunnyvale
  santa-clara-county bay-area)
 (7119 tio-felipes-taqueria mexican 3.4 620 e-evelyn-ave sunnyvale
  santa-clara-county bay-area)
 (7120 carnitas-michoacan mexican 2.0 33452 x6th-st union-city
  alameda-county bay-area)
 (7121 el-burrito-supremo mexican 2.3 34587 alvarado-niles-rd
  union-city alameda-county bay-area)
 (7122 mexico-lindo-restaurant mexican 2.7 33306 alvarado-niles-rd
  union-city alameda-county bay-area)
 (7123 taqueria-lety mexican 2.0 605 e-st union-city alameda-county
  bay-area)
 (7124 taqueria-los-portales mexican 2.0 3980 horner-st union-city
  alameda-county bay-area)
 (7125 burrito-palace mexican 2.0 1300 georgia-st vallejo solano-county
  bay-area)
 (7126 chevys-mexican-restaurant mexican 2.3 157 plaza-dr vallejo
  solano-county bay-area)
 (7127 gonzalez-mexican-restaurant mexican 2.0 2164 springs-rd vallejo
  solano-county bay-area)
 (7128 kenitos-burrito-factory mexican 2.0 333 tennessee-st vallejo
  solano-county bay-area)
 (7129 la-bufa mexican 2.0 1622 sonoma-blvd vallejo solano-county
  bay-area)
 (7130 mercys-taqueria mexican 2.0 1414 sacramento-st vallejo
  solano-county bay-area)
 (7131 mexico-lindo mexican 2.0 541 benicia-rd vallejo solano-county
  bay-area)
 (7132 tacos-jalisco mexican 2.0 112 whitecliff-dr vallejo
  solano-county bay-area)
 (7133 tacos-jalisco mexican 2.0 3440 sonoma-blvd vallejo solano-county
  bay-area)
 (7134 tacos-jalisco mexican 2.0 3570 sonoma-blvd vallejo solano-county
  bay-area)
 (7135 la-ultima mexican 2.2 1516 bonanza-st walnut-creek
  contra-costa-county bay-area)
 (7136 pepitos-mexican-foods mexican 2.0 704 bancroft-rd-no.-b
  walnut-creek contra-costa-county bay-area)
 (7137 taos-grill mexican 2.0 1345 treat-blvd walnut-creek
  contra-costa-county bay-area)
 (7138 taqueria-de-marin-&-de-walnut mexican 2.0 1359 locust-st
  walnut-creek contra-costa-county bay-area)
 (7139 the-cantina mexican 3.0 1470 n-brd walnut-creek
  contra-costa-county bay-area)
 (7140 el-pilon-tacos-restaurant mexican 3.0 101 main-st watsonville
  santa-cruz-county bay-area)
 (7141 jalapenos-taqueria mexican 2.0 15 e-high-st watsonville
  santa-cruz-county bay-area)
 (7142 la-taqueria-salsa-bar mexican 2.0 1410 freedom-blvd watsonville
  santa-cruz-county bay-area)
 (7143 margaritas-taqueria mexican 2.0 73 arthur-rd watsonville
  santa-cruz-county bay-area)
 (7144 mi-taqueria mexican 2.0 2233 e-lake-ave-ste-c watsonville
  santa-cruz-county bay-area)
 (7145 taqueria-mi-tierra mexican 2.0 1471 freedom-blvd watsonville
  santa-cruz-county bay-area)
 (7146 zunigas-mexican-food mexican 3.3 100 aviation-way watsonville
  santa-cruz-county bay-area)
 (7147 flamingos-mexician-food mexican 2.0 205 port-chicago-hwy
  west-pittsburg contra-costa-county bay-area)
 (7148 la-cumbre-taqueria mexican 2.5 28 n.-b-st san-mateo
  san-mateo-county bay-area)
 (7149 azteca-tacqueria mexican 3.0 235 church-st san-francisco
  san-francisco-county bay-area)
 (7150 planet-fresh-gourmet-burrito mexican 2.5 5548 springdale-avenue
  pleasanton alameda-county bay-area)
 (7151 pollos mexican 3.3 10525 s.-de-anza-blvd. cupertino
  santa-clara-county bay-area)
 (7152 pollos mexican 2.3 4501 hopyard-rd. pleasanton alameda-county
  bay-area)
 (7153 estrellita mexican 2.8 971 n.-san-antonio-rd. los-altos
  santa-clara-county bay-area)
 (7154 rositas mexican 2.8 5220 n-1st. alviso santa-clara-county
  bay-area)
 (7155 la-fiesta mexican 3.3 240 villa-st mountain-view
  santa-clara-county bay-area)
 (7156 cafe-marimba mexican 3.3 2317 chestnut-st san-francisco
  san-francisco-county bay-area)
 (7157 rafas-mexican-food-&-catering mexican 2.0 8230 old-redwood-hwy
  cotati sonoma-county bay-area)
 (7158 los-altos-mexican-food mexican 2.0 7800 batavia-rd dixon
  solano-county bay-area)
 (7159 la-posada-mexican-restaurna mexican 2.0 1470 holiday-ln
  fairfield solano-county bay-area)
 (7160 forestville-inn-mexican-restaurant mexican 2.0 6625 front-st
  forestville sonoma-county bay-area)
 (7161 lucindas-mexican-food-to-go mexican 2.0 930 redwood-hwy
  mill-valley marin-county bay-area)
 (7162 old-mexico-of-petaluma mexican 2.0 1484 petaluma-blvd-n petaluma
  sonoma-county bay-area)
 (7163 playa-azul-marisco-mexican-restaurant mexican 2.7 228
  petaluma-boulevard petaluma sonoma-county bay-area)
 (7164 pueblo-del-sol-mexican-restaurant mexican 2.0 235
  s-mcdowell-blvd petaluma sonoma-county bay-area)
 (7165 sonoma-taco-shop mexican 2.0 953 lakeville petaluma
  sonoma-county bay-area)
 (7166 marias-mexican-food-restaurant mexican 2.0 646 hwy-12 rio-vista
  solano-county bay-area)
 (7167 sonoma-taco-shop mexican 2.0 913 golf-course-dr rohnert-park
  sonoma-county bay-area)
 (7168 taco-fiesta mexican 3.5 6650 commerce-blvd rohnert-park
  sonoma-county bay-area)
 (7169 taqueria-el-rancho mexican 2.0 1451 southwest-blvd rohnert-park
  sonoma-county bay-area)
 (7170 taqueria-leon mexican 2.0 6466 redwood-dr rohnert-park
  sonoma-county bay-area)
 (7171 taqueria-sol-azeteca mexican 2.0 1435 e-cotati-ave rohnert-park
  sonoma-county bay-area)
 (7172 celias-mexican-restaurant mexican 2.3 1 vivian-st san-rafael
  marin-county bay-area)
 (7173 panchitos-mexican-food mexican 2.3 667 del-ganado-rd san-rafael
  marin-county bay-area)
 (7174 playa-azul-marisco-mexican-restaurant mexican 2.0 180
  bellam-blvd san-rafael marin-county bay-area)
 (7175 acapulco-mexican-restaurant mexican 2.0 505 mendocino-ave
  santa-rosa sonoma-county bay-area)
 (7176 chevys-mexican-restaurant mexican 2.0 0 unknown santa-rosa
  sonoma-county bay-area)
 (7177 el-azteca-mexican-food mexican 2.0 3260 airway-dr santa-rosa
  sonoma-county bay-area)
 (7178 el-patio-mexican-restaurant mexican 2.0 425 stony-point-rd
  santa-rosa sonoma-county bay-area)
 (7179 fonsecas-mexican-cuisine mexican 2.0 117 x4th-st santa-rosa
  sonoma-county bay-area)
 (7180 jalisco-mexican-food mexican 2.0 1800 mendocino-ave santa-rosa
  sonoma-county bay-area)
 (7181 oaxaca-restaurant-&-taqueria mexican 2.0 810 piner-rd santa-rosa
  sonoma-county bay-area)
 (7182 old-mexico-eastside mexican 2.0 4501 montgomery-dr santa-rosa
  sonoma-county bay-area)
 (7183 pepes-mexican-restaurant mexican 2.7 2000 sebastopol-rd
  santa-rosa sonoma-county bay-area)
 (7184 pepes-taqueria mexican 2.0 2000 sebastopol-rd santa-rosa
  sonoma-county bay-area)
 (7185 sonoma-taco-shop mexican 2.7 57 montgomery-dr santa-rosa
  sonoma-county bay-area)
 (7186 taco-fiesta mexican 2.0 1110 petaluma-hill-rd santa-rosa
  sonoma-county bay-area)
 (7187 taco-supremo-restaurante mexican 2.0 711 stony-point-rd
  santa-rosa sonoma-county bay-area)
 (7188 taqueria-el-farolito mexican 2.0 565 sebastopol-rd santa-rosa
  sonoma-county bay-area)
 (7189 taqueria-fonseca mexican 2.0 2765 yulupa-ave santa-rosa
  sonoma-county bay-area)
 (7190 taqueria-garivald mexican 2.0 400 w-3d santa-rosa sonoma-county
  bay-area)
 (7191 taqueria-san-juan mexican 2.0 600 larkfield-ctr santa-rosa
  sonoma-county bay-area)
 (7192 taqueria-santa-r mexican 2.3 1950 mendocino-ave santa-rosa
  sonoma-county bay-area)
 (7193 ochoas-mexican-restaurant mexican 2.0 775 gravenstein-ave
  sebastopol sonoma-county bay-area)
 (7194 viva-mexico mexican 2.0 841 gravenstein-hwy-s sebastopol
  sonoma-county bay-area)
 (7195 sonoma-taco-shop mexican 2.3 19235 sonoma-hwy sonoma
  sonoma-county bay-area)
 (7196 burrito-palace-the mexican 2.0 307 marina-ctr suisun-city
  solano-county bay-area)
 (7197 bonanza-mexican-food mexican 2.0 105 couch-st vallejo
  solano-county bay-area)
 (7198 amigos-mexican-food mexican 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (7199 arturos-mexican-food mexican 2.0 1815 market-st san-francisco
  san-francisco-county bay-area)
 (7200 bonita-mexican-food mexican 2.0 24 ellis-st san-francisco
  san-francisco-county bay-area)
 (7201 chavos-mexican-restaurant mexican 2.0 595 bryant-st
  san-francisco san-francisco-county bay-area)
 (7202 chevys-mexican-restaurant mexican 2.0 141 hickey-bl
  south-san-francisco san-mateo-county bay-area)
 (7203 chevys-mexican-restaurant mexican 2.3 3251 ave san-francisco
  san-francisco-county bay-area)
 (7204 el-mexicano-restaurant mexican 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (7205 grand-taco mexican 2.0 116 grand-ave south-san-francisco
  san-mateo-county bay-area)
 (7206 margarita-restaurant-&-taqueri mexican 2.0 2833 x24th-st
  san-francisco san-francisco-county bay-area)
 (7207 marthas-mexican-food mexican 2.0 701 randolph-st san-francisco
  san-francisco-county bay-area)
 (7208 pepitos-mexican-restaurant mexican 3.2 99 x1st-st san-francisco
  san-francisco-county bay-area)
 (7209 tommys-mexican-restaurant mexican 3.4 5929 geary-blvd
  san-francisco san-francisco-county bay-area)
 (7210 chicos mexican 3.0 1022 maude-ave sunnyvale santa-clara-county
  bay-area)
 (7211 tres-hermanos mexican 3.0 327 moffett-blvd mountain-view
  santa-clara-county bay-area)
 (7212 fiesta-del-mar mexican 3.4 0 unknown mountain-view
  santa-clara-county bay-area)
 (7213 rosas-rosticeria mexican 2.7 1726 freedom-blvd freedom unknown
  unknown)
 (7214 el-gordito-tortilleria-y-taqueria mexican 3.0 2570 old-first-st
  livermore alameda-county bay-area)
 (7215 calaca mexican 2.7 16 and-clay oakland alameda-county bay-area)
 (7216 gallardos mexican 2.0 314 arguello redwood-city san-mateo-county
  bay-area)
 (7217 morenita mexican 2.0 0 &-emerson palo-alto santa-clara-county
  bay-area)
 (7218 rock-n-tacos mexican 1.8 498 university palo-alto
  santa-clara-county bay-area)
 (7219 pollos mexican 2.4 0 cruz-ave menlo-park san-mateo-county
  bay-area)
 (7220 adobe-restaurant mexican 3.0 20128 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (7221 mexico-lingo mexican 2.0 325 s-market-st san-jose
  santa-clara-county bay-area)
 (7222 iguanas-taqueria mexican 2.7 1100 n.-1st san-jose
  santa-clara-county bay-area)
 (7223 taqueria mexican 2.3 2101 shattuck berkeley alameda-county
  bay-area)
 (7224 high-tech-burrito mexican 2.3 2352 shattuck berkeley
  alameda-county bay-area)
 (7225 coffee-club-too mexican 2.0 23 shattuck berkeley alameda-county
  bay-area)
 (7226 baja-cactus-restaurant mexican 4.0 338 s.-main milpitas
  santa-clara-county bay-area)
 (7227 la-pinata-no.-2 mexican 2.7 2699 merced-st san-leandro
  alameda-county bay-area)
 (7228 viva-mexico-tropi-cal mexican 2.7 7235 healdsvurg-avenue
  sebastopol sonoma-county bay-area)
 (7229 el-palomar mexican 3.0 0 ave santa-cruz santa-cruz-county
  bay-area)
 (7230 lisas-mexican-restaurant mexican 2.7 6582 mission-st daly-city
  san-mateo-county bay-area)
 (7231 fiesta-del-mar-too mexican 2.8 735 villa-st mountain-view
  santa-clara-county bay-area)
 (7232 tia-theresa mexican 2.0 120 west-h-st benicia solano-county
  bay-area)
 (7233 sandovals-mexican-food-and-catering mexican 2.0 640 st benicia
  solano-county bay-area)
 (7234 los-gallos mexican 3.0 0 manor-shopping-center-bay-rd menlo-park
  san-mateo-county bay-area)
 (7235 amanecer-restaurant mexican 3.0 1147 san-carlos-ave san-carlos
  san-mateo-county bay-area)
 (7236 vineyards-inn mexican 2.3 8445 sonoma-hwy. kenwood sonoma-county
  bay-area)
 (7237 celias mexican 2.7 504 peninsula-ave san-mateo san-mateo-county
  bay-area)
 (7238 cactus-taqueria mexican 3.0 1881 solano-avenue berkeley
  alameda-county bay-area)
 (7239 la-villa mexican 2.3 0 island-rd bethel-island unknown unknown)
 (7240 taqueria-el-balazo mexican 3.1 400 marketplace san-ramon
  contra-costa-county bay-area)
 (7241 el-mexicolindo mexican 2.8 1450 gold-st alviso
  santa-clara-county bay-area)
 (7242 mexxis mexican 2.0 0 blvd. san-ramon contra-costa-county
  bay-area)
 (7243 gourmet-mexican-food mexican 2.0 5549 geary-blvd san-francisco
  san-francisco-county bay-area)
 (7244 gordo-taqueria mexican 2.0 2250 clement san-francisco
  san-francisco-county bay-area)
 (7245 el-meson-del-marichi mexican 2.7 0 spruce-ave
  south-san-francisco san-mateo-county bay-area)
 (7246 senor-grill mexican 3.3 0 shopping-center-east-c.v.-blvd.
  castro-valley alameda-county bay-area)
 (7247 el-lorito-mexican-restaurant-and-taqueria mexican 3.0 1316
  railroad livermore alameda-county bay-area)
 (7248 los-panchos mexican 2.5 5850 pacheco-blvd. pacheco unknown
  unknown)
 (7249 luna-loca mexican 3.0 nil nil fremont alameda-county bay-area)
 (7250 taqueria-guadalajara mexican 3.0 125 healdsburg-ave healdsburg
  sonoma-county bay-area)
 (7251 the-whole-enchilada mexican 2.7 0 1 moss-landing monterey-county
  monterey)
 (7252 moss-landing-inn mexican 2.3 0 1 moss-landing monterey-county
  monterey)
 (7253 lighthouse-cafe mexican 2.3 0 1 moss-landing monterey-county
  monterey)
 (7254 una-mas mexican 2.0 0 unknown walnut-creek contra-costa-county
  bay-area)
 (7255 peppers-mexicali-cafe mexican 3.2 170 forest-avenue
  pacific-grove monterey-county monterey)
 (7256 cafe-carlos mexican 2.0 6016 scotts-valley-drive scotts-valley
  unknown bay-area)
 (7257 aqui-cal-mex-grill mexican 4.0 1145 lincoln-ave san-jose
  santa-clara-county bay-area)
 (7258 luna-loca mexican 1.8 500 sycamore-valley-rd danville
  contra-costa-county bay-area)
 (7259 guaymas mexican 4.1 5 main-st tiburon marin-county bay-area)
 (7260 una-mas mexican 2.3 0 unknown fremont alameda-county bay-area)
 (7261 el-toro-loco mexican 3.0 1624 francisco-blvd. pacifica
  san-mateo-county bay-area)
 (7262 el-burrito-loco-taqueria mexican 2.8 20859 rd. castro-valley
  alameda-county bay-area)
 (7263 pollo-reys mexican 2.4 725 saratoga-sunnyvale-rd sunnyvale
  santa-clara-county bay-area)
 (7264 joes-taco-lounge mexican 3.0 0 ave mill-valley marin-county
  bay-area)
 (7265 muchos! mexican 2.3 72 e.-santa-clara-st. san-jose
  santa-clara-county bay-area)
 (7266 cazadores mexican 3.3 1500 el-camino-real belmont
  san-mateo-county bay-area)
 (7267 las-parrillas mexican 3.0 7600 commerce-blvd. cotati
  sonoma-county bay-area)
 (7268 taco-the-town mexican 3.0 35 visitacion-avenue brisbane
  san-mateo-county bay-area)
 (7269 el-molino-taco-grill mexican 2.3 19656 stevens-creek-blvd
  cupertino santa-clara-county bay-area)
 (7270 chilos-mexicatessen mexican 2.3 2226 first-st livermore
  alameda-county bay-area)
 (7271 pollos mexican 2.9 nil nil mountain-view santa-clara-county
  bay-area)
 (7272 porto-mex mexican 3.0 721 x23rd-st richmond contra-costa-county
  bay-area)
 (7273 orale mexican 2.0 113 sacramento san-francisco
  san-francisco-county bay-area)
 (7274 the-forked-tongue mexican 2.3 493 broadway san-francisco
  san-francisco-county bay-area)
 (7275 chico-s-tacos mexican 2.8 1022 west-maude sunnyvale
  santa-clara-county bay-area)
 (7276 el-grullense mexican 3.0 0 unknown redwood-city san-mateo-county
  bay-area)
 (7277 las-palomas-tacqueria mexican 3.3 nil nil san-mateo
  san-mateo-county bay-area)
 (7278 la-cumbre-taqueria mexican 2.3 515 valencia-st. san-francisco
  san-francisco-county bay-area)
 (7279 cancun-family-mexican-restraunt mexican 2.7 961
  gravenstein-highway-south sebastopol sonoma-county bay-area)
 (7280 rojoz-gourmet-wraps mexican 2.3 60 town-and-country-village
  palo-alto santa-clara-county bay-area)
 (7281 la-azteca mexican 3.0 1531 main-st. redwood-city
  san-mateo-county bay-area)
 (7282 cinco-de-mayo mexican 3.0 4713 x1st-st pleasanton alameda-county
  bay-area)
 (7283 the-cantina mexican 2.7 0 of-e.-blithedale-and-camino-alto
  mill-valley marin-county bay-area)
 (7284 fernandos mexican 2.7 494 mowry-avenue fremont alameda-county
  bay-area)
 (7285 los-compadres mexican 2.7 0 st-next-to-la-imperial hayward
  alameda-county bay-area)
 (7286 carnitas-michoacan mexican 2.3 1706 decoto-rd union-city
  alameda-county bay-area)
 (7287 papagayo mexican 2.7 114 crystal-springs-center san-mateo
  san-mateo-county bay-area)
 (7288 planet-fresh-gourmet-burritos mexican 3.4 1003 cedar-st
  santa-cruz santa-cruz-county bay-area)
 (7289 lupes-taqueria mexican 2.7 2250 pacheco-boulevard martinez
  contra-costa-county bay-area)
 (7290 mondo-burrito mexican 2.3 3300 the-alameda santa-clara
  santa-clara-county bay-area)
 (7291 la-vista-restaurant-&-cabaret mexican 2.0 1330 lincoln-ave
  calistoga napa-county napa-valley)
 (7292 rancho-las-trancas mexican 2.0 792 el-camino-real
  south-san-francisco san-mateo-county bay-area)
 (7293 angels mexican 2.7 499 north-state-st ukiah mendocino-county
  northern-california)
 (7294 senora-emmas mexican 2.7 177 w.-santa-clara-st san-jose
  santa-clara-county bay-area)
 (7295 chevys-mexican-restaurant mexican 2.3 0 garrity-way richmond
  contra-costa-county bay-area)
 (7296 mi-cocina-&-cantina mexican 2.7 467 jackson-st hayward
  alameda-county bay-area)
 (7297 little-tampicos mexican 3.0 0 unknown soquel unknown bay-area)
 (7298 puerto-vallarte-mexican-restaurant mexican 2.0 1473 lincoln-ave
  calistoga napa-county napa-valley)
 (7299 calistoga-drive-inn mexican 2.0 1207 foothill-blvd. calistoga
  napa-county napa-valley)
 (7300 pollo-rey mexican 3.6 0 s.-bascom-avenue campbell
  santa-clara-county bay-area)
 (7301 brisas-de-acapulco mexican 3.6 3137 mission-st san-francisco
  san-francisco-county bay-area)
 (7302 glorias-taqueria mexican 3.6 469 saratoga-ave san-jose
  santa-clara-county bay-area)
 (7303 new-mecca-cafe mexican 3.6 0 avenue pittsburg-california nil
  nil)
 (7304 kabob-house-&-deli middle-eastern 2.3 1300 galindo-st-ste-c
  concord contra-costa-county bay-area)
 (7305 falafel-drive-in middle-eastern 3.6 2301 stevens-creek-blvd
  san-jose santa-clara-county bay-area)
 (7306 opera-plaza-delicatessen middle-eastern 2.7 601 van-ness-avenue
  san-francisco san-francisco-county bay-area)
 (7307 gyros-and-falafel-house middle-eastern 2.3 1584
  del-monte-boulevard seaside monterey-county monterey)
 (7308 ephesus middle-eastern 3.3 2639 broadway redwood-city
  san-mateo-county bay-area)
 (7309 kan-zaman middle-eastern 3.4 1793 haight-st san-francisco
  san-francisco-county bay-area)
 (7310 hayats-pastry-and-donut middle-eastern 2.7 2521 newhall-st.
  santa-clara santa-clara-county bay-area)
 (7311 genghis-khan-kitehen mongolian 2.3 1540 park-st alameda
  alameda-county bay-area)
 (7312 shangri-la mongolian 2.7 3336 grand-avenue oakland
  alameda-county bay-area)
 (7313 citrus-north-african-grill moroccan 2.0 2373 chestnut
  san-francisco san-francisco-county bay-area)
 (7314 el-mansour-restaurants moroccan 2.5 3123 clement san-francisco
  san-francisco-county bay-area)
 (7315 marrakech-moroccan-restaurant moroccan 1.5 419 ofarrell
  san-francisco san-francisco-county bay-area)
 (7316 menara-moroccan-restaurant moroccan 2.3 41 east-gish-rd san-jose
  santa-clara-county bay-area)
 (7317 kasbah moroccan 2.0 200 merrydale-rd san-rafael marin-county
  bay-area)
 (7318 kathmandu-west-cuisine-of-nepal nepalese 3.9 20916 homestead-rd
  cupertino santa-clara-county bay-area)
 (7319 annapurna nepalese 3.4 560 el-camino-real san-carlos
  san-mateo-county bay-area)
 (7320 las-tinajas-restaurant nicaraguan 3.0 2338 mission san-francisco
  san-francisco-county bay-area)
 (7321 nicaragua-restaurant nicaraguan 2.0 3015 mission san-francisco
  san-francisco-county bay-area)
 (7322 alexanders-ristorante northern-italian 2.3 65 moraga-way orinda
  contra-costa-county bay-area)
 (7323 caprice nouveau 3.6 2000 paradise-drive tiburon marin-county
  bay-area)
 (7324 metropolitan nouveau 2.7 0 st san-francisco san-francisco-county
  bay-area)
 (7325 moonraker nouvelle 3.8 105 rockaway-beach-ave pacifica
  san-mateo-county bay-area)
 (7326 stars-palo-alto nouvelle 2.6 nil nil palo-alto
  santa-clara-county bay-area)
 (7327 late-for-the-train organic 2.5 0 &-willow menlo-park
  san-mateo-county bay-area)
 (7328 chez-panisse organic 4.4 0 unknown berkeley alameda-county
  bay-area)
 (7329 shalimar-restaurant pakistani 3.4 0 unknown san-francisco
  san-francisco-county bay-area)
 (7330 zao pan-pacific-noodles 2.3 261 university-ave palo-alto
  santa-clara-county bay-area)
 (7331 viva-la-pasta pasta 3.4 300 el-camino-real belmont
  san-mateo-county bay-area)
 (7332 food-inc. pasta 2.5 2800 california-steet san-francisco
  san-francisco-county bay-area)
 (7333 piatti-ristorante pasta 3.0 100 sycamore-valley-rd danville
  contra-costa-county bay-area)
 (7334 bighorn-grill pasta 3.0 2410 san-ramon-valley-blvd. san-ramon
  contra-costa-county bay-area)
 (7335 bar-restaurant-the-quarterdeck pasta 2.7 718 x14th-st.
  san-francisco san-francisco-county bay-area)
 (7336 bar-restaurant-the-quarterdeck pasta 2.7 718 x14th-st.
  san-francisco san-francisco-county bay-area)
 (7337 basil-leaf pasta 3.2 5 hartz-ave danville contra-costa-county
  bay-area)
 (7338 pastas-cafe pasta 2.3 2500 san-ramon-valley-blvd san-ramon
  contra-costa-county bay-area)
 (7339 maykadeh-restaurant persian 2.0 0 unknown san-carlos
  san-mateo-county bay-area)
 (7340 kasra-persian-cuisine persian 2.0 24 ellis san-francisco
  san-francisco-county bay-area)
 (7341 maykadeh persian 3.6 470 green-st. san-francisco
  san-francisco-county bay-area)
 (7342 rose-international-market persian 2.7 1060 castro-st
  mountain-view santa-clara-county bay-area)
 (7343 zeebahs-kabob-house persian 3.6 147 east-3rd-st san-mateo
  san-mateo-county bay-area)
 (7344 alejandros-reestaurant peruvian 2.4 nil nil san-francisco
  san-francisco-county bay-area)
 (7345 contintental-restaurant peruvian 2.0 3115 x22d san-francisco
  san-francisco-county bay-area)
 (7346 tonitas-peruvian-restaurant peruvian 2.0 3141 la-selva-st-no.-4
  san-mateo san-mateo-county bay-area)
 (7347 estampas-peruanas peruvian 2.8 715 el-camino-real redwood-city
  san-mateo-county bay-area)
 (7348 inca peruvian 2.0 87 east-san-fernando san-jose
  santa-clara-county bay-area)
 (7349 la-vals pizza 3.0 891 island-dr alameda alameda-county bay-area)
 (7350 macs-pizza-deli pizza 2.0 1930 main-st alameda alameda-county
  bay-area)
 (7351 new-york-pizza pizza 2.6 1419 park-st alameda alameda-county
  bay-area)
 (7352 pizza-hut pizza 2.0 2711 encinal-ave-no.-b alameda
  alameda-county bay-area)
 (7353 prime-choice-pizza pizza 2.0 2300 encinal-ave alameda
  alameda-county bay-area)
 (7354 round-table-pizza pizza 2.0 2611 blanding-ave alameda
  alameda-county bay-area)
 (7355 round-table-pizza pizza 1.7 901 marina-village-pky alameda
  alameda-county bay-area)
 (7356 village-pizza pizza 2.3 1538 webster-st alameda alameda-county
  bay-area)
 (7357 zorbas-pizza pizza 2.0 1332 park-st alameda alameda-county
  bay-area)
 (7358 pasta-&-pizza-house pizza 2.0 1471 danville-blvd alamo
  contra-costa-county bay-area)
 (7359 round-table-pizza-of-alamo pizza 2.0 150 alamo-plz-no.-a alamo
  contra-costa-county bay-area)
 (7360 ginas-pizza pizza 2.7 600 san-pablo-ave albany alameda-county
  bay-area)
 (7361 goodfellas-pizza pizza 2.0 1051 san-pablo-ave albany
  alameda-county bay-area)
 (7362 la-vals-albany-pizza pizza 2.3 751 san-pablo-ave albany
  alameda-county bay-area)
 (7363 round-table-pizza pizza 2.0 962 san-pablo-ave albany
  alameda-county bay-area)
 (7364 la-prima-pizza pizza 2.0 15 angwin-ave angwin napa-county
  napa-valley)
 (7365 as-pizza pizza 2.0 3610 delta-fair-blvd antioch
  contra-costa-county bay-area)
 (7366 aladinos-pizzeria pizza 2.7 1324 sunset-dr antioch
  contra-costa-county bay-area)
 (7367 dominos-pizza pizza 2.0 2333 buchanan-rd antioch
  contra-costa-county bay-area)
 (7368 dominos-pizza pizza 2.0 1127 e-18th-st antioch
  contra-costa-county bay-area)
 (7369 little-ceasars pizza 2.0 417 e-18th-st antioch
  contra-costa-county bay-area)
 (7370 little-ceasars pizza 2.0 3100 contra-loma-blvd antioch
  contra-costa-county bay-area)
 (7371 new-york-pizza pizza 2.0 1828 a-st antioch contra-costa-county
  bay-area)
 (7372 papa-ds-pizza-&-pasta pizza 2.0 2920 delta-fair-blvd antioch
  contra-costa-county bay-area)
 (7373 pizza-hut pizza 2.8 2713 contra-loma-blvd antioch
  contra-costa-county bay-area)
 (7374 prime-time-pizza pizza 2.0 2376 buchanan-rd antioch
  contra-costa-county bay-area)
 (7375 ricos-pizza pizza 2.0 3612 lone-tree-way antioch
  contra-costa-county bay-area)
 (7376 skipolinis-pizza pizza 3.8 901 fitzuren-rd antioch
  contra-costa-county bay-area)
 (7377 straw-hat-pizza pizza 2.3 3001 delta-fair-blvd antioch
  contra-costa-county bay-area)
 (7378 stuft-pizza pizza 2.0 4393 hillcrest-ave antioch
  contra-costa-county bay-area)
 (7379 aptos-pizza pizza 2.0 7945 soquel-dr aptos santa-cruz-county
  bay-area)
 (7380 dominos-pizza pizza 2.0 122 victoria-ln aptos santa-cruz-county
  bay-area)
 (7381 dominos-pizza pizza 2.0 122 victoria-ln aptos santa-cruz-county
  bay-area)
 (7382 dominos-pizza pizza 2.0 122 victoria-ln aptos santa-cruz-county
  bay-area)
 (7383 michaels-pizza pizza 2.0 0 unknown aptos santa-cruz-county
  bay-area)
 (7384 pizza-amoreorporated pizza 2.0 783 rio-del-mar-blvd-no.-45 aptos
  santa-cruz-county bay-area)
 (7385 pleasure-pizza pizza 2.0 0 unknown aptos santa-cruz-county
  bay-area)
 (7386 stuft-pizza pizza 2.0 7568 soquel-dr aptos santa-cruz-county
  bay-area)
 (7387 belmont-pizza pizza 2.0 390 el-camino-real-ste-n belmont
  san-mateo-county bay-area)
 (7388 dominos-pizza pizza 2.0 1501 el-camino-real-no.-c belmont
  san-mateo-county bay-area)
 (7389 sammys-pizza pizza 2.0 130 harbor-blvd belmont san-mateo-county
  bay-area)
 (7390 v-js-pizza pizza 2.0 1220 country-club-dr ben-lomond
  santa-cruz-county bay-area)
 (7391 little-ceasars pizza 2.0 191 military-e benicia solano-county
  bay-area)
 (7392 pacifica-pizza pizza 2.5 915 x1st-st benicia solano-county
  bay-area)
 (7393 pizza-hut pizza 2.0 191 military-e-ste-f benicia solano-county
  bay-area)
 (7394 pizza-pirate pizza 2.5 72 solano-sq benicia solano-county
  bay-area)
 (7395 rocket-pizza pizza 2.0 4740 east-second-st-c-21 benicia
  solano-county bay-area)
 (7396 arinell-pizza pizza 3.3 2109 shattuck-ave berkeley
  alameda-county bay-area)
 (7397 blondies-pizza pizza 2.8 2333 telegraph-ave berkeley
  alameda-county bay-area)
 (7398 blondies-pizza pizza 2.8 2340 telegraph-ave berkeley
  alameda-county bay-area)
 (7399 cybelles-gilman pizza 1.7 1050 gilman-st berkeley alameda-county
  bay-area)
 (7400 dominos-pizza pizza 1.7 2127 university-ave berkeley
  alameda-county bay-area)
 (7401 fat-slice pizza 3.0 0 ave-at-durant berkeley alameda-county
  bay-area)
 (7402 l-c-pizza-fast-food-restaurant pizza 2.0 2033 san-pablo-ave
  berkeley alameda-county bay-area)
 (7403 la-vals-gardens pizza 1.8 2516 durant-ave-no.-b berkeley
  alameda-county bay-area)
 (7404 la-vals-gardens pizza 2.4 1834 euclid-ave berkeley
  alameda-county bay-area)
 (7405 leaning-tower-of-pizza pizza 2.0 1160 university-ave berkeley
  alameda-county bay-area)
 (7406 napoli-pizza pizza 2.0 2995 shattuck-ave berkeley alameda-county
  bay-area)
 (7407 sals-pizzaria pizza 2.0 2045 shattuck-ave berkeley
  alameda-county bay-area)
 (7408 zacharys-chicago-pizza pizza 4.3 1853 solano-ave berkeley
  alameda-county bay-area)
 (7409 bc-pizza pizza 2.0 7856 brentwood-blvd brentwood
  contra-costa-county bay-area)
 (7410 liberty-pizza-pasta-&-grill pizza 1.7 8065 brentwood-blvd-ste-1
  brentwood contra-costa-county bay-area)
 (7411 round-table-pizza pizza 2.0 41 sand-creek-rd brentwood
  contra-costa-county bay-area)
 (7412 brick-oven-pizza pizza 2.7 160 visitacion-ave brisbane
  san-mateo-county bay-area)
 (7413 filling-station-pizza pizza 2.0 22 san-bruno-ave brisbane
  san-mateo-county bay-area)
 (7414 dominos-pizza pizza 2.0 224 california-dr burlingame
  san-mateo-county bay-area)
 (7415 pizza-etc pizza 2.7 1232 broadway burlingame san-mateo-county
  bay-area)
 (7416 renaldos-deli-&-pizza pizza 2.0 1851 el-camino-real burlingame
  san-mateo-county bay-area)
 (7417 round-table-pizza pizza 2.0 1664 skyline-blvd burlingame
  san-mateo-county bay-area)
 (7418 round-table-pizza pizza 2.0 0 unknown burlingame
  san-mateo-county bay-area)
 (7419 village-host-pizza pizza 2.0 0 unknown burlingame
  san-mateo-county bay-area)
 (7420 village-host-pizza pizza 2.0 0 unknown burlingame
  san-mateo-county bay-area)
 (7421 la-prima-pizza pizza 2.0 1009 foothill-blvd calistoga
  napa-county napa-valley)
 (7422 city-pizza pizza 2.0 888 w-hamilton-ave campbell
  santa-clara-county bay-area)
 (7423 jacky-boys-pizza pizza 2.0 3393 winchester-blvd campbell
  santa-clara-county bay-area)
 (7424 luigis-pizzeria pizza 2.3 2495 winchester-blvd campbell
  santa-clara-county bay-area)
 (7425 mountain-mikes-pizza pizza 2.0 301 e-hamilton-ave campbell
  santa-clara-county bay-area)
 (7426 nonnos-pizza-&-pasta pizza 2.7 1604 w-campbell-ave campbell
  santa-clara-county bay-area)
 (7427 pagliaccios-pizzaria pizza 2.0 2099 s-bascom-ave-no.-a campbell
  santa-clara-county bay-area)
 (7428 palermo-pizza pizza 3.6 865 s-san-tomas-aquino-rd campbell
  santa-clara-county bay-area)
 (7429 pizza pizza 2.0 819 w-hamilton-ave campbell santa-clara-county
  bay-area)
 (7430 pizza-chicago pizza 3.4 836 w-hamilton-ave campbell
  santa-clara-county bay-area)
 (7431 pizza-hut pizza 2.0 136 n-san-tomas-aquino-rd campbell
  santa-clara-county bay-area)
 (7432 pizza-my-dear pizza 2.0 2360 s-bascom-ave-no.-c campbell
  santa-clara-county bay-area)
 (7433 pizza-pronto pizza 2.0 900 e-campbell-ave campbell
  santa-clara-county bay-area)
 (7434 pizza-sportbar pizza 2.0 915 s-san-tomas-aquino-rd campbell
  santa-clara-county bay-area)
 (7435 round-table-pizza pizza 2.0 711 w-hamilton-ave campbell
  santa-clara-county bay-area)
 (7436 roundtable-pizza pizza 2.0 1410 w-campbell-ave campbell
  santa-clara-county bay-area)
 (7437 stuft-pizza pizza 2.0 2000 s-bascom-ave campbell
  santa-clara-county bay-area)
 (7438 tony-&-albas-pizza pizza 2.7 1719 dell-ave campbell
  santa-clara-county bay-area)
 (7439 big-js-pizza pizza 2.0 810 bay-ave-no.-f capitola unknown
  bay-area)
 (7440 little-caesars-pizza pizza 2.0 1440 x41st-ave-no.-a capitola
  unknown bay-area)
 (7441 pizza-hut pizza 2.0 3555 clares-st-no.-a capitola unknown
  bay-area)
 (7442 straw-hat-pizza pizza 2.0 4000 auto-plaza-dr capitola unknown
  bay-area)
 (7443 tony-&-albas-pizza pizza 2.0 1501 x41st-ave capitola unknown
  bay-area)
 (7444 ace-pizza pizza 2.0 22323 redwood-rd castro-valley
  alameda-county bay-area)
 (7445 dominos-pizza pizza 2.0 3300 no.g-castro-valley-blvd
  castro-valley alameda-county bay-area)
 (7446 l-a-pizza pizza 2.0 20912 redwood-rd-no.-a castro-valley
  alameda-county bay-area)
 (7447 little-caesar pizza 2.0 3020 castro-valley-blvd castro-valley
  alameda-county bay-area)
 (7448 original-sams-pizza pizza 2.0 18825 stanton-ave castro-valley
  alameda-county bay-area)
 (7449 pizza-express pizza 2.0 19573 center-st castro-valley
  alameda-county bay-area)
 (7450 pizza-hut pizza 2.0 3160 castro-valley-blvd castro-valley
  alameda-county bay-area)
 (7451 pizza-towne pizza 2.0 20390 lake-chabot-rd castro-valley
  alameda-county bay-area)
 (7452 pyzanos-pizzeria pizza 3.3 3835 e-castro-valley-blvd
  castro-valley alameda-county bay-area)
 (7453 round-table-pizza pizza 2.0 20261 patio-dr castro-valley
  alameda-county bay-area)
 (7454 straw-hat pizza 2.0 3401 castro-valley-blvd castro-valley
  alameda-county bay-area)
 (7455 pyramid-pizza pizza 2.0 10481 merritt-st castroville
  monterey-county monterey)
 (7456 round-table-pizza pizza 2.0 11250 merritt-st castroville
  monterey-county monterey)
 (7457 cybelles-pizza pizza 2.0 2985 junipero-serra-blvd colma
  san-mateo-county bay-area)
 (7458 aladinos-pizzeria pizza 2.3 1895 farm-bureau-rd-ste-g concord
  contra-costa-county bay-area)
 (7459 bronco-billys-pizza-palace pizza 2.0 4115 concord-blvd concord
  contra-costa-county bay-area)
 (7460 dominos-pizza pizza 2.0 2170 commerce-ave-ste-d concord
  contra-costa-county bay-area)
 (7461 little-caesars-pizza pizza 2.0 4475 treat-blvd concord
  contra-costa-county bay-area)
 (7462 mt-diablo-pizza pizza 2.0 2170 commerce-ave concord
  contra-costa-county bay-area)
 (7463 mt-diablo-pizza pizza 2.0 2490 salvio-st concord
  contra-costa-county bay-area)
 (7464 murphys-pizza pizza 2.0 1701 monument-blvd-no.-e concord
  contra-costa-county bay-area)
 (7465 new-york-pizza pizza 2.0 3476 clayton-rd concord
  contra-costa-county bay-area)
 (7466 pizza-hut pizza 2.0 3142 clayton-rd concord contra-costa-county
  bay-area)
 (7467 pizza-hut pizza 2.0 1825 sutter-st-bldg-a concord
  contra-costa-county bay-area)
 (7468 pizza-hut pizza 2.0 4375 clayton-rd concord contra-costa-county
  bay-area)
 (7469 pizza-palace pizza 2.0 1112 meadow-ln concord
  contra-costa-county bay-area)
 (7470 rods-pizza pizza 2.0 2191 solano-way concord contra-costa-county
  bay-area)
 (7471 round-table-pizza pizza 2.0 5046 commercial-cir-ste-c concord
  contra-costa-county bay-area)
 (7472 round-table-pizza pizza 2.0 2960 treat-blvd concord
  contra-costa-county bay-area)
 (7473 round-table-pizza pizza 2.0 3393 port-chicago-hwy concord
  contra-costa-county bay-area)
 (7474 round-table-pizza pizza 2.0 5046 commercial-cir-ste-c concord
  contra-costa-county bay-area)
 (7475 round-table-pizza pizza 2.0 5046 commercial-cir-ste-c concord
  contra-costa-county bay-area)
 (7476 sbarro pizza 2.0 284 sun-valley-mall-no.-a concord
  contra-costa-county bay-area)
 (7477 straw-hat-pizza pizza 2.0 5358 clayton-rd concord
  contra-costa-county bay-area)
 (7478 strawhat-pizza pizza 2.0 3501 clayton-rd concord
  contra-costa-county bay-area)
 (7479 strictly-to-go-pizzeria pizza 2.0 2699 monument-blvd-ste-a
  concord contra-costa-county bay-area)
 (7480 strictly-to-go-pizzeria pizza 3.0 4702 clayton-rd concord
  contra-costa-county bay-area)
 (7481 apollo-pizza pizza 3.1 10625 s-foothill-blvd cupertino
  santa-clara-county bay-area)
 (7482 ciceros-pizza pizza 3.6 20010 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (7483 dominos-pizza pizza 2.0 10525 s-de-anza-blvd-no.-175 cupertino
  santa-clara-county bay-area)
 (7484 gumbas-pizza-parlor pizza 2.0 10971 n-wolfe-rd cupertino
  santa-clara-county bay-area)
 (7485 j-t-mc-harts-pizza-&-grill pizza 2.3 19732 stevens-creek-blvd
  cupertino santa-clara-county bay-area)
 (7486 pizza-hut pizza 2.0 10065 e-estates-dr cupertino
  santa-clara-county bay-area)
 (7487 pizza-hut pizza 2.0 20770 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (7488 pizza-jacks pizza 2.0 20950 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (7489 pizza-presto pizza 2.0 19998 homestead-rd cupertino
  santa-clara-county bay-area)
 (7490 amazen-pizza-&-subs pizza 2.0 950 king-dr-no.-104 daly-city
  san-mateo-county bay-area)
 (7491 cybelles-pizza-of-daly-city pizza 2.0 2985 junipero-serra-blvd
  daly-city san-mateo-county bay-area)
 (7492 golden-gate-pizza pizza 2.0 2650 geneva-ave daly-city
  san-mateo-county bay-area)
 (7493 golden-gate-pizza pizza 2.0 2408 junipero-serra-blvd daly-city
  san-mateo-county bay-area)
 (7494 little-caesars-pizza pizza 2.0 140 skyline-plz daly-city
  san-mateo-county bay-area)
 (7495 little-caesars-pizza pizza 2.0 2055 gellert-blvd-unit-1
  daly-city san-mateo-county bay-area)
 (7496 luigi-the-pizzaman pizza 2.0 2025 gellert-blvd-no.-202 daly-city
  san-mateo-county bay-area)
 (7497 nizarios-pizza pizza 2.0 7 lake-forest-dr daly-city
  san-mateo-county bay-area)
 (7498 pizza-runners pizza 2.0 50 san-pedro-rd daly-city
  san-mateo-county bay-area)
 (7499 straw-hat-pizza pizza 2.0 391 s-mayfair-ave daly-city
  san-mateo-county bay-area)
 (7500 top-hill-pizza pizza 2.0 7027 mission-st daly-city
  san-mateo-county bay-area)
 (7501 totos-pizzeria-daly-city pizza 2.6 1913 junipero-serra-blvd
  daly-city san-mateo-county bay-area)
 (7502 ascona-pizza-company pizza 3.6 3414 camino-tassajara danville
  contra-costa-county bay-area)
 (7503 garlex-pizza-&-ribs pizza 2.7 121 hartz-ave danville
  contra-costa-county bay-area)
 (7504 pizza-hut-758265 pizza 2.0 110 hartz-ave danville
  contra-costa-county bay-area)
 (7505 primos-pizza-&-pasta-inc pizza 2.8 298 hartz-ave danville
  contra-costa-county bay-area)
 (7506 round-table-pizza pizza 2.0 2196 oneida-cir danville
  contra-costa-county bay-area)
 (7507 the-pizza-machine pizza 2.0 666 san-ramon-valley-blvd danville
  contra-costa-county bay-area)
 (7508 village-pizza pizza 1.7 4050 blackhawk-plaza-cir danville
  contra-costa-county bay-area)
 (7509 bronco-billys-pizza-palace pizza 2.0 8951 san-ramon-rd dublin
  alameda-county bay-area)
 (7510 dominos-pizza pizza 2.0 7447 village-pky dublin alameda-county
  bay-area)
 (7511 little-caesars-of-dublin pizza 2.0 7454 san-ramon-rd dublin
  alameda-county bay-area)
 (7512 lucky-pizza pizza 2.0 7410 amador-valley-blvd-no.-a dublin
  alameda-county bay-area)
 (7513 round-table-pizza pizza 2.0 6690 amador-plaza-rd-ste-210 dublin
  alameda-county bay-area)
 (7514 round-table-pizza pizza 2.0 6690 amador-plaza-rd-no.-210 dublin
  alameda-county bay-area)
 (7515 round-table-pizza-parlor pizza 2.3 7841 amador-valley-blvd
  dublin alameda-county bay-area)
 (7516 stuft-pizza pizza 2.0 11473 rothschild-pl dublin alameda-county
  bay-area)
 (7517 as-pizza pizza 2.0 1924 university-ave east-palo-alto
  san-mateo-county bay-area)
 (7518 pizza-y-taqueria-los-temos pizza 2.0 1924 university-ave
  east-palo-alto san-mateo-county bay-area)
 (7519 armadillo-pizza pizza 2.0 10180 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (7520 chuck-e-cheeses pizza 2.3 20 el-cerrito-plz el-cerrito
  contra-costa-county bay-area)
 (7521 pizza-hut pizza 2.0 11775 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (7522 pizza-roma pizza 2.3 10616 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (7523 dominos-pizza pizza 2.0 448 valley-view-rd el-sobrante
  contra-costa-county bay-area)
 (7524 pizza-company pizza 2.0 5337 valley-view-rd el-sobrante
  contra-costa-county bay-area)
 (7525 poker-pizza pizza 2.0 5090 appian-way el-sobrante
  contra-costa-county bay-area)
 (7526 the-pizza-factory pizza 2.0 4203 valley-view-rd el-sobrante
  contra-costa-county bay-area)
 (7527 bettores-pizza pizza 2.7 5761 christie-ave emeryville
  alameda-county bay-area)
 (7528 mickeys-pizza-store pizza 2.0 5800 shellmound-st emeryville
  alameda-county bay-area)
 (7529 milanos-pizza pizza 2.3 1320 x65th-st emeryville alameda-county
  bay-area)
 (7530 warszawa-polish-cuisine-restau pizza 2.0 4 commodore-dr-apt-333
  emeryville alameda-county bay-area)
 (7531 barvos-pizza pizza 2.0 1230 western-st-no.-a fairfield
  solano-county bay-area)
 (7532 bravos-pizza-restaurant pizza 2.0 364 pittman-rd-no.-1 fairfield
  solano-county bay-area)
 (7533 castle-pizza pizza 2.0 321 w-texas-st fairfield solano-county
  bay-area)
 (7534 castle-pizza pizza 2.0 2755 n-texas-st fairfield solano-county
  bay-area)
 (7535 cenarios-pizza pizza 2.0 1955 w-texas-st fairfield solano-county
  bay-area)
 (7536 dominos-pizza pizza 2.0 2755 baltic-dr fairfield solano-county
  bay-area)
 (7537 little-ceasars pizza 2.0 100 e-tabor-ave fairfield solano-county
  bay-area)
 (7538 mountain-mikes-pizza pizza 2.0 1295 horizon-dr-no.-a fairfield
  solano-county bay-area)
 (7539 murphys-pizza pizza 2.0 1070 n-texas-st-no.-c fairfield
  solano-county bay-area)
 (7540 pacifica-pizza pizza 2.0 2817 calaveras-dr fairfield
  solano-county bay-area)
 (7541 pizza-hut pizza 2.0 598 parker-rd fairfield solano-county
  bay-area)
 (7542 sbarro pizza 2.0 1350 travis-blvd fairfield solano-county
  bay-area)
 (7543 shakeys-pizza-parlor pizza 2.0 2281 n-texas-st fairfield
  solano-county bay-area)
 (7544 straw-hat pizza 2.0 1803 n-texas-st fairfield solano-county
  bay-area)
 (7545 pizza-factory pizza 2.0 6205 highway-9 felton unknown bay-area)
 (7546 dominos-pizza pizza 2.0 1288 e-hillsdale-blvd-no.-step
  foster-city san-mateo-county bay-area)
 (7547 go-getters-pizza pizza 3.4 1489 beach-park-blvd foster-city
  san-mateo-county bay-area)
 (7548 godfathers-pizza pizza 2.0 393 vintage-park-dr-no.-200
  foster-city san-mateo-county bay-area)
 (7549 pacific-gourmet-pizza pizza 3.2 1080 shell-blvd-no.-d
  foster-city san-mateo-county bay-area)
 (7550 pirros-pizzeria pizza 2.0 909 clipper-ln foster-city
  san-mateo-county bay-area)
 (7551 pizza-chalet pizza 2.0 969 edgewater-blvd-no.-d foster-city
  san-mateo-county bay-area)
 (7552 pizza-hut pizza 2.0 1141 triton-dr foster-city san-mateo-county
  bay-area)
 (7553 round-table-pizza pizza 2.8 1070 foster-city-blvd foster-city
  san-mateo-county bay-area)
 (7554 bolos-pizza pizza 2.0 3691 thornton-ave fremont alameda-county
  bay-area)
 (7555 bolos-pizza pizza 2.0 40923 grimmer-blvd fremont alameda-county
  bay-area)
 (7556 bronco-billys-pizza-palace pizza 2.7 37651 niles-blvd fremont
  alameda-county bay-area)
 (7557 dominos-pizza pizza 2.0 3691 thornton-ave fremont alameda-county
  bay-area)
 (7558 dominos-pizza pizza 2.0 38003 mission-blvd fremont
  alameda-county bay-area)
 (7559 dominos-pizza pizza 2.0 40923 grimmer-blvd fremont
  alameda-county bay-area)
 (7560 dominos-pizza pizza 2.0 46678 mohave-dr fremont alameda-county
  bay-area)
 (7561 dominos-pizza pizza 2.0 46678 mohave-dr fremont alameda-county
  bay-area)
 (7562 h-&-h-pizza pizza 2.0 46600 mission-blvd fremont alameda-county
  bay-area)
 (7563 hg-pizza pizza 2.0 37480 fremont-blvd fremont alameda-county
  bay-area)
 (7564 hg-pizza pizza 2.0 40831 fremont-blvd fremont alameda-county
  bay-area)
 (7565 hg-pizza pizza 2.0 4922 paseo-padre-pky fremont alameda-county
  bay-area)
 (7566 j-t-mchart-pizza-&-grill pizza 2.0 34400 fremont-blvd fremont
  alameda-county bay-area)
 (7567 kashmiri-pizza pizza 2.0 40733 chapel-way fremont alameda-county
  bay-area)
 (7568 little-caesars-pizza pizza 2.0 4376 thornton-ave fremont
  alameda-county bay-area)
 (7569 lucias-pizza pizza 3.0 700 mowry-ave-ste-d fremont
  alameda-county bay-area)
 (7570 m-l-pizza pizza 2.0 43976 rosemere-dr fremont alameda-county
  bay-area)
 (7571 mama-elena-pizza pizza 2.0 40645 fremont-blvd-ste-20 fremont
  alameda-county bay-area)
 (7572 mission-pizza pizza 3.1 43468 ellsworth-st fremont
  alameda-county bay-area)
 (7573 mountain-mikes pizza 2.3 3952 washington-blvd fremont
  alameda-county bay-area)
 (7574 murphys-pizza pizza 2.0 4492 norocco-cir fremont alameda-county
  bay-area)
 (7575 new-york-pizza pizza 2.0 41300 fremont-blvd fremont
  alameda-county bay-area)
 (7576 pizza-deport pizza 2.0 3395 walnut-ave fremont alameda-county
  bay-area)
 (7577 pizza-depot pizza 2.0 43450 grimmer-blvd fremont alameda-county
  bay-area)
 (7578 pizza-hut pizza 2.0 39010 argonaut-way fremont alameda-county
  bay-area)
 (7579 pizza-italia pizza 2.7 3555 peralta-blvd fremont alameda-county
  bay-area)
 (7580 sicily-pizza pizza 2.0 32730 alvarado-blvd fremont
  alameda-county bay-area)
 (7581 straw-hat pizza 2.0 4075 thornton-ave fremont alameda-county
  bay-area)
 (7582 straw-hat pizza 2.0 40655 grimmer-blvd fremont alameda-county
  bay-area)
 (7583 straw-hat pizza 2.0 46465 mission-blvd fremont alameda-county
  bay-area)
 (7584 stuft-pizza pizza 3.5 39447 fremont-blvd fremont alameda-county
  bay-area)
 (7585 mission-pizza-to-go pizza 2.7 1572 washington-blvd fremont
  alameda-county bay-area)
 (7586 stuft-pizza pizza 3.0 1572 washington-blvd fremont
  alameda-county bay-area)
 (7587 usa-pizza pizza 2.0 2000 driscoll-rd-ste-k fremont
  alameda-county bay-area)
 (7588 d-&-d-pizza pizza 2.0 353 e-10th-st gilroy santa-clara-county
  bay-area)
 (7589 little-caesars-pizza pizza 2.0 1340 x1st-st gilroy
  santa-clara-county bay-area)
 (7590 mamas-two-for-one-pizza pizza 2.0 7901 westwood-dr-no.-g gilroy
  santa-clara-county bay-area)
 (7591 pinocchios-pizza-no-one pizza 2.0 9325 monterey-rd gilroy
  santa-clara-county bay-area)
 (7592 pinocchios-pizza-no-two pizza 2.0 7041 monterey-st gilroy
  santa-clara-county bay-area)
 (7593 pizza-cove pizza 2.0 303 x1st-st gilroy santa-clara-county
  bay-area)
 (7594 pizza-hut pizza 2.0 1171 x1st-st gilroy santa-clara-county
  bay-area)
 (7595 pizza-n-stuff pizza 2.0 150 leavesley-rd-no.-b gilroy
  santa-clara-county bay-area)
 (7596 round-table-pizza pizza 2.0 815 x1st-st gilroy
  santa-clara-county bay-area)
 (7597 straw-hat-pizza pizza 2.0 1053 x1st-st gilroy santa-clara-county
  bay-area)
 (7598 stuft-pizza pizza 2.0 340 e-10th-st gilroy santa-clara-county
  bay-area)
 (7599 the-dutchmans-pizza pizza 1.7 6940 chestnut-st gilroy
  santa-clara-county bay-area)
 (7600 harbor-pizza pizza 1.6 468 myrtle-st half-moon-bay
  san-mateo-county bay-area)
 (7601 round-table-pizza pizza 1.8 50 cabrillo-hwy-n-no.-7
  half-moon-bay san-mateo-county bay-area)
 (7602 straw-hat-pizza pizza 1.8 186 san-mateo-rd half-moon-bay
  san-mateo-county bay-area)
 (7603 al-romanos-pizza pizza 2.0 24261 mission-blvd hayward
  alameda-county bay-area)
 (7604 al-romanos pizza 2.0 24261 mission-blvd hayward alameda-county
  bay-area)
 (7605 bronco-billys-pizza-palace pizza 2.0 26775 hayward-blvd hayward
  alameda-county bay-area)
 (7606 bronco-billys-pizza-palace pizza 2.0 1273
  industrial-pky-w-no.-390 hayward alameda-county bay-area)
 (7607 bronco-billys-pizza-palace pizza 2.0 1273
  industrial-pky-w-no.-39 hayward alameda-county bay-area)
 (7608 california-pizza pizza 2.0 29587 mission-blvd hayward
  alameda-county bay-area)
 (7609 chuck-e-cheese pizza 1.7 24243 hesperian-blvd hayward
  alameda-county bay-area)
 (7610 dominos-pizza pizza 2.0 2272 rose-hill-st hayward alameda-county
  bay-area)
 (7611 gateway-pizza pizza 2.0 24933 santa-clara-st-no.-a4 hayward
  alameda-county bay-area)
 (7612 liberty-pizza pizza 2.0 499 w-a-st hayward alameda-county
  bay-area)
 (7613 little-caesar pizza 2.0 338 w-tennyson-rd-no.-2 hayward
  alameda-county bay-area)
 (7614 little-caesars-pizza pizza 2.0 26941 aberdeen-pl hayward
  alameda-county bay-area)
 (7615 mountain-trappers-pizza pizza 2.0 25849 mission-blvd hayward
  alameda-county bay-area)
 (7616 new-york-pizza pizza 2.0 665 w-tennyson-rd hayward
  alameda-county bay-area)
 (7617 pizza-hut pizza 2.0 24748 hesperian-blvd hayward alameda-county
  bay-area)
 (7618 pizza-towne pizza 2.0 42 blossom-way hayward alameda-county
  bay-area)
 (7619 round-table-pizza pizza 2.0 22457 foothill-blvd hayward
  alameda-county bay-area)
 (7620 round-table-pizza pizza 2.0 157 harder-rd hayward alameda-county
  bay-area)
 (7621 round-table-pizza pizza 2.0 1108 w-tennyson-rd hayward
  alameda-county bay-area)
 (7622 round-table-pizza pizza 2.0 31147 mission-blvd hayward
  alameda-county bay-area)
 (7623 round-table-pizza-rest pizza 2.0 20906 mission-blvd hayward
  alameda-county bay-area)
 (7624 sbarro pizza 2.0 22 southland-mall hayward alameda-county
  bay-area)
 (7625 straw-hat-pizza pizza 2.0 888 w-a-st hayward alameda-county
  bay-area)
 (7626 superway-pizza pizza 2.0 27973 leidig-ct hayward alameda-county
  bay-area)
 (7627 ye-olde-pizza-joynt pizza 3.3 19510 hesperian-blvd hayward
  alameda-county bay-area)
 (7628 jamalos-pizza-&-pasta pizza 2.0 844 willow-ave-ste-a-11 hercules
  contra-costa-county bay-area)
 (7629 jamalos-pizza-&-pasta pizza 2.0 844 willow-ave-ste-a11 hercules
  contra-costa-county bay-area)
 (7630 bevo pizza 2.0 341 tres-pinos-rd-ste-103-b hollister
  san-benito-county northern-california)
 (7631 mountain-mikes-pizza pizza 2.0 580 tres-pinos-rd hollister
  san-benito-county northern-california)
 (7632 round-table-pizza pizza 2.0 340 hawkins-st hollister
  san-benito-county northern-california)
 (7633 round-table-pizza pizza 2.0 340 hawkins-st hollister
  san-benito-county northern-california)
 (7634 round-table-pizza pizza 2.0 0 unknown hollister
  san-benito-county northern-california)
 (7635 round-table-pizza pizza 2.0 0 unknown hollister
  san-benito-county northern-california)
 (7636 round-table-pizza pizza 2.0 0 unknown hollister
  san-benito-county northern-california)
 (7637 round-table-pizza pizza 2.0 0 unknown hollister
  san-benito-county northern-california)
 (7638 round-table-pizza pizza 2.0 0 unknown hollister
  san-benito-county northern-california)
 (7639 round-table-pizza pizza 2.0 0 unknown hollister
  san-benito-county northern-california)
 (7640 sams-pizza-pasta-&-salads pizza 2.0 648 x5th-st-no.-rear
  hollister san-benito-county northern-california)
 (7641 straw-hat-pizza pizza 2.0 191 san-felipe-rd-no.-a hollister
  san-benito-county northern-california)
 (7642 cybelles-pizza pizza 2.0 3531 plaza-way lafayette
  contra-costa-county bay-area)
 (7643 dollys-pizza pizza 2.0 3322 mount-diablo-blvd-ste-d lafayette
  contra-costa-county bay-area)
 (7644 four-corners-pizza pizza 2.0 5 smoke-tree-ct lafayette
  contra-costa-county bay-area)
 (7645 four-corners-pizza-&-pasta pizza 2.0 5 smoke-tree-ct lafayette
  contra-costa-county bay-area)
 (7646 liberty-pizza pizza 2.0 978 murrieta-blvd livermore
  alameda-county bay-area)
 (7647 little-caesar pizza 2.0 1092 e-stanley-blvd livermore
  alameda-county bay-area)
 (7648 magoos-pizza pizza 2.7 364 s-livermore-ave livermore
  alameda-county bay-area)
 (7649 pizza-hut pizza 2.0 282 s-l-st livermore alameda-county
  bay-area)
 (7650 round-table-pizza pizza 2.3 1540 x1st-st livermore
  alameda-county bay-area)
 (7651 round-table-pizza pizza 2.0 4098 east-ave livermore
  alameda-county bay-area)
 (7652 russ-pizza-restaurant pizza 3.0 186 maple-st livermore
  alameda-county bay-area)
 (7653 w-&-w-pizza-inc pizza 2.0 90 s-l-st livermore alameda-county
  bay-area)
 (7654 dominos-pizza pizza 2.0 973 fremont-ave los-altos
  santa-clara-county bay-area)
 (7655 murphys-pizza-take-&-bake pizza 3.0 630 fremont-ave-no.-a
  los-altos santa-clara-county bay-area)
 (7656 round-table-pizza pizza 2.0 4400 el-camino-real los-altos
  santa-clara-county bay-area)
 (7657 little-caesars-pizza pizza 2.0 15466 los-gatos-blvd los-gatos
  santa-clara-county bay-area)
 (7658 mountain-mikes-pizza pizza 2.0 430 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (7659 nonnos-pizza-&-pasta pizza 2.0 1516 pollard-rd los-gatos
  santa-clara-county bay-area)
 (7660 pizza-time-theatre pizza 2.0 14107 winchester-blvd-no.-t
  los-gatos santa-clara-county bay-area)
 (7661 round-table-pizza pizza 1.7 57 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (7662 stuft-pizza pizza 2.0 15525 los-gatos-blvd-no.-d los-gatos
  santa-clara-county bay-area)
 (7663 stuft-pizza pizza 2.0 15525 los-gatos-blvd-no.-d los-gatos
  santa-clara-county bay-area)
 (7664 t-birds-of-los-gatos pizza 3.8 444 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (7665 the-pizza-broker pizza 1.7 0 and-tasman-st san-jose
  santa-clara-county bay-area)
 (7666 willow-street-wood-fired-pizza-ls pizza 2.8 20
  s-santa-cruz-ave-ste-218 los-gatos santa-clara-county bay-area)
 (7667 bella-roma-pizza pizza 1.7 4040 alhambra-ave martinez
  contra-costa-county bay-area)
 (7668 de-vinos-pizza pizza 2.0 2416 willow-tree-ln martinez
  contra-costa-county bay-area)
 (7669 dominos-pizza pizza 2.0 1622 pacheco-blvd martinez
  contra-costa-county bay-area)
 (7670 pacifica-pizza pizza 2.7 500 main-st martinez
  contra-costa-county bay-area)
 (7671 round-table-pizza-of-martinez pizza 2.3 504 center-ave martinez
  contra-costa-county bay-area)
 (7672 applewood-inn pizza 3.4 989 d-el-camino-real menlo-park
  san-mateo-county bay-area)
 (7673 pizza-hut pizza 2.0 3415 middlefield-rd menlo-park
  san-mateo-county bay-area)
 (7674 round-table-pizza pizza 2.0 1225 el-camino-real menlo-park
  san-mateo-county bay-area)
 (7675 round-table-pizza pizza 2.0 0 unknown menlo-park
  san-mateo-county bay-area)
 (7676 round-table-pizza pizza 2.0 3130 alpine-rd menlo-park
  san-mateo-county bay-area)
 (7677 tonys-pizza pizza 2.0 820 willow-rd menlo-park san-mateo-county
  bay-area)
 (7678 dominos-pizza pizza 2.0 1295 tuolumne-rd millbrae
  san-mateo-county bay-area)
 (7679 dominos-pizza pizza 2.0 1621 el-camino-real millbrae
  san-mateo-county bay-area)
 (7680 little-caesars-pizza pizza 2.0 660 magnolia-ave millbrae
  san-mateo-county bay-area)
 (7681 straw-hat-pizza pizza 2.0 349 broadway millbrae san-mateo-county
  bay-area)
 (7682 zorbas-pizza pizza 2.0 1567 el-camino-real millbrae
  san-mateo-county bay-area)
 (7683 dominos-pizza pizza 2.0 106 dempsey-rd milpitas
  santa-clara-county bay-area)
 (7684 magoos-pizza pizza 2.3 560 n-abel-st milpitas santa-clara-county
  bay-area)
 (7685 no-name-pizza-co-oakley pizza 2.0 966 hanson-ct milpitas
  santa-clara-county bay-area)
 (7686 no-name-pizza-company pizza 2.0 966 hanson-ct milpitas
  santa-clara-county bay-area)
 (7687 pizza-box pizza 2.0 1513 kennedy-dr milpitas santa-clara-county
  bay-area)
 (7688 pizza-depot pizza 2.7 42 dixon-rd milpitas santa-clara-county
  bay-area)
 (7689 pizza-hut pizza 2.0 102 s-park-victoria-dr milpitas
  santa-clara-county bay-area)
 (7690 rockys-pizza pizza 2.0 76 s-abel-st milpitas santa-clara-county
  bay-area)
 (7691 round-table-pizza pizza 2.3 79 s-abbott-ave milpitas
  santa-clara-county bay-area)
 (7692 savory-chicken-&-pizza pizza 2.0 1557 landess-ave milpitas
  santa-clara-county bay-area)
 (7693 straw-hat-pizza pizza 2.0 1350 s-park-victoria-dr-no.-46
  milpitas santa-clara-county bay-area)
 (7694 stuft-pizza pizza 1.8 1426 dempsey-rd milpitas
  santa-clara-county bay-area)
 (7695 round-table-pizza pizza 2.0 10351 orange-ave monte-vista unknown
  unknown)
 (7696 lamorinda-pizza pizza 2.3 382 park-st moraga unknown bay-area)
 (7697 mountain-mikes-pizza pizza 2.0 504 center-st moraga unknown
  bay-area)
 (7698 round-table-pizza-of-benicia pizza 2.0 278 deerfield-dr moraga
  unknown bay-area)
 (7699 the-pizza-place pizza 2.0 1375 moraga-way-no.-d moraga unknown
  bay-area)
 (7700 little-caesars-pizza pizza 2.7 16999 monterey-rd-no.-b
  morgan-hill santa-clara-county bay-area)
 (7701 mountain-mikes-pizza pizza 2.8 201 tennant-sta morgan-hill
  santa-clara-county bay-area)
 (7702 nonnos-pizza-&-pasta pizza 2.0 435 vineyard-town-ctr morgan-hill
  santa-clara-county bay-area)
 (7703 pizza-hut pizza 2.0 16375 monterey-rd morgan-hill
  santa-clara-county bay-area)
 (7704 round-table-pizza pizza 2.7 16740 monterey-st morgan-hill
  santa-clara-county bay-area)
 (7705 stuft-pizza pizza 2.5 301 vineyard-town-ctr morgan-hill
  santa-clara-county bay-area)
 (7706 applewood-pizza pizza 3.2 903 e-el-camino-real mountain-view
  santa-clara-county bay-area)
 (7707 cybelles-pizza pizza 2.0 2570 w-el-camino-real-ste-200
  mountain-view santa-clara-county bay-area)
 (7708 d-j-s-gourmet-pizza pizza 2.0 867 w-evelyn-ave mountain-view
  santa-clara-county bay-area)
 (7709 family-pizza-place pizza 2.8 2464 w-el-camino-real mountain-view
  santa-clara-county bay-area)
 (7710 fast-pizza-delivery pizza 2.8 1482 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (7711 frankie-johnnie-&-luigi-too pizza 3.2 939 w.-el-camino-real
  mountain-view santa-clara-county bay-area)
 (7712 giorgios-pizza-house pizza 2.0 939 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (7713 little-caesars-pizza pizza 2.0 580 n-rengstorff-ave
  mountain-view santa-clara-county bay-area)
 (7714 mountain-mikes-pizza pizza 3.0 2000 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (7715 mountain-mikes-pizza pizza 2.0 1724 miramonte-ave mountain-view
  santa-clara-county bay-area)
 (7716 ny-style-pizza-afghan-spclty pizza 2.3 327 moffett-blvd-no.-j
  mountain-view santa-clara-county bay-area)
 (7717 pizza-hut pizza 2.0 1955 w-el-camino-real mountain-view
  santa-clara-county bay-area)
 (7718 pizza-works pizza 2.0 225 e-middlefield-rd-no.-2 mountain-view
  santa-clara-county bay-area)
 (7719 pontillos-pizzeria pizza 3.8 615 s-rengstorff-ave mountain-view
  santa-clara-county bay-area)
 (7720 stuft-pizza pizza 2.9 191 castro-st mountain-view
  santa-clara-county bay-area)
 (7721 tony-&-albas-pizza pizza 3.8 619 escuela-ave mountain-view
  santa-clara-county bay-area)
 (7722 danellis-pizza pizza 2.0 1570 silver-trl napa napa-county
  napa-valley)
 (7723 dominos-pizza pizza 2.0 3195 jefferson-st napa napa-county
  napa-valley)
 (7724 fazerratis-pizza pizza 2.0 1517 w-imola-ave napa napa-county
  napa-valley)
 (7725 great-american-pizza pizza 2.0 2983 jefferson-st napa
  napa-county napa-valley)
 (7726 little-ceasars pizza 2.0 1348 trancas-st napa napa-county
  napa-valley)
 (7727 murpheys-pizza pizza 2.0 1147 broadway napa napa-county
  napa-valley)
 (7728 murphys-take-n-bake-pizza pizza 2.0 2 soscol-&-bel-aire-center
  napa napa-county napa-valley)
 (7729 murphys-pizza pizza 2.0 3484 westminster-way napa napa-county
  napa-valley)
 (7730 pa-pa-joes-pizza pizza 2.0 1121 lincoln-ave napa napa-county
  napa-valley)
 (7731 round-table-pizza pizza 2.0 701 lincoln-ave napa napa-county
  napa-valley)
 (7732 round-table-pizza pizza 2.0 3331 solano-ave napa napa-county
  napa-valley)
 (7733 your-mamas-pizza pizza 2.0 2410 jefferson-st napa napa-county
  napa-valley)
 (7734 dominos-pizza pizza 2.0 35248 newark-blvd newark alameda-county
  bay-area)
 (7735 hg-pizza pizza 2.0 35118 newark-blvd newark alameda-county
  bay-area)
 (7736 hg-pizza pizza 2.0 5544 thornton-ave newark alameda-county
  bay-area)
 (7737 ken-&-dans-pizza pizza 2.7 5849 jarvis-ave newark alameda-county
  bay-area)
 (7738 little-caesars-pizza pizza 2.0 6180 jarvis-ave-ste-w newark
  alameda-county bay-area)
 (7739 pizza-hut pizza 2.0 35201 newark-blvd newark alameda-county
  bay-area)
 (7740 pizza-shack pizza 2.0 5454 central-ave newark alameda-county
  bay-area)
 (7741 shakers-pizza pizza 2.0 36601 newark-blvd-no.-58 newark
  alameda-county bay-area)
 (7742 super-pizza pizza 2.0 36565 newark-blvd newark alameda-county
  bay-area)
 (7743 vitos-pizza pizza 2.7 39974 cedar-blvd newark alameda-county
  bay-area)
 (7744 you-bes-pizza pizza 2.0 5409 central-ave-no.-8 newark
  alameda-county bay-area)
 (7745 bayside-pizza pizza 2.0 1204 fruitvale-ave oakland
  alameda-county bay-area)
 (7746 bayside-pizza pizza 2.0 3360 grand-ave oakland alameda-county
  bay-area)
 (7747 bayside-pizza pizza 2.0 3639 macarthur-blvd oakland
  alameda-county bay-area)
 (7748 bella-pizza pizza 2.0 6638 bancroft-ave oakland alameda-county
  bay-area)
 (7749 coliseum-pizza pizza 2.0 655 x98th-ave oakland alameda-county
  bay-area)
 (7750 college-cybelles pizza 2.0 7270 sayre-dr oakland alameda-county
  bay-area)
 (7751 cybelles-pizza pizza 2.0 6468 moraga-ave oakland alameda-county
  bay-area)
 (7752 cybelles-pizza-restaurant pizza 2.0 70 eastmont-mall oakland
  alameda-county bay-area)
 (7753 davincis-pasta-&-pizza-ltd pizza 2.3 1814 franklin-st oakland
  alameda-county bay-area)
 (7754 flamingo-pizza-restaurant pizza 2.0 1604 e-14th-st oakland
  alameda-county bay-area)
 (7755 four-star-pizza pizza 2.0 536 lake-park-ave oakland
  alameda-county bay-area)
 (7756 its-a-pizza pizza 2.0 248 grand-ave oakland alameda-county
  bay-area)
 (7757 leaning-tower-of-pizza-oakland pizza 2.0 498 wesley-ave oakland
  alameda-county bay-area)
 (7758 little-caesars pizza 2.0 10329 e-14th-st oakland alameda-county
  bay-area)
 (7759 lo-cocos-restaurant-&-pizzeria pizza 3.3 4270 piedmont-ave
  oakland alameda-county bay-area)
 (7760 n-giovanni-pizza pizza 2.0 6211 shattuck-ave oakland
  alameda-county bay-area)
 (7761 oak-a-pizza pizza 2.7 4717 foothill-blvd oakland alameda-county
  bay-area)
 (7762 oakland-pizza pizza 2.0 2854 mountain-blvd oakland
  alameda-county bay-area)
 (7763 piazza-pizzeria pizza 2.0 500 x12th-st-ste-111 oakland
  alameda-county bay-area)
 (7764 pizza-deli pizza 2.0 4166 macarthur-blvd oakland alameda-county
  bay-area)
 (7765 pizza-hut pizza 2.0 2603 fruitvale-ave oakland alameda-county
  bay-area)
 (7766 pizza-hut pizza 2.0 10807 macarthur-blvd oakland alameda-county
  bay-area)
 (7767 pizza-hut pizza 2.0 6341 shattuck-ave oakland alameda-county
  bay-area)
 (7768 pizza-rama pizza 2.0 138 x14th-st oakland alameda-county
  bay-area)
 (7769 pizza-rustaci-cafe-ltd pizza 3.2 5422 college-ave oakland
  alameda-county bay-area)
 (7770 pizza-station pizza 2.0 4919 telegraph-ave oakland
  alameda-county bay-area)
 (7771 pizzeria-guglielmo pizza 3.0 5461 college-ave oakland
  alameda-county bay-area)
 (7772 romeos-pizza pizza 2.0 1422 broadway oakland alameda-county
  bay-area)
 (7773 round-table-pizza pizza 2.0 2045 macarthur-blvd oakland
  alameda-county bay-area)
 (7774 round-table-pizza pizza 2.0 10700 macarthur-blvd oakland
  alameda-county bay-area)
 (7775 round-table-pizza pizza 2.0 398 grand-ave oakland alameda-county
  bay-area)
 (7776 round-table-pizza pizza 1.7 3655 piedmont-ave-sp-f014 oakland
  alameda-county bay-area)
 (7777 round-table-pizza pizza 2.0 4184 piedmont-ave-no.-e oakland
  alameda-county bay-area)
 (7778 round-table-pizza pizza 2.0 2071 mountain-blvd oakland
  alameda-county bay-area)
 (7779 saratoga-pizzeria-&-restaurant pizza 2.0 3936 telegraph-ave
  oakland alameda-county bay-area)
 (7780 sicilian-pizza pizza 2.0 5941 macarthur-blvd oakland
  alameda-county bay-area)
 (7781 theos-pizza pizza 2.0 1956 webster-st oakland alameda-county
  bay-area)
 (7782 yummie-pizza pizza 2.0 8431 e-14th-st oakland alameda-county
  bay-area)
 (7783 zacharys-chicago-pizza pizza 4.0 5801 college-ave oakland
  alameda-county bay-area)
 (7784 mountain-mikes-pizza pizza 2.0 2091 main-st oakley
  contra-costa-county bay-area)
 (7785 round-table-pizza pizza 2.0 290 highway-4 oakley
  contra-costa-county bay-area)
 (7786 straw-hat-pizza pizza 2.0 14 francisco-ct orinda
  contra-costa-county bay-area)
 (7787 village-pizza pizza 2.6 19 orinda-way-no.-a-b orinda
  contra-costa-county bay-area)
 (7788 dominos-pizza pizza 2.0 1005 terra-nova-blvd-no.-a pacifica
  san-mateo-county bay-area)
 (7789 dominos-pizza pizza 2.0 1301 palmetto-ave-no.-c pacifica
  san-mateo-county bay-area)
 (7790 manor-room pizza 2.4 442 manor-plz pacifica san-mateo-county
  bay-area)
 (7791 mikes-pizza pizza 2.0 1005 terra-nova-blvd pacifica
  san-mateo-county bay-area)
 (7792 mountain-mikes-pizza pizza 2.0 4625 cabrillo-hwy pacifica
  san-mateo-county bay-area)
 (7793 pepis-pizza-pasta pizza 2.0 671 parkview-ct pacifica
  san-mateo-county bay-area)
 (7794 round-table-pizza pizza 2.3 1285 linda-mar-blvd pacifica
  san-mateo-county bay-area)
 (7795 round-table-pizza pizza 2.0 549 oceana-blvd pacifica
  san-mateo-county bay-area)
 (7796 california-pizza-kitchen pizza 2.8 531 cowper-st palo-alto
  santa-clara-county bay-area)
 (7797 joses-pizza pizza 2.9 2275 el-camino-real palo-alto
  santa-clara-county bay-area)
 (7798 murphys-pizza-take-&-bake pizza 2.3 2730 middlefield-rd
  palo-alto santa-clara-county bay-area)
 (7799 new-york-style-pizza pizza 2.0 325 hamilton-ave palo-alto
  santa-clara-county bay-area)
 (7800 pizza-chicago pizza 2.9 4115 el-camino-real palo-alto
  santa-clara-county bay-area)
 (7801 pizza-a-go-go pizza 2.2 335 university-ave palo-alto
  santa-clara-county bay-area)
 (7802 pizza-hut pizza 2.7 2999 el-camino-real palo-alto
  santa-clara-county bay-area)
 (7803 ramonas pizza 3.3 541 ramona-st palo-alto santa-clara-county
  bay-area)
 (7804 ramonas-too pizza 2.8 2313 birch-st palo-alto santa-clara-county
  bay-area)
 (7805 red-boy-pizza pizza 2.0 0 &-country-village palo-alto
  santa-clara-county bay-area)
 (7806 round-table-pizza pizza 2.2 702 colorado-ave palo-alto
  santa-clara-county bay-area)
 (7807 round-table-pizza pizza 2.2 739 la-para-ave palo-alto
  santa-clara-county bay-area)
 (7808 round-table-pizza pizza 2.2 3407 alma-st palo-alto
  santa-clara-county bay-area)
 (7809 dominos-pizza pizza 2.0 2749 de-la-briandais-ct pinole
  contra-costa-county bay-area)
 (7810 hercules-round-table pizza 2.0 2646 appian-way-ste-27 pinole
  contra-costa-county bay-area)
 (7811 little-caesars-pizza pizza 2.0 2830 pinole-valley-rd pinole
  contra-costa-county bay-area)
 (7812 pizza-hut pizza 2.0 1211 tara-hills-dr pinole
  contra-costa-county bay-area)
 (7813 pizza-plenty pizza 2.0 2701 pinole-valley-rd pinole
  contra-costa-county bay-area)
 (7814 round-table-pizza pizza 2.0 1071 tara-hills-dr pinole
  contra-costa-county bay-area)
 (7815 angelos-pizza-&-wings pizza 2.7 4000 railroad pittsburg
  contra-costa-county bay-area)
 (7816 carlos-pizzeria pizza 2.0 2099 railroad pittsburg
  contra-costa-county bay-area)
 (7817 di-maggio-brothers-pizza pizza 2.0 248 atlantic-ave pittsburg
  contra-costa-county bay-area)
 (7818 dominos-pizza pizza 2.0 3724 railroad pittsburg
  contra-costa-county bay-area)
 (7819 liberty-pizza pizza 2.0 1441 e-leland-rd-no.-b pittsburg
  contra-costa-county bay-area)
 (7820 little-ceasars pizza 2.0 4001 railroad pittsburg
  contra-costa-county bay-area)
 (7821 little-ceasars pizza 2.0 2711 willow-pass-rd pittsburg
  contra-costa-county bay-area)
 (7822 pizza-express pizza 2.0 2261 railroad pittsburg
  contra-costa-county bay-area)
 (7823 pizza-hut-delivery-758259 pizza 2.0 1285 e-leland-rd pittsburg
  contra-costa-county bay-area)
 (7824 round-table-pizza pizza 2.0 1331 buchanan-rd pittsburg
  contra-costa-county bay-area)
 (7825 blondies-pizza pizza 3.0 1025 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (7826 dominos-pizza pizza 2.0 1649 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (7827 jamalos-pizza-&-pasta pizza 2.0 2001 contra-costa-blvd-no.-a40
  pleasant-hill contra-costa-county bay-area)
 (7828 mamma-mia-pizzaria pizza 2.0 508 contra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (7829 marys-pizza-shack pizza 2.0 1420 contra-costa-blvd-no.-b
  pleasant-hill contra-costa-county bay-area)
 (7830 melos-pizza pizza 3.3 1660 contra-costa-blvd-ste-a pleasant-hill
  contra-costa-county bay-area)
 (7831 pizza-hut pizza 2.7 1749 vconra-costa-blvd pleasant-hill
  contra-costa-county bay-area)
 (7832 round-table-pizza pizza 2.0 1938 oak-park-blvd pleasant-hill
  contra-costa-county bay-area)
 (7833 round-table-pizza pizza 2.0 85 chilpancingo-pky pleasant-hill
  contra-costa-county bay-area)
 (7834 roundtable-pizza pizza 2.0 85 chilpancingo-pky pleasant-hill
  contra-costa-county bay-area)
 (7835 brunos-pizzeria pizza 3.4 443 main-st pleasanton alameda-county
  bay-area)
 (7836 gay-nineties-pizza-company pizza 3.0 288 main-st pleasanton
  alameda-county bay-area)
 (7837 mountain-mikes-pizza pizza 2.0 3120 santa-rita-rd-ste-h
  pleasanton alameda-county bay-area)
 (7838 mountain-mikes-pizza pizza 2.0 5424 sunol-blvd-ste-8 pleasanton
  alameda-county bay-area)
 (7839 philly-pizza-&-deli pizza 2.0 5321 hopyard-rd-ste-d pleasanton
  alameda-county bay-area)
 (7840 pizza-hut pizza 2.0 927 main-st pleasanton alameda-county
  bay-area)
 (7841 pizza-palace-&-deli pizza 2.0 5548 springdale-ave-no.-d
  pleasanton alameda-county bay-area)
 (7842 round-table-pizza pizza 2.0 915 main-st-no.-d pleasanton
  alameda-county bay-area)
 (7843 round-table-pizza pizza 2.0 5653 stoneridge-dr-ste-111
  pleasanton alameda-county bay-area)
 (7844 round-table-pizza-crow-cyn-pla pizza 2.0 5653
  stoneridge-dr-ste-111 pleasanton alameda-county bay-area)
 (7845 straw-hat-pizza pizza 2.0 2953 hopyard-rd pleasanton
  alameda-county bay-area)
 (7846 the-round-table pizza 2.0 5653 stoneridge-dr-ste-111 pleasanton
  alameda-county bay-area)
 (7847 you-bes-u-bake-pizza pizza 2.3 6075 w-las-positas-blvd
  pleasanton alameda-county bay-area)
 (7848 capns-galley-pizza-&-pipes pizza 2.0 821 winslow-st redwood-city
  san-mateo-county bay-area)
 (7849 gold-rush-brick-oven-pizza pizza 2.0 1836 el-camino-real
  redwood-city san-mateo-county bay-area)
 (7850 little-caesars-pizza pizza 2.0 2193 roosevelt-ave redwood-city
  san-mateo-county bay-area)
 (7851 mountain-mike-pizza pizza 2.6 120 el-camino-real redwood-city
  san-mateo-county bay-area)
 (7852 pizza-hut pizza 2.0 600 whipple-ave redwood-city
  san-mateo-county bay-area)
 (7853 pizza-king pizza 3.0 3205 oak-knoll-dr redwood-city
  san-mateo-county bay-area)
 (7854 romeos-brick-oven-pizza pizza 2.0 711 el-camino-real
  redwood-city san-mateo-county bay-area)
 (7855 romeos-pizza pizza 2.0 3710 florence-st redwood-city
  san-mateo-county bay-area)
 (7856 round-table-pizza pizza 2.0 1483 broadway redwood-city
  san-mateo-county bay-area)
 (7857 straw-hat-pizza pizza 2.0 373 main-st redwood-city
  san-mateo-county bay-area)
 (7858 de-anza-pizza pizza 2.0 4801 valley-view-rd-no.-d richmond
  contra-costa-county bay-area)
 (7859 hilltop-pizza pizza 2.0 2800 hilltop-mall-rd richmond
  contra-costa-county bay-area)
 (7860 mr-pizza-man pizza 2.0 353 x24th-st richmond contra-costa-county
  bay-area)
 (7861 prego-pizzeria pizza 2.0 151 park-pl richmond
  contra-costa-county bay-area)
 (7862 round-table-pizza pizza 2.0 13100 san-pablo-ave richmond
  contra-costa-county bay-area)
 (7863 zest-pizza-&-restaurant pizza 2.0 12221 san-pablo-ave richmond
  contra-costa-county bay-area)
 (7864 rio-vista-pizza-factory pizza 2.0 201 main-st rio-vista
  solano-county bay-area)
 (7865 straw-hat-pizza pizza 2.0 687 parker-ave rodeo unknown unknown)
 (7866 pacifica-pizza pizza 2.0 360 parker-ave rodeo unknown unknown)
 (7867 bravo-pizza-&-restaurant pizza 2.0 334 grand-ave
  south-san-francisco san-mateo-county bay-area)
 (7868 buon-gusto-pizzeria pizza 1.7 113 grand-ave south-san-francisco
  san-mateo-county bay-area)
 (7869 capri-pizza pizza 2.0 1129 el-camino-real south-san-francisco
  san-mateo-county bay-area)
 (7870 di-napoli-pizza-1-& pizza 2.0 608 linden-ave south-san-francisco
  san-mateo-county bay-area)
 (7871 golden-gate-pizza pizza 2.0 158 s-spruce-ave south-san-francisco
  san-mateo-county bay-area)
 (7872 napolitana-pizza-&-pasta pizza 2.0 202 grand-ave
  south-san-francisco san-mateo-county bay-area)
 (7873 pizza-hut pizza 2.0 553 el-camino-real south-san-francisco
  san-mateo-county bay-area)
 (7874 round-table-pizza pizza 2.0 20 chestnut-ave south-san-francisco
  san-mateo-county bay-area)
 (7875 round-table-pizza pizza 2.0 2227 gellert-blvd
  south-san-francisco san-mateo-county bay-area)
 (7876 zorbas-pizza pizza 2.0 146 hazelwood-dr south-san-francisco
  san-mateo-county bay-area)
 (7877 la-prima-pizza pizza 2.3 1010 adams-st saint-helena napa-county
  napa-valley)
 (7878 magoos-pizzeria-video-rental pizza 2.0 730 kains-ave san-bruno
  san-mateo-county bay-area)
 (7879 perrys-pizza pizza 2.0 24 bayhill-shopping-ctr san-bruno
  san-mateo-county bay-area)
 (7880 totos-pizzeria-of-san-bruno pizza 2.3 1690 el-camino-real
  san-bruno san-mateo-county bay-area)
 (7881 all-star-pizza pizza 2.0 1065 holly-st san-carlos
  san-mateo-county bay-area)
 (7882 cheshire-pub-&-pizzeria pizza 2.7 1494 el-camino-real san-carlos
  san-mateo-county bay-area)
 (7883 dominos-pizza pizza 2.0 1336 el-camino-real san-carlos
  san-mateo-county bay-area)
 (7884 pizza-hut pizza 2.0 366 el-camino-real san-carlos
  san-mateo-county bay-area)
 (7885 round-table-pizza pizza 2.0 655 skyway-ste-101 san-carlos
  san-mateo-county bay-area)
 (7886 round-table-pizza pizza 2.5 240 el-camino-real san-carlos
  san-mateo-county bay-area)
 (7887 the-panhandle-pizza-co. pizza 2.0 2077 hayes-st san-francisco
  san-francisco-county bay-area)
 (7888 north-beach-pizza pizza 4.0 800 stanyan-st. san-francisco
  san-francisco-county bay-area)
 (7889 american-pizza-&-deli pizza 2.0 1070 leigh-ave san-jose
  santa-clara-county bay-area)
 (7890 americana-pizza pizza 2.0 2039 woodard-rd san-jose
  santa-clara-county bay-area)
 (7891 andiamo-pizza pizza 2.0 135 w-santa-clara-st san-jose
  santa-clara-county bay-area)
 (7892 angies-pizza pizza 2.0 1535 s-winchester-blvd san-jose
  santa-clara-county bay-area)
 (7893 babes-pizza pizza 1.7 4126 monterey-hwy san-jose
  santa-clara-county bay-area)
 (7894 babes-pizza pizza 1.7 2074 lincoln-ave-no.-f san-jose
  santa-clara-county bay-area)
 (7895 bake-me-pizza pizza 2.0 5175 moorpark-ave-no.-4b san-jose
  santa-clara-county bay-area)
 (7896 bogeys-pizza pizza 3.5 5039 almaden-expy san-jose
  santa-clara-county bay-area)
 (7897 bravo-pizza pizza 2.0 1655 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (7898 checkers-pizza pizza 2.0 4157 hamilton-ave san-jose
  santa-clara-county bay-area)
 (7899 dominos-pizza pizza 2.0 3853 x7-trees-blvd san-jose
  santa-clara-county bay-area)
 (7900 dominos-pizza pizza 2.0 576 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (7901 dominos-pizza pizza 2.0 2648 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (7902 dominos-pizza pizza 2.0 1909 tully-rd san-jose
  santa-clara-county bay-area)
 (7903 dominos-pizza pizza 2.0 1080 blossom-hill-rd-no.-e san-jose
  santa-clara-county bay-area)
 (7904 dominos-pizza pizza 3.0 6175 santa-teresa-blvd san-jose
  santa-clara-county bay-area)
 (7905 dominos-pizza pizza 2.0 1558 ambergrove-dr san-jose
  santa-clara-county bay-area)
 (7906 f-p-d-pizza pizza 2.0 1387 mcquesten-dr-no.-a san-jose
  santa-clara-county bay-area)
 (7907 fast-pizza-delivery pizza 2.0 5251 camden-ave-no.-e san-jose
  santa-clara-county bay-area)
 (7908 fast-pizza-delivery pizza 2.0 459 s-capitol-ave-ste-9 san-jose
  santa-clara-county bay-area)
 (7909 fokos-pizza pizza 2.0 244 race-st san-jose santa-clara-county
  bay-area)
 (7910 fpd-pizza pizza 2.0 461 blossom-hill-rd-no.-b san-jose
  santa-clara-county bay-area)
 (7911 gatsbys-pizza pizza 2.0 2845 meridian-ave-no.-a san-jose
  santa-clara-county bay-area)
 (7912 giovannis-pizza pizza 2.0 1211 park-ave-ste-214 san-jose
  santa-clara-county bay-area)
 (7913 giovannis-pizzeria pizza 2.0 5750 orchard-park-dr san-jose
  santa-clara-county bay-area)
 (7914 gitis-pizza pizza 2.0 1476 fruitdale-ave san-jose
  santa-clara-county bay-area)
 (7915 golden-mushroom-pizzeria pizza 2.0 754 almeria-dr san-jose
  santa-clara-county bay-area)
 (7916 golden-mushroom-pizzeria pizza 2.0 3469 mckee-rd san-jose
  santa-clara-county bay-area)
 (7917 golden-nugget-pizza pizza 2.0 1631 e-capitol-expy san-jose
  santa-clara-county bay-area)
 (7918 grande-pizzeria pizza 2.7 150 e-san-carlos-st san-jose
  santa-clara-county bay-area)
 (7919 hangar-one-pizzeria pizza 2.0 851 clearview-dr san-jose
  santa-clara-county bay-area)
 (7920 high-five-pizza pizza 3.6 171 branham-ln-ste-1 san-jose
  santa-clara-county bay-area)
 (7921 johnies-pizza pizza 2.0 120 e-san-carlos-st san-jose
  santa-clara-county bay-area)
 (7922 king-pizza pizza 2.0 1848 story-rd san-jose santa-clara-county
  bay-area)
 (7923 klondikes-pizza pizza 2.0 6081 meridian-ave-no.-a san-jose
  santa-clara-county bay-area)
 (7924 klondikes-pizza pizza 2.0 2769 el-monte-way san-jose
  santa-clara-county bay-area)
 (7925 klondikes-pizza pizza 3.0 2815 s-white-rd san-jose
  santa-clara-county bay-area)
 (7926 kukars-house-of-pizza pizza 2.0 527 s-almaden-ave san-jose
  santa-clara-county bay-area)
 (7927 little-caesar pizza 2.0 7042 santa-teresa-blvd san-jose
  santa-clara-county bay-area)
 (7928 little-caesars-pizza pizza 2.0 2811 story-rd-no.-b san-jose
  santa-clara-county bay-area)
 (7929 little-caesars pizza 2.0 6352 benzo-dr san-jose
  santa-clara-county bay-area)
 (7930 little-caesars-pizza pizza 2.0 4025 senter-rd san-jose
  santa-clara-county bay-area)
 (7931 little-caesars-pizza pizza 2.0 1179 branham-ln san-jose
  santa-clara-county bay-area)
 (7932 little-caesars-pizza pizza 2.0 1659 branham-ln-no.-g san-jose
  santa-clara-county bay-area)
 (7933 little-caesars-pizza pizza 2.0 1809 e-capitol-expy san-jose
  santa-clara-county bay-area)
 (7934 little-caesars-pizza pizza 2.0 2160 constitution-dr san-jose
  santa-clara-county bay-area)
 (7935 little-caesars-pizza pizza 2.0 1712 meridian-ave san-jose
  santa-clara-county bay-area)
 (7936 little-caesars-pizza pizza 2.0 3085 mckee-rd san-jose
  santa-clara-county bay-area)
 (7937 little-caesars-pizza pizza 2.0 1306 s-winchester-blvd-no.-711
  san-jose santa-clara-county bay-area)
 (7938 little-caesars-pizza pizza 2.0 1047 saratoga-sunnyvale-rd-no.-b
  san-jose santa-clara-county bay-area)
 (7939 little-caesars-pizza pizza 2.0 1590 oakland-rd-no.-b-108
  san-jose santa-clara-county bay-area)
 (7940 little-caesars-pizza pizza 2.0 976 lundy-ave san-jose
  santa-clara-county bay-area)
 (7941 mama-mia-pizza-pasta pizza 2.0 5679 snell-ave-no.-d san-jose
  santa-clara-county bay-area)
 (7942 marco-polo-pizzeria pizza 2.0 851 clearview-dr san-jose
  santa-clara-county bay-area)
 (7943 mojash-straw-hat-pizza pizza 2.0 418 w-capitol-expy san-jose
  santa-clara-county bay-area)
 (7944 mountain-mikes-pizza pizza 2.0 900 branham-ln san-jose
  santa-clara-county bay-area)
 (7945 mountain-mikes-pizza pizza 2.0 6191 santa-teresa-blvd san-jose
  santa-clara-county bay-area)
 (7946 mountain-mikes-pizza pizza 2.7 393 n-capitol-ave san-jose
  santa-clara-county bay-area)
 (7947 mountain-mikes-pizza-of-blosso pizza 2.0 431 blossom-hill-rd
  san-jose santa-clara-county bay-area)
 (7948 pizza-&-pipes-seattle pizza 2.0 2285 mckee-rd san-jose
  santa-clara-county bay-area)
 (7949 pizza-a-go-go pizza 2.7 135 w-santa-clara-st san-jose
  santa-clara-county bay-area)
 (7950 pizza-fresh pizza 2.0 1773 hillsdale-ave san-jose
  santa-clara-county bay-area)
 (7951 pizza-hut pizza 2.0 52 keyes-st san-jose santa-clara-county
  bay-area)
 (7952 pizza-hut pizza 2.0 190 e-santa-clara-st san-jose
  santa-clara-county bay-area)
 (7953 pizza-hut pizza 2.0 4605 cherry-ave san-jose santa-clara-county
  bay-area)
 (7954 pizza-hut pizza 2.0 1532 branham-ln san-jose santa-clara-county
  bay-area)
 (7955 pizza-hut pizza 2.0 5689 cottle-rd san-jose santa-clara-county
  bay-area)
 (7956 pizza-hut pizza 2.0 5475 snell-ave san-jose santa-clara-county
  bay-area)
 (7957 pizza-hut pizza 2.0 199 race-st san-jose santa-clara-county
  bay-area)
 (7958 pizza-hut pizza 2.0 3094 story-rd san-jose santa-clara-county
  bay-area)
 (7959 pizza-hut pizza 2.0 700 s-winchester-blvd san-jose
  santa-clara-county bay-area)
 (7960 pizza-hut pizza 2.0 3245 sierra-rd-no.-a san-jose
  santa-clara-county bay-area)
 (7961 pizza-jacks pizza 2.0 1468 s-1st-st san-jose santa-clara-county
  bay-area)
 (7962 pizza-lover pizza 2.0 6084 springer-way san-jose
  santa-clara-county bay-area)
 (7963 pizza-my-dear pizza 2.0 0 unknown san-jose santa-clara-county
  bay-area)
 (7964 pizza-peddler pizza 2.0 0 unknown san-jose santa-clara-county
  bay-area)
 (7965 premier-pizza pizza 3.0 670 river-oaks-pky-no.-a san-jose
  santa-clara-county bay-area)
 (7966 pronto-pizzeria pizza 2.0 0 unknown san-jose santa-clara-county
  bay-area)
 (7967 renato-king-of-the-pizza pizza 2.3 1711 mckee-rd-no.-h san-jose
  santa-clara-county bay-area)
 (7968 roma-pizza pizza 2.0 2852 alum-rock-ave san-jose
  santa-clara-county bay-area)
 (7969 round-table-pizza pizza 2.0 2351 mckee-rd san-jose
  santa-clara-county bay-area)
 (7970 round-table-pizza pizza 2.0 3253 stevens-creek-blvd san-jose
  santa-clara-county bay-area)
 (7971 round-table-pizza pizza 2.7 6217 santa-teresa-blvd san-jose
  santa-clara-county bay-area)
 (7972 round-table-pizza pizza 2.0 6857 castlerock-dr san-jose
  santa-clara-county bay-area)
 (7973 round-table-pizza pizza 2.0 1015 e-capitol-expy san-jose
  santa-clara-county bay-area)
 (7974 round-table-pizza pizza 2.0 6075 snell-ave san-jose
  santa-clara-county bay-area)
 (7975 round-table-pizza pizza 2.0 5440 thornwood-dr-no.-a san-jose
  santa-clara-county bay-area)
 (7976 round-table-pizza pizza 2.0 5385 camden-ave san-jose
  santa-clara-county bay-area)
 (7977 round-table-pizza pizza 2.0 1175 lincoln-ave san-jose
  santa-clara-county bay-area)
 (7978 round-table-pizza pizza 2.0 1125 s-bascom-ave san-jose
  santa-clara-county bay-area)
 (7979 round-table-pizza pizza 2.0 4302 moorpark-ave san-jose
  santa-clara-county bay-area)
 (7980 round-table-pizza pizza 2.0 6138 bollinger-rd san-jose
  santa-clara-county bay-area)
 (7981 round-table-pizza pizza 2.0 2075 bering-dr-ste-a san-jose
  santa-clara-county bay-area)
 (7982 round-table-pizza pizza 2.0 2075 bering-dr-no.-a san-jose
  santa-clara-county bay-area)
 (7983 round-table-pizza pizza 2.0 2075 bering-dr-ste-a san-jose
  santa-clara-county bay-area)
 (7984 round-table-pizza pizza 2.0 2075 bering-dr-no.-a san-jose
  santa-clara-county bay-area)
 (7985 round-table-pizza pizza 2.0 2075 bering-dr-ste-a san-jose
  santa-clara-county bay-area)
 (7986 round-table-pizza pizza 1.7 3212 s-white-rd san-jose
  santa-clara-county bay-area)
 (7987 round-table-restaurant pizza 2.0 2129 morrill-ave san-jose
  santa-clara-county bay-area)
 (7988 roundtable-pizza pizza 2.0 1159 redmond-ave san-jose
  santa-clara-county bay-area)
 (7989 roundtable-pizza pizza 2.0 6902 almaden-expy-no.-d san-jose
  santa-clara-county bay-area)
 (7990 showbiz-pizza-time pizza 2.0 1371 kooser-rd san-jose
  santa-clara-county bay-area)
 (7991 star-pizza pizza 2.0 1130 lucretia-ave-no.-e san-jose
  santa-clara-county bay-area)
 (7992 star-pizza pizza 2.0 124 blossom-hill-rd-ste-b san-jose
  santa-clara-county bay-area)
 (7993 stortis-pizzaria pizza 2.0 1391 ridgewood-dr san-jose
  santa-clara-county bay-area)
 (7994 straw-hat-pizza pizza 2.0 1535 meridian-ave san-jose
  santa-clara-county bay-area)
 (7995 stuft-pizza pizza 2.3 5965 almaden-expy san-jose
  santa-clara-county bay-area)
 (7996 stuft-pizza pizza 2.0 5631 cottle-rd san-jose santa-clara-county
  bay-area)
 (7997 stuft-pizza pizza 2.0 49 n-33rd-st san-jose santa-clara-county
  bay-area)
 (7998 stuft-pizza pizza 2.0 1089 saratoga-sunnyvale-rd san-jose
  santa-clara-county bay-area)
 (7999 t-birds-of-san-jose pizza 2.7 2029 camden-ave san-jose
  santa-clara-county bay-area)
 (8000 the-leaning-tower-pizza pizza 2.0 2618 union-ave san-jose
  santa-clara-county bay-area)
 (8001 the-pepper-tree-pizza-company pizza 2.0 1275 piedmont-rd
  san-jose santa-clara-county bay-area)
 (8002 the-pizza-box pizza 2.0 2649 senter-rd san-jose
  santa-clara-county bay-area)
 (8003 the-pizza-box pizza 2.0 148 s-jackson-ave san-jose
  santa-clara-county bay-area)
 (8004 the-pizza-house pizza 2.0 1814 hillsdale-ave-no.-d san-jose
  santa-clara-county bay-area)
 (8005 tony-&-fred-pizza pizza 3.2 5304 monterey-hwy san-jose
  santa-clara-county bay-area)
 (8006 tony-di-maggio-pizza pizza 3.0 3852 monterey-hwy san-jose
  santa-clara-county bay-area)
 (8007 tony-romas pizza 2.3 4233 moorpark-ave san-jose
  santa-clara-county bay-area)
 (8008 toot-n-totem-pizza pizza 2.7 1080 saratoga-ave-ste-1 san-jose
  santa-clara-county bay-area)
 (8009 u-bake-pizza pizza 2.0 2590 s-bascom-ave-no.-a san-jose
  santa-clara-county bay-area)
 (8010 u-bake-pizza pizza 2.0 2590 s-bascom-ave-no.-a san-jose
  santa-clara-county bay-area)
 (8011 willow-street-wood-fired-pizza pizza 3.4 1072 willow-st san-jose
  santa-clara-county bay-area)
 (8012 angelinas-pizza-&-cafe pizza 2.0 485 e-14th-st san-leandro
  alameda-county bay-area)
 (8013 dominos-pizza pizza 2.0 1768 e-14th-st san-leandro
  alameda-county bay-area)
 (8014 dominos-pizza pizza 2.0 16308 e-14th-st san-leandro
  alameda-county bay-area)
 (8015 little-caesar-enterprises-inc pizza 2.0 1356 fairmont-dr
  san-leandro alameda-county bay-area)
 (8016 mr-pizza pizza 2.0 15253 hesperian-blvd-no.-2 san-leandro
  alameda-county bay-area)
 (8017 mr-pizza pizza 2.0 15253 hesperian-blvd-no.-b2 san-leandro
  alameda-county bay-area)
 (8018 pee-wees-pizzeria pizza 2.0 2198 e-14th-st san-leandro
  alameda-county bay-area)
 (8019 pompo-doris-pizza pizza 2.0 1517 virginia-st san-leandro
  alameda-county bay-area)
 (8020 porkys-pizza-palace pizza 2.4 1221 manor-blvd san-leandro
  alameda-county bay-area)
 (8021 round-table-pizza pizza 2.0 13700 doolittle-dr san-leandro
  alameda-county bay-area)
 (8022 round-table-pizza pizza 2.0 1359 washington-ave san-leandro
  alameda-county bay-area)
 (8023 sergios-pizzeria pizza 2.0 1258 davis-st san-leandro
  alameda-county bay-area)
 (8024 straw-hat pizza 1.7 14680 washington-ave san-leandro
  alameda-county bay-area)
 (8025 the-big-cheese pizza 2.0 2194 edison-ave-ste-l san-leandro
  alameda-county bay-area)
 (8026 uncle-bens-pizza-&-donuts pizza 2.0 16240 blvd san-leandro
  alameda-county bay-area)
 (8027 dominos-pizza pizza 2.0 1269 bockman-rd san-lorenzo
  alameda-county bay-area)
 (8028 fresh-pizza pizza 2.0 15813 channel-st san-lorenzo
  alameda-county bay-area)
 (8029 italian-pizza pizza 2.0 15812 hesperian-blvd san-lorenzo
  alameda-county bay-area)
 (8030 little-caesars pizza 2.0 17900 hesperian-blvd san-lorenzo
  alameda-county bay-area)
 (8031 new-york-pizza pizza 2.0 39 e-lewelling-blvd san-lorenzo
  alameda-county bay-area)
 (8032 pizza-hut pizza 2.0 15922 hesperian-blvd san-lorenzo
  alameda-county bay-area)
 (8033 dominos-pizza pizza 2.0 14020 columbet-ave san-martin
  santa-clara-county bay-area)
 (8034 aldos-pizza pizza 3.0 600 s-norfolk-st san-mateo
  san-mateo-county bay-area)
 (8035 aldos-pizza pizza 3.0 35 laurie-meadows-dr. san-mateo
  san-mateo-county bay-area)
 (8036 amicis-east-coast-pizzeria pizza 3.9 69 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (8037 aziza-pizza-cafe pizza 2.0 440 s-norfolk-st-no.-221 san-mateo
  san-mateo-county bay-area)
 (8038 di-napoli-pizza pizza 2.0 15 n-kingston-st san-mateo
  san-mateo-county bay-area)
 (8039 dominos-pizza pizza 2.0 320 s-b-st san-mateo san-mateo-county
  bay-area)
 (8040 jacks-brick-fournos-pizza pizza 2.0 212 x2nd-ave san-mateo
  san-mateo-county bay-area)
 (8041 jacks-brick-fournos-pizza pizza 2.3 770 polhemus-rd san-mateo
  san-mateo-county bay-area)
 (8042 little-caesars-pizza pizza 2.3 4060 s-el-camino-real-no.-e
  san-mateo san-mateo-county bay-area)
 (8043 north-beach-pizza pizza 3.0 240 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (8044 original-nicks-pizza-&-grill pizza 2.3 1214 s-el-camino-real
  san-mateo san-mateo-county bay-area)
 (8045 rainbow-pizza pizza 3.4 112 crystal-springs-shop-ctr san-mateo
  san-mateo-county bay-area)
 (8046 sky-box-pizza pizza 2.3 61 x43rd-ave san-mateo san-mateo-county
  bay-area)
 (8047 straw-hat-pizza pizza 2.0 372 hillsdale-mall san-mateo
  san-mateo-county bay-area)
 (8048 cybelles-pizza pizza 2.0 13501 san-pablo-ave-ste-e san-pablo
  contra-costa-county bay-area)
 (8049 little-caesars-pizza pizza 2.0 2250 broadway san-pablo
  contra-costa-county bay-area)
 (8050 old-san-francisco-pizza pizza 2.0 2325 rd san-pablo
  contra-costa-county bay-area)
 (8051 pizza-hut pizza 2.0 14501 san-pablo-ave san-pablo
  contra-costa-county bay-area)
 (8052 straw-hat-pizza pizza 2.0 503 san-pablo-towne-ctr san-pablo
  contra-costa-county bay-area)
 (8053 lamppost-pizza pizza 2.0 2626 meadow-glen-dr san-ramon
  contra-costa-county bay-area)
 (8054 little-caesars pizza 2.0 2551 san-ramon-valley-blvd-no.104
  san-ramon contra-costa-county bay-area)
 (8055 little-ceasars pizza 2.0 2551 san-ramon-valley-blvd san-ramon
  contra-costa-county bay-area)
 (8056 melos-ny-style-pizza/pasta-s pizza 2.0 450 market-pl san-ramon
  contra-costa-county bay-area)
 (8057 pavlos-pizza-&-pasta pizza 2.0 2415 san-ramon-valley-blvd-no.-8
  san-ramon contra-costa-county bay-area)
 (8058 round-table-of-san-ramon pizza 2.0 12149 alcosta-blvd san-ramon
  contra-costa-county bay-area)
 (8059 new-york-pizza pizza 2.0 2468 san-ramon-valley-blvd san-ramon
  contra-costa-county bay-area)
 (8060 capns-galley-pizza-&-pipes pizza 2.0 3581 homestead-rd
  santa-clara santa-clara-county bay-area)
 (8061 dominos-pizza pizza 2.0 3207 cabrillo-ave santa-clara
  santa-clara-county bay-area)
 (8062 duffers-pizza pizza 3.7 2000 newhall-st santa-clara
  santa-clara-county bay-area)
 (8063 f-p-d-pizza pizza 2.0 3436 el-camino-real santa-clara
  santa-clara-county bay-area)
 (8064 four-star-pizza pizza 2.0 2943 benton-st santa-clara
  santa-clara-county bay-area)
 (8065 golden-mushroom-pizzeria pizza 2.7 202 saratoga-ave santa-clara
  santa-clara-county bay-area)
 (8066 pizza-&-more pizza 2.3 2325 el-camino-real-no.-104 santa-clara
  santa-clara-county bay-area)
 (8067 pizza-chicago pizza 4.2 1576 halford-ave santa-clara
  santa-clara-county bay-area)
 (8068 pizza-depot-delivery pizza 2.0 2635 french-st santa-clara
  santa-clara-county bay-area)
 (8069 pizza-hut pizza 2.0 3568 homestead-rd santa-clara
  santa-clara-county bay-area)
 (8070 pizza-hut pizza 2.0 2695 el-camino-real santa-clara
  santa-clara-county bay-area)
 (8071 round-table-pizza pizza 2.0 2797 park-ave-ste-200 santa-clara
  santa-clara-county bay-area)
 (8072 runway-32-pizzeria pizza 2.0 3384 kenyon-dr santa-clara
  santa-clara-county bay-area)
 (8073 stuft-pizza pizza 3.0 300 bellomy-st santa-clara
  santa-clara-county bay-area)
 (8074 the-pizza-wheel pizza 2.0 3775 lafayette-st santa-clara
  santa-clara-county bay-area)
 (8075 big-js-pizza pizza 3.0 845 almar-ave santa-cruz
  santa-cruz-county bay-area)
 (8076 little-caesars-santa-cruz pizza 2.0 1917 mission-st santa-cruz
  santa-cruz-county bay-area)
 (8077 pizza-amore pizza 2.0 103 cliff-st santa-cruz santa-cruz-county
  bay-area)
 (8078 pizza-hut pizza 2.0 1820 mission-st santa-cruz santa-cruz-county
  bay-area)
 (8079 pizza-my-heart-the-movie pizza 3.0 1116 pacific-ave-no.-b
  santa-cruz santa-cruz-county bay-area)
 (8080 players-pub-&-pizza pizza 2.0 381 soquel-ave santa-cruz
  santa-cruz-county bay-area)
 (8081 round-table-pizza pizza 2.0 3715 portola-dr santa-cruz
  santa-cruz-county bay-area)
 (8082 straw-hat-pizza pizza 2.0 1705 mission-st santa-cruz
  santa-cruz-county bay-area)
 (8083 sunnys-deli-&-pizza pizza 2.0 2222 e-cliff-dr-no.-d santa-cruz
  santa-cruz-county bay-area)
 (8084 tony-&-albas-pizza pizza 2.0 817 soquel-ave santa-cruz
  santa-cruz-county bay-area)
 (8085 little-caesars-pizza pizza 1.7 12840 saratoga-ave saratoga
  santa-clara-county bay-area)
 (8086 little-caesars-pizza pizza 1.7 18572 prospect-rd-no.-a saratoga
  santa-clara-county bay-area)
 (8087 olympic-pizza pizza 2.0 12850 saratoga-sunnyvale-rd saratoga
  santa-clara-county bay-area)
 (8088 round-table-pizza pizza 2.0 18480 prospect-rd saratoga
  santa-clara-county bay-area)
 (8089 round-table-pizza pizza 1.7 12180 saratoga-sunnyvale-rd saratoga
  santa-clara-county bay-area)
 (8090 murphys-pizza pizza 2.7 245 mount-hermon-rd-ste-t scotts-valley
  unknown bay-area)
 (8091 round-table-pizza pizza 2.0 2690 x41st-ave soquel unknown
  bay-area)
 (8092 soquel-village-pizza pizza 2.0 4724 soquel-dr soquel unknown
  bay-area)
 (8093 billyhana-pizza pizza 2.0 615 caliente-dr sunnyvale
  santa-clara-county bay-area)
 (8094 delivery-depot-pizza pizza 2.0 1220 crossman-ave-no.-110
  sunnyvale santa-clara-county bay-area)
 (8095 grand-mom-pizza pizza 2.0 1234 s-wolfe-rd sunnyvale
  santa-clara-county bay-area)
 (8096 gumbas-ii-pizzaria pizza 3.6 176 s-murphy-ave sunnyvale
  santa-clara-county bay-area)
 (8097 italos-pizzeria pizza 2.0 1090 essex-ave sunnyvale
  santa-clara-county bay-area)
 (8098 mother-lode-pizza pizza 2.0 932 e-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (8099 mountain-mikes-pizza pizza 2.0 568 e-el-camino-real-no.-b
  sunnyvale santa-clara-county bay-area)
 (8100 pee-wees-pizzeria pizza 2.0 871 w.-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (8101 pizza-depot pizza 2.0 919 e-duane-ave sunnyvale
  santa-clara-county bay-area)
 (8102 pizza-hut pizza 1.7 1241 w-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (8103 pizza-point-&-pubs pizza 2.0 1018 w-washington-ave sunnyvale
  santa-clara-county bay-area)
 (8104 round-table-pizza pizza 1.8 860 old-san-francisco-rd sunnyvale
  santa-clara-county bay-area)
 (8105 shakeys-pizza-parlor-sunnyvale pizza 1.7 1066 e-el-camino-real
  sunnyvale santa-clara-county bay-area)
 (8106 straw-hat-pizza pizza 2.0 1291 s-mary-ave sunnyvale
  santa-clara-county bay-area)
 (8107 vitos-pizza pizza 4.0 1155 reed-ave sunnyvale santa-clara-county
  bay-area)
 (8108 lakehouse-pizza pizza 2.0 120 grove-st tahoe-city placer-county
  lake-tahoe)
 (8109 bronco-billys-pizza-palace pizza 2.3 3940 smith-st union-city
  alameda-county bay-area)
 (8110 california-pizza pizza 2.0 32639 alvarado-blvd union-city
  alameda-county bay-area)
 (8111 dominos-pizza pizza 2.0 32106 alvarado-blvd union-city
  alameda-county bay-area)
 (8112 hg-pizza pizza 2.0 1744 decoto-rd union-city alameda-county
  bay-area)
 (8113 hg-pizza pizza 2.0 31852 alvarado-blvd union-city alameda-county
  bay-area)
 (8114 italian-pizzeria pizza 2.0 1830 whipple-rd union-city
  alameda-county bay-area)
 (8115 little-caesar-enterprises-inc pizza 2.0 4116 dyer-st union-city
  alameda-county bay-area)
 (8116 m-&-m-pizza pizza 2.0 117 appian-way union-city alameda-county
  bay-area)
 (8117 marias-pizza-&-italian-kitche pizza 2.7 2617 decoto-rd
  union-city alameda-county bay-area)
 (8118 napoli-pizzeria pizza 2.0 33330 alvarado-niles-rd union-city
  alameda-county bay-area)
 (8119 pizza-hut pizza 2.0 32106 alvarado-blvd union-city
  alameda-county bay-area)
 (8120 straw-hat pizza 2.0 1773 decoto-rd union-city alameda-county
  bay-area)
 (8121 julius-pizza-restaurant pizza 2.0 623 tennessee-st vallejo
  solano-county bay-area)
 (8122 little-caesars-pizza pizza 2.0 1601 marine-world-pky vallejo
  solano-county bay-area)
 (8123 little-caesars-pizza pizza 2.0 2813 redwood-pky vallejo
  solano-county bay-area)
 (8124 murphys-take-&-bake-pizza pizza 2.0 746 admiral-callaghan-ln
  vallejo solano-county bay-area)
 (8125 napoli-pizzeria pizza 3.0 124 tennessee-st vallejo solano-county
  bay-area)
 (8126 pacifica-pizza pizza 2.0 2255 tennessee-st vallejo solano-county
  bay-area)
 (8127 pizza-hut pizza 2.0 5 flemingtown-ctr vallejo solano-county
  bay-area)
 (8128 pizza-hut pizza 2.0 905 broadway vallejo solano-county bay-area)
 (8129 pizza-hut pizza 2.0 2313 springs-rd vallejo solano-county
  bay-area)
 (8130 pizza-king pizza 2.0 1624 fairgrounds-dr vallejo solano-county
  bay-area)
 (8131 pizza-pirate pizza 2.0 972 admiral-callaghan-ln-ste-d vallejo
  solano-county bay-area)
 (8132 round-table-pizza pizza 2.0 4300 sonoma-blvd vallejo
  solano-county bay-area)
 (8133 round-table-pizza pizza 2.0 742 admiral-callaghan-ln vallejo
  solano-county bay-area)
 (8134 round-table-pizza pizza 2.0 2633 springs-rd vallejo
  solano-county bay-area)
 (8135 straw-hat-pizza pizza 2.3 3780 sonoma-blvd vallejo solano-county
  bay-area)
 (8136 vallejo-pizza pizza 2.0 2820 sonoma-blvd vallejo solano-county
  bay-area)
 (8137 vallejo-pizza pizza 2.0 2179 springs-rd-no.-12 vallejo
  solano-county bay-area)
 (8138 viva-italiano-pizza pizza 2.0 1051 caldwell-ave vallejo
  solano-county bay-area)
 (8139 zarduccis-pizza-of-vallejo pizza 2.0 3365 sonoma-blvd-no.-30
  vallejo solano-county bay-area)
 (8140 diablo-pizza pizza 2.0 1569 palos-verdes-mall walnut-creek
  contra-costa-county bay-area)
 (8141 garlex-pizza pizza 2.8 1542 newell-ave walnut-creek
  contra-costa-county bay-area)
 (8142 mt-diablo-pizza pizza 2.0 2521 n-main-st walnut-creek
  contra-costa-county bay-area)
 (8143 mt-diablo-pizza pizza 2.0 2230 oak-grove-rd walnut-creek
  contra-costa-county bay-area)
 (8144 pinkys-pizza-parlor pizza 2.3 1379 s-california-blvd
  walnut-creek contra-costa-county bay-area)
 (8145 pizza-primavera pizza 2.0 2985 n-main-st walnut-creek
  contra-costa-county bay-area)
 (8146 round-table-pizza pizza 2.0 1865 ygnacio-valley-rd walnut-creek
  contra-costa-county bay-area)
 (8147 round-table-pizza pizza 2.0 1302 pine-st walnut-creek
  contra-costa-county bay-area)
 (8148 strictly-to-go-pizzeria pizza 2.0 1630 n-main-st-no.-370
  walnut-creek contra-costa-county bay-area)
 (8149 strictly-to-go-pizzeria pizza 1.7 2670 n-main-st walnut-creek
  contra-costa-county bay-area)
 (8150 viggys-take-&-bake-pizza pizza 2.3 1485 newell-ave walnut-creek
  contra-costa-county bay-area)
 (8151 cassidys-pizza pizza 2.0 1400 freedom-blvd watsonville
  santa-cruz-county bay-area)
 (8152 fox-pizza-&-grill pizza 2.0 254 brookhaven-ln watsonville
  santa-cruz-county bay-area)
 (8153 little-caesars pizza 2.0 1504 freedom-blvd watsonville
  santa-cruz-county bay-area)
 (8154 luigis-pizza pizza 2.0 1075 main-st watsonville
  santa-cruz-county bay-area)
 (8155 luigis-pizza-&-pasta pizza 2.0 1075 main-st watsonville
  santa-cruz-county bay-area)
 (8156 mountain-mike-pizza pizza 2.0 1417 freedom-blvd watsonville
  santa-cruz-county bay-area)
 (8157 mountain-mikes-pizza pizza 2.0 0 unknown watsonville
  santa-cruz-county bay-area)
 (8158 pizza-hut pizza 2.0 1477 freedom-blvd watsonville
  santa-cruz-county bay-area)
 (8159 pizzamia pizza 2.0 948 mckenzie-st watsonville santa-cruz-county
  bay-area)
 (8160 stuft-pizza pizza 2.0 1984 main-st watsonville santa-cruz-county
  bay-area)
 (8161 runway-32-pizza pizza 2.3 0 blvd fremont alameda-county
  bay-area)
 (8162 eagle-pizza pizza 2.5 1722 taraval-st san-francisco
  san-francisco-county bay-area)
 (8163 sierra-sams-pizza pizza 3.0 568 e.-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (8164 davinos pizza 2.3 0 morello-and-taylor pleasant-hill
  contra-costa-county bay-area)
 (8165 hampton-hills-pizza pizza 2.0 878 southampton-rd benicia
  solano-county bay-area)
 (8166 benissimo-ristorante-pizzeria pizza 2.7 18 tamalpais-dr
  corte-madera marin-county bay-area)
 (8167 daddyos-pizza pizza 2.7 7665 old-redwood-hwy cotati
  sonoma-county bay-area)
 (8168 pizza-gourmet pizza 3.3 7530 commerce-blvd cotati sonoma-county
  bay-area)
 (8169 professors-pizza pizza 2.0 1025 weyand-way dixon solano-county
  bay-area)
 (8170 sandys-pizza-take-&-bake pizza 2.0 6544 front-st forestville
  sonoma-county bay-area)
 (8171 spanckys-pizza pizza 2.0 6484 mirabel-rd forestville
  sonoma-county bay-area)
 (8172 gray-whale-pub-&-pizzeria pizza 2.0 12781 sir-francis-drake-blvd
  inverness marin-county bay-area)
 (8173 stefanos-pizzeria pizza 2.3 8 e-blithedale-ave mill-valley
  marin-county bay-area)
 (8174 luigis-pizzeria-north pizza 2.0 1517 x3rd-st napa napa-county
  napa-valley)
 (8175 luigis-pizzeria-north pizza 2.0 4084 byway-st napa napa-county
  napa-valley)
 (8176 papa-joes-pizza pizza 2.0 0 stre---1040-clinton-st napa
  napa-county napa-valley)
 (8177 sandys-take-&-bake-pizza pizza 2.0 1851 old-sonoma-rd napa
  napa-county napa-valley)
 (8178 stefanos-pizzeria pizza 2.0 5420 nave-dr novato marin-county
  bay-area)
 (8179 daddyos-pizza pizza 2.0 706 e-washington-st petaluma
  sonoma-county bay-area)
 (8180 la-vera-pizza pizza 2.0 840 petaluma-blvd-n petaluma
  sonoma-county bay-area)
 (8181 little-caesars-pizza pizza 2.0 231 n-mcdowell-blvd petaluma
  sonoma-county bay-area)
 (8182 marys-pizza-shack-delivery pizza 2.0 501 lakeville petaluma
  sonoma-county bay-area)
 (8183 marys-pizza-shack-restaurants pizza 2.0 359 e-washington-st
  petaluma sonoma-county bay-area)
 (8184 new-yorker-pizza-&-restaurant-the pizza 2.0 3 petaluma-blvd-n
  petaluma sonoma-county bay-area)
 (8185 old-chicago-pizza-delivery pizza 2.0 291 mc-dowell-bl petaluma
  sonoma-county bay-area)
 (8186 old-chicago-plzza pizza 3.2 41 petaluma-blvd-n petaluma
  sonoma-county bay-area)
 (8187 pinkys-pizza-parlors pizza 2.0 321 petaluma-boulevard petaluma
  sonoma-county bay-area)
 (8188 pizza-gourmet pizza 2.0 1415 fulton-rd petaluma sonoma-county
  bay-area)
 (8189 red-boy-pizza pizza 2.0 1420 s-mcdowell-blvd petaluma
  sonoma-county bay-area)
 (8190 romeos-sourdough-pizza-&-pasta pizza 2.0 239 s-mcdowell-blvd
  petaluma sonoma-county bay-area)
 (8191 tatos-pizza-plus-delivery pizza 2.0 1060 petaluma-blvd-n
  petaluma sonoma-county bay-area)
 (8192 all-star-pizza-&-pasta pizza 2.0 1451 southwest-blvd
  rohnert-park sonoma-county bay-area)
 (8193 cybelles-pizza-&-sports-bar pizza 2.0 10 enterprise-dr
  rohnert-park sonoma-county bay-area)
 (8194 little-caesars-pizza pizza 2.0 6585 commerce-blvd rohnert-park
  sonoma-county bay-area)
 (8195 marys-pizza-shack-delivery pizza 2.0 101 golf-course-dr
  rohnert-park sonoma-county bay-area)
 (8196 marys-pizza-shack-restaurants pizza 2.0 101 golf-course-dr
  rohnert-park sonoma-county bay-area)
 (8197 lo-cocos-pizzeria pizza 2.0 631 del-ganado-rd san-rafael
  marin-county bay-area)
 (8198 mulberry-street-pizzeria pizza 3.0 101 smith-ranch-rd san-rafael
  marin-county bay-area)
 (8199 stefanos-pizzeria pizza 2.0 3815 redwood-hwy san-rafael
  marin-county bay-area)
 (8200 villa-romana-pizzeria-&-restaurant pizza 2.0 901 b-st san-rafael
  marin-county bay-area)
 (8201 bennett-valley-pizza pizza 2.0 2700 yulupa-ave santa-rosa
  sonoma-county bay-area)
 (8202 borolos-gourmet-pizza pizza 2.0 500 mission-blvd santa-rosa
  sonoma-county bay-area)
 (8203 bull-moose-saloon-&-pizza-co pizza 2.0 1529 farmers-ln
  santa-rosa sonoma-county bay-area)
 (8204 checkers-pizza-&-frozen-yogurt pizza 2.0 0 unknown santa-rosa
  sonoma-county bay-area)
 (8205 igbees-pizza pizza 2.0 0 unknown santa-rosa sonoma-county
  bay-area)
 (8206 la-vera-pizza pizza 2.0 629 x4th-st santa-rosa sonoma-county
  bay-area)
 (8207 little-caesar-pizzeria pizza 2.0 1940 pine-rd santa-rosa
  sonoma-county bay-area)
 (8208 little-caesars-pizza pizza 2.0 1169 yulupa-ave santa-rosa
  sonoma-county bay-area)
 (8209 little-caesars-pizza pizza 2.0 400 w-3d santa-rosa sonoma-county
  bay-area)
 (8210 marys-pizza-shack-restaurants pizza 2.0 3084 marlow-rd
  santa-rosa sonoma-county bay-area)
 (8211 marys-pizza-shack-restaurants pizza 2.0 535 summerfield-rd
  santa-rosa sonoma-county bay-area)
 (8212 murphys-pizza-take-&-bake pizza 2.0 140 calistoga-rd santa-rosa
  sonoma-county bay-area)
 (8213 murphys-pizza-take-&-bake pizza 2.0 2101 w-college-ave
  santa-rosa sonoma-county bay-area)
 (8214 murphys-pizza-take-&-bake pizza 2.0 424 larkfield-ctr santa-rosa
  sonoma-county bay-area)
 (8215 papa-la-grandes-pizza pizza 2.0 3660 stony-point-rd santa-rosa
  sonoma-county bay-area)
 (8216 papas-fresh-pizza pizza 2.0 1880 mendocino-ave santa-rosa
  sonoma-county bay-area)
 (8217 pizza-experience pizza 2.0 2765 yulupa-ave santa-rosa
  sonoma-county bay-area)
 (8218 pizza-gourmet pizza 2.0 1415 fulton-rd santa-rosa sonoma-county
  bay-area)
 (8219 pizza-world pizza 2.0 1007 w-college-ave santa-rosa
  sonoma-county bay-area)
 (8220 roses-pizza-&-pub pizza 2.0 2478 w-3d santa-rosa sonoma-county
  bay-area)
 (8221 sandys-take-&-bake-pizza pizza 2.0 0 &-country-shopping-center
  santa-rosa sonoma-county bay-area)
 (8222 sesame-pizza pizza 2.0 1774 piner-rd santa-rosa sonoma-county
  bay-area)
 (8223 darios-pizza-restaurant pizza 2.5 2829 bridgeway sausalito
  unknown bay-area)
 (8224 giovannis-pizzeria pizza 2.0 629 bridgeway sausalito unknown
  bay-area)
 (8225 marys-pizza-shack-restaurants pizza 2.0 790 gravenstein-hwy-n
  sebastopol sonoma-county bay-area)
 (8226 papas-fresh-pizza pizza 2.0 779 gravenstein-highway sebastopol
  sonoma-county bay-area)
 (8227 pizza-plus pizza 2.0 177 pleasant-hill-ave-n sebastopol
  sonoma-county bay-area)
 (8228 capri-pizzeria pizza 2.0 1266 broadway sonoma sonoma-county
  bay-area)
 (8229 grammas-pizza pizza 2.0 19213 sonoma-hwy sonoma sonoma-county
  bay-area)
 (8230 marys-pizza-shack-delivery pizza 2.0 452 st sonoma sonoma-county
  bay-area)
 (8231 marys-pizza-shack-restaurants pizza 2.0 452 st sonoma
  sonoma-county bay-area)
 (8232 marys-pizza-shack pizza 2.0 18636 sonoma-hwy sonoma
  sonoma-county bay-area)
 (8233 pizzeria-capri pizza 2.0 1266 broadway sonoma sonoma-county
  bay-area)
 (8234 sonoma-pizza pizza 2.0 461 st sonoma sonoma-county bay-area)
 (8235 oly-oops-pizza-&-pasta-extrav pizza 2.0 4300 central-way
  suisun-city solano-county bay-area)
 (8236 rods-pizza pizza 2.0 104 sunset-ave suisun-city solano-county
  bay-area)
 (8237 stagecoach-pizza pizza 2.0 3045 alamo-dr vacaville solano-county
  bay-area)
 (8238 armadillo-pizza-of-vallejo pizza 2.0 333 tennessee-st vallejo
  solano-county bay-area)
 (8239 pizza-pirate pizza 2.0 972 admiral-callaghan-ln vallejo
  solano-county bay-area)
 (8240 regal-pizza pizza 2.0 2564 springs-rd vallejo solano-county
  bay-area)
 (8241 showbiz-pizza-place pizza 2.0 235 larwin-plz vallejo
  solano-county bay-area)
 (8242 tonys-pizza pizza 2.0 2907 sonoma-blvd vallejo solano-county
  bay-area)
 (8243 village-pizza pizza 2.0 0 unknown vallejo solano-county
  bay-area)
 (8244 balboa-pizza-restaurant pizza 2.0 3528 balboa-st san-francisco
  san-francisco-county bay-area)
 (8245 bambinos-pizza-restaurant pizza 2.0 945 cole-st san-francisco
  san-francisco-county bay-area)
 (8246 california-pizza-restaurant pizza 2.0 1534 california-st
  san-francisco san-francisco-county bay-area)
 (8247 columbus-pizza-restaurant pizza 2.0 314 columbus-ave
  san-francisco san-francisco-county bay-area)
 (8248 cybelles-pizza-restaurants pizza 2.0 975
  bryant-at-the-great-entertai san-francisco san-francisco-county
  bay-area)
 (8249 cybelles-plzza-restaurants pizza 2.0 203 parnassus-ave
  san-francisco san-francisco-county bay-area)
 (8250 cybelles-plzza-restaurants pizza 2.7 0 unknown san-francisco
  san-francisco-county bay-area)
 (8251 cybelles-plzza-restaurants pizza 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (8252 cybelles-pizza-restaurants pizza 2.0 1000 bush-st san-francisco
  san-francisco-county bay-area)
 (8253 cybelles-pizza-restaurants pizza 2.0 2105 chestnut-st
  san-francisco san-francisco-county bay-area)
 (8254 gaspare-pizza-house-&-restaurant pizza 2.0 5546 geary-blvd
  san-francisco san-francisco-county bay-area)
 (8255 giovannis-pizzeria-restaurant pizza 2.0 3839 mission-st
  san-francisco san-francisco-county bay-area)
 (8256 imperial-pizza-restaurant pizza 2.0 3211 mission-st
  san-francisco san-francisco-county bay-area)
 (8257 ocean-pizza-restaurant pizza 2.0 1443 ocean-ave san-francisco
  san-francisco-county bay-area)
 (8258 papa-doro-pizza-restaurant pizza 2.0 156 powell-st san-francisco
  san-francisco-county bay-area)
 (8259 papa-doro-pizza-restaurant pizza 2.0 1649 haight-st
  san-francisco san-francisco-county bay-area)
 (8260 pasquales-pizzeria-restaurant pizza 2.0 2640 sloat-blvd
  san-francisco san-francisco-county bay-area)
 (8261 pizza-love-restaurant pizza 1.7 1245 folsom-st san-francisco
  san-francisco-county bay-area)
 (8262 t-j-pizza-&-ice-cream-parlor pizza 2.0 2842 diamond-st
  san-francisco san-francisco-county bay-area)
 (8263 three-cheeses-pizza-restaurant pizza 2.0 2340 geary-blvd
  san-francisco san-francisco-county bay-area)
 (8264 victors-pizza-&-restaurant pizza 2.7 1411 polk-st san-francisco
  san-francisco-county bay-area)
 (8265 vinces-pizza-house pizza 2.0 5546 geary-blvd san-francisco
  san-francisco-county bay-area)
 (8266 applewood-pizza pizza 2.7 227 state-st los-altos
  santa-clara-county bay-area)
 (8267 waterfront-pizza pizza 2.7 969 edgewater-blvd. foster-city
  san-mateo-county bay-area)
 (8268 cheese-board-pizza-collective pizza 3.3 1512 shattuck-ave
  berkeley alameda-county bay-area)
 (8269 avanti-pizza-&-pasta pizza 2.7 2040 ralston-avenue belmont
  san-mateo-county bay-area)
 (8270 village-host-pizza pizza 2.7 1017 alameda-de-las-pulgas belmont
  san-mateo-county bay-area)
 (8271 x29th-main-st.-pizza pizza 2.5 29 e.-main-st. los-gatos
  santa-clara-county bay-area)
 (8272 round-table-pizza pizza 2.3 0 unknown los-gatos
  santa-clara-county bay-area)
 (8273 noe-valley-pizza pizza 2.7 24 &-sanchez san-francisco
  san-francisco-county bay-area)
 (8274 marys-pizza-shack pizza 2.3 121 san-marin-drive novato
  marin-county bay-area)
 (8275 sirens pizza 2.5 0 blvd cupertino santa-clara-county bay-area)
 (8276 village-pizzeria pizza 2.7 7 clement san-francisco
  san-francisco-county bay-area)
 (8277 bella-pizza pizza 2.0 4 geary san-francisco san-francisco-county
  bay-area)
 (8278 harbor-pasta-&-pizza-place pizza 2.7 130 harbor-boulevard
  belmont san-mateo-county bay-area)
 (8279 harbor-pasta-&-pizza-place pizza 2.7 130 harbor-boulevard
  belmont san-mateo-county bay-area)
 (8280 dimarcos-pizza-co. pizza 3.0 1532 branham-lane san-jose
  santa-clara-county bay-area)
 (8281 los-gatos-pizza-co. pizza 2.0 14080 blossom-hill-rd. los-gatos
  santa-clara-county bay-area)
 (8282 milano-pizzeria pizza 3.0 1330 x9th-avenue san-francisco
  san-francisco-county bay-area)
 (8283 brothers-pizza pizza 2.7 3627 taraval-st.-46th-ave
  san-francisco san-francisco-county bay-area)
 (8284 frankie-johnny-&-luigi-too! pizza 3.2 11891 dublin-blvd. dublin
  alameda-county bay-area)
 (8285 little-caesars-pizza pizza 2.0 4475 treat-bl. concord
  contra-costa-county bay-area)
 (8286 jakes-of-saratoga-pizza pizza 2.7 0 unknown saratoga
  santa-clara-county bay-area)
 (8287 unos-restaurant-&-bar pizza 2.8 3720 mowry-ave fremont
  alameda-county bay-area)
 (8288 piggys-pizza-&-ribs pizza 3.0 11299 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (8289 pronto pizza 3.0 2560 el-camino-real redwood-city
  san-mateo-county bay-area)
 (8290 marvin-gardens-ale-house-&-grill pizza 3.0 0 unknown belmont
  san-mateo-county bay-area)
 (8291 garlex-pizza-&-ribs pizza 2.0 2566 old-first-st livermore
  alameda-county bay-area)
 (8292 murphys-pizza-take-&-bake pizza 2.0 3030 pacific-avenue
  livermore alameda-county bay-area)
 (8293 nightshade pizza 3.5 2101 sutter san-francisco
  san-francisco-county bay-area)
 (8294 windy-city-pizza pizza 2.8 35 bovet-rd san-mateo
  san-mateo-county bay-area)
 (8295 pronto-pizzeria pizza 2.7 0 at-fremont sunnyvale
  santa-clara-county bay-area)
 (8296 give-pizza-chance pizza 2.7 2660 broadway redwood-city
  san-mateo-county bay-area)
 (8297 marios-pizza-&-restaurant pizza 2.7 861 leong-dr. mountain-view
  santa-clara-county bay-area)
 (8298 best-new-york-pizza pizza 1.7 978 murrieta-blvd livermore
  alameda-county bay-area)
 (8299 lococos-italian-pizzeria pizza 3.0 638 san-anselmo-avenue
  san-anselmo marin-county bay-area)
 (8300 pizzeria-unos pizza 1.6 0 camino-real santa-clara
  santa-clara-county bay-area)
 (8301 mypizza pizza 3.5 229 west-main-avenue morgan-hill
  santa-clara-county bay-area)
 (8302 giovannis-pizzeria pizza 3.5 1127 lawrence-expy sunnyvale
  santa-clara-county bay-area)
 (8303 checkers pizza 2.0 1414 lincoln-ave calistoga napa-county
  napa-valley)
 (8304 skipolinis pizza 3.0 0 &-diablo clayton contra-costa-county
  bay-area)
 (8305 giorgios-pizza-house pizza 4.0 nil nil san-jose
  santa-clara-county bay-area)
 (8306 all-star-pizza pizza 2.7 915 main-st pleasanton alameda-county
  bay-area)
 (8307 city-pizza pizza 2.0 1552 howard-st san-francisco
  san-francisco-county bay-area)
 (8308 old-krakow polish 2.8 385 west-portal san-francisco
  san-francisco-county bay-area)
 (8309 polandeli polish 2.0 2399 broadway redwood-city san-mateo-county
  bay-area)
 (8310 trader-vics polynesian 2.7 9 anchor-way emeryville
  alameda-county bay-area)
 (8311 spud-brothers potatoes 3.2 2412 x9th-st-no.-a berkeley
  alameda-county bay-area)
 (8312 x1-potato-2 potatoes 2.0 0 av-&-mow-sch-rd newark alameda-county
  bay-area)
 (8313 house-of-prime-rib prime-rib 4.4 1906 van-ness-avenue
  san-francisco san-francisco-county bay-area)
 (8314 charley-browns prime-rib 2.5 1890 powell-st. emeryville
  alameda-county bay-area)
 (8315 gullivers prime-rib 2.8 1699 bayshore-hwy. burlingame
  san-mateo-county bay-area)
 (8316 barclays-restaurant-&-pub pub 3.1 5940 college-ave berkeley
  alameda-county bay-area)
 (8317 triple-rock-brewery pub 2.7 4006 granada-rd el-sobrante
  contra-costa-county bay-area)
 (8318 san-andreas-brewing-company pub 3.0 737 san-benito-st hollister
  san-benito-county northern-california)
 (8319 st-james-infirmary pub 2.6 390 moffett-blvd mountain-view
  santa-clara-county bay-area)
 (8320 pacific-coast-brewing-company pub 3.5 906 washington-st oakland
  alameda-county bay-area)
 (8321 gordon-biersch-brewery-restaurant pub 2.7 625 emerson-st
  palo-alto santa-clara-county bay-area)
 (8322 seabright-brewery pub 3.0 0 unknown santa-cruz santa-cruz-county
  bay-area)
 (8323 the-bank pub 3.0 14421 big-basin-way saratoga santa-clara-county
  bay-area)
 (8324 faultline-brewing-company pub 2.8 1235 oakmead-parkway sunnyvale
  santa-clara-county bay-area)
 (8325 the-graduate-food-&-pub pub 2.0 911 e.-morehead charlotte
  unknown unknown)
 (8326 murphys-irish-pub pub 2.0 464 st sonoma sonoma-county bay-area)
 (8327 rudys-bar pub 2.0 117 university-ave palo-alto
  santa-clara-county bay-area)
 (8328 fibbar-magees pub 2.0 156 murphy-st. sunnyvale
  santa-clara-county bay-area)
 (8329 city-pub pub 3.2 0 unknown redwood-city san-mateo-county
  bay-area)
 (8330 the-hopyard pub 3.3 3015 hopyard-rd pleasanton alameda-county
  bay-area)
 (8331 catos-ale-house pub 3.0 3891 piedmont-avenue oakland
  alameda-county bay-area)
 (8332 thirsty-bear-brewing-co pub 2.3 661 howard-st san-francisco
  san-francisco-county bay-area)
 (8333 bear-republic-brewing-co.-inc. pub 2.0 345 healdsburg-avenue
  healdsburg sonoma-county bay-area)
 (8334 liverpool-lils pub 2.0 2942 lyon-st. san-francisco
  san-francisco-county bay-area)
 (8335 rib-shack ribs 1.7 223 el-camino-real san-bruno san-mateo-county
  bay-area)
 (8336 jessies-ribs ribs 2.0 2889 mantis-dr san-jose santa-clara-county
  bay-area)
 (8337 spencers-jambalaya-&-ribs-sho ribs 3.0 5721 cottle-rd san-jose
  santa-clara-county bay-area)
 (8338 ribs-benicia ribs 2.0 129 x1st-st benicia solano-county
  bay-area)
 (8339 eddies-gourmet-cafe ribs 2.3 347 corte-madera-town-ctr
  corte-madera marin-county bay-area)
 (8340 ribs-unlimited-ii ribs 2.0 112 vintage-way novato marin-county
  bay-area)
 (8341 better-burgers-&-ribs ribs 2.0 1475 southwest-blvd rohnert-park
  sonoma-county bay-area)
 (8342 burgers-&-ribs ribs 2.0 1475 southwest-blvd rohnert-park
  sonoma-county bay-area)
 (8343 bobby-rubinos-place-for-ribs ribs 2.7 245 jefferson-st
  san-francisco san-francisco-county bay-area)
 (8344 nob-hill-chicken-&-ribs ribs 2.0 447 stockton-st san-francisco
  san-francisco-county bay-area)
 (8345 robs-rib-shack ribs 2.3 0 drive sonoma sonoma-county bay-area)
 (8346 russian-delicatessens-club russian 2.0 3401 irving san-francisco
  san-francisco-county bay-area)
 (8347 russian-bear russian 2.0 939 clement san-francisco
  san-francisco-county bay-area)
 (8348 russian-samovar russian 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (8349 katias russian 2.7 600 fifth-ave san-francisco
  san-francisco-county bay-area)
 (8350 cafe-intermezzo salads 3.7 2442 telegraph-ave berkeley
  alameda-county bay-area)
 (8351 the-musical-offering salads 2.5 2430 bancroft-way berkeley
  alameda-county bay-area)
 (8352 fresh-choice salads 3.0 1654 s-bascom-ave campbell
  santa-clara-county bay-area)
 (8353 california-salads-bar-&-grill salads 2.0 828 bay-ave capitola
  unknown bay-area)
 (8354 fresh-choice salads 2.0 3555 clares-st-ste-y capitola unknown
  bay-area)
 (8355 fresh-choice salads 2.9 486 sun-valley-mall concord
  contra-costa-county bay-area)
 (8356 fresh-choice salads 2.7 10123 n-wolfe-rd-ste-2104 cupertino
  santa-clara-county bay-area)
 (8357 fresh-choice salads 2.3 555 e-calaveras-blvd milpitas
  santa-clara-county bay-area)
 (8358 toss-it-fresh salads 2.7 0 antonio-road-and-california-st
  mountain-view santa-clara-county bay-area)
 (8359 fresh-choice salads 2.0 1029 newpark-mall newark alameda-county
  bay-area)
 (8360 fresh-choice salads 2.0 379 stanford-shopping-ctr palo-alto
  santa-clara-county bay-area)
 (8361 sweet-tomatoes salads 2.5 4501 hopyard-rd pleasanton
  alameda-county bay-area)
 (8362 fresh-choice salads 2.0 5353 almaden-expy-ste-39-a san-jose
  santa-clara-county bay-area)
 (8363 fresh-choice salads 1.7 1600 saratoga-ave-ste-117 san-jose
  santa-clara-county bay-area)
 (8364 fresh-choice salads 2.0 15 bay-fair-mall san-leandro
  alameda-county bay-area)
 (8365 fresh-choice salads 3.4 1952 s-el-camino-real san-mateo
  san-mateo-county bay-area)
 (8366 fresh-choice salads 2.0 2901 tasman-dr santa-clara
  santa-clara-county bay-area)
 (8367 fresh-choice salads 2.0 2901 tasman-dr-ste-109 santa-clara
  santa-clara-county bay-area)
 (8368 fresh-choice salads 2.6 333 moffett-park-dr sunnyvale
  santa-clara-county bay-area)
 (8369 feedlot salads 2.8 6971 airline-hwy. tres-pinos unknown unknown)
 (8370 cruchons salads 3.6 2599 n-main-st walnut-creek
  contra-costa-county bay-area)
 (8371 fresh-choice salads 2.7 131 corte-madera-town-ctr corte-madera
  marin-county bay-area)
 (8372 fresh-choice salads 2.0 5070 redwood-dr rohnert-park
  sonoma-county bay-area)
 (8373 fresh-choice salads 2.0 1018 santa-rosa-plz santa-rosa
  sonoma-county bay-area)
 (8374 fresh-choice salads 2.8 2250 w-el-camino-real mountain-view
  santa-clara-county bay-area)
 (8375 lakeside-cafe salads 3.0 3160 n.shoreline-blvd. mountain-view
  santa-clara-county bay-area)
 (8376 balonple-cafe salvadorean 2.0 3349 x18th san-francisco
  san-francisco-county bay-area)
 (8377 la-santaneca salvadorean 2.0 3781 mission san-francisco
  san-francisco-county bay-area)
 (8378 la-santaneca-de-la-mission salvadorean 2.0 2815 mission
  san-francisco san-francisco-county bay-area)
 (8379 panchitas-restaurant salvadorean 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (8380 panchitas-restaurant salvadorean 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (8381 panchitas salvadorean 2.0 0 blvd. fremont alameda-county
  bay-area)
 (8382 panchitas-restaurant-no.-4 salvadorean 2.0 3933 washington-blv.
  fremont alameda-county bay-area)
 (8383 grinders sandwiches 2.0 1160 marianas-ln alameda alameda-county
  bay-area)
 (8384 johnathans-sandwich-shop sandwiches 2.8 2321 santa-clara-ave
  alameda alameda-county bay-area)
 (8385 sandwich-board sandwiches 2.0 2412 webb-ave alameda
  alameda-county bay-area)
 (8386 sub-stop sandwiches 2.0 1514 webster-st alameda alameda-county
  bay-area)
 (8387 big-johns-sub-sandwiches sandwiches 2.3 200 way american-canyon
  unknown bay-area)
 (8388 the-philly-station sandwiches 2.0 3440 mountaire-dr antioch
  contra-costa-county bay-area)
 (8389 sandwich-station sandwiches 2.0 685 stone-rd-ste-1 benicia
  solano-county bay-area)
 (8390 cheese-n-stuff sandwiches 2.0 2442 durant-ave berkeley
  alameda-county bay-area)
 (8391 sandwiches-a-go sandwiches 2.0 2456 bancroft-way berkeley
  alameda-county bay-area)
 (8392 soup-kitchen-heike sandwiches 2.0 2498 telegraph-ave berkeley
  alameda-county bay-area)
 (8393 the-cheese-steak-shop sandwiches 2.3 1054 university-ave
  berkeley alameda-county bay-area)
 (8394 togos-eatery sandwiches 2.2 2548 bancroft-way berkeley
  alameda-county bay-area)
 (8395 vickies-sandwich-stop sandwiches 2.7 737 x2nd-st brentwood
  contra-costa-county bay-area)
 (8396 tobys-sandwich-bag sandwiches 2.0 300 orchard-city-dr campbell
  santa-clara-county bay-area)
 (8397 sweet-affair-a sandwiches 2.7 5435 clayton-rd clayton
  contra-costa-county bay-area)
 (8398 scrumpys-sandwich-shop sandwiches 2.0 1035 detroit-ave concord
  contra-costa-county bay-area)
 (8399 terry-ks-sandwich-&-donut-sho sandwiches 2.0 4673 clayton-rd
  concord contra-costa-county bay-area)
 (8400 the-cheese-steak-shop sandwiches 2.7 3478 clayton-rd concord
  contra-costa-county bay-area)
 (8401 cafe-quinn sandwiches 2.5 21269 stevens-creek-blvd-ste-619
  cupertino santa-clara-county bay-area)
 (8402 vivis-deli-sandwiches sandwiches 2.8 21731 stevens-creek-blvd
  cupertino santa-clara-county bay-area)
 (8403 carmelos-sandwich-shop sandwiches 2.0 101 warwick-st daly-city
  san-mateo-county bay-area)
 (8404 the-sandwich-place sandwiches 2.0 305 saint-francis-blvd
  daly-city san-mateo-county bay-area)
 (8405 lets-do-lunch sandwiches 2.7 4592 appian-way el-sobrante
  contra-costa-county bay-area)
 (8406 phillys-chessesteak-&-more sandwiches 2.0 5800 shellmound-st
  emeryville alameda-county bay-area)
 (8407 carries-super-sandwich sandwiches 2.0 4588 peralta-blvd fremont
  alameda-county bay-area)
 (8408 the-cheese-steak-shop sandwiches 2.3 39300 argonaut-way fremont
  alameda-county bay-area)
 (8409 ponderosa-sub-shop sandwiches 2.0 22302 meekland-ave hayward
  alameda-county bay-area)
 (8410 torpedos-subs-by-loretta sandwiches 2.0 22435 santa-clara-st
  hayward alameda-county bay-area)
 (8411 bevo sandwiches 2.0 341 tres-pinos-rd-ste-103-b hollister
  san-benito-county northern-california)
 (8412 stoney-ridge-winery sandwiches 3.4 4948 tesla-rd livermore
  alameda-county bay-area)
 (8413 tosos-salad-&-sandwich-shop sandwiches 2.0 153 turquoise-way
  livermore alameda-county bay-area)
 (8414 the-sandwich-maker sandwiches 2.0 987 university-ave los-gatos
  santa-clara-county bay-area)
 (8415 galaxy-sandwich-shop sandwiches 2.0 260 sunnybrae-dr martinez
  contra-costa-county bay-area)
 (8416 guckenheimer-sandwich-shoppe sandwiches 2.0 300 constitution-dr
  menlo-park san-mateo-county bay-area)
 (8417 guckenheimer-sandwich-shoppe sandwiches 2.0 321 middlefield-rd
  menlo-park san-mateo-county bay-area)
 (8418 abel-sandwiches sandwiches 2.0 1244 s-abel-st milpitas
  santa-clara-county bay-area)
 (8419 dakao-sandwiches sandwiches 2.8 72 s-abel-st milpitas
  santa-clara-county bay-area)
 (8420 serra-sandwich-&-ice-cream-par sandwiches 2.0 200
  serra-way-ste-32 milpitas santa-clara-county bay-area)
 (8421 creative-sandwiches-&-salads sandwiches 2.0 2827 kilburn-ave
  napa napa-county napa-valley)
 (8422 brown-bag-sandwiches sandwiches 2.0 134 x14th-st oakland
  alameda-county bay-area)
 (8423 buongiorno sandwiches 2.0 1226 broadway oakland alameda-county
  bay-area)
 (8424 califorina-cheese-steaks sandwiches 2.0 2214 macarthur-blvd
  oakland alameda-county bay-area)
 (8425 donuts-n-subs sandwiches 2.0 1460 x7th-st oakland alameda-county
  bay-area)
 (8426 house-of-salad sandwiches 2.0 2123 franklin-st oakland
  alameda-county bay-area)
 (8427 lanas-sandwiches sandwiches 2.0 435 x19th-st oakland
  alameda-county bay-area)
 (8428 monami sandwiches 2.3 475 x14th-st-ste-160 oakland
  alameda-county bay-area)
 (8429 sandwich-express sandwiches 2.0 311 x20th-st oakland
  alameda-county bay-area)
 (8430 sandwich-factory sandwiches 2.0 331 x15th-st oakland
  alameda-county bay-area)
 (8431 sandwich-garden sandwiches 2.0 422 x29th-ave oakland
  alameda-county bay-area)
 (8432 sandwich-plus sandwiches 2.0 1626 franklin-st oakland
  alameda-county bay-area)
 (8433 sandwiched-inn sandwiches 2.0 3943 piedmont-ave oakland
  alameda-county bay-area)
 (8434 super-sandwich sandwiches 2.0 1438 broadway oakland
  alameda-county bay-area)
 (8435 the-cheese-steak-shop sandwiches 2.3 3308 lakeshore-ave oakland
  alameda-county bay-area)
 (8436 to-gos-eatery sandwiches 2.0 1221 broadway oakland
  alameda-county bay-area)
 (8437 obriens-sandwich-shop sandwiches 2.0 4 orinda-way-bldg-b orinda
  contra-costa-county bay-area)
 (8438 fog-city-subs sandwiches 2.0 743 hickey-blvd pacifica
  san-mateo-county bay-area)
 (8439 sos-fine-foods-store sandwiches 2.0 949 emerson-st palo-alto
  santa-clara-county bay-area)
 (8440 togos sandwiches 2.0 4133 el-camino-way palo-alto
  santa-clara-county bay-area)
 (8441 the-cheese-steak-shop-inc sandwiches 2.0 4581 century-blvd
  pittsburg contra-costa-county bay-area)
 (8442 togos-eatery sandwiches 3.0 1600 contra-costa-blvd-no.-a
  pleasant-hill contra-costa-county bay-area)
 (8443 cheese-steak-shop sandwiches 3.4 4825 hopyard-rd pleasanton
  alameda-county bay-area)
 (8444 phillies-cheese-steaks sandwiches 2.0 310 main-st-ste-d
  pleasanton alameda-county bay-area)
 (8445 de-martinis-sandwich-shop sandwiches 2.7 419 bark-dr
  redwood-city san-mateo-county bay-area)
 (8446 guckenheimer-sandwich-shoppe sandwiches 2.0 1450 oddstad-dr
  redwood-city san-mateo-county bay-area)
 (8447 jersey-joes sandwiches 3.0 761 el-camino-real redwood-city
  san-mateo-county bay-area)
 (8448 toutde-suite-sandwich-shop sandwiches 2.0 1450 oddstad-dr
  redwood-city san-mateo-county bay-area)
 (8449 guckenheimer-sandwich-shoppe sandwiches 2.0 1200 s-47th-st
  richmond contra-costa-county bay-area)
 (8450 guckenheimer-sandwich-shoppe sandwiches 2.0 10 w-orange-ave
  south-san-francisco san-mateo-county bay-area)
 (8451 guckenheimer-sandwich-shoppe sandwiches 2.0 460
  point-san-bruno-blvd south-san-francisco san-mateo-county bay-area)
 (8452 little-luca-sandwich-shop sandwiches 3.3 724 el-camino-real
  south-san-francisco san-mateo-county bay-area)
 (8453 luigis-sandwich-palace sandwiches 2.0 326 littlefield-ave
  south-san-francisco san-mateo-county bay-area)
 (8454 the-sandwich-factory sandwiches 2.0 1098 san-mateo-ave-no.-a
  south-san-francisco san-mateo-county bay-area)
 (8455 hollywood-sandwich-shop sandwiches 2.0 189 san-bruno-ave-w
  san-bruno san-mateo-county bay-area)
 (8456 daves sandwiches 2.0 29 x3d san-francisco san-francisco-county
  bay-area)
 (8457 ideal-cafe-&-delicatessen sandwiches 2.0 1198 folsom
  san-francisco san-francisco-county bay-area)
 (8458 lightening sandwiches 2.0 98 mission-st. san-francisco
  san-francisco-county bay-area)
 (8459 super-subs-sandwich-shop sandwiches 2.0 100 gough san-francisco
  san-francisco-county bay-area)
 (8460 bel-ami-croissant-sandwiches sandwiches 2.0 890 emory-st
  san-jose santa-clara-county bay-area)
 (8461 college-park-hot-dogs-sandwich sandwiches 2.0 718 emory-st
  san-jose santa-clara-county bay-area)
 (8462 east-west-sandwich-fast-food sandwiches 2.0 2082 n-capitol-ave
  san-jose santa-clara-county bay-area)
 (8463 guckenheimer-sandwich-shoppe sandwiches 2.0 1290 ridder-park-dr
  san-jose santa-clara-county bay-area)
 (8464 guckenheimer-sandwich-shoppe sandwiches 2.0 2560 n-1st-st
  san-jose santa-clara-county bay-area)
 (8465 huong-lan-sandwich sandwiches 2.0 958 story-rd san-jose
  santa-clara-county bay-area)
 (8466 jerseys-cheesesteaks sandwiches 2.0 5280 northlawn-dr san-jose
  santa-clara-county bay-area)
 (8467 just-great-sandwiches sandwiches 2.0 1411 the-alameda san-jose
  santa-clara-county bay-area)
 (8468 kims-sandwich sandwiches 2.0 1818 tully-rd-ste-182 san-jose
  santa-clara-county bay-area)
 (8469 lees-sandwiches sandwiches 1.7 2525 s-king-rd san-jose
  santa-clara-county bay-area)
 (8470 lisa-sandwich sandwiches 2.0 325 s-1st-st san-jose
  santa-clara-county bay-area)
 (8471 mckee-sandwiches sandwiches 2.0 2367 mckee-rd san-jose
  santa-clara-county bay-area)
 (8472 mikes-sandwich-shop sandwiches 2.0 497 reynolds-cir san-jose
  santa-clara-county bay-area)
 (8473 nguyens-sandwiches-food-to sandwiches 2.0 970 s-1st-st san-jose
  santa-clara-county bay-area)
 (8474 r-&-d-sandwich-express sandwiches 2.0 780 montague-expy-ste-101
  san-jose santa-clara-county bay-area)
 (8475 sandwich-centre sandwiches 2.0 1198 valley-quail-cir san-jose
  santa-clara-county bay-area)
 (8476 sandwich-house-deli sandwiches 2.0 5952 monteverde-dr san-jose
  santa-clara-county bay-area)
 (8477 sandwich-mill sandwiches 2.0 1381 kooser-rd san-jose
  santa-clara-county bay-area)
 (8478 sandwiched sandwiches 2.0 221 e-san-fernando-st san-jose
  santa-clara-county bay-area)
 (8479 thanh-ha-sandwiches sandwiches 2.0 1635 mckee-rd san-jose
  santa-clara-county bay-area)
 (8480 thanh-lan-sandwiches sandwiches 2.0 1130 lucretia-ave-no.-g
  san-jose santa-clara-county bay-area)
 (8481 the-sandwich-garden sandwiches 2.0 1762 technology-dr-no.-118
  san-jose santa-clara-county bay-area)
 (8482 tout-de-suite-sandwich-shoppe sandwiches 2.0 175 curtner-ave
  san-jose santa-clara-county bay-area)
 (8483 golden-donuts&-sandwich sandwiches 2.0 15251
  hesperian-blvd-ste-3 san-leandro alameda-county bay-area)
 (8484 lettuce-beef-friends sandwiches 2.0 1600 fairmont-dr san-leandro
  alameda-county bay-area)
 (8485 rainbow-sandwich-shop sandwiches 2.3 400 doolittle-dr
  san-leandro alameda-county bay-area)
 (8486 christophers-sandwiches-&-piz sandwiches 2.0 1432
  s-el-camino-real san-mateo san-mateo-county bay-area)
 (8487 guckenheimer-sandwich-shoppe sandwiches 2.0 1900
  alameda-de-las-pulgas san-mateo san-mateo-county bay-area)
 (8488 d-js-sandwich-&-salad-shop sandwiches 2.0 1854 x17th-st
  san-pablo contra-costa-county bay-area)
 (8489 the-cheese-steak-shop sandwiches 2.0 13925 san-pablo-ave-ste-207
  san-pablo contra-costa-county bay-area)
 (8490 guckenheimer-sandwich-shoppe sandwiches 2.0 6001
  bollinger-canyon-rd san-ramon contra-costa-county bay-area)
 (8491 philly-cheesesteak sandwiches 1.5 1061 market-pl-no.-a san-ramon
  contra-costa-county bay-area)
 (8492 togos-eatery sandwiches 2.3 2550 san-ramon-valley-blvd-no.-k
  san-ramon contra-costa-county bay-area)
 (8493 emories-sandwich-shop sandwiches 2.0 2135 el-camino-real
  santa-clara santa-clara-county bay-area)
 (8494 sandwich-construction sandwiches 3.0 1800 wyatt-dr-no.-11
  santa-clara santa-clara-county bay-area)
 (8495 sandwich-scene sandwiches 2.0 320 martin-ave santa-clara
  santa-clara-county bay-area)
 (8496 master-sandwich sandwiches 2.0 903 reed-ave sunnyvale
  santa-clara-county bay-area)
 (8497 souper-sandwich-factory sandwiches 2.0 1022 w-maude-ave
  sunnyvale santa-clara-county bay-area)
 (8498 rinaldi-sandwich-company sandwiches 2.0 2813 whipple-rd
  union-city alameda-county bay-area)
 (8499 togos-eatery-of-union-city sandwiches 2.3 1701 decoto-rd
  union-city alameda-county bay-area)
 (8500 ajs-chicken-&-sandwiches sandwiches 2.0 601 tennessee-st-no.-a
  vallejo solano-county bay-area)
 (8501 the-whole-earth-sandwich-shop sandwiches 2.0 129 sand-dollar-dr
  vallejo solano-county bay-area)
 (8502 togos-eatery sandwiches 2.0 3656 sonoma-blvd vallejo
  solano-county bay-area)
 (8503 snack-attack sandwiches 2.0 107 roble-rd-apt-101 walnut-creek
  contra-costa-county bay-area)
 (8504 the-cheese-steak-shop sandwiches 2.8 1626 cypress-st
  walnut-creek contra-costa-county bay-area)
 (8505 togos sandwiches 2.0 2975 ygnacio-valley-rd walnut-creek
  contra-costa-county bay-area)
 (8506 togos-eatery sandwiches 2.0 1321 locust-st walnut-creek
  contra-costa-county bay-area)
 (8507 swedes-sandwich-shoppe sandwiches 2.0 440 airport-blvd-no.-107
  watsonville santa-cruz-county bay-area)
 (8508 sandwich-master-the sandwiches 2.0 715 x2nd-st fairfield
  solano-county bay-area)
 (8509 dougs-creative-sandwiches sandwiches 2.0 2827 kilburn-ave napa
  napa-county napa-valley)
 (8510 sandwiches-by-heck sandwiches 2.0 520 ornduff napa napa-county
  napa-valley)
 (8511 costco-sandwich-shop sandwiches 2.0 15 vintge-wy novato
  marin-county bay-area)
 (8512 italian-delite-submarine-sandwiches sandwiches 2.3 468
  ignacio-blvd novato marin-county bay-area)
 (8513 patio-sandwich-shop sandwiches 2.0 11 commercial-blvd novato
  marin-county bay-area)
 (8514 so-big-sandwich-shop-the sandwiches 2.0 62 hamilton-dr novato
  marin-county bay-area)
 (8515 new-york-subs-&-buffalo-wings sandwiches 2.0 1380
  n-mcdowell-blvd petaluma sonoma-county bay-area)
 (8516 new-york-subs sandwiches 2.0 360 petaluma-blvd-n petaluma
  sonoma-county bay-area)
 (8517 port-of-subs sandwiches 2.0 350 raleys-towne-ctr rohnert-park
  sonoma-county bay-area)
 (8518 port-of-subs sandwiches 2.0 4685 redwood-dr rohnert-park
  sonoma-county bay-area)
 (8519 michaels-sourdough-sandwiches sandwiches 2.0 3095 kerner-blvd
  san-rafael marin-county bay-area)
 (8520 smokys-sandwich-shop sandwiches 2.0 21 golden-gate-dr san-rafael
  marin-county bay-area)
 (8521 viking-submarine-sandwiches sandwiches 2.0 1121 francisco-blvd-e
  san-rafael marin-county bay-area)
 (8522 hot-subs-at-piner-plaza sandwiches 2.0 1778 piner-rd santa-rosa
  sonoma-county bay-area)
 (8523 marias-new-york-subs sandwiches 2.0 3448 santa-rosa-ave
  santa-rosa sonoma-county bay-area)
 (8524 port-of-subs sandwiches 2.0 2101 w-college-ave santa-rosa
  sonoma-county bay-area)
 (8525 santa-rosa-subs sandwiches 2.0 25 old-courthouse-sq santa-rosa
  sonoma-county bay-area)
 (8526 subs sandwiches 2.0 25 old-courthouse-sq santa-rosa
  sonoma-county bay-area)
 (8527 tonys-subs sandwiches 2.0 7235 headsburg-ave sebastopol
  sonoma-county bay-area)
 (8528 abes-sandwich-shop sandwiches 2.0 560 larkin-st san-francisco
  san-francisco-county bay-area)
 (8529 aimee-sandwiches sandwiches 2.0 576 sacramento-st san-francisco
  san-francisco-county bay-area)
 (8530 corner-sandwich-shop-the sandwiches 2.0 600 kearny-st
  san-francisco san-francisco-county bay-area)
 (8531 cosmos-sandwich-shop sandwiches 2.0 22 peace-plz san-francisco
  san-francisco-county bay-area)
 (8532 flower-market-sandwiches-to-go sandwiches 2.0 698 brannan-st
  san-francisco san-francisco-county bay-area)
 (8533 freddies-sandwiches sandwiches 3.0 300 francisco-st
  san-francisco san-francisco-county bay-area)
 (8534 just-sandwiches sandwiches 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (8535 k-&-c-sandwich-shop sandwiches 2.0 561 webster-st san-francisco
  san-francisco-county bay-area)
 (8536 la-casa-no-2-sandwich-shop sandwiches 2.0 500 bay-shore-blvd
  san-francisco san-francisco-county bay-area)
 (8537 marina-sandwich-shop sandwiches 2.0 3321 steiner-st
  san-francisco san-francisco-county bay-area)
 (8538 minh-tri-american-sandwiches sandwiches 2.0 534 irving-st
  san-francisco san-francisco-county bay-area)
 (8539 nooners-sandwich-pleasure sandwiches 2.0 501 forbes-blvd
  south-san-francisco san-mateo-county bay-area)
 (8540 papa-joes-sandwich-shop sandwiches 2.0 1412 polk-st
  san-francisco san-francisco-county bay-area)
 (8541 sandwich-factory-the sandwiches 2.0 1098 san-mateo-ave
  south-san-francisco san-mateo-county bay-area)
 (8542 sandwich-shop-the sandwiches 2.0 635 ave san-francisco
  san-francisco-county bay-area)
 (8543 side-pocket-sandwich-shop-the sandwiches 2.0 185 the-embarcadero
  san-francisco san-francisco-county bay-area)
 (8544 sing-sing-sandwich-shop sandwiches 2.0 309 hyde-st san-francisco
  san-francisco-county bay-area)
 (8545 triangle-sandwich-shop sandwiches 2.0 1790 x3rd-st san-francisco
  san-francisco-county bay-area)
 (8546 vy-coffee-&-sandwich-shop sandwiches 2.0 611 geary-st
  san-francisco san-francisco-county bay-area)
 (8547 yothin-sandwich-shop sandwiches 2.0 2884 geary-blvd
  san-francisco san-francisco-county bay-area)
 (8548 de-la-cruz-deli sandwiches 3.0 845 stewart-dr. sunnyvale
  santa-clara-county bay-area)
 (8549 subway sandwiches 2.0 314 university-ave palo-alto
  santa-clara-county bay-area)
 (8550 togos-eatery sandwiches 2.8 3647 mount-diablo-blvd lafayette
  contra-costa-county bay-area)
 (8551 brooks-breads sandwiches 2.0 0 orinda orinda contra-costa-county
  bay-area)
 (8552 lakeside-cafe sandwiches 3.0 3160 n.shoreline-blvd.
  mountain-view santa-clara-county bay-area)
 (8553 dimarcos-pizza-co. sandwiches 3.0 1532 branham-lane san-jose
  santa-clara-county bay-area)
 (8554 javabobs sandwiches 2.7 20991 redwood-rd castro-valley
  alameda-county bay-area)
 (8555 saffron-caffe sandwiches 2.0 2813 seventh-st berkeley
  alameda-county bay-area)
 (8556 lucys-lunches sandwiches 2.7 0 st byron unknown bay-area)
 (8557 amatos-restaurant sandwiches 3.0 1162 saratoga-avenue san-jose
  santa-clara-county bay-area)
 (8558 eriks-delicafe sandwiches 2.7 4611 almaden-expwy san-jose
  santa-clara-county bay-area)
 (8559 fanny-and-alexander scandinavian 1.8 412 emerson-st. palo-alto
  santa-clara-county bay-area)
 (8560 scandinavian-smokehouse scandinavian 2.0 250 napoleon-st
  san-francisco san-francisco-county bay-area)
 (8561 solano-grill-&-fish-market seafood 3.1 1133 solano-ave albany
  alameda-county bay-area)
 (8562 marina-seafood-grotto seafood 2.0 0 unknown alviso
  santa-clara-county bay-area)
 (8563 captain-blythers seafood 3.0 123 x1st-st benicia solano-county
  bay-area)
 (8564 big-daddys-fish-house seafood 2.8 2649 san-pablo-ave berkeley
  alameda-county bay-area)
 (8565 gerties-chesapeake-bay-cafe seafood 3.2 1919 addison-st berkeley
  alameda-county bay-area)
 (8566 seabreeze-market seafood 2.0 598 university-ave berkeley
  alameda-county bay-area)
 (8567 spengers-fish-grotto seafood 2.3 1919 x4th-st berkeley
  alameda-county bay-area)
 (8568 the-fishing-schooner seafood 2.0 1535 julia-st-apt-c berkeley
  alameda-county bay-area)
 (8569 wynns-fish-&-poultry seafood 2.0 1675 short-st berkeley
  alameda-county bay-area)
 (8570 london-fish-n-chips seafood 2.0 1265 el-camino-real-no.-4
  burlingame san-mateo-county bay-area)
 (8571 larrys-surf-n-turf seafood 2.0 215 esplanade capitola unknown
  bay-area)
 (8572 sea-bonne-restaurant seafood 2.7 231 esplanade capitola unknown
  bay-area)
 (8573 theos-seafood-&-grill seafood 2.3 3384 village-dr castro-valley
  alameda-county bay-area)
 (8574 red-lobster seafood 2.0 1225 willow-pass-rd concord
  contra-costa-county bay-area)
 (8575 nantucket-fish seafood 2.3 1306 pomona-ave crockett unknown
  bay-area)
 (8576 house-of-catfish-&-ribs seafood 2.5 270 san-pedro-rd daly-city
  san-mateo-county bay-area)
 (8577 uncle-yus seafood 3.0 150 hartz-ave danville contra-costa-county
  bay-area)
 (8578 hayward-fishery-&-restaurant seafood 2.4 7400 san-ramon-rd
  dublin alameda-county bay-area)
 (8579 fredy-jacks-fish-&-chips seafood 2.0 1984 university-ave
  east-palo-alto san-mateo-county bay-area)
 (8580 paul-&-barbaras-fish-trap seafood 2.4 0 unknown el-granada
  san-mateo-county bay-area)
 (8581 princeton-seafood seafood 2.3 0 unknown el-granada
  san-mateo-county bay-area)
 (8582 skippers-seafoodn-chowder seafood 2.0 2285 n-texas-st fairfield
  solano-county bay-area)
 (8583 s-f-ocean-seafood-restaurant seafood 2.0 985
  e-hillsdale-blvd-no.-1106 foster-city san-mateo-county bay-area)
 (8584 fish-&-chips-at-the-hub seafood 1.6 39230 argonaut-way fremont
  alameda-county bay-area)
 (8585 fremont-market-broiler seafood 3.2 39195 farwell-dr fremont
  alameda-county bay-area)
 (8586 fremont-seafood-restaurant seafood 2.0 37070 fremont-blvd
  fremont alameda-county bay-area)
 (8587 moon-wah-seafood-restaurant seafood 2.0 41068 fremont-blvd
  fremont alameda-county bay-area)
 (8588 new-ocean-sea-food-restaurant seafood 2.8 34420
  no.d-fremont-blvd fremont alameda-county bay-area)
 (8589 niles-fish-market-&-restaurant seafood 2.0 37378 niles-blvd
  fremont alameda-county bay-area)
 (8590 red-lobster seafood 1.3 39401 fremont-blvd fremont
  alameda-county bay-area)
 (8591 wellingtons-fish-&-chip seafood 2.0 6948 chestnut-st gilroy
  santa-clara-county bay-area)
 (8592 the-anchorage seafood 3.3 0 unknown half-moon-bay
  san-mateo-county bay-area)
 (8593 flying-fish-grill seafood 2.8 99 san-mateo-rd half-moon-bay
  san-mateo-county bay-area)
 (8594 hayward-fishery-&-restaurant seafood 3.3 1065 c-st hayward
  alameda-county bay-area)
 (8595 hong-kong-seafood-restaurant seafood 2.0 661
  x663-west-tennyson-rd hayward alameda-county bay-area)
 (8596 london-fish-&-chips seafood 2.3 18890 hesperian-blvd hayward
  alameda-county bay-area)
 (8597 manzellas-seafood-loft seafood 2.0 1275 w-winton-ave hayward
  alameda-county bay-area)
 (8598 twin-dragon-seafood-rest seafood 2.0 25168 mission-blvd hayward
  alameda-county bay-area)
 (8599 cape-cod-house seafood 2.0 3666 mount-diablo-blvd lafayette
  contra-costa-county bay-area)
 (8600 red-lobster seafood 2.6 4390 el-camino-real los-altos
  santa-clara-county bay-area)
 (8601 cooks-seafood seafood 3.4 751 el-camino-real menlo-park
  san-mateo-county bay-area)
 (8602 willow-fish-&-chips seafood 2.0 840 willow-rd menlo-park
  san-mateo-county bay-area)
 (8603 chu-kong-seafood-rest seafood 2.0 1661 el-camino-real millbrae
  san-mateo-county bay-area)
 (8604 fook-yuen-seafood-restaurant seafood 3.8 195 el-camino-real
  millbrae san-mateo-county bay-area)
 (8605 kwongs-seafood-restaurant seafood 2.7 150 el-camino-real
  millbrae san-mateo-county bay-area)
 (8606 great-eastern-seafood-restaurant seafood 2.0 1245 jacklin-rd
  milpitas santa-clara-county bay-area)
 (8607 half-penny-fish-&-chip seafood 2.0 1350 s-park-victoria-dr
  milpitas santa-clara-county bay-area)
 (8608 kowloon-seafood-restaurant seafood 2.5 24 s-abbott-ave milpitas
  santa-clara-county bay-area)
 (8609 red-lobster seafood 2.4 503 e-calaveras-blvd milpitas
  santa-clara-county bay-area)
 (8610 bobs-crab seafood 2.0 0 unknown moss-landing monterey-county
  monterey)
 (8611 moss-landing-oyster-bar seafood 3.5 0 unknown moss-landing
  monterey-county monterey)
 (8612 phils-fish-market seafood 2.5 0 rd. moss-landing monterey-county
  monterey)
 (8613 century-seafood-&-poultry seafood 2.3 1935 w-el-camino-real
  mountain-view santa-clara-county bay-area)
 (8614 dynasty-seafood-restaurant seafood 2.0 360 castro-st
  mountain-view santa-clara-county bay-area)
 (8615 fu-lum-mum-seafood-restaurant seafood 3.5 246 castro-st
  mountain-view santa-clara-county bay-area)
 (8616 fishers-restaurant seafood 2.0 916 franklin-st napa napa-county
  napa-valley)
 (8617 x101-fish-&-chips seafood 2.3 nil nil newark alameda-county
  bay-area)
 (8618 h-salt-esq-fish-and-chips seafood 2.0 35204 newark-blvd newark
  alameda-county bay-area)
 (8619 ocean-luck-restaurant seafood 2.0 7179 thornton-ave newark
  alameda-county bay-area)
 (8620 alta-mar seafood 2.0 1060 e-12th-st oakland alameda-county
  bay-area)
 (8621 art-crab-shak seafood 2.0 4031 broadway oakland alameda-county
  bay-area)
 (8622 crab-shack-restaurant seafood 2.0 2028 macarthur-blvd oakland
  alameda-county bay-area)
 (8623 dawns-louisiana-fish-house seafood 2.0 6018 macarthur-blvd
  oakland alameda-county bay-area)
 (8624 east-ocean-seafood-restaurant seafood 3.8 1713 webster-st.
  alameda alameda-county bay-area)
 (8625 h-salt-esq-fish-&-chips seafood 2.0 22 eastmont-mall oakland
  alameda-county bay-area)
 (8626 kincaids-bay-house-restaurant seafood 3.4 0 unknown oakland
  alameda-county bay-area)
 (8627 lil-daves-seafood seafood 2.0 10316 e-14th-st oakland
  alameda-county bay-area)
 (8628 new-oakland-seafood-restaurant seafood 2.0 307 x10th-st oakland
  alameda-county bay-area)
 (8629 oakland-seafood-cuising seafood 2.0 307 x10th-st oakland
  alameda-county bay-area)
 (8630 one-stop-fish-and-rib-house seafood 2.0 8418 e-14th-st oakland
  alameda-county bay-area)
 (8631 restorante-il-pescatore seafood 2.4 75 jack-london-sq oakland
  alameda-county bay-area)
 (8632 s-&-s-seafood seafood 2.0 4923 telegraph-ave oakland
  alameda-county bay-area)
 (8633 sakinahs-deep-fried-fish seafood 2.0 5751 market-st oakland
  alameda-county bay-area)
 (8634 scotts-seafood-restaurant seafood 2.5 2 broadway oakland
  alameda-county bay-area)
 (8635 seabreeze-cafe-&-restaurant seafood 2.0 280 x6th-ave oakland
  alameda-county bay-area)
 (8636 the-apostleship-of-the-sea seafood 2.0 0 x40-4001-7th-st oakland
  alameda-county bay-area)
 (8637 the-clam-bucket seafood 2.5 1155 x3rd-st-apt-6 oakland
  alameda-county bay-area)
 (8638 the-fish-place seafood 2.0 3345 grand-ave oakland alameda-county
  bay-area)
 (8639 the-pelican seafood 2.0 15 embarcadero-w oakland alameda-county
  bay-area)
 (8640 the-reef seafood 2.8 1000 embarcadero oakland alameda-county
  bay-area)
 (8641 tsing-tao-sea-food-restaurant seafood 3.3 200 broadway oakland
  alameda-county bay-area)
 (8642 yorkshore-english-fish-chips seafood 2.0 2907 brookdale-ave
  oakland alameda-county bay-area)
 (8643 camelot-fish-&-chips seafood 3.3 70 w-manor-dr pacifica
  san-mateo-county bay-area)
 (8644 uncle-chen seafood 3.8 2209 el-camino-real palo-alto
  santa-clara-county bay-area)
 (8645 fish-market seafood 3.3 3150 el-camino-real palo-alto
  santa-clara-county bay-area)
 (8646 scotts-seafood seafood 2.4 2300 e.-bayshore-rd palo-alto
  santa-clara-county bay-area)
 (8647 mystic-cafe seafood 2.2 546 university-ave palo-alto
  santa-clara-county bay-area)
 (8648 red-lobster seafood 2.3 4607 century-blvd pittsburg
  contra-costa-county bay-area)
 (8649 pacific-fresh seafood 3.2 550 ellinwood-way pleasant-hill
  contra-costa-county bay-area)
 (8650 pleasanton-fish-&-chips-rest seafood 2.0 2707 hopyard-rd
  pleasanton alameda-county bay-area)
 (8651 x7-mares-seafood-restaurant seafood 2.0 2809 middlefield-rd
  redwood-city san-mateo-county bay-area)
 (8652 clarks-by-the-bay seafood 3.0 487 seaport-blvd redwood-city
  san-mateo-county bay-area)
 (8653 h-salt-esq-fish-&-chips seafood 2.0 12929 san-pablo-ave richmond
  contra-costa-county bay-area)
 (8654 reds-seafood seafood 2.0 2207 macdonald-ave richmond
  contra-costa-county bay-area)
 (8655 snappers-seafood seafood 2.0 1501 ohio-ave richmond
  contra-costa-county bay-area)
 (8656 hong-kong-seafood-restaurant seafood 2.0 217 main-st-no.-221
  rio-vista solano-county bay-area)
 (8657 full-moon-seafood-restaurant seafood 2.0 331 grand-ave
  south-san-francisco san-mateo-county bay-area)
 (8658 london-fishn-chips seafood 2.0 130 el-camino-real-no.-b
  san-bruno san-mateo-county bay-area)
 (8659 red-lobster seafood 2.0 1210 el-camino-real san-bruno
  san-mateo-county bay-area)
 (8660 a-sabellas-restaurant-third-floor seafood 3.2 2766 taylor
  san-francisco san-francisco-county bay-area)
 (8661 adriatic-continental-and-seafood-cuisine seafood 2.0 0
  of-polk/washington san-francisco san-francisco-county bay-area)
 (8662 anthonys-restaurant seafood 3.2 1701 powell san-francisco
  san-francisco-county bay-area)
 (8663 bentleys-seafood-grill-&-oyster-bar seafood 2.0 0 &-kearny
  san-francisco san-francisco-county bay-area)
 (8664 bodega-seafood-restaurant seafood 2.0 427 presidio-avenue
  san-francisco san-francisco-county bay-area)
 (8665 chics-place seafood 2.3 0 39 san-francisco san-francisco-county
  bay-area)
 (8666 elite-cafe seafood 3.5 2049 fillmore san-francisco
  san-francisco-county bay-area)
 (8667 ernies-neptune-fish-grotto seafood 2.0 1816 irving san-francisco
  san-francisco-county bay-area)
 (8668 fishermens-grotto seafood 2.6 9 fishermans-wharf san-francisco
  san-francisco-county bay-area)
 (8669 franciscan-restaurant seafood 2.7 0 wharf san-francisco
  san-francisco-county bay-area)
 (8670 harpoon-louies seafood 2.3 55 stevenson san-francisco
  san-francisco-county bay-area)
 (8671 hyde-street-seafood-house-and-raw-bar seafood 2.7 1509 hyde
  san-francisco san-francisco-county bay-area)
 (8672 in-inn-seafood-restaurant seafood 2.0 1935 taraval san-francisco
  san-francisco-county bay-area)
 (8673 joes-fish-grotto seafood 2.0 4435 mission san-francisco
  san-francisco-county bay-area)
 (8674 laroccas-oyster-bar seafood 2.0 3519 california san-francisco
  san-francisco-county bay-area)
 (8675 mayes-original-oyster-house seafood 3.0 1233 polk san-francisco
  san-francisco-county bay-area)
 (8676 mccormick-&-kuletos-restaurant seafood 3.8 900 north-point
  san-francisco san-francisco-county bay-area)
 (8677 michelangelo-cafe seafood 3.6 0 unknown san-francisco
  san-francisco-county bay-area)
 (8678 neptunes-palace seafood 3.8 0 39 san-francisco
  san-francisco-county bay-area)
 (8679 niantic-oyster-bar seafood 2.0 150 pacific-avenue san-francisco
  san-francisco-county bay-area)
 (8680 pacific-cafe seafood 3.5 7000 geary-boulevard san-francisco
  san-francisco-county bay-area)
 (8681 piccadilly-fish-and-chips seafood 2.0 1348 polk san-francisco
  san-francisco-county bay-area)
 (8682 pompeis-grotto seafood 3.2 0 wharf san-francisco
  san-francisco-county bay-area)
 (8683 sailing-ship-dolph-rempp-restaurant seafood 2.0 0 42
  san-francisco san-francisco-county bay-area)
 (8684 scotts-seafood-grill-&-bar seafood 3.7 3 embarcadero-center
  san-francisco san-francisco-county bay-area)
 (8685 scotts-seafood-grill-&-bar seafood 3.1 2400 lombard
  san-francisco san-francisco-county bay-area)
 (8686 shore-bird-restaurant seafood 2.0 390 capistrano-rd
  san-francisco san-francisco-county bay-area)
 (8687 sinbads-pier-ii-restaurant seafood 2.7 0 2 san-francisco
  san-francisco-county bay-area)
 (8688 south-pacific seafood 2.0 2500 noriega san-francisco
  san-francisco-county bay-area)
 (8689 tarantinos-restaurant seafood 2.0 206
  jefferson-at-fishermans-wharf san-francisco san-francisco-county
  bay-area)
 (8690 thanh-long seafood 3.3 4101 judah san-francisco
  san-francisco-county bay-area)
 (8691 the-old-clam-house seafood 2.0 299 bayshore san-francisco
  san-francisco-county bay-area)
 (8692 vannellis-seafood seafood 2.8 0 39 san-francisco
  san-francisco-county bay-area)
 (8693 waterfront-restaurant seafood 3.1 0 7 san-francisco
  san-francisco-county bay-area)
 (8694 bobs-surf-&-turf seafood 2.0 2400 monterey-hwy san-jose
  santa-clara-county bay-area)
 (8695 century-seafood-&-poultry seafood 2.0 3695 union-ave san-jose
  santa-clara-county bay-area)
 (8696 century-seafood-&-poultry seafood 2.0 1187 saratoga-sunnyvale-rd
  san-jose santa-clara-county bay-area)
 (8697 dover-fish-&-chips seafood 2.0 3208 s-white-rd san-jose
  santa-clara-county bay-area)
 (8698 e-lake-chinese-seafood-restaurant seafood 2.0 2819
  south-white-rd san-jose santa-clara-county bay-area)
 (8699 fish-place-chinese-restaurant seafood 3.0 871
  s-winchester-blvd-no.-64 san-jose santa-clara-county bay-area)
 (8700 frankies-pizza-and-seafood seafood 2.0 1152 e-julian-st san-jose
  santa-clara-county bay-area)
 (8701 gold-star-seafood-chinese-cuis seafood 2.0 1705 tully-rd
  san-jose santa-clara-county bay-area)
 (8702 gourmet-seafoods seafood 2.0 0 unknown san-jose
  santa-clara-county bay-area)
 (8703 grand-fortune-seafood-rest seafood 2.0 5400 monterey-hwy
  san-jose santa-clara-county bay-area)
 (8704 h-salt-esquire-fish-&-chips seafood 2.0 3090 story-rd san-jose
  santa-clara-county bay-area)
 (8705 h-salt-fish-&-chip seafood 2.0 905 meridian-ave san-jose
  santa-clara-county bay-area)
 (8706 h-salt-fish-&-chips seafood 2.0 5353 almaden-expy-ste-28
  san-jose santa-clara-county bay-area)
 (8707 half-penny-fish-&-grill seafood 2.0 4320
  stevens-creek-blvd-ste-229 san-jose santa-clara-county bay-area)
 (8708 lake-side-seafood-restaurant seafood 2.0 3756 s-bascom-ave
  san-jose santa-clara-county bay-area)
 (8709 new-jade-dragon-seafood seafood 2.0 2170 story-rd san-jose
  santa-clara-county bay-area)
 (8710 new-pearl-river-seafood-rest seafood 1.7 34 e-rosemary-st
  san-jose santa-clara-county bay-area)
 (8711 number-one-seafood-hut seafood 2.0 2871 senter-rd san-jose
  santa-clara-county bay-area)
 (8712 ocean-harbor-chinese-seafood seafood 3.1 370 s-winchester-blvd
  san-jose santa-clara-county bay-area)
 (8713 pac-lobster-chns-seafood-rstrn seafood 2.0 1071 e-capitol-expy
  san-jose santa-clara-county bay-area)
 (8714 race-street-seafood-kitchen seafood 2.0 0 unknown san-jose
  santa-clara-county bay-area)
 (8715 red-lobster seafood 2.0 5343 almaden-expy san-jose
  santa-clara-county bay-area)
 (8716 red-lobster seafood 2.0 2040 aborn-rd san-jose
  santa-clara-county bay-area)
 (8717 scotts-seafood-grill-&-bar seafood 2.7 185 park-ave san-jose
  santa-clara-county bay-area)
 (8718 shark-&-rose seafood 2.8 69 north-san-pedro-st san-jose
  santa-clara-county bay-area)
 (8719 showgi-japanese-seafood-rest seafood 3.2 5945 almaden-expy-no.-g
  san-jose santa-clara-county bay-area)
 (8720 tai-san-seafood-restaurant seafood 2.0 375 saratoga-ave-no.-c
  san-jose santa-clara-county bay-area)
 (8721 the-original-crab-house seafood 2.0 5506 monterey-hwy san-jose
  santa-clara-county bay-area)
 (8722 ernies-sea-food seafood 2.0 13775 e-14th-st san-leandro
  alameda-county bay-area)
 (8723 horatios seafood 3.0 60 san-leandro-marina san-leandro
  alameda-county bay-area)
 (8724 red-herring seafood 2.0 635 bancroft-ave san-leandro
  alameda-county bay-area)
 (8725 union-fish-&-chips seafood 2.0 14843 washington-ave san-leandro
  alameda-county bay-area)
 (8726 fishermans-grotto seafood 2.0 15930 hesperian-blvd san-lorenzo
  alameda-county bay-area)
 (8727 castaway seafood 3.3 1000 coyote-point-drive san-mateo
  san-mateo-county bay-area)
 (8728 clamhouse-san-mateo seafood 2.3 33 w-25th-ave san-mateo
  san-mateo-county bay-area)
 (8729 fish-market seafood 3.1 1855 south-norfolk san-mateo
  san-mateo-county bay-area)
 (8730 ritz-vegetarian seafood 2.3 1528 s-el-camino-real san-mateo
  san-mateo-county bay-area)
 (8731 seafood-house seafood 2.0 2450 s-el-camino-real san-mateo
  san-mateo-county bay-area)
 (8732 sebastians-fish-&-chips seafood 2.0 215 s-ellsworth-ave
  san-mateo san-mateo-county bay-area)
 (8733 silver-lake-seafood-restaurant seafood 2.0 2291 s-el-camino-real
  san-mateo san-mateo-county bay-area)
 (8734 ocean-dragon-restaurant seafood 2.0 13993 san-pablo-ave
  san-pablo contra-costa-county bay-area)
 (8735 rhodes-english-fish-&-chips seafood 2.0 14402 san-pablo-ave
  san-pablo contra-costa-county bay-area)
 (8736 the-sea-catch seafood 2.0 3141 no.g-crow-canyon-rd san-ramon
  contra-costa-county bay-area)
 (8737 fish-market seafood 3.3 3775 el-camino-real santa-clara
  santa-clara-county bay-area)
 (8738 julies-fish-&-chips seafood 2.0 2068 el-camino-real santa-clara
  santa-clara-county bay-area)
 (8739 london-fish-&-chips seafood 2.0 2855 stevens-creek-blvd-ste-2198
  santa-clara santa-clara-county bay-area)
 (8740 ocean-seafood-padah seafood 2.0 3519 el-camino-real santa-clara
  santa-clara-county bay-area)
 (8741 aldos-harbor-restaurant seafood 3.0 616 atlantic-ave santa-cruz
  santa-cruz-county bay-area)
 (8742 c-stagnaro-fishing-corp seafood 2.0 0 unknown santa-cruz
  santa-cruz-county bay-area)
 (8743 ideal-fish-restaurant seafood 2.8 106 beach-st santa-cruz
  santa-cruz-county bay-area)
 (8744 riva-fish-house seafood 3.6 0 unknown santa-cruz
  santa-cruz-county bay-area)
 (8745 london-fish-&-chips seafood 2.0 18486 prospect-rd saratoga
  santa-clara-county bay-area)
 (8746 hooked-on-fish seafood 2.3 11 camp-evers-ln scotts-valley
  unknown bay-area)
 (8747 howards-salmon-poacher seafood 2.7 0 unknown soquel unknown
  bay-area)
 (8748 london-fish-n-chips seafood 2.0 108 sunset-ave-ste-i suisun-city
  solano-county bay-area)
 (8749 h-salt-fish-&-chips seafood 2.0 1053 e-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (8750 japanese-seafood-buffet seafood 2.3 855 e-homestead-rd sunnyvale
  santa-clara-county bay-area)
 (8751 michaels-new-england-sea-food seafood 3.6 830
  east-el-camino-real sunnyvale santa-clara-county bay-area)
 (8752 the-bay-fish-&-chips seafood 2.0 826 w-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (8753 feedlot seafood 2.8 6971 airline-hwy. tres-pinos unknown
  unknown)
 (8754 mikes-fish-grotto seafood 2.0 1922 broadway vallejo
  solano-county bay-area)
 (8755 red-lobster seafood 2.0 1180 admiral-callaghan-ln vallejo
  solano-county bay-area)
 (8756 vallejo-fish-&-chip seafood 2.0 613 tennessee-st vallejo
  solano-county bay-area)
 (8757 skippers-seafoodn-chowder seafood 2.0 1457 freedom-blvd
  watsonville santa-cruz-county bay-area)
 (8758 the-fisherman seafood 2.0 6534 washington-st yountville
  napa-county napa-valley)
 (8759 phils-fish-market-and-deli seafood 2.0 2
  sandholt-rd.-&-moss-landing-r moss-landing monterey-county monterey)
 (8760 pjs-oyster-bed seafood 3.4 737 irving-st san-francisco
  san-francisco-county bay-area)
 (8761 whales-tail seafood 2.3 1144 ballena-bl alameda alameda-county
  bay-area)
 (8762 steamers-seafood seafood 3.3 0 st los-gatos santa-clara-county
  bay-area)
 (8763 fon-yong seafood 3.0 1065 holly-st san-carlos san-mateo-county
  bay-area)
 (8764 menara-moroccan-restaurant seafood 2.3 41 east-gish-rd san-jose
  santa-clara-county bay-area)
 (8765 sams-grill-and-seafood-restaurant seafood 2.8 374 bush-st.
  san-francisco san-francisco-county bay-area)
 (8766 c-js-fish-grotto seafood 2.0 500 x1st-st benicia solano-county
  bay-area)
 (8767 baby-sals-seafood-grill seafood 3.2 60 corte-madera-ave
  corte-madera marin-county bay-area)
 (8768 mollys-fish-&-chips seafood 2.0 0 st.-and-pueblo napa
  napa-county napa-valley)
 (8769 north-bay-seafood-restaurant seafood 2.3 936 diablo-ave novato
  marin-county bay-area)
 (8770 riverside-seafood-restaurant seafood 2.0 154 petaluma-blvd-n
  petaluma sonoma-county bay-area)
 (8771 hong-kong-seafood-restaurant seafood 2.0 0 unknown san-rafael
  marin-county bay-area)
 (8772 pier-6-seafood-restaruant seafood 2.0 1559 x4th-st san-rafael
  marin-county bay-area)
 (8773 tonys-seafood-restaurant seafood 2.8 18863 state-route-no-1
  san-rafael marin-county bay-area)
 (8774 bettys-english-fish-n-chips seafood 2.0 4046 sonoma-hwy
  santa-rosa sonoma-county bay-area)
 (8775 seafood-kitchen seafood 2.0 711 stony-point-rd santa-rosa
  sonoma-county bay-area)
 (8776 sausalito-fish-&-chips seafood 2.0 817 bridgeway sausalito
  unknown bay-area)
 (8777 seafood-sausage-co seafood 2.0 215 richardson-st sausalito
  unknown bay-area)
 (8778 seven-seas-restaurant seafood 3.9 682 bridgeway sausalito
  unknown bay-area)
 (8779 supreme-seafood-intl seafood 2.0 937 beechwood-cir suisun-city
  solano-county bay-area)
 (8780 vallejo-fish-&-chips seafood 2.0 613 tennessee-st vallejo
  solano-county bay-area)
 (8781 a-and-a-seafood seafood 2.0 286 jefferson-st san-francisco
  san-francisco-county bay-area)
 (8782 adraitic-seafood-restaurant seafood 2.0 1755 polk-st
  san-francisco san-francisco-county bay-area)
 (8783 atlantis-seafood-grotto seafood 2.0 361 w-portal-ave
  san-francisco san-francisco-county bay-area)
 (8784 c-o-d-seafood seafood 2.0 28 pier san-francisco
  san-francisco-county bay-area)
 (8785 charlie-seafood seafood 2.0 1450 wallace-ave san-francisco
  san-francisco-county bay-area)
 (8786 china-village-seafood-&-vegeta seafood 2.3 2263 chestnut-st
  san-francisco san-francisco-county bay-area)
 (8787 companion-seafood-company seafood 2.0 1335 powell-st
  san-francisco san-francisco-county bay-area)
 (8788 crab-shack seafood 2.0 579 howard-st san-francisco
  san-francisco-county bay-area)
 (8789 dominic-seafood seafood 2.0 33 pier san-francisco
  san-francisco-county bay-area)
 (8790 hong-kong-seafood-restaurant seafood 2.0 0 --2578-noriega-st
  san-francisco san-francisco-county bay-area)
 (8791 hong-kong-villa-seafood-reataurant seafood 2.0 2332 clement-st
  san-francisco san-francisco-county bay-area)
 (8792 jumbo-seafood-restaurant seafood 2.7 1532 noriega-st
  san-francisco san-francisco-county bay-area)
 (8793 london-fish-&-chips seafood 2.0 225 clement-st san-francisco
  san-francisco-county bay-area)
 (8794 lucky-fortune-seafood-restaurant seafood 2.0 5715 geary-blvd
  san-francisco san-francisco-county bay-area)
 (8795 mayflower-seafood-restaurant seafood 2.7 6255 geary-blvd
  san-francisco san-francisco-county bay-area)
 (8796 ming-river-seafood-restaurant seafood 2.0 4737 geary-blvd
  san-francisco san-francisco-county bay-area)
 (8797 mu-ping-seafood-restaurant seafood 2.0 1545 polk-st
  san-francisco san-francisco-county bay-area)
 (8798 new-kowloon-seafood-restaurant seafood 2.0 2110 clement-st
  san-francisco san-francisco-county bay-area)
 (8799 new-ocean-seafood-chinese-restaurant seafood 3.8 3727 geary-blvd
  san-francisco san-francisco-county bay-area)
 (8800 oriental-seafood-restaurant seafood 2.0 2520 noriega-st
  san-francisco san-francisco-county bay-area)
 (8801 pezzolo-seafood seafood 2.0 33 pier san-francisco
  san-francisco-county bay-area)
 (8802 potrero-hill-seafood seafood 2.0 0 unknown san-francisco
  san-francisco-county bay-area)
 (8803 raw-bar-hyde-street-seafood-ho seafood 2.0 1509 hyde-st
  san-francisco san-francisco-county bay-area)
 (8804 royal-hawaiian-seafood seafood 2.0 1177 indiana-st san-francisco
  san-francisco-county bay-area)
 (8805 royal-jade-seafood-restaurant seafood 2.0 675 jackson-st
  san-francisco san-francisco-county bay-area)
 (8806 san-francisco-seafood-express seafood 2.0 1401 davidson-ave
  san-francisco san-francisco-county bay-area)
 (8807 seafood-center seafood 2.0 831 clement-st san-francisco
  san-francisco-county bay-area)
 (8808 seafood-suppliers seafood 2.0 33 pier san-francisco
  san-francisco-county bay-area)
 (8809 sun-tood-sing-seafood-restaurant seafood 2.0 2129 taraval-st
  san-francisco san-francisco-county bay-area)
 (8810 tee-off-seafood-restaurant seafood 2.0 3129 clement-st
  san-francisco san-francisco-county bay-area)
 (8811 tp-seafood-&-meant-whsle-co seafood 2.0 2241 quesada-ave
  san-francisco san-francisco-county bay-area)
 (8812 two-jacks-seafood seafood 2.0 401 haight-st san-francisco
  san-francisco-county bay-area)
 (8813 two-jacks-seafood seafood 2.0 984 gilman-ave san-francisco
  san-francisco-county bay-area)
 (8814 your-fish-&-chips seafood 2.0 203 octavia-st san-francisco
  san-francisco-county bay-area)
 (8815 carniglias seafood 3.0 49 municipal-wharf santa-cruz
  santa-cruz-county bay-area)
 (8816 the-anchorage seafood 3.0 4210 cabrillo-hwy el-granada
  san-mateo-county bay-area)
 (8817 yorkshire-fish-&-chips seafood 2.0 1980 shattuck berkeley
  alameda-county bay-area)
 (8818 strawberry-joes seafood 2.8 0 town-and-country-village
  mill-valley marin-county bay-area)
 (8819 tutto-mare seafood 2.3 0 st tiburon marin-county bay-area)
 (8820 sea-cloud seafood 2.7 0 wharf-no.49b santa-cruz
  santa-cruz-county bay-area)
 (8821 aqua seafood 4.1 252 california-st. san-francisco
  san-francisco-county bay-area)
 (8822 strizzis seafood 2.8 3456 camino-tassajara danville
  contra-costa-county bay-area)
 (8823 red-lobster seafood 1.5 7300 amador-plaza-rd dublin
  alameda-county bay-area)
 (8824 tides-wharf seafood 2.7 0 unknown bodega-bay sonoma-county
  bay-area)
 (8825 sabella-&-latorre seafood 2.3 0 fishermans-wharf san-francisco
  san-francisco-county bay-area)
 (8826 golden-river-seafood seafood 2.0 5827 geary-blvd san-francisco
  san-francisco-county bay-area)
 (8827 moss-beach-distillery seafood 3.9 0 st.&-ocean moss-beach
  san-mateo-county bay-area)
 (8828 fiesta-del-mar seafood 2.7 1005 n-shoreline-blvd mountain-view
  santa-clara-county bay-area)
 (8829 montereys-fish-house seafood 3.0 2114 del-monte monterey
  monterey-county monterey)
 (8830 the-fishwife seafood 2.7 789 trinity seaside monterey-county
  monterey)
 (8831 solano-bar-&-grill seafood 3.3 1133 solano-avenue albany
  alameda-county bay-area)
 (8832 sams-anchor-cafe seafood 2.0 27 main tiburon marin-county
  bay-area)
 (8833 sams-anchor-cafe seafood 3.2 27 main tiburon marin-county
  bay-area)
 (8834 strizzis seafood 2.0 3456 camino-tassajara danville
  contra-costa-county bay-area)
 (8835 kincaids seafood 2.0 60 bayview-place burlingame
  san-mateo-county bay-area)
 (8836 riverview-lodge seafood 2.3 0 of-i-st. antioch
  contra-costa-county bay-area)
 (8837 la-rotonda seafood 2.5 487 seaport-boulevard redwood-city
  san-mateo-county bay-area)
 (8838 chart-house seafood 2.8 8150 cabrillo-highway montara
  san-mateo-county bay-area)
 (8839 pacific-fresh seafood 3.0 1130 n.-mathilda sunnyvale
  santa-clara-county bay-area)
 (8840 skippers-cafe seafood 2.3 0 x1-moss-landing-bridge
  moss-landing monterey-county monterey)
 (8841 ocean-seafood seafood 2.3 3295 el-camino-real palo-alto
  santa-clara-county bay-area)
 (8842 hayes-street-grill seafood 3.4 324 hayes-st san-francisco
  san-francisco-county bay-area)
 (8843 anchorage-seafood seafood 2.3 5800 shellmound-st emeryville
  alameda-county bay-area)
 (8844 hs-lordships-restaurant seafood 2.8 199 seawall-drive berkeley
  alameda-county bay-area)
 (8845 anchorage-seafood seafood 2.3 5800 shellmound-st emeryville
  alameda-county bay-area)
 (8846 red-crane seafood 2.7 1115 clement san-francisco
  san-francisco-county bay-area)
 (8847 bubba-gump-shrimp-co. seafood 2.3 720 cannery-row monterey
  monterey-county monterey)
 (8848 white-dove seafood 3.2 1151 lincoln san-jose santa-clara-county
  bay-area)
 (8849 warehouse-cafe seafood 2.8 0 lakes-drive port-costa unknown
  unknown)
 (8850 johns-grill seafood 3.5 nil nil san-francisco
  san-francisco-county bay-area)
 (8851 creo-la. seafood 3.9 344 el-camino-real san-carlos
  san-mateo-county bay-area)
 (8852 bar-restaurant-the-quarterdeck seafood 2.7 718 x14th-st.
  san-francisco san-francisco-county bay-area)
 (8853 bar-restaurant-the-quarterdeck seafood 2.7 718 x14th-st.
  san-francisco san-francisco-county bay-area)
 (8854 sardine-factory seafood 3.0 701 wave-st monterey monterey-county
  monterey)
 (8855 butterfields-seafood seafood 2.7 202 townsend-st.-at-3rd
  san-francisco san-francisco-county bay-area)
 (8856 humphreys seafood 2.7 1 marina antioch contra-costa-county
  bay-area)
 (8857 old-fishermans-grotto-restaurant-&-seafood-market seafood 2.7 0
  fishermans-warf monterey monterey-county monterey)
 (8858 scomas seafood 2.7 588 bridgeway sausalito unknown bay-area)
 (8859 fisherman-restaurant seafood 2.7 1492 bayshore-hwy. burlingame
  san-mateo-county bay-area)
 (8860 hyde-street-seafood-seafood-house-&-raw-bar seafood 3.8 0
  unknown san-francisco san-francisco-county bay-area)
 (8861 plouf seafood 3.0 40 belden-lane san-francisco
  san-francisco-county bay-area)
 (8862 stagnaro-bros-seafood seafood 2.7 320 washington-st santa-cruz
  santa-cruz-county bay-area)
 (8863 farallon seafood 2.7 450 post-st san-francisco
  san-francisco-county bay-area)
 (8864 heavenly-hot-restaurant shabu-shabu 2.3 4627 geary-blvd
  san-francisco san-francisco-county bay-area)
 (8865 singapore-malaysian singaporean 2.0 836 clement-st san-francisco
  san-francisco-county bay-area)
 (8866 singapore-orchid-cafe-&-restaurant singaporean 2.0 1408 clement
  san-francisco san-francisco-county bay-area)
 (8867 straits-cafe singaporean 3.3 3300 geary-blvd. san-francisco
  san-francisco-county bay-area)
 (8868 s&b-soul-food soul 2.7 637 south-b-st san-mateo san-mateo-county
  bay-area)
 (8869 southern-exposure southern 2.0 10505 highway-9 ben-lomond
  santa-cruz-county bay-area)
 (8870 southern-kitchen southern 2.7 337 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (8871 left-at-albuquerque southwestern 3.6 1875 s.-bascom-avenue
  campbell santa-clara-county bay-area)
 (8872 cacti-restaurant-and-bar southwestern 3.3 1200 grant-avenue
  novato marin-county bay-area)
 (8873 dos-coyotes southwestern 3.7 0 marketplace davis yolo-county
  sacramento-area)
 (8874 iberia spanish 3.1 190 ladera-alpine-rd portola-valley
  san-mateo-county bay-area)
 (8875 alejandros-reestaurant spanish 2.4 1840 clement san-francisco
  san-francisco-county bay-area)
 (8876 cafe-picaro spanish 3.0 3120 x16th san-francisco
  san-francisco-county bay-area)
 (8877 esperpento-restaurant spanish 2.9 0 unknown san-francisco
  san-francisco-county bay-area)
 (8878 sol-y-luna-restaurante spanish 3.9 475 sacramento san-francisco
  san-francisco-county bay-area)
 (8879 bandidos-of-the-sea-cafe spanish 2.8 31014 union-city-blvd
  union-city alameda-county bay-area)
 (8880 timos spanish 2.8 842 valencia-st.-between-20th-and-19th-sts.
  san-francisco san-francisco-county bay-area)
 (8881 la-bodega spanish 2.7 1 block-east-of-grant-&-green-intersection
  san-francisco san-francisco-county bay-area)
 (8882 bolero spanish 2.0 125 e.-sir-francis-drake-blvd. larkspur
  marin-county bay-area)
 (8883 tazza spanish 3.0 234 s.-b-st san-mateo san-mateo-county
  bay-area)
 (8884 timos-norte spanish 2.7 900 north-point san-francisco
  san-francisco-county bay-area)
 (8885 cafe-reveillon spanish 2.0 436 main-st. pleasanton
  alameda-county bay-area)
 (8886 barcelona spanish 2.0 0 st san-francisco san-francisco-county
  bay-area)
 (8887 barcelona-restaurant spanish 3.0 7 spring-st san-francisco
  san-francisco-county bay-area)
 (8888 picassos spanish 2.5 0 first-st san-jose santa-clara-county
  bay-area)
 (8889 alegrias spanish-tapas 2.7 2018 lombard-st. san-francisco
  san-francisco-county bay-area)
 (8890 gold-coast-grill steak 3.2 1901 park-st alameda alameda-county
  bay-area)
 (8891 amys-copper-skillet steak 2.0 301 e-18th-st antioch
  contra-costa-county bay-area)
 (8892 carrows-hickory-chip-restauran steak 2.0 2430 mahogany-way
  antioch contra-costa-county bay-area)
 (8893 down-home-texas-barbeque steak 2.0 3313 tabora-dr antioch
  contra-costa-county bay-area)
 (8894 down-home-texas-barbeque steak 2.3 3010 delta-fair-blvd antioch
  contra-costa-county bay-area)
 (8895 georges-rib-palace steak 2.0 2734 w-tregallas-rd antioch
  contra-costa-county bay-area)
 (8896 hi-top-sports-grills steak 2.0 758 primrose-ln benicia
  solano-county bay-area)
 (8897 everett-&-jones-barbeque steak 2.8 0 pablo-ave berkeley
  alameda-county bay-area)
 (8898 k-c-bar-b steak 2.0 2613 san-pablo-ave berkeley alameda-county
  bay-area)
 (8899 smoke-house steak 3.0 3115 telegraph-ave berkeley alameda-county
  bay-area)
 (8900 southern-select-gourmet-bbq steak 2.0 1408 x8th-st berkeley
  alameda-county bay-area)
 (8901 steves-bar-b-que steak 3.3 2521 durant-ave-ste-e berkeley
  alameda-county bay-area)
 (8902 wigs-bar-b-q-kitchen steak 2.0 3237 sacramento-st berkeley
  alameda-county bay-area)
 (8903 down-home-texas-barbeque steak 2.0 8335 brentwood-blvd-ste-c
  brentwood contra-costa-county bay-area)
 (8904 sweeney steak 2.3 301 oak-st brentwood contra-costa-county
  bay-area)
 (8905 harris-apple-ranch steak 2.0 2181 prestwick-dr byron unknown
  bay-area)
 (8906 speckmans steak 2.0 1880 lincoln-ave calistoga napa-county
  napa-valley)
 (8907 barneys-hickory-pit steak 2.7 3446 clayton-rd concord
  contra-costa-county bay-area)
 (8908 brau-haus steak 2.0 108 sun-valley-mall concord
  contra-costa-county bay-area)
 (8909 kristina-skillet steak 2.0 4401 clayton-rd concord
  contra-costa-county bay-area)
 (8910 outback-steakhouse steak 3.4 150 longbrook-wy pleasant-hill
  contra-costa-county bay-area)
 (8911 paragon-steakhouse steak 3.4 1400 willow-pass-rd concord
  contra-costa-county bay-area)
 (8912 great-steak-&-fry steak 2.0 72 serramonte-ctr-no.-a daly-city
  san-mateo-county bay-area)
 (8913 caspers-cherokee-sirloin-room steak 2.3 4625 nicols-rd eagan
  unknown unknown)
 (8914 l-v-house-of-barbeque steak 2.0 2055 harper-st el-cerrito
  contra-costa-county bay-area)
 (8915 dougs-bar-ba-cue steak 3.5 3600 san-pablo-ave emeryville
  alameda-county bay-area)
 (8916 a-&-w-family-restaurant steak 2.0 3322 colonial-ct fairfield
  solano-county bay-area)
 (8917 happy-steak-restaurant steak 2.0 1767 n-texas-st fairfield
  solano-county bay-area)
 (8918 lisas-lounge-&-grill steak 2.0 2554 gulf-dr fairfield
  solano-county bay-area)
 (8919 stuart-andersons-blck-angus steak 2.7 1299 chess-dr foster-city
  san-mateo-county bay-area)
 (8920 pauls-family-steak-house steak 2.0 1970 freedom-blvd freedom
  unknown unknown)
 (8921 becks-steak-house steak 2.0 3701 peralta-blvd fremont
  alameda-county bay-area)
 (8922 black-angus-restaurant steak 2.4 3225 walnut-ave fremont
  alameda-county bay-area)
 (8923 bobs-hoagy-steak steak 2.0 37404 fremont-blvd fremont
  alameda-county bay-area)
 (8924 mission-hof-brau-cafe steak 2.0 39620 mission-blvd fremont
  alameda-county bay-area)
 (8925 nous-best-donut steak 2.0 35766 fremont-blvd fremont
  alameda-county bay-area)
 (8926 bobs-hoogy-steak steak 2.0 29623 mission-blvd hayward
  alameda-county bay-area)
 (8927 brandin-iron steak 1.7 171 w-tennyson-rd hayward alameda-county
  bay-area)
 (8928 zorns-family-restaurant steak 2.0 22500 mission-blvd hayward
  alameda-county bay-area)
 (8929 peggs-western-grill-&-bakery steak 2.5 3210 pacheco-blvd
  martinez contra-costa-county bay-area)
 (8930 brown-street-grill steak 3.0 1300 brown-st napa napa-county
  napa-valley)
 (8931 hickeys-cafe-and-grill steak 2.0 494 soscol-ave napa napa-county
  napa-valley)
 (8932 jonesys-famous-steak-house-na steak 2.3 2044 airport-rd napa
  napa-county napa-valley)
 (8933 ksc-smokehouse steak 2.0 4084 byway-st-e napa napa-county
  napa-valley)
 (8934 cattlemens-restaurant steak 3.0 35000 newark-blvd newark
  alameda-county bay-area)
 (8935 guberas-hofbrau steak 2.0 5810 jarvis-ave newark alameda-county
  bay-area)
 (8936 harolds-famous-barbeque steak 2.3 36601 newark-blvd newark
  alameda-county bay-area)
 (8937 the-best-mongolian-b-b steak 2.0 36565 newark-blvd newark
  alameda-county bay-area)
 (8938 b-bs-barbeque steak 2.0 3017 san-pablo-ave oakland
  alameda-county bay-area)
 (8939 circle-t-bbq steak 2.0 6101 telegraph-ave oakland alameda-county
  bay-area)
 (8940 court-hof-brau steak 2.0 126 x14th-st oakland alameda-county
  bay-area)
 (8941 downtown-food-bar-b-que steak 2.0 1971 telegraph-ave oakland
  alameda-county bay-area)
 (8942 everett-&-jones-barbeque steak 1.6 4535 redding-st oakland
  alameda-county bay-area)
 (8943 first-and-ten-hof-brau steak 2.0 4390 telegraph-ave oakland
  alameda-county bay-area)
 (8944 flints-barbeque steak 3.8 6609 shattuck-ave oakland
  alameda-county bay-area)
 (8945 flints-barbeque steak 3.3 6672 e-14th-st oakland alameda-county
  bay-area)
 (8946 grand-ave-grill steak 2.0 146 grand-ave oakland alameda-county
  bay-area)
 (8947 mc-coys-bar-b-q steak 2.0 6432 e-14th-st oakland alameda-county
  bay-area)
 (8948 mr-bos-steaks steak 2.0 3655 piedmont-ave oakland alameda-county
  bay-area)
 (8949 embers-fireside-grill steak 2.0 525 moraga-way orinda
  contra-costa-county bay-area)
 (8950 c-&-cs-bar-b-que steak 3.0 785 railroad pittsburg
  contra-costa-county bay-area)
 (8951 flamingo-grille steak 2.0 2941 -d-harbor-st pittsburg
  contra-costa-county bay-area)
 (8952 black-angus steak 2.0 3195 n-main-st pleasant-hill
  contra-costa-county bay-area)
 (8953 carrows-hickory-chip-restauran steak 2.0 624 contra-costa-blvd
  pleasant-hill contra-costa-county bay-area)
 (8954 stuart-andersons-black-angus steak 2.0 5930 stoneridge-dr
  pleasanton alameda-county bay-area)
 (8955 peoples-choice-bar-b-q steak 2.0 3419 cutting-blvd richmond
  contra-costa-county bay-area)
 (8956 alfreds-steak-house steak 3.6 886 broadway san-francisco
  san-francisco-county bay-area)
 (8957 lehrs-greenhouse-restaurant steak 2.0 750 sutter san-francisco
  san-francisco-county bay-area)
 (8958 ruths-chris-steak-house steak 3.4 1700 california san-francisco
  san-francisco-county bay-area)
 (8959 bold-knight-cattlemen-restaurant steak 3.2 1600 s-1st-st
  san-jose santa-clara-county bay-area)
 (8960 contreras-&-munoz-steak-house steak 2.0 3378 monterey-hwy
  san-jose santa-clara-county bay-area)
 (8961 edenvale-steak-house steak 2.0 5272 monterey-hwy-no.-e san-jose
  santa-clara-county bay-area)
 (8962 big-joes-broiler steak 2.0 794 e-14th-st san-leandro
  alameda-county bay-area)
 (8963 hoagy-steak steak 2.0 691 e-14th-st san-leandro alameda-county
  bay-area)
 (8964 jimmy-lanes-barbeque steak 2.0 699 lewelling-blvd-ste-180
  san-leandro alameda-county bay-area)
 (8965 willy-dillys steak 2.0 599 macarthur-blvd san-leandro
  alameda-county bay-area)
 (8966 black-angus steak 2.3 15800 hesperian-blvd san-lorenzo
  alameda-county bay-area)
 (8967 bonanza-sirloin-pit steak 2.0 1855 el-camino-real santa-clara
  santa-clara-county bay-area)
 (8968 ds-bar-bq steak 2.0 925 harlquin-way suisun-city solano-county
  bay-area)
 (8969 sundance-grille steak 2.0 420 executive-ct-n-ste-g suisun-city
  solano-county bay-area)
 (8970 feedlot steak 2.8 6971 airline-hwy. tres-pinos unknown unknown)
 (8971 bunts-texas-style-bar-b-que steak 2.0 2909 sonoma-blvd vallejo
  solano-county bay-area)
 (8972 caesars-dinner-house steak 2.0 315 tennessee-st vallejo
  solano-county bay-area)
 (8973 pack-jack-bar-b-que-restaurant steak 2.0 1624
  fairgrounds-dr-ste-b vallejo solano-county bay-area)
 (8974 jacks-steakhouse steak 3.2 17535 monterey-rd morgan-hill
  santa-clara-county bay-area)
 (8975 korean-barbeque steak 2.0 1722 university-ave berkeley
  alameda-county bay-area)
 (8976 outback-steak-house steak 3.0 0 unknown cupertino
  santa-clara-county bay-area)
 (8977 cattlemens-restaurant steak 2.0 2882 kitty-hawk-rd livermore
  alameda-county bay-area)
 (8978 charlie-browns steak 3.0 680 bollinger-canyon-rd san-ramon
  contra-costa-county bay-area)
 (8979 mr-steak steak 2.0 2323 fairfield-ave-36-36 fairfield
  solano-county bay-area)
 (8980 jonesys-famous-steak-house steak 2.0 2030 airport-rd napa
  napa-county napa-valley)
 (8981 cattlemens-restaurants steak 2.0 5012 petaluma-blvd-n petaluma
  sonoma-county bay-area)
 (8982 cattlemens-restaurants steak 2.0 250 denton-ave santa-rosa
  sonoma-county bay-area)
 (8983 cattlemens-restaurants steak 2.0 2400 midway-dr santa-rosa
  sonoma-county bay-area)
 (8984 saddle-&-sirloin-cattlemans steak 2.0 2400 midway-dr santa-rosa
  sonoma-county bay-area)
 (8985 happy-steak steak 2.0 888 alamo-dr vacaville solano-county
  bay-area)
 (8986 geary-steakhouse steak 2.0 901 larkin-st san-francisco
  san-francisco-county bay-area)
 (8987 geneva-steak-house steak 2.0 5130 mission-st san-francisco
  san-francisco-county bay-area)
 (8988 jax-steak-house steak 2.0 171 ofarrell-st san-francisco
  san-francisco-county bay-area)
 (8989 palace-steak-house steak 2.0 3047 mission-st san-francisco
  san-francisco-county bay-area)
 (8990 tads-steak-restaurant steak 2.7 120 powell-st san-francisco
  san-francisco-county bay-area)
 (8991 birks-great-american-grill steak 3.1 3955 freedom-circle
  santa-clara santa-clara-county bay-area)
 (8992 mortons-steak-house steak 3.9 400 post-at-powell san-francisco
  san-francisco-county bay-area)
 (8993 mister-steer steak 3.0 2367 el-camino-real santa-clara
  santa-clara-county bay-area)
 (8994 chart-house steak 3.0 115 north-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (8995 charley-browns steak 2.5 1890 powell-st. emeryville
  alameda-county bay-area)
 (8996 palbys steak 2.5 3860 napa-vallejo-hwy american-canyon unknown
  bay-area)
 (8997 senor-grill-at-blackhawk-plaza steak 2.5 3680
  blackhawk-plaza-cir danville contra-costa-county bay-area)
 (8998 bighorn-grill steak 3.0 2410 san-ramon-valley-blvd. san-ramon
  contra-costa-county bay-area)
 (8999 redwood-steakhouse steak 3.0 125 flemming-towne-center vallejo
  solano-county bay-area)
 (9000 johns-grill steak 3.5 nil nil san-francisco san-francisco-county
  bay-area)
 (9001 bar-restaurant-the-quarterdeck steak 2.7 718 x14th-st.
  san-francisco san-francisco-county bay-area)
 (9002 bar-restaurant-the-quarterdeck steak 2.7 718 x14th-st.
  san-francisco san-francisco-county bay-area)
 (9003 spin-a-yarn steak 3.0 0 unknown fremont alameda-county bay-area)
 (9004 charley-browns steak 1.7 116 n.-mathilda-ave sunnyvale
  santa-clara-county bay-area)
 (9005 the-steak-house steak 2.3 101 brentwood south-san-francisco
  san-mateo-county bay-area)
 (9006 universal-cafe steak 2.3 416 barber-lane milpitas
  santa-clara-county bay-area)
 (9007 manhattans steak 2.0 0 rd cupertino santa-clara-county bay-area)
 (9008 palbays steak 2.5 3860 napa-vallejo-hwy american-canyon unknown
  bay-area)
 (9009 sushi-sho sushi 2.7 1645 solano-ave berkeley alameda-county
  bay-area)
 (9010 sushi-banzai sushi 2.0 1019 camelia-st berkeley alameda-county
  bay-area)
 (9011 sushi-california sushi 2.0 2033 martin-luther-king-jr-way
  berkeley alameda-county bay-area)
 (9012 sushi-ko-berkeley sushi 2.7 2064 shattuck-sq berkeley
  alameda-county bay-area)
 (9013 isobune-sushi sushi 3.3 1451 burlingame-ave burlingame
  san-mateo-county bay-area)
 (9014 sushi-zono sushi 3.2 831 w-hamilton-ave campbell
  santa-clara-county bay-area)
 (9015 yusan-sushi sushi 3.3 11866 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (9016 sushi-main-street sushi 3.9 696 mill-st half-moon-bay
  san-mateo-county bay-area)
 (9017 sushi-kei sushi 2.7 407 broadway millbrae san-mateo-county
  bay-area)
 (9018 sushi-lovers-japanese-cuisine sushi 3.3 0 calaveras milpitas
  santa-clara-county bay-area)
 (9019 masas-sushi-&-sandwiches sushi 2.9 400 san-antonio-rd
  mountain-view santa-clara-county bay-area)
 (9020 nippon-sushi sushi 2.0 0 drive-and-highway-35 mountain-view
  santa-clara-county bay-area)
 (9021 yakko-restaurant sushi 3.4 975 w-dana-st mountain-view
  santa-clara-county bay-area)
 (9022 mr-sushi sushi 2.7 532 grand-ave oakland alameda-county
  bay-area)
 (9023 ta-ke-sushi-restaurant sushi 2.3 357 grand-ave oakland
  alameda-county bay-area)
 (9024 toshi-sushi-restaurant sushi 2.8 6100 la-salle-ave oakland
  alameda-county bay-area)
 (9025 sushi-sushi sushi 2.0 614 farallon-ave pacifica san-mateo-county
  bay-area)
 (9026 fuki-sushi sushi 3.6 4119 el-camino-real palo-alto
  santa-clara-county bay-area)
 (9027 higashi-west sushi 3.9 636 emerson-st palo-alto
  santa-clara-county bay-area)
 (9028 sushi-house sushi 2.3 158 town-and-country-vlg palo-alto
  santa-clara-county bay-area)
 (9029 sushi-ya-restaurant sushi 3.4 380 university-ave palo-alto
  santa-clara-county bay-area)
 (9030 haruos-place sushi 2.7 3120 santa-rita-rd-ste-g pleasanton
  alameda-county bay-area)
 (9031 mijouri-sushi-bune-restaurant sushi 3.3 1230
  el-camino-real-no.-b san-bruno san-mateo-county bay-area)
 (9032 ganko-sushi-fast-food sushi 3.3 0 unknown san-carlos
  san-mateo-county bay-area)
 (9033 ebisu-restaurant sushi 4.0 1283 x9th-avenue san-francisco
  san-francisco-county bay-area)
 (9034 godzila-sushi sushi 2.6 1800 divisadero san-francisco
  san-francisco-county bay-area)
 (9035 goemon-japanese-restaurant sushi 2.7 1524 irving san-francisco
  san-francisco-county bay-area)
 (9036 sushi-paradiso sushi 2.0 1475 polk san-francisco
  san-francisco-county bay-area)
 (9037 california-sushi-&-grill sushi 3.3 1 e-san-fernando-st san-jose
  santa-clara-county bay-area)
 (9038 california-sushi-and-grill sushi 2.7 2050 gateway-pl san-jose
  santa-clara-county bay-area)
 (9039 minato-sushi sushi 2.8 617 n-6th-st san-jose santa-clara-county
  bay-area)
 (9040 sendo-sushi sushi 2.0 1121 di-napoli-dr san-jose
  santa-clara-county bay-area)
 (9041 sushi-masa sushi 3.0 5363 camden-ave-no.-102 san-jose
  santa-clara-county bay-area)
 (9042 sushi-sams-edomata sushi 3.8 218 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (9043 kobe-restaurant sushi 3.0 2086 el-camino-real santa-clara
  santa-clara-county bay-area)
 (9044 sushi-o-sushi-japanese-cuisine sushi 2.7 2777 el-camino-real
  santa-clara santa-clara-county bay-area)
 (9045 truya-sushi sushi 2.0 3431 el-camino-real santa-clara
  santa-clara-county bay-area)
 (9046 yuki-sushi sushi 2.8 1827 pruneridge-ave santa-clara
  santa-clara-county bay-area)
 (9047 naka-sushi-restaurant sushi 2.7 851 x41st-ave santa-cruz
  santa-cruz-county bay-area)
 (9048 hana-sushi-japanese-restaurant sushi 2.0 1647 hollenbeck-ave
  sunnyvale santa-clara-county bay-area)
 (9049 kaga-sushi sushi 2.7 1082 e-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (9050 we-be-sushi sushi 2.5 592 e-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (9051 hakata-sushi sushi 2.0 1097 s-green-valley-rd watsonville
  santa-cruz-county bay-area)
 (9052 pink-godzilla sushi 3.5 830 x41st-ave santa-cruz
  santa-cruz-county bay-area)
 (9053 kame-sushi-restaurant sushi 2.0 1825 post-st san-francisco
  san-francisco-county bay-area)
 (9054 sushi-a-restaurant sushi 3.7 1737 buchanan-st san-francisco
  san-francisco-county bay-area)
 (9055 wayo-sushi-restaurant sushi 2.0 1407 van-ness-ave san-francisco
  san-francisco-county bay-area)
 (9056 we-be-sushi sushi 2.3 1071 valencia-st san-francisco
  san-francisco-county bay-area)
 (9057 we-be-sushi sushi 2.5 3226 geary-blvd san-francisco
  san-francisco-county bay-area)
 (9058 we-be-sushi sushi 2.0 94 judah-st san-francisco
  san-francisco-county bay-area)
 (9059 sushi-ran sushi 3.1 107 caledonia sausalito unknown bay-area)
 (9060 hatoba-sushi sushi 3.3 1099 regani-dr. concord
  contra-costa-county bay-area)
 (9061 may-japanese-sushi-bento sushi 2.0 2204 x22nd oakland
  alameda-county bay-area)
 (9062 sushi-a-float sushi 2.2 2014 shattuck berkeley alameda-county
  bay-area)
 (9063 hana-cable-sushi sushi 2.0 0 center san-francisco
  san-francisco-county bay-area)
 (9064 umeko sushi 2.0 0 center san-francisco san-francisco-county
  bay-area)
 (9065 kuishnbo sushi 2.0 0 center-no.260 san-francisco
  san-francisco-county bay-area)
 (9066 tanpopo sushi 3.0 0 center-no.280 san-francisco
  san-francisco-county bay-area)
 (9067 seto-japanese-cuisine sushi 3.2 511 borregas-ave sunnyvale
  santa-clara-county bay-area)
 (9068 akira sushi 2.3 819 x4th-st san-rafael marin-county bay-area)
 (9069 kotoburi-japanese-restaurant sushi 2.2 3920 piedmont-ave oakland
  alameda-county bay-area)
 (9070 kitahama sushi 2.7 974 s.-saratoga-sunnyvale-rd. san-jose
  santa-clara-county bay-area)
 (9071 mobo-sushi sushi 2.0 105 s.-river-st. santa-cruz
  santa-cruz-county bay-area)
 (9072 kaimuki-grill sushi 2.7 103 south-el-camino-real san-mateo
  san-mateo-county bay-area)
 (9073 fuji-buffet sushi 3.0 nil nil concord contra-costa-county
  bay-area)
 (9074 tokyo-sushi-ya sushi 3.0 411 e.-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (9075 annas-dive swedish 3.0 145 valle-vista-drive danville
  contra-costa-county bay-area)
 (9076 continental-garden swiss 2.3 2377 shattuck-ave berkeley
  alameda-county bay-area)
 (9077 matterhorn-restaurant swiss 2.7 2323 van-ness-avenue
  san-francisco san-francisco-county bay-area)
 (9078 old-swiss-house swiss 3.0 0 39 san-francisco
  san-francisco-county bay-area)
 (9079 lugano-swiss-bistro swiss 3.0 0 barnyard carmel monterey-county
  monterey)
 (9080 daniels-fine-food-&-all-that-jazz swiss 3.0 827 san-pablo-avenue
  albany alameda-county bay-area)
 (9081 sunset-star-restaurant szechuan 3.0 754 kirkham-st.-12th-ave
  san-francisco san-francisco-county bay-area)
 (9082 uncle-chungs-szechuan szechuan 2.7 2550 appian-way pinole
  contra-costa-county bay-area)
 (9083 taste-of-china szechuan 3.5 0 unknown san-jose
  santa-clara-county bay-area)
 (9084 kings-cafe szechuan 2.0 4228 foothill-blvd. oakland
  alameda-county bay-area)
 (9085 ambrosia-garden taiwanese 3.2 843 san-pablo-ave albany
  alameda-county bay-area)
 (9086 taipei-restaurant taiwanese 2.0 2666 ocean-ave san-francisco
  san-francisco-county bay-area)
 (9087 taiwan-restaurant taiwanese 2.0 289 columbus-ave san-francisco
  san-francisco-county bay-area)
 (9088 taiwan-restaurant taiwanese 2.2 445 clement-st san-francisco
  san-francisco-county bay-area)
 (9089 coriya taiwanese 1.8 852 clement-st san-francisco
  san-francisco-county bay-area)
 (9090 formosa-coffee-restaurant taiwanese 2.0 1125 clement-st
  san-francisco san-francisco-county bay-area)
 (9091 zarzuela tapas 3.3 2000 hyde san-francisco san-francisco-county
  bay-area)
 (9092 esperpento tapas 2.9 22 and-valencia san-francisco
  san-francisco-county bay-area)
 (9093 timos tapas 2.8 0 unknown san-francisco san-francisco-county
  bay-area)
 (9094 special-teas-&-heirlooms tea 2.7 520 main-st pleasanton
  alameda-county bay-area)
 (9095 alameda-mexicali-rose tex-mex 2.0 1619 webster-st alameda
  alameda-county bay-area)
 (9096 chevys-mexican-restaurant tex-mex 3.0 2400 mariner-square
  alameda alameda-county bay-area)
 (9097 chilis tex-mex 2.0 1501 concord-ave concord contra-costa-county
  bay-area)
 (9098 texas-bar-b-q-company tex-mex 2.3 0 x1-box-20 la-honda
  san-mateo-county bay-area)
 (9099 armadillo-willys-bbq tex-mex 3.4 1031 n-san-antonio-rd los-altos
  santa-clara-county bay-area)
 (9100 chilis tex-mex 3.0 300 w-calaveras-blvd milpitas
  santa-clara-county bay-area)
 (9101 chilis-rohnert-park tex-mex 2.7 2980 stevens-creek-blvd-bldg-801
  san-jose santa-clara-county bay-area)
 (9102 chilis tex-mex 2.8 3591 el-camino-real santa-clara
  santa-clara-county bay-area)
 (9103 el-paso-cafe tex-mex 2.0 1407 el-camino-real mountain-view
  santa-clara-county bay-area)
 (9104 amarin-thai-cuisine thai 3.2 1332 park-st-no.-c alameda
  alameda-county bay-area)
 (9105 cafe-thai-cuisine thai 2.0 1145 sand-beach-pl alameda
  alameda-county bay-area)
 (9106 thai-place thai 2.3 1405 webster-st alameda alameda-county
  bay-area)
 (9107 jitr-thai-restaurant thai 2.3 115 alamo-plz-no.-c alamo
  contra-costa-county bay-area)
 (9108 bua-luang thai 2.7 1166 solano-ave albany alameda-county
  bay-area)
 (9109 thai-thai thai 2.8 1045 san-pablo-ave albany alameda-county
  bay-area)
 (9110 thaiderm-restaurant thai 2.5 513 w-17th-st antioch
  contra-costa-county bay-area)
 (9111 bangkok-west thai 3.2 2505 cabrillo-college-dr aptos
  santa-cruz-county bay-area)
 (9112 sala-thai-restaurant thai 3.0 807 x1st-st benicia solano-county
  bay-area)
 (9113 berkeley-thai-house thai 2.8 2511 channing-way berkeley
  alameda-county bay-area)
 (9114 boran-thai-restaurant thai 3.0 1892 solano-ave berkeley
  alameda-county bay-area)
 (9115 cha-am thai 3.3 1543 shattuck-ave berkeley alameda-county
  bay-area)
 (9116 dara-thai-lao-cusine thai 3.0 1549 shattuck-ave berkeley
  alameda-county bay-area)
 (9117 kanit-thai-cuisine thai 3.0 2037 shattuck-ave berkeley
  alameda-county bay-area)
 (9118 nakapan thai 3.1 1921 martin-luther-king-jr-way berkeley
  alameda-county bay-area)
 (9119 plearn-thai-cuisine thai 2.9 2050 university-ave berkeley
  alameda-county bay-area)
 (9120 racha-cafe thai 2.7 2516 telegraph-ave berkeley alameda-county
  bay-area)
 (9121 satay-house thai 2.0 2000 durant-ave-apt-303 berkeley
  alameda-county bay-area)
 (9122 siam-cuisine-inc thai 2.8 1181 university-ave berkeley
  alameda-county bay-area)
 (9123 sweet-basil-thai-cuisine thai 2.8 1736 solano-ave berkeley
  alameda-county bay-area)
 (9124 thai-dishes thai 2.6 1700 shattuck-ave berkeley alameda-county
  bay-area)
 (9125 won-thai-cuisine thai 3.4 2449 sacramento-st berkeley
  alameda-county bay-area)
 (9126 your-place-thai-cuisine thai 3.0 1267 university-ave berkeley
  alameda-county bay-area)
 (9127 narin-thai-cuisine thai 2.7 231 park-rd burlingame
  san-mateo-county bay-area)
 (9128 bangkok-kitchen thai 2.5 1980 galindo-st concord
  contra-costa-county bay-area)
 (9129 woung-luang-thai-cuisine thai 3.0 1965 mount-diablo-st concord
  contra-costa-county bay-area)
 (9130 bangkok-garden thai 2.0 824 lausanne-ave daly-city
  san-mateo-county bay-area)
 (9131 bangkok-garden-thai-cuisine thai 2.0 824 lausanne-ave daly-city
  san-mateo-county bay-area)
 (9132 nattika-thai-cuisine thai 3.1 301 hartz-ave-ste-106 danville
  contra-costa-county bay-area)
 (9133 thai-delight-cuisine thai 2.0 8937 san-ramon-rd dublin
  alameda-county bay-area)
 (9134 krung-tep thai 3.2 11224 san-pablo-ave el-cerrito
  contra-costa-county bay-area)
 (9135 siris-house-thai-restaurant thai 2.0 1811 elm-st el-cerrito
  contra-costa-county bay-area)
 (9136 bangkok-thai-cuisine thai 2.7 5800 shellmound-st emeryville
  alameda-county bay-area)
 (9137 bangkok-thai-cuisine thai 2.0 1924 n-texas-st fairfield
  solano-county bay-area)
 (9138 s-&-l-asian-mart/s-&-l-thai thai 2.0 3335 el-rancho-way
  fairfield solano-county bay-area)
 (9139 my-thai thai 3.0 34265 fremont-blvd. fremont alameda-county
  bay-area)
 (9140 bangkok-house-restaurant thai 3.0 225 cabrillo-hwy-s
  half-moon-bay san-mateo-county bay-area)
 (9141 mannas-thai-cuisine thai 3.2 27167 mission-blvd hayward
  alameda-county bay-area)
 (9142 payathai-restaurant thai 2.5 1149 b-st hayward alameda-county
  bay-area)
 (9143 thai-garden-restaurant thai 3.0 20955 mission-blvd hayward
  alameda-county bay-area)
 (9144 thai-culinary-restaurant thai 2.8 905 east-st hollister
  san-benito-county northern-california)
 (9145 chaiyos-thai-cuisine thai 2.0 3555 mount-diablo-blvd-no.-b
  lafayette contra-costa-county bay-area)
 (9146 thai-cuisine-of-los-altos thai 2.8 242 state-st los-altos
  santa-clara-county bay-area)
 (9147 siam-thai-cuisine thai 2.7 220 e-main-st los-gatos
  santa-clara-county bay-area)
 (9148 siam-garden thai 3.1 1143 crane-st-no.-d menlo-park
  san-mateo-county bay-area)
 (9149 dusit-thai-restaurant thai 2.0 321 elder-ave millbrae
  san-mateo-county bay-area)
 (9150 the-thai-stick thai 2.0 301 el-camino-real millbrae
  san-mateo-county bay-area)
 (9151 thai-house-restaurant thai 2.6 265 w-calaveras-blvd milpitas
  santa-clara-county bay-area)
 (9152 bangkok-spoon thai 1.3 702 villa-st mountain-view
  santa-clara-county bay-area)
 (9153 thai-kitchen-resturant thai 2.0 1222 trancas-st napa napa-county
  napa-valley)
 (9154 east-bay-thai-cuisine thai 3.1 5552 thornton-ave newark
  alameda-county bay-area)
 (9155 thai-orchid-cuisine thai 2.5 6180 jarvis-ave-ste-a newark
  alameda-county bay-area)
 (9156 chao-thai-cuisine thai 3.0 482 lake-park-ave oakland
  alameda-county bay-area)
 (9157 chiangrai-thai-cuisine thai 2.7 6200 antioch-st. oakland
  alameda-county bay-area)
 (9158 de-vanni thai 3.5 5301 college-avenue oakland alameda-county
  bay-area)
 (9159 nok-keo-thai-restaurant thai 2.0 210 broadway oakland
  alameda-county bay-area)
 (9160 pearl-of-siam thai 3.0 5498 college-ave oakland alameda-county
  bay-area)
 (9161 phnom-penh-house thai 3.3 251 x8th-st oakland alameda-county
  bay-area)
 (9162 saysetha-restaurant thai 2.3 6230 telegraph-ave oakland
  alameda-county bay-area)
 (9163 thai-bai thai 3.0 5736 thornhill-dr-no.-104 oakland
  alameda-county bay-area)
 (9164 thornhill-cafe thai 3.0 5761 thornhill-dr oakland alameda-county
  bay-area)
 (9165 siam-orchid thai 2.8 23 orinda-way-no.-h orinda
  contra-costa-county bay-area)
 (9166 pacifica-thai-cuisine thai 2.9 1966 francisco-blvd pacifica
  san-mateo-county bay-area)
 (9167 bangkok-cuisine thai 3.2 407 lytton-ave palo-alto
  santa-clara-county bay-area)
 (9168 siam-royal thai 3.1 338 university-ave palo-alto
  santa-clara-county bay-area)
 (9169 thai-city-restaurant thai 2.9 3691 el-camino-real palo-alto
  santa-clara-county bay-area)
 (9170 chiangrai-thai-cuisine thai 2.0 319 magnolia-ave piedmont
  alameda-county bay-area)
 (9171 boun-thai-restaurant thai 2.0 1569 tara-hills-dr pinole
  contra-costa-county bay-area)
 (9172 bangkok-restaurant thai 2.0 1910 oak-park-blvd pleasant-hill
  contra-costa-county bay-area)
 (9173 thai-palace thai 2.3 41 woodsworth-lane pleasant-hill
  contra-costa-county bay-area)
 (9174 thai-palace-restaurant thai 2.7 41 woodsworth-ln pleasant-hill
  contra-costa-county bay-area)
 (9175 thai-village-restaurant thai 3.2 670 gregory-ln-ste-f
  pleasant-hill contra-costa-county bay-area)
 (9176 lux-thai-cuisine thai 3.4 4301 valley-avenue pleasanton
  alameda-county bay-area)
 (9177 bangkok-bay-thai-cuisine thai 3.7 825 el-camino-real
  redwood-city san-mateo-county bay-area)
 (9178 thai-hut thai 2.0 2761 el-camino-real redwood-city
  san-mateo-county bay-area)
 (9179 woodside-thai-spot thai 3.1 593 woodside-rd redwood-city
  san-mateo-county bay-area)
 (9180 manivanh-thai-restaurant thai 2.0 3019 obrien-rd richmond
  contra-costa-county bay-area)
 (9181 rins-thai-cusine thai 2.7 12200 san-pablo-ave richmond
  contra-costa-county bay-area)
 (9182 sawooei-thai-cuisine thai 2.0 1700 san-benito-st richmond
  contra-costa-county bay-area)
 (9183 thai-orchid thai 3.7 2591 n.-first-st. san-jose
  santa-clara-county bay-area)
 (9184 sinees-thai-bistro thai 3.0 637 laurel-st san-carlos
  san-mateo-county bay-area)
 (9185 thai-best thai 2.0 1500 el-camino-real san-carlos
  san-mateo-county bay-area)
 (9186 basil-thai-restaurant-&-bar thai 2.3 1175 folsom-st
  san-francisco san-francisco-county bay-area)
 (9187 burmas-house-restaurants thai 2.0 720 post san-francisco
  san-francisco-county bay-area)
 (9188 champa-thai-cuisine thai 2.0 5249 mission san-francisco
  san-francisco-county bay-area)
 (9189 dusit-thai-restaurant thai 2.8 3221 mission san-francisco
  san-francisco-county bay-area)
 (9190 gatip-classic-thai-cuisine thai 3.6 2205 lombard san-francisco
  san-francisco-county bay-area)
 (9191 just-thai-restaurant thai 2.0 1532 howard san-francisco
  san-francisco-county bay-area)
 (9192 khoon-chang-thai-cuisine thai 3.0 1901 divisadero san-francisco
  san-francisco-county bay-area)
 (9193 lanna-restaurant thai 2.8 1245 noriega san-francisco
  san-francisco-county bay-area)
 (9194 marnee-thai-restaurant thai 3.3 2225 irving-st. san-francisco
  san-francisco-county bay-area)
 (9195 naree-thai-cuisine thai 2.7 1331 polk san-francisco
  san-francisco-county bay-area)
 (9196 neecha-thai-cuisine thai 2.3 2100 sutter san-francisco
  san-francisco-county bay-area)
 (9197 pad-thai-restaurant thai 2.7 3259 mission san-francisco
  san-francisco-county bay-area)
 (9198 royal-thai-restaurant thai 2.6 951 clement san-francisco
  san-francisco-county bay-area)
 (9199 ruenthai-restaurant thai 1.7 4401 balboa san-francisco
  san-francisco-county bay-area)
 (9200 samui-thai-cuisine thai 2.0 2414 lombard san-francisco
  san-francisco-county bay-area)
 (9201 siam-cafe thai 2.0 807 geary san-francisco san-francisco-county
  bay-area)
 (9202 siam-grill thai 2.0 4248 x18th san-francisco
  san-francisco-county bay-area)
 (9203 swatdee-thai-cuisine thai 2.0 4166 x24th san-francisco
  san-francisco-county bay-area)
 (9204 tamnan-thai-restaurant thai 2.8 1360 x9th-avenue san-francisco
  san-francisco-county bay-area)
 (9205 tasana-thai-restaurant thai 2.5 339 taraval san-francisco
  san-francisco-county bay-area)
 (9206 thai-bar-b-q thai 2.0 1328 x18th san-francisco
  san-francisco-county bay-area)
 (9207 thai-bar-b-q thai 2.0 730 van-ness-avenue san-francisco
  san-francisco-county bay-area)
 (9208 thai-house thai 3.2 151 noe-st. san-francisco
  san-francisco-county bay-area)
 (9209 thai-house-bar-&-cafe thai 2.8 2200 market-st. san-francisco
  san-francisco-county bay-area)
 (9210 thai-spice-restaurant thai 2.3 1730 polk san-francisco
  san-francisco-county bay-area)
 (9211 thai-stick-restaurant thai 2.8 698 post san-francisco
  san-francisco-county bay-area)
 (9212 thailand-restaurant thai 2.0 438 castro san-francisco
  san-francisco-county bay-area)
 (9213 thep-phanom-restaurant thai 3.6 400 waller san-francisco
  san-francisco-county bay-area)
 (9214 thepin-thai-cuisine thai 2.0 298 gough san-francisco
  san-francisco-county bay-area)
 (9215 veecha-thai-cuisine thai 2.0 500 haight san-francisco
  san-francisco-county bay-area)
 (9216 yukol-place-thai-cuisine thai 2.0 3242 scott san-francisco
  san-francisco-county bay-area)
 (9217 bangkok-cuisine thai 3.1 5235 prospect-rd san-jose
  santa-clara-county bay-area)
 (9218 bangkok-taste-thai-restaurant thai 2.0 418 menker-ave san-jose
  santa-clara-county bay-area)
 (9219 high-thai thai 2.9 335 saratoga-ave san-jose santa-clara-county
  bay-area)
 (9220 house-of-siam thai 3.4 55 s-market-st-ste-160 san-jose
  santa-clara-county bay-area)
 (9221 krung-thai-restaurant thai 3.3 1699 w-san-carlos-st san-jose
  santa-clara-county bay-area)
 (9222 rendezvous-saigon thai 2.0 6256 meridian-ave san-jose
  santa-clara-county bay-area)
 (9223 saigon-garden-food-to thai 2.0 61 kenbrook-cir san-jose
  santa-clara-county bay-area)
 (9224 siam-square thai 3.0 1040 willow-st san-jose santa-clara-county
  bay-area)
 (9225 thai-garden-restaurant thai 2.0 0 unknown san-jose
  santa-clara-county bay-area)
 (9226 thai-place-restaurant thai 2.0 1536 w-san-carlos-st san-jose
  santa-clara-county bay-area)
 (9227 thepthai-thai-cuisine thai 2.3 23 n-market-st san-jose
  santa-clara-county bay-area)
 (9228 bow-thai-cafe thai 2.3 43 s-b-st san-mateo san-mateo-county
  bay-area)
 (9229 chao-praya-thai-cuisine thai 2.8 4300 s-el-camino-real san-mateo
  san-mateo-county bay-area)
 (9230 nipa-pon-thai-cuisine thai 3.6 121 w-25th-ave san-mateo
  san-mateo-county bay-area)
 (9231 duang-chanh-thai-restaurant thai 2.0 2037 x23rd-st san-pablo
  contra-costa-county bay-area)
 (9232 thai-kitchen thai 2.6 2416 san-ramon-valley-blvd-no.-140
  san-ramon contra-costa-county bay-area)
 (9233 real-thai-kitchen thai 3.0 1632 seabright-ave santa-cruz
  santa-cruz-county bay-area)
 (9234 thai-house-restaurant thai 2.3 353 soquel-ave santa-cruz
  santa-cruz-county bay-area)
 (9235 star-of-siam thai 3.0 0 unknown soquel unknown bay-area)
 (9236 thai-fast-food thai 2.7 500 n-lawrence-expy-no.-b sunnyvale
  santa-clara-county bay-area)
 (9237 thai-kitchen thai 3.2 31845 alvarado-blvd union-city
  alameda-county bay-area)
 (9238 mai-thai thai 2.8 1414 n-main-st-no.-a walnut-creek
  contra-costa-county bay-area)
 (9239 thai-spoons thai 3.0 909 w.-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (9240 thai-basil thai 3.6 101 s.-murphy-avenue sunnyvale
  santa-clara-county bay-area)
 (9241 tubtim-thai-cuisine thai 4.0 2121 clement-st. san-francisco
  san-francisco-county bay-area)
 (9242 regent-thai thai 3.3 nil nil san-francisco san-francisco-county
  bay-area)
 (9243 tub-tim-thai-restaurant thai 2.7 510 tamalpais-dr corte-madera
  marin-county bay-area)
 (9244 chariya-reun-thai-cafe thai 3.0 252 almonte-blvd mill-valley
  marin-county bay-area)
 (9245 thai-cafe thai 2.7 750 grant-ave novato marin-county bay-area)
 (9246 thai-cuisine thai 3.3 610 petaluma-blvd-n petaluma sonoma-county
  bay-area)
 (9247 gardenia-thai thai 3.0 227 southwest-blvd rohnert-park
  sonoma-county bay-area)
 (9248 kitikun-thai-cuisine thai 3.5 157 southwest-blvd rohnert-park
  sonoma-county bay-area)
 (9249 my-thai-restaurant thai 2.5 0 unknown san-rafael marin-county
  bay-area)
 (9250 royal-thai-restaurant thai 2.9 610 x3rd-st san-rafael
  marin-county bay-area)
 (9251 thai-derm-restaurant thai 2.0 0 unknown san-rafael marin-county
  bay-area)
 (9252 california-thai-restaurant thai 2.7 0 unknown santa-rosa
  sonoma-county bay-area)
 (9253 thai-california-restaurant thai 2.0 0 unknown santa-rosa
  sonoma-county bay-area)
 (9254 thai-house thai 3.4 0 unknown santa-rosa sonoma-county bay-area)
 (9255 arawan-thai-restaurant thai 2.3 47 caledonia-st sausalito
  unknown bay-area)
 (9256 beu-thai-restaurant thai 2.3 807 ellis-st san-francisco
  san-francisco-county bay-area)
 (9257 mali-thai-restaurant thai 2.0 670 larkin-st san-francisco
  san-francisco-county bay-area)
 (9258 manivanh-thai-restaurant thai 2.0 2732 x24th-st san-francisco
  san-francisco-county bay-area)
 (9259 manoras-thai-restaurant thai 3.2 3226 mission-st san-francisco
  san-francisco-county bay-area)
 (9260 rin-thai-restaurant thai 2.0 4301 x24th-st san-francisco
  san-francisco-county bay-area)
 (9261 samila-thai-restaurant thai 2.0 5336 geary-st san-francisco
  san-francisco-county bay-area)
 (9262 suriya-thai-restaurant thai 3.4 1432 valencia-st san-francisco
  san-francisco-county bay-area)
 (9263 tamnan-thai-restaurant thai 2.0 1360 ave san-francisco
  san-francisco-county bay-area)
 (9264 thai-cafe thai 3.0 3407 geary-blvd san-francisco
  san-francisco-county bay-area)
 (9265 thai-stick-restaurant thai 2.0 698 post-st san-francisco
  san-francisco-county bay-area)
 (9266 lemon-grass-thai-restaurant thai 3.2 0 unknown livermore
  alameda-county bay-area)
 (9267 malees-thai-cuisine thai 2.0 0 santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (9268 thai-garden-restaurant thai 2.3 0 el-camino-real palo-alto
  santa-clara-county bay-area)
 (9269 thep-thai thai 2.8 23 s-market-st san-jose santa-clara-county
  bay-area)
 (9270 thai-noodles thai 2.0 1271 university berkeley alameda-county
  bay-area)
 (9271 california-dream thai 2.0 26 center-st berkeley alameda-county
  bay-area)
 (9272 amarin-thai-cuisine thai 2.8 156 castro-st. mountain-view
  santa-clara-county bay-area)
 (9273 kinaree-thai-cuisine thai 3.3 201 baldwin-avenue san-mateo
  san-mateo-county bay-area)
 (9274 manoras-thai-cuisine thai 2.7 1600 folsom san-francisco
  san-francisco-county bay-area)
 (9275 jhanthong-banbua thai 3.0 2400 mendocino-ave santa-rosa
  sonoma-county bay-area)
 (9276 thai-gourmet thai 2.7 5979 commerce-blvd.-no.3 rohnert-park
  sonoma-county bay-area)
 (9277 bangkok-best thai 2.7 301 kearny-st san-francisco
  san-francisco-county bay-area)
 (9278 thai-satay thai 3.0 173 e4th-ave san-mateo san-mateo-county
  bay-area)
 (9279 thai-hut thai 2.3 580 broadway seaside monterey-county monterey)
 (9280 lotus-thai-cuisine thai 3.2 4133 piedmont-avenue oakland
  alameda-county bay-area)
 (9281 cha-am-express thai 2.3 307 kearny-st san-francisco
  san-francisco-county bay-area)
 (9282 khan-toke-thai-house thai 3.3 5937 geary-blvd.-at-24th-ave
  san-francisco san-francisco-county bay-area)
 (9283 thai-jasmine thai 2.0 1009 clay-st oakland alameda-county
  bay-area)
 (9284 pleasanton-house-thai thai 2.7 929 main-st. pleasanton
  alameda-county bay-area)
 (9285 thai-time thai 3.3 1240 el-camino-real san-carlos
  san-mateo-county bay-area)
 (9286 little-thai thai 2.7 2348 polk-str san-francisco
  san-francisco-county bay-area)
 (9287 barn-thai thai 3.3 921 east-duane-ave sunnyvale
  santa-clara-county bay-area)
 (9288 orchid-thai thai 2.0 726 san-anselmo-avenue san-anselmo
  marin-county bay-area)
 (9289 lalita--distinctive-thai thai 2.7 96 mcallister-at-leavenworth
  san-francisco san-francisco-county bay-area)
 (9290 bangkok-best thai 1.7 301 kearny san-francisco
  san-francisco-county bay-area)
 (9291 my-thai thai 2.0 34265 fremont-blvd fremont alameda-county
  bay-area)
 (9292 thai-taste thai 2.3 0 blvd-caleveras-blvd milpitas
  santa-clara-county bay-area)
 (9293 thai-e-sun thai 3.0 1958 shattuck-ave berkeley alameda-county
  bay-area)
 (9294 thai-original-bbq-&-restaurant thai 3.6 2221 gellert-blvd.
  south-san-francisco san-mateo-county bay-area)
 (9295 racha-cafe thai 3.6 771 ellis-st san-francisco-ca nil nil)
 (9296 ephesus turkish 3.3 0 unknown redwood-city san-mateo-county
  bay-area)
 (9297 cento-stelle-tuscan-trattoria tuscan 3.4 901 lincoln-ave
  san-rafael marin-county bay-area)
 (9298 caffe-delle-stella tuscan 3.9 0 unknown walnut-creek
  contra-costa-county bay-area)
 (9299 rosti tuscan 2.7 2060 chestnut-st. san-francisco
  san-francisco-county bay-area)
 (9300 long-life-vegi-house vegetarian 2.8 2129 university-ave berkeley
  alameda-county bay-area)
 (9301 lotus-vegetarian-&-seafood vegetarian 2.5 2272 shattuck-ave
  berkeley alameda-county bay-area)
 (9302 spud-brothers vegetarian 3.2 2412 x9th-st-no.-a berkeley
  alameda-county bay-area)
 (9303 dharmas-natural-fast-foods vegetarian 2.5 4250 capitola-rd
  capitola unknown bay-area)
 (9304 veg-out vegetarian 2.0 1855 x41st-ave-ste-r-8 capitola unknown
  bay-area)
 (9305 king-richards-vegefest vegetarian 2.0 0 unknown felton unknown
  bay-area)
 (9306 wise-garden-vegetarian-restaur vegetarian 2.0 43691 mission-blvd
  fremont alameda-county bay-area)
 (9307 imp-cafe vegetarian 3.0 1750 tahoe-dr milpitas
  santa-clara-county bay-area)
 (9308 garden-fresh vegetarian 3.4 1245 w-el-camino-real mountain-view
  santa-clara-county bay-area)
 (9309 nature-friends vegetarian 2.0 3115 butters-dr oakland
  alameda-county bay-area)
 (9310 pure-land-vegetarian-rest vegetarian 3.2 0 bruno-ave san-bruno
  san-mateo-county bay-area)
 (9311 amazing-grace vegetarian 2.0 216 church san-francisco
  san-francisco-county bay-area)
 (9312 ananda-fuara vegetarian 3.8 1298 market san-francisco
  san-francisco-county bay-area)
 (9313 greens-at-fort-mason vegetarian 3.1 0 mason san-francisco
  san-francisco-county bay-area)
 (9314 millennium vegetarian 3.8 246 mcallister-st. san-francisco
  san-francisco-county bay-area)
 (9315 now-and-zen vegetarian 3.8 1826 buchanan san-francisco
  san-francisco-county bay-area)
 (9316 real-good-karma-natural-foods vegetarian 2.0 501 dolores
  san-francisco san-francisco-county bay-area)
 (9317 silver-moon-chinese-restaurant vegetarian 2.0 2301 clement
  san-francisco san-francisco-county bay-area)
 (9318 vegi-food vegetarian 2.7 1820 clement-st san-francisco
  san-francisco-county bay-area)
 (9319 hung-vuong-tofu-&-vegetarian vegetarian 2.0 1741
  berryessa-rd-no.-b san-jose santa-clara-county bay-area)
 (9320 k-two-vegetarian-sidewalk-dine vegetarian 2.0 3950 paul-sweet-rd
  santa-cruz santa-cruz-county bay-area)
 (9321 nancys-vegetarian-cafe vegetarian 2.0 6970 mckinley-ave
  sebastopol sonoma-county bay-area)
 (9322 siras-vegetarian-club vegetarian 2.3 408 florence palo-alto
  santa-clara-county bay-area)
 (9323 mystic-cafe vegetarian 2.2 nil nil palo-alto santa-clara-county
  bay-area)
 (9324 your-black-muslim-bakery vegetarian 3.0 5832 san-pablo-ave
  oakland alameda-county bay-area)
 (9325 happy-belly-deli-&-cafe vegetarian 2.7 30 jack-london-sq oakland
  alameda-county bay-area)
 (9326 bagdad-cafe vegetarian 3.2 0 corner-16th-&-market san-francisco
  san-francisco-county bay-area)
 (9327 vegetarian-house vegetarian 2.0 570 e-santa-clara san-jose
  santa-clara-county bay-area)
 (9328 power-juice-company vegetarian 2.0 173 crossrd carmel
  monterey-county monterey)
 (9329 power-juice-company-monterey vegetarian 2.0 470 alvarado
  monterey monterey-county monterey)
 (9330 white-lotus vegetarian 2.8 80 n.-market san-jose
  santa-clara-county bay-area)
 (9331 paradise-vegetarian-restaurant vegetarian 2.0 1444 x4th-st
  san-rafael marin-county bay-area)
 (9332 paradise-vegetarian-restaurant vegetarian 2.3 1444 x4th-st
  san-rafael marin-county bay-area)
 (9333 red-crane vegetarian 2.7 1115 clement san-francisco
  san-francisco-county bay-area)
 (9334 great-vegi-land vegetarian 3.0 562 s.-murphy-avenue sunnyvale
  santa-clara-county bay-area)
 (9335 lu-lai-garden vegetarian 2.2 210 barber-court milpitas
  santa-clara-county bay-area)
 (9336 caprices-restaurant-&-cafe vegetarian 2.7 347 primrose-rd
  burlingame san-mateo-county bay-area)
 (9337 cafe-caracas venezulean 2.3 1446 university-ave berkeley
  alameda-county bay-area)
 (9338 buckeye-roadhouse venison 3.0 15 shoreline-highway mill-valley
  marin-county bay-area)
 (9339 emerald-garden-vietnamese-rest vietnamese 3.0 1518 park-st
  alameda alameda-county bay-area)
 (9340 van-seng-restaurant vietnamese 2.0 2520 santa-clara-ave-no.-2522
  alameda alameda-county bay-area)
 (9341 mama-lans-vietnamese-restauran vietnamese 3.4 1316 gilman-st
  berkeley alameda-county bay-area)
 (9342 viet-nam-village vietnamese 2.7 2521 durant-ave-ste-f berkeley
  alameda-county bay-area)
 (9343 golden-chopsticks vietnamese 3.0 1765 winchester-blvd campbell
  santa-clara-county bay-area)
 (9344 california-vetnamese-food vietnamese 2.0 5800
  shellmound-st-no.-12 emeryville alameda-county bay-area)
 (9345 kim-garden vietnamese 2.0 3770 mowry-ave fremont alameda-county
  bay-area)
 (9346 viet-nam-thuc-pham vietnamese 2.5 0 unknown menlo-park
  san-mateo-county bay-area)
 (9347 minhs-vietnamese-restaurant vietnamese 3.7 1422 dempsey-rd.
  milpitas santa-clara-county bay-area)
 (9348 pho-xe-lua-noodle-house vietnamese 2.5 82 s-abel-st milpitas
  santa-clara-county bay-area)
 (9349 nguyens-restaurant vietnamese 3.6 5729 jarvis-ave newark
  alameda-county bay-area)
 (9350 bode-vegetarian-house vietnamese 3.4 464 x8th-st oakland
  alameda-county bay-area)
 (9351 kim-do-restaurant vietnamese 2.0 2328 x14th-ave oakland
  alameda-county bay-area)
 (9352 le-cheval vietnamese 3.7 344 x20th-st oakland alameda-county
  bay-area)
 (9353 new-tung-kee-noodle-house vietnamese 2.0 360 x11th-st oakland
  alameda-county bay-area)
 (9354 pho-hoa-lao vietnamese 2.0 333 x10th-st oakland alameda-county
  bay-area)
 (9355 pho-lam-vien vietnamese 2.0 930 webster-st oakland
  alameda-county bay-area)
 (9356 saigon-deli vietnamese 2.8 1526 san-pablo-ave oakland
  alameda-county bay-area)
 (9357 vung-tau-oakland vietnamese 2.0 3134 e-14th-st oakland
  alameda-county bay-area)
 (9358 thanhs-vietnamese-restaurant vietnamese 3.2 3151 middlefield-rd
  redwood-city san-mateo-county bay-area)
 (9359 sais-vietnamese-restaurant vietnamese 3.2 680 laurel-st
  san-carlos san-mateo-county bay-area)
 (9360 aux-delices-vietnamese-restaurant vietnamese 2.0 2327 polk
  san-francisco san-francisco-county bay-area)
 (9361 aux-delices-vietnamese-restaurant vietnamese 2.3 1002
  potrero-avenue san-francisco san-francisco-county bay-area)
 (9362 emerald-garden-restaurant vietnamese 3.0 1550 california
  san-francisco san-francisco-county bay-area)
 (9363 golden-turtle-vietnamese-restaurant vietnamese 3.3 2211
  van-ness-avenue san-francisco san-francisco-county bay-area)
 (9364 kimson-fine-vietnamese-cuisine vietnamese 2.0 2380 lombard
  san-francisco san-francisco-county bay-area)
 (9365 minhs-garden vietnamese 3.0 208 clement san-francisco
  san-francisco-county bay-area)
 (9366 new-golden-turtle-vietnamese-restaurant vietnamese 2.3 308
  x5th-avenue san-francisco san-francisco-county bay-area)
 (9367 rose-garden-vietnamese-restaurant vietnamese 2.0 509 haight
  san-francisco san-francisco-county bay-area)
 (9368 saigon-saigon vietnamese 2.5 1132 valencia san-francisco
  san-francisco-county bay-area)
 (9369 tay-viet-restaurant vietnamese 2.3 2034 chestnut san-francisco
  san-francisco-county bay-area)
 (9370 tu-lan vietnamese 3.0 8 x6th-st san-francisco
  san-francisco-county bay-area)
 (9371 vietnam-2-seafood-restaurant vietnamese 2.7 701 larkin
  san-francisco san-francisco-county bay-area)
 (9372 banh-hoi-chan-doc vietnamese 2.0 1818 tully-rd-ste-118 san-jose
  santa-clara-county bay-area)
 (9373 khanhs-garden-restaurant vietnamese 2.4 618 town-and-country-vlg
  san-jose santa-clara-county bay-area)
 (9374 nam-vang-restaurant vietnamese 2.0 2477 alvin-ave san-jose
  santa-clara-county bay-area)
 (9375 new-thanh-huong-sandwich vietnamese 2.0 1156 story-rd san-jose
  santa-clara-county bay-area)
 (9376 ngoc-lan vietnamese 2.0 1992 tully-rd san-jose
  santa-clara-county bay-area)
 (9377 nuoc-mia-bach-dang vietnamese 2.0 1818 tully-rd-ste-128 san-jose
  santa-clara-county bay-area)
 (9378 pho-54 vietnamese 1.7 2874 alum-rock-ave-no.-b san-jose
  santa-clara-county bay-area)
 (9379 pho-cuong vietnamese 2.0 301 s-capitol-ave san-jose
  santa-clara-county bay-area)
 (9380 pho-hoa vietnamese 2.0 1190 s-bascom-ave-ste-243 san-jose
  santa-clara-county bay-area)
 (9381 pho-hoa-restaurant vietnamese 2.0 735 the-alameda san-jose
  santa-clara-county bay-area)
 (9382 pho-hoa-vietnamese-restaurant vietnamese 2.0 175
  s-capitol-ave-no.-k-l san-jose santa-clara-county bay-area)
 (9383 phuong-hoang-restaurant vietnamese 2.0 1711 mclaughlin-ave-no.-b
  san-jose santa-clara-county bay-area)
 (9384 quan-hue-restaurant vietnamese 2.0 1818 tully-rd-ste-116
  san-jose santa-clara-county bay-area)
 (9385 thanh-van-restaurant vietnamese 2.0 1170 tully-rd-no.-a san-jose
  santa-clara-county bay-area)
 (9386 trieu-chau-restaurant vietnamese 2.0 135 post-st san-jose
  santa-clara-county bay-area)
 (9387 saigon-city-restaurant vietnamese 3.2 418 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (9388 pan-thong vietnamese 3.4 815 franklin-st santa-clara
  santa-clara-county bay-area)
 (9389 pho-thanh-binh-restaurant vietnamese 2.0 985 memorex-dr
  santa-clara santa-clara-county bay-area)
 (9390 pho-thanh-long-restaurant vietnamese 2.8 2450 el-camino-real
  santa-clara santa-clara-county bay-area)
 (9391 pho-xe-lua-noodle-house vietnamese 2.7 1460 halford-ave
  santa-clara santa-clara-county bay-area)
 (9392 saigon-city-restaurant vietnamese 2.8 4725 lafayette-st
  santa-clara santa-clara-county bay-area)
 (9393 pho-888 vietnamese 2.3 590 old-san-francisco-rd sunnyvale
  santa-clara-county bay-area)
 (9394 white-lotus vietnamese 3.0 80 n.-market-st san-jose
  santa-clara-county bay-area)
 (9395 green-turtle-vietnamese-restaurant vietnamese 2.7 4 padre-pky
  rohnert-park sonoma-county bay-area)
 (9396 golden-deer-vietnamese-restaurant vietnamese 3.1 908 clement-st
  san-francisco san-francisco-county bay-area)
 (9397 golden-flower-vietnamese-restaurant vietnamese 2.3 667
  jackson-st san-francisco san-francisco-county bay-area)
 (9398 golden-star-vietnamese-restaurant vietnamese 2.0 11
  walter-u-lum-pl san-francisco san-francisco-county bay-area)
 (9399 kims-continental-vietnamese-r vietnamese 2.0 506 presidio-ave
  san-francisco san-francisco-county bay-area)
 (9400 lois-vietnamese-restaurant vietnamese 2.0 2228 irving-st
  san-francisco san-francisco-county bay-area)
 (9401 mais-authentic-vietnamese vietnamese 2.5 316 clement-st
  san-francisco san-francisco-county bay-area)
 (9402 new-saigon-restaurant vietnamese 2.7 915 kearny-st san-francisco
  san-francisco-county bay-area)
 (9403 nhus-vietnamese-restaurant vietnamese 2.0 581 eddy-st
  san-francisco san-francisco-county bay-area)
 (9404 pho-hoa-vietnamese-restaurant vietnamese 2.0 431 jones-st
  san-francisco san-francisco-county bay-area)
 (9405 pho-xe-lua-restaurant vietnamese 2.0 425 ellis-st san-francisco
  san-francisco-county bay-area)
 (9406 rose-vietnamese-restaurant vietnamese 2.0 791 ofarrell-st
  san-francisco san-francisco-county bay-area)
 (9407 thanh-tam-restaurant vietnamese 2.0 nil nil san-francisco
  san-francisco-county bay-area)
 (9408 vietnam-restaurant vietnamese 2.3 620 broadway san-francisco
  san-francisco-county bay-area)
 (9409 aux-delices-vietnamese-restaurant vietnamese 2.7 2327 polk-st
  san-francisco san-francisco-county bay-area)
 (9410 pho-hoa vietnamese 2.3 0 st mountain-view santa-clara-county
  bay-area)
 (9411 pho-to-chou vietnamese 3.0 0 st mountain-view santa-clara-county
  bay-area)
 (9412 my-camh-vietnamese vietnamese 2.7 626 broadway san-francisco
  san-francisco-county bay-area)
 (9413 hu-tieu-nam-vang vietnamese 2.0 756 pacific san-francisco
  san-francisco-county bay-area)
 (9414 vietnam-restaurant vietnamese 2.5 1010 doyle-st menlo-park
  san-mateo-county bay-area)
 (9415 pho-quyen-noodle-house vietnamese 2.0 1185 w.-el-camino-real
  sunnyvale santa-clara-county bay-area)
 (9416 quan-hue-restaurant vietnamese 2.0 344 b-12th-st oakland
  alameda-county bay-area)
 (9417 happy-bakery vietnamese 2.0 369 x9th-st oakland alameda-county
  bay-area)
 (9418 viet-hai-noodle-house vietnamese 2.0 728 webster oakland
  alameda-county bay-area)
 (9419 saigon-express vietnamese 2.8 2045 shatuck berkeley
  alameda-county bay-area)
 (9420 cha-am vietnamese 3.3 1543 shattuck berkeley alameda-county
  bay-area)
 (9421 pho-anh-dao vietnamese 2.8 280 east-18th-st oakland
  alameda-county bay-area)
 (9422 jasmine-house vietnamese 3.2 2301 clement-st san-francisco
  san-francisco-county bay-area)
 (9423 nam-vietnamese-noodle vietnamese 2.0 844 w-el-camino-real
  sunnyvale santa-clara-county bay-area)
 (9424 viet-hung vietnamese 2.0 2456 el-camino-real san-mateo
  san-mateo-county bay-area)
 (9425 pho-tu-do vietnamese 2.7 1000 clement san-francisco
  san-francisco-county bay-area)
 (9426 thanhs vietnamese 2.7 3151 middlefield-rd redwood-city
  san-mateo-county bay-area)
 (9427 le-cheval-ii vietnamese 4.2 0 unknown oakland alameda-county
  bay-area)
 (9428 aux-delices-vietnam-restaurant vietnamese 2.7 2327 polk-st
  san-francisco san-francisco-county bay-area)
 (9429 vietnam-village vietnamese 2.7 2521 durant-ave-no.f berkeley
  alameda-county bay-area)
 (9430 pho-xe-lua vietnamese 2.6 311 moffett-blvd mountain-view
  santa-clara-county bay-area)
 (9431 tay-viet vietnamese 2.3 2034 chestnut-st san-francisco
  san-francisco-county bay-area)
 (9432 hues-vietnamese-restaurant vietnamese 2.7 2690 el-camino-real
  santa-clara santa-clara-county bay-area)
 (9433 mekong-mekong vietnamese 3.4 824 university-avenue berkeley
  alameda-county bay-area)
 (9434 my-tho vietnamese 2.8 0 blvd newark alameda-county bay-area)
 (9435 the-slanted-door vietnamese 2.8 584 valencia-st san-francisco
  san-francisco-county bay-area)
 (9436 phoenix-restaurant vietnamese 3.8 310 broadway oakland
  alameda-county bay-area)
 (9437 x101-vietnamese-restaurant vietnamese 3.0 101 eddy-st
  san-francisco san-francisco-county bay-area)
 (9438 pho-cuong-iv vietnamese 3.0 1028 east-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (9439 pho-hoa-thai-restaurant vietnamese 2.0 12860 san-pablo-avenue
  richmond contra-costa-county bay-area)
 (9440 tk-noodle vietnamese 3.2 20735 stevens-creek-blvd cupertino
  santa-clara-county bay-area)
 (9441 mekong-garden vietnamese 2.7 3766 pirdmont-avenue oakland
  alameda-county bay-area)
 (9442 king-do vietnamese 2.3 39486 fremont-blvd fremont alameda-county
  bay-area)
 (9443 helens-vietnamese-restaurant vietnamese 2.5 0 blvd fremont
  alameda-county bay-area)
 (9444 pho-hoa vietnamese 2.3 402 barber-lane milpitas
  santa-clara-county bay-area)
 (9445 hidden-blossom---an-quan vietnamese 2.7 480 blossom-hill-rd
  san-jose santa-clara-county bay-area)
 (9446 pho-house vietnamese 1.7 0 ave berkeley alameda-county bay-area)
 (9447 vohs vietnamese 2.0 0 unknown oakland alameda-county bay-area)
 (9448 garden-rose vietnamese/louisiana 2.7 3345 grand-avenue oakland
  alameda-county bay-area)
 (9449 stoney-ridge-winery winery 3.4 4948 tesla-rd livermore
  alameda-county bay-area)
 (9450 wente-bros-sparkling-cellars winery 4.0 5050 arroyo-rd livermore
  alameda-county bay-area)
 (9451 cadenasso-winery winery 2.0 0 unknown fairfield solano-county
  bay-area)
 (9452 arrowood-vineyards-&-winery winery 2.0 0 box-987 glen-ellen
  sonoma-county bay-area)
 (9453 b-r-cohn-winerysee-cohn-b-winery winery 2.0 15140 sonoma-hwy
  glen-ellen sonoma-county bay-area)
 (9454 benziger-family-winery winery 2.0 1883 london-ranch-rd
  glen-ellen sonoma-county bay-area)
 (9455 chandelle-winery winery 2.0 14301 arnold-dr glen-ellen
  sonoma-county bay-area)
 (9456 cohn-b-r-winery winery 2.0 15140 sonoma-hwy glen-ellen
  sonoma-county bay-area)
 (9457 coturri-h-&-sons-winery winery 2.0 6725 enterprise-rd glen-ellen
  sonoma-county bay-area)
 (9458 valley-of-the-moon-winery winery 2.0 777 madrone-rd glen-ellen
  sonoma-county bay-area)
 (9459 acacia-winery winery 2.0 2750 los-amigos-rd napa napa-county
  napa-valley)
 (9460 costello-vineyards-winery winery 2.0 1200 orchard-ave napa
  napa-county napa-valley)
 (9461 mathews-joseph-winery winery 2.0 1711 main-st napa napa-county
  napa-valley)
 (9462 mayacamas-vineyards-&-winery winery 2.0 1155 lokoya-rd napa
  napa-county napa-valley)
 (9463 mount-veeder-winery winery 2.0 1999 mount-veeder-rd napa
  napa-county napa-valley)
 (9464 pine-ridge-winery winery 2.0 5901 silverado-trl napa napa-county
  napa-valley)
 (9465 st-andrews-winery winery 2.0 2921 silverado-trl napa napa-county
  napa-valley)
 (9466 stags-leap-winery winery 2.0 6150 silverado-trl napa napa-county
  napa-valley)
 (9467 tulocay-winery winery 2.0 1426 coombsville-rd napa napa-county
  napa-valley)
 (9468 braren-pauli-winery winery 2.0 1613 wpring-hill-rd petaluma
  sonoma-county bay-area)
 (9469 golden-creek-vinyard winery 2.0 4480 wallace-rd santa-rosa
  sonoma-county bay-area)
 (9470 hanna-winery winery 2.0 5353 occidental-rd santa-rosa
  sonoma-county bay-area)
 (9471 martinelli-winery winery 2.0 3360 river-rd santa-rosa
  sonoma-county bay-area)
 (9472 matanzas-creek-winery winery 2.0 6097 bennett-valley-rd
  santa-rosa sonoma-county bay-area)
 (9473 old-town-winery winery 2.0 0 unknown santa-rosa sonoma-county
  bay-area)
 (9474 one-world-winery winery 2.0 2948 piner-rd santa-rosa
  sonoma-county bay-area)
 (9475 z-moore-winery winery 2.0 3364 river-rd santa-rosa sonoma-county
  bay-area)
 (9476 cherry-ridge-winery winery 2.0 10541 cherry-ridge-rd sebastopol
  sonoma-county bay-area)
 (9477 dehlinger-winery winery 2.0 6300 guerneville-rd sebastopol
  sonoma-county bay-area)
 (9478 pommeraie-winery winery 2.0 10541 cherry-ridge-rd sebastopol
  sonoma-county bay-area)
 (9479 bartholomew-park-winery winery 2.0 1000 vineyard-ln sonoma
  sonoma-county bay-area)
 (9480 buean-vista-winery-visitor-center-&-tasting-room winery 2.0
  18000 old-winery-rd sonoma sonoma-county bay-area)
 (9481 gundlach-bundschu-winery winery 2.0 3775 thornsberry-rd sonoma
  sonoma-county bay-area)
 (9482 homewood-winery winery 2.0 23120 burndale-rd sonoma
  sonoma-county bay-area)
 (9483 hunter-robert-winery winery 2.0 15655 arnold-dr sonoma
  sonoma-county bay-area)
 (9484 macrostie-winery winery 2.0 17246 woodland-ave sonoma
  sonoma-county bay-area)
 (9485 ravenwood-winery winery 2.7 18701 gehricke-rd sonoma
  sonoma-county bay-area)
 (9486 roche-winery winery 2.0 28700 arnold-dr sonoma sonoma-county
  bay-area)
 (9487 ryecroft-austrailian-winery winery 2.0 583 st sonoma
  sonoma-county bay-area)
 (9488 schug-carneros-estate-winery winery 2.0 602 bonneau-rd sonoma
  sonoma-county bay-area)
 (9489 sonoma-creek-winery winery 2.0 23355 millerick-rd sonoma
  sonoma-county bay-area)
 (9490 viansa-winery winery 2.0 25200 arnold-dr sonoma sonoma-county
  bay-area)
 (9491 wooden-valley-winery winery 2.0 0 vly-rd suisun-city
  solano-county bay-area)
 (9492 lakespring-winery winery 2.0 2055 hoffman-ln yountville
  napa-county napa-valley)
 (9493 the-yogurt-plus yogurt 2.0 2300 central-ave-no.-b alameda
  alameda-county bay-area)
 (9494 yogurt yogurt 2.0 173 parfait-ln alameda alameda-county
  bay-area)
 (9495 yogurt-and-donut-w-p yogurt 2.0 1415 solano-ave albany
  alameda-county bay-area)
 (9496 dandys-yogurt yogurt 2.0 2808 hayes-way antioch
  contra-costa-county bay-area)
 (9497 yogurt-oasis yogurt 1.7 2556 somersville-rd antioch
  contra-costa-county bay-area)
 (9498 aptos-yogurt-company yogurt 2.0 7560 soquel-dr aptos
  santa-cruz-county bay-area)
 (9499 u-c-northside-yogurt yogurt 2.0 1805 euclid-ave berkeley
  alameda-county bay-area)
 (9500 yogurt-delite yogurt 2.0 2012 shattuck-ave berkeley
  alameda-county bay-area)
 (9501 yogurt-park yogurt 2.3 2433 durant-ave-apt-a berkeley
  alameda-county bay-area)
 (9502 especially-yogurt-brentwood yogurt 2.0 41 sand-creek-rd-no.-a
  brentwood contra-costa-county bay-area)
 (9503 more-than-yogurt yogurt 2.0 2156 saint-andrews-ct byron unknown
  bay-area)
 (9504 frogurt yogurt 2.0 2006 winchester-blvd-no.-4 campbell
  santa-clara-county bay-area)
 (9505 tcby-yogurt yogurt 2.0 1640 s-bascom-ave-no.-b campbell
  santa-clara-county bay-area)
 (9506 yogurt-delite yogurt 2.0 1420 x41st-ave-no.-a capitola unknown
  bay-area)
 (9507 yamygurt yogurt 2.0 1825 sutter-st-no.-d concord
  contra-costa-county bay-area)
 (9508 yogurt-club yogurt 2.0 19656 stevens-creek-blvd-no.-c cupertino
  santa-clara-county bay-area)
 (9509 yogurt-delite yogurt 2.0 10525 s-de-anza-blvd cupertino
  santa-clara-county bay-area)
 (9510 t-c-b-y-yogurt yogurt 2.0 50 panorama-ct danville
  contra-costa-county bay-area)
 (9511 daisys-yogurt-shop yogurt 2.0 7360 hansen-dr dublin
  alameda-county bay-area)
 (9512 fiesta-yogurt-&-ice-cream yogurt 2.0 0 unknown hollister
  san-benito-county northern-california)
 (9513 tcby-yogurt yogurt 2.0 13 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (9514 the-yogurt-works yogurt 2.0 15466 los-gatos-blvd-ste-106a
  los-gatos santa-clara-county bay-area)
 (9515 yogurt-delite yogurt 2.0 464 n-santa-cruz-ave los-gatos
  santa-clara-county bay-area)
 (9516 t-c-b-y-yogurt yogurt 2.0 0 unknown menlo-park san-mateo-county
  bay-area)
 (9517 yogurt-stop yogurt 2.0 401 el-camino-real menlo-park
  san-mateo-county bay-area)
 (9518 checkers-frozen-yogurt yogurt 2.0 1501 augusta-ct milpitas
  santa-clara-county bay-area)
 (9519 tcby-milpitas yogurt 2.7 113 n-milpitas-blvd milpitas
  santa-clara-county bay-area)
 (9520 yogurt-city yogurt 2.0 1774 milmont-dr milpitas
  santa-clara-county bay-area)
 (9521 yogurt-palace yogurt 2.0 1561 landess-ave milpitas
  santa-clara-county bay-area)
 (9522 yogurt-street yogurt 2.0 593 e-calaveras-blvd milpitas
  santa-clara-county bay-area)
 (9523 yogurt-usa yogurt 2.0 59 dempsey-rd milpitas santa-clara-county
  bay-area)
 (9524 honey-treat-yogurt-shoppe yogurt 3.0 632 tennant-sta morgan-hill
  santa-clara-county bay-area)
 (9525 the-fro-yo-shoppe yogurt 2.0 1712 miramonte-ave-no.-a
  mountain-view santa-clara-county bay-area)
 (9526 naturally-yogurt-new-park yogurt 2.0 2217 newpark-mall newark
  alameda-county bay-area)
 (9527 penguins-frozen-yogurt yogurt 2.0 6255 view-crest-dr oakland
  alameda-county bay-area)
 (9528 penguins-place-frozen-yogurt yogurt 2.0 6114
  la-salle-ave-no.-613 oakland alameda-county bay-area)
 (9529 penguins-place-frozen-yogurt yogurt 2.0 6114
  la-salle-ave-no.-615 oakland alameda-county bay-area)
 (9530 yogurt-cafe yogurt 2.0 1330 broadway oakland alameda-county
  bay-area)
 (9531 yogurt-delite yogurt 2.0 4139 piedmont-ave oakland
  alameda-county bay-area)
 (9532 yogurt-delite yogurt 2.0 5916 college-ave oakland alameda-county
  bay-area)
 (9533 yogurt-fare yogurt 2.0 2066 mountain-blvd oakland alameda-county
  bay-area)
 (9534 yogurt-swirl yogurt 2.0 1319 franklin-st oakland alameda-county
  bay-area)
 (9535 yogurt-island yogurt 2.0 3100 main-st oakley contra-costa-county
  bay-area)
 (9536 yogurt-delight yogurt 2.0 1300 contra-costa-blvd-ste-2
  pleasant-hill contra-costa-county bay-area)
 (9537 honey-treat-yogurt-shoppe yogurt 2.0 929 main-st-no.-a
  pleasanton alameda-county bay-area)
 (9538 rainbow-yogurt-faire yogurt 2.0 5321 hopyard-rd pleasanton
  alameda-county bay-area)
 (9539 yogurt-bobs yogurt 2.0 4275 rosewood-dr-ste-26 pleasanton
  alameda-county bay-area)
 (9540 five-stars-frozen-yogurt yogurt 2.0 834 x5th-ave redwood-city
  san-mateo-county bay-area)
 (9541 its-a-riot-yogurrt yogurt 2.0 10 woodleaf-ave redwood-city
  san-mateo-county bay-area)
 (9542 yogurt-delite yogurt 2.0 820 veterans-blvd-no.-a redwood-city
  san-mateo-county bay-area)
 (9543 frostys-yogurt-&-ice-cream-sho yogurt 2.0 150 s-1st-st-ste-30
  san-jose santa-clara-county bay-area)
 (9544 hollywood-yogurt yogurt 2.3 6184 bollinger-rd san-jose
  santa-clara-county bay-area)
 (9545 honey-treat-yogurt yogurt 2.0 1629 n-capitol-ave san-jose
  santa-clara-county bay-area)
 (9546 la-yogurt-&-ice-cream yogurt 2.0 6029 snell-ave san-jose
  santa-clara-county bay-area)
 (9547 penguins-place-frozen-yogurt yogurt 2.0 2001 camden-ave san-jose
  santa-clara-county bay-area)
 (9548 ultimate-yogurt yogurt 2.0 3143 stevens-creek-blvd san-jose
  santa-clara-county bay-area)
 (9549 yogis-yogurt yogurt 2.0 840 willow-st san-jose
  santa-clara-county bay-area)
 (9550 yogurt-delite yogurt 2.0 410 shadowgraph-dr san-jose
  santa-clara-county bay-area)
 (9551 yogurt-delite yogurt 2.0 613 blossom-hill-rd san-jose
  santa-clara-county bay-area)
 (9552 yogurt-delite yogurt 2.0 1794 jonathan-ave san-jose
  santa-clara-county bay-area)
 (9553 yogurt-delite yogurt 2.0 5558 monterey-hwy san-jose
  santa-clara-county bay-area)
 (9554 yogurt-etc yogurt 2.0 1447 foxworthy-ave san-jose
  santa-clara-county bay-area)
 (9555 yogurt-palace yogurt 2.0 2652 alum-rock-ave-no.-f san-jose
  santa-clara-county bay-area)
 (9556 yogurt-plus yogurt 2.0 6576 leyland-park-dr san-jose
  santa-clara-county bay-area)
 (9557 yogurt-station yogurt 2.0 1030 piedmont-rd san-jose
  santa-clara-county bay-area)
 (9558 honey-treat-yogurt-shoppe yogurt 2.0 2250 wimbledon-pl
  san-leandro alameda-county bay-area)
 (9559 honey-treat-yogurt-shoppe yogurt 2.0 1334 fairmont-dr
  san-leandro alameda-county bay-area)
 (9560 yogurt-delite yogurt 2.0 14964 e-14th-st san-leandro
  alameda-county bay-area)
 (9561 jjs-yogurt yogurt 2.0 1226 w-hillsdale-blvd san-mateo
  san-mateo-county bay-area)
 (9562 norbys-frozen-yogurt yogurt 2.0 239 e-3rd-ave san-mateo
  san-mateo-county bay-area)
 (9563 yogurt-temptation yogurt 2.0 2948 s-norfolk-st-no.-a san-mateo
  san-mateo-county bay-area)
 (9564 chelseas-yogurt yogurt 2.0 2551 san-ramon-valley-blvd-no.102
  san-ramon contra-costa-county bay-area)
 (9565 everything-yogurt-&-bananas yogurt 2.0 2855
  stevens-creek-blvd-ste-2183 santa-clara santa-clara-county bay-area)
 (9566 wholesome-yogurt yogurt 2.0 4300 great-america-pky-no.-156
  santa-clara santa-clara-county bay-area)
 (9567 yogurt-delite yogurt 2.0 1306 mission-st santa-cruz
  santa-cruz-county bay-area)
 (9568 yogurt-village yogurt 2.0 19696 northampton-dr saratoga
  santa-clara-county bay-area)
 (9569 galleria-yogurt-shop yogurt 2.0 243 mount-hermon-rd-no.-a
  scotts-valley unknown bay-area)
 (9570 yogurtdelite yogurt 2.0 274 sunset-ave-ste-b suisun-city
  solano-county bay-area)
 (9571 the-yogurt-cafe yogurt 2.0 415 n-mary-ave-ste-104 sunnyvale
  santa-clara-county bay-area)
 (9572 yogurt-delite yogurt 2.0 897 e-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (9573 yogurt-farm yogurt 2.0 462 e-el-camino-real sunnyvale
  santa-clara-county bay-area)
 (9574 wonderland-video-&-yogurt-cafe yogurt 2.0 313 n-civic-dr-no.-312
  walnut-creek contra-costa-county bay-area)
 (9575 wonderland-yogurt yogurt 2.0 313 n-civic-dr walnut-creek
  contra-costa-county bay-area)
 (9576 yogurt-park-of-broadway-plaza yogurt 2.0 80 broadway
  walnut-creek contra-costa-county bay-area)
 (9577 yogurt-park-of-contra-costa yogurt 3.0 1499 n-california-blvd
  walnut-creek contra-costa-county bay-area)
 (9578 udder-delights-frozen-yogurt yogurt 2.0 705 lincoln-ave napa
  napa-county napa-valley)
 (9579 big-chill-yogurt-&-ice-cream-northgate-plaza yogurt 2.0 424
  las-gallinas-ave san-rafael marin-county bay-area)
 (9580 checkers-pizza-&-frozen-yogurt yogurt 2.0 0 unknown santa-rosa
  sonoma-county bay-area)
 (9581 everything-yogurt-&-salad-cafe yogurt 2.0 2109 santa-rosa-plz
  santa-rosa sonoma-county bay-area)
 (9582 village-court-yogurt yogurt 2.0 718 village-ct santa-rosa
  sonoma-county bay-area)
 (9583 buds-ice-cream-&-yogurt yogurt 2.8 1 blackfield-dr
  belvedere-tiburon marin-county bay-area)
 (9584 uptown-yogurt yogurt 2.0 165 university-ave palo-alto
  santa-clara-county bay-area)
 (9585 stanford-ice-cream-&-yogurt yogurt 2.7 341 santa-cruz menlo-park
  san-mateo-county bay-area)
 (9586 yogurt-park yogurt 3.0 684 hartz-ave danville
  contra-costa-county bay-area)
 (9587 tcby yogurt 2.3 0 st mountain-view santa-clara-county bay-area)
 (9588 mongolian-b.b.q. all-you-can-eat 2.7 3380 el-camino-real
  santa-clara santa-clara-county bay-area)
 (9589 bobs-donuts donuts 3.6 1621 polk san-francisco
  san-francisco-county bay-area)
 (9590 la-fondue fondue 2.7 14510 big-basin-way saratoga
  santa-clara-county bay-area)

))
