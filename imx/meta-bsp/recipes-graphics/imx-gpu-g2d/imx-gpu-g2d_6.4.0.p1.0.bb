require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b61d41b1a2535082a41a4d8ec790782c"
SRC_URI[aarch64.sha256sum] = "e96d08790d35d9503f71291f640184f9042be31395adda6d9a459a042b51cae0"
SRC_URI[arm.md5sum] = "fe0f78e189ace7eeb0173786d4994e42"
SRC_URI[arm.sha256sum] = "5ea0abad751ae0caadb3c9e6aa97de95590c574bce60e71baf5cccf255f2110f"
