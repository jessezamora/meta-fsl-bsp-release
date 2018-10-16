DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[arm-fb.md5sum] = "67e7f4854e8a58c0213f7ec620756036"
SRC_URI[arm-fb.sha256sum] = "78d96510901796b73102969704b6d2a08d4594a75dbcdb7ea99a18d1876982df"

SRC_URI[arm-wayland.md5sum] = "944369c96acaa29fe4308495db10fec1"
SRC_URI[arm-wayland.sha256sum] = "94912ff9d9453ef22480a104a05779aca92b1d63a7dffc9a7cb9c9f111db3667"

SRC_URI[arm-x11.md5sum] = "cc10f3a5f57abe2fe76659b79858dd8c"
SRC_URI[arm-x11.sha256sum] = "ea8ed76d074ea4de6ed516eb19bbbb4a262d03e9cdd5741510bc6e1b8f411b0f"

SRC_URI[aarch64-fb.md5sum] = "6f1da03a78bcb4e05c89fb65971c0031"
SRC_URI[aarch64-fb.sha256sum] = "17e302d30ada370cdef170ec0d41333f74e07d2837c580dd94c63578cffb1fc3"

SRC_URI[aarch64-wayland.md5sum] = "e5f60590d78432dbd8439ade743c08fa"
SRC_URI[aarch64-wayland.sha256sum] = "7878ade10cf1219ded088aab4ea826c1336a99a54992be397cfa14a6628c0f17"

SRC_URI[aarch64-x11.md5sum] = "8a717ddfa3e86b86bfc350b258a5a0e2"
SRC_URI[aarch64-x11.sha256sum] = "3b47d1336303709a286d4cfb1991389436e58b222b9dff980573f446c7556dcc"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
