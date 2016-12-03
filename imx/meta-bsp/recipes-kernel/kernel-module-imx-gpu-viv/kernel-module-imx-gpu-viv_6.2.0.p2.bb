# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "6e2b89ace53429da6bed17df3b4bbbc8"
SRC_URI[sha256sum] = "b7b05b0871b54f79f07dd4d4a0bb7a1dba81c5f821eddb35e4c9e6985eb423e3"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
