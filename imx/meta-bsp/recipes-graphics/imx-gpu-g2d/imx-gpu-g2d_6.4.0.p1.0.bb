require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "328f70bfd9a6324e3926df1379da5580"
SRC_URI[aarch64.sha256sum] = "45226605a5a5b204bb5161906875a20f8eba8fc1417068f1fc67ded4168de4a3"
SRC_URI[arm.md5sum] = "964c582ed49f6c6c8bb1e21b617b028e"
SRC_URI[arm.sha256sum] = "13af194a1c8c95fbc1858aee7de1166179055a19fd73d969eb1d7ec1ae6e036f"
