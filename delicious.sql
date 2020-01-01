/*
 Navicat Premium Data Transfer

 Source Server         : Delicious1
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : delicious

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 01/01/2020 19:36:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for syscomment
-- ----------------------------
DROP TABLE IF EXISTS `syscomment`;
CREATE TABLE `syscomment`  (
  `CID` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Ccontent` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Ctime` date NULL DEFAULT NULL,
  PRIMARY KEY (`CID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of syscomment
-- ----------------------------
INSERT INTO `syscomment` VALUES (1, 1, 'lisi', '这是一条评论', '2019-12-27');
INSERT INTO `syscomment` VALUES (2, 4, 'wangwu', '评论1', '2019-12-18');
INSERT INTO `syscomment` VALUES (3, 4, 'wangwu', '评论2', '2019-12-18');
INSERT INTO `syscomment` VALUES (4, 5, 'xiaoli', '评论4', '2019-12-28');
INSERT INTO `syscomment` VALUES (5, 7, 'xiaoqiang', '评论5', '2019-12-28');
INSERT INTO `syscomment` VALUES (6, 5, 'xiaoli', '评论6', '2019-12-28');
INSERT INTO `syscomment` VALUES (7, 5, 'xiaoli', '评论7', '2019-12-28');
INSERT INTO `syscomment` VALUES (8, 6, 'xiaozhang', '评论8', '2019-12-28');
INSERT INTO `syscomment` VALUES (9, 7, 'xiaoqiang', '评论9', '2019-12-28');

-- ----------------------------
-- Table structure for sysmanage
-- ----------------------------
DROP TABLE IF EXISTS `sysmanage`;
CREATE TABLE `sysmanage`  (
  `Mid` int(11) NOT NULL AUTO_INCREMENT,
  `managename` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `mname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Mid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sysmanage
-- ----------------------------
INSERT INTO `sysmanage` VALUES (1, 'cheche', '12345', '12382451123', 'cyl');

-- ----------------------------
-- Table structure for sysrecipes
-- ----------------------------
DROP TABLE IF EXISTS `sysrecipes`;
CREATE TABLE `sysrecipes`  (
  `RID` int(11) NOT NULL AUTO_INCREMENT,
  `recipesName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `publishDate` date NULL DEFAULT NULL,
  `rimg` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `publisher` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`RID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sysrecipes
-- ----------------------------
INSERT INTO `sysrecipes` VALUES (2, '小龙虾', '2019-12-28', '152.jpg', '车车');
INSERT INTO `sysrecipes` VALUES (4, '鱼火锅', '2019-12-28', '113.jpg', 'wangwu');
INSERT INTO `sysrecipes` VALUES (7, '回锅肉', '2019-12-28', '618.jpg', 'xiaoqiang');
INSERT INTO `sysrecipes` VALUES (8, '回锅肉1', '2019-12-28', '708.jpg', '车车');
INSERT INTO `sysrecipes` VALUES (9, '回锅肉2', '2019-12-28', '78.jpg', 'wangwu');
INSERT INTO `sysrecipes` VALUES (10, '回锅肉3', '2019-12-28', '458.jpg', 'xiaoli');

-- ----------------------------
-- Table structure for sysuser
-- ----------------------------
DROP TABLE IF EXISTS `sysuser`;
CREATE TABLE `sysuser`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `registertime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sysuser
-- ----------------------------
INSERT INTO `sysuser` VALUES (4, '123456987@qq.com', 'ccccc', 'wangwu', '13712345678', '2019-12-25');
INSERT INTO `sysuser` VALUES (5, '22456789@qq.com', 'cddcc', 'xiaoli', '15812345678', '2019-12-25');
INSERT INTO `sysuser` VALUES (6, '22678389@qq.com', 'dddd', 'xiaozhang', '15812345678', '2019-12-25');
INSERT INTO `sysuser` VALUES (7, '22456459@qq.com', 'cdfcc', 'xiaoqiang', '15844345678', '2019-12-25');

SET FOREIGN_KEY_CHECKS = 1;
