require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "328f70bfd9a6324e3926df1379da5580"
SRC_URI[aarch64.sha256sum] = "45226605a5a5b204bb5161906875a20f8eba8fc1417068f1fc67ded4168de4a3"
SRC_URI[arm.md5sum] = "6ef42eb7dc7bbfe619168f42c97905b7"
SRC_URI[arm.sha256sum] = "6506bd22fda1618af182ad3e13b9c7fec4d16892c68206f441dd63ca65424aa7"
