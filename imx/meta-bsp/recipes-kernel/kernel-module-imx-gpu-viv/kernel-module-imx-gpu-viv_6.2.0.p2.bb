# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "08d61ecae689ca8e7169eeb73673aa6d"
SRC_URI[sha256sum] = "d2e28de640357447cf721fb45efb0bf5ebb0d1029c6cea8243887e93ccb22276"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
