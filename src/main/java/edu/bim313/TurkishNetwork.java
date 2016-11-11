package edu.bim313;

public class TurkishNetwork {

    private TurkishNetwork() {
    }

    static final String[] cities = new String[]{
            "ADANA", "ADIYAMAN", "AFYON", "AĞRI", "AMASYA", "ANKARA", "ANTALYA", "ARTVİN", "AYDIN", "BALIKESİR", "BİLECİK", "BİNGÖL", "BİTLİS", "BOLU", "BURDUR", "BURSA", "ÇANAKKALE", "ÇANKIRI", "ÇORUM", "DENİZLİ", "DİYARBAKIR", "EDİRNE", "ELAZIĞ", "ERZİNCAN", "ERZURUM", "ESKİŞEHİR", "GAZİANTEP", "GİRESUN", "GÜMÜŞHANE", "HAKKARİ", "HATAY", "ISPARTA", "İÇEL", "İSTANBUL", "İZMİR", "KARS", "KASTAMONU", "KAYSERİ", "KIRKLARELİ", "KIRŞEHİR", "KOCAELİ", "KONYA", "KÜTAHYA", "MALATYA", "MANİSA", "KAHRAMANMARAŞ", "MARDİN", "MUĞLA", "MUŞ", "NEVŞEHİR", "NİĞDE", "ORDU", "RİZE", "SAKARYA", "SAMSUN", "SİİRT", "SİNOP", "SİVAS", "TEKİRDAĞ", "TOKAT", "TRABZON", "TUNCELİ", "ŞANLIURFA", "UŞAK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "ŞIRNAK", "BARTIN", "ARDAHAN", "IĞDIR", "YALOVA", "KARABÜK", "KİLİS", "OSMANİYE", "DÜZCE"
    };

    static final int[][] distance = new int[][]{
            {0, 329, 573, 961, 613, 490, 558, 1030, 894, 894, 768, 628, 727, 677, 671, 837, 1094, 576, 575, 768, 518, 1169, 486, 675, 804, 688, 205, 727, 786, 900, 191, 620, 69, 939, 900, 1007, 690, 333, 1150, 375, 828, 356, 673, 388, 882, 185, 530, 871, 738, 287, 205, 718, 926, 791, 729, 701, 871, 429, 1071, 499, 852, 621, 342, 689, 895, 473, 754, 265, 809, 290, 475, 614, 711, 769, 1036, 1064, 893, 701, 242, 85, 722},
            {329, 0, 902, 648, 636, 755, 887, 755, 1223, 1223, 1057, 349, 414, 946, 1000, 1126, 1397, 785, 700, 1097, 205, 1438, 283, 548, 529, 977, 150, 712, 679, 667, 320, 949, 398, 1208, 1229, 732, 888, 437, 1419, 571, 1097, 685, 1002, 185, 1211, 164, 296, 1200, 463, 518, 534, 728, 853, 1060, 752, 388, 894, 414, 1340, 522, 779, 418, 110, 1018, 582, 612, 1023, 593, 654, 619, 684, 301, 478, 1038, 761, 751, 1162, 970, 209, 244, 991},
            {573, 902, 0, 1308, 590, 256, 292, 1236, 351, 321, 210, 1102, 1295, 418, 170, 273, 521, 387, 498, 225, 1091, 682, 960, 938, 1127, 144, 778, 866, 1008, 1473, 764, 169, 565, 452, 327, 1327, 501, 521, 663, 429, 341, 223, 100, 862, 309, 758, 1103, 370, 1212, 440, 458, 822, 1077, 304, 670, 1274, 684, 696, 584, 634, 1003, 1068, 915, 116, 1435, 472, 487, 365, 1031, 336, 331, 1187, 1284, 515, 1345, 1418, 336, 447, 815, 658, 373},
            {961, 648, 1308, 0, 735, 1052, 1429, 397, 1653, 1568, 1357, 359, 234, 1144, 1430, 1417, 1688, 983, 827, 1527, 443, 1636, 497, 370, 184, 1285, 756, 546, 384, 434, 952, 1379, 1030, 1406, 1631, 217, 987, 811, 1617, 941, 1295, 1115, 1363, 595, 1613, 812, 518, 1671, 245, 892, 939, 590, 548, 1258, 742, 331, 905, 616, 1538, 674, 484, 424, 619, 1420, 232, 840, 1221, 967, 306, 1114, 977, 369, 426, 1169, 310, 143, 1360, 1099, 815, 876, 1189},
            {613, 636, 590, 735, 0, 334, 874, 694, 937, 833, 622, 636, 829, 409, 756, 682, 953, 248, 92, 811, 702, 901, 549, 365, 554, 567, 609, 324, 435, 1141, 705, 755, 639, 671, 913, 754, 252, 348, 882, 308, 560, 560, 645, 469, 895, 529, 797, 956, 746, 363, 441, 280, 535, 523, 131, 889, 258, 222, 803, 114, 461, 495, 720, 702, 967, 196, 486, 418, 458, 616, 259, 802, 984, 434, 778, 845, 625, 364, 668, 629, 454},
            {490, 755, 256, 1052, 334, 0, 544, 980, 603, 530, 313, 899, 1092, 191, 422, 382, 653, 131, 242, 477, 910, 683, 757, 682, 871, 233, 671, 610, 752, 1366, 681, 421, 483, 453, 579, 1071, 245, 318, 664, 184, 342, 258, 311, 659, 561, 591, 996, 622, 1009, 275, 349, 566, 821, 305, 414, 1097, 428, 440, 585, 378, 747, 812, 808, 368, 1232, 216, 268, 225, 775, 369, 75, 1010, 1177, 283, 1089, 1162, 407, 215, 730, 575, 236},
            {558, 887, 292, 1429, 874, 544, 0, 1466, 344, 510, 474, 1186, 1285, 682, 122, 537, 710, 675, 782, 222, 1076, 919, 1044, 1059, 1248, 424, 763, 1111, 1170, 1458, 749, 130, 489, 716, 446, 1448, 789, 618, 927, 572, 605, 322, 364, 946, 428, 743, 1088, 313, 1296, 537, 543, 1095, 1310, 568, 954, 1259, 972, 813, 848, 876, 1236, 1179, 900, 294, 1453, 684, 751, 462, 1193, 375, 615, 1172, 1269, 803, 1472, 1539, 600, 735, 800, 643, 637},
            {1030, 755, 1236, 397, 694, 980, 1466, 0, 1583, 1462, 1251, 406, 562, 1038, 1402, 1311, 1582, 894, 738, 1457, 550, 1530, 544, 407, 226, 1213, 863, 370, 333, 771, 1021, 1401, 1099, 1300, 1559, 210, 864, 848, 1511, 952, 1189, 1152, 1291, 642, 1541, 865, 645, 1602, 479, 929, 976, 414, 159, 1152, 566, 659, 729, 653, 1432, 633, 233, 461, 726, 1348, 569, 840, 1115, 1004, 343, 1151, 905, 603, 754, 1046, 117, 344, 1254, 976, 922, 945, 1083},
            {894, 1223, 351, 1653, 937, 603, 344, 1583, 0, 293, 523, 1423, 1616, 715, 272, 442, 449, 734, 845, 126, 1412, 658, 1281, 1283, 1472, 483, 1099, 1213, 1355, 1794, 1085, 293, 833, 681, 126, 1672, 848, 842, 675, 776, 570, 542, 413, 1183, 156, 1079, 1424, 99, 1533, 761, 779, 1169, 1424, 601, 1017, 1595, 1031, 1037, 629, 981, 1350, 1413, 1236, 278, 1756, 819, 784, 686, 1378, 648, 678, 1508, 1605, 862, 1692, 1763, 507, 794, 1136, 979, 670},
            {894, 1223, 321, 1568, 833, 530, 510, 1462, 293, 0, 246, 1418, 1611, 424, 397, 151, 200, 659, 772, 288, 1412, 409, 1276, 1198, 1387, 297, 1099, 1092, 1254, 1794, 1085, 396, 886, 390, 173, 1587, 670, 837, 426, 703, 279, 544, 221, 1178, 137, 1079, 1424, 392, 1528, 761, 779, 1048, 1303, 310, 896, 1595, 853, 970, 380, 908, 1229, 1328, 1236, 225, 1751, 746, 493, 686, 1291, 657, 605, 1508, 1605, 582, 1571, 1678, 216, 558, 1136, 979, 379},
            {768, 1057, 210, 1357, 622, 313, 474, 1251, 523, 246, 0, 1201, 1394, 213, 352, 95, 366, 444, 555, 397, 1212, 477, 1059, 987, 1176, 80, 973, 881, 1043, 1668, 959, 351, 760, 247, 417, 1376, 459, 620, 458, 486, 136, 418, 110, 961, 381, 893, 1298, 542, 1311, 577, 647, 837, 1092, 99, 685, 1399, 642, 753, 379, 691, 1018, 1117, 1110, 249, 1534, 529, 282, 523, 1080, 531, 388, 1312, 1479, 371, 1360, 1467, 126, 347, 1010, 853, 168},
            {628, 349, 1102, 359, 636, 899, 1186, 406, 1423, 1418, 1201, 0, 197, 1045, 1200, 1270, 1541, 884, 728, 1297, 144, 1537, 142, 271, 180, 1121, 457, 545, 383, 509, 619, 1149, 697, 1307, 1429, 383, 888, 581, 1518, 715, 1196, 885, 1199, 240, 1411, 463, 239, 1441, 114, 662, 709, 589, 557, 1159, 715, 284, 868, 469, 1439, 575, 483, 141, 320, 1218, 337, 693, 1122, 737, 305, 884, 828, 197, 379, 1070, 412, 474, 1261, 1000, 516, 543, 1090},
            {727, 414, 1295, 234, 829, 1092, 1285, 562, 1616, 1611, 1394, 197, 0, 1238, 1393, 1463, 1734, 1077, 921, 1490, 209, 1730, 335, 464, 349, 1314, 522, 711, 549, 340, 718, 1342, 796, 1500, 1622, 432, 1081, 774, 1711, 908, 1389, 1078, 1392, 433, 1604, 578, 284, 1598, 83, 855, 902, 755, 713, 1352, 907, 97, 1061, 662, 1632, 768, 649, 334, 385, 1411, 168, 886, 1315, 930, 471, 1017, 1021, 135, 192, 1263, 491, 337, 1454, 1193, 581, 642, 1283},
            {677, 946, 418, 1144, 409, 191, 682, 1038, 715, 424, 213, 1045, 1238, 0, 560, 273, 544, 235, 352, 605, 1101, 492, 948, 774, 963, 288, 862, 668, 830, 1550, 868, 559, 670, 262, 595, 1163, 246, 509, 473, 375, 151, 445, 318, 850, 559, 782, 1187, 750, 1155, 466, 536, 624, 879, 114, 472, 1288, 429, 631, 394, 523, 805, 904, 999, 457, 1376, 407, 159, 412, 867, 556, 266, 1201, 1368, 174, 1147, 1254, 216, 134, 919, 762, 45},
            {671, 1000, 170, 1430, 756, 422, 122, 1402, 272, 397, 352, 1200, 1393, 560, 0, 415, 597, 553, 664, 150, 1189, 806, 1058, 1060, 1249, 302, 876, 1032, 1171, 1571, 862, 51, 611, 594, 374, 1449, 667, 619, 805, 573, 483, 315, 242, 960, 356, 856, 1201, 241, 1310, 538, 556, 988, 1243, 446, 836, 1372, 850, 814, 726, 800, 1169, 1190, 1013, 172, 1533, 638, 629, 463, 1194, 421, 497, 1285, 1382, 681, 1473, 1540, 478, 613, 913, 756, 515},
            {837, 1126, 273, 1417, 682, 382, 537, 1311, 442, 151, 95, 1270, 1463, 273, 415, 0, 271, 508, 624, 437, 1281, 420, 1128, 1047, 1236, 149, 1042, 941, 1103, 1737, 1028, 414, 829, 243, 322, 1436, 519, 689, 437, 555, 132, 487, 173, 1030, 286, 962, 1367, 541, 1380, 646, 716, 897, 1152, 159, 745, 1468, 702, 822, 375, 760, 1078, 1177, 1179, 311, 1603, 598, 342, 592, 1140, 600, 457, 1381, 1548, 431, 1420, 1527, 69, 407, 1079, 922, 228},
            {1094, 1397, 521, 1688, 953, 653, 710, 1582, 449, 200, 366, 1541, 1734, 544, 597, 271, 0, 779, 895, 488, 1552, 217, 1399, 1318, 1507, 420, 1299, 1212, 1374, 1994, 1285, 596, 1086, 320, 325, 1707, 790, 960, 234, 826, 399, 744, 421, 1301, 335, 1233, 1624, 548, 1651, 917, 979, 1168, 1423, 430, 1016, 1739, 973, 1093, 188, 1031, 1349, 1448, 1436, 425, 1874, 869, 613, 863, 1411, 857, 728, 1652, 1805, 702, 1691, 1798, 336, 678, 1336, 1179, 499},
            {576, 785, 387, 983, 248, 131, 675, 894, 734, 659, 444, 884, 1077, 235, 553, 508, 779, 0, 156, 608, 922, 727, 769, 613, 802, 364, 701, 524, 683, 1389, 767, 552, 569, 497, 710, 1002, 114, 348, 708, 214, 386, 389, 442, 689, 692, 621, 1017, 753, 994, 305, 387, 480, 735, 349, 328, 1109, 297, 442, 629, 334, 661, 743, 838, 499, 1215, 246, 312, 311, 706, 500, 105, 1022, 1204, 283, 1003, 1093, 451, 195, 760, 661, 280},
            {575, 700, 498, 827, 92, 242, 782, 738, 845, 772, 555, 728, 921, 352, 664, 624, 895, 156, 0, 719, 766, 844, 613, 457, 646, 475, 630, 368, 527, 1233, 726, 663, 568, 614, 821, 846, 195, 277, 825, 216, 503, 468, 553, 533, 803, 550, 861, 864, 838, 292, 370, 324, 579, 466, 172, 953, 299, 286, 746, 178, 505, 587, 767, 610, 1059, 104, 429, 326, 550, 537, 167, 866, 1048, 377, 847, 937, 568, 307, 689, 650, 397},
            {768, 1097, 225, 1527, 811, 477, 222, 1457, 126, 288, 397, 1297, 1490, 605, 150, 437, 488, 608, 719, 0, 1286, 697, 1155, 1157, 1346, 357, 973, 1087, 1229, 1668, 959, 167, 711, 639, 224, 1546, 722, 716, 714, 650, 528, 416, 287, 1057, 206, 953, 1298, 145, 1407, 635, 653, 1043, 1298, 491, 891, 1469, 905, 911, 668, 855, 1224, 1287, 1110, 152, 1630, 693, 674, 560, 1252, 522, 552, 1382, 1479, 736, 1566, 1637, 502, 668, 1010, 853, 560},
            {518, 205, 1091, 443, 702, 910, 1076, 550, 1412, 1412, 1212, 144, 209, 1101, 1189, 1281, 1552, 922, 766, 1286, 0, 1593, 153, 406, 324, 1132, 313, 689, 527, 471, 509, 1138, 587, 1363, 1418, 527, 954, 592, 1574, 726, 1252, 874, 1191, 251, 1400, 369, 95, 1389, 258, 673, 720, 729, 701, 1215, 818, 187, 960, 480, 1495, 588, 627, 276, 176, 1207, 377, 704, 1178, 748, 449, 808, 839, 100, 282, 1136, 556, 546, 1317, 1066, 372, 433, 1146},
            {1169, 1438, 682, 1636, 901, 683, 919, 1530, 658, 409, 477, 1537, 1730, 492, 806, 420, 217, 727, 844, 697, 1593, 0, 1440, 1266, 1455, 552, 1354, 1160, 1322, 2042, 1360, 805, 1162, 230, 534, 1655, 738, 1001, 62, 867, 341, 890, 582, 1342, 544, 1274, 1679, 757, 1647, 958, 1028, 1116, 1371, 378, 964, 1780, 921, 1123, 140, 1015, 1297, 1396, 1491, 634, 1868, 899, 561, 904, 1359, 1003, 758, 1693, 1860, 650, 1639, 1746, 406, 626, 1411, 1254, 447},
            {486, 283, 960, 497, 549, 757, 1044, 544, 1281, 1276, 1059, 142, 335, 948, 1058, 1128, 1399, 769, 613, 1155, 153, 1440, 0, 265, 318, 979, 345, 558, 396, 624, 477, 1007, 555, 1210, 1287, 521, 801, 439, 1421, 573, 1099, 743, 1057, 98, 1269, 321, 248, 1299, 252, 520, 567, 588, 570, 1062, 665, 340, 807, 327, 1342, 435, 496, 135, 329, 1076, 475, 551, 1025, 595, 395, 742, 686, 253, 435, 983, 550, 612, 1164, 913, 404, 401, 993},
            {675, 548, 938, 370, 365, 682, 1059, 407, 1283, 1198, 987, 271, 464, 774, 1060, 1047, 1318, 613, 457, 1157, 406, 1266, 265, 0, 189, 915, 610, 293, 131, 776, 742, 1009, 744, 1036, 1261, 389, 617, 441, 1247, 571, 925, 745, 993, 363, 1243, 586, 501, 1301, 381, 522, 569, 323, 305, 888, 444, 555, 597, 246, 1168, 304, 231, 130, 582, 1050, 602, 470, 851, 597, 154, 744, 607, 468, 650, 799, 413, 480, 990, 729, 669, 666, 819},
            {804, 529, 1127, 184, 554, 871, 1248, 226, 1472, 1387, 1176, 180, 349, 963, 1249, 1236, 1507, 802, 646, 1346, 324, 1455, 318, 189, 0, 1104, 637, 365, 203, 618, 795, 1198, 873, 1225, 1450, 203, 806, 630, 1436, 760, 1114, 934, 1182, 416, 1432, 639, 419, 1490, 266, 711, 758, 409, 377, 1077, 561, 446, 724, 435, 1357, 493, 303, 243, 500, 1239, 416, 659, 1040, 786, 125, 933, 796, 377, 541, 988, 232, 294, 1179, 918, 696, 719, 1008},
            {688, 977, 144, 1285, 567, 233, 424, 1213, 483, 297, 80, 1121, 1314, 288, 302, 149, 420, 364, 475, 357, 1132, 552, 979, 915, 1104, 0, 893, 843, 985, 1588, 879, 301, 680, 322, 412, 1304, 478, 540, 533, 406, 211, 338, 78, 881, 394, 813, 1218, 502, 1231, 497, 567, 799, 1054, 174, 647, 1319, 661, 673, 454, 611, 980, 1045, 1030, 217, 1454, 449, 357, 443, 1008, 451, 308, 1232, 1399, 446, 1322, 1395, 206, 422, 930, 773, 243},
            {205, 150, 778, 756, 609, 671, 763, 863, 1099, 1099, 973, 457, 522, 862, 876, 1042, 1299, 701, 630, 973, 313, 1354, 345, 610, 637, 893, 0, 723, 741, 695, 196, 825, 274, 1124, 1105, 840, 815, 353, 1335, 487, 1013, 561, 878, 247, 1087, 80, 325, 1076, 571, 434, 410, 714, 915, 976, 725, 496, 867, 425, 1256, 495, 841, 480, 137, 894, 690, 528, 939, 470, 740, 495, 600, 409, 506, 954, 869, 859, 1078, 886, 63, 120, 907},
            {727, 712, 866, 546, 324, 610, 1111, 370, 1213, 1092, 881, 545, 711, 668, 1032, 941, 1212, 524, 368, 1087, 689, 1160, 558, 293, 365, 843, 723, 0, 162, 980, 819, 1031, 796, 930, 1189, 565, 494, 493, 1141, 582, 819, 797, 921, 545, 1171, 643, 784, 1232, 628, 574, 621, 44, 211, 782, 196, 808, 359, 298, 1062, 263, 137, 423, 796, 978, 778, 470, 745, 649, 240, 796, 535, 742, 903, 676, 479, 656, 884, 606, 782, 743, 713},
            {786, 679, 1008, 384, 435, 752, 1170, 333, 1355, 1254, 1043, 383, 549, 830, 1171, 1103, 1374, 683, 527, 1229, 527, 1322, 396, 131, 203, 985, 741, 162, 0, 818, 873, 1120, 855, 1092, 1331, 403, 656, 552, 1303, 682, 981, 856, 1063, 494, 1313, 702, 622, 1374, 466, 633, 680, 206, 174, 944, 358, 646, 521, 357, 1224, 374, 100, 261, 703, 1120, 616, 581, 907, 708, 78, 855, 677, 580, 741, 838, 427, 494, 1046, 768, 800, 797, 875},
            {900, 667, 1473, 434, 1141, 1366, 1458, 771, 1794, 1794, 1668, 509, 340, 1550, 1571, 1737, 1994, 1389, 1233, 1668, 471, 2042, 624, 776, 618, 1588, 695, 980, 818, 0, 891, 1520, 969, 1812, 1800, 567, 1393, 1048, 2023, 1182, 1701, 1256, 1573, 722, 1782, 775, 393, 1771, 395, 1129, 1105, 1024, 922, 1664, 1176, 284, 1339, 951, 1944, 1059, 918, 646, 558, 1589, 202, 1175, 1627, 1165, 740, 1190, 1295, 371, 189, 1575, 654, 427, 1766, 1505, 754, 815, 1595},
            {191, 320, 764, 952, 705, 681, 749, 1021, 1085, 1085, 959, 619, 718, 868, 862, 1028, 1285, 767, 726, 959, 509, 1360, 477, 742, 795, 879, 196, 819, 873, 891, 0, 811, 260, 1130, 1091, 998, 881, 449, 1341, 566, 1019, 547, 864, 379, 1073, 176, 521, 1062, 729, 478, 396, 810, 1018, 982, 821, 692, 963, 521, 1262, 591, 944, 612, 333, 880, 886, 624, 945, 456, 872, 481, 666, 605, 702, 960, 1027, 1055, 1084, 892, 147, 127, 913},
            {620, 949, 169, 1379, 755, 421, 130, 1401, 293, 396, 351, 1149, 1342, 559, 51, 414, 596, 552, 663, 167, 1138, 805, 1007, 1009, 1198, 301, 825, 1031, 1120, 1520, 811, 0, 587, 593, 382, 1398, 666, 568, 804, 522, 482, 264, 241, 909, 364, 805, 1150, 292, 1259, 487, 505, 987, 1242, 445, 835, 1321, 849, 763, 725, 799, 1168, 1139, 962, 171, 1482, 611, 628, 412, 1143, 370, 496, 1234, 1331, 680, 1422, 1489, 477, 612, 862, 705, 514},
            {69, 398, 565, 1030, 639, 483, 489, 1099, 833, 886, 760, 697, 796, 670, 611, 829, 1086, 569, 568, 711, 587, 1162, 555, 744, 873, 680, 274, 796, 855, 969, 260, 587, 0, 932, 892, 1076, 683, 326, 1143, 368, 821, 348, 665, 457, 874, 254, 599, 802, 807, 280, 198, 787, 995, 784, 740, 770, 866, 498, 1064, 568, 921, 690, 411, 681, 964, 466, 747, 258, 878, 235, 468, 683, 780, 762, 1105, 1133, 886, 694, 311, 154, 715},
            {939, 1208, 452, 1406, 671, 453, 716, 1300, 681, 390, 247, 1307, 1500, 262, 594, 243, 320, 497, 614, 639, 1363, 230, 1210, 1036, 1225, 322, 1124, 930, 1092, 1812, 1130, 593, 932, 0, 561, 1425, 508, 771, 211, 637, 111, 660, 352, 1112, 525, 1044, 1449, 780, 1417, 728, 798, 886, 1141, 148, 734, 1550, 691, 893, 132, 785, 1067, 1166, 1261, 491, 1638, 669, 331, 674, 1129, 773, 528, 1463, 1630, 420, 1409, 1516, 176, 396, 1181, 1024, 217},
            {900, 1229, 327, 1631, 913, 579, 446, 1559, 126, 173, 417, 1429, 1622, 595, 374, 322, 325, 710, 821, 224, 1418, 534, 1287, 1261, 1450, 412, 1105, 1189, 1331, 1800, 1091, 382, 892, 561, 0, 1650, 824, 848, 551, 752, 450, 550, 334, 1189, 36, 1085, 1430, 225, 1539, 767, 785, 1145, 1400, 481, 993, 1601, 1007, 1019, 505, 957, 1326, 1391, 1242, 211, 1762, 795, 664, 692, 1354, 663, 654, 1514, 1611, 753, 1668, 1741, 387, 729, 1142, 985, 550},
            {1007, 732, 1327, 217, 754, 1071, 1448, 210, 1672, 1587, 1376, 383, 432, 1163, 1449, 1436, 1707, 1002, 846, 1546, 527, 1655, 521, 389, 203, 1304, 840, 565, 403, 567, 998, 1398, 1076, 1425, 1650, 0, 1006, 830, 1636, 960, 1314, 1134, 1382, 619, 1632, 842, 622, 1690, 349, 911, 958, 609, 361, 1277, 761, 529, 924, 635, 1557, 693, 435, 443, 703, 1439, 365, 859, 1240, 986, 325, 1133, 996, 567, 624, 1188, 93, 140, 1379, 1118, 899, 922, 1208},
            {690, 888, 501, 987, 252, 245, 789, 864, 848, 670, 459, 888, 1081, 246, 667, 519, 790, 114, 195, 722, 954, 738, 801, 617, 806, 478, 815, 494, 656, 1393, 881, 666, 683, 508, 824, 1006, 0, 462, 719, 328, 397, 503, 556, 721, 805, 735, 1049, 867, 998, 419, 501, 450, 705, 360, 298, 1141, 183, 474, 640, 366, 631, 747, 952, 613, 1219, 295, 271, 425, 710, 614, 219, 1054, 1236, 182, 973, 1097, 462, 112, 874, 775, 291},
            {333, 437, 521, 811, 348, 318, 618, 848, 842, 837, 620, 581, 774, 509, 619, 689, 960, 348, 277, 716, 592, 1001, 439, 441, 630, 540, 353, 493, 552, 1048, 449, 568, 326, 771, 848, 830, 462, 0, 982, 134, 660, 304, 618, 341, 830, 273, 678, 860, 691, 81, 128, 484, 692, 623, 449, 779, 576, 195, 903, 265, 618, 571, 490, 637, 914, 175, 586, 156, 575, 303, 247, 692, 859, 601, 854, 921, 725, 533, 412, 373, 554},
            {1150, 1419, 663, 1617, 882, 664, 927, 1511, 675, 426, 458, 1518, 1711, 473, 805, 437, 234, 708, 825, 714, 1574, 62, 1421, 1247, 1436, 533, 1335, 1141, 1303, 2023, 1341, 804, 1143, 211, 551, 1636, 719, 982, 0, 848, 322, 871, 563, 1323, 561, 1255, 1660, 774, 1628, 939, 1009, 1097, 1352, 359, 945, 1761, 902, 1104, 121, 996, 1278, 1377, 1472, 651, 1849, 880, 542, 885, 1340, 984, 739, 1674, 1841, 631, 1620, 1727, 387, 607, 1392, 1235, 428},
            {375, 571, 429, 941, 308, 184, 572, 952, 776, 703, 486, 715, 908, 375, 573, 555, 826, 214, 216, 650, 726, 867, 573, 571, 760, 406, 487, 582, 682, 1182, 566, 522, 368, 637, 752, 960, 328, 134, 848, 0, 526, 258, 484, 475, 734, 407, 812, 795, 825, 91, 173, 538, 793, 489, 388, 913, 511, 325, 769, 319, 719, 701, 624, 541, 1048, 112, 452, 110, 705, 321, 113, 826, 993, 467, 984, 1051, 591, 399, 546, 460, 420},
            {828, 1097, 341, 1295, 560, 342, 605, 1189, 570, 279, 136, 1196, 1389, 151, 483, 132, 399, 386, 503, 528, 1252, 341, 1099, 925, 1114, 211, 1013, 819, 981, 1701, 1019, 482, 821, 111, 450, 1314, 397, 660, 322, 526, 0, 549, 241, 1001, 414, 933, 1338, 669, 1306, 617, 687, 775, 1030, 37, 623, 1439, 580, 782, 243, 674, 956, 1055, 1150, 380, 1527, 558, 220, 563, 1018, 662, 417, 1352, 1519, 309, 1298, 1405, 65, 285, 1070, 913, 106},
            {356, 685, 223, 1115, 560, 258, 322, 1152, 542, 544, 418, 885, 1078, 445, 315, 487, 744, 389, 468, 416, 874, 890, 743, 745, 934, 338, 561, 797, 856, 1256, 547, 264, 348, 660, 550, 1134, 503, 304, 871, 258, 549, 0, 323, 645, 532, 541, 886, 556, 995, 223, 241, 781, 996, 512, 640, 1057, 686, 499, 792, 562, 922, 875, 698, 339, 1218, 370, 522, 148, 879, 119, 301, 970, 1067, 537, 1158, 1225, 544, 469, 598, 441, 490},
            {673, 1002, 100, 1363, 645, 311, 364, 1291, 413, 221, 110, 1199, 1392, 318, 242, 173, 421, 442, 553, 287, 1191, 582, 1057, 993, 1182, 78, 878, 921, 1063, 1573, 864, 241, 665, 352, 334, 1382, 556, 618, 563, 484, 241, 323, 0, 959, 316, 858, 1203, 432, 1309, 540, 558, 877, 1132, 204, 725, 1374, 739, 751, 484, 689, 1058, 1123, 1015, 139, 1532, 527, 387, 465, 1086, 436, 386, 1287, 1384, 476, 1400, 1473, 236, 452, 915, 758, 273},
            {388, 185, 862, 595, 469, 659, 946, 642, 1183, 1178, 961, 240, 433, 850, 960, 1030, 1301, 689, 533, 1057, 251, 1342, 98, 363, 416, 881, 247, 545, 494, 722, 379, 909, 457, 1112, 1189, 619, 721, 341, 1323, 475, 1001, 645, 959, 0, 1171, 223, 346, 1201, 350, 422, 469, 561, 668, 964, 585, 438, 727, 247, 1244, 355, 594, 233, 269, 978, 573, 471, 927, 497, 493, 644, 588, 351, 533, 903, 648, 710, 1066, 833, 306, 303, 895},
            {882, 1211, 309, 1613, 895, 561, 428, 1541, 156, 137, 381, 1411, 1604, 559, 356, 286, 335, 692, 803, 206, 1400, 544, 1269, 1243, 1432, 394, 1087, 1171, 1313, 1782, 1073, 364, 874, 525, 36, 1632, 805, 830, 561, 734, 414, 532, 316, 1171, 0, 1067, 1412, 255, 1521, 749, 767, 1127, 1382, 445, 975, 1583, 988, 1001, 515, 939, 1308, 1373, 1224, 193, 1744, 777, 628, 674, 1336, 645, 636, 1496, 1593, 717, 1650, 1723, 351, 693, 1124, 967, 514},
            {185, 164, 758, 812, 529, 591, 743, 865, 1079, 1079, 893, 463, 578, 782, 856, 962, 1233, 621, 550, 953, 369, 1274, 321, 586, 639, 813, 80, 643, 702, 775, 176, 805, 254, 1044, 1085, 842, 735, 273, 1255, 407, 933, 541, 858, 223, 1067, 0, 405, 1056, 573, 354, 390, 634, 842, 896, 645, 552, 787, 345, 1176, 415, 768, 456, 217, 874, 746, 448, 859, 429, 716, 475, 520, 465, 586, 874, 871, 915, 998, 806, 139, 100, 827},
            {530, 296, 1103, 518, 797, 996, 1088, 645, 1424, 1424, 1298, 239, 284, 1187, 1201, 1367, 1624, 1017, 861, 1298, 95, 1679, 248, 501, 419, 1218, 325, 784, 622, 393, 521, 1150, 599, 1449, 1430, 622, 1049, 678, 1660, 812, 1338, 886, 1203, 346, 1412, 405, 0, 1401, 353, 759, 735, 824, 796, 1301, 913, 230, 1055, 575, 1581, 683, 722, 371, 188, 1219, 452, 799, 1264, 795, 544, 820, 925, 149, 204, 1231, 651, 621, 1403, 1161, 384, 445, 1232},
            {871, 1200, 370, 1671, 956, 622, 313, 1602, 99, 392, 542, 1441, 1598, 750, 241, 541, 548, 753, 864, 145, 1389, 757, 1299, 1301, 1490, 502, 1076, 1232, 1374, 1771, 1062, 292, 802, 780, 225, 1690, 867, 860, 774, 795, 669, 556, 432, 1201, 255, 1056, 1401, 0, 1551, 779, 797, 1188, 1443, 636, 1036, 1572, 1050, 1055, 728, 1000, 1369, 1431, 1213, 297, 1766, 838, 819, 704, 1397, 662, 697, 1485, 1582, 881, 1711, 1781, 606, 813, 1113, 956, 705},
            {738, 463, 1212, 245, 746, 1009, 1296, 479, 1533, 1528, 1311, 114, 83, 1155, 1310, 1380, 1651, 994, 838, 1407, 258, 1647, 252, 381, 266, 1231, 571, 628, 466, 395, 729, 1259, 807, 1417, 1539, 349, 998, 691, 1628, 825, 1306, 995, 1309, 350, 1521, 573, 353, 1551, 0, 772, 819, 672, 630, 1269, 824, 180, 978, 579, 1549, 685, 566, 251, 434, 1328, 223, 803, 1232, 847, 388, 994, 938, 218, 275, 1180, 408, 388, 1371, 1110, 630, 653, 1200},
            {287, 518, 440, 892, 363, 275, 537, 929, 761, 761, 577, 662, 855, 466, 538, 646, 917, 305, 292, 635, 673, 958, 520, 522, 711, 497, 434, 574, 633, 1129, 478, 487, 280, 728, 767, 911, 419, 81, 939, 91, 617, 223, 540, 422, 749, 354, 759, 779, 772, 0, 82, 558, 773, 580, 464, 860, 591, 276, 860, 339, 699, 652, 571, 556, 995, 190, 543, 75, 656, 257, 204, 773, 940, 558, 935, 1002, 682, 490, 493, 372, 511},
            {205, 534, 458, 939, 441, 349, 543, 976, 779, 779, 647, 709, 902, 536, 556, 716, 979, 387, 370, 653, 720, 1028, 567, 569, 758, 567, 410, 621, 680, 1105, 396, 505, 198, 798, 785, 958, 501, 128, 1009, 173, 687, 241, 558, 469, 767, 390, 735, 797, 819, 82, 0, 612, 820, 650, 542, 906, 669, 323, 930, 393, 746, 699, 547, 574, 1042, 268, 613, 124, 703, 175, 286, 819, 916, 628, 982, 1049, 752, 560, 447, 290, 581},
            {718, 728, 822, 590, 280, 566, 1095, 414, 1169, 1048, 837, 589, 755, 624, 988, 897, 1168, 480, 324, 1043, 729, 1116, 588, 323, 409, 799, 714, 44, 206, 1024, 810, 987, 787, 886, 1145, 609, 450, 484, 1097, 538, 775, 781, 877, 561, 1127, 634, 824, 1188, 672, 558, 612, 0, 255, 738, 152, 852, 315, 314, 1018, 219, 181, 453, 812, 934, 822, 426, 701, 633, 284, 787, 491, 786, 947, 632, 523, 700, 840, 562, 773, 734, 669},
            {926, 853, 1077, 548, 535, 821, 1310, 159, 1424, 1303, 1092, 557, 713, 879, 1243, 1152, 1423, 735, 579, 1298, 701, 1371, 570, 305, 377, 1054, 915, 211, 174, 922, 1018, 1242, 995, 1141, 1400, 361, 705, 692, 1352, 793, 1030, 996, 1132, 668, 1382, 842, 796, 1443, 630, 773, 820, 255, 0, 993, 407, 810, 570, 497, 1273, 474, 74, 435, 877, 1189, 720, 681, 956, 848, 252, 995, 746, 754, 905, 887, 268, 495, 1095, 817, 974, 942, 924},
            {791, 1060, 304, 1258, 523, 305, 568, 1152, 601, 310, 99, 1159, 1352, 114, 446, 159, 430, 349, 466, 491, 1215, 378, 1062, 888, 1077, 174, 976, 782, 944, 1664, 982, 445, 784, 148, 481, 1277, 360, 623, 359, 489, 37, 512, 204, 964, 445, 896, 1301, 636, 1269, 580, 650, 738, 993, 0, 586, 1402, 543, 745, 280, 637, 919, 1018, 1113, 343, 1490, 521, 183, 526, 981, 625, 380, 1315, 1482, 272, 1261, 1368, 102, 248, 1033, 876, 69},
            {729, 752, 670, 742, 131, 414, 954, 566, 1017, 896, 685, 715, 907, 472, 836, 745, 1016, 328, 172, 891, 818, 964, 665, 444, 561, 647, 725, 196, 358, 1176, 821, 835, 740, 734, 993, 761, 298, 449, 945, 388, 623, 640, 725, 585, 975, 645, 913, 1036, 824, 464, 542, 152, 407, 586, 0, 999, 163, 338, 866, 230, 333, 574, 836, 782, 974, 276, 549, 498, 436, 709, 339, 912, 1094, 480, 675, 852, 688, 410, 784, 745, 517},
            {701, 388, 1274, 331, 889, 1097, 1259, 659, 1595, 1595, 1399, 284, 97, 1288, 1372, 1468, 1739, 1109, 953, 1469, 187, 1780, 340, 555, 446, 1319, 496, 808, 646, 284, 692, 1321, 770, 1550, 1601, 529, 1141, 779, 1761, 913, 1439, 1057, 1374, 438, 1583, 552, 230, 1572, 180, 860, 906, 852, 810, 1402, 999, 0, 1147, 667, 1682, 775, 746, 425, 359, 1390, 265, 891, 1365, 935, 568, 991, 1026, 87, 95, 1323, 588, 434, 1504, 1253, 555, 616, 1333},
            {871, 894, 684, 905, 258, 428, 972, 729, 1031, 853, 642, 868, 1061, 429, 850, 702, 973, 297, 299, 905, 960, 921, 807, 597, 724, 661, 867, 359, 521, 1339, 963, 849, 866, 691, 1007, 924, 183, 576, 902, 511, 580, 686, 739, 727, 988, 787, 1055, 1050, 978, 591, 669, 315, 570, 543, 163, 1147, 0, 480, 823, 372, 496, 727, 978, 796, 1137, 403, 454, 608, 599, 797, 402, 1060, 1242, 365, 838, 1015, 645, 295, 926, 887, 474},
            {429, 414, 696, 616, 222, 440, 813, 653, 1037, 970, 753, 469, 662, 631, 814, 822, 1093, 442, 286, 911, 480, 1123, 327, 246, 435, 673, 425, 298, 357, 951, 521, 763, 498, 893, 1019, 635, 474, 195, 1104, 325, 782, 499, 751, 247, 1001, 345, 575, 1055, 579, 276, 323, 314, 497, 745, 338, 667, 480, 0, 1025, 108, 423, 376, 498, 808, 802, 224, 708, 351, 380, 498, 365, 580, 762, 656, 659, 726, 847, 586, 484, 445, 676},
            {1071, 1340, 584, 1538, 803, 585, 848, 1432, 629, 380, 379, 1439, 1632, 394, 726, 375, 188, 629, 746, 668, 1495, 140, 1342, 1168, 1357, 454, 1256, 1062, 1224, 1944, 1262, 725, 1064, 132, 505, 1557, 640, 903, 121, 769, 243, 792, 484, 1244, 515, 1176, 1581, 728, 1549, 860, 930, 1018, 1273, 280, 866, 1682, 823, 1025, 0, 917, 1199, 1298, 1393, 605, 1770, 801, 463, 806, 1261, 905, 660, 1595, 1762, 552, 1541, 1648, 308, 528, 1313, 1156, 349},
            {499, 522, 634, 674, 114, 378, 876, 633, 981, 908, 691, 575, 768, 523, 800, 760, 1031, 334, 178, 855, 588, 1015, 435, 304, 493, 611, 495, 263, 374, 1059, 591, 799, 568, 785, 957, 693, 366, 265, 996, 319, 674, 562, 689, 355, 939, 415, 683, 1000, 685, 339, 393, 219, 474, 637, 230, 775, 372, 108, 917, 0, 400, 434, 606, 746, 906, 207, 600, 414, 397, 568, 303, 688, 870, 548, 717, 784, 739, 478, 554, 515, 568},
            {852, 779, 1003, 484, 461, 747, 1236, 233, 1350, 1229, 1018, 483, 649, 805, 1169, 1078, 1349, 661, 505, 1224, 627, 1297, 496, 231, 303, 980, 841, 137, 100, 918, 944, 1168, 921, 1067, 1326, 435, 631, 618, 1278, 719, 956, 922, 1058, 594, 1308, 768, 722, 1369, 566, 699, 746, 181, 74, 919, 333, 746, 496, 423, 1199, 400, 0, 361, 803, 1115, 716, 607, 882, 774, 178, 921, 672, 680, 841, 813, 342, 569, 1021, 743, 900, 868, 850},
            {621, 418, 1068, 424, 495, 812, 1179, 461, 1413, 1328, 1117, 141, 334, 904, 1190, 1177, 1448, 743, 587, 1287, 276, 1396, 135, 130, 243, 1045, 480, 423, 261, 646, 612, 1139, 690, 1166, 1391, 443, 747, 571, 1377, 701, 1055, 875, 1123, 233, 1373, 456, 371, 1431, 251, 652, 699, 453, 435, 1018, 574, 425, 727, 376, 1298, 434, 361, 0, 452, 1180, 474, 600, 981, 727, 260, 874, 737, 338, 520, 929, 467, 534, 1120, 859, 539, 536, 949},
            {342, 110, 915, 619, 720, 808, 900, 726, 1236, 1236, 1110, 320, 385, 999, 1013, 1179, 1436, 838, 767, 1110, 176, 1491, 329, 582, 500, 1030, 137, 796, 703, 558, 333, 962, 411, 1261, 1242, 703, 952, 490, 1472, 624, 1150, 698, 1015, 269, 1224, 217, 188, 1213, 434, 571, 547, 812, 877, 1113, 836, 359, 978, 498, 1393, 606, 803, 452, 0, 1031, 553, 665, 1076, 607, 625, 632, 737, 272, 369, 1091, 732, 722, 1215, 1023, 196, 257, 1044},
            {689, 1018, 116, 1420, 702, 368, 294, 1348, 278, 225, 249, 1218, 1411, 457, 172, 311, 425, 499, 610, 152, 1207, 634, 1076, 1050, 1239, 217, 894, 978, 1120, 1589, 880, 171, 681, 491, 211, 1439, 613, 637, 651, 541, 380, 339, 139, 978, 193, 874, 1219, 297, 1328, 556, 574, 934, 1189, 343, 782, 1390, 796, 808, 605, 746, 1115, 1180, 1031, 0, 1551, 584, 526, 481, 1143, 452, 443, 1303, 1400, 615, 1457, 1530, 375, 559, 931, 774, 412},
            {895, 582, 1435, 232, 967, 1232, 1453, 569, 1756, 1751, 1534, 337, 168, 1376, 1533, 1603, 1874, 1215, 1059, 1630, 377, 1868, 475, 602, 416, 1454, 690, 778, 616, 202, 886, 1482, 964, 1638, 1762, 365, 1219, 914, 1849, 1048, 1527, 1218, 1532, 573, 1744, 746, 452, 1766, 223, 995, 1042, 822, 720, 1490, 974, 265, 1137, 802, 1770, 906, 716, 474, 553, 1551, 0, 1026, 1453, 1070, 538, 1185, 1161, 303, 360, 1401, 452, 225, 1592, 1331, 749, 810, 1421},
            {473, 612, 472, 840, 196, 216, 684, 840, 819, 746, 529, 693, 886, 407, 638, 598, 869, 246, 104, 693, 704, 899, 551, 470, 659, 449, 528, 470, 581, 1175, 624, 611, 466, 669, 795, 859, 295, 175, 880, 112, 558, 370, 527, 471, 777, 448, 799, 838, 803, 190, 268, 426, 681, 521, 276, 891, 403, 224, 801, 207, 607, 600, 665, 584, 1026, 0, 484, 222, 604, 433, 141, 804, 986, 477, 883, 950, 623, 407, 587, 548, 452},
            {754, 1023, 487, 1221, 486, 268, 751, 1115, 784, 493, 282, 1122, 1315, 159, 629, 342, 613, 312, 429, 674, 1178, 561, 1025, 851, 1040, 357, 939, 745, 907, 1627, 945, 628, 747, 331, 664, 1240, 271, 586, 542, 452, 220, 522, 387, 927, 628, 859, 1264, 819, 1232, 543, 613, 701, 956, 183, 549, 1365, 454, 708, 463, 600, 882, 981, 1076, 526, 1453, 484, 0, 489, 944, 633, 343, 1278, 1445, 89, 1224, 1331, 285, 177, 996, 839, 114},
            {265, 593, 365, 967, 418, 225, 462, 1004, 686, 686, 523, 737, 930, 412, 463, 592, 863, 311, 326, 560, 748, 904, 595, 597, 786, 443, 470, 649, 708, 1165, 456, 412, 258, 674, 692, 986, 425, 156, 885, 110, 563, 148, 465, 497, 674, 429, 795, 704, 847, 75, 124, 633, 848, 526, 498, 935, 608, 351, 806, 414, 774, 727, 607, 481, 1070, 222, 489, 0, 731, 211, 210, 848, 976, 504, 1010, 1077, 628, 436, 507, 350, 457},
            {809, 654, 1031, 306, 458, 775, 1193, 343, 1378, 1291, 1080, 305, 471, 867, 1194, 1140, 1411, 706, 550, 1252, 449, 1359, 395, 154, 125, 1008, 740, 240, 78, 740, 872, 1143, 878, 1129, 1354, 325, 710, 575, 1340, 705, 1018, 879, 1086, 493, 1336, 716, 544, 1397, 388, 656, 703, 284, 252, 981, 436, 568, 599, 380, 1261, 397, 178, 260, 625, 1143, 538, 604, 944, 731, 0, 878, 700, 502, 663, 892, 349, 416, 1083, 822, 799, 796, 912},
            {290, 619, 336, 1114, 616, 369, 375, 1151, 648, 657, 531, 884, 1017, 556, 421, 600, 857, 500, 537, 522, 808, 1003, 742, 744, 933, 451, 495, 796, 855, 1190, 481, 370, 235, 773, 663, 1133, 614, 303, 984, 321, 662, 119, 436, 644, 645, 475, 820, 662, 994, 257, 175, 787, 995, 625, 709, 991, 797, 498, 905, 568, 921, 874, 632, 452, 1185, 433, 633, 211, 878, 0, 412, 904, 1001, 648, 1157, 1224, 657, 580, 532, 375, 601},
            {475, 684, 331, 977, 259, 75, 615, 905, 678, 605, 388, 828, 1021, 266, 497, 457, 728, 105, 167, 552, 839, 758, 686, 607, 796, 308, 600, 535, 677, 1295, 666, 496, 468, 528, 654, 996, 219, 247, 739, 113, 417, 301, 386, 588, 636, 520, 925, 697, 938, 204, 286, 491, 746, 380, 339, 1026, 402, 365, 660, 303, 672, 737, 737, 443, 1161, 141, 343, 210, 700, 412, 0, 939, 1106, 358, 1014, 1087, 482, 290, 659, 560, 311},
            {614, 301, 1187, 369, 802, 1010, 1172, 603, 1508, 1508, 1312, 197, 135, 1201, 1285, 1381, 1652, 1022, 866, 1382, 100, 1693, 253, 468, 377, 1232, 409, 742, 580, 371, 605, 1234, 683, 1463, 1514, 567, 1054, 692, 1674, 826, 1352, 970, 1287, 351, 1496, 465, 149, 1485, 218, 773, 819, 786, 754, 1315, 912, 87, 1060, 580, 1595, 688, 680, 338, 272, 1303, 303, 804, 1278, 848, 502, 904, 939, 0, 182, 1236, 609, 472, 1417, 1166, 468, 529, 1246},
            {711, 478, 1284, 426, 984, 1177, 1269, 754, 1605, 1605, 1479, 379, 192, 1368, 1382, 1548, 1805, 1204, 1048, 1479, 282, 1860, 435, 650, 541, 1399, 506, 903, 741, 189, 702, 1331, 780, 1630, 1611, 624, 1236, 859, 1841, 993, 1519, 1067, 1384, 533, 1593, 586, 204, 1582, 275, 940, 916, 947, 905, 1482, 1094, 95, 1242, 762, 1762, 870, 841, 520, 369, 1400, 360, 986, 1445, 976, 663, 1001, 1106, 182, 0, 1418, 683, 529, 1584, 1348, 565, 626, 1413},
            {769, 1038, 515, 1169, 434, 283, 803, 1046, 862, 582, 371, 1070, 1263, 174, 681, 431, 702, 283, 377, 736, 1136, 650, 983, 799, 988, 446, 954, 676, 838, 1575, 960, 680, 762, 420, 753, 1188, 182, 601, 631, 467, 309, 537, 476, 903, 717, 874, 1231, 881, 1180, 558, 628, 632, 887, 272, 480, 1323, 365, 656, 552, 548, 813, 929, 1091, 615, 1401, 477, 89, 504, 892, 648, 358, 1236, 1418, 0, 1155, 1279, 374, 88, 1011, 854, 203},
            {1036, 761, 1345, 310, 778, 1089, 1472, 117, 1692, 1571, 1360, 412, 491, 1147, 1473, 1420, 1691, 1003, 847, 1566, 556, 1639, 550, 413, 232, 1322, 869, 479, 427, 654, 1027, 1422, 1105, 1409, 1668, 93, 973, 854, 1620, 984, 1298, 1158, 1400, 648, 1650, 871, 651, 1711, 408, 935, 982, 523, 268, 1261, 675, 588, 838, 659, 1541, 717, 342, 467, 732, 1457, 452, 883, 1224, 1010, 349, 1157, 1014, 609, 683, 1155, 0, 227, 1363, 1085, 928, 951, 1192},
            {1064, 751, 1418, 143, 845, 1162, 1539, 344, 1763, 1678, 1467, 474, 337, 1254, 1540, 1527, 1798, 1093, 937, 1637, 546, 1746, 612, 480, 294, 1395, 859, 656, 494, 427, 1055, 1489, 1133, 1516, 1741, 140, 1097, 921, 1727, 1051, 1405, 1225, 1473, 710, 1723, 915, 621, 1781, 388, 1002, 1049, 700, 495, 1368, 852, 434, 1015, 726, 1648, 784, 569, 534, 722, 1530, 225, 950, 1331, 1077, 416, 1224, 1087, 472, 529, 1279, 227, 0, 1470, 1209, 918, 979, 1299},
            {893, 1162, 336, 1360, 625, 407, 600, 1254, 507, 216, 126, 1261, 1454, 216, 478, 69, 336, 451, 568, 502, 1317, 406, 1164, 990, 1179, 206, 1078, 884, 1046, 1766, 1084, 477, 886, 176, 387, 1379, 462, 725, 387, 591, 65, 544, 236, 1066, 351, 998, 1403, 606, 1371, 682, 752, 840, 1095, 102, 688, 1504, 645, 847, 308, 739, 1021, 1120, 1215, 375, 1592, 623, 285, 628, 1083, 657, 482, 1417, 1584, 374, 1363, 1470, 0, 350, 1135, 978, 171},
            {701, 970, 447, 1099, 364, 215, 735, 976, 794, 558, 347, 1000, 1193, 134, 613, 407, 678, 195, 307, 668, 1066, 626, 913, 729, 918, 422, 886, 606, 768, 1505, 892, 612, 694, 396, 729, 1118, 112, 533, 607, 399, 285, 469, 452, 833, 693, 806, 1161, 813, 1110, 490, 560, 562, 817, 248, 410, 1253, 295, 586, 528, 478, 743, 859, 1023, 559, 1331, 407, 177, 436, 822, 580, 290, 1166, 1348, 88, 1085, 1209, 350, 0, 943, 786, 179},
            {242, 209, 815, 815, 668, 730, 800, 922, 1136, 1136, 1010, 516, 581, 919, 913, 1079, 1336, 760, 689, 1010, 372, 1411, 404, 669, 696, 930, 63, 782, 800, 754, 147, 862, 311, 1181, 1142, 899, 874, 412, 1392, 546, 1070, 598, 915, 306, 1124, 139, 384, 1113, 630, 493, 447, 773, 974, 1033, 784, 555, 926, 484, 1313, 554, 900, 539, 196, 931, 749, 587, 996, 507, 799, 532, 659, 468, 565, 1011, 928, 918, 1135, 943, 0, 157, 964},
            {85, 244, 658, 876, 629, 575, 643, 945, 979, 979, 853, 543, 642, 762, 756, 922, 1179, 661, 650, 853, 433, 1254, 401, 666, 719, 773, 120, 743, 797, 815, 127, 705, 154, 1024, 985, 922, 775, 373, 1235, 460, 913, 441, 758, 303, 967, 100, 445, 956, 653, 372, 290, 734, 942, 876, 745, 616, 887, 445, 1156, 515, 868, 536, 257, 774, 810, 548, 839, 350, 796, 375, 560, 529, 626, 854, 951, 979, 978, 786, 157, 0, 807},
            {722, 991, 373, 1189, 454, 236, 637, 1083, 670, 379, 168, 1090, 1283, 45, 515, 228, 499, 280, 397, 560, 1146, 447, 993, 819, 1008, 243, 907, 713, 875, 1595, 913, 514, 715, 217, 550, 1208, 291, 554, 428, 420, 106, 490, 273, 895, 514, 827, 1232, 705, 1200, 511, 581, 669, 924, 69, 517, 1333, 474, 676, 349, 568, 850, 949, 1044, 412, 1421, 452, 114, 457, 912, 601, 311, 1246, 1413, 203, 1192, 1299, 171, 179, 964, 807, 0}
    };
}
