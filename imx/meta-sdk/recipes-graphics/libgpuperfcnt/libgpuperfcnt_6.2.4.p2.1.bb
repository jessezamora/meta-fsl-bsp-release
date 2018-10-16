DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[arm-fb.md5sum] = "67e7f4854e8a58c0213f7ec620756036"
SRC_URI[arm-fb.sha256sum] = "78d96510901796b73102969704b6d2a08d4594a75dbcdb7ea99a18d1876982df"

SRC_URI[arm-wayland.md5sum] = "69fc7eebd0f94b492c63571f7a162eb8"
SRC_URI[arm-wayland.sha256sum] = "04fc28147a8b19d8be6df16bbaf535284f5a2bf2c18640235a6d77dbfbab2ec7"

SRC_URI[arm-x11.md5sum] = "cc10f3a5f57abe2fe76659b79858dd8c"
SRC_URI[arm-x11.sha256sum] = "ea8ed76d074ea4de6ed516eb19bbbb4a262d03e9cdd5741510bc6e1b8f411b0f"

SRC_URI[aarch64-fb.md5sum] = "6f1da03a78bcb4e05c89fb65971c0031"
SRC_URI[aarch64-fb.sha256sum] = "17e302d30ada370cdef170ec0d41333f74e07d2837c580dd94c63578cffb1fc3"

SRC_URI[aarch64-wayland.md5sum] = "17ac254c250061bf5181e1363ba9097a"
SRC_URI[aarch64-wayland.sha256sum] = "92ceef417169809f7dded4c6672ab2271e21aa4133180aa790c6fdc115bcda4a"

SRC_URI[aarch64-x11.md5sum] = "db69556c94bcd40bf1f6c52a2c261a55"
SRC_URI[aarch64-x11.sha256sum] = "1a488855b167957bc705871ea487acb8123f213f07e217e62c4ddb721b1b6d47"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
