# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"
LIC_FILES_CHKSUM_mx8mm = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

inherit deploy fsl-eula-unpack2

SOC ?= "imx8qm"
SOC_mx7ulp= "imx7ulp"
SOC_mx8mm= "imx8mm"
SOC_mx8mq= "imx8mq"
SOC_mx8qm= "imx8qm"
SOC_mx8qxp= "imx8qx"

IMX_PACKAGE_NAME = "${SOC}-m4-demo-${PV}"
SRC_URI_NAME = "${SOC}"

SRC_URI[imx7ulp.md5sum] = "cf2c88b91b4f87781365d8b0921d1cf3"
SRC_URI[imx7ulp.sha256sum] = "f4852a8da27bec0853ef499614d9337d586749805bc2c3d58500a7016ae52bdb"

SRC_URI[imx8mm.md5sum] = "901a607c4d6c82d0e0186e8871482f65"
SRC_URI[imx8mm.sha256sum] = "12e063405c583fa0ef1e6a484519d7bce260be27654559ab53abafb70bc8b15c"

SRC_URI[imx8qm.md5sum] = "d86ff64abd4ba877a236b2b18d8f6aec"
SRC_URI[imx8qm.sha256sum] = "1f39c086c0526ceebebb078009dc22d060e5c24c714823ef06f42792ce4fb425"

SCR = "SCR-${SOC}-m4-demo.txt"

do_deploy () {
   # Install the demo binaries
   cp ${D}/* ${DEPLOYDIR}/
}

addtask deploy before do_build after do_install

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx7ulp|mx8mm|mx8qm)"
