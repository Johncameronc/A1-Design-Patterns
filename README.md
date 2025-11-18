## Questao 2

Um sistema de monitoramento ambiental coleta dados em tempo real de sensores distribuídos em várias regiões (temperatura, umidade, índice de poluição). Sempre que um sensor atualiza seu valor, diversos módulos precisam ser notificados: um painel de controle, um módulo de alertas e um módulo de registro histórico.

Implemente uma solução em Java que permita que múltiplos módulos se inscrevam para receber atualizações automáticas dos sensores, garantindo baixo acoplamento e permitindo adicionar novos módulos observadores sem alterar o código existente dos sensores.

## Strategy