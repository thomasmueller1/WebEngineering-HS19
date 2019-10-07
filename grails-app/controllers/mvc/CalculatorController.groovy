package mvc

class CalculatorController {

    def calc(CalculatorModel calculatorModel) {
        calculatorModel.result = (calculatorModel.en + calculatorModel.exam) / 2
        render view: "CalculatorOutput", model: [model: calculatorModel]
    }

    class CalculatorModel {
        double en
        double exam
        double result
    }
}
