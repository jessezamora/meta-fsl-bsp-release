# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "0f846daf51647c51e09d6ca5bd050d6e"
SRC_URI[sha256sum] = "9f08ef9ba24f326e4e7590a06617b8f7ea4e78247ca2b0488bf1397bcf78474d"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
