/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80014
 Source Host           : localhost:3306
 Source Schema         : panda

 Target Server Type    : MySQL
 Target Server Version : 80014
 File Encoding         : 65001

 Date: 31/01/2019 16:58:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for album
-- ----------------------------
DROP TABLE IF EXISTS `album`;
CREATE TABLE `album`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `star_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `add_time` datetime(6) NULL DEFAULT NULL,
  `album_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '影集id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `star_id`(`star_id`) USING BTREE,
  INDEX `album_id`(`album_id`) USING BTREE,
  INDEX `id`(`id`) USING BTREE,
  CONSTRAINT `star_id` FOREIGN KEY (`star_id`) REFERENCES `star` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
