require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b61d41b1a2535082a41a4d8ec790782c"
SRC_URI[aarch64.sha256sum] = "e96d08790d35d9503f71291f640184f9042be31395adda6d9a459a042b51cae0"
SRC_URI[arm.md5sum] = "2c6baaf54c0dbae340fe24276a8bc4e4"
SRC_URI[arm.sha256sum] = "f73573c59b93bdae172bd0f05a50aeb03b2fd22a387bc13328e3eacc13163903"
