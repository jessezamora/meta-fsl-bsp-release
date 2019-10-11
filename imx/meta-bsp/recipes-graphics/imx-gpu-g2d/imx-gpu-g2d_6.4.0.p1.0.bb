require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "4f8a9bc8ee53dfbb269ba319bcebeede"
SRC_URI[aarch64.sha256sum] = "a09c3a5ffff2b727d7b2cb98b5479e9e2d16db2726b20872cb134f04b90f2f38"
SRC_URI[arm.md5sum] = "2c6baaf54c0dbae340fe24276a8bc4e4"
SRC_URI[arm.sha256sum] = "f73573c59b93bdae172bd0f05a50aeb03b2fd22a387bc13328e3eacc13163903"
