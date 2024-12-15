# PyQt5 key
import sys
from PyQt5.QtWidgets import QApplication, QMainWindow, QLabel
from  PyQt5.QtGui import QFont
from PyQt5.QtCore import Qt

class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("🧑🏻‍💻🎉Hello🎅🏼🎁")
        self.setGeometry(250, 150, 850, 150)
        label = QLabel("🧑🏻‍💻🎉HAPPY NEW YEAR!🎅🏼🎁", self)
        label.setFont(QFont("Arial", 50))
        label.setGeometry(0, 0, 850, 150)
        label.setStyleSheet("color: #FFFFC5;"
                            "background-color: #eb564b;"
                            "font-weight: bold;"
                            "font-style: italic;"
                            "text-decoration: underline;")

        label.setAlignment(Qt.AlignCenter)

def main():
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec_())

if __name__ == "__main__":
    main()