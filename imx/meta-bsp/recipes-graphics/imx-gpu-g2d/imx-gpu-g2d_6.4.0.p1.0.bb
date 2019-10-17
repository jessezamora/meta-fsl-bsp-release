require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8a706adab6bf3a7907d3f36c6907ab8c"
SRC_URI[aarch64.sha256sum] = "c9e28bd30619966ebdd0c6f6e7d3de9ee6f91fbe5a62dd831db886c1e9a76b65"
SRC_URI[arm.md5sum] = "5778172c96af8fad7ab469f8f821cec1"
SRC_URI[arm.sha256sum] = "9632b2c35fb6dd45aebdc29ebb14f59372ff81c0b6ff22cb7b69e9133a3daf51"
