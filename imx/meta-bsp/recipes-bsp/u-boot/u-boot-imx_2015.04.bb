# Copyright (C) 2013-2016 Freescale Semiconductor

DESCRIPTION = "U-Boot provided by Freescale with focus on  i.MX reference boards."
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

NXP_REPO_MIRROR ?= "nxp/"
SRCBRANCH = "${NXP_REPO_MIRROR}imx_v2015.04_4.1.15_1.0.0_ga"
UBOOT_SRC ?= "git://source.codeaurora.org/external/imx/uboot-imx.git;protocol=https"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "ede7538aefc334ce3bbded966211c149659f19a6"

S = "${WORKDIR}/git"

SRC_URI_append = " file://0001-MLK-16703-HAB-Check-if-CSF-is-valid-before-authentic.patch \
                   file://0002-MLK-14945-HAB-Check-if-IVT-valid-before-authenticati.patch "

inherit fsl-u-boot-localversion

LOCALVERSION ?= "imx_v2015.04_4.1.15_1.2.0_ga"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
