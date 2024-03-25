Uma API (application programmable interface) REST (Representational State Transfer) é um padrão de interface de comunicação cliente-servidor, que tem como objetivo padronizar a comunicação entre dispositivos. A comunicação é feita por meio de HTTP (Hypertext transfer protocol) e na grande maioria dos casos é utilizada a linguagem JSON, pois além de ser uma linguagem independente de outras linguagens, tanto homem quanto máquina conseguem entender o significado. Ela foi criada com o intuito de os desenvolvedores não necessitarem conhecer a forma que os outros sistemas são feitos internamente.

1. Interface uniforme: Ela deve ser consitente e padronizada tanto no que ela recebe quanto no que envia, ou seja, independete de onde e quando uma requisição é feita, ela deve seguir o mesmo padrão de caracteres.

2. Desacoplamento do cliente-servidor: Em termos de comunicação, tanto o aplicativo do cliente quanto do servidor devem ser independentes, um não podendo modificar o outro diretamente, apenas enviar e/ou receber dados solicitados via HTTP. Isso garante segurança e evolução independete entre ambos.

3. Sem estado definido: Cada solicitação do cliente ao servidor deve ser tida como única e completa no que tange aos dados necessários para o processamento da mensagem do lado do servidor. Com isso, o servidor não armazena estados anteriores dos clientes, deixando esta responsabilidade por exemplo ao cache e tokens.

4. Capacidade de armazenamento em cache: Com o cache ativado, diminui-se a sobrecarga de requisições para o servidor em recursos frequentemente usados, o que melhora a experiência do usuário e algumas outras funcionalidades como tolerância a falhas.

5. Arquitetura de sistema em camadas: Normalmente há vários intermediários entre cliente e servidor, é bem provável que uma requisição do lado cliente não vá diretamente ao servidor, havendo intermediários. Isso aumenta a independência dos sistemas e principalmente a segurança dos sistemas, além de que as API's REST exigem que tanto o cliente quanto o servidor não saibam diretamente com quem estão falando.
