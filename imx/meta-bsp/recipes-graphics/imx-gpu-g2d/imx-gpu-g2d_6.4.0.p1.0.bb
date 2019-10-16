require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7b284ce787f709a04d04972bd91dee12"
SRC_URI[aarch64.sha256sum] = "3f96f381fe95cf87a3edfdcf40d09a5997983be2742c3deaf0d6648bffc46dd8"
SRC_URI[arm.md5sum] = "15e7d3249164e5ead2ae8f89535b64c1"
SRC_URI[arm.sha256sum] = "66a1e55cc1c3a50f8fa24d32408ccc85e4e57ec5a87815a4be02ad5984849abb"
