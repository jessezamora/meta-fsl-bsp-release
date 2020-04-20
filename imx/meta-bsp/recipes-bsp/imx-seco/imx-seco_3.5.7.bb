# Copyright 2019 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "NXP IMX SECO firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

inherit fsl-eula-unpack deploy

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true "

SRC_URI[md5sum] = "7ba052f37fdf5ad0713c944db22ca9ac"
SRC_URI[sha256sum] = "37fb9a68343939a5ae57a69a4f16b07a9f0abdb6d6813cac75e20546a44189e7"

do_compile[noexec] = "1"

do_install[noexec] = "1"

SECO_FIRMWARE_NAME ?= "mx8qmb0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qm  = "mx8qmb0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qxp = "mx8qxb0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qxpc0 = "mx8qxc0-ahab-container.img"

addtask deploy after do_install
do_deploy () {
    # Deploy i.MX8 SECO firmware files
    install -m 0644 ${S}/firmware/seco/${SECO_FIRMWARE_NAME} ${DEPLOYDIR}
}


COMPATIBLE_MACHINE = "(mx8qm|mx8qxp)"
